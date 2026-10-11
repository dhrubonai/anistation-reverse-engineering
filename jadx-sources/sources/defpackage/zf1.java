package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zf1 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cg1 y;

    public /* synthetic */ zf1(cg1 cg1Var, byte b) {
        this.x = b;
        this.y = cg1Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zp2] */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        cg1 cg1Var = this.y;
        switch (b) {
            case 0:
                cg1Var.H.onDismiss(null);
                return;
            default:
                if (cg1Var.B != null && cg1Var.B == null) {
                    ?? obj = new Object();
                    Object obj2 = cg1.L;
                    obj.x = obj2;
                    obj.y = obj2;
                    obj.z = obj2;
                    obj.A = null;
                    cg1Var.B = obj;
                    return;
                }
                return;
        }
    }
}
