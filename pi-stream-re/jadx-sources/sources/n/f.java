package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Collection, Set {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f7864d;

    /* renamed from: e, reason: collision with root package name */
    public static int f7865e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f7866f;

    /* renamed from: x, reason: collision with root package name */
    public static int f7867x;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f7868y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final Object f7869z = new Object();

    /* renamed from: a, reason: collision with root package name */
    public int[] f7870a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f7871b;

    /* renamed from: c, reason: collision with root package name */
    public int f7872c;

    public f(int i10) {
        if (i10 == 0) {
            this.f7870a = j5.a.f6163v;
            this.f7871b = j5.a.f6164w;
        } else {
            b(i10);
        }
        this.f7872c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (f7869z) {
                if (f7867x < 10) {
                    objArr[0] = f7866f;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f7866f = objArr;
                    f7867x++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f7868y) {
                if (f7865e < 10) {
                    objArr[0] = f7864d;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f7864d = objArr;
                    f7865e++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int d10;
        int i11 = this.f7872c;
        if (obj == null) {
            d10 = e();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            d10 = d(hashCode, obj);
        }
        if (d10 >= 0) {
            return false;
        }
        int i12 = ~d10;
        int[] iArr = this.f7870a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f7871b;
            b(i13);
            if (i11 == this.f7872c) {
                int[] iArr2 = this.f7870a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f7871b, 0, objArr.length);
                }
                c(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f7870a;
            int i14 = i12 + 1;
            int i15 = i11 - i12;
            System.arraycopy(iArr3, i12, iArr3, i14, i15);
            Object[] objArr2 = this.f7871b;
            System.arraycopy(objArr2, i12, objArr2, i14, i15);
        }
        int i16 = this.f7872c;
        if (i11 == i16) {
            int[] iArr4 = this.f7870a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f7871b[i12] = obj;
                this.f7872c = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f7872c;
        int i10 = this.f7872c;
        int[] iArr = this.f7870a;
        boolean z9 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7871b;
            b(size);
            int i11 = this.f7872c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f7870a, 0, i11);
                System.arraycopy(objArr, 0, this.f7871b, 0, this.f7872c);
            }
            c(iArr, objArr, this.f7872c);
        }
        if (this.f7872c == i10) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z9 |= add(it.next());
            }
            return z9;
        }
        throw new ConcurrentModificationException();
    }

    public final void b(int i10) {
        if (i10 == 8) {
            synchronized (f7869z) {
                Object[] objArr = f7866f;
                if (objArr != null) {
                    try {
                        this.f7871b = objArr;
                        f7866f = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f7870a = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f7867x--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f7866f = null;
                    f7867x = 0;
                }
            }
        } else if (i10 == 4) {
            synchronized (f7868y) {
                Object[] objArr2 = f7864d;
                if (objArr2 != null) {
                    try {
                        this.f7871b = objArr2;
                        f7864d = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f7870a = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f7865e--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f7864d = null;
                    f7865e = 0;
                }
            }
        }
        this.f7870a = new int[i10];
        this.f7871b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f7872c;
        if (i10 != 0) {
            int[] iArr = this.f7870a;
            Object[] objArr = this.f7871b;
            this.f7870a = j5.a.f6163v;
            this.f7871b = j5.a.f6164w;
            this.f7872c = 0;
            c(iArr, objArr, i10);
        }
        if (this.f7872c == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int d10;
        if (obj == null) {
            d10 = e();
        } else {
            d10 = d(obj.hashCode(), obj);
        }
        if (d10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f7872c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int b10 = j5.a.b(i11, i10, this.f7870a);
            if (b10 < 0) {
                return b10;
            }
            if (obj.equals(this.f7871b[b10])) {
                return b10;
            }
            int i12 = b10 + 1;
            while (i12 < i11 && this.f7870a[i12] == i10) {
                if (obj.equals(this.f7871b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f7870a[i13] == i10; i13--) {
                if (obj.equals(this.f7871b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e() {
        int i10 = this.f7872c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int b10 = j5.a.b(i10, 0, this.f7870a);
            if (b10 < 0) {
                return b10;
            }
            if (this.f7871b[b10] == null) {
                return b10;
            }
            int i11 = b10 + 1;
            while (i11 < i10 && this.f7870a[i11] == 0) {
                if (this.f7871b[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f7870a[i12] == 0; i12--) {
                if (this.f7871b[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f7872c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f7872c; i10++) {
                try {
                    if (!set.contains(this.f7871b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i10) {
        int i11 = this.f7872c;
        Object[] objArr = this.f7871b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f7870a;
        int i13 = 8;
        if (iArr.length > 8 && i11 < iArr.length / 3) {
            if (i11 > 8) {
                i13 = i11 + (i11 >> 1);
            }
            b(i13);
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f7870a, 0, i10);
                System.arraycopy(objArr, 0, this.f7871b, 0, i10);
            }
            if (i10 < i12) {
                int i14 = i10 + 1;
                int i15 = i12 - i10;
                System.arraycopy(iArr, i14, this.f7870a, i10, i15);
                System.arraycopy(objArr, i14, this.f7871b, i10, i15);
            }
        } else {
            if (i10 < i12) {
                int i16 = i10 + 1;
                int i17 = i12 - i10;
                System.arraycopy(iArr, i16, iArr, i10, i17);
                Object[] objArr2 = this.f7871b;
                System.arraycopy(objArr2, i16, objArr2, i10, i17);
            }
            this.f7871b[i12] = null;
        }
        if (i11 == this.f7872c) {
            this.f7872c = i12;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7870a;
        int i10 = this.f7872c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f7872c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int d10;
        if (obj == null) {
            d10 = e();
        } else {
            d10 = d(obj.hashCode(), obj);
        }
        if (d10 >= 0) {
            f(d10);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= remove(it.next());
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z9 = false;
        for (int i10 = this.f7872c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f7871b[i10])) {
                f(i10);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7872c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f7872c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f7871b, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7872c * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f7872c; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7871b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f7872c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f7872c);
        }
        System.arraycopy(this.f7871b, 0, objArr, 0, this.f7872c);
        int length = objArr.length;
        int i10 = this.f7872c;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
