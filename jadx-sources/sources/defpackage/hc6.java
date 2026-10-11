package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hc6 extends xz3 implements wu0, ra3 {
    public final xd6 L;
    public ll6 M;
    public fc6 N;

    public hc6(xd6 xd6Var) {
        this.L = xd6Var;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        xd6 j = ez5.j(this.L, wc7.O(this).W);
        p82 p82Var = (p82) t80.C(this, bv0.k);
        a1(j, p82Var);
        ia3 ia3Var = wc7.O(this).W;
        ud1 ud1Var = wc7.O(this).V;
        ll6 ll6Var = this.M;
        if (ll6Var != null) {
            this.N = new fc6(ia3Var, ud1Var, p82Var, j, ll6Var.getValue());
            return;
        }
        throw qx1.e("Font resolution state is not set.");
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.M = null;
        this.N = null;
    }

    @Override // defpackage.yc1
    public final void V() {
        fc6 fc6Var = this.N;
        if (fc6Var != null) {
            fc6.a(fc6Var, wc7.O(this).W, null, null, 30);
        }
        w65.E(this);
    }

    public final void a1(xd6 xd6Var, p82 p82Var) {
        int i;
        int i2;
        pv5 pv5Var = xd6Var.a;
        q82 q82Var = pv5Var.f;
        s92 s92Var = pv5Var.c;
        if (s92Var == null) {
            s92Var = s92.B;
        }
        o92 o92Var = pv5Var.d;
        if (o92Var != null) {
            i = o92Var.a;
        } else {
            i = 0;
        }
        p92 p92Var = pv5Var.e;
        if (p92Var != null) {
            i2 = p92Var.a;
        } else {
            i2 = 65535;
        }
        this.M = ((s82) p82Var).b(q82Var, s92Var, i, i2);
        w65.E(this);
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        fc6 fc6Var = this.N;
        if (fc6Var != null) {
            ti4 ti4Var = fc6Var.f;
            ll6 ll6Var = this.M;
            if (ll6Var != null) {
                Object value = ll6Var.getValue();
                if (!a34.i(value, fc6Var.e)) {
                    fc6Var.e = value;
                    ti4Var.setValue(Boolean.TRUE);
                }
                if (((Boolean) ti4Var.getValue()).booleanValue()) {
                    fc6Var.g = ga6.a(fc6Var.d, fc6Var.b, fc6Var.c);
                    ti4Var.setValue(Boolean.FALSE);
                }
                long j2 = fc6Var.g;
                em4 p = ro3Var.p(sx0.e(j, sx0.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
                return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 16));
            }
            throw qx1.e("Font resolution state is not set.");
        }
        throw qx1.e("Min size state is not set.");
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        fc6 fc6Var = this.N;
        if (fc6Var != null) {
            fc6.a(fc6Var, null, wc7.O(this).V, null, 29);
        }
        w65.E(this);
    }
}
