package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class oi6 implements Iterator, j73 {
    public final Iterator x;
    public final /* synthetic */ u22 y;

    public oi6(u22 u22Var) {
        this.y = u22Var;
        this.x = ((ni5) u22Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((ub2) this.y.c).invoke(this.x.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
