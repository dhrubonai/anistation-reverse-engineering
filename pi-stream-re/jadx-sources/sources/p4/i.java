package p4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8567a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f8568b;

    /* renamed from: c, reason: collision with root package name */
    public long f8569c;

    public i(long j4) {
        this.f8568b = j4;
    }

    public final synchronized Object a(Object obj) {
        Object obj2;
        h hVar = (h) this.f8567a.get(obj);
        if (hVar != null) {
            obj2 = hVar.f8565a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        h hVar;
        int b10 = b(obj2);
        long j4 = b10;
        Object obj3 = null;
        if (j4 >= this.f8568b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f8569c += j4;
        }
        LinkedHashMap linkedHashMap = this.f8567a;
        if (obj2 == null) {
            hVar = null;
        } else {
            hVar = new h(obj2, b10);
        }
        h hVar2 = (h) linkedHashMap.put(obj, hVar);
        if (hVar2 != null) {
            this.f8569c -= hVar2.f8566b;
            if (!hVar2.f8565a.equals(obj2)) {
                c(obj, hVar2.f8565a);
            }
        }
        e(this.f8568b);
        if (hVar2 != null) {
            obj3 = hVar2.f8565a;
        }
        return obj3;
    }

    public final synchronized void e(long j4) {
        while (this.f8569c > j4) {
            Iterator it = this.f8567a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            h hVar = (h) entry.getValue();
            this.f8569c -= hVar.f8566b;
            Object key = entry.getKey();
            it.remove();
            c(key, hVar.f8565a);
        }
    }
}
