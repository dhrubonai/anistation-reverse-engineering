package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sb8 implements Iterator {
    public final /* synthetic */ tb8 A;
    public final ia8 x;
    public int y;
    public int z;

    public /* synthetic */ sb8(tb8 tb8Var, ia8 ia8Var, int i) {
        this.A = tb8Var;
        this.x = ia8Var;
        int i2 = i & 31;
        this.y = i2;
        this.z = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object k;
        int i = this.y;
        tb8 tb8Var = this.A;
        rv5 rv5Var = tb8Var.b;
        int h = rv5Var.h();
        if (i >= h) {
            k = tb8Var.c.k(i - h);
        } else {
            k = rv5Var.k(i);
        }
        Object cast = this.x.b.cast(k);
        int i2 = this.z;
        if (i2 != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
            this.z >>>= numberOfTrailingZeros;
            this.y += numberOfTrailingZeros;
            return cast;
        }
        this.y = -1;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
