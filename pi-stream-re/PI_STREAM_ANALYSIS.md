# Pi Stream v1.0.1 — Reverse Engineering Report

> **Source APK**: `Pi Stream.apk` (4.9 MB)
> **Package**: `msr.pistream.app`
> **Version**: 1.0.1 (versionCode 1, apktool reports 2.10.0 internal)
> **Min SDK**: 23 (Android 6.0) / **Target SDK**: 34 (Android 14)
> **App ID class**: `msr.pistream.app.di.PiStreamApp` (Hilt `@HiltAndroidApp`)
> **Launcher activity**: `msr.pistream.app.ui.home.screens.MainActivity`
> **Decompiled with**: jadx 1.5.0 + apktool 2.10.0
> **Method**: 5,858 Java files decompiled (heavily R8-obfuscated — most class names reduced to 1-2 letters), 4,415 smali files.

This document is the **complete map of the Pi Stream backend API** and how the app talks to it. It is the API contract that the new MovieCrate app will reuse.

---

## 1. App Identity

| Field | Value |
|---|---|
| App name (display) | **Pi Stream** |
| Package | `msr.pistream.app` |
| Application class | `msr.pistream.app.di.PiStreamApp` |
| MainActivity | `msr.pistream.app.ui.home.screens.MainActivity` |
| PlayerActivity | `msr.pistream.app.ui.player.PlayerActivity` |
| DetailActivity | `msr.pistream.app.ui.detail.DetailActivity` |
| AuthActivity | `msr.pistream.app.ui.auth.AuthActivity` |
| WelcomeActivity | `msr.pistream.app.ui.auth.WelcomeActivity` |
| DownloadService | `msr.pistream.app.download.PiStreamDownloadService` (FGS dataSync) |
| BootReceiver | `msr.pistream.app.download.DownloadBootReceiver` |
| FileProvider authority | `msr.pistream.app.fileprovider` |
| FirebaseInitProvider authority | `msr.pistream.app.firebaseinitprovider` |
| Leanback banner | `@drawable/banner_tv` (Android TV support declared) |

The app supports both touch and leanback (Android TV) launchers.

---

## 2. Tech Stack

| Layer | Library |
|---|---|
| Language | Kotlin |
| UI toolkit | Classic Android Views + XML layouts (NOT Jetpack Compose) |
| DI | **Hilt** (dagger.hilt.android) — `@HiltAndroidApp`, `@HiltViewModel`, `@AndroidEntryPoint` |
| Async | Coroutines + ExecutorService thread pools |
| HTTP | OkHttp 4.x (custom client — see `d8/b.java`) |
| Media | ExoPlayer (visible via `n8.*`, `c1.*` imports — standard Media3/ExoPlayer wrapper classes) |
| Auth | **Firebase Auth 22.3.1** (email/password + Google Sign-In via `play-services-auth`) |
| Background | WorkManager + foreground service for downloads |
| Storage | SharedPreferences (`pistream_moviebox`) |
| TV support | Leanback (`android.software.leanback`) |
| Recaptcha | `recaptcha.properties` — reCAPTCHA used during Firebase auth flows |
| Integrity | Play Integrity API (`integrity.properties` v1.2.0) |

---

## 3. Backend API — Complete Map

### 3.1 Hosts (rotating pool)

Pi Stream cycles through **7 primary API hosts** for resilience, plus **8 bootstrap hosts**:

```java
// d8.b.f3243f — primary API hosts (rotated on failure)
String[] primaryHosts = {
    "https://api3.aoneroom.com",
    "https://api4.aoneroom.com",
    "https://api4sg.aoneroom.com",
    "https://api5.aoneroom.com",
    "https://api6.aoneroom.com",
    "https://api7.aoneroom.com",
    "https://api8.aoneroom.com"
};

// d8.b.f3244g — web play / streaming hosts (used as fallback for stream URLs)
String[] webHosts = {
    "https://movie-box.co",
    "https://123moviesfree.club",
    "https://movieboxonline.net",
    "https://sflix.film",
    "https://h5-api.aoneroom.com",
    "https://netnaija.film",
    "https://movieboxhd.net"
};

// Bootstrap list (8 entries): includes the above 7 plus
//   "https://apig.inmoviebox.com"  (used as 8th bootstrap host)
```

