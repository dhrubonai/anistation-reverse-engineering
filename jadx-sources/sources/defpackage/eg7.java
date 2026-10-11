package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eg7 extends re7 implements RandomAccess, xf7, tg7 {
    public static final long[] A;
    public static final eg7 B;
    public long[] y;
    public int z;

    static {
        long[] jArr = new long[0];
        A = jArr;
        B = new eg7(jArr, 0, false);
    }

    public eg7(long[] jArr, int i, boolean z) {
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
        ze0.g(m97.b(this.z, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // defpackage.re7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof eg7)) {
            return super.addAll(collection);
        }
        eg7 eg7Var = (eg7) collection;
        int i = eg7Var.z;
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
            System.arraycopy(eg7Var.y, 0, jArr, this.z, eg7Var.z);
            this.z = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i) {
        g(i);
        return this.y[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yf7
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eg7 l(int i) {
        long[] copyOf;
        if (i >= this.z) {
            if (i == 0) {
                copyOf = A;
            } else {
                copyOf = Arrays.copyOf(this.y, i);
            }
            return new eg7(copyOf, this.z, true);
        }
        p65.b();
        return null;
    }

    @Override // defpackage.re7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof eg7)) {
                return super.equals(obj);
            }
            eg7 eg7Var = (eg7) obj;
            if (this.z == eg7Var.z) {
                long[] jArr = eg7Var.y;
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

    public final void f(long j) {
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
        jArr[i2] = j;
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
        return Long.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            long j = this.y[i2];
            byte[] bArr = wf7.a;
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

    @Override // defpackage.re7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        g(i);
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
        g(i);
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
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
