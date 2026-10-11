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
public final class ai3 extends k2 implements RandomAccess, Serializable {
    public static final ai3 A;
    public Object[] x;
    public int y;
    public boolean z;

    static {
        ai3 ai3Var = new ai3(0);
        ai3Var.z = true;
        A = ai3Var;
    }

    public ai3(int i) {
        if (i >= 0) {
            this.x = new Object[i];
        } else {
            ze0.k("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            i(i, 1);
            this.x[i] = obj;
            return;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            f(i, collection, size);
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
        return this.y;
    }

    @Override // defpackage.k2
    public final Object c(int i) {
        h();
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return j(i);
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.y);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.x;
                int i = this.y;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (a34.i(objArr[i2], list.get(i2))) {
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
        i(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.x[i + i3] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.x[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return this.x[i];
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    public final void h() {
        if (!this.z) {
            return;
        }
        ze0.d();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.x;
        int i2 = this.y;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
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

    public final void i(int i, int i2) {
        int i3 = this.y + i2;
        if (i3 >= 0) {
            Object[] objArr = this.x;
            if (i3 > objArr.length) {
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 2147483639;
                    }
                }
                objArr = Arrays.copyOf(objArr, i4);
                this.x = objArr;
            }
            ms.x0(i + i2, i, this.y, objArr, objArr);
            this.y += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.y; i++) {
            if (a34.i(this.x[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.x;
        Object obj = objArr[i];
        ms.x0(i, i + 1, this.y, objArr, objArr);
        Object[] objArr2 = this.x;
        int i2 = this.y - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.y--;
        return obj;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.x;
        ms.x0(i, i + i2, this.y, objArr, objArr);
        Object[] objArr2 = this.x;
        int i3 = this.y;
        m37.H(objArr2, i3 - i2, i3);
        this.y -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.y - 1; i >= 0; i--) {
            if (a34.i(this.x[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            return new gl2(this, i);
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    public final int m(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.x;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.x;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ms.x0(i + i4, i2 + i, this.y, objArr, objArr);
        Object[] objArr3 = this.x;
        int i7 = this.y;
        m37.H(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.y -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        h();
        if (m(0, this.y, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        if (m(0, this.y, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.x;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        db.v(i, i2, this.y);
        return new zh3(this.x, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.y;
        Object[] objArr2 = this.x;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ms.x0(0, 0, i, objArr2, objArr);
        int i2 = this.y;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m37.K(this.x, 0, this.y, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.y;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.x[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ms.D0(this.x, 0, this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.y, collection, size);
        return size > 0;
    }
}
