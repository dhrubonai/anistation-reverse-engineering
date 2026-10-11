package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class h42 implements Iterator, j73 {
    public final /* synthetic */ u22 A;
    public final Iterator x;
    public Iterator y;
    public byte z;

    public h42(u22 u22Var) {
        this.A = u22Var;
        this.x = ((Iterable) ((os) u22Var.b).b).iterator();
    }

    public final boolean a() {
        Iterator it;
        Iterator it2 = this.y;
        if (it2 != null && it2.hasNext()) {
            this.z = (byte) 1;
            return true;
        }
        do {
            Iterator it3 = this.x;
            if (it3.hasNext()) {
                it = (Iterator) yi5.x.invoke(((hi0) this.A.c).invoke(it3.next()));
            } else {
                this.z = (byte) 2;
                this.y = null;
                return false;
            }
        } while (!it.hasNext());
        this.y = it;
        this.z = (byte) 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.z;
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.z;
        if (b != 2) {
            if (b == 0 && !a()) {
                qi2.e();
                return null;
            }
            this.z = (byte) 0;
            Iterator it = this.y;
            it.getClass();
            return it.next();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
