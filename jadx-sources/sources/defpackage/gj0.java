package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gj0 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve2 b;

    public /* synthetic */ gj0(ve2 ve2Var, byte b) {
        this.a = b;
        this.b = ve2Var;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        ve2 ve2Var = this.b;
        switch (b) {
            case 0:
                ve2Var.flush();
                return;
            default:
                ve2Var.b();
                return;
        }
    }
}
