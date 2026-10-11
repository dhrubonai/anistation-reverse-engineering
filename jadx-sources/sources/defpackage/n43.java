package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class n43 extends k43 {
    public final t43 B;
    public final o43 C;
    public final ol0 D;
    public final Object E;

    public n43(t43 t43Var, o43 o43Var, ol0 ol0Var, Object obj) {
        this.B = t43Var;
        this.C = o43Var;
        this.D = ol0Var;
        this.E = obj;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return false;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        ol0 ol0Var = this.D;
        ol0 U = t43.U(ol0Var);
        t43 t43Var = this.B;
        o43 o43Var = this.C;
        Object obj = this.E;
        if (U == null || !t43Var.f0(o43Var, U, obj)) {
            o43Var.x.b(new ci3(2), 2);
            ol0 U2 = t43.U(ol0Var);
            if (U2 != null && t43Var.f0(o43Var, U2, obj)) {
                return;
            }
            t43Var.m(t43Var.z(o43Var, obj));
        }
    }
}
