package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rw2 implements Map, Serializable {
    public transient zw2 x;
    public transient zw2 y;
    public transient gw2 z;

    public static eb2 a() {
        return new eb2(4);
    }

    public static rw2 b(Map map) {
        int i;
        if ((map instanceof rw2) && !(map instanceof SortedMap)) {
            rw2 rw2Var = (rw2) map;
            if (!rw2Var.g()) {
                return rw2Var;
            }
        }
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        eb2 eb2Var = new eb2(i);
        eb2Var.C(entrySet);
        return eb2Var.e(true);
    }

    public abstract zw2 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract zw2 d();

    public gw2 e() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return t80.F(obj, this);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public zw2 entrySet() {
        zw2 zw2Var = this.x;
        if (zw2Var == null) {
            zw2 c = c();
            this.x = c;
            return c;
        }
        return zw2Var;
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public zw2 keySet() {
        zw2 zw2Var = this.y;
        if (zw2Var == null) {
            zw2 d = d();
            this.y = d;
            return d;
        }
        return zw2Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return bb4.G(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public gw2 values() {
        gw2 gw2Var = this.z;
        if (gw2Var == null) {
            gw2 e = e();
            this.z = e;
            return e;
        }
        return gw2Var;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        io3.t(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
