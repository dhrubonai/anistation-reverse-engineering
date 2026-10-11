package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class io6 implements ListIterator {
    public ListIterator x;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.x.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.x.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.x.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.x.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.x.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.x.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
