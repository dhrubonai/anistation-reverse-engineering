package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jt6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ l33 y;
    public final /* synthetic */ long z;

    public /* synthetic */ jt6(l33 l33Var, int i, long j) {
        this.y = l33Var;
        this.A = i;
        this.z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.A;
        long j = this.z;
        l33 l33Var = this.y;
        switch (b) {
            case 0:
                lt6 lt6Var = (lt6) l33Var.z;
                String str = eq6.a;
                lt6Var.m(i, j);
                return;
            default:
                lt6 lt6Var2 = (lt6) l33Var.z;
                String str2 = eq6.a;
                lt6Var2.h(i, j);
                return;
        }
    }

    public /* synthetic */ jt6(l33 l33Var, long j, int i) {
        this.y = l33Var;
        this.z = j;
        this.A = i;
    }
}
