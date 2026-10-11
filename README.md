# AniStation v3.0.2 — Reverse Engineering Report

> **Source APK**: `anistation-v3.0.2-arm64-v8a.apk` (29.5 MB, arm64-v8a only)
> **Package**: `com.anistation.android`
> **Version**: 3.0.2 (versionCode 6)
> **Min SDK**: 29 (Android 10) / **Target SDK**: 37 (Android 16 preview)
> **Decompiled with**: jadx 1.5.0 + apktool 2.10.0
> **Method**: Full bytecode → Java (10,497 classes) + smali (12,473 files) + resources + native lib inspection

This repository is a **private internal research artifact**. It contains the decompiled source code of AniStation for the purpose of auditing, modifying, and rebuilding the app per the user's instructions. The analysis below is the complete map of every feature, gate, lock, ID, endpoint, and integration we found.

---

## 1. App Identity & Build Info

| Field | Value |
|---|---|
| App name | AniStation |
| Package | `com.anistation.android` |
| Version | 3.0.2 |
| versionCode | 6 |
| Application class | `com.anistation.android.AniStationApplication` |
| Launcher activity | `com.anistation.android.MainActivity` |
| Git revision (from `version-control-info.textproto`) | `ce20c00b5b278b0c51ca0a0832c728865fa1d865` |
| Signing | **No APK Signature Scheme v2/v3 block** — v1-only (JAR signing) or unsigned. No `.RSA` / `.SF` files present in `META-INF/`. |
| Architecture | arm64-v8a only |
| App disclaimer (own string) | *"AniStation does not host any files itself but instead only displays content from 3rd party providers. AniStation is not affiliated with AniList, MyAnimeList, or any other providers."* |

### 1.1 Tagline / Pitch (from `about_subtitle*` strings)

> "Built to feel like home with a YouTube-like player, familiar UI, smooth watching, and clean local tracking."
>
> *"YouTube-like controls with smooth gestures, mini-player and more."*
> *"Continue watching, anime list, progress, and list states stay with you."*
> *"Move your anime list using MAL / AniList-style XML workflows."*

---

## 2. Tech Stack (verified from META-INF version files)

| Layer | Library | Version |
|---|---|---|
| Language | Kotlin (coroutines) | 1.11.0 (kotlinx-coroutines) |
| UI | Jetpack Compose | 1.12.1 (foundation/material-ripple/runtime/ui) |
| UI | Material 3 | 1.4.0 |
| Navigation | `androidx.navigation3:navigation3-*` | 1.2.0 (new Compose Navigation3) |
| DI | Koin (set up in `AniStationApplication.a()`) | — |
| Storage | Room | 2.8.5 |
| Storage | DataStore Preferences | 1.2.1 (uses `libdatastore_shared_counter.so`) |
| HTTP | Ktor Client + OkHttp 4.12.0 (User-Agent) | — |
| Media | Media3 / ExoPlayer (downloadService) | — |
| Cast | Google Play Services Cast Framework | — |
| Images | Coil 3 | — |
| Background | WorkManager | 2.12.0 |
| Lifecycle | androidx.lifecycle | 2.11.0 |
| Activity | androidx.activity | 1.13.0 |
| Core KTX | androidx.core | 1.19.1 |
| Profile installer | androidx.profileinstaller | 1.4.1 |

---

## 3. Navigation Routes (all 17 destinations)

Defined as a sealed `Route` interface (`com/anistation/navigation/Route.java`):

| # | Route | Purpose |
|---|---|---|
| 1 | `Home` | Trending / Popular / Recent / Top 10 |
| 2 | `Search` | Search + search history + suggestions |
| 3 | `Details` | Anime details page (takes an anime ID arg) |
| 4 | `Schedule` | Weekly airing schedule |
| 5 | `MyList` | Local anime list (with watch status filters) |
| 6 | `Downloads` | Internal + external downloads |
| 7 | `Settings` | Root settings |
| 8 | `About` | App info / dev profile |
| 9 | `Backup` | Backup & restore |
| 10 | `BugReport` | Bug report form (POSTs to server) |
| 11 | `Donate` | Crypto donation page |
| 12 | `DownloadSettings` | Download preferences |
| 13 | `DownloadList` | Episode list for a specific anime |
| 14 | `ExperimentalSettings` | "Experimental settings" screen |
| 15 | `ImportExport` | MAL/AniList XML import-export |
| 16 | `PlayerSettings` | Player preferences |
| 17 | `SubtitleSettings` | Subtitle styling |

