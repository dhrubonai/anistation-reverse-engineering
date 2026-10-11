package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zh3 extends k2 implements RandomAccess, Serializable {
    public final zh3 A;
    public final ai3 B;
    public Object[] x;
    public final int y;
    public int z;

    public zh3(Object[] objArr, int i, int i2, zh3 zh3Var, ai3 ai3Var) {
        int i3;
        objArr.getClass();
        this.x = objArr;
        this.y = i;
        this.z = i2;
        this.A = zh3Var;
        this.B = ai3Var;
        i3 = ((AbstractList) ai3Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        int i2 = this.z;
        if (i >= 0 && i <= i2) {
            g(this.y + i, obj);
        } else {
            ze0.g(zo5.m("index: ", ", size: ", i, i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        int i2 = this.z;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            f(this.y + i, collection, size);
            if (size <= 0) {
                return false;
            }
            return true;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return false;
    }

    @Override // defpackage.k2
    public final int b() {
        h();
        return this.z;
    }

    @Override // defpackage.k2
    public final Object c(int i) {
        i();
        h();
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            return j(this.y + i);
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.y, this.z);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.x;
                int i = this.z;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (a34.i(objArr[this.y + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        ai3 ai3Var = this.B;
        zh3 zh3Var = this.A;
        if (zh3Var != null) {
            zh3Var.f(i, collection, i2);
        } else {
            ai3 ai3Var2 = ai3.A;
            ai3Var.f(i, collection, i2);
        }
        this.x = ai3Var.x;
        this.z += i2;
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        ai3 ai3Var = this.B;
        zh3 zh3Var = this.A;
        if (zh3Var != null) {
            zh3Var.g(i, obj);
        } else {
            ai3 ai3Var2 = ai3.A;
            ai3Var.g(i, obj);
        }
        this.x = ai3Var.x;
        this.z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            return this.x[this.y + i];
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    public final void h() {
        int i;
        i = ((AbstractList) this.B).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        h();
        Object[] objArr = this.x;
        int i2 = this.z;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.y + i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    public final void i() {
        if (!this.B.z) {
            return;
        }
        ze0.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.z; i++) {
            if (a34.i(this.x[this.y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        if (this.z == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object j;
        ((AbstractList) this).modCount++;
        zh3 zh3Var = this.A;
        if (zh3Var != null) {
            j = zh3Var.j(i);
        } else {
            ai3 ai3Var = ai3.A;
            j = this.B.j(i);
        }
        this.z--;
        return j;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        zh3 zh3Var = this.A;
        if (zh3Var != null) {
            zh3Var.k(i, i2);
        } else {
            ai3 ai3Var = ai3.A;
            this.B.k(i, i2);
        }
        this.z -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.z - 1; i >= 0; i--) {
            if (a34.i(this.x[this.y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        int i2 = this.z;
        if (i >= 0 && i <= i2) {
            return new gl2(this, i);
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    public final int m(int i, int i2, Collection collection, boolean z) {
        int m;
        zh3 zh3Var = this.A;
        if (zh3Var != null) {
            m = zh3Var.m(i, i2, collection, z);
        } else {
            ai3 ai3Var = ai3.A;
            m = this.B.m(i, i2, collection, z);
        }
        if (m > 0) {
            ((AbstractList) this).modCount++;
        }
        this.z -= m;
        return m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        if (m(this.y, this.z, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        if (m(this.y, this.z, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.x;
            int i3 = this.y;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        db.v(i, i2, this.z);
        return new zh3(this.x, this.y + i, i2 - i, this, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.z;
        Object[] objArr2 = this.x;
        int i2 = this.y;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ms.x0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return m37.K(this.x, this.y, this.z, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.y + this.z, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.x;
        int i = this.z;
        int i2 = this.y;
        return ms.D0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.y + this.z, collection, size);
        return size > 0;
    }
}
