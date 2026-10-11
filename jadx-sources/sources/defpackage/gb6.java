package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gb6 implements k96 {
    public final /* synthetic */ jb6 a;
    public final /* synthetic */ boolean b;

    public gb6(jb6 jb6Var, boolean z) {
        this.a = jb6Var;
        this.b = z;
    }

    @Override // defpackage.k96
    public final void b() {
        jb6 jb6Var = this.a;
        jb6Var.q(null);
        jb6Var.p(null);
        jb6Var.u(true);
    }

    @Override // defpackage.k96
    public final void c() {
        jb6 jb6Var = this.a;
        jb6Var.q(null);
        jb6Var.p(null);
        jb6Var.u(true);
    }

    @Override // defpackage.k96
    public final void d() {
        cj2 cj2Var;
        cd6 d;
        boolean z = this.b;
        if (z) {
            cj2Var = cj2.y;
        } else {
            cj2Var = cj2.z;
        }
        jb6 jb6Var = this.a;
        jb6Var.q(cj2Var);
        long a = ih5.a(jb6Var.j(z));
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null && (d = uf3Var.d()) != null) {
            long e = d.e(a);
            jb6Var.n = e;
            jb6Var.p(new xc4(e));
            jb6Var.p = 0L;
            jb6Var.s = -1;
            uf3 uf3Var2 = jb6Var.d;
            if (uf3Var2 != null) {
                uf3Var2.q.setValue(Boolean.TRUE);
            }
            jb6Var.u(false);
        }
    }

    @Override // defpackage.k96
    public final void e(long j) {
        jb6 jb6Var = this.a;
        long f = xc4.f(jb6Var.p, j);
        jb6Var.p = f;
        jb6Var.p(new xc4(xc4.f(jb6Var.n, f)));
        mc6 l = jb6Var.l();
        xc4 g = jb6Var.g();
        g.getClass();
        jb6Var.v(l, g.a, false, this.b, l68.O, true, new tj2(9));
        jb6Var.u(false);
    }

    @Override // defpackage.k96
    public final void onCancel() {
    }

    @Override // defpackage.k96
    public final void a(long j, p65 p65Var) {
    }
}