**Deep links**: `https://anistation.top/anime/{id}` and `https://www.anistation.top/anime/{id}` (auto-verified intent filter on `MainActivity`). Path prefixes: `/anime/` and `/details/`.

---

## 4. Backend API — Full Map

**Base URL**: `https://open.anistation.top`

Discovered endpoints and their parameters (reconstructed from `dm.java`, `oq.java`, `rm.java`, `tl.java`, `fb0.java`):

| Path | Method | Query / Body | Returns | Caller |
|---|---|---|---|---|
| `GET /v2/home` | — | — | `Response<Home>` (trending/popular/recent/top10) | `dm.java` |
| `GET /v2/search` | `query`, `page` | — | `Response<Page<Anime>>` | `dm.java` |
| `GET /v2/search/suggestions` | `query` | — | `Response<List<SearchSuggestion>>` | `dm.java` |
| `GET /v2/anime/genres` | `page` | — | `Response<Page<Anime>>` | `dm.java` |
| `GET /v2/anime/{id}` | — | — | `Response<Info>` | `dm.java` |
| `GET /v2/anime/{id}/episodes` | `animeId` | — | `Response<List<Episode>>` | `dm.java` |
| `GET /v2/anime/schedules` | `weekStart`, `weekEnd` | — | `Response<List<AnimeSchedule>>` | `dm.java` |
| `GET /v2/anime/servers` | — | — | `Response<List<Server>>` (sub/dub providers) | `dm.java` |
| `GET /v2/anime/sources` | `animeId`, `malId`, `episodeNumber`, `adType`, `providerId`, `playbackCapability=shiro-direct-v1`, optional `refreshPlayback=true` | — | `Response<SourcesResponse>` (Track[] + Skips) | `tl.java` |
| `GET /v2/anime-list/import/anilist` | `username`, `statuses` (comma-sep) | — | `Response<List<ImportedAnime>>` | `rm.java` |
| `GET /app/updates/check` | `currentVersionCode`, `platform`, `channel`, `packageName` | — | `Response<AppUpdateCheck>` | `oq.java` |
| `POST /reports/new` | JSON body: `BugReport` | Content-Type: `application/json` | `Response<String>` (bug ID) | `fb0.java` |

### 4.1 The `ShiroPlaybackPlan` anti-piracy scheme

When `playbackCapability=shiro-direct-v1` is requested, the server returns a `ShiroPlaybackPlan` containing:

```kotlin
class ShiroPlaybackPlan {
    val protocol: String
    val issuedAtEpochSeconds: Long
    val expiresAtEpochSeconds: Long
    val playlist: ShiroPlaylistTransform   // transforms applied to m3u8 playlist
    val segment: ShiroSegmentTransform     // transforms applied to each segment URL
    val allowedHostSuffixes: List<String>  // CDN host whitelist
    val fallbackUrl: String?
}
```

This is a **signed, time-limited playback plan** designed to defeat stream ripping — the actual video URL is rewritten per session by the `Shiro*Transform` rules, and only requests from hosts in `allowedHostSuffixes` are honored.

### 4.2 App update response shape

```kotlin
class AppUpdateCheck {
    val updateAvailable: Boolean
    val forceUpdate: Boolean               // hard-blocks app if true
    val currentVersionCode: Int
    val latestVersionName: String?
    val latestVersionCode: Int?
    val minSupportedVersionCode: Int?      // older builds are force-blocked
    val apkUrl: String?
    val apkSha256: String?
    val apkSizeBytes: Long?
    val releaseNotes: List<String>?
    val releasedAt: Long?
}
```

If `forceUpdate == true` or `currentVersionCode < minSupportedVersionCode`, the app shows a non-dismissable "Update Required" screen (`update_required` / `update_now` strings). Code path: `defpackage/nx7.java` (lines ~1972-2044) and `defpackage/ia.java`.

---

## 5. Local Data Model

### 5.1 Room Database — `AniStationDatabase`

Abstract class extending `androidx.room.RoomDatabase`. Exposes two DAOs:
- `animeListDao()` → `AnimeListDao` (impl: `AnimeListDao_Impl`)
- `watchProgressDao()` → `WatchProgressDao` (impl: `WatchProgressDao_Impl`)

