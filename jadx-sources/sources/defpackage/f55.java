package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class f55 extends k43 {
    public final m43 B;

    public f55(m43 m43Var) {
        this.B = m43Var;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return false;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        Object K = i().K();
        boolean z = K instanceof dr0;
        m43 m43Var = this.B;
        if (z) {
            m43Var.resumeWith(m37.l(((dr0) K).a));
        } else {
            m43Var.resumeWith(u43.a(K));
        }
    }
}
