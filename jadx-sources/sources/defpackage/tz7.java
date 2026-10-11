package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tz7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ zz7 y;

    public /* synthetic */ tz7(zz7 zz7Var, byte b) {
        this.x = b;
        this.y = zz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        zz7 zz7Var = this.y;
        switch (b) {
            case 0:
                zz7Var.R();
                return;
            case 1:
                gu7 gu7Var = (gu7) zz7Var.x;
                cr7 cr7Var = zz7Var.A;
                if (cr7Var == null) {
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.C.a("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    cr7Var.x(zz7Var.b0(false));
                    zz7Var.Y();
                    return;
                } catch (RemoteException e) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.C.b(e, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                gu7 gu7Var2 = (gu7) zz7Var.x;
                cr7 cr7Var2 = zz7Var.A;
                if (cr7Var2 == null) {
                    es7 es7Var3 = gu7Var2.C;
                    gu7.l(es7Var3);
                    es7Var3.C.a("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    cr7Var2.I(zz7Var.b0(false));
                    zz7Var.Y();
                    return;
                } catch (RemoteException e2) {
                    es7 es7Var4 = gu7Var2.C;
                    gu7.l(es7Var4);
                    es7Var4.C.b(e2, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}