The active host index `c` rotates whenever a request fails — next request uses `(c + i) % 7`. This is automatic fail-over.

### 3.2 Authentication & Request Signing

Every API request is signed with **3 custom headers + an HMAC-MD5 signature**. The signing function lives in `d8.b.l()` (lines 142-167 of `d8/b.java`):

```java
LinkedHashMap l(String method, String url, String body, String deviceId, String bearerToken) {
    long ts = System.currentTimeMillis();          // epoch millis
    LinkedHashMap h = new LinkedHashMap();
    h.put("user-agent", "com.community.mbox.in/50020130 (Linux; U; Android 14; en_IN; Pixel 8; Build/UD1A.230803.041; Cronet/145.0.7582.0)");
    h.put("accept", "application/json");
    h.put("content-type", "application/json");
    h.put("connection", "keep-alive");

    // x-client-token = <ts> , <reversed(ts)> + MD5(reversed(ts))
    String tsStr   = Long.toString(ts);
    String reversedTs = new StringBuilder(tsStr).reverse().toString();
    StringBuilder xClientToken = j.a(tsStr, ",");
    xClientToken.append(c.c(reversedTs.getBytes(UTF_8)));    // MD5 hex
    h.put("x-client-token", xClientToken.toString());

    // x-tr-signature = <ts>|2|<HmacMD5(payload, secret)>
    String payload  = c.a(method, url, body, ts);   // see d8.c.a()
    Mac mac = Mac.getInstance("HmacMD5");
    mac.init(new SecretKeySpec(Base64.decode(
        Base64.decode("NzZpUmwwN3MweFNOOWpxbUVXQXQ3OUVCSlp1bElRSXNWNjRGWnIyTw==",
        UTF_8).trim(),
        0), "HmacMD5"));
    h.put("x-tr-signature", ts + "|2|" + Base64.encodeToString(mac.doFinal(payload.getBytes(UTF_8)), 2));  // NO_WRAP

    // x-client-info — client fingerprint
    h.put("x-client-info", "{\"package_name\":\"com.community.mbox.in\",\"version_name\":\"4.0.03.0920.03\",\"version_code\":50020130,\"os\":\"android\",\"os_version\":\"14\",\"device_id\":\"" + deviceId + "\",\"install_store\":\"official\",\"gaid\":\"1b2212c1-dadf-43c3-a0c8-bd6ce48ae22d\",\"brand\":\"Google\",\"model\":\"Pixel 8\",\"system_language\":\"en\",\"net\":\"NETWORK_WIFI\",\"region\":\"IN\",\"timezone\":\"Asia/Calcutta\",\"sp_code\":\"\"}");
    h.put("x-client-status", "0");

    if (c.b(bearerToken)) {       // JWT expiry check
        h.put("authorization", "Bearer " + bearerToken);
    }
    return h;
}
```

The HMAC secret key (after double base64 decode):
```
NzZpUmwwN3MweFNOOWpxbUVXQXQ3OUVCSlp1bElRSXNWNjRGWnIyTw==  (outer b64)
  →  76iRl07s0xSN9jqmEWAт79EBJzulIQIsV64FZr2O  (inner b64)
  →  raw bytes used as HmacMD5 key
```

(Note: there appears to be a typo in the decompiled source — `EWAт79E` contains a non-ASCII char; in the real bytecode it should be a standard base64 char. The actual byte sequence is what matters at runtime.)

The `x-tr-signature` payload is constructed by `d8.c.a(method, url, body, ts)` — a 284-instruction method that jadx couldn't fully decompile (visible in `d8/c.java`). Based on convention for this API family (aoneroom / wefeed-mobile-bff), the signing string format is typically:
```
method + "\n" + url + "\n" + ts + "\n" + body
```
MD5'd or HMAC'd with the secret. The exact concat order will need to be re-derived from smali when implementing.

### 3.3 Bearer token bootstrap

The app needs a bearer JWT before it can call most endpoints. Bootstrap flow (`d8.b.g()`):

