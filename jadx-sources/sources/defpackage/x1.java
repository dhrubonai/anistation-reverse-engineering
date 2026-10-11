package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class x1 extends AbstractMap {
    public final /* synthetic */ t1 A;
    public transient v1 x;
    public transient i2 y;
    public final transient Map z;

    public x1(t1 t1Var, Map map) {
        this.A = t1Var;
        this.z = map;
    }

    public final hw2 a(Map.Entry entry) {
        f2 f2Var;
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        t1 t1Var = this.A;
        if (z) {
            f2Var = new f2(t1Var, key, list, null);
        } else {
            f2Var = new f2(t1Var, key, list, null);
        }
        return new hw2(key, f2Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t1 t1Var = this.A;
        if (this.z == t1Var.B) {
            t1Var.b();
            return;
        }
        w1 w1Var = new w1(this);
        while (w1Var.hasNext()) {
            w1Var.next();
            w1Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.z;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        v1 v1Var = this.x;
        if (v1Var == null) {
            v1 v1Var2 = new v1(this, (byte) 0);
            this.x = v1Var2;
            return v1Var2;
        }
        return v1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.z.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        f2 f2Var;
        Map map = this.z;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        t1 t1Var = this.A;
        if (z) {
            f2Var = new f2(t1Var, obj, list, null);
        } else {
            f2Var = new f2(t1Var, obj, list, null);
        }
        return f2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.z.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.A.j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.z.remove(obj);
        if (collection == null) {
            return null;
        }
        t1 t1Var = this.A;
        Collection m = t1Var.m();
        m.addAll(collection);
        t1Var.C -= collection.size();
        collection.clear();
        return m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.z.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.z.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        i2 i2Var = this.y;
        if (i2Var == null) {
            i2 i2Var2 = new i2(this);
            this.y = i2Var2;
            return i2Var2;
        }
        return i2Var;
    }
}
