package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c32 implements Iterator, j73 {
    public final /* synthetic */ d32 A;
    public final Iterator x;
    public int y = -1;
    public Object z;

    public c32(d32 d32Var) {
        this.A = d32Var;
        this.x = d32Var.a.iterator();
    }

    public final void a() {
        Object next;
        d32 d32Var;
        do {
            Iterator it = this.x;
            if (it.hasNext()) {
                next = it.next();
                d32Var = this.A;
            } else {
                this.y = 0;
                return;
            }
        } while (((Boolean) d32Var.c.invoke(next)).booleanValue() != d32Var.b);
        this.z = next;
        this.y = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y == -1) {
            a();
        }
        if (this.y == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.y == -1) {
            a();
        }
        if (this.y != 0) {
            Object obj = this.z;
            this.z = null;
            this.y = -1;
            return obj;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
