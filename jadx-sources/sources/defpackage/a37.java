package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a37 implements hf5 {
    public final gp0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public a37(gp0 gp0Var, int i, long j, long j2) {
        this.a = gp0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / gp0Var.c;
        this.d = j3;
        this.e = i(j3);
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        gp0 gp0Var = this.a;
        long j2 = this.d - 1;
        long k = eq6.k((gp0Var.b * j) / (this.b * 1000000), 0L, j2);
        int i = gp0Var.c;
        long j3 = this.c;
        long i2 = i(k);
        jf5 jf5Var = new jf5(i2, (i * k) + j3);
        if (i2 < j && k != j2) {
            long j4 = k + 1;
            return new gf5(jf5Var, new jf5(i(j4), (i * j4) + j3));
        }
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = eq6.a;
        return eq6.e0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
