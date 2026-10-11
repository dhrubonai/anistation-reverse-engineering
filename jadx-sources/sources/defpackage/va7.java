package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class va7 implements wz {
    public final /* synthetic */ uh2 a;

    public va7(uh2 uh2Var) {
        this.a = uh2Var;
    }

    @Override // defpackage.wz
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        h15 h15Var = this.a.J;
        h15Var.sendMessage(h15Var.obtainMessage(1, valueOf));
    }
}
