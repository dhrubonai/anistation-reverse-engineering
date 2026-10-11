package z7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12118a = new Object();

    public static ArrayList a(Context context) {
        ArrayList arrayList;
        synchronized (f12118a) {
            arrayList = new ArrayList();
            try {
                for (Map.Entry<String, ?> entry : context.getApplicationContext().getSharedPreferences("pistream_downloads", 0).getAll().entrySet()) {
                    try {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            b a10 = b.a(new JSONObject((String) value));
                            String str = a10.f12082a;
                            if (str == null || str.isEmpty()) {
                                a10.f12082a = entry.getKey();
                            }
                            arrayList.add(a10);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
            Collections.sort(arrayList, new u.f(5));
        }
        return arrayList;
    }

    public static b b(Context context, String str) {
        synchronized (f12118a) {
            try {
                try {
                    String string = context.getApplicationContext().getSharedPreferences("pistream_downloads", 0).getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return b.a(new JSONObject(string));
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, b bVar) {
        if (bVar.f12082a == null) {
            return;
        }
        synchronized (f12118a) {
            context.getApplicationContext().getSharedPreferences("pistream_downloads", 0).edit().putString(bVar.f12082a, bVar.b().toString()).apply();
        }
    }
}
