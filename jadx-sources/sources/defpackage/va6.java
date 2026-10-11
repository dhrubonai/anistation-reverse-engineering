package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class va6 extends zc1 implements wu0, zo1, sh5, wz3 {
    public gi6 N;
    public cc6 O;
    public dd6 P;
    public boolean Q;
    public final ti4 R;
    public final wj S;
    public final km3 T;
    public bx5 U;

    public va6(gi6 gi6Var, cc6 cc6Var, dd6 dd6Var, boolean z) {
        this.N = gi6Var;
        this.O = cc6Var;
        this.P = dd6Var;
        this.Q = z;
        ti4 g = xt5.g(new k13(0L));
        this.R = g;
        this.S = new wj(new xc4(wt5.e(this.N, this.O, this.P, ((k13) g.getValue()).a)), kh5.b, new xc4(kh5.c), 8);
        final byte b = 0;
        ub2 ub2Var = new ub2(this) { // from class: ua6
            public final /* synthetic */ va6 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                byte b2 = b;
                va6 va6Var = this.y;
                switch (b2) {
                    case 0:
                        return (xc4) va6Var.S.d();
                    default:
                        ym1 ym1Var = (ym1) obj;
                        ud1 ud1Var = (ud1) t80.C(va6Var, bv0.h);
                        va6Var.R.setValue(new k13((ud1Var.x0(ym1.b(ym1Var.a)) << 32) | (ud1Var.x0(ym1.a(ym1Var.a)) & 4294967295L)));
                        return pn6.a;
                }
            }
        };
        final byte b2 = 1;
        ub2 ub2Var2 = new ub2(this) { // from class: ua6
            public final /* synthetic */ va6 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                byte b22 = b2;
                va6 va6Var = this.y;
                switch (b22) {
                    case 0:
                        return (xc4) va6Var.S.d();
                    default:
                        ym1 ym1Var = (ym1) obj;
                        ud1 ud1Var = (ud1) t80.C(va6Var, bv0.h);
                        va6Var.R.setValue(new k13((ud1Var.x0(ym1.b(ym1Var.a)) << 32) | (ud1Var.x0(ym1.a(ym1Var.a)) & 4294967295L)));
                        return pn6.a;
                }
            }
        };
        pk2 pk2Var = pk2.b0;
        ai5 ai5Var = lm3.a;
        km3 km3Var = new km3(ub2Var, ub2Var2, pk2Var);
        a1(km3Var);
        this.T = km3Var;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        this.T.I0(bi5Var);
    }

    @Override // defpackage.xz3
    public final void S0() {
        d1();
    }

    public final void d1() {
        bx5 bx5Var = this.U;
        vz0 vz0Var = null;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.U = null;
        ai5 ai5Var = lm3.a;
        if (!this.Q && (((xc4) this.S.d()).a & 9223372034707292159L) != 9205357640488583168L) {
            tl7.z(O0(), null, y11.A, new hu1(this, vz0Var, (byte) 27), 1);
        }
        this.U = tl7.z(O0(), null, null, new e52(this, vz0Var, (byte) 29), 3);
    }

    public final void f0(fa4 fa4Var) {
        this.T.f0(fa4Var);
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        bb3Var.a();
        this.T.u0(bb3Var);
    }
}
