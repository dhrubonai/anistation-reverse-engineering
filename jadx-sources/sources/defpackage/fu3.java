package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fu3 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ wu3 y;
    public final /* synthetic */ fq4 z;

    public /* synthetic */ fu3(wu3 wu3Var, fq4 fq4Var, byte b) {
        this.x = b;
        this.y = wu3Var;
        this.z = fq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kf6 kf6Var;
        byte b = this.x;
        fq4 fq4Var = this.z;
        wu3 wu3Var = this.y;
        switch (b) {
            case 0:
                wu3Var.o.L(wu3Var.N(fq4Var));
                return;
            default:
                wu3Var.o.L(wu3Var.N(fq4Var));
                uu3 uu3Var = wu3Var.k;
                if (fq4Var.l().a(17)) {
                    kf6Var = fq4Var.G0();
                } else {
                    kf6Var = kf6.a;
                }
                uu3Var.q(kf6Var);
                return;
        }
    }
}
