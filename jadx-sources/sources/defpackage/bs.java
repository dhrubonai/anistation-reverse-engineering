package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bs extends k2 {
    public static final Object[] A = new Object[0];
    public int x;
    public Object[] y;
    public int z;

    public bs(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = A;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            ze0.k(qx1.h(i, "Illegal Capacity: "));
            throw null;
        }
        this.y = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.z;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            }
            if (i == 0) {
                addFirst(obj);
                return;
            }
            n();
            f(this.z + 1);
            int m = m(this.x + i);
            int i4 = this.z;
            if (i < ((i4 + 1) >> 1)) {
                if (m == 0) {
                    Object[] objArr = this.y;
                    objArr.getClass();
                    i2 = objArr.length - 1;
                } else {
                    i2 = m - 1;
                }
                int i5 = this.x;
                if (i5 == 0) {
                    Object[] objArr2 = this.y;
                    objArr2.getClass();
                    i5 = objArr2.length;
                }
                int i6 = i5 - 1;
                int i7 = this.x;
                Object[] objArr3 = this.y;
                if (i2 >= i7) {
                    objArr3[i6] = objArr3[i7];
                    ms.x0(i7, i7 + 1, i2 + 1, objArr3, objArr3);
                } else {
                    ms.x0(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.y;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    ms.x0(0, 1, i2 + 1, objArr4, objArr4);
                }
                this.y[i2] = obj;
                this.x = i6;
            } else {
                int m2 = m(i4 + this.x);
                Object[] objArr5 = this.y;
                if (m < m2) {
                    ms.x0(m + 1, m, m2, objArr5, objArr5);
                } else {
                    ms.x0(1, 0, m2, objArr5, objArr5);
                    Object[] objArr6 = this.y;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    ms.x0(m + 1, m, objArr6.length - 1, objArr6, objArr6);
                }
                this.y[m] = obj;
            }
            this.z++;
            return;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.z;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.z) {
                return addAll(collection);
            }
            n();
            f(collection.size() + this.z);
            int m = m(this.z + this.x);
            int m2 = m(this.x + i);
            int size = collection.size();
            if (i < ((this.z + 1) >> 1)) {
                int i3 = this.x;
                int i4 = i3 - size;
                Object[] objArr = this.y;
                if (m2 >= i3) {
                    if (i4 >= 0) {
                        ms.x0(i4, i3, m2, objArr, objArr);
                    } else {
                        i4 += objArr.length;
                        int i5 = m2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            ms.x0(i4, i3, m2, objArr, objArr);
                        } else {
                            ms.x0(i4, i3, i3 + length, objArr, objArr);
                            Object[] objArr2 = this.y;
                            ms.x0(0, this.x + length, m2, objArr2, objArr2);
                        }
                    }
                } else {
                    ms.x0(i4, i3, objArr.length, objArr, objArr);
                    Object[] objArr3 = this.y;
                    if (size >= m2) {
                        ms.x0(objArr3.length - size, 0, m2, objArr3, objArr3);
                    } else {
                        ms.x0(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.y;
                        ms.x0(0, size, m2, objArr4, objArr4);
                    }
                }
                this.x = i4;
                d(j(m2 - size), collection);
                return true;
            }
            int i6 = m2 + size;
            Object[] objArr5 = this.y;
            if (m2 < m) {
                int i7 = size + m;
                if (i7 <= objArr5.length) {
                    ms.x0(i6, m2, m, objArr5, objArr5);
                } else if (i6 >= objArr5.length) {
                    ms.x0(i6 - objArr5.length, m2, m, objArr5, objArr5);
                } else {
                    int length2 = m - (i7 - objArr5.length);
                    ms.x0(0, length2, m, objArr5, objArr5);
                    Object[] objArr6 = this.y;
                    ms.x0(i6, m2, length2, objArr6, objArr6);
                }
            } else {
                ms.x0(size, 0, m, objArr5, objArr5);
                Object[] objArr7 = this.y;
                if (i6 >= objArr7.length) {
                    ms.x0(i6 - objArr7.length, m2, objArr7.length, objArr7, objArr7);
                } else {
                    ms.x0(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                    Object[] objArr8 = this.y;
                    ms.x0(i6, m2, objArr8.length - size, objArr8, objArr8);
                }
            }
            d(m2, collection);
            return true;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return false;
    }

    public final void addFirst(Object obj) {
        n();
        f(this.z + 1);
        int i = this.x;
        if (i == 0) {
            Object[] objArr = this.y;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.x = i2;
        this.y[i2] = obj;
        this.z++;
    }

    public final void addLast(Object obj) {
        n();
        f(b() + 1);
        this.y[m(b() + this.x)] = obj;
        this.z = b() + 1;
    }

    @Override // defpackage.k2
    public final int b() {
        return this.z;
    }

    @Override // defpackage.k2
    public final Object c(int i) {
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            if (i == b() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            n();
            int m = m(this.x + i);
            Object[] objArr = this.y;
            Object obj = objArr[m];
            int i3 = this.z >> 1;
            int i4 = this.x;
            if (i < i3) {
                if (m >= i4) {
                    ms.x0(i4 + 1, i4, m, objArr, objArr);
                } else {
                    ms.x0(1, 0, m, objArr, objArr);
                    Object[] objArr2 = this.y;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.x;
                    ms.x0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.y;
                int i6 = this.x;
                objArr3[i6] = null;
                this.x = h(i6);
            } else {
                int m2 = m((b() - 1) + i4);
                Object[] objArr4 = this.y;
                if (m <= m2) {
                    ms.x0(m, m + 1, m2 + 1, objArr4, objArr4);
                } else {
                    ms.x0(m, m + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.y;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    ms.x0(0, 1, m2 + 1, objArr5, objArr5);
                }
                this.y[m2] = null;
            }
            this.z--;
            return obj;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            k(this.x, m(b() + this.x));
        }
        this.x = 0;
        this.z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.y.length;
        while (i < length && it.hasNext()) {
            this.y[i] = it.next();
            i++;
        }
        int i2 = this.x;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.y[i3] = it.next();
        }
        this.z = collection.size() + this.z;
    }

    public final void f(int i) {
        if (i >= 0) {
            Object[] objArr = this.y;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == A) {
                if (i < 10) {
                    i = 10;
                }
                this.y = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            ms.x0(0, this.x, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.y;
            int length2 = objArr3.length;
            int i3 = this.x;
            ms.x0(length2 - i3, 0, i3, objArr3, objArr2);
            this.x = 0;
            this.y = objArr2;
            return;
        }
        ze0.m("Deque is too big.");
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.y[this.x];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int b = b();
        if (i >= 0 && i < b) {
            return this.y[m(this.x + i)];
        }
        ze0.g(zo5.m("index: ", ", size: ", i, b));
        return null;
    }

    public final int h(int i) {
        this.y.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.y[m((size() - 1) + this.x)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int m = m(b() + this.x);
        int i2 = this.x;
        if (i2 < m) {
            while (i2 < m) {
                if (a34.i(obj, this.y[i2])) {
                    i = this.x;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (!isEmpty() && (i2 = this.x) >= m) {
            int length = this.y.length;
            while (true) {
                if (i2 < length) {
                    if (a34.i(obj, this.y[i2])) {
                        i = this.x;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < m; i3++) {
                        if (a34.i(obj, this.y[i3])) {
                            i2 = i3 + this.y.length;
                            i = this.x;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        if (i < 0) {
            return i + this.y.length;
        }
        return i;
    }

    public final void k(int i, int i2) {
        Object[] objArr = this.y;
        if (i < i2) {
            ms.E0(i, i2, null, objArr);
        } else {
            ms.E0(i, objArr.length, null, objArr);
            ms.E0(0, i2, null, this.y);
        }
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.y[m((size() - 1) + this.x)];
        }
        p65.h("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int m = m(this.z + this.x);
        int i2 = this.x;
        if (i2 < m) {
            length = m - 1;
            if (i2 <= length) {
                while (!a34.i(obj, this.y[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.x;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.x >= m) {
            while (true) {
                m--;
                Object[] objArr = this.y;
                if (-1 < m) {
                    if (a34.i(obj, objArr[m])) {
                        length = m + this.y.length;
                        i = this.x;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.x;
                    if (i3 <= length) {
                        while (!a34.i(obj, this.y[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.x;
                    }
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int m(int i) {
        Object[] objArr = this.y;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.y.length != 0) {
            int m2 = m(b() + this.x);
            int i = this.x;
            if (i < m2) {
                m = i;
                while (true) {
                    objArr = this.y;
                    if (i >= m2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.y[m] = obj;
                        m++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ms.E0(m, m2, null, objArr);
            } else {
                int length = this.y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m = m(i2);
                for (int i3 = 0; i3 < m2; i3++) {
                    Object[] objArr3 = this.y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.y[m] = obj3;
                        m = h(m);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.z = j(m - this.x);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            n();
            Object[] objArr = this.y;
            int i = this.x;
            Object obj = objArr[i];
            objArr[i] = null;
            this.x = h(i);
            this.z = b() - 1;
            return obj;
        }
        p65.h("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            n();
            int m = m((size() - 1) + this.x);
            Object[] objArr = this.y;
            Object obj = objArr[m];
            objArr[m] = null;
            this.z = b() - 1;
            return obj;
        }
        p65.h("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        db.v(i, i2, this.z);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.z) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        n();
        int i4 = this.z - i2;
        int i5 = this.x;
        if (i < i4) {
            int m = m((i - 1) + i5);
            int m2 = m(this.x + (i2 - 1));
            while (i > 0) {
                int i6 = m + 1;
                int min = Math.min(i, Math.min(i6, m2 + 1));
                Object[] objArr = this.y;
                int i7 = m2 - min;
                int i8 = m - min;
                ms.x0(i7 + 1, i8 + 1, i6, objArr, objArr);
                m = j(i8);
                m2 = j(i7);
                i -= min;
            }
            int m3 = m(this.x + i3);
            k(this.x, m3);
            this.x = m3;
        } else {
            int m4 = m(i5 + i2);
            int m5 = m(this.x + i);
            int i9 = this.z;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.y;
                i2 = Math.min(i9, Math.min(objArr2.length - m4, objArr2.length - m5));
                Object[] objArr3 = this.y;
                int i10 = m4 + i2;
                ms.x0(m5, m4, i10, objArr3, objArr3);
                m4 = m(i10);
                m5 = m(m5 + i2);
            }
            int m6 = m(this.z + this.x);
            k(j(m6 - i3), m6);
        }
        this.z -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.y.length != 0) {
            int m2 = m(b() + this.x);
            int i = this.x;
            if (i < m2) {
                m = i;
                while (true) {
                    objArr = this.y;
                    if (i >= m2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.y[m] = obj;
                        m++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ms.E0(m, m2, null, objArr);
            } else {
                int length = this.y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m = m(i2);
                for (int i3 = 0; i3 < m2; i3++) {
                    Object[] objArr3 = this.y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.y[m] = obj3;
                        m = h(m);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.z = j(m - this.x);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int b = b();
        if (i >= 0 && i < b) {
            int m = m(this.x + i);
            Object[] objArr = this.y;
            Object obj2 = objArr[m];
            objArr[m] = obj;
            return obj2;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, b));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.z;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int m = m(this.z + this.x);
        int i2 = this.x;
        if (i2 < m) {
            ms.B0(i2, m, 2, this.y, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.y;
            ms.x0(0, this.x, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.y;
            ms.x0(objArr3.length - this.x, 0, m, objArr3, objArr);
        }
        int i3 = this.z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public bs() {
        this.y = A;
    }

    public bs(bo3 bo3Var) {
        Object[] N = v94.N(bo3Var, new Object[0]);
        this.y = N;
        this.z = N.length;
        if (N.length == 0) {
            this.y = A;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        f(collection.size() + b());
        d(m(b() + this.x), collection);
        return true;
    }
}
