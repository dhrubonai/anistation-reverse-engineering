package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fb6 implements k96 {
    public final /* synthetic */ jb6 a;

    public fb6(jb6 jb6Var) {
        this.a = jb6Var;
    }

    @Override // defpackage.k96
    public final void a(long j, p65 p65Var) {
        cd6 d;
        jb6 jb6Var = this.a;
        long a = ih5.a(jb6Var.j(true));
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null && (d = uf3Var.d()) != null) {
            long e = d.e(a);
            jb6Var.n = e;
            jb6Var.p(new xc4(e));
            jb6Var.p = 0L;
            jb6Var.q(cj2.x);
            jb6Var.u(false);
        }
    }

    @Override // defpackage.k96
    public final void b() {
        jb6 jb6Var = this.a;
        jb6Var.q(null);
        jb6Var.p(null);
    }

    @Override // defpackage.k96
    public final void c() {
        jb6 jb6Var = this.a;
        jb6Var.q(null);
        jb6Var.p(null);
    }

    @Override // defpackage.k96
    public final void e(long j) {
        cd6 d;
        sj2 sj2Var;
        jb6 jb6Var = this.a;
        jb6Var.p = xc4.f(jb6Var.p, j);
        uf3 uf3Var = jb6Var.d;
        if (uf3Var != null && (d = uf3Var.d()) != null) {
            jb6Var.p(new xc4(xc4.f(jb6Var.n, jb6Var.p)));
            h12 h12Var = jb6Var.b;
            xc4 g = jb6Var.g();
            g.getClass();
            int b = d.b(g.a, true);
            h12Var.c(b);
            long a = fy5.a(b, b);
            if (!nd6.c(a, jb6Var.l().b)) {
                uf3 uf3Var2 = jb6Var.d;
                if ((uf3Var2 == null || ((Boolean) uf3Var2.q.getValue()).booleanValue()) && (sj2Var = jb6Var.j) != null) {
                    ((mm4) sj2Var).a(9);
                }
                jb6Var.c.invoke(jb6.b(jb6Var.l().a, a));
                jb6Var.v = new nd6(a);
            }
        }
    }

    @Override // defpackage.k96
    public final void d() {
    }

    @Override // defpackage.k96
    public final void onCancel() {
    }
}
