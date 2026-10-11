package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v35 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w35 y;

    public /* synthetic */ v35(w35 w35Var, byte b) {
        this.x = b;
        this.y = w35Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        w35 w35Var = this.y;
        switch (b) {
            case 0:
                x35 x35Var = w35Var.c;
                if (x35Var.g != null) {
                    x35Var.a();
                    return;
                }
                return;
            default:
                x35 x35Var2 = w35Var.c;
                if (x35Var2.g != null && (x35Var2.f & 3) != 0) {
                    x35Var2.a();
                    return;
                }
                return;
        }
    }
}
