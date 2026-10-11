package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class g97 extends lu0 {
    public final lw3 k;

    public g97(lw3 lw3Var) {
        this.k = lw3Var;
    }

    public void A() {
        x(null, this.k);
    }

    @Override // defpackage.lw3
    public final ar3 c() {
        return this.k.c();
    }

    @Override // defpackage.lw3
    public final boolean e() {
        return this.k.e();
    }

    @Override // defpackage.lw3
    public final kf6 f() {
        return this.k.f();
    }

    @Override // defpackage.lw3
    public void g(ar3 ar3Var) {
        this.k.g(ar3Var);
    }

    @Override // defpackage.t30
    public final void n(n71 n71Var) {
        this.j = eq6.p(null);
        A();
    }

    @Override // defpackage.lu0
    public final jw3 t(Object obj, jw3 jw3Var) {
        return y(jw3Var);
    }

    @Override // defpackage.lu0
    public final long u(long j, Object obj) {
        return j;
    }

    @Override // defpackage.lu0
    public final int v(int i, Object obj) {
        return i;
    }

    @Override // defpackage.lu0
    public final void w(Object obj, t30 t30Var, kf6 kf6Var) {
        z(kf6Var);
    }

    public abstract void z(kf6 kf6Var);

    public jw3 y(jw3 jw3Var) {
        return jw3Var;
    }
}
