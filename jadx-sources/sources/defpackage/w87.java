package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w87 {
    public static final String a = xk3.f("WorkerWrapper");

    public static final Object a(ii3 ii3Var, pi3 pi3Var, t36 t36Var) {
        Object obj;
        try {
            boolean z = false;
            if (ii3Var.isDone()) {
                while (true) {
                    try {
                        obj = ii3Var.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return obj;
            }
            qg0 qg0Var = new qg0(1, wc7.z(t36Var));
            qg0Var.t();
            ii3Var.a(new zf6(ii3Var, qg0Var, (byte) 0), pg1.x);
            qg0Var.v(new od(pi3Var, ii3Var, (byte) 28));
            return qg0Var.r();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
