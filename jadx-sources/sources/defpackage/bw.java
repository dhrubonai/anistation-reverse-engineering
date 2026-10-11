package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ pz2 y;
    public final /* synthetic */ n61 z;

    public /* synthetic */ bw(pz2 pz2Var, n61 n61Var, byte b) {
        this.x = b;
        this.y = pz2Var;
        this.z = n61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                pz2 pz2Var = this.y;
                n61 n61Var = this.z;
                synchronized (n61Var) {
                }
                iw iwVar = (iw) pz2Var.z;
                String str = eq6.a;
                iwVar.k(n61Var);
                return;
            default:
                pz2 pz2Var2 = this.y;
                n61 n61Var2 = this.z;
                iw iwVar2 = (iw) pz2Var2.z;
                String str2 = eq6.a;
                iwVar2.J(n61Var2);
                return;
        }
    }
}
