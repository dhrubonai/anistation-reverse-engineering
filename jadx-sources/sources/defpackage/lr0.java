package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lr0 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ yr0 y;

    public /* synthetic */ lr0(yr0 yr0Var, byte b) {
        this.x = b;
        this.y = yr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        yr0 yr0Var = this.y;
        switch (b) {
            case 0:
                yr0.e(yr0Var);
                return;
            default:
                yr0Var.invalidateMenu();
                return;
        }
    }
}
