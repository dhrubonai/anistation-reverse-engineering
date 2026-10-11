package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o25 extends r25 implements qk5 {
    public final /* synthetic */ p25 a;

    public o25(p25 p25Var) {
        this.a = p25Var;
    }

    @Override // defpackage.qk5
    public final void a(kk5 kk5Var, int i) {
        StringBuilder s = qx1.s(i, "Session start failed. Error code ", ": ");
        s.append(tl7.v(i));
        kb0.s("RemoteCastPlayer", s.toString());
    }

    @Override // defpackage.qk5
    public final void b(kk5 kk5Var, int i) {
        this.a.k1(null);
    }

    @Override // defpackage.qk5
    public final void c(kk5 kk5Var) {
        this.a.k1(null);
    }

    @Override // defpackage.qk5
    public final void d(kk5 kk5Var, int i) {
        StringBuilder s = qx1.s(i, "Session resume failed. Error code ", ": ");
        s.append(tl7.v(i));
        kb0.s("RemoteCastPlayer", s.toString());
    }

    @Override // defpackage.qk5
    public final void e(kk5 kk5Var, boolean z) {
        this.a.k1((gi0) kk5Var);
    }

    @Override // defpackage.qk5
    public final void f(kk5 kk5Var, String str) {
        this.a.k1((gi0) kk5Var);
    }

    @Override // defpackage.qk5
    public final void g(kk5 kk5Var) {
    }

    @Override // defpackage.qk5
    public final void h(kk5 kk5Var, String str) {
    }

    @Override // defpackage.qk5
    public final void i(kk5 kk5Var, int i) {
        this.a.k1(null);
    }

    @Override // defpackage.r25
    public final void n() {
        p25 p25Var = this.a;
        p25Var.x1();
        p25Var.n.b();
    }

    @Override // defpackage.r25
    public final void o() {
        this.a.t1();
    }

    @Override // defpackage.r25
    public final void j() {
    }

    @Override // defpackage.r25
    public final void l() {
    }

    @Override // defpackage.r25
    public final void m() {
    }
}
