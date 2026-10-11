package r6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class x1 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f9569a;

    /* renamed from: b, reason: collision with root package name */
    public final q6.h f9570b;

    public x1(Set set, q6.h hVar) {
        this.f9569a = set;
        this.f9570b = hVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        if (this.f9570b.apply(obj)) {
            return this.f9569a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f9570b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f9569a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f9569a;
        boolean z9 = collection instanceof RandomAccess;
        q6.h hVar = this.f9570b;
        if (z9 && (collection instanceof List)) {
            List list = (List) collection;
            hVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!hVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            h0.I0(list, hVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            h0.I0(list, hVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        hVar.getClass();
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        boolean z9;
        Collection collection = this.f9569a;
        collection.getClass();
        try {
            z9 = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return this.f9570b.apply(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return h0.P(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f9569a.iterator();
        q6.h hVar = this.f9570b;
        if (hVar != null) {
            boolean z9 = false;
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (hVar.apply(it.next())) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                z9 = true;
            }
            return true ^ z9;
        }
        throw new NullPointerException("predicate");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f9569a.iterator();
        it.getClass();
        q6.h hVar = this.f9570b;
        hVar.getClass();
        return new u0(it, hVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return h0.d0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f9569a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f9569a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9570b.apply(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f9569a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f9570b.apply(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f9569a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f9570b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                arrayList.add(bVar.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                arrayList.add(bVar.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
