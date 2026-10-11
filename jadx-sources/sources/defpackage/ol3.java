package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ol3 implements Iterator, j73 {
    public final long x;
    public boolean y;
    public long z;

    public ol3(long j, long j2) {
        boolean z;
        this.x = j2;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        this.y = z;
        this.z = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.z;
        if (j == this.x) {
            if (this.y) {
                this.y = false;
            } else {
                qi2.e();
                return null;
            }
        } else {
            this.z = 1 + j;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
