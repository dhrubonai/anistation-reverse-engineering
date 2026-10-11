package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p43 extends k43 {
    public final ng5 B;
    public final /* synthetic */ t43 C;

    public p43(t43 t43Var, ng5 ng5Var) {
        this.C = t43Var;
        this.B = ng5Var;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return false;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        t43 t43Var = this.C;
        Object K = t43Var.K();
        if (!(K instanceof dr0)) {
            K = u43.a(K);
        }
        this.B.h(t43Var, K);
    }
}
