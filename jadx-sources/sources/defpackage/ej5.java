package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ej5 implements Executor {
    public static final String B = xk3.f("SerialExecutorImpl");
    public final Executor y;
    public Runnable z;
    public final ArrayDeque x = new ArrayDeque();
    public final Object A = new Object();

    public ej5(Executor executor) {
        this.y = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.x.poll();
        this.z = runnable;
        if (runnable != null) {
            try {
                this.y.execute(runnable);
            } catch (Throwable th) {
                xk3.d().c(B, "Delegate executor failed to execute", th);
                this.z = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.A) {
            try {
                this.x.add(new yc2((Object) this, (Object) runnable, (byte) 7));
                if (this.z == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
