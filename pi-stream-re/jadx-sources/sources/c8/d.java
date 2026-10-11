package c8;

import android.net.Uri;
import android.util.Log;
import c9.i;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import y8.d0;
import y8.f0;
import y8.v;
import y8.w;
import y8.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2089b = {"https://pistream.pages.dev/version.json"};

    /* renamed from: a, reason: collision with root package name */
    public final w f2090a;

    public d(w wVar) {
        if (wVar == null) {
            v vVar = new v();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            vVar.a(10L, timeUnit);
            vVar.b(10L, timeUnit);
            vVar.f11812h = true;
            vVar.f11813i = true;
            wVar = new w(vVar);
        }
        this.f2090a = wVar;
    }

    public static c b(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c cVar = new c();
                ArrayList arrayList = cVar.f2087e;
                cVar.f2083a = jSONObject.optInt("versionCode", 0);
                cVar.f2084b = jSONObject.optString("version", jSONObject.optString("versionName", ""));
                cVar.f2085c = jSONObject.optString("note", jSONObject.optString("changelog", ""));
                String optString = jSONObject.optString("apk_url", jSONObject.optString("apkUrl", ""));
                if (optString == null) {
                    str2 = "";
                } else {
                    str2 = optString.trim();
                }
                cVar.f2086d = str2;
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("apk_mirrors");
                    if (optJSONArray == null) {
                        optJSONArray = jSONObject.optJSONArray("apkMirrors");
                    }
                    if (optJSONArray != null) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            String trim = optJSONArray.optString(i10, "").trim();
                            if (!trim.isEmpty() && !trim.equals(cVar.f2086d) && !arrayList.contains(trim)) {
                                arrayList.add(trim);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                jSONObject.optLong("apk_size", jSONObject.optLong("apkSize", 0L));
                cVar.f2088f = jSONObject.optBoolean("force", true);
                if (cVar.f2083a <= 0 && cVar.f2084b != null) {
                    try {
                        Uri.parse("x://" + cVar.f2084b.replace('.', '/'));
                        String str3 = cVar.f2084b;
                        cVar.f2083a = Integer.parseInt(str3.substring(str3.lastIndexOf(46) + 1).replaceAll("[^0-9]", ""));
                    } catch (Exception unused2) {
                    }
                }
                if (cVar.f2083a <= 0) {
                    return null;
                }
                return cVar;
            } catch (Exception e10) {
                Log.e("UpdateApi", "parse", e10);
            }
        }
        return null;
    }

    public final c a() {
        f0 f0Var;
        c b10;
        String str;
        String str2 = f2089b[0];
        if (str2 != null && str2.startsWith("https://")) {
            try {
                y yVar = new y();
                yVar.d(str2);
                yVar.b("Accept", "application/json");
                yVar.b("User-Agent", "PiStream");
                yVar.c("GET", null);
                androidx.appcompat.widget.w a10 = yVar.a();
                w wVar = this.f2090a;
                wVar.getClass();
                d0 c6 = new i(wVar, a10, false).c();
                try {
                    if (c6.f() && (f0Var = c6.f11697x) != null && (b10 = b(f0Var.q())) != null && b10.f2083a > 0 && (str = b10.f2086d) != null) {
                        if (str.startsWith("https://")) {
                            c6.close();
                            return b10;
                        }
                    }
                    c6.close();
                } finally {
                }
            } catch (Exception e10) {
                Log.e("UpdateApi", "fetch", e10);
            }
        }
        return null;
    }
}
