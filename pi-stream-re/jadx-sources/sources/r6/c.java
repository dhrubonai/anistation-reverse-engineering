package r6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c extends t implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f9443d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f9444e;

    public c(Map map) {
        if (map.isEmpty()) {
            this.f9443d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // r6.t
    public final Map a() {
        Map map = this.f9537c;
        if (map == null) {
            g c6 = c();
            this.f9537c = c6;
            return c6;
        }
        return map;
    }

    public final void b() {
        Map map = this.f9443d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f9444e = 0;
    }

    public abstract g c();

    public abstract Collection d();

    public abstract i e();

    @Override // r6.t
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f(Object obj, Object obj2) {
        Map map = this.f9443d;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection d10 = d();
            if (d10.add(obj2)) {
                this.f9444e++;
                map.put(obj, d10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f9444e++;
            return true;
        }
        return false;
    }
}
