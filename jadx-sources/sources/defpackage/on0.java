package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class on0 implements or3, nr3 {
    public nn0[] A = new nn0[0];
    public long B;
    public boolean C;
    public boolean D;
    public long E;
    public long F;
    public long G;
    public rn0 H;
    public boolean I;
    public final or3 x;
    public final boolean y;
    public nr3 z;

    public on0(or3 or3Var, boolean z, long j, long j2, boolean z2) {
        long j3;
        this.x = or3Var;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.B = j3;
        this.E = -9223372036854775807L;
        this.y = z2;
        r(j, j2);
    }

    public static void t(pz2 pz2Var, long j, long j2) {
        ea2 ea2Var = (ea2) pz2Var.z;
        ea2Var.getClass();
        int i = ea2Var.O;
        int i2 = ea2Var.N;
        if (i2 == 0 && i == 0) {
            return;
        }
        if (j != 0) {
            i2 = 0;
        }
        if (j2 != Long.MIN_VALUE) {
            i = 0;
        }
        da2 a = ea2Var.a();
        a.M = i2;
        a.N = i;
        pz2Var.z = new ea2(a);
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        if (this.H != null) {
            return;
        }
        nr3 nr3Var = this.z;
        nr3Var.getClass();
        nr3Var.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r4 != false) goto L36;
     */
    @Override // defpackage.or3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.jz1[] r18, boolean[] r19, defpackage.g95[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            int r2 = r1.length
            nn0[] r2 = new defpackage.nn0[r2]
            r0.A = r2
            int r2 = r1.length
            g95[] r5 = new defpackage.g95[r2]
            r2 = 0
        Ld:
            int r3 = r1.length
            r10 = 0
            if (r2 >= r3) goto L22
            nn0[] r3 = r0.A
            r4 = r1[r2]
            nn0 r4 = (defpackage.nn0) r4
            r3[r2] = r4
            if (r4 == 0) goto L1d
            g95 r10 = r4.x
        L1d:
            r5[r2] = r10
            int r2 = r2 + 1
            goto Ld
        L22:
            or3 r2 = r0.x
            r3 = r18
            r4 = r19
            r6 = r21
            r7 = r22
            long r11 = r2.c(r3, r4, r5, r6, r7)
            long r2 = r0.G
            long r13 = java.lang.Math.max(r11, r7)
            r15 = -9223372036854775808
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 == 0) goto L40
            long r13 = java.lang.Math.min(r13, r2)
        L40:
            r2 = 0
            r3 = 0
        L42:
            int r4 = r1.length
            r6 = 1
            if (r2 >= r4) goto L98
            r4 = r5[r2]
            nn0[] r15 = r0.A
            if (r4 != 0) goto L4f
            r15[r2] = r10
            goto L8f
        L4f:
            r15 = r15[r2]
            if (r15 == 0) goto L57
            g95 r15 = r15.x
            if (r15 == r4) goto L8f
        L57:
            boolean r4 = r0.k()
            if (r4 == 0) goto L7f
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 >= 0) goto L63
            r4 = r6
            goto L7c
        L63:
            r15 = 0
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 == 0) goto L7b
            r4 = r18[r2]
            if (r4 == 0) goto L7b
            ea2 r4 = r4.n()
            java.lang.String r15 = r4.p
            java.lang.String r4 = r4.l
            boolean r4 = defpackage.qy3.a(r15, r4)
            r4 = r4 ^ r6
            goto L7c
        L7b:
            r4 = 0
        L7c:
            if (r4 == 0) goto L7f
            goto L80
        L7f:
            r6 = 0
        L80:
            nn0[] r4 = r0.A
            nn0 r15 = new nn0
            r9 = r5[r2]
            r9.getClass()
            r15.<init>(r0, r9, r6)
            r4[r2] = r15
            r3 = r3 | r6
        L8f:
            nn0[] r4 = r0.A
            r4 = r4[r2]
            r1[r2] = r4
            int r2 = r2 + 1
            goto L42
        L98:
            if (r3 == 0) goto L9c
            r1 = r13
            goto La1
        L9c:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La1:
            r0.B = r1
            boolean r1 = r0.D
            if (r1 == 0) goto La9
            r0.C = r6
        La9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on0.c(jz1[], boolean[], g95[], boolean[], long):long");
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.x.d();
    }

    @Override // defpackage.or3
    public final void e() {
        this.D = true;
        this.x.e();
    }

    @Override // defpackage.ui5
    public final long f() {
        long f = this.x.f();
        if (this.I) {
            long j = this.G;
            if (j != Long.MIN_VALUE && f != Long.MIN_VALUE) {
                return Math.min(j, f);
            }
        } else {
            if (f != Long.MIN_VALUE) {
                long j2 = this.G;
                if (j2 == Long.MIN_VALUE || f < j2) {
                }
            }
            return Long.MIN_VALUE;
        }
        return f;
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        nr3 nr3Var = this.z;
        nr3Var.getClass();
        nr3Var.g(this);
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        long j2;
        long j3 = this.F;
        if (j == j3) {
            return j3;
        }
        long k = eq6.k(if5Var.a, 0L, j - j3);
        long j4 = if5Var.b;
        long j5 = this.G;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long k2 = eq6.k(j4, 0L, j2);
        if (k != if5Var.a || k2 != if5Var.b) {
            if5Var = new if5(k, k2);
        }
        return this.x.h(j, if5Var);
    }

    @Override // defpackage.or3
    public final void i() {
        rn0 rn0Var = this.H;
        if (rn0Var == null) {
            this.x.i();
            return;
        }
        throw rn0Var;
    }

    @Override // defpackage.or3
    public final long j(long j) {
        this.B = -9223372036854775807L;
        for (nn0 nn0Var : this.A) {
            if (nn0Var != null) {
                nn0Var.z = false;
            }
        }
        long j2 = this.x.j(j);
        long j3 = this.F;
        long j4 = this.G;
        long max = Math.max(j2, j3);
        if (j4 != Long.MIN_VALUE) {
            return Math.min(max, j4);
        }
        return max;
    }

    public final boolean k() {
        if (this.B != -9223372036854775807L && !this.C) {
            return true;
        }
        return false;
    }

    @Override // defpackage.or3
    public final void l(long j) {
        this.x.l(j);
    }

    @Override // defpackage.or3
    public final List m(ArrayList arrayList) {
        return this.x.m(arrayList);
    }

    @Override // defpackage.or3
    public final long n() {
        if (k()) {
            this.C = true;
            long j = this.B;
            this.B = -9223372036854775807L;
            this.E = j;
            long n = n();
            if (n != -9223372036854775807L) {
                return n;
            }
            return j;
        }
        long n2 = this.x.n();
        if (n2 != -9223372036854775807L) {
            long j2 = this.F;
            long j3 = this.G;
            long max = Math.max(n2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.E) {
                this.E = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        this.z = nr3Var;
        this.x.o(this, j);
    }

    @Override // defpackage.or3
    public final zg6 p() {
        return this.x.p();
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        return this.x.q(qj3Var);
    }

    public final void r(long j, long j2) {
        boolean z;
        this.F = j;
        this.G = j2;
        if (this.y) {
            long b = this.x.b(j2);
            boolean z2 = true;
            if (b != Long.MIN_VALUE && b != j2) {
                z = false;
            } else {
                z = true;
            }
            io3.C(z, "Period updating end positions not supported, %s!=%s", b, j2);
            if (b != j2) {
                z2 = false;
            }
            this.I = z2;
        }
    }

    @Override // defpackage.ui5
    public final long s() {
        long s = this.x.s();
        if (this.I) {
            long j = this.G;
            if (j != Long.MIN_VALUE && s != Long.MIN_VALUE) {
                return Math.min(j, s);
            }
        } else {
            if (s != Long.MIN_VALUE) {
                long j2 = this.G;
                if (j2 == Long.MIN_VALUE || s < j2) {
                }
            }
            return Long.MIN_VALUE;
        }
        return s;
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        this.x.v(j);
    }
}
