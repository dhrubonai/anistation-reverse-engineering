package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ pz2 y;
    public final /* synthetic */ q18 z;

    public /* synthetic */ cw(pz2 pz2Var, q18 q18Var, byte b) {
        this.x = b;
        this.y = pz2Var;
        this.z = q18Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        q18 q18Var = this.z;
        pz2 pz2Var = this.y;
        switch (b) {
            case 0:
                iw iwVar = (iw) pz2Var.z;
                String str = eq6.a;
                iwVar.o(q18Var);
                return;
            default:
                iw iwVar2 = (iw) pz2Var.z;
                String str2 = eq6.a;
                iwVar2.g(q18Var);
                return;
        }
    }
}
