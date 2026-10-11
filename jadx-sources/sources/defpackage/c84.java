package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c84 extends ft5 {
    public final ub2 e;
    public final ft5 f;

    public c84(long j, kt5 kt5Var, ub2 ub2Var, ft5 ft5Var) {
        super(j, kt5Var);
        this.e = ub2Var;
        this.f = ft5Var;
        ft5Var.k();
    }

    @Override // defpackage.ft5
    public final void c() {
        ft5 ft5Var = this.f;
        if (!this.c) {
            if (this.b != ft5Var.g()) {
                a();
            }
            ft5Var.l();
            this.c = true;
            synchronized (mt5.c) {
                o();
            }
        }
    }

    @Override // defpackage.ft5
    public final ub2 e() {
        return this.e;
    }

    @Override // defpackage.ft5
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ft5
    public final ft5 u(ub2 ub2Var) {
        return new c84(this.b, this.a, mt5.i(ub2Var, this.e, true), this.f);
    }
}
