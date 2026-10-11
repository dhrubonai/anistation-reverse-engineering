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
public final class r0 extends b implements Internal.FloatList, RandomAccess, yt4 {
    public static final r0 z = new r0(new float[0], 0, false);
    public float[] x;
    public int y;

    public r0(float[] fArr, int i, boolean z2) {
        super(z2);
        this.x = fArr;
        this.y = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.y)) {
            float[] fArr = this.x;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.x, i, fArr2, i + 1, this.y - i);
                this.x = fArr2;
            }
            this.x[i] = floatValue;
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
        if (!(collection instanceof r0)) {
            return super.addAll(collection);
        }
        r0 r0Var = (r0) collection;
        int i = r0Var.y;
        if (i == 0) {
            return false;
        }
        int i2 = this.y;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.x;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.x = fArr;
            }
            System.arraycopy(r0Var.x, 0, fArr, this.y, r0Var.y);
            this.y = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f) {
        ensureIsMutable();
        int i = this.y;
        float[] fArr = this.x;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.x = fArr2;
            fArr = fArr2;
        }
        int i2 = this.y;
        this.y = i2 + 1;
        fArr[i2] = f;
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
        if (!(obj instanceof r0)) {
            return super.equals(obj);
        }
        r0 r0Var = (r0) obj;
        if (this.y != r0Var.y) {
            return false;
        }
        float[] fArr = r0Var.x;
        for (int i = 0; i < this.y; i++) {
            if (Float.floatToIntBits(this.x[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i) {
        b(i);
        return this.x[i];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.y;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.x[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
        if (i >= this.y) {
            return new r0(Arrays.copyOf(this.x, i), this.y, true);
        }
        p65.b();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        b(i);
        float[] fArr = this.x;
        float f = fArr[i];
        if (i < this.y - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            float[] fArr = this.x;
            System.arraycopy(fArr, i2, fArr, i, this.y - i2);
            this.y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(setFloat(i, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i, float f) {
        ensureIsMutable();
        b(i);
        float[] fArr = this.x;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
