package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j2 {
    public transient Map A;
    public transient Collection x;
    public transient Set y;
    public transient Collection z;

    public Map a() {
        Map map = this.A;
        if (map == null) {
            Map d = d();
            this.A = d;
            return d;
        }
        return map;
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        throw new AssertionError("should never be called");
    }

    public Collection e() {
        return new i2(this, (byte) 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            return a().equals(((j2) obj).a());
        }
        return false;
    }

    public Set f() {
        throw new AssertionError("unreachable");
    }

    public Collection g() {
        Collection collection = this.x;
        if (collection == null) {
            Collection e = e();
            this.x = e;
            return e;
        }
        return collection;
    }

    public abstract Iterator h();

    public final int hashCode() {
        return a().hashCode();
    }

    public abstract Collection i(Object obj);

    public Set j() {
        Set set = this.y;
        if (set == null) {
            Set f = f();
            this.y = f;
            return f;
        }
        return set;
    }

    public boolean k(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public abstract int l();

    public final String toString() {
        return a().toString();
    }
}
