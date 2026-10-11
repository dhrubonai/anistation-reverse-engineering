package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zy3 implements uf5 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public zy3(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? eq6.U(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair i(long j, long[] jArr, long[] jArr2) {
        double d;
        int f = eq6.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // defpackage.uf5
    public final long a() {
        return -1L;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.uf5
    public final long c(long j) {
        return eq6.U(((Long) i(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        Pair i = i(eq6.l0(eq6.k(j, 0L, this.c)), this.b, this.a);
        jf5 jf5Var = new jf5(eq6.U(((Long) i.first).longValue()), ((Long) i.second).longValue());
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.uf5
    public final int g() {
        return -2147483647;
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
