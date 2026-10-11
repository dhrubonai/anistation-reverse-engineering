package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rp1 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ tp1 y;
    public final /* synthetic */ up1 z;

    public /* synthetic */ rp1(tp1 tp1Var, up1 up1Var, byte b) {
        this.x = b;
        this.y = tp1Var;
        this.z = up1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        up1 up1Var = this.z;
        tp1 tp1Var = this.y;
        switch (b) {
            case 0:
                up1Var.N(tp1Var.a, tp1Var.b);
                return;
            default:
                up1Var.z(tp1Var.a, tp1Var.b);
                return;
        }
    }
}
