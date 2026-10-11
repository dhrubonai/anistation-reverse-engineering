package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ia0 extends jz {
    public qg0 a;
    public ub2 b;

    @Override // defpackage.jz
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.jz
    public final void b(Throwable th) {
        qg0 qg0Var = this.a;
        if (qg0Var != null) {
            qg0Var.resumeWith(m37.l(th));
        }
    }
}
