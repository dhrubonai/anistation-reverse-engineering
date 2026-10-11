package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ls implements Collection, Set, k73, q73 {
    public int[] x = w65.c;
    public Object[] y = w65.e;
    public int z;

    public ls(int i) {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int t;
        int i2 = this.z;
        if (obj == null) {
            t = m37.t(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            t = m37.t(this, obj, hashCode);
        }
        if (t >= 0) {
            return false;
        }
        int i3 = ~t;
        int[] iArr = this.x;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.y;
            int[] iArr2 = new int[i4];
            this.x = iArr2;
            this.y = new Object[i4];
            if (i2 == this.z) {
                if (iArr2.length != 0) {
                    ms.A0(0, iArr.length, 6, iArr, iArr2);
                    ms.B0(0, objArr.length, 6, objArr, this.y);
                }
            } else {
                ze0.j();
                return false;
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.x;
            int i5 = i3 + 1;
            ms.w0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.y;
            ms.x0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.z;
        if (i2 == i6) {
            int[] iArr4 = this.x;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.y[i3] = obj;
                this.z = i6 + 1;
                return true;
            }
        }
        ze0.j();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.z;
        int i = this.z;
        int[] iArr = this.x;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.y;
            int[] iArr2 = new int[size];
            this.x = iArr2;
            this.y = new Object[size];
            if (i > 0) {
                ms.A0(0, i, 6, iArr, iArr2);
                ms.B0(0, this.z, 6, objArr, this.y);
            }
        }
        if (this.z == i) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        ze0.j();
        return false;
    }

    public final Object b(int i) {
        int i2 = this.z;
        Object[] objArr = this.y;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.x;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.x = iArr2;
            this.y = new Object[i4];
            if (i > 0) {
                ms.A0(0, i, 6, iArr, iArr2);
                ms.B0(0, i, 6, objArr, this.y);
            }
            if (i < i3) {
                int i5 = i + 1;
                ms.w0(i, i5, i2, iArr, this.x);
                ms.x0(i, i5, i2, objArr, this.y);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                ms.w0(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.y;
                ms.x0(i, i6, i2, objArr2, objArr2);
            }
            this.y[i3] = null;
        }
        if (i2 == this.z) {
            this.z = i3;
            return obj;
        }
        ze0.j();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.z;
        if (i != 0) {
            this.x = w65.c;
            this.y = w65.e;
            i = 0;
            this.z = 0;
        }
        if (i == 0) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int t;
        if (obj == null) {
            t = m37.t(this, null, 0);
        } else {
            t = m37.t(this, obj, obj.hashCode());
        }
        if (t < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.z != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.z;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.y[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.x;
        int i = this.z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.z <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new fs(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int t;
        if (obj == null) {
            t = m37.t(this, null, 0);
        } else {
            t = m37.t(this, obj, obj.hashCode());
        }
        if (t < 0) {
            return false;
        }
        b(t);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.z - 1; -1 < i; i--) {
            if (!yo0.e0(collection, this.y[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.z;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ms.x0(0, 0, this.z, this.y, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 14);
        sb.append('{');
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.y[i2];
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
    public final Object[] toArray() {
        return ms.D0(this.y, 0, this.z);
    }
}
