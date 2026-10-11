package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hv4 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ nv4 y;

    public /* synthetic */ hv4(nv4 nv4Var, byte b) {
        this.x = b;
        this.y = nv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        nv4 nv4Var = this.y;
        switch (b) {
            case 0:
                nv4Var.k0 = true;
                return;
            case 1:
                nv4Var.A();
                return;
            default:
                if (!nv4Var.q0) {
                    nr3 nr3Var = nv4Var.P;
                    nr3Var.getClass();
                    nr3Var.g(nv4Var);
                    return;
                }
                return;
        }
    }
}
