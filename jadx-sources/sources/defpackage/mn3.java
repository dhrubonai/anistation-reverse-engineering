package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mn3 implements Map, j73 {
    public y06 A;
    public final p44 x;
    public nv1 y;
    public nv1 z;

    public mn3(p44 p44Var) {
        this.x = p44Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.x.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.x.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        nv1 nv1Var = this.y;
        if (nv1Var != null) {
            return nv1Var;
        }
        nv1 nv1Var2 = new nv1(this.x, (byte) 0);
        this.y = nv1Var2;
        return nv1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mn3.class == obj.getClass()) {
            return this.x.equals(((mn3) obj).x);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.x.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.x.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        nv1 nv1Var = this.z;
        if (nv1Var != null) {
            return nv1Var;
        }
        nv1 nv1Var2 = new nv1(this.x, (byte) 1);
        this.z = nv1Var2;
        return nv1Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.x.e;
    }

    public final String toString() {
        return this.x.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        y06 y06Var = this.A;
        if (y06Var != null) {
            return y06Var;
        }
        y06 y06Var2 = new y06(this.x);
        this.A = y06Var2;
        return y06Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
