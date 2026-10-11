package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s98 extends a98 implements RandomAccess, fa8 {
    public static final float[] A;
    public static final s98 B;
    public float[] y;
    public int z;

    static {
        float[] fArr = new float[0];
        A = fArr;
        B = new s98(fArr, 0, false);
    }

    public s98(float[] fArr, int i, boolean z) {
        super(z);
        this.y = fArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        b();
        if (i >= 0 && i <= (i2 = this.z)) {
            int i3 = i + 1;
            float[] fArr = this.y;
            int length = fArr.length;
            if (i2 < length) {
                System.arraycopy(fArr, i, fArr, i3, i2 - i);
            } else {
                float[] fArr2 = new float[zo5.f(length, 3, 2, 1, 10)];
                System.arraycopy(this.y, 0, fArr2, 0, i);
                System.arraycopy(this.y, i, fArr2, i3, this.z - i);
                this.y = fArr2;
            }
            this.y[i] = floatValue;
            this.z++;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g(mv5.k(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // defpackage.a98, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = la8.a;
        collection.getClass();
        if (!(collection instanceof s98)) {
            return super.addAll(collection);
        }
        s98 s98Var = (s98) collection;
        int i = s98Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.y;
            if (i3 > fArr.length) {
                fArr = Arrays.copyOf(fArr, i3);
                this.y = fArr;
            }
            System.arraycopy(s98Var.y, 0, fArr, this.z, s98Var.z);
            this.z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(int i) {
        if (i >= 0 && i < this.z) {
            return;
        }
        ze0.g(mv5.k(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ja8
    public final ja8 e(int i) {
        float[] copyOf;
        if (i >= this.z) {
            if (i == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.y, i);
            }
            return new s98(copyOf, this.z, true);
        }
        p65.b();
        return null;
    }

    @Override // defpackage.a98, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s98)) {
                return super.equals(obj);
            }
            s98 s98Var = (s98) obj;
            if (this.z == s98Var.z) {
                float[] fArr = s98Var.y;
                for (int i = 0; i < this.z; i++) {
                    if (Float.floatToIntBits(this.y[i]) == Float.floatToIntBits(fArr[i])) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        c(i);
        return Float.valueOf(this.y[i]);
    }

    @Override // defpackage.a98, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.y[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.z;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.y[i2] == floatValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.a98, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        c(i);
        float[] fArr = this.y;
        float f = fArr[i];
        if (i < this.z - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            float[] fArr = this.y;
            System.arraycopy(fArr, i2, fArr, i, this.z - i2);
            this.z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        c(i);
        float[] fArr = this.y;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        b();
        int i = this.z;
        float[] fArr = this.y;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[zo5.f(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, fArr, 0, this.z);
            this.y = fArr;
        }
        int i2 = this.z;
        this.z = i2 + 1;
        fArr[i2] = floatValue;
        return true;
    }
}
