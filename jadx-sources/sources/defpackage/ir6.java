package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ir6 extends xh4 {
    public final ti4 C = xt5.g(new uq5(0));
    public final ti4 D = xt5.g(Boolean.FALSE);
    public final cr6 E;
    public final ti4 F;
    public float G;
    public w60 H;

    public ir6(ni2 ni2Var) {
        cr6 cr6Var = new cr6(ni2Var);
        cr6Var.f = new e96(this, (byte) 6);
        this.E = cr6Var;
        this.F = new ti4(pn6.a, h95.H);
        this.G = 1.0f;
    }

    @Override // defpackage.xh4
    public final boolean d(float f) {
        this.G = f;
        return true;
    }

    @Override // defpackage.xh4
    public final boolean e(w60 w60Var) {
        this.H = w60Var;
        return true;
    }

    @Override // defpackage.xh4
    public final long h() {
        return ((uq5) this.C.getValue()).a;
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        w60 w60Var = this.H;
        cr6 cr6Var = this.E;
        if (w60Var == null) {
            w60Var = (w60) cr6Var.g.getValue();
        }
        if (((Boolean) this.D.getValue()).booleanValue() && bp1Var.getLayoutDirection() == ia3.y) {
            long A0 = bp1Var.A0();
            dn0 n0 = bp1Var.n0();
            long B = n0.B();
            n0.y().h();
            try {
                ((af2) n0.y).r(-1.0f, 1.0f, A0);
                cr6Var.e(bp1Var, this.G, w60Var);
            } finally {
                h11.u(n0, B);
            }
        } else {
            cr6Var.e(bp1Var, this.G, w60Var);
        }
        this.F.getValue();
    }
}