### 5.2 Entities

**`AnimeListItem`** — local anime list entry:

| Field | Type | Notes |
|---|---|---|
| `animeId` | String (PK) | Internal AniStation ID |
| `anistationId` | String? | Optional alias |
| `anilistId` | Int | Cross-reference to AniList |
| `malId` | Int? | Cross-reference to MAL |
| `title`, `coverImage`, `bannerImage` | String? | Display data |
| `totalEpisodes`, `currentAiredEpisodes` | Int / Int | Tracking |
| `mediaStatus` | `MediaStatus` enum | FINISHED / RELEASING / … |
| `watchStatus` | `WatchStatus` enum | WATCHING / PLAN_TO_WATCH / … |
| `importedProgress`, `score` | Int | User data |
| `format` | `MediaFormat` enum | TV / MOVIE / OVA / … |
| `notes` | String? | Free-form |
| `createdAt`, `updatedAt` | Long | Timestamps |

**`WatchProgress`** — playback resume points:

| Field | Type |
|---|---|
| `id` | String (PK) |
| `animeId`, `anistationId` | String / String? |
| `anilistId`, `malId` | Int / Int? |
| `animeTitle`, `episodeTitle`, `coverImage`, `thumbnailImage` | String? |
| `episodeNumber` | Int |
| `positionMs`, `durationMs` | Long |
| `completed` | Boolean |
| `updatedAt` | Long |

### 5.3 Enums

| Enum | Values |
|---|---|
| `WatchStatus` | WATCHING, PLAN_TO_WATCH, COMPLETED, ON_HOLD, DROPPED, REWATCHING |
| `MediaFormat` | TV, TV_SHORT, MOVIE, SPECIAL, OVA, ONA, MUSIC, MANGA, NOVEL, ONE_SHOT, UNKNOWN |
| `MediaStatus` | FINISHED, RELEASING, NOT_YET_RELEASED, CANCELLED, HIATUS, UNKNOWN |
| `MediaSource` | (decompiled enum exists in source tree) |
| `MediaSeason` | (decompiled enum exists in source tree) |
| `BackupFrequency` | NEVER, DAILY, WEEKLY, MONTHLY |
| `EpisodeDownloadState` | QUEUED, STOPPED, DOWNLOADING, COMPLETED, FAILED, REMOVING, RESTARTING |
| `DownloadStorageType` | INTERNAL, EXTERNAL |
| `ThemeMode` | SYSTEM, LIGHT, DARK |
| `HoldAction` | FAST_FORWARD, PAUSE |
| `SubtitleFontFamily` | DEFAULT, TREBUCHET (`trebuc`), INTER (`inter`), LEVENIM (`levenim`) |
| `BugStatus` | (decompiled enum exists in source tree) |

### 5.4 Backup format

- MIME type: `application/vnd.anistation.backup`
- Default path: `Downloads/AniStation/Backups/AniStation-backup-YYYYMMDD-HHMMSS.anistationbackup`
- Retention: latest 7 backups kept
- Trigger: WorkManager `BackupWorker` (runs ~9:00 AM local time when enabled)
- Frequency setting: `BackupFrequency` enum (NEVER / DAILY / WEEKLY / MONTHLY)

---

## 6. Integrations — IDs, Keys, Tokens

All values below were extracted directly from the APK's resources, native libraries, or decompiled bytecode.

### 6.1 Firebase (Analytics + Cloud Messaging + Storage)

| Field | Value |
|---|---|
| Project ID | `anistation-app` |
| Storage bucket | `anistation-app.firebasestorage.app` |
| Sender ID (GCM/FCM) | `801867429014` |
| Mobile services app ID | `1:801867429014:android:100af3e9571c2fa9b9feb7` |
| **API Key (hardcoded in strings.xml)** | `AIzaSyDuA8_I-4zVE78Cx3DrOMUn-gviWqP6Ox4` |
| Firebase Analytics version | 23.2.0 |

### 6.2 Unity Ads (Rewarded video ads)

| Field | Value |
|---|---|
| Game ID | `800363057` |
| Rewarded placement | `Rewarded_Android` |
| Test mode | `false` |
| Custom reward string sent on ad show | `highest_quality_download` |
| Init class | `defpackage/zn6.java` (UnityRewardedAds manager) |
| Init gate | `uz5.V("Rewarded_Android") == false && uz5.M("Rewarded_Android", "REPLACE_WITH", true) == false` → both true → real ID configured |

