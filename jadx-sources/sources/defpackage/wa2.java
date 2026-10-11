package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa2 implements vg6 {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public wa2(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vg6
    public final gf5 d(int i, long j) {
        SparseArray sparseArray = this.a;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            int i2 = this.e;
            jArr = (long[]) sparseArray.get(i2);
            jArr2 = (long[]) sparseArray2.get(i2);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length != 0 && j >= jArr[0]) {
            int f = eq6.f(jArr, j, true);
            jf5 jf5Var = new jf5(jArr[f], jArr2[f]);
            return new gf5(jf5Var, jf5Var);
        }
        jf5 jf5Var2 = new jf5(0L, this.d);
        return new gf5(jf5Var2, jf5Var2);
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        return d(this.e, j);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
