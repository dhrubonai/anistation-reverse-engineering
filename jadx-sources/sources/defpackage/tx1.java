package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class tx1 extends w30 {
    public long Q;
    public b95 R;
    public p71 S;
    public boolean T;
    public ea2 U;
    public ea2 V;
    public final ok2 W;
    public final zs X;
    public final q61 Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;

    public tx1(int i, ok2 ok2Var, zs zsVar) {
        super(i);
        this.W = ok2Var;
        this.X = zsVar;
        this.Y = new q61(0);
    }

    @Override // defpackage.w30
    public final int D(ea2 ea2Var) {
        int i;
        if (qy3.h(ea2Var.p) == this.y) {
            i = 4;
        } else {
            i = 0;
        }
        return w30.a(i, 0, 0, 0);
    }

    public final boolean H() {
        if (this.R != null) {
            return true;
        }
        ea2 ea2Var = this.V;
        if (ea2Var == null) {
            if (this.S != null && yu5.g(this.U.p) == 1) {
                p71 p71Var = this.S;
                p71Var.f(false);
                ea2 ea2Var2 = p71Var.j;
                if (ea2Var2 != null) {
                    ea2Var = N(ea2Var2);
                    this.V = ea2Var;
                }
                return false;
            }
            ea2Var = N(this.U);
            this.V = ea2Var;
        }
        b95 d = this.X.d(ea2Var);
        if (d != null) {
            this.R = d;
            return true;
        }
        return false;
    }

    public abstract boolean I();

    public abstract void J(ea2 ea2Var);

    public final boolean O(q61 q61Var) {
        pz2 pz2Var = this.z;
        pz2Var.m();
        int y = y(pz2Var, q61Var, 0);
        if (y != -5) {
            if (y != -4) {
                return false;
            }
            q61Var.k();
            if (!q61Var.d(4)) {
                this.W.E(this.y, q61Var.D);
                return true;
            }
            return true;
        }
        ze0.m("Format changes are not supported.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        if (r5 != (-5)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P() {
        /*
            r7 = this;
            ea2 r0 = r7.U
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r2 = r7.a0
            if (r2 != 0) goto Lb
            goto L79
        Lb:
            r2 = 2
            r3 = 0
            if (r0 != 0) goto L5d
            pz2 r0 = r7.z
            r0.m()
            q61 r4 = r7.Y
            int r5 = r7.y(r0, r4, r2)
            r6 = -4
            if (r5 != r6) goto L2e
            r6 = 4
            boolean r4 = r4.d(r6)
            if (r4 == 0) goto L2e
            ea2[] r4 = r7.G
            r4.getClass()
            r4 = r4[r3]
            r0.z = r4
            goto L32
        L2e:
            r4 = -5
            if (r5 == r4) goto L32
            goto L71
        L32:
            java.lang.Object r0 = r0.z
            ea2 r0 = (defpackage.ea2) r0
            r0.getClass()
            ea2 r0 = r7.M(r0)
            r7.U = r0
            r7.L(r0)
            ea2 r0 = r7.U
            if (r0 != 0) goto L47
            goto L71
        L47:
            zs r4 = r7.X
            r5 = 3
            boolean r0 = r4.g(r5, r0)
            if (r0 == 0) goto L5a
            ea2 r0 = r7.U
            boolean r0 = r7.R(r0)
            if (r0 != 0) goto L5a
            r0 = r1
            goto L5b
        L5a:
            r0 = r3
        L5b:
            r7.a0 = r0
        L5d:
            boolean r0 = r7.a0
            if (r0 == 0) goto L79
            ea2 r0 = r7.U
            java.lang.String r0 = r0.p
            int r0 = defpackage.yu5.g(r0)
            if (r0 != r2) goto L72
            boolean r0 = r7.H()
            if (r0 != 0) goto L72
        L71:
            return r3
        L72:
            ea2 r0 = r7.U
            r7.J(r0)
            r7.a0 = r3
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx1.P():boolean");
    }

    public boolean Q(q61 q61Var) {
        if (!q61Var.d(4)) {
            long j = q61Var.D - this.Q;
            q61Var.D = j;
            if (this.S != null && j < 0) {
                q61Var.f();
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean R(ea2 ea2Var) {
        return false;
    }

    @Override // defpackage.w30
    public final fp3 h() {
        return this.W;
    }

    @Override // defpackage.w30
    public final boolean k() {
        return this.T;
    }

    @Override // defpackage.w30
    public final boolean n() {
        return true;
    }

    @Override // defpackage.w30
    public final void q(boolean z, boolean z2) {
        this.W.E(this.y, 0L);
    }

    @Override // defpackage.w30
    public final void t() {
        p71 p71Var = this.S;
        if (p71Var != null) {
            p71Var.h();
        }
    }

    @Override // defpackage.w30
    public final void u() {
        this.Z = true;
    }

    @Override // defpackage.w30
    public final void v() {
        this.Z = false;
    }

    @Override // defpackage.w30
    public final void w(ea2[] ea2VarArr, long j, long j2, jw3 jw3Var) {
        this.Q = j;
    }

    @Override // defpackage.w30
    public final void z(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            if (this.Z && !this.T && P()) {
                if (this.S == null) {
                    if (!H()) {
                        return;
                    }
                    do {
                        q61 b = this.R.b();
                        if (b != null) {
                            if (!this.b0) {
                                if (O(b)) {
                                    if (Q(b)) {
                                        z = true;
                                    } else {
                                        this.b0 = true;
                                    }
                                }
                            }
                            boolean d = b.d(4);
                            if (this.R.g()) {
                                this.b0 = false;
                                this.T = d;
                                z = !d;
                            }
                        }
                        z = false;
                    } while (z);
                    return;
                }
                do {
                    if (H()) {
                        z2 = I();
                    } else {
                        z2 = false;
                    }
                    p71 p71Var = this.S;
                    q61 q61Var = this.Y;
                    if (p71Var.e(q61Var) && O(q61Var)) {
                        if (!Q(q61Var)) {
                            K(q61Var);
                            this.S.g(q61Var);
                        }
                        z3 = true;
                    }
                    z3 = false;
                } while (z2 | z3);
            }
        } catch (oz1 e) {
            this.Z = false;
            this.X.b(e);
        }
    }

    public void K(q61 q61Var) {
    }

    public void L(ea2 ea2Var) {
    }

    public ea2 M(ea2 ea2Var) {
        return ea2Var;
    }

    public ea2 N(ea2 ea2Var) {
        return ea2Var;
    }
}