### 6.3 Discord (Rich Presence + Social SDK)

| Field | Value |
|---|---|
| Discord Application ID | `1543212125684764693` |
| App-asset: large icon | `https://cdn.discordapp.com/app-assets/1543212125684764693/1543233570112409681.png` |
| App-asset: small icon | `https://cdn.discordapp.com/app-assets/1543212125684764693/1552400121600151634.png` |
| Discord support server invite | `https://discord.gg/uQ5GuwGYyY` |
| OAuth2 authorize URL | `https://discord.com/oauth2/authorize` |
| Native bridge class | `com.anistation.android.presence.DiscordPresenceNativeBridge` |
| Native libs | `libanistation_discord.so` (713 KB, NDK r28c) + `libdiscord_partner_sdk.so` (8.6 MB, NDK r23c) |
| RPC service binding | `com.discord.socialsdk.rpc.IDiscordRpcService` action, RPC version `1` |
| Discord package queried | `com.discord` |
| Rich Presence enable gate | `uz5.V("1543212125684764693") == false && DiscordPresenceNativeBridge.b == true` → real ID, native lib present → enabled |

### 6.4 GitHub (developer profile link on About page)

| Field | Value |
|---|---|
| API endpoint | `https://api.github.com` |
| Used by | `Route.About` screen, fetches `DevProfile` (dev username, avatar, bio, followers, etc.) |

### 6.5 Crypto donation addresses (Donate route)

| Asset | Address |
|---|---|
| Bitcoin (BTC) | `bc1qup69ecueq7069sqk8ma3wtytczh87ek8e638g9` |
| Ethereum (ETH) | `0x0A66C86644CB65D67d2BeFB67D670a54eBa8879d` |
| Donate string | "Decentralized Crypto Network" |

### 6.6 Google Play Services modules in use

- Cast Framework (`play-services-cast-framework`) — video casting
- Cast (`play-services-cast`) — actual cast transport
- Cronet (`play-services-cronet`) — HTTP transport for Ktor/OkHttp
- Ads Identifier (`play-services-ads-identifier`) — for Unity Ads attribution
- Measurement / Analytics (`play-services-measurement-*`) — Firebase Analytics
- Tasks / Basement / Base / Stats / Flags — standard GMS plumbing

---

## 7. Permissions & Manifest Features

### 7.1 Permissions requested

| Permission | Purpose |
|---|---|
| `INTERNET` | API access |
| `ACCESS_NETWORK_STATE` | Connectivity detection (download scheduler waits for Wi-Fi) |
| `FOREGROUND_SERVICE` | Internal + External download services |
| `FOREGROUND_SERVICE_DATA_SYNC` | Android 14+ data-sync FGS type for downloads |
| `REQUEST_INSTALL_PACKAGES` | In-app APK updater (downloads + installs new build) |
| `VIBRATE` | Haptics on player gestures |
| `POST_NOTIFICATIONS` | Android 13+ download/backup notifications |
| `RECEIVE_BOOT_COMPLETED` | WorkManager rescheduling |
| `WAKE_LOCK` | Keep device awake during playback/downloads |
| `com.google.android.gms.permission.AD_ID` | Unity Ads + attribution |
| `ACCESS_ADSERVICES_TOPICS` | Privacy Sandbox topics API |
| `ACCESS_ADSERVICES_ATTRIBUTION` | Privacy Sandbox attribution |
| `ACCESS_ADSERVICES_AD_ID` | Privacy Sandbox ad ID |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | Play Install Referrer |
| `com.anistation.android.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` (signature) | Internal broadcast protection |

### 7.2 `<queries>` block (declares visibility)

- `com.discord` — Discord RPC binding
- `com.android.vending`, `com.google.market`, `com.amazon.venezia`, `com.sec.android.app.samsungapps`, `com.xiaomi.market`, `com.huawei.appmarket`, `com.oppo.market`, `com.bbk.appstore` — multiple app stores for install referrer + APK updater
- `com.google.android.gms.policy_cast_dynamite` — Cast dynamic module
- Custom Tabs action `android.support.customtabs.action.CustomTabsService`
- Discord RPC service `com.discord.socialsdk.rpc.IDiscordRpcService`
- Attribution provider `com.attribution.REFERRAL_PROVIDER`

