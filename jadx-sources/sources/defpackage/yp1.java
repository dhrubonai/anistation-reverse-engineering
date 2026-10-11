package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yp1 implements Iterator, j73 {
    public final /* synthetic */ byte x = 1;
    public final Iterator y;
    public int z;

    public yp1(zp1 zp1Var, byte b) {
        this.z = zp1Var.c;
        this.y = zp1Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Iterator it = this.y;
        switch (b) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                if (this.z > 0 && it.hasNext()) {
                    return true;
                }
                return false;
        }
        while (this.z > 0 && it.hasNext()) {
            it.next();
            this.z--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Iterator it = this.y;
        switch (b) {
            case 0:
                break;
            case 1:
                int i = this.z;
                this.z = i + 1;
                if (i >= 0) {
                    return new xx2(i, it.next());
                }
                te4.R();
                throw null;
            default:
                int i2 = this.z;
                if (i2 != 0) {
                    this.z = i2 - 1;
                    return it.next();
                }
                qi2.e();
                return null;
        }
        while (this.z > 0 && it.hasNext()) {
            it.next();
            this.z--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public yp1(Iterator it) {
        it.getClass();
        this.y = it;
    }

    public yp1(zp1 zp1Var) {
        this.y = zp1Var.b.iterator();
        this.z = zp1Var.c;
    }
}
