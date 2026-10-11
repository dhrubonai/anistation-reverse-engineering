package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sg3 implements q35, m91 {
    public final fg3 x;
    public final h43 y;

    public sg3(fg3 fg3Var, h43 h43Var) {
        this.x = fg3Var;
        this.y = h43Var;
    }

    @Override // defpackage.q35
    public final Object a(jz4 jz4Var) {
        return w65.o(this.x, jz4Var);
    }

    @Override // defpackage.q35
    public final void c() {
        this.x.b(this);
    }

    @Override // defpackage.m91
    public final void onDestroy(og3 og3Var) {
        this.y.l(null);
    }

    @Override // defpackage.q35
    public final void start() {
        this.x.a(this);
    }
}
