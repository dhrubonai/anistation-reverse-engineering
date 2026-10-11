package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yk2 extends xz3 implements wu0, ra3, mc4 {
    public xd6 L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public xd6 R;
    public ll6 S;

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        int i;
        int i2;
        p82 p82Var = (p82) t80.C(this, bv0.k);
        this.R = ez5.j(this.L, wc7.O(this).W);
        q82 q82Var = c1().a.f;
        s92 s92Var = c1().a.c;
        if (s92Var == null) {
            s92Var = s92.B;
        }
        o92 o92Var = c1().a.d;
        if (o92Var != null) {
            i = o92Var.a;
        } else {
            i = 0;
        }
        p92 p92Var = c1().a.e;
        if (p92Var != null) {
            i2 = p92Var.a;
        } else {
            i2 = 65535;
        }
        this.S = ((s82) p82Var).b(q82Var, s92Var, i, i2);
        h98.I(this, new xk2(this, (byte) 0));
        this.O = true;
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.R = null;
        this.S = null;
        this.O = false;
    }

    @Override // defpackage.yc1
    public final void V() {
        this.R = ez5.j(this.L, wc7.O(this).W);
        this.O = true;
        w65.E(this);
    }

    public final void a1(xo3 xo3Var, xd6 xd6Var, p82 p82Var) {
        zc6 zc6Var = ga6.b(xd6Var, xo3Var, p82Var, 3, true).d;
        float g = zc6Var.g(0);
        float g2 = zc6Var.g(1);
        float g3 = zc6Var.g(2);
        this.P = q23.q(g, g2, g3, this.M, 1);
        this.Q = q23.q(g, g2, g3, this.N, Integer.MAX_VALUE);
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        b1(yl3Var);
        int i2 = this.P;
        int i3 = this.Q;
        if (i2 == i3) {
            return i3;
        }
        int c = ro3Var.c(i);
        int i4 = this.P;
        int i5 = this.Q;
        if (c < i4) {
            c = i4;
        }
        if (c > i5) {
            return i5;
        }
        return c;
    }

    public final void b1(yl3 yl3Var) {
        int i = 0;
        if (this.O) {
            a1(yl3Var, c1(), (p82) t80.C(this, bv0.k));
            this.O = false;
        }
        int i2 = this.P;
        if (i2 >= 0) {
            i = i2;
        }
        this.P = i;
        int i3 = this.Q;
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        this.Q = i3;
    }

    public final xd6 c1() {
        xd6 xd6Var = this.R;
        if (xd6Var != null) {
            return xd6Var;
        }
        throw qx1.e("Resolved style is not set.");
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int i;
        int g;
        if (this.O) {
            a1(xo3Var, c1(), (p82) t80.C(this, bv0.k));
            this.O = false;
        }
        int i2 = this.P;
        if (i2 != -1) {
            i = db.C(i2, rx0.i(j), rx0.g(j));
        } else {
            i = rx0.i(j);
        }
        int i3 = i;
        int i4 = this.Q;
        if (i4 != -1) {
            g = db.C(i4, rx0.i(j), rx0.g(j));
        } else {
            g = rx0.g(j);
        }
        em4 p = ro3Var.p(rx0.a(j, 0, 0, i3, g, 3));
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 8));
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        this.O = true;
        w65.E(this);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        b1(yl3Var);
        int i2 = this.P;
        if (i2 == this.Q) {
            return i2;
        }
        int O = ro3Var.O(i);
        int i3 = this.P;
        int i4 = this.Q;
        if (O < i3) {
            O = i3;
        }
        if (O > i4) {
            return i4;
        }
        return O;
    }

    @Override // defpackage.mc4
    public final void q0() {
        if (this.S != null) {
            h98.I(this, new xk2(this, (byte) 1));
        }
        this.O = true;
        w65.E(this);
    }
}