### 7.3 Components registered

| Component | Type | Exported |
|---|---|---|
| `com.anistation.android.MainActivity` | Activity | ✅ (LAUNCHER + deep-link filter) |
| `com.anistation.download.service.InternalDownloadService` | Service (FGS dataSync) | ❌ |
| `com.anistation.download.service.ExternalDownloadService` | Service (FGS dataSync) | ❌ |
| `androidx.media3.session.BluetoothValidationActivity` | Activity | ✅ (BLUETOOTH_PRIVILEGED perm) |
| `androidx.media3.session.MediaSessionService` (implied) | Service | — |
| `com.google.android.gms.cast.framework.media.MediaIntentReceiver` | Receiver | ❌ |
| `com.google.android.gms.cast.framework.ReconnectionService` | Service | ❌ |
| `com.unity3d.ads.adplayer.FullScreenWebViewDisplay` | Activity (fullscreen) | ❌ |
| `com.unity3d.ads.adplayer.AdTaskRemovalDetectionService` | Service | ❌ |
| `androidx.core.content.FileProvider` (authority: `com.anistation.android.fileprovider`) | Provider | ❌ |
| `androidx.startup.InitializationProvider` (authority: `com.anistation.android.androidx-startup`) | Provider | ❌ |
| `com.google.firebase.provider.FirebaseInitProvider` (authority: `com.anistation.android.firebaseinitprovider`) | Provider | ❌ |
| `com.anistation.repository.backup.BackupWorker` | WorkManager CoroutineWorker | — |
| `com.google.android.gms.measurement.AppMeasurement*` | Service + Receiver | ❌ |

### 7.4 Application-level flags

| Flag | Value | Effect |
|---|---|---|
| `usesCleartextTraffic` | **`true`** | Allows plaintext HTTP — note: only `open.anistation.top` (HTTPS) is actually used; flag is overly permissive |
| `allowBackup` | true | — |
| `extractNativeLibs` | false | Libs are page-mapped directly from the APK |
| `fullBackupContent` | `@xml/backup_rules` | Custom backup ruleset |
| `dataExtractionRules` | `@xml/data_extraction_rules` | Android 12+ extraction rules |

---

## 8. Native Libraries (`lib/arm64-v8a/`)

| File | Size | Built with | Purpose |
|---|---|---|---|
| `libandroidx.graphics.path.so` | 10 KB | NDK r25c | AndroidX `graphics-path` (Path API) |
| `libdatastore_shared_counter.so` | 8 KB | NDK r20 | DataStore atomic shared counter |
| `libanistation_discord.so` | 713 KB | **NDK r28c** | Custom JNI bridge wrapping Discord Partner SDK for Rich Presence. JNI class: `com.anistation.android.presence.DiscordPresenceNativeBridge`. Exposes `nativeStart`, `nativeStop`, `nativeUpdate`, `nativeClear`, `nativeRunCallbacks`. |
| `libdiscord_partner_sdk.so` | 8.6 MB | NDK r23c | Discord Partner SDK — proprietary C++ `discordpp::` namespace + C API `Discord_Activity*` family. Powers all Discord Rich Presence + Activity invites. |
| `libunitycoherencenative.so` | 514 KB | NDK r25c | Unity Coherence bridge — powers Unity Ads. JNI class `com.unity3d.coherence.CoherenceBridge`. |

---

## 9. Localization

The app ships strings for **~85 locales** (every Google-supported locale from Afrikaans to Zulu). The default `res/values/strings.xml` contains 446 strings.

---

## 10. 🔓 Every Lock / Gate / Hidden Feature Found

This is the actionable section for modification. Each gate is described with **file:line** references into the decompiled tree under `jadx-sources/`.

### 10.1 Rewarded-ad "highest quality" download gate

**Where it's enforced (server side)**: `v2/anime/sources` endpoint takes an `adType` query parameter. If the user has unlocked the rewarded session, the client sends a different `adType` (or none) and the server returns sources that include the highest-quality stream URLs.

**Client-side flow** (`defpackage/zn6.java`, `defpackage/wb.java`, `defpackage/eo3.java`):

