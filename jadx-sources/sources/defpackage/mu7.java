package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mu7 extends bu7 {
    public final transient su7 C;
    public final transient Object[] D;
    public final transient int E;

    public mu7(su7 su7Var, Object[] objArr, int i) {
        super((byte) 1);
        this.C = su7Var;
        this.D = objArr;
        this.E = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.C.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ne7
    public final int f(Object[] objArr) {
        st7 st7Var = this.A;
        if (st7Var == null) {
            st7Var = i();
            this.A = st7Var;
        }
        return st7Var.f(objArr);
    }

    public final st7 i() {
        return new ku7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        st7 st7Var = this.A;
        if (st7Var == null) {
            st7Var = i();
            this.A = st7Var;
        }
        return st7Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
