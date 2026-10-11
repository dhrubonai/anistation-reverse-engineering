package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class kt6 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ l33 y;
    public final /* synthetic */ n61 z;

    public /* synthetic */ kt6(l33 l33Var, n61 n61Var, byte b) {
        this.x = b;
        this.y = l33Var;
        this.z = n61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                l33 l33Var = this.y;
                n61 n61Var = this.z;
                lt6 lt6Var = (lt6) l33Var.z;
                String str = eq6.a;
                lt6Var.j(n61Var);
                return;
            default:
                l33 l33Var2 = this.y;
                n61 n61Var2 = this.z;
                synchronized (n61Var2) {
                }
                lt6 lt6Var2 = (lt6) l33Var2.z;
                String str2 = eq6.a;
                lt6Var2.i(n61Var2);
                return;
        }
    }
}
