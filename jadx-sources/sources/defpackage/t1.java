package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class t1 extends j2 implements Serializable {
    public final transient Map B;
    public transient int C;

    public t1(Map map) {
        io3.n(map.isEmpty());
        this.B = map;
    }

    @Override // defpackage.j2
    public final void b() {
        Map map = this.B;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.C = 0;
    }

    @Override // defpackage.j2
    public Map d() {
        return new x1(this, this.B);
    }

    @Override // defpackage.j2
    public Set f() {
        return new y1(this, this.B);
    }

    @Override // defpackage.j2
    public final Collection g() {
        return super.g();
    }

    @Override // defpackage.j2
    public final Iterator h() {
        return new u1(this, (byte) 1);
    }

    @Override // defpackage.j2
    public final int l() {
        return this.C;
    }

    public abstract Collection m();

    @Override // defpackage.j2
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final List i(Object obj) {
        Collection collection = (Collection) this.B.get(obj);
        if (collection == null) {
            collection = m();
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new f2(this, obj, list, null);
        }
        return new f2(this, obj, list, null);
    }

    public final boolean o(Object obj, Object obj2) {
        Map map = this.B;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection m = m();
            if (m.add(obj2)) {
                this.C++;
                map.put(obj, m);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.C++;
            return true;
        }
        return false;
    }
}