1. User taps "Tap to unlock" in the player UI (`tap_to_unlock` / `unlock` strings).
2. `zn6.f()` calls `RewardedAd.show(activity, ShowConfiguration.Builder().withCustomRewardString("highest_quality_download").build(), eo3-as-RewardedShowListener)`.
3. On `ShowFinishState.COMPLETED` + the user actually earned the reward (`zn6.h == true`), the listener fires `u55.x = RewardEarned` (`lb5.java` case 17, line 284).
4. The state propagates back to the player viewmodel, which re-fetches sources with the unlocked `adType`.
5. The unlock persists **for the current anime session only** — closing the player clears it.

**State machine `u55`** (`defpackage/u55.java`):
```
RewardEarned       (x)  // success — unlocked
Skipped            (y)  // user skipped ad
Unavailable        (z)  // no fill
AlreadyShowing     (A)  // duplicate show call
NotConfigured      (B)  // placeholder ID detected
```

**How to bypass** (will be implemented in next step):
- Patch `zn6.f()` to immediately call `a(u55.x)` (RewardEarned) without ever invoking Unity Ads.
- Or patch `zn6.b()` to skip the placeholder-ID gate and go straight to `a(u55.x)`.

### 10.2 Unity Ads placeholder-ID gate

In `zn6.b()`:
```java
if (b06.L("800363057") != null                  // game ID parses as Long (not placeholder)
    && !uz5.V("Rewarded_Android")                // placement is not all-digits (not placeholder)
    && !uz5.M("Rewarded_Android", "REPLACE_WITH", true)) {  // doesn't contain "REPLACE_WITH"
    // → real IDs configured, proceed with Unity Ads
}
```

`uz5.V()` checks "all characters are digits" — the literal string `"Rewarded_Android"` is not, so the gate passes.
`uz5.M()` checks "string contains substring" — `Rewarded_Android` does not contain `REPLACE_WITH`, so the gate passes.

→ Unity Ads is **fully configured and active** in this build. Real game ID `800363057` is in use.

### 10.3 Discord Rich Presence placeholder-ID gate

In `defpackage/u64.java` (line 24):
```java
if (!uz5.V("1543212125684764693") && DiscordPresenceNativeBridge.b) {
    z = true;  // presence enabled
}
```

`1543212125684764693` is all digits → `uz5.V()` returns true → `!uz5.V()` returns false → but combined with `DiscordPresenceNativeBridge.b == true` (native lib loaded successfully), the gate *as a whole* still sets `z = true`.

Wait — re-reading: the `&&` short-circuits. If `!uz5.V("1543212125684764693")` is **false** (because `uz5.V` returns true for all-digit string), then `b` is never checked. So in fact the gate *fails*.

**This means Rich Presence is currently DISABLED** in this build, even though the native lib is bundled and the app ID is real. The UI shows `discord_rich_presence_unavailable_summary` ("Unavailable until this build is configured with the official Discord Social SDK.").

This is an intentional soft-disable by the developer — possibly because they don't have a Discord Partner SDK license yet. The toggle is visible in Settings → Social → Discord Rich Presence but greyed-out.

**How to enable**: Patch `u64.<init>` to set `this.f = true` unconditionally, OR patch `uz5.V` to return false for that specific string. Either unlocks the toggle.

### 10.4 Force-update gate

In `defpackage/nx7.java` (around lines 1972-2044) and `defpackage/ia.java`:
- If the server returns `AppUpdateCheck.forceUpdate == true` OR `currentVersionCode < minSupportedVersionCode`, the app shows a non-dismissable "Update Required" screen (`update_required` string).
- If only `updateAvailable == true` (not forced), it shows a dismissable "Update Available" dialog.

**How to disable**: Patch `AppUpdateCheck.getForceUpdate()` to always return `false` (smali edit in `AppUpdateCheck.smali`). Or short-circuit `nx7`'s `forceUpdate` branch.

### 10.5 "Experimental settings" screen

`Route.ExperimentalSettings` is registered as a navigation destination. It's linked from the main `Settings` screen via the `experimental_settings` string ("Experimental settings"). The screen renders an `aj.a(...)` call (settings row) — `defpackage/nz1.java` lines ~75-100 build it.

Currently the experimental screen appears to expose only:
- Discord Rich Presence toggle (greyed out per 10.3 above)
- Discord "share watching details" sub-toggle

But the route exists as a place to add more experimental toggles in future builds. It's a hidden-in-plain-sight developer surface.

