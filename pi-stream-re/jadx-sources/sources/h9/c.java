package h9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import r6.h0;
import x6.p;
import y8.w;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f5161a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5162b;

    static {
        String str;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = w.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(w.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(f9.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(b9.f.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(linkedHashMap);
            } else {
                map = h0.Y0(linkedHashMap);
            }
        } else {
            map = p.f11319a;
        }
        f5162b = map;
    }
}
