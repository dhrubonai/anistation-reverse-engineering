package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fj6 extends ft5 {
    public final ft5 e;
    public final boolean f;
    public final boolean g;
    public ub2 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj6(ft5 ft5Var, ub2 ub2Var, boolean z, boolean z2) {
        super(0L, kt5.B);
        ub2 e;
        tg5 tg5Var = mt5.a;
        this.e = ft5Var;
        this.f = z;
        this.g = z2;
        this.h = mt5.i(ub2Var, (ft5Var == null || (e = ft5Var.e()) == null) ? mt5.j.e : e, z);
        this.i = nz5.c();
    }

    @Override // defpackage.ft5
    public final void c() {
        ft5 ft5Var;
        this.c = true;
        if (this.g && (ft5Var = this.e) != null) {
            ft5Var.c();
        }
    }

    @Override // defpackage.ft5
    public final kt5 d() {
        return v().d();
    }

    @Override // defpackage.ft5
    public final ub2 e() {
        return this.h;
    }

    @Override // defpackage.ft5
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ft5
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ft5
    public final ub2 i() {
        return null;
    }

    @Override // defpackage.ft5
    public final void k() {
        q23.W();
        throw null;
    }

    @Override // defpackage.ft5
    public final void l() {
        q23.W();
        throw null;
    }

    @Override // defpackage.ft5
    public final void m() {
        v().m();
    }

    @Override // defpackage.ft5
    public final void n(xx5 xx5Var) {
        v().n(xx5Var);
    }

    @Override // defpackage.ft5
    public final ft5 u(ub2 ub2Var) {
        ub2 i = mt5.i(ub2Var, this.h, true);
        if (!this.f) {
            return mt5.e(v().u(null), i, true);
        }
        return v().u(i);
    }

    public final ft5 v() {
        ft5 ft5Var = this.e;
        if (ft5Var == null) {
            return mt5.j;
        }
        return ft5Var;
    }
}