1. Read `device_id` from `SharedPreferences("pistream_moviebox")`. If empty, generate 16 random bytes → 32-char hex string, persist.
2. Try each of the 8 bootstrap hosts in order with:
   ```
   GET /wefeed-mobile-bff/tab/ranking-list?tabId=0&categoryType=4516404531735022304&page=1&perPage=1
   ```
3. The response `Set-Cookie` headers (or response body) contain a `"token":"..."` field captured by regex `"token"\s*:\s*"([^"]+)"` and stored as `f3249d`.
4. Token saved to `SharedPreferences` as `bearer_token`. Subsequent requests reuse it.
5. If a request returns 401/441, `g(true)` is called to force-refresh the token.

Token validity check `c.b(token)`:
- Splits on `.`, takes part [1] (JWT payload)
- Base64-decodes (URL-safe, with `-`→`+`, `_`→`/` and padding)
- Regex `"exp"\s*:\s*(\d+)` extracts expiry
- Returns true if `exp > now + 3600` (i.e., expires more than 1 hour from now)

### 3.4 Endpoints (all under any primary host)

The full method table from `d8.b` (the HTTP client) and `c8.b` (the high-level API):

| Method | Path | Body / Query | Purpose | Caller |
|---|---|---|---|---|
| `GET` | `/wefeed-mobile-bff/tab/ranking-list?tabId={tabId}&categoryType={catType}&page={page}&perPage=20&restrictKid=0` | — | **Home rails**: returns a list of subjects for a given tab/category. Used by Home screen to render 11 rails (see §3.5) | `d8.b.p()` → `c8.b.k()` |
| `POST` | `/wefeed-mobile-bff/subject-api/list` | `{"page":N,"perPage":20,"channelId":"...","classify":"All","country":"All","year":"All","genre":"All","sort":"ForYou","restrictKid":0}` | Browse/filter titles by channel, genre, country, year, sort | `d8.b.b()` |
| `GET` | `/wefeed-mobile-bff/subject-api/get?host={currentHost}&subjectId={id}` | — | **Movie/show details** — title, description, poster, cast, related, seasons summary, `detailPath`, `detailUrl` | `d8.b.d()` |
| `GET` | `/wefeed-mobile-bff/subject-api/season-info?host={currentHost}&subjectId={id}` | — | **Seasons list** — returns `seasons[]` with `{ se, maxEp }` per season | `c8.b.b()` (used to enumerate episodes for series) |
| `GET` | `/wefeed-mobile-bff/subject-api/play-info?subjectId={id}&se={season}&ep={episode}` | — | **Play info** — returns stream URLs, audio tracks, subtitle tracks for a specific episode | `d8.b.n()` → `c8.b.e()` / `c8.b.f()` |
| `POST` | `/wefeed-mobile-bff/subject-api/search/v2` | `{"page":N,"perPage":20,"keyword":"...","restrictKid":0}` | **Search v2** — keyword search returns list of subjects | `c8.b.m()` |
| `GET` | `/wefeed-mobile-bff/subject-api/get-ext-captions?host={currentHost}&subjectId={id}&resourceId={resourceId}&episode=0` | — | External subtitles/captions for a stream | `d8.b.h()` |
| `GET` | `/wefeed-mobile-bff/subject-api/get-stream-captions?host={currentHost}&subjectId={id}&streamId={streamId}` | — | In-stream subtitles list | `d8.b.q()` |
| `GET` | `/wefeed-h5api-bff/subject/play?subjectId={id}&se={season}&ep={episode}&detailPath={path}&streamSignType=1&supportCodecs[hevc]=1&supportCodecs[h264]=1` | (web-host variant) | **Web play** — alternate stream URL fetcher when the mobile API doesn't return sources. Uses web-host domain (e.g., `movie-box.co`) instead of api host | `d8.b.s()` |

### 3.5 Home screen rails (hardcoded list)

`c8.b.f2081b` defines the 11 default rails shown on the home screen. Each row is `[title, tabId, categoryType]`:

