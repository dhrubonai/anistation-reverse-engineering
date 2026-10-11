package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf7 extends re7 implements RandomAccess, tf7, tg7 {
    public static final int[] A;
    public static final nf7 B;
    public int[] y;
    public int z;

    static {
        int[] iArr = new int[0];
        A = iArr;
        B = new nf7(iArr, 0, false);
    }

    public nf7(int[] iArr, int i, boolean z) {
        super(z);
        this.y = iArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i >= 0 && i <= (i2 = this.z)) {
            int i3 = i + 1;
            int[] iArr = this.y;
            int length = iArr.length;
            if (i2 < length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[zo5.f(length, 3, 2, 1, 10)];
                System.arraycopy(this.y, 0, iArr2, 0, i);
                System.arraycopy(this.y, i, iArr2, i3, this.z - i);
                this.y = iArr2;
            }
            this.y[i] = intValue;
            this.z++;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g(m97.b(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // defpackage.re7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof nf7)) {
            return super.addAll(collection);
        }
        nf7 nf7Var = (nf7) collection;
        int i = nf7Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.y;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.y = iArr;
            }
            System.arraycopy(nf7Var.y, 0, iArr, this.z, nf7Var.z);
            this.z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // defpackage.yf7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nf7 l(int i) {
        int[] copyOf;
        if (i >= this.z) {
            if (i == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.y, i);
            }
            return new nf7(copyOf, this.z, true);
        }
        p65.b();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        g(i);
        return this.y[i];
    }

    @Override // defpackage.re7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nf7)) {
                return super.equals(obj);
            }
            nf7 nf7Var = (nf7) obj;
            if (this.z == nf7Var.z) {
                int[] iArr = nf7Var.y;
                for (int i = 0; i < this.z; i++) {
                    if (this.y[i] == iArr[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        b();
        int i2 = this.z;
        int[] iArr = this.y;
        int length = iArr.length;
        if (i2 == length) {
            iArr = new int[zo5.f(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, iArr, 0, this.z);
            this.y = iArr;
        }
        int i3 = this.z;
        this.z = i3 + 1;
        iArr[i3] = i;
    }

    public final void g(int i) {
        if (i >= 0 && i < this.z) {
            return;
        }
        ze0.g(m97.b(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            i = (i * 31) + this.y[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.z;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.y[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.re7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        g(i);
        int[] iArr = this.y;
        int i2 = iArr[i];
        if (i < this.z - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            int[] iArr = this.y;
            System.arraycopy(iArr, i2, iArr, i, this.z - i2);
            this.z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        g(i);
        int[] iArr = this.y;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
