package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mz7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cr7 y;
    public final /* synthetic */ vz7 z;

    public /* synthetic */ mz7(vz7 vz7Var, cr7 cr7Var, byte b) {
        this.x = b;
        this.y = cr7Var;
        this.z = vz7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.x) {
            case 0:
                vz7 vz7Var = this.z;
                synchronized (vz7Var) {
                    try {
                        vz7Var.x = false;
                        zz7 zz7Var = vz7Var.z;
                        if (!zz7Var.c0()) {
                            es7 es7Var = ((gu7) zz7Var.x).C;
                            gu7.l(es7Var);
                            es7Var.K.a("Connected to service");
                            cr7 cr7Var = this.y;
                            zz7Var.L();
                            zz7Var.A = cr7Var;
                            zz7Var.Y();
                            zz7Var.a0();
                        }
                    } finally {
                    }
                }
                return;
            default:
                vz7 vz7Var2 = this.z;
                synchronized (vz7Var2) {
                    try {
                        vz7Var2.x = false;
                        zz7 zz7Var2 = vz7Var2.z;
                        if (!zz7Var2.c0()) {
                            es7 es7Var2 = ((gu7) zz7Var2.x).C;
                            gu7.l(es7Var2);
                            es7Var2.J.a("Connected to remote service");
                            cr7 cr7Var2 = this.y;
                            zz7Var2.L();
                            zz7Var2.A = cr7Var2;
                            zz7Var2.Y();
                            zz7Var2.a0();
                        }
                    } finally {
                    }
                }
                zz7 zz7Var3 = this.z.z;
                ScheduledExecutorService scheduledExecutorService = zz7Var3.D;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    zz7Var3.D = null;
                    return;
                }
                return;
        }
    }
}
