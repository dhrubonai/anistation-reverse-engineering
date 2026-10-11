package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class f2 extends AbstractCollection implements List {
    public final Collection A;
    public final /* synthetic */ t1 B;
    public final /* synthetic */ t1 C;
    public final Object x;
    public Collection y;
    public final f2 z;

    public f2(t1 t1Var, Object obj, List list, f2 f2Var) {
        Collection collection;
        this.C = t1Var;
        this.B = t1Var;
        this.x = obj;
        this.y = list;
        this.z = f2Var;
        if (f2Var == null) {
            collection = null;
        } else {
            collection = f2Var.y;
        }
        this.A = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.y.isEmpty();
        boolean add = this.y.add(obj);
        if (add) {
            this.B.C++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.y).addAll(i, collection);
        if (addAll) {
            this.C.C += this.y.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        f2 f2Var = this.z;
        if (f2Var != null) {
            f2Var.b();
        } else {
            this.B.B.put(this.x, this.y);
        }
    }

    public final void c() {
        Collection collection;
        f2 f2Var = this.z;
        if (f2Var != null) {
            f2Var.c();
            if (f2Var.y != this.A) {
                ze0.j();
                return;
            }
            return;
        }
        if (this.y.isEmpty() && (collection = (Collection) this.B.B.get(this.x)) != null) {
            this.y = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.y.clear();
        this.B.C -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.y.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.y.containsAll(collection);
    }

    public final void d() {
        f2 f2Var = this.z;
        if (f2Var != null) {
            f2Var.d();
        } else if (this.y.isEmpty()) {
            this.B.B.remove(this.x);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.y.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.y).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.y.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.y).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new w1(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.y).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new e2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.y.remove(obj);
        if (remove) {
            t1 t1Var = this.B;
            t1Var.C--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.y.removeAll(collection);
        if (removeAll) {
            this.B.C += this.y.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.y.retainAll(collection);
        if (retainAll) {
            this.B.C += this.y.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.y).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.y.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List subList = ((List) this.y).subList(i, i2);
        f2 f2Var = this.z;
        if (f2Var == null) {
            f2Var = this;
        }
        boolean z = subList instanceof RandomAccess;
        t1 t1Var = this.C;
        Object obj = this.x;
        if (z) {
            return new f2(t1Var, obj, subList, f2Var);
        }
        return new f2(t1Var, obj, subList, f2Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.y.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new e2(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object remove = ((List) this.y).remove(i);
        t1 t1Var = this.C;
        t1Var.C--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean isEmpty = this.y.isEmpty();
        ((List) this.y).add(i, obj);
        this.C.C++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.y.addAll(collection);
        if (addAll) {
            this.B.C += this.y.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }
}
