package d8;

import a3.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import c9.i;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import p.j;
import r6.h0;
import y8.a0;
import y8.b0;
import y8.d0;
import y8.f0;
import y8.o;
import y8.s;
import y8.v;
import y8.w;
import y8.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f3243f = {"https://api3.aoneroom.com", "https://api4.aoneroom.com", "https://api4sg.aoneroom.com", "https://api5.aoneroom.com", "https://api6.aoneroom.com", "https://api7.aoneroom.com", "https://api8.aoneroom.com"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f3244g = {"https://movie-box.co", "https://123moviesfree.club", "https://movieboxonline.net", "https://sflix.film", "https://h5-api.aoneroom.com", "https://netnaija.film", "https://movieboxhd.net"};

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f3245h = Pattern.compile("\"token\"\\s*:\\s*\"([^\"]+)\"");

    /* renamed from: a, reason: collision with root package name */
    public final w f3246a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3247b;

    /* renamed from: c, reason: collision with root package name */
    public int f3248c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f3249d;

    /* renamed from: e, reason: collision with root package name */
    public volatile String f3250e = "";

    public b(w wVar, Context context) {
        wVar.getClass();
        v vVar = new v(wVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vVar.a(15L, timeUnit);
        vVar.b(25L, timeUnit);
        this.f3246a = new w(vVar);
        this.f3247b = context.getApplicationContext();
    }

    public static String f(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String i(String str) {
        String str2;
        if (!str.trim().isEmpty()) {
            try {
                Matcher matcher = Pattern.compile("Edge-Cache-Cookie=urlprefix=([^:;\\s]+)").matcher(str);
                if (matcher.find()) {
                    String replace = matcher.group(1).replace('_', '/').replace('-', '+');
                    int length = (4 - (replace.length() % 4)) % 4;
                    for (int i10 = 0; i10 < length; i10++) {
                        replace = replace + "=";
                    }
                    String trim = new String(Base64.decode(replace, 0), StandardCharsets.UTF_8).trim();
                    while (trim.endsWith("/")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    return trim + "/index.mpd";
                }
            } catch (Exception unused) {
            }
            try {
                Matcher matcher2 = Pattern.compile("CloudFront-Policy=([^;]+)").matcher(str);
                if (!matcher2.find()) {
                    return null;
                }
                String group = matcher2.group(1);
                String replace2 = group.replace('-', '+').replace('~', '/').replace('_', '=');
                int length2 = (4 - (replace2.length() % 4)) % 4;
                for (int i11 = 0; i11 < length2; i11++) {
                    replace2 = replace2 + "=";
                }
                try {
                    str2 = new String(Base64.decode(replace2, 0), StandardCharsets.UTF_8);
                } catch (Exception unused2) {
                    str2 = null;
                }
                if (str2 == null) {
                    String replace3 = group.replace('-', '+').replace('_', '/');
                    int length3 = (4 - (replace3.length() % 4)) % 4;
                    for (int i12 = 0; i12 < length3; i12++) {
                        replace3 = replace3 + "=";
                    }
                    try {
                        str2 = new String(Base64.decode(replace3, 0), StandardCharsets.UTF_8);
                    } catch (Exception unused3) {
                        return null;
                    }
                }
                String optString = new JSONObject(str2).optJSONArray("Statement").optJSONObject(0).optString("Resource", "");
                if (optString.isEmpty()) {
                    return null;
                }
                while (true) {
                    if (!optString.endsWith("*") && !optString.endsWith("/")) {
                        break;
                    }
                    optString = optString.substring(0, optString.length() - 1);
                }
                if (optString.toLowerCase().endsWith(".mpd")) {
                    return optString;
                }
                return optString + "/index.mpd";
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    public static LinkedHashMap l(String str, String str2, String str3, String str4, String str5) {
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user-agent", "com.community.mbox.in/50020130 (Linux; U; Android 14; en_IN; Pixel 8; Build/UD1A.230803.041; Cronet/145.0.7582.0)");
        linkedHashMap.put("accept", "application/json");
        linkedHashMap.put("content-type", "application/json");
        linkedHashMap.put("connection", "keep-alive");
        SecureRandom secureRandom = c.f3251a;
        String l10 = Long.toString(currentTimeMillis);
        String sb = new StringBuilder(l10).reverse().toString();
        StringBuilder a10 = j.a(l10, ",");
        a10.append(c.c(sb.getBytes(StandardCharsets.UTF_8)));
        linkedHashMap.put("x-client-token", a10.toString());
        try {
            String a11 = c.a(str, str2, str3, currentTimeMillis);
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(new SecretKeySpec(Base64.decode(new String(Base64.decode("NzZpUmwwN3MweFNOOWpxbUVXQXQ3OUVCSlp1bElRSXNWNjRGWnIyTw==", 0), StandardCharsets.UTF_8).trim(), 0), "HmacMD5"));
            linkedHashMap.put("x-tr-signature", currentTimeMillis + "|2|" + Base64.encodeToString(mac.doFinal(a11.getBytes(StandardCharsets.UTF_8)), 2));
            linkedHashMap.put("x-client-info", "{\"package_name\":\"com.community.mbox.in\",\"version_name\":\"4.0.03.0920.03\",\"version_code\":50020130,\"os\":\"android\",\"os_version\":\"14\",\"device_id\":\"" + str4 + "\",\"install_store\":\"official\",\"gaid\":\"1b2212c1-dadf-43c3-a0c8-bd6ce48ae22d\",\"brand\":\"Google\",\"model\":\"Pixel 8\",\"system_language\":\"en\",\"net\":\"NETWORK_WIFI\",\"region\":\"IN\",\"timezone\":\"Asia/Calcutta\",\"sp_code\":\"\"}");
            linkedHashMap.put("x-client-status", "0");
            if (c.b(str5)) {
                linkedHashMap.put("authorization", "Bearer " + str5);
            }
            return linkedHashMap;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static JSONObject m(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("code", "");
            if (!optString.isEmpty() && !"0".equals(optString)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                return optJSONObject;
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(o oVar) {
        String e10;
        for (int i10 = 0; i10 < oVar.f11770a.length / 2; i10++) {
            try {
                if (oVar.c(i10).equalsIgnoreCase("x-user") && (e10 = oVar.e(i10)) != null) {
                    Matcher matcher = f3245h.matcher(e10);
                    if (matcher.find() && c.b(matcher.group(1))) {
                        this.f3249d = matcher.group(1);
                    }
                }
            } catch (Exception e11) {
                Log.e("MovieBoxApi", "captureToken", e11);
                return;
            }
        }
    }

    public final JSONObject b(String str, int i10, String str2, String str3, String str4, String str5, String str6) {
        if (str2 == null) {
            str2 = "All";
        }
        if (str3 == null) {
            str3 = "All";
        }
        if (str4 == null) {
            str4 = "All";
        }
        if (str5 == null) {
            str5 = "All";
        }
        if (str6 == null) {
            str6 = "ForYou";
        }
        return m(o("/wefeed-mobile-bff/subject-api/list", "{\"page\":" + i10 + ",\"perPage\":20,\"channelId\":\"" + str + "\",\"classify\":\"" + str2 + "\",\"country\":\"" + str3 + "\",\"year\":\"" + str4 + "\",\"genre\":\"" + str5 + "\",\"sort\":\"" + str6 + "\",\"restrictKid\":0}"));
    }

    public final String c() {
        return f3243f[this.f3248c % 7];
    }

    public final JSONObject d(String str) {
        return m(k("/wefeed-mobile-bff/subject-api/get?host=" + f(c()) + "&subjectId=" + f(str)));
    }

    public final String e() {
        String string;
        Context context = this.f3247b;
        synchronized (w7.b.class) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("pistream_moviebox", 0);
            string = sharedPreferences.getString("device_id", "");
            if (string == null || string.isEmpty()) {
                byte[] bArr = new byte[16];
                c.f3251a.nextBytes(bArr);
                StringBuilder sb = new StringBuilder(32);
                for (int i10 = 0; i10 < 16; i10++) {
                    sb.append(String.format(Locale.US, "%02x", Integer.valueOf(bArr[i10] & 255)));
                }
                string = sb.toString();
                sharedPreferences.edit().putString("device_id", string).apply();
            }
        }
        return string;
    }

    public final synchronized String g(boolean z9) {
        d0 c6;
        String r8;
        String r9 = r();
        if (!z9 && c.b(r9)) {
            return r9;
        }
        Log.d("MovieBox", "ensureToken: fetching fresh token");
        try {
            String e10 = e();
            String[] strArr = f3243f;
            String[] strArr2 = new String[8];
            strArr2[0] = "https://apig.inmoviebox.com";
            System.arraycopy(strArr, 0, strArr2, 1, 7);
            for (int i10 = 0; i10 < 8; i10++) {
                String str = strArr2[i10];
                String str2 = str + "/wefeed-mobile-bff/tab/ranking-list?tabId=0&categoryType=4516404531735022304&page=1&perPage=1";
                try {
                    y yVar = new y();
                    yVar.d(str2);
                    yVar.c("GET", null);
                    for (Map.Entry entry : l("GET", str2, null, e10, null).entrySet()) {
                        yVar.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    w wVar = this.f3246a;
                    androidx.appcompat.widget.w a10 = yVar.a();
                    wVar.getClass();
                    c6 = new i(wVar, a10, false).c();
                    try {
                        a(c6.f11696f);
                        j();
                        r8 = r();
                        Log.d("MovieBox", "bootstrap " + str + " -> " + c6.f11694d);
                    } catch (Throwable th) {
                        try {
                            c6.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    Log.d("MovieBox", "bootstrap " + str + " EX " + e11.getMessage());
                    this.f3250e = "bootstrap " + str + " EX " + e11.getMessage();
                }
                if (c.b(r8)) {
                    c6.close();
                    return r8;
                }
                this.f3250e = "bootstrap " + str + " code=" + c6.f11694d;
                c6.close();
            }
            return r();
        } catch (Exception unused) {
            return r();
        }
    }

    public final JSONObject h(String str, String str2) {
        return m(k("/wefeed-mobile-bff/subject-api/get-ext-captions?host=" + f(c()) + "&subjectId=" + f(str) + "&resourceId=" + f(str2) + "&episode=0"));
    }

    public final void j() {
        if (this.f3249d != null) {
            Context context = this.f3247b;
            String str = this.f3249d;
            synchronized (w7.b.class) {
                if (str != null) {
                    if (!str.isEmpty()) {
                        context.getApplicationContext().getSharedPreferences("pistream_moviebox", 0).edit().putString("bearer_token", str).apply();
                    }
                }
            }
            this.f3249d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String, y8.b0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final String k(String str) {
        d0 c6;
        String str2;
        int i10;
        g(false);
        String str3 = 0;
        str3 = 0;
        try {
            String e10 = e();
            String r8 = r();
            int i11 = 0;
            boolean z9 = false;
            while (i11 <= 7) {
                String t9 = g.t(new StringBuilder(), f3243f[(this.f3248c + i11) % 7], str);
                try {
                    y yVar = new y();
                    yVar.d(t9);
                    yVar.c("GET", str3);
                    for (Map.Entry entry : l("GET", t9, str3, e10, r8).entrySet()) {
                        yVar.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    w wVar = this.f3246a;
                    androidx.appcompat.widget.w a10 = yVar.a();
                    wVar.getClass();
                    c6 = new i(wVar, a10, false).c();
                    try {
                        a(c6.f11696f);
                        j();
                    } finally {
                    }
                } catch (Exception e11) {
                    Log.d("MovieBox", "GET " + str.split("\\?")[0] + " EX " + e11.getMessage());
                    this.f3250e = "GET " + str.split("\\?")[0] + " EX " + e11.getMessage();
                }
                if (c6.f()) {
                    this.f3248c = (this.f3248c + i11) % 7;
                    f0 f0Var = c6.f11697x;
                    if (f0Var != null) {
                        str2 = f0Var.q();
                    } else {
                        str2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("GET ");
                    sb.append(str.split("\\?")[0]);
                    sb.append(" -> 200 len=");
                    if (str2 != null) {
                        i10 = str2.length();
                    } else {
                        i10 = -1;
                    }
                    sb.append(i10);
                    Log.d("MovieBox", sb.toString());
                    c6.close();
                    return str2;
                }
                Log.d("MovieBox", "GET " + str.split("\\?")[0] + " -> " + c6.f11694d);
                this.f3250e = "GET " + str.split("\\?")[0] + " code=" + c6.f11694d;
                int i12 = c6.f11694d;
                if ((i12 == 401 || i12 == 441) && !z9) {
                    z9 = true;
                    r8 = g(true);
                    c6.close();
                    str3 = 0;
                } else {
                    c6.close();
                    i11++;
                    str3 = 0;
                }
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    public final JSONObject n(int i10, int i11, String str) {
        return m(k("/wefeed-mobile-bff/subject-api/play-info?subjectId=" + f(str) + "&se=" + i10 + "&ep=" + i11));
    }

    public final String o(String str, String str2) {
        int i10;
        boolean z9;
        String str3;
        String str4;
        String str5;
        byte[] bytes;
        s k10;
        int length;
        String str6;
        String str7;
        long length2;
        long j4;
        long j10;
        d0 c6;
        String str8;
        int i11;
        b bVar = this;
        String str9 = str;
        String str10 = "MovieBox";
        String str11 = "\\?";
        bVar.g(false);
        try {
            String e10 = e();
            boolean z10 = false;
            String r8 = r();
            int i12 = 0;
            while (i12 <= 7) {
                String t9 = g.t(new StringBuilder(), f3243f[(bVar.f3248c + i12) % 7], str9);
                try {
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                    Pattern pattern = s.f11790d;
                    k10 = y8.j.k("application/json");
                    int i13 = b0.f11663a;
                    h0.u(bytes, "<this>");
                    length = bytes.length;
                    str6 = str10;
                    str7 = str11;
                    length2 = bytes.length;
                    i10 = i12;
                    z9 = z10;
                    j4 = 0;
                    j10 = length;
                    try {
                        byte[] bArr = z8.b.f12133a;
                    } catch (Exception e11) {
                        e = e11;
                        bVar = this;
                    }
                } catch (Exception e12) {
                    e = e12;
                    i10 = i12;
                    z9 = z10;
                    str3 = str10;
                    str4 = str11;
                    str5 = str9;
                }
                if ((j4 | j10) >= 0 && j4 <= length2 && length2 - j4 >= j10) {
                    a0 a0Var = new a0(length, 0, k10, bytes);
                    y yVar = new y();
                    yVar.d(t9);
                    yVar.c("POST", a0Var);
                    for (Map.Entry entry : l("POST", t9, str2, e10, r8).entrySet()) {
                        yVar.b((String) entry.getKey(), (String) entry.getValue());
                    }
                    bVar = this;
                    try {
                        w wVar = bVar.f3246a;
                        androidx.appcompat.widget.w a10 = yVar.a();
                        wVar.getClass();
                        c6 = new i(wVar, a10, false).c();
                        try {
                            bVar.a(c6.f11696f);
                            j();
                        } catch (Throwable th) {
                            th = th;
                            str5 = str;
                            str3 = str6;
                            str4 = str7;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str5 = str;
                        str3 = str6;
                        str4 = str7;
                        Log.d(str3, "POST " + str5.split(str4)[0] + " EX " + e.getMessage());
                        bVar.f3250e = "POST " + str5.split(str4)[0] + " EX " + e.getMessage();
                        str9 = str5;
                        str11 = str4;
                        str10 = str3;
                        z10 = z9;
                        i12 = i10 + 1;
                    }
                    if (c6.f()) {
                        bVar.f3248c = (bVar.f3248c + i10) % 7;
                        f0 f0Var = c6.f11697x;
                        if (f0Var != null) {
                            str8 = f0Var.q();
                        } else {
                            str8 = null;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("POST ");
                        str5 = str;
                        str4 = str7;
                        try {
                            sb.append(str5.split(str4)[0]);
                            sb.append(" -> 200 len=");
                            if (str8 != null) {
                                i11 = str8.length();
                            } else {
                                i11 = -1;
                            }
                            sb.append(i11);
                            str3 = str6;
                            Log.d(str3, sb.toString());
                            c6.close();
                            return str8;
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = str6;
                        }
                    } else {
                        str5 = str;
                        str3 = str6;
                        str4 = str7;
                        try {
                            Log.d(str3, "POST " + str5.split(str4)[0] + " -> " + c6.f11694d);
                            bVar.f3250e = "POST " + str5.split(str4)[0] + " code=" + c6.f11694d;
                            int i14 = c6.f11694d;
                            if ((i14 == 401 || i14 == 441) && !z9) {
                                try {
                                    r8 = bVar.g(true);
                                    try {
                                        c6.close();
                                        str9 = str5;
                                        str11 = str4;
                                        i12 = i10;
                                        z10 = true;
                                        str10 = str3;
                                    } catch (Exception e14) {
                                        e = e14;
                                        z9 = true;
                                        Log.d(str3, "POST " + str5.split(str4)[0] + " EX " + e.getMessage());
                                        bVar.f3250e = "POST " + str5.split(str4)[0] + " EX " + e.getMessage();
                                        str9 = str5;
                                        str11 = str4;
                                        str10 = str3;
                                        z10 = z9;
                                        i12 = i10 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z9 = true;
                                }
                            } else {
                                try {
                                    c6.close();
                                } catch (Exception e15) {
                                    e = e15;
                                    Log.d(str3, "POST " + str5.split(str4)[0] + " EX " + e.getMessage());
                                    bVar.f3250e = "POST " + str5.split(str4)[0] + " EX " + e.getMessage();
                                    str9 = str5;
                                    str11 = str4;
                                    str10 = str3;
                                    z10 = z9;
                                    i12 = i10 + 1;
                                }
                                str9 = str5;
                                str11 = str4;
                                str10 = str3;
                                z10 = z9;
                                i12 = i10 + 1;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    th = th4;
                    Throwable th5 = th;
                    try {
                        c6.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject p(String str, int i10, String str2) {
        return m(k("/wefeed-mobile-bff/tab/ranking-list?tabId=" + str + "&categoryType=" + str2 + "&page=" + i10 + "&perPage=20&restrictKid=0"));
    }

    public final JSONObject q(String str, String str2) {
        return m(k("/wefeed-mobile-bff/subject-api/get-stream-captions?host=" + f(c()) + "&subjectId=" + f(str) + "&streamId=" + f(str2)));
    }

    public final String r() {
        String string;
        Context context = this.f3247b;
        synchronized (w7.b.class) {
            string = context.getApplicationContext().getSharedPreferences("pistream_moviebox", 0).getString("bearer_token", "");
        }
        return string;
    }

    public final JSONObject s(String str, String str2, int i10, int i11, String str3) {
        d0 c6;
        f0 f0Var;
        if (str != null && !str.isEmpty() && str2 != null) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            StringBuilder a10 = j.a(str, "/wefeed-h5api-bff/subject/play?subjectId=");
            a10.append(f(str2));
            a10.append("&se=");
            a10.append(i10);
            a10.append("&ep=");
            a10.append(i11);
            a10.append("&detailPath=");
            a10.append(str3);
            a10.append("&streamSignType=1&supportCodecs%5Bhevc%5D=1&supportCodecs%5Bh264%5D=1");
            String sb = a10.toString();
            String str4 = str + "/movies/" + str3 + "?id=" + f(str2) + "&type=/movie/detail&detailSe=&detailEp=&lang=en";
            String r8 = r();
            for (int i12 = 0; i12 < 2; i12++) {
                try {
                    y yVar = new y();
                    yVar.d(sb);
                    yVar.c("GET", null);
                    yVar.b("User-Agent", "Mozilla/5.0 (Linux; Android 15; Pixel 9) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/154.0.0.0 Mobile Safari/537.36");
                    yVar.b("Referer", str4);
                    yVar.b("Accept", "application/json");
                    yVar.b("x-client-info", "{\"timezone\":\"Asia/Calcutta\"}");
                    yVar.b("x-request-lang", "en");
                    yVar.b("x-vip-restrict", "");
                    yVar.b("x-no-high-risk-restrict", "");
                    yVar.b("x-source", "");
                    if (c.b(r8)) {
                        yVar.b("Authorization", "Bearer " + r8);
                    }
                    androidx.appcompat.widget.w a11 = yVar.a();
                    w wVar = this.f3246a;
                    wVar.getClass();
                    c6 = new i(wVar, a11, false).c();
                    try {
                        f0Var = c6.f11697x;
                    } finally {
                    }
                } catch (Exception e10) {
                    this.f3250e = "webPlay EX " + e10.getMessage();
                }
                if (f0Var == null) {
                    c6.close();
                    return null;
                }
                String q9 = f0Var.q();
                a(c6.f11696f);
                j();
                if (c6.f11694d != 200) {
                    this.f3250e = "webPlay code=" + c6.f11694d;
                    int i13 = c6.f11694d;
                    if ((i13 == 401 || i13 == 441) && i12 == 0) {
                        r8 = g(true);
                        c6.close();
                    } else {
                        c6.close();
                        return null;
                    }
                } else {
                    JSONObject jSONObject = new JSONObject(q9);
                    if (jSONObject.has("data") && (jSONObject.opt("data") instanceof JSONObject)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        c6.close();
                        return optJSONObject;
                    }
                    JSONObject m5 = m(q9);
                    c6.close();
                    return m5;
                }
            }
        }
        return null;
    }
}
