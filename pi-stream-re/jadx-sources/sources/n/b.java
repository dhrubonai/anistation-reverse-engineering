package n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f7856a;

    public b(e eVar) {
        this.f7856a = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7856a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7856a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f7856a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        e eVar = this.f7856a;
        int i10 = 0;
        for (int i11 = eVar.f7891c - 1; i11 >= 0; i11--) {
            Object h10 = eVar.h(i11);
            if (h10 == null) {
                hashCode = 0;
            } else {
                hashCode = h10.hashCode();
            }
            i10 += hashCode;
        }
        return i10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7856a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f7856a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f7856a;
        int e10 = eVar.e(obj);
        if (e10 >= 0) {
            eVar.j(e10);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f7856a;
        int i10 = eVar.f7891c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.remove(it.next());
        }
        if (i10 != eVar.f7891c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f7856a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7856a.f7891c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f7856a;
        int i10 = eVar.f7891c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.h(i11);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f7856a.n(0, objArr);
    }
}
