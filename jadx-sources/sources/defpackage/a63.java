package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class a63 implements Iterator, j73 {
    public final y43 x;
    public final qy4 y;
    public final ne1 z;

    public a63(y43 y43Var, qy4 qy4Var, ne1 ne1Var) {
        this.x = y43Var;
        this.y = qy4Var;
        this.z = ne1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y.z() != 10) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ne1 ne1Var = this.z;
        return new zy5(this.x, i97.z, this.y, ne1Var.getDescriptor(), null).f(ne1Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
