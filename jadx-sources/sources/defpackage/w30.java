package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w30 implements kp4 {
    public x25 A;
    public int B;
    public cp4 C;
    public f46 D;
    public byte E;
    public g95 F;
    public ea2[] G;
    public long H;
    public long I;
    public boolean K;
    public boolean L;
    public jw3 N;
    public mb1 P;
    public final byte y;
    public final Object x = new Object();
    public final pz2 z = new pz2((byte) 25, false);
    public long J = Long.MIN_VALUE;
    public kf6 M = kf6.a;
    public long O = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public w30(int i) {
        this.y = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static boolean l(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            if (!z || i2 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void A(ea2[] ea2VarArr, g95 g95Var, long j, long j2, jw3 jw3Var) {
        io3.B(!this.K);
        this.F = g95Var;
        this.N = jw3Var;
        G();
        if (this.J == Long.MIN_VALUE) {
            this.J = j;
        }
        this.G = ea2VarArr;
        this.H = j2;
        w(ea2VarArr, j, j2, jw3Var);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.K = false;
        this.I = j;
        this.J = j;
        if (!z2) {
            g95 g95Var = this.F;
            g95Var.getClass();
            if (g95Var.t(j - this.H) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        r(j, z, z2);
    }

    public int D(ea2 ea2Var) {
        if ("application/x-camera-motion".equals(ea2Var.p)) {
            return a(4, 0, 0, 0);
        }
        return a(0, 0, 0, 0);
    }

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    public final void G() {
        jw3 jw3Var;
        if (!this.M.p() && (jw3Var = this.N) != null) {
            int b = this.M.b(jw3Var.a);
            if (b == -1) {
                this.O = -9223372036854775807L;
                return;
            }
            hf6 f = this.M.f(b, new hf6(), false);
            this.O = f.d;
            int i = jw3Var.b;
            if (i != -1) {
                this.O = f.g.a(i).e[jw3Var.c];
                return;
            }
            int i2 = jw3Var.e;
            if (i2 != -1) {
                f.g.a(i2).getClass();
                this.O = 0L;
                return;
            }
            return;
        }
        this.O = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yx1 d(java.lang.Throwable r11, defpackage.ea2 r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1a
            boolean r2 = r10.L
            if (r2 != 0) goto L1a
            r2 = 1
            r10.L = r2
            r2 = 0
            int r3 = r10.D(r12)     // Catch: java.lang.Throwable -> L14 defpackage.yx1 -> L18
            r3 = r3 & 7
            r10.L = r2
            goto L1b
        L14:
            r0 = move-exception
            r10.L = r2
            throw r0
        L18:
            r10.L = r2
        L1a:
            r3 = r0
        L1b:
            java.lang.String r4 = r10.i()
            int r5 = r10.B
            jw3 r8 = r10.N
            r1 = r0
            yx1 r0 = new yx1
            if (r12 != 0) goto L2a
            r7 = r1
            goto L2b
        L2a:
            r7 = r3
        L2b:
            r1 = 1
            r2 = r11
            r6 = r12
            r9 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.d(java.lang.Throwable, ea2, boolean, int):yx1");
    }

    public long g(long j, long j2) {
        if (this.E == 1) {
            if (n() || k()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public fp3 h() {
        return null;
    }

    public String i() {
        return "CameraMotionRenderer";
    }

    public final boolean j() {
        if (this.J == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public boolean k() {
        return j();
    }

    public boolean n() {
        return true;
    }

    public final int y(pz2 pz2Var, q61 q61Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        g95 g95Var = this.F;
        g95Var.getClass();
        int I = g95Var.I(pz2Var, q61Var, i);
        if (I == -4) {
            if (q61Var.d(4)) {
                if (!z) {
                    this.J = Long.MIN_VALUE;
                }
                if (this.K) {
                    return -4;
                }
                return -3;
            }
            long j = q61Var.D + this.H;
            q61Var.D = j;
            if (!z) {
                this.J = Math.max(this.J, j);
                return I;
            }
        } else if (I == -5) {
            ea2 ea2Var = (ea2) pz2Var.z;
            ea2Var.getClass();
            long j2 = ea2Var.u;
            if (j2 != Long.MAX_VALUE) {
                da2 a = ea2Var.a();
                a.t = j2 + this.H;
                pz2Var.z = new ea2(a);
            }
        }
        return I;
    }

    public abstract void z(long j, long j2);

    public void f() {
    }

    public void p() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f, float f2) {
    }

    @Override // defpackage.kp4
    public void c(int i, Object obj) {
    }

    public void q(boolean z, boolean z2) {
    }

    public void r(long j, boolean z, boolean z2) {
    }

    public void w(ea2[] ea2VarArr, long j, long j2, jw3 jw3Var) {
    }
}
