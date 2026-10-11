package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qf7 extends ho6 implements ListIterator {
    public final wh7 A;
    public final int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf7(wh7 wh7Var, int i) {
        super((byte) 1);
        int size = wh7Var.size();
        if (i >= 0 && i <= size) {
            this.y = size;
            this.z = i;
            this.A = wh7Var;
            return;
        }
        ze0.g(it5.k("index", i, size));
        throw null;
    }

    public final Object a(int i) {
        return this.A.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.z < this.y) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.z > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.z;
            this.z = i + 1;
            return a(i);
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.z - 1;
            this.z = i;
            return a(i);
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.z - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
