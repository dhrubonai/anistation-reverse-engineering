package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m43 extends qg0 {
    public final t43 F;

    public m43(vz0 vz0Var, t43 t43Var) {
        super(1, vz0Var);
        this.F = t43Var;
    }

    @Override // defpackage.qg0
    public final Throwable q(t43 t43Var) {
        Throwable c;
        Object K = this.F.K();
        if ((K instanceof o43) && (c = ((o43) K).c()) != null) {
            return c;
        }
        if (K instanceof dr0) {
            return ((dr0) K).a;
        }
        return t43Var.I();
    }

    @Override // defpackage.qg0
    public final String z() {
        return "AwaitContinuation";
    }
}