| # | Title | tabId | categoryType |
|---|---|---|---|
| 1 | Trending Movies | 0 | 9167640870324258216 |
| 2 | Top Series | 5 | 719331337777440448 |
| 3 | New Release | 0 | 1488104699998914056 |
| 4 | In Cinema | 0 | 5692654647815587592 |
| 5 | Hollywood | 0 | 8019599703232971616 |
| 6 | Anime | -1 | ch:1006 |
| 7 | Bollywood | 0 | 414907768299210008 |
| 8 | South Indian | 0 | 3859721901924910512 |
| 9 | Asian Drama | 5 | 1976033493293449744 |
| 10 | Western TV | 5 | 3910636007619709856 |
| 11 | Reality TV | 5 | 1255898847918934600 |

For each rail, the app calls `c8.b.j(tabId, page, categoryType)`:
- If `categoryType` starts with `ch:` → calls `d8.b.b(channelId=...)` (POST `/subject-api/list`)
- Else → calls `d8.b.p(tabId, page, categoryType)` (GET `/tab/ranking-list`)

All 11 rails are fetched in parallel via `Executors.newFixedThreadPool(5)` with a 30-second timeout (`c8.b.h()`).

### 3.6 Stream URL extraction

The `play-info` endpoint returns a JSON object whose `data` field contains stream metadata. The actual MPD (MPEG-DASH manifest) URL is extracted from one of two places (see `d8.b.i()`):

1. **Edge-Cache-Cookie** format — header/cookie value matching `Edge-Cache-Cookie=urlprefix=<base64>`:
   - Replace `_` → `/`, `-` → `+`
   - Pad with `=` to multiple of 4
   - Base64 decode → string like `https://cdn.example.com/path/to/stream`
   - Strip trailing `/`
   - Append `/index.mpd`

2. **CloudFront-Policy** format — `CloudFront-Policy=<base64>`:
   - URL-safe base64 decode (replace `-`→`+`, `~`→`/`, `_`→`=`)
   - Parse JSON, extract `Statement[0].Resource`
   - Strip trailing `*` and `/`
   - Append `/index.mpd` if not already `.mpd`

The playback is **DASH MPD** (not HLS m3u8). ExoPlayer supports this natively.

### 3.7 Web-play fallback flow

When the mobile API doesn't return playable sources, Pi Stream falls back to the **web-play** endpoint (`d8.b.s()`) on one of the 7 web hosts:

```
GET https://{webHost}/wefeed-h5api-bff/subject/play
    ?subjectId={id}
    &se={season}
    &ep={episode}
    &detailPath={path}
    &streamSignType=1
    &supportCodecs[hevc]=1
    &supportCodecs[h264]=1
```

With web-specific headers:
```
User-Agent:      Mozilla/5.0 (Linux; Android 15; Pixel 9) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/154.0.0.0 Mobile Safari/537.36
Referer:         {webHost}/movies/{detailPath}?id={subjectId}&type=/movie/detail&detailSe=&detailEp=&lang=en
Accept:          application/json
x-client-info:   {"timezone":"Asia/Calcutta"}
x-request-lang:  en
x-vip-restrict:  (empty)
x-no-high-risk-restrict: (empty)
x-source:        (empty)
Authorization:   Bearer {token}   (if available)
```

The app tries each web host in order until one returns valid sources.

### 3.8 Auth (Firebase)

Pi Stream uses **Firebase Auth** (not the MovieBox API) for user accounts. The `AuthActivity` uses:
- Email/password sign-up + sign-in (Firebase Auth 22.3.1)
- Google Sign-In (`play-services-auth` 20.7.0)
- reCAPTCHA protection on sign-up forms

Firebase config (from `strings.xml`):

| Field | Value |
|---|---|
| Project ID | `pistream-msr` |
| Storage bucket | `pistream-msr.firebasestorage.app` |
| Sender ID (FCM) | `405765251331` |
| Mobile services app ID | `1:405765251331:android:724aec082d88807b548936` |
| **API Key** | `AIzaSyAVkuHpFjIsHEjEePtz5-F6YhN7r1wzMR4` |

The bearer token used by the MovieBox API is **independent** of Firebase Auth — it's fetched anonymously from the bootstrap endpoint and stored locally. Firebase Auth appears to be used only for user-facing account features (sync, preferences, etc.).

