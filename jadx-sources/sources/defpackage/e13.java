package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class e13 implements Iterator, j73 {
    public int A;
    public final int x;
    public final int y;
    public boolean z;

    public e13(int i, int i2, int i3) {
        this.x = i3;
        this.y = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.z = z;
        this.A = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.A;
        if (i == this.y) {
            if (this.z) {
                this.z = false;
                return i;
            }
            qi2.e();
            return 0;
        }
        this.A = this.x + i;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
