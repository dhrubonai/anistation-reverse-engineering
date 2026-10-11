package r6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9500a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f9501b;

    /* renamed from: c, reason: collision with root package name */
    public final o f9502c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f9503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f9504e;

    public o(c cVar, Object obj, Collection collection, o oVar) {
        Collection collection2;
        this.f9504e = cVar;
        this.f9500a = obj;
        this.f9501b = collection;
        this.f9502c = oVar;
        if (oVar == null) {
            collection2 = null;
        } else {
            collection2 = oVar.f9501b;
        }
        this.f9503d = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f9501b.isEmpty();
        boolean add = this.f9501b.add(obj);
        if (add) {
            this.f9504e.f9444e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f9501b.addAll(collection);
        if (addAll) {
            this.f9504e.f9444e += this.f9501b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        o oVar = this.f9502c;
        if (oVar != null) {
            oVar.b();
        } else {
            this.f9504e.f9443d.put(this.f9500a, this.f9501b);
        }
    }

    public final void c() {
        Collection collection;
        o oVar = this.f9502c;
        if (oVar != null) {
            oVar.c();
            if (oVar.f9501b != this.f9503d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f9501b.isEmpty() && (collection = (Collection) this.f9504e.f9443d.get(this.f9500a)) != null) {
            this.f9501b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f9501b.clear();
        this.f9504e.f9444e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f9501b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f9501b.containsAll(collection);
    }

    public final void d() {
        o oVar = this.f9502c;
        if (oVar != null) {
            oVar.d();
        } else if (this.f9501b.isEmpty()) {
            this.f9504e.f9443d.remove(this.f9500a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f9501b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f9501b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f9501b.remove(obj);
        if (remove) {
            c cVar = this.f9504e;
            cVar.f9444e--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f9501b.removeAll(collection);
        if (removeAll) {
            this.f9504e.f9444e += this.f9501b.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f9501b.retainAll(collection);
        if (retainAll) {
            this.f9504e.f9444e += this.f9501b.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f9501b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f9501b.toString();
    }
}
