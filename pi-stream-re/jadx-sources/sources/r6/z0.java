package r6;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z0 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f9578a;

    /* renamed from: b, reason: collision with root package name */
    public final q6.f f9579b;

    public z0(h3.e eVar, List list) {
        list.getClass();
        this.f9578a = list;
        this.f9579b = eVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new x0(this, this.f9578a.listIterator(i10), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f9578a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9578a.size();
    }
}
