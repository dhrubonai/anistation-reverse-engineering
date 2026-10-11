package w7;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11040a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static ArrayList f11041b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11042c = false;

    public static void a(Context context, a8.b bVar, String str, int i10) {
        if (bVar == null) {
            return;
        }
        if (str == null || str.isEmpty()) {
            str = "watching";
        }
        a8.b c6 = c(bVar);
        c6.N = str;
        c6.O = i10;
        synchronized (f11040a) {
            d(context);
            String f10 = f(c6);
            for (int i11 = 0; i11 < f11041b.size(); i11++) {
                if (f10.equals(f((a8.b) f11041b.get(i11)))) {
                    f11041b.set(i11, c6);
                    g(context);
                    return;
                }
            }
            f11041b.add(0, c6);
            g(context);
        }
    }

    public static boolean b(Context context, a8.b bVar) {
        String f10 = f(bVar);
        synchronized (f11040a) {
            d(context);
            Iterator it = f11041b.iterator();
            while (it.hasNext()) {
                if (f10.equals(f((a8.b) it.next()))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static a8.b c(a8.b bVar) {
        a8.b bVar2 = new a8.b();
        bVar2.f168a = bVar.f168a;
        bVar2.f169b = bVar.f169b;
        bVar2.f170c = bVar.f170c;
        bVar2.f171d = bVar.f171d;
        bVar2.f172e = bVar.f172e;
        bVar2.f173f = bVar.f173f;
        bVar2.f174x = bVar.f174x;
        bVar2.f175y = bVar.f175y;
        bVar2.f176z = bVar.f176z;
        bVar2.A = bVar.A;
        bVar2.B = bVar.B;
        bVar2.C = bVar.C;
        bVar2.D = bVar.D;
        bVar2.E = bVar.E;
        bVar2.N = bVar.N;
        bVar2.O = bVar.O;
        return bVar2;
    }

    public static void d(Context context) {
        if (f11042c) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(context.getApplicationContext().getSharedPreferences("pistream_my_list", 0).getString("items", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    a8.b bVar = new a8.b();
                    bVar.f168a = optJSONObject.optString("title", "");
                    bVar.f169b = optJSONObject.optString("url", "");
                    bVar.f170c = optJSONObject.optString("thumbnail", "");
                    bVar.f171d = optJSONObject.optString("description", "");
                    bVar.f172e = optJSONObject.optString("genres", "");
                    bVar.f173f = optJSONObject.optString("studio", "");
                    bVar.f174x = optJSONObject.optString("episode", "");
                    bVar.f175y = optJSONObject.optString("quality", "");
                    bVar.f176z = optJSONObject.optString("year", "");
                    bVar.A = optJSONObject.optString("banner", "");
                    bVar.B = optJSONObject.optString("status", "");
                    bVar.C = optJSONObject.optString("rating", "");
                    bVar.D = optJSONObject.optString("playbackId", "");
                    bVar.N = optJSONObject.optString("listStatus", "");
                    bVar.O = optJSONObject.optInt("episodeProgress", 0);
                    arrayList.add(bVar);
                }
            }
        } catch (Exception e10) {
            Log.e("MyListStore", "exception", e10);
        }
        f11041b = arrayList;
        f11042c = true;
    }

    public static a8.b e(Context context, a8.b bVar) {
        String f10 = f(bVar);
        synchronized (f11040a) {
            d(context);
            Iterator it = f11041b.iterator();
            while (it.hasNext()) {
                a8.b bVar2 = (a8.b) it.next();
                if (f10.equals(f(bVar2))) {
                    return c(bVar2);
                }
            }
            return null;
        }
    }

    public static String f(a8.b bVar) {
        boolean z9;
        if (bVar == null) {
            return "";
        }
        String str = bVar.D;
        boolean z10 = true;
        if (str != null && !str.trim().isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return bVar.D.trim();
        }
        String str2 = bVar.f169b;
        if (str2 == null || str2.trim().isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return bVar.f169b.trim();
        }
        String str3 = bVar.f168a;
        if (str3 == null) {
            return "";
        }
        return str3.trim();
    }

    public static void g(Context context) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = f11041b.iterator();
        while (it.hasNext()) {
            a8.b bVar = (a8.b) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                String str = bVar.f168a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("title", str);
                String str3 = bVar.f169b;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("url", str3);
                String str4 = bVar.f170c;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject.put("thumbnail", str4);
                String str5 = bVar.f171d;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("description", str5);
                String str6 = bVar.f172e;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("genres", str6);
                String str7 = bVar.f173f;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("studio", str7);
                String str8 = bVar.f174x;
                if (str8 == null) {
                    str8 = "";
                }
                jSONObject.put("episode", str8);
                String str9 = bVar.f175y;
                if (str9 == null) {
                    str9 = "";
                }
                jSONObject.put("quality", str9);
                String str10 = bVar.f176z;
                if (str10 == null) {
                    str10 = "";
                }
                jSONObject.put("year", str10);
                String str11 = bVar.A;
                if (str11 == null) {
                    str11 = "";
                }
                jSONObject.put("banner", str11);
                String str12 = bVar.B;
                if (str12 == null) {
                    str12 = "";
                }
                jSONObject.put("status", str12);
                String str13 = bVar.C;
                if (str13 == null) {
                    str13 = "";
                }
                jSONObject.put("rating", str13);
                String str14 = bVar.D;
                if (str14 == null) {
                    str14 = "";
                }
                jSONObject.put("playbackId", str14);
                String str15 = bVar.N;
                if (str15 != null) {
                    str2 = str15;
                }
                jSONObject.put("listStatus", str2);
                jSONObject.put("episodeProgress", bVar.O);
            } catch (Exception e10) {
                Log.e("MyListStore", "exception", e10);
            }
            jSONArray.put(jSONObject);
        }
        context.getApplicationContext().getSharedPreferences("pistream_my_list", 0).edit().putString("items", jSONArray.toString()).apply();
    }
}
