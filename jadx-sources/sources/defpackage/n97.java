package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n97 implements uf5 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public n97(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = z51.j(j3 - i, j2);
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.uf5
    public final long a() {
        return this.f;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.uf5
    public final long c(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (b() && j3 > this.b) {
            long[] jArr = this.g;
            jArr.getClass();
            double d2 = (j3 * 256.0d) / this.e;
            int f = eq6.f(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (f * j4) / 100;
            long j6 = jArr[f];
            int i = f + 1;
            long j7 = (j4 * i) / 100;
            if (f == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        double d;
        double d2;
        boolean b = b();
        int i = this.b;
        long j2 = this.a;
        if (!b) {
            jf5 jf5Var = new jf5(0L, j2 + i);
            return new gf5(jf5Var, jf5Var);
        }
        long k = eq6.k(j, 0L, this.c);
        double d3 = (k * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.e;
        jf5 jf5Var2 = new jf5(k, j2 + eq6.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new gf5(jf5Var2, jf5Var2);
    }

    @Override // defpackage.uf5
    public final int g() {
        return this.d;
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