### 10.6 Download-over-Wi-Fi-only gate

In `DownloadSettings`:
```kotlin
class DownloadSettings(
    val downloadOverWifiOnly: Boolean = false,
    val externalLocationUri: String? = null,
    val externalLocationName: String = "Downloads/AniStation"
)
```

Default is `false`, so downloads proceed on any network. User can toggle to Wi-Fi-only in Download Settings.

### 10.7 External vs Internal download path

The app ships **two** download services:

- **`InternalDownloadService`** extends Media3 `kl1` (DownloadService). Stores episodes in app-internal Media3 download cache — playable only inside the app.
- **`ExternalDownloadService`** extends Android `Service`. Uses ffmpeg-style muxing to produce an `.mp4` in `Downloads/AniStation/`. The actual muxing path is implemented via a custom pipeline (visible from imports: `MimeTypes`, `MediaMetadata`, `Pattern` for filename sanitization, etc.).

**Mutual exclusion**: An episode can be downloaded by ONE service at a time. Strings `already_downloading_internal` / `already_downloading_external` enforce this:
> "This episode is already queued or downloaded internally. Remove the internal download to use external storage."

### 10.8 Server-side "Server Upkeep Notice"

There's a string `server_maintenance` = "Server Upkeep Notice". This is likely triggered by a backend flag (returned in `SourcesResponse` or by an HTTP 5xx with a specific payload) that surfaces a maintenance banner. Useful surface area for an "always show maintenance info" or "never show" patch.

### 10.9 Subtitle font family choices

The app ships 4 fonts embedded as TTF resources:
- `DEFAULT` (system)
- `TREBUCHET` (`trebuc.ttf`)
- `INTER` (`inter.ttf`)
- `LEVENIM` (`levenim.ttf`)

Subtitle styling ranges (clamped in `SubtitleStyleSettings`):
- `fontScale`: 0.7 → 1.6 (default 1.0)
- `verticalPosition`: 0.55 → 1.0 (default 0.9)
- `outlineWidthDp`: 0.0 → 3.0 (default 2.0)
- `textColorArgb`: default -1 (white)
- `outlineColorArgb`: default `SubtitleArgbColor.BLACK`

### 10.10 Skip intro / outro

The `Skips` model contains `SkipRange` objects (startMs, endMs, type) — likely returned by `v2/anime/sources` as part of `SourcesResponse`. Toggles:
- `show_skip_button` (UI toggle on/off)
- `auto_skip` (auto-skip without showing button)

**Skip types observed from strings**: `intro_skipped`, `outro_skipped` — likely a `SkipType` enum with INTRO/OUTRO values.

### 10.11 Player gestures (4 gesture systems)

| Gesture | Setting key | Behavior |
|---|---|---|
| **Volume/Brightness swipe** | `volume_brightness_gestures` | Swipe up/down on player edges |
| **Fullscreen swipe** | `fullscreen_swipe_gestures` | Swipe up = fullscreen, swipe down = exit |
| **Double-tap to skip** | `double_tap_to_skip` | Double-tap left/right to seek |
| **Hold gesture** | `hold_gesture` + `hold_action` | Long-press = FAST_FORWARD or PAUSE (user-configurable) |

### 10.12 Backup retention policy

Hardcoded to keep the latest 7 backups (`backup_location_retention` string). To change this number, find the constant in the backup directory cleanup code.

### 10.13 Bug-report server endpoint

`POST https://open.anistation.top/reports/new` with a JSON `BugReport` body. Returns the new bug ID as `Response<String>`. The `BugReport` model includes:
- `bugId`, `title`, `description`, `deviceName`, `osVersion`, `appVersion`, `status`, `reportedAt`.

### 10.14 In-app APK updater

The app can download and install its own updates:
1. `oq.java` calls `GET /app/updates/check?currentVersionCode=6&platform=android&channel=<channel>&packageName=com.anistation.android`.
2. If `updateAvailable`, the UI shows `update_message_1` or `update_message_2`.
3. If user taps "Update Now", the app downloads the APK from `apkUrl`, verifies SHA-256 against `apkSha256`, then triggers `REQUEST_INSTALL_PACKAGES` via the system installer.
4. `FileProvider` authority `com.anistation.android.fileprovider` exposes the downloaded APK to the installer.

