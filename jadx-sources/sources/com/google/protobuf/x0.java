package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.p65;
import defpackage.qx1;
import defpackage.yt4;
import defpackage.ze0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x0 extends b implements Internal.IntList, RandomAccess, yt4 {
    public static final x0 z = new x0(new int[0], 0, false);
    public int[] x;
    public int y;

    public x0() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.y)) {
            int[] iArr = this.x;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.x, i, iArr2, i + 1, this.y - i);
                this.x = iArr2;
            }
            this.x[i] = intValue;
            this.y++;
            ((AbstractList) this).modCount++;
            return;
        }
        p65.k(qx1.s(i, "Index:", ", Size:"), this.y);
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof x0)) {
            return super.addAll(collection);
        }
        x0 x0Var = (x0) collection;
        int i = x0Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.x;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.x = iArr;
            }
            System.arraycopy(x0Var.x, 0, iArr, this.y, x0Var.y);
            this.y = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.IntList
    public final void addInt(int i) {
        ensureIsMutable();
        int i2 = this.y;
        int[] iArr = this.x;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.x = iArr2;
            iArr = iArr2;
        }
        int i3 = this.y;
        this.y = i3 + 1;
        iArr[i3] = i;
    }

    public final void b(int i) {
        if (i >= 0 && i < this.y) {
            return;
        }
        p65.k(qx1.s(i, "Index:", ", Size:"), this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        if (this.y != x0Var.y) {
            return false;
        }
        int[] iArr = x0Var.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int getInt(int i) {
        b(i);
        return this.x[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + this.x[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.y) {
            return new x0(Arrays.copyOf(this.x, i), this.y, true);
        }
        p65.b();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        b(i);
        int[] iArr = this.x;
        int i2 = iArr[i];
        if (i < this.y - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            int[] iArr = this.x;
            System.arraycopy(iArr, i2, iArr, i, this.y - i2);
            this.y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Integer.valueOf(setInt(i, ((Integer) obj).intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int setInt(int i, int i2) {
        ensureIsMutable();
        b(i);
        int[] iArr = this.x;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    public x0(int[] iArr, int i, boolean z2) {
        super(z2);
        this.x = iArr;
        this.y = i;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
