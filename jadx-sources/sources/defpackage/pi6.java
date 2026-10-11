package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pi6 implements px5 {
    public final /* synthetic */ qi6 A;
    public final ui6 x;
    public ub2 y;
    public ub2 z;

    public pi6(qi6 qi6Var, ui6 ui6Var, ub2 ub2Var, ub2 ub2Var2) {
        this.A = qi6Var;
        this.x = ui6Var;
        this.y = ub2Var;
        this.z = ub2Var2;
    }

    public final void b(si6 si6Var, Object obj, rl rlVar) {
        Object invoke = this.z.invoke(si6Var.c());
        boolean h = this.A.c.h();
        ui6 ui6Var = this.x;
        if (h) {
            ui6Var.g(this.z.invoke(si6Var.a()), invoke, (j32) this.y.invoke(si6Var));
        } else {
            ui6Var.h(invoke, (j32) this.y.invoke(si6Var), obj, rlVar);
        }
    }

    @Override // defpackage.px5
    public final Object getValue() {
        b(this.A.c.f(), null, null);
        return this.x.G.getValue();
    }
}
