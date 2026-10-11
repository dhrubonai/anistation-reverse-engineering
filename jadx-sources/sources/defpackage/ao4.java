package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ao4 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ dv6 y;

    public /* synthetic */ ao4(dv6 dv6Var, byte b) {
        this.x = b;
        this.y = dv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        dv6 dv6Var = this.y;
        switch (b) {
            case 0:
                dv6Var.b();
                return;
            case 1:
                dv6Var.onFirstFrameRendered();
                return;
            default:
                dv6Var.d();
                return;
        }
    }
}