---

## 4. Permissions

| Permission | Purpose |
|---|---|
| `INTERNET` | API access |
| `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE` | Connectivity monitoring (download scheduler) |
| `WRITE_EXTERNAL_STORAGE` (maxSdk=28) | Legacy downloads |
| `READ_EXTERNAL_STORAGE` (maxSdk=32) | Legacy downloads |
| `READ_MEDIA_VIDEO` | Android 13+ media access |
| `POST_NOTIFICATIONS` | Android 13+ download notifications |
| `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_DATA_SYNC` | Download service |
| `RECEIVE_BOOT_COMPLETED` | Resume downloads after reboot |
| `REQUEST_INSTALL_PACKAGES` | In-app APK install (likely for self-update) |
| `com.google.android.providers.gsf.permission.READ_GSERVICES` | Google services |

`<uses-feature>` declares both `leanback` (Android TV) and `touchscreen` as optional — runs on phones and TVs.

---

## 5. App Architecture

```
msr.pistream.app
├── di/                          # Hilt DI modules
│   ├── PiStreamApp              # @HiltAndroidApp Application
│   ├── AppModule                # Provides Context
│   └── NetworkModule            # Provides OkHttpClient (20s connect / 35s read)
├── viewmodel/                   # HiltViewModels
│   ├── HomeViewModel            # Home rails (11 rails fetched in parallel)
│   ├── DetailViewModel          # Movie/show details
│   ├── PlayerViewModel          # Playback + source selection
│   ├── SearchViewModel          # Search
│   ├── ScheduleViewModel        # Schedule (likely a "coming soon" screen)
│   └── FilterViewModel          # Filter UI state
├── ui/
│   ├── home/screens/MainActivity    # Launcher (home + bottom nav)
│   ├── detail/DetailActivity        # Movie/show detail page
│   ├── player/PlayerActivity        # ExoPlayer wrapper
│   └── auth/WelcomeActivity, AuthActivity    # Sign-in / sign-up
└── download/
    ├── PiStreamDownloadService      # Media3 DownloadService
    └── DownloadBootReceiver         # Resume on boot
```

### 5.1 Key obfuscated packages (for reference)

| Package | Purpose |
|---|---|
| `c8.b` | High-level API client (calls d8.b) |
| `d8.b` | HTTP client (OkHttp wrapper + signing + fail-over) |
| `d8.c` | Signing helpers (HmacMD5, MD5, JWT expiry check) |
| `e8.a` | Repository facade (wraps c8.b, dubs detection) |
| `e8.b` | Firebase Auth error message formatter |
| `e8.c` | Application context provider |
| `a8.*` | Data model classes (Movie, Episode, Source, Subtitle, etc.) |
| `r6.h0` | JSON parsing helpers (subjects, episodes, sources → objects) |

---

## 6. Comparison: Pi Stream vs AniStation

| Aspect | AniStation | Pi Stream |
|---|---|---|
| **Content** | Anime (sub/dub) | Movies + TV shows + Anime |
| **App size** | 29.5 MB | 4.9 MB |
| **UI toolkit** | Jetpack Compose + Material 3 | Classic Views + XML |
| **DI** | Koin | Hilt |
| **Auth** | No accounts (local-only) | Firebase Auth + Google Sign-In |
| **Player** | Media3 ExoPlayer | Media3 ExoPlayer |
| **API base** | `https://open.anistation.top` | 7-host rotation on `*.aoneroom.com` |
| **API auth** | None (public) | HMAC-MD5 signed headers + JWT bearer |
| **Stream protocol** | HLS (m3u8) + Shiro anti-piracy | DASH (MPD) + CloudFront/Edge-Cache cookies |
| **Anti-piracy** | `ShiroPlaybackPlan` (server-signed) | Signed request headers + CloudFront signed URLs |
| **Localization** | ~85 locales | English-only (default `values/`) |
| **TV support** | No | Yes (leanback) |
| **Download** | Internal (Media3 cache) + External (MP4 mux) | Single service (`PiStreamDownloadService`) |
| **Backup** | Yes (`.anistationbackup`) | No |
| **Rewarded ads** | Yes (Unity Ads `800363057`) | No |
| **Discord Rich Presence** | Yes (soft-disabled) | No |
| **Min SDK** | 29 (Android 10) | 23 (Android 6.0) |

