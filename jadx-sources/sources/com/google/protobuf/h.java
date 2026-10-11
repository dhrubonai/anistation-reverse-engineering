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
public final class h extends b implements Internal.BooleanList, RandomAccess, yt4 {
    public static final h z = new h(new boolean[0], 0, false);
    public boolean[] x;
    public int y;

    public h(boolean[] zArr, int i, boolean z2) {
        super(z2);
        this.x = zArr;
        this.y = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.y)) {
            boolean[] zArr = this.x;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.x, i, zArr2, i + 1, this.y - i);
                this.x = zArr2;
            }
            this.x[i] = booleanValue;
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
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i = hVar.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.x;
            if (i3 > zArr.length) {
                zArr = Arrays.copyOf(zArr, i3);
                this.x = zArr;
            }
            System.arraycopy(hVar.x, 0, zArr, this.y, hVar.y);
            this.y = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z2) {
        ensureIsMutable();
        int i = this.y;
        boolean[] zArr = this.x;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.x = zArr2;
            zArr = zArr2;
        }
        int i2 = this.y;
        this.y = i2 + 1;
        zArr[i2] = z2;
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
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.y != hVar.y) {
            return false;
        }
        boolean[] zArr = hVar.x;
        for (int i = 0; i < this.y; i++) {
            if (this.x[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i) {
        b(i);
        return this.x[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.y) {
            return new h(Arrays.copyOf(this.x, i), this.y, true);
        }
        p65.b();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        b(i);
        boolean[] zArr = this.x;
        boolean z2 = zArr[i];
        if (i < this.y - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            boolean[] zArr = this.x;
            System.arraycopy(zArr, i2, zArr, i, this.y - i2);
            this.y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Boolean.valueOf(setBoolean(i, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i, boolean z2) {
        ensureIsMutable();
        b(i);
        boolean[] zArr = this.x;
        boolean z3 = zArr[i];
        zArr[i] = z2;
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
