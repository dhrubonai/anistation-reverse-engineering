package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pj6 implements Iterator, j73 {
    public Object[] x = oj6.e.d;
    public int y;
    public int z;

    public final void a(Object[] objArr, int i, int i2) {
        this.x = objArr;
        this.y = i;
        this.z = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.z < this.y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
