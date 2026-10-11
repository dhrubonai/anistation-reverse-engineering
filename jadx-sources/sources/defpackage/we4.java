package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class we4 extends fg4 {
    public static final we4 c = new fg4(0, 2, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        ed2 ed2Var = (ed2) fm0Var.h(0);
        Object h = fm0Var.h(1);
        if (h instanceof od2) {
            od2 od2Var = (od2) h;
            ((z44) b25Var.d).b(od2Var);
            ((q44) b25Var.g).a(od2Var);
        }
        if (bs5Var.n != 0) {
            eu0.a("Can only append a slot if not current inserting");
        }
        int i = bs5Var.i;
        int i2 = bs5Var.j;
        int c2 = bs5Var.c(ed2Var);
        int f = bs5Var.f(bs5Var.b, bs5Var.q(c2 + 1));
        bs5Var.i = f;
        bs5Var.j = f;
        bs5Var.w(1, c2);
        if (i >= f) {
            i++;
            i2++;
        }
        bs5Var.c[f] = h;
        bs5Var.i = i;
        bs5Var.j = i2;
    }
}
