package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d48 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ d48(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        byte b2 = 3;
        Object obj = this.y;
        switch (b) {
            case 0:
                try {
                    wc7.s((y62) obj);
                    return;
                } catch (Exception e) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                        return;
                    }
                    return;
                }
            case 1:
                gu7 gu7Var = (gu7) ((o9) obj).b;
                gu7.i(gu7Var.R);
                gu7Var.R.P(((Long) tq7.D.a(null)).longValue());
                return;
            default:
                gu7 gu7Var2 = (gu7) obj;
                i28 i28Var = gu7Var2.F;
                qx7 qx7Var = gu7Var2.J;
                gu7.j(i28Var);
                i28Var.L();
                if (i28Var.i0() == 1) {
                    gu7.k(qx7Var);
                    qx7Var.L();
                    gw7 gw7Var = qx7Var.I;
                    if (gw7Var != null) {
                        gw7Var.c();
                    }
                    gu7.k(qx7Var);
                    new Thread(new fw7(qx7Var, b2)).start();
                    return;
                }
                es7 es7Var = gu7Var2.C;
                gu7.l(es7Var);
                es7Var.F.a("registerTrigger called but app not eligible");
                return;
        }
    }
}
