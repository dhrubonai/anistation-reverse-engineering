package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cu3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ wu3 y;

    public /* synthetic */ cu3(wu3 wu3Var, byte b) {
        this.x = b;
        this.y = wu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        wu3 wu3Var = this.y;
        switch (b) {
            case 0:
                wu3Var.U(new cu3(wu3Var, (byte) 1));
                return;
            default:
                wu3Var.X();
                return;
        }
    }
}
