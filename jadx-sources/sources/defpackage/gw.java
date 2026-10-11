package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ pz2 y;
    public final /* synthetic */ Exception z;

    public /* synthetic */ gw(pz2 pz2Var, Exception exc, byte b) {
        this.x = b;
        this.y = pz2Var;
        this.z = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Exception exc = this.z;
        pz2 pz2Var = this.y;
        switch (b) {
            case 0:
                iw iwVar = (iw) pz2Var.z;
                String str = eq6.a;
                iwVar.C(exc);
                return;
            default:
                iw iwVar2 = (iw) pz2Var.z;
                String str2 = eq6.a;
                iwVar2.A(exc);
                return;
        }
    }
}
