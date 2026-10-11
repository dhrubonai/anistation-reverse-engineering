package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uy4 extends ft5 {
    public final ub2 e;
    public int f;

    public uy4(long j, kt5 kt5Var, ub2 ub2Var) {
        super(j, kt5Var);
        this.e = ub2Var;
        this.f = 1;
    }

    @Override // defpackage.ft5
    public final void c() {
        if (!this.c) {
            l();
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
    public final ub2 i() {
        return null;
    }

    @Override // defpackage.ft5
    public final void k() {
        this.f++;
    }

    @Override // defpackage.ft5
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ft5
    public final void n(xx5 xx5Var) {
        tg5 tg5Var = mt5.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ft5
    public final ft5 u(ub2 ub2Var) {
        mt5.v(this);
        return new c84(this.b, this.a, mt5.i(ub2Var, this.e, true), this);
    }

    @Override // defpackage.ft5
    public final void m() {
    }
}
