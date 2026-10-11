package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa8 extends a98 implements RandomAccess, ha8 {
    public static final long[] A;
    public static final wa8 B;
    public long[] y;
    public int z;

    static {
        long[] jArr = new long[0];
        A = jArr;
        B = new wa8(jArr, 0, false);
    }

    public wa8(long[] jArr, int i, boolean z) {
        super(z);
        this.y = jArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        b();
        if (i >= 0 && i <= (i2 = this.z)) {
            int i3 = i + 1;
            long[] jArr = this.y;
            int length = jArr.length;
            if (i2 < length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[zo5.f(length, 3, 2, 1, 10)];
                System.arraycopy(this.y, 0, jArr2, 0, i);
                System.arraycopy(this.y, i, jArr2, i3, this.z - i);
                this.y = jArr2;
            }
            this.y[i] = longValue;
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
        if (!(collection instanceof wa8)) {
            return super.addAll(collection);
        }
        wa8 wa8Var = (wa8) collection;
        int i = wa8Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.y;
            if (i3 > jArr.length) {
                jArr = Arrays.copyOf(jArr, i3);
                this.y = jArr;
            }
            System.arraycopy(wa8Var.y, 0, jArr, this.z, wa8Var.z);
            this.z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i) {
        d(i);
        return this.y[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0 && i < this.z) {
            return;
        }
        ze0.g(mv5.k(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // defpackage.ja8
    public final ja8 e(int i) {
        long[] copyOf;
        if (i >= this.z) {
            if (i == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.y, i);
            }
            return new wa8(copyOf, this.z, true);
        }
        p65.b();
        return null;
    }

    @Override // defpackage.a98, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof wa8)) {
                return super.equals(obj);
            }
            wa8 wa8Var = (wa8) obj;
            if (this.z == wa8Var.z) {
                long[] jArr = wa8Var.y;
                for (int i = 0; i < this.z; i++) {
                    if (this.y[i] == jArr[i]) {
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
        d(i);
        return Long.valueOf(this.y[i]);
    }

    @Override // defpackage.a98, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            long j = this.y[i2];
            Charset charset = la8.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.z;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.y[i2] == longValue) {
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
        d(i);
        long[] jArr = this.y;
        long j = jArr[i];
        if (i < this.z - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            long[] jArr = this.y;
            System.arraycopy(jArr, i2, jArr, i, this.z - i2);
            this.z -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        ze0.g("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        d(i);
        long[] jArr = this.y;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        int i = this.z;
        long[] jArr = this.y;
        int length = jArr.length;
        if (i == length) {
            jArr = new long[zo5.f(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, jArr, 0, this.z);
            this.y = jArr;
        }
        int i2 = this.z;
        this.z = i2 + 1;
        jArr[i2] = longValue;
        return true;
    }
}
