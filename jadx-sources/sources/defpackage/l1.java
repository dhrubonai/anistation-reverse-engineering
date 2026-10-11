package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class l1 implements Iterator, j73 {
    public byte x;
    public Object y;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        if (b != 0) {
            if (b == 1) {
                return true;
            }
            if (b == 2) {
                return false;
            }
            ze0.k("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
        this.x = (byte) 3;
        a();
        if (this.x != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        if (b == 1) {
            this.x = (byte) 0;
            return this.y;
        }
        if (b != 2) {
            this.x = (byte) 3;
            a();
            if (this.x == 1) {
                this.x = (byte) 0;
                return this.y;
            }
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
