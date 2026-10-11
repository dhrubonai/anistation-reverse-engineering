package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ri5 implements Iterator, vz0, j73 {
    public byte x;
    public Object y;
    public vz0 z;

    public final RuntimeException b() {
        byte b = this.x;
        if (b != 4) {
            if (b != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + ((int) this.x));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void d(vz0 vz0Var, Object obj) {
        this.y = obj;
        this.x = (byte) 3;
        this.z = vz0Var;
        vz0Var.getClass();
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return it1.x;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b;
        while (true) {
            b = this.x;
            if (b != 0) {
                break;
            }
            this.x = (byte) 5;
            vz0 vz0Var = this.z;
            vz0Var.getClass();
            this.z = null;
            vz0Var.resumeWith(pn6.a);
        }
        if (b != 1) {
            if (b == 2 || b == 3) {
                return true;
            }
            if (b == 4) {
                return false;
            }
            throw b();
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.x;
        if (b != 0 && b != 1) {
            if (b != 2) {
                if (b == 3) {
                    this.x = (byte) 0;
                    Object obj = this.y;
                    this.y = null;
                    return obj;
                }
                throw b();
            }
            this.x = (byte) 1;
            throw null;
        }
        if (hasNext()) {
            return next();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        m37.N(obj);
        this.x = (byte) 4;
    }
}
