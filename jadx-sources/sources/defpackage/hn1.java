package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hn1 extends xz3 implements jj6, in1, fa3 {
    public final ub2 L;
    public hn1 M;
    public in1 N;
    public long O;

    public hn1(b0 b0Var, int i) {
        this.L = (i & 2) != 0 ? null : b0Var;
        this.O = 0L;
    }

    @Override // defpackage.in1
    public final void B(an1 an1Var) {
        lz0 lz0Var = new lz0(an1Var, (byte) 4);
        if (lz0Var.invoke(this) != ij6.x) {
            return;
        }
        iv5.l(this, lz0Var);
    }

    @Override // defpackage.in1
    public final boolean M0(an1 an1Var) {
        hn1 hn1Var = this.M;
        if (hn1Var == null) {
            in1 in1Var = this.N;
            if (in1Var != null) {
                return in1Var.M0(an1Var);
            }
            return false;
        }
        return hn1Var.M0(an1Var);
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.N = null;
        this.M = null;
    }

    @Override // defpackage.fa3, defpackage.yo3
    public final void a(long j) {
        this.O = j;
    }

    @Override // defpackage.in1
    public final void j0(an1 an1Var) {
        in1 in1Var = this.N;
        if (in1Var != null) {
            in1Var.j0(an1Var);
        }
        hn1 hn1Var = this.M;
        if (hn1Var != null) {
            hn1Var.j0(an1Var);
        }
        this.M = null;
    }

    @Override // defpackage.jj6
    public final Object p() {
        return p7.I;
    }

    @Override // defpackage.in1
    public final void r0(an1 an1Var) {
        in1 in1Var = this.N;
        if (in1Var == null) {
            hn1 hn1Var = this.M;
            if (hn1Var != null) {
                hn1Var.r0(an1Var);
                return;
            }
            return;
        }
        in1Var.r0(an1Var);
    }

    @Override // defpackage.in1
    public final void t(an1 an1Var) {
        in1 in1Var = this.N;
        if (in1Var == null) {
            hn1 hn1Var = this.M;
            if (hn1Var != null) {
                hn1Var.t(an1Var);
                return;
            }
            return;
        }
        in1Var.t(an1Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w05] */
    @Override // defpackage.in1
    public final void t0(an1 an1Var) {
        jj6 jj6Var;
        hn1 hn1Var;
        hn1 hn1Var2 = this.M;
        if (hn1Var2 != null && q23.r(hn1Var2, a34.e0(an1Var))) {
            hn1Var = hn1Var2;
        } else {
            if (!this.x.K) {
                jj6Var = null;
            } else {
                ?? obj = new Object();
                iv5.l(this, new gn1(obj, this, an1Var, (byte) 0));
                jj6Var = (jj6) obj.x;
            }
            hn1Var = (hn1) jj6Var;
        }
        if (hn1Var != null && hn1Var2 == null) {
            hn1Var.t(an1Var);
            hn1Var.t0(an1Var);
            in1 in1Var = this.N;
            if (in1Var != null) {
                in1Var.j0(an1Var);
            }
        } else if (hn1Var == null && hn1Var2 != null) {
            in1 in1Var2 = this.N;
            if (in1Var2 != null) {
                in1Var2.t(an1Var);
                in1Var2.t0(an1Var);
            }
            hn1Var2.j0(an1Var);
        } else if (!a34.i(hn1Var, hn1Var2)) {
            if (hn1Var != null) {
                hn1Var.t(an1Var);
                hn1Var.t0(an1Var);
            }
            if (hn1Var2 != null) {
                hn1Var2.j0(an1Var);
            }
        } else if (hn1Var != null) {
            hn1Var.t0(an1Var);
        } else {
            in1 in1Var3 = this.N;
            if (in1Var3 != null) {
                in1Var3.t0(an1Var);
            }
        }
        this.M = hn1Var;
    }
}
