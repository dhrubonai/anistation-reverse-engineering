package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ta3 extends fa4 {
    public static final ad B0;
    public sa3 A0;
    public ra3 z0;

    static {
        ad l = n77.l();
        int i = ep0.j;
        l.r(ep0.g);
        l.x(1.0f);
        l.y(1);
        B0 = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ta3(za3 za3Var, ra3 ra3Var) {
        super(za3Var);
        sa3 sa3Var;
        this.z0 = ra3Var;
        if (za3Var.E != null) {
            sa3Var = new sa3(this);
        } else {
            sa3Var = null;
        }
        this.A0 = sa3Var;
        if ((((xz3) ra3Var).x.z & 512) == 0) {
            return;
        }
        ov3.d();
        throw null;
    }

    public final void B1() {
        if (this.K) {
            return;
        }
        k1();
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        boolean z = fa4Var.L;
        fa4Var.L = this.L;
        u0().b();
        fa4Var.L = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(ra3 ra3Var) {
        if (!ra3Var.equals(this.z0) && (((xz3) ra3Var).x.z & 512) != 0) {
            ov3.d();
        } else {
            this.z0 = ra3Var;
        }
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        ra3 ra3Var = this.z0;
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        return ra3Var.m0(this, fa4Var, i);
    }

    @Override // defpackage.fa4
    public final void T0() {
        if (this.A0 == null) {
            this.A0 = new sa3(this);
        }
    }

    @Override // defpackage.em4
    public final void V(long j, float f, ub2 ub2Var) {
        p1(j, f, ub2Var, null);
        B1();
    }

    @Override // defpackage.fa4
    public final am3 W0() {
        return this.A0;
    }

    @Override // defpackage.fa4, defpackage.em4
    public final void Y(long j, float f, di2 di2Var) {
        p1(j, f, null, di2Var);
        B1();
    }

    @Override // defpackage.fa4
    public final xz3 Y0() {
        return ((xz3) this.z0).x;
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        ra3 ra3Var = this.z0;
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        return ra3Var.b0(this, fa4Var, i);
    }

    @Override // defpackage.yl3
    public final int j0(f7 f7Var) {
        sa3 sa3Var = this.A0;
        if (sa3Var != null) {
            b44 b44Var = sa3Var.W;
            int d = b44Var.d(f7Var);
            if (d >= 0) {
                return b44Var.c[d];
            }
            return Integer.MIN_VALUE;
        }
        return oi4.i(this, f7Var);
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        ra3 ra3Var = this.z0;
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        return ra3Var.y0(this, fa4Var, i);
    }

    @Override // defpackage.ro3
    public final int n(int i) {
        ra3 ra3Var = this.z0;
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        return ra3Var.j(this, fa4Var, i);
    }

    @Override // defpackage.fa4
    public final void o1(vg0 vg0Var, di2 di2Var) {
        fa4 fa4Var;
        fa4 fa4Var2 = this.S;
        fa4Var2.getClass();
        fa4Var2.R0(vg0Var, di2Var);
        if (((oa) cb3.a(this.R)).getShowLayoutBounds() && (fa4Var = this.S) != null) {
            if (!k13.a(this.z, fa4Var.z) || !c13.b(fa4Var.c0, 0L)) {
                long j = this.z;
                vg0Var.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, B0);
            }
        }
    }

    @Override // defpackage.ro3
    public final em4 p(long j) {
        b0(j);
        ra3 ra3Var = this.z0;
        fa4 fa4Var = this.S;
        fa4Var.getClass();
        s1(ra3Var.e(this, fa4Var, j));
        j1();
        return this;
    }
}
