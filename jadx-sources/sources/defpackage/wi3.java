package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wi3 implements ListIterator {
    public boolean x;
    public final /* synthetic */ ListIterator y;
    public final /* synthetic */ xi3 z;

    public wi3(xi3 xi3Var, ListIterator listIterator) {
        this.y = listIterator;
        this.z = xi3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.y;
        listIterator.add(obj);
        listIterator.previous();
        this.x = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.y.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.y;
        if (listIterator.hasPrevious()) {
            this.x = true;
            return listIterator.previous();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.z.b(this.y.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.y;
        if (listIterator.hasNext()) {
            this.x = true;
            return listIterator.next();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        io3.A("no calls to next() since the last call to remove()", this.x);
        this.y.remove();
        this.x = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        io3.B(this.x);
        this.y.set(obj);
    }
}
