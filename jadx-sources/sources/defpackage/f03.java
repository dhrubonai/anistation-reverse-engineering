package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class f03 extends a03 implements ra3 {
    public t47 N;

    public f03(t47 t47Var) {
        this.N = t47Var;
    }

    @Override // defpackage.a03
    public final t47 a1(t47 t47Var) {
        return new mn6(t47Var, this.N);
    }

    @Override // defpackage.a03
    public final void b1() {
        super.b1();
        w65.E(this);
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int d = this.M.d(xo3Var, xo3Var.getLayoutDirection()) - this.L.d(xo3Var, xo3Var.getLayoutDirection());
        int a = this.M.a(xo3Var) - this.L.a(xo3Var);
        int b = (this.M.b(xo3Var, xo3Var.getLayoutDirection()) - this.L.b(xo3Var, xo3Var.getLayoutDirection())) + d;
        int c = (this.M.c(xo3Var) - this.L.c(xo3Var)) + a;
        em4 p = ro3Var.p(sx0.i(-b, j, -c));
        return xo3Var.L(sx0.g(p.x + b, j), sx0.f(p.y + c, j), ot1.x, new e03(p, d, a, (byte) 0));
    }
}
