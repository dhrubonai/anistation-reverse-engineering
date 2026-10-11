package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class j34 implements Runnable {
    public final /* synthetic */ ws6 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ j34(ws6 ws6Var, long j, boolean z, byte b) {
        this.x = b;
        this.A = ws6Var;
        this.y = j;
        this.z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        boolean z = this.z;
        long j = this.y;
        ws6 ws6Var = this.A;
        switch (b) {
            case 0:
                ((l34) ((sn3) ws6Var).y).d.d(j, z);
                return;
            default:
                ((up5) ((ok2) ws6Var).z).d.d(j, z);
                return;
        }
    }
}
