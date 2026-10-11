package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zw7 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ qx7 B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ xv7 y;
    public final /* synthetic */ long z;

    public /* synthetic */ zw7(qx7 qx7Var, xv7 xv7Var, long j, boolean z, byte b) {
        this.x = b;
        this.y = xv7Var;
        this.z = j;
        this.A = z;
        this.B = qx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.z;
        boolean z = this.A;
        xv7 xv7Var = this.y;
        qx7 qx7Var = this.B;
        switch (b) {
            case 0:
                qx7Var.l0(xv7Var);
                qx7Var.b0(xv7Var, j, z);
                return;
            default:
                qx7Var.l0(xv7Var);
                qx7Var.b0(xv7Var, j, z);
                return;
        }
    }
}
