package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class e65 extends r1 implements RandomAccess {
    public int A;
    public final Object[] x;
    public final int y;
    public int z;

    public e65(Object[] objArr, int i) {
        this.x = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.y = objArr.length;
                this.A = i;
                return;
            } else {
                ze0.i(qx1.s(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "), objArr.length);
                throw null;
            }
        }
        ze0.e(qx1.h(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.A;
    }

    public final void c(int i) {
        if (i >= 0) {
            if (i <= this.A) {
                if (i > 0) {
                    int i2 = this.z;
                    int i3 = this.y;
                    int i4 = (i2 + i) % i3;
                    Object[] objArr = this.x;
                    if (i2 > i4) {
                        Arrays.fill(objArr, i2, i3, (Object) null);
                        Arrays.fill(objArr, 0, i4, (Object) null);
                    } else {
                        Arrays.fill(objArr, i2, i4, (Object) null);
                    }
                    this.z = i4;
                    this.A -= i;
                    return;
                }
                return;
            }
            ze0.i(qx1.s(i, "n shouldn't be greater than the buffer size: n = ", ", size = "), this.A);
            return;
        }
        ze0.e(qx1.h(i, "n shouldn't be negative but it is "));
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A;
        if (i >= 0 && i < i2) {
            return this.x[(this.z + i) % this.y];
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // defpackage.r1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new d65(this);
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.A;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.A;
        int i3 = this.z;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.x;
            if (i5 >= i2 || i3 >= this.y) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }
}
