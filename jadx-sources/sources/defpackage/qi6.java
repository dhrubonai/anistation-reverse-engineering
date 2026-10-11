package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qi6 {
    public final tk6 a;
    public final ti4 b = xt5.g(null);
    public final /* synthetic */ xi6 c;

    public qi6(xi6 xi6Var, tk6 tk6Var, String str) {
        this.c = xi6Var;
        this.a = tk6Var;
    }

    public final pi6 a(ub2 ub2Var, Object obj, rl rlVar, ub2 ub2Var2) {
        ti4 ti4Var = this.b;
        pi6 pi6Var = (pi6) ti4Var.getValue();
        xi6 xi6Var = this.c;
        if (pi6Var == null) {
            Object invoke = ub2Var2.invoke(xi6Var.a.v());
            Object invoke2 = ub2Var2.invoke(xi6Var.a.v());
            tk6 tk6Var = this.a;
            rl rlVar2 = (rl) tk6Var.a.invoke(invoke2);
            rlVar2.d();
            ui6 ui6Var = new ui6(xi6Var, invoke, rlVar2, tk6Var);
            pi6Var = new pi6(this, ui6Var, ub2Var, ub2Var2);
            ti4Var.setValue(pi6Var);
            xi6Var.j.add(ui6Var);
        }
        pi6Var.z = ub2Var2;
        pi6Var.y = ub2Var;
        pi6Var.b(xi6Var.f(), obj, rlVar);
        return pi6Var;
    }
}
