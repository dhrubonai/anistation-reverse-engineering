package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qn0 extends ma2 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public qn0(kf6 kf6Var, long j, long j2, boolean z) {
        super(kf6Var);
        long max;
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new rn0(j, 2, j2);
        }
        boolean z2 = false;
        if (kf6Var.h() == 1) {
            jf6 m = kf6Var.m(0, new jf6(), 0L);
            long max2 = Math.max(0L, j);
            if (!z && !m.k && max2 != 0 && !m.h) {
                throw new rn0(1);
            }
            if (j2 == Long.MIN_VALUE) {
                max = m.m;
            } else {
                max = Math.max(0L, j2);
            }
            long j3 = m.m;
            if (j3 != -9223372036854775807L) {
                max = max > j3 ? j3 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f = max2;
            this.g = max;
            this.h = max != -9223372036854775807L ? max - max2 : -9223372036854775807L;
            if (m.i && (max == -9223372036854775807L || (j3 != -9223372036854775807L && max == j3))) {
                z2 = true;
            }
            this.i = z2;
            return;
        }
        throw new rn0(0);
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        this.e.f(0, hf6Var, z);
        long j = hf6Var.e - this.f;
        long j2 = this.h;
        long j3 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = j2 - j;
        }
        hf6Var.h(hf6Var.a, hf6Var.b, 0, j3, j, y5.c, hf6Var.f);
        return hf6Var;
    }

    @Override // defpackage.ma2, defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        this.e.m(0, jf6Var, 0L);
        long j2 = jf6Var.p;
        long j3 = this.f;
        jf6Var.p = j2 + j3;
        jf6Var.m = this.h;
        jf6Var.i = this.i;
        long j4 = jf6Var.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            jf6Var.l = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            jf6Var.l = max - j3;
        }
        long l0 = eq6.l0(j3);
        long j6 = jf6Var.e;
        if (j6 != -9223372036854775807L) {
            jf6Var.e = j6 + l0;
        }
        long j7 = jf6Var.f;
        if (j7 != -9223372036854775807L) {
            jf6Var.f = j7 + l0;
        }
        return jf6Var;
    }
}