---

## 7. MovieCrate Plan — How We'll Combine Them

MovieCrate will be a **fork of AniStation's UI/UX** (Compose + Material 3, YouTube-like player, local tracking, backup, etc.) but **re-pointed at the Pi Stream backend API** (movies + shows + anime, multi-host fail-over, HMAC signing).

### 7.1 What we keep from AniStation
- Entire Compose UI (Home, Search, Details, Schedule, MyList, Downloads, Settings, About, Backup, BugReport, Donate, DownloadSettings, PlayerSettings, SubtitleSettings, ExperimentalSettings)
- Room DB schema (`AnimeListItem`, `WatchProgress`)
- WorkManager BackupWorker
- Subtitle styling (4 fonts, scaling, outline, position)
- Player gestures (volume/brightness, double-tap, hold, fullscreen swipe)
- Discord Rich Presence scaffolding (we'll enable it now that we know the gate)
- 17 navigation routes
- Skip intro/outro support
- External + internal download split

### 7.2 What we replace
| AniStation concept | MovieCrate replacement |
|---|---|
| App name `AniStation` | `MovieCrate` |
| Package `com.anistation.android` | `com.moviecrate.android` (where referenced in UI strings — manifest package rename is destructive to smali, so we keep `com.anistation.android` internally for build integrity and only rename visible strings) |
| API base `https://open.anistation.top` | Pi Stream's 7-host rotation on `*.aoneroom.com` |
| Endpoints (AniList-style) | Pi Stream endpoints (`/tab/ranking-list`, `/subject-api/get`, `/subject-api/play-info`, `/subject-api/search/v2`, `/subject-api/season-info`, `/subject-api/list`) |
| Anime model | Movie/Show model (from `a8.*` package) |
| HLS playback | DASH (MPD) playback — ExoPlayer handles both natively |
| No auth | HMAC-MD5 request signing + bearer token bootstrap |
| Firebase project `anistation-app` | Firebase project `pistream-msr` (or MovieCrate's own project — TBD) |
| Unity Ads `800363057` | (Optional) keep or strip |
| Discord app ID `1543212125684764693` | (Optional) keep or replace with MovieCrate's own |

### 7.3 Implementation strategy

Because rebuilding the entire Kotlin source from scratch is infeasible, we will:

1. **Start from AniStation's apktool-smali** (already in our existing repo).
2. **Patch the API base URL** in the smali: replace `"https://open.anistation.top"` with Pi Stream's host-rotation logic (or a single Pi Stream host for simplicity).
3. **Patch the API endpoints**: update path strings in `dm.smali`, `oq.smali`, `rm.smali`, `tl.smali`, `fb0.smali` to Pi Stream's endpoints.
4. **Add the HMAC signing**: inject Pi Stream's `d8.b.l()` method as new smali, and patch the Ktor request pipeline to add the signed headers.
5. **Rebrand visible strings**: `app_name` → `MovieCrate`, deep-link hosts → `moviecrate.app` (or keep `anistation.top` if user wants).
6. **Rebuild** with `apktool b`, then sign with `uber-apk-signer`.

The result will be a working APK that **looks and feels like AniStation** but **streams from Pi Stream's catalog**.

---

## 8. Files in `pi-stream-re/` Subdirectory (Uploaded to Existing Repo)

| Path | Contents |
|---|---|
| `pi-stream-re/PI_STREAM_ANALYSIS.md` | This document |
| `pi-stream-re/jadx-sources/` | 5,858 decompiled Java files (heavily R8-obfuscated) |
| `pi-stream-re/apktool-smali/` | 4,415 smali files from apktool |
| `pi-stream-re/extracted/` | Raw unzipped APK (classes.dex, resources.arsc, assets, META-INF) |
| `pi-stream-re/apktool-smali/AndroidManifest.xml` | Decoded manifest |

---

*End of Pi Stream analysis. Ready to build MovieCrate.*
