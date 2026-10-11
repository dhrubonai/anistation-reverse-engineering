package x6;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.h0;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f11313d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f11314a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f11315b = f11313d;

    /* renamed from: c, reason: collision with root package name */
    public int f11316c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11 = this.f11316c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            b(obj);
            return;
        }
        if (i10 == 0) {
            d(i11 + 1);
            int i12 = this.f11314a;
            if (i12 == 0) {
                Object[] objArr = this.f11315b;
                h0.u(objArr, "<this>");
                i12 = objArr.length;
            }
            int i13 = i12 - 1;
            this.f11314a = i13;
            this.f11315b[i13] = obj;
            this.f11316c++;
            return;
        }
        d(i11 + 1);
        int f10 = f(this.f11314a + i10);
        int i14 = this.f11316c;
        if (i10 < ((i14 + 1) >> 1)) {
            if (f10 == 0) {
                Object[] objArr2 = this.f11315b;
                h0.u(objArr2, "<this>");
                f10 = objArr2.length;
            }
            int i15 = f10 - 1;
            int i16 = this.f11314a;
            if (i16 == 0) {
                Object[] objArr3 = this.f11315b;
                h0.u(objArr3, "<this>");
                i16 = objArr3.length;
            }
            int i17 = i16 - 1;
            int i18 = this.f11314a;
            if (i15 >= i18) {
                Object[] objArr4 = this.f11315b;
                objArr4[i17] = objArr4[i18];
                i.i1(objArr4, i18, objArr4, i18 + 1, i15 + 1);
            } else {
                Object[] objArr5 = this.f11315b;
                i.i1(objArr5, i18 - 1, objArr5, i18, objArr5.length);
                Object[] objArr6 = this.f11315b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.i1(objArr6, 0, objArr6, 1, i15 + 1);
            }
            this.f11315b[i15] = obj;
            this.f11314a = i17;
        } else {
            int f11 = f(this.f11314a + i14);
            if (f10 < f11) {
                Object[] objArr7 = this.f11315b;
                i.i1(objArr7, f10 + 1, objArr7, f10, f11);
            } else {
                Object[] objArr8 = this.f11315b;
                i.i1(objArr8, 1, objArr8, 0, f11);
                Object[] objArr9 = this.f11315b;
                objArr9[0] = objArr9[objArr9.length - 1];
                i.i1(objArr9, f10 + 1, objArr9, f10, objArr9.length - 1);
            }
            this.f11315b[f10] = obj;
        }
        this.f11316c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        h0.u(collection, "elements");
        int i11 = this.f11316c;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f11316c;
            if (i10 == i12) {
                return addAll(collection);
            }
            d(collection.size() + i12);
            int f10 = f(this.f11314a + this.f11316c);
            int f11 = f(this.f11314a + i10);
            int size = collection.size();
            if (i10 < ((this.f11316c + 1) >> 1)) {
                int i13 = this.f11314a;
                int i14 = i13 - size;
                if (f11 < i13) {
                    Object[] objArr = this.f11315b;
                    i.i1(objArr, i14, objArr, i13, objArr.length);
                    if (size >= f11) {
                        Object[] objArr2 = this.f11315b;
                        i.i1(objArr2, objArr2.length - size, objArr2, 0, f11);
                    } else {
                        Object[] objArr3 = this.f11315b;
                        i.i1(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.f11315b;
                        i.i1(objArr4, 0, objArr4, size, f11);
                    }
                } else if (i14 >= 0) {
                    Object[] objArr5 = this.f11315b;
                    i.i1(objArr5, i14, objArr5, i13, f11);
                } else {
                    Object[] objArr6 = this.f11315b;
                    i14 += objArr6.length;
                    int i15 = f11 - i13;
                    int length = objArr6.length - i14;
                    if (length >= i15) {
                        i.i1(objArr6, i14, objArr6, i13, f11);
                    } else {
                        i.i1(objArr6, i14, objArr6, i13, i13 + length);
                        Object[] objArr7 = this.f11315b;
                        i.i1(objArr7, 0, objArr7, this.f11314a + length, f11);
                    }
                }
                this.f11314a = i14;
                int i16 = f11 - size;
                if (i16 < 0) {
                    i16 += this.f11315b.length;
                }
                c(i16, collection);
            } else {
                int i17 = f11 + size;
                if (f11 < f10) {
                    int i18 = size + f10;
                    Object[] objArr8 = this.f11315b;
                    if (i18 <= objArr8.length) {
                        i.i1(objArr8, i17, objArr8, f11, f10);
                    } else if (i17 >= objArr8.length) {
                        i.i1(objArr8, i17 - objArr8.length, objArr8, f11, f10);
                    } else {
                        int length2 = f10 - (i18 - objArr8.length);
                        i.i1(objArr8, 0, objArr8, length2, f10);
                        Object[] objArr9 = this.f11315b;
                        i.i1(objArr9, i17, objArr9, f11, length2);
                    }
                } else {
                    Object[] objArr10 = this.f11315b;
                    i.i1(objArr10, size, objArr10, 0, f10);
                    Object[] objArr11 = this.f11315b;
                    if (i17 >= objArr11.length) {
                        i.i1(objArr11, i17 - objArr11.length, objArr11, f11, objArr11.length);
                    } else {
                        i.i1(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f11315b;
                        i.i1(objArr12, i17, objArr12, f11, objArr12.length - size);
                    }
                }
                c(f11, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
    }

    public final void b(Object obj) {
        d(this.f11316c + 1);
        this.f11315b[f(this.f11314a + this.f11316c)] = obj;
        this.f11316c++;
    }

    public final void c(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f11315b.length;
        while (i10 < length && it.hasNext()) {
            this.f11315b[i10] = it.next();
            i10++;
        }
        int i11 = this.f11314a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f11315b[i12] = it.next();
        }
        this.f11316c = collection.size() + this.f11316c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int f10 = f(this.f11314a + this.f11316c);
        int i10 = this.f11314a;
        if (i10 < f10) {
            i.k1(this.f11315b, i10, f10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f11315b;
            i.k1(objArr, this.f11314a, objArr.length);
            i.k1(this.f11315b, 0, f10);
        }
        this.f11314a = 0;
        this.f11316c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f11315b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f11313d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f11315b = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            i.i1(objArr, 0, objArr2, this.f11314a, objArr.length);
            Object[] objArr3 = this.f11315b;
            int length2 = objArr3.length;
            int i12 = this.f11314a;
            i.i1(objArr3, length2 - i12, objArr2, 0, i12);
            this.f11314a = 0;
            this.f11315b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int e(int i10) {
        h0.u(this.f11315b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int f(int i10) {
        Object[] objArr = this.f11315b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    public final Object g() {
        if (!isEmpty()) {
            Object[] objArr = this.f11315b;
            int i10 = this.f11314a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f11314a = e(i10);
            this.f11316c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f11316c;
        if (i10 >= 0 && i10 < i11) {
            return this.f11315b[f(this.f11314a + i10)];
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int f10 = f(this.f11314a + this.f11316c);
        int i11 = this.f11314a;
        if (i11 < f10) {
            while (i11 < f10) {
                if (h0.g(obj, this.f11315b[i11])) {
                    i10 = this.f11314a;
                } else {
                    i11++;
                }
            }
            return -1;
        }
        if (i11 >= f10) {
            int length = this.f11315b.length;
            while (true) {
                if (i11 < length) {
                    if (h0.g(obj, this.f11315b[i11])) {
                        i10 = this.f11314a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < f10; i12++) {
                        if (h0.g(obj, this.f11315b[i12])) {
                            i11 = i12 + this.f11315b.length;
                            i10 = this.f11314a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f11316c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int f10 = f(this.f11314a + this.f11316c);
        int i11 = this.f11314a;
        if (i11 < f10) {
            length = f10 - 1;
            if (i11 <= length) {
                while (!h0.g(obj, this.f11315b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f11314a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > f10) {
            int i12 = f10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (h0.g(obj, this.f11315b[i12])) {
                        length = i12 + this.f11315b.length;
                        i10 = this.f11314a;
                        break;
                    }
                    i12--;
                } else {
                    Object[] objArr = this.f11315b;
                    h0.u(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f11314a;
                    if (i13 <= length) {
                        while (!h0.g(obj, this.f11315b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f11314a;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Object[] objArr;
        int f10;
        h0.u(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty()) {
            if (this.f11315b.length == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                int f11 = f(this.f11314a + this.f11316c);
                int i10 = this.f11314a;
                if (i10 < f11) {
                    f10 = i10;
                    while (i10 < f11) {
                        Object obj = this.f11315b[i10];
                        if (!collection.contains(obj)) {
                            this.f11315b[f10] = obj;
                            f10++;
                        } else {
                            z9 = true;
                        }
                        i10++;
                    }
                    i.k1(this.f11315b, f10, f11);
                } else {
                    int length = this.f11315b.length;
                    boolean z10 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr2 = this.f11315b;
                        Object obj2 = objArr2[i10];
                        objArr2[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f11315b[i11] = obj2;
                            i11++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    f10 = f(i11);
                    for (int i12 = 0; i12 < f11; i12++) {
                        Object[] objArr3 = this.f11315b;
                        Object obj3 = objArr3[i12];
                        objArr3[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f11315b[f10] = obj3;
                            f10 = e(f10);
                        } else {
                            z10 = true;
                        }
                    }
                    z9 = z10;
                }
                if (z9) {
                    int i13 = f10 - this.f11314a;
                    if (i13 < 0) {
                        i13 += this.f11315b.length;
                    }
                    this.f11316c = i13;
                }
            }
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Object[] objArr;
        int f10;
        h0.u(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty()) {
            if (this.f11315b.length == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (objArr == false) {
                int f11 = f(this.f11314a + this.f11316c);
                int i10 = this.f11314a;
                if (i10 < f11) {
                    f10 = i10;
                    while (i10 < f11) {
                        Object obj = this.f11315b[i10];
                        if (collection.contains(obj)) {
                            this.f11315b[f10] = obj;
                            f10++;
                        } else {
                            z9 = true;
                        }
                        i10++;
                    }
                    i.k1(this.f11315b, f10, f11);
                } else {
                    int length = this.f11315b.length;
                    boolean z10 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr2 = this.f11315b;
                        Object obj2 = objArr2[i10];
                        objArr2[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f11315b[i11] = obj2;
                            i11++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    f10 = f(i11);
                    for (int i12 = 0; i12 < f11; i12++) {
                        Object[] objArr3 = this.f11315b;
                        Object obj3 = objArr3[i12];
                        objArr3[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f11315b[f10] = obj3;
                            f10 = e(f10);
                        } else {
                            z10 = true;
                        }
                    }
                    z9 = z10;
                }
                if (z9) {
                    int i13 = f10 - this.f11314a;
                    if (i13 < 0) {
                        i13 += this.f11315b.length;
                    }
                    this.f11316c = i13;
                }
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11 = this.f11316c;
        if (i10 >= 0 && i10 < i11) {
            int f10 = f(this.f11314a + i10);
            Object[] objArr = this.f11315b;
            Object obj2 = objArr[f10];
            objArr[f10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f11316c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        h0.u(objArr, "array");
        int length = objArr.length;
        int i10 = this.f11316c;
        if (length < i10) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            h0.r(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f10 = f(this.f11314a + this.f11316c);
        int i11 = this.f11314a;
        if (i11 < f10) {
            i.i1(this.f11315b, 0, objArr, i11, f10);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f11315b;
            i.i1(objArr2, 0, objArr, this.f11314a, objArr2.length);
            Object[] objArr3 = this.f11315b;
            i.i1(objArr3, objArr3.length - this.f11314a, objArr, 0, f10);
        }
        int i12 = this.f11316c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h0.u(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        d(collection.size() + this.f11316c);
        c(f(this.f11314a + this.f11316c), collection);
        return true;
    }
}
