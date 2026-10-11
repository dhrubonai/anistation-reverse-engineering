package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zf6 implements Runnable {
    public final /* synthetic */ byte x;
    public final ii3 y;
    public final qg0 z;

    public /* synthetic */ zf6(ii3 ii3Var, qg0 qg0Var, byte b) {
        this.x = b;
        this.y = ii3Var;
        this.z = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        qg0 qg0Var = this.z;
        ii3 ii3Var = this.y;
        switch (b) {
            case 0:
                if (ii3Var.isCancelled()) {
                    qg0Var.a(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = ii3Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            qg0Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            qg0Var.resumeWith(new y45(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                if (ii3Var.isCancelled()) {
                    qg0Var.a(null);
                    return;
                }
                try {
                    qg0Var.resumeWith(x2.h(ii3Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    qg0Var.resumeWith(new y45(cause2));
                    return;
                }
        }
    }
}
