package n;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f7861a;

    public d(e eVar) {
        this.f7861a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7861a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f7861a.g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7861a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f7861a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f7861a;
        int g10 = eVar.g(obj);
        if (g10 >= 0) {
            eVar.j(g10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f7861a;
        int i10 = eVar.f7891c;
        int i11 = 0;
        boolean z9 = false;
        while (i11 < i10) {
            if (collection.contains(eVar.l(i11))) {
                eVar.j(i11);
                i11--;
                i10--;
                z9 = true;
            }
            i11++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f7861a;
        int i10 = eVar.f7891c;
        int i11 = 0;
        boolean z9 = false;
        while (i11 < i10) {
            if (!collection.contains(eVar.l(i11))) {
                eVar.j(i11);
                i11--;
                i10--;
                z9 = true;
            }
            i11++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7861a.f7891c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f7861a;
        int i10 = eVar.f7891c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.l(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f7861a.n(1, objArr);
    }
}
