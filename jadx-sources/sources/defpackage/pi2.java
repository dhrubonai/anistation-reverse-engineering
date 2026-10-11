package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pi2 implements Iterator, j73 {
    public final int A;
    public final yr5 x;
    public final int y;
    public int z;

    public pi2(yr5 yr5Var, int i, int i2) {
        this.x = yr5Var;
        this.y = i2;
        this.z = i;
        this.A = yr5Var.E;
        if (yr5Var.D) {
            as5.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.z < this.y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        yr5 yr5Var = this.x;
        int i = yr5Var.E;
        int i2 = this.A;
        if (i != i2) {
            as5.e();
        }
        int i3 = this.z;
        this.z = yr5Var.x[(i3 * 5) + 3] + i3;
        return new zr5(yr5Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
