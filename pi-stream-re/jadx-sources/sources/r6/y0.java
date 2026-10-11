package r6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class y0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f9574a;

    /* renamed from: b, reason: collision with root package name */
    public final q6.f f9575b;

    public y0(h3.e eVar, List list) {
        list.getClass();
        this.f9574a = list;
        this.f9575b = eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f9575b.apply(this.f9574a.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f9574a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new x0(this, this.f9574a.listIterator(i10), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.f9575b.apply(this.f9574a.remove(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f9574a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9574a.size();
    }
}
