package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.p65;
import defpackage.qx1;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s1 extends b implements RandomAccess {
    public static final s1 z = new s1(new Object[0], 0, false);
    public Object[] x;
    public int y;

    public s1(Object[] objArr, int i, boolean z2) {
        super(z2);
        this.x = objArr;
        this.y = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.y)) {
            Object[] objArr = this.x;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.x, i, objArr2, i + 1, this.y - i);
                this.x = objArr2;
            }
            this.x[i] = obj;
            this.y++;
            ((AbstractList) this).modCount++;
            return;
        }
        p65.k(qx1.s(i, "Index:", ", Size:"), this.y);
    }

    public final void b(int i) {
        if (i >= 0 && i < this.y) {
            return;
        }
        p65.k(qx1.s(i, "Index:", ", Size:"), this.y);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.x[i];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i) {
        if (i >= this.y) {
            return new s1(Arrays.copyOf(this.x, i), this.y, true);
        }
        p65.b();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        b(i);
        Object[] objArr = this.x;
        Object obj = objArr[i];
        if (i < this.y - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ensureIsMutable();
        b(i);
        Object[] objArr = this.x;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i = this.y;
        Object[] objArr = this.x;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.x = objArr;
        }
        int i2 = this.y;
        this.y = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