The `<string name="downloading_message">` reads: "Getting things ready… Downloading the newest build."

### 10.15 Hidden "REPLACE_WITH" placeholder check

Throughout the codebase, calls like `uz5.M(placementId, "REPLACE_WITH", true)` exist as **developer guards** — they detect whether the build is still using template placeholder IDs. Setting any ID back to `"REPLACE_WITH"` disables that integration.

---

## 11. File Inventory of this Repo

| Path | Contents |
|---|---|
| `README.md` (this file) | Full reverse-engineering report |
| `jadx-sources/` | 10,497 Java files decompiled by jadx 1.5.0 (`com/anistation/`, `defpackage/`, `com/discord/`, `com/unity3d/`, `com/google/`, etc.) |
| `apktool-smali/` | 12,473 smali files from apktool 2.10.0 — ready to patch and rebuild |
| `apktool-smali/AndroidManifest.xml` | Decoded manifest |
| `apktool-smali/res/` | Decoded resources (XML, strings.xml in 85 locales, drawables) |
| `apktool-smali/apktool.yml` | apktool build config |
| `extracted/` | Raw unzip of the APK — `classes.dex`, `classes2.dex`, `resources.arsc`, `lib/arm64-v8a/`, `assets/`, `META-INF/` |
| `extracted/lib/arm64-v8a/` | 5 native libs (`libanistation_discord.so`, `libdiscord_partner_sdk.so`, `libunitycoherencenative.so`, `libandroidx.graphics.path.so`, `libdatastore_shared_counter.so`) |
| `jadx-resources/AndroidManifest.xml` | jadx-decoded manifest (alternate view) |
| `jadx-resources/res/values/strings.xml` | English default strings (446 entries) |
| `tools/jadx/` | jadx 1.5.0 binary (kept for re-runs) |
| `tools/apktool.jar` | apktool 2.10.0 (kept for rebuilds) |
| `tools/uber-apk-signer.jar` | APK signer (for signing the rebuilt APK) |

---

## 12. Next Steps — Proposed Modifications

When you tell me what to change, I'll modify the smali in `apktool-smali/` and rebuild. Common targets:

| # | Modification | Files to patch |
|---|---|---|
| A | Bypass rewarded-ad gate (always unlock highest quality) | `smali_classes2/defpackage/zn6.smali` (patch `f()` to skip the `RewardedAd.show` call and immediately invoke `a(u55.x)`), `smali/defpackage/u55.smali` (force `RewardEarned`) |
| B | Enable Discord Rich Presence (force the toggle on) | `smali_classes2/defpackage/u64.smali` (force `this.f = true` in `<init>`), or `smali_classes2/defpackage/uz5.smali` (make `V()` return false for the Discord app ID) |
| C | Disable force-update gate | `smali_classes2/com/anistation/model/update/AppUpdateCheck.smali` (patch `getForceUpdate()` to `const/4 v0, 0x0; return v0`) |
| D | Disable Firebase Analytics | `smali/AndroidManifest.xml` (remove `FirebaseInitProvider` provider), or patch `com.google.android.gms.measurement.AppMeasurement*` to no-op |
| E | Re-point API base URL to your own server | `smali_classes2/defpackage/dm.smali`, `oq.smali`, `rm.smali`, `tl.smali`, `fb0.smali` — replace the string `"https://open.anistation.top"` with your URL |
| F | Disable Unity Ads entirely | Patch `zn6.b()` to immediately call `a(u55.B)` (NotConfigured) |
| G | Rebrand (rename app, swap icons) | `res/values/strings.xml` (`app_name`), `AndroidManifest.xml` (`package` attr — partial, needs smali package rename), `res/mipmap-*/ic_launcher*` |
| H | Re-sign with own keystore | Use `tools/uber-apk-signer.jar` after rebuild |
| I | Change Discord app ID | `smali_classes2/com/anistation/android/presence/DiscordPresenceNativeBridge.smali` (the `"1543212125684764693"` literal) |
| J | Change Unity game ID | `smali_classes2/defpackage/zn6.smali` (the `"800363057"` literal) and `tn6.smali` |
| K | Change Firebase config | `res/values/strings.xml` (`google_api_key`, `google_app_id`, `project_id`, `gcm_defaultSenderId`, `google_storage_bucket`) |

---

*End of analysis. Waiting for instructions on which modification(s) to apply.*
