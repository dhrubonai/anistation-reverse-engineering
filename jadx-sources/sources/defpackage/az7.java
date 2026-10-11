package defpackage;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class az7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ b48 y;
    public final /* synthetic */ zz7 z;

    public az7(zz7 zz7Var, b48 b48Var) {
        this.x = (byte) 4;
        this.y = b48Var;
        Objects.requireNonNull(zz7Var);
        this.z = zz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        b48 b48Var = this.y;
        zz7 zz7Var = this.z;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) zz7Var.x;
                cr7 cr7Var = zz7Var.A;
                if (cr7Var == null) {
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.C.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        cr7Var.s(b48Var);
                    } catch (RemoteException e) {
                        es7 es7Var2 = gu7Var.C;
                        gu7.l(es7Var2);
                        es7Var2.C.b(e, "Failed to reset data on the service: remote exception");
                    }
                    zz7Var.Y();
                    return;
                }
            case 1:
                cr7 cr7Var2 = zz7Var.A;
                gu7 gu7Var2 = (gu7) zz7Var.x;
                if (cr7Var2 == null) {
                    es7 es7Var3 = gu7Var2.C;
                    gu7.l(es7Var3);
                    es7Var3.C.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    ak7 ak7Var = gu7Var2.A;
                    sq7 sq7Var = tq7.W0;
                    if (ak7Var.W(null, sq7Var)) {
                        zz7Var.d0(cr7Var2, null, b48Var);
                    }
                    cr7Var2.E(b48Var);
                    gu7Var2.m().Q();
                    gu7Var2.A.W(null, sq7Var);
                    zz7Var.d0(cr7Var2, null, b48Var);
                    zz7Var.Y();
                    return;
                } catch (RemoteException e2) {
                    es7 es7Var4 = gu7Var2.C;
                    gu7.l(es7Var4);
                    es7Var4.C.b(e2, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                gu7 gu7Var3 = (gu7) zz7Var.x;
                cr7 cr7Var3 = zz7Var.A;
                if (cr7Var3 == null) {
                    es7 es7Var5 = gu7Var3.C;
                    gu7.l(es7Var5);
                    es7Var5.F.a("Failed to send app backgrounded");
                    return;
                }
                try {
                    cr7Var3.q(b48Var);
                    zz7Var.Y();
                    return;
                } catch (RemoteException e3) {
                    es7 es7Var6 = gu7Var3.C;
                    gu7.l(es7Var6);
                    es7Var6.C.b(e3, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                gu7 gu7Var4 = (gu7) zz7Var.x;
                cr7 cr7Var4 = zz7Var.A;
                if (cr7Var4 == null) {
                    es7 es7Var7 = gu7Var4.C;
                    gu7.l(es7Var7);
                    es7Var7.C.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    cr7Var4.w(b48Var);
                    zz7Var.Y();
                    return;
                } catch (RemoteException e4) {
                    es7 es7Var8 = gu7Var4.C;
                    gu7.l(es7Var8);
                    es7Var8.C.b(e4, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                cr7 cr7Var5 = zz7Var.A;
                gu7 gu7Var5 = (gu7) zz7Var.x;
                if (cr7Var5 == null) {
                    es7 es7Var9 = gu7Var5.C;
                    gu7.l(es7Var9);
                    es7Var9.C.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    cr7Var5.g(b48Var);
                    zz7Var.Y();
                    return;
                } catch (RemoteException e5) {
                    es7 es7Var10 = gu7Var5.C;
                    gu7.l(es7Var10);
                    es7Var10.C.b(e5, "Failed to send consent settings to the service");
                    return;
                }
        }
    }

    public /* synthetic */ az7(zz7 zz7Var, b48 b48Var, byte b) {
        this.x = b;
        this.y = b48Var;
        this.z = zz7Var;
    }
}
