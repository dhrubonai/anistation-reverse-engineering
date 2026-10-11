package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vg7 extends re7 implements RandomAccess {
    public static final Object[] A;
    public static final vg7 B;
    public Object[] y;
    public int z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new vg7(objArr, 0, false);
    }

    public vg7(Object[] objArr, int i, boolean z) {
        super(z);
        this.y = objArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.z)) {
            int i3 = i + 1;
            Object[] objArr = this.y;
            int length = objArr.length;
            if (i2 < length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[zo5.f(length, 3, 2, 1, 10)];
                System.arraycopy(this.y, 0, objArr2, 0, i);
                System.arraycopy(this.y, i, objArr2, i3, this.z - i);
                this.y = objArr2;
            }
            this.y[i] = obj;
            this.z++;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g(m97.b(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    public final void c(int i) {
        if (i >= 0 && i < this.z) {
            return;
        }
        ze0.g(m97.b(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // defpackage.re7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int i = this.z;
                if (i == list.size()) {
                    if (obj instanceof vg7) {
                        vg7 vg7Var = (vg7) obj;
                        for (int i2 = 0; i2 < i; i2++) {
                            if (this.y[i2].equals(vg7Var.y[i2])) {
                            }
                        }
                        return true;
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        if (this.y[i3].equals(list.get(i3))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.y[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.z;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + this.y[i3].hashCode();
        }
        return i2;
    }

    @Override // defpackage.yf7
    public final /* bridge */ /* synthetic */ yf7 l(int i) {
        Object[] copyOf;
        if (i >= this.z) {
            if (i == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.y, i);
            }
            return new vg7(copyOf, this.z, true);
        }
        p65.b();
        return null;
    }

    @Override // defpackage.re7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.y;
        Object obj = objArr[i];
        if (i < this.z - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.z;
        Object[] objArr = this.y;
        int length = objArr.length;
        if (i == length) {
            objArr = Arrays.copyOf(this.y, zo5.f(length, 3, 2, 1, 10));
            this.y = objArr;
        }
        int i2 = this.z;
        this.z = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
