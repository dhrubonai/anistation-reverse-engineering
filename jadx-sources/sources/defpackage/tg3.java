package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tg3 implements m55 {
    public final tm3 a;

    public tg3() {
        tm3 tm3Var = new tm3();
        this.a = tm3Var;
        if (tm3Var.b) {
            return;
        }
        if (tm3Var.c) {
            es4.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        tm3Var.d();
        tm3Var.c = true;
    }

    @Override // defpackage.m55
    public final Object a(i55 i55Var) {
        return this.a.a(i55Var);
    }

    @Override // defpackage.m55
    public final void b(i55 i55Var, Object obj) {
        this.a.b(i55Var, obj);
    }
}
