package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uu7 extends bu7 {
    public static final Object[] H;
    public static final uu7 I;
    public final transient Object[] C;
    public final transient int D;
    public final transient Object[] E;
    public final transient int F;
    public final transient int G;

    static {
        Object[] objArr = new Object[0];
        H = objArr;
        I = new uu7(0, 0, 0, objArr, objArr);
    }

    public uu7(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 1);
        this.C = objArr;
        this.D = i;
        this.E = objArr2;
        this.F = i2;
        this.G = i3;
    }

    @Override // defpackage.ne7
    public final Object[] b() {
        return this.C;
    }

    @Override // defpackage.ne7
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.E;
            if (objArr.length != 0) {
                int l = hz5.l(obj.hashCode());
                while (true) {
                    int i = l & this.F;
                    Object obj2 = objArr[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return true;
                        }
                        l = i + 1;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // defpackage.ne7
    public final int d() {
        return this.G;
    }

    @Override // defpackage.ne7
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.C;
        int i = this.G;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.bu7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        st7 st7Var = this.A;
        if (st7Var == null) {
            st7Var = st7.h(this.C, this.G);
            this.A = st7Var;
        }
        return st7Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.G;
    }
}
