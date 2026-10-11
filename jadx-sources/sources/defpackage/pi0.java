package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pi0 extends kf6 {
    public static final pi0 k = new pi0(new int[0], new SparseArray());
    public final SparseIntArray e;
    public final ar3[] f;
    public final int[] g;
    public final long[] h;
    public final long[] i;
    public final boolean[] j;

    public pi0(int[] iArr, SparseArray sparseArray) {
        int length = iArr.length;
        this.e = new SparseIntArray(length);
        this.g = Arrays.copyOf(iArr, length);
        this.h = new long[length];
        this.i = new long[length];
        this.j = new boolean[length];
        this.f = new ar3[length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.g;
            if (i < iArr2.length) {
                int i2 = iArr2[i];
                this.e.put(i2, i);
                oi0 oi0Var = (oi0) sparseArray.get(i2, oi0.f);
                this.f[i] = oi0Var.d;
                this.h[i] = oi0Var.a;
                long[] jArr = this.i;
                long j = oi0Var.b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                jArr[i] = j;
                this.j[i] = oi0Var.c;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return this.e.get(((Integer) obj).intValue(), -1);
    }

    @Override // defpackage.kf6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        if (Arrays.equals(this.g, pi0Var.g) && Arrays.equals(this.h, pi0Var.h) && Arrays.equals(this.i, pi0Var.i) && Arrays.equals(this.j, pi0Var.j)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        int i2 = this.g[i];
        hf6Var.h(Integer.valueOf(i2), Integer.valueOf(i2), i, this.h[i], 0L, y5.c, false);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return this.g.length;
    }

    @Override // defpackage.kf6
    public final int hashCode() {
        return Arrays.hashCode(this.j) + ((Arrays.hashCode(this.i) + ((Arrays.hashCode(this.h) + (Arrays.hashCode(this.g) * 31)) * 31)) * 31);
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        return Integer.valueOf(this.g[i]);
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        boolean z;
        uq3 uq3Var;
        long j2 = this.h[i];
        if (j2 == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        Integer valueOf = Integer.valueOf(this.g[i]);
        ar3 ar3Var = this.f[i];
        boolean z3 = !z2;
        if (this.j[i]) {
            uq3Var = ar3Var.c;
        } else {
            uq3Var = null;
        }
        jf6Var.b(valueOf, ar3Var, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z3, z2, uq3Var, this.i[i], j2, i, i, 0L);
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return this.g.length;
    }
}
