package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hk6 extends x62 implements RunnableFuture {
    public volatile gk6 F;

    public hk6(Callable callable) {
        this.F = new gk6(this, callable);
    }

    @Override // defpackage.j1
    public final void c() {
        gk6 gk6Var;
        if (p() && (gk6Var = this.F) != null) {
            ns1 ns1Var = gk6.B;
            ns1 ns1Var2 = gk6.A;
            Runnable runnable = (Runnable) gk6Var.get();
            if (runnable instanceof Thread) {
                f23 f23Var = new f23(gk6Var);
                f23Var.a(Thread.currentThread());
                if (gk6Var.compareAndSet(runnable, f23Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) gk6Var.getAndSet(ns1Var2)) == ns1Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.F = null;
    }

    @Override // defpackage.j1
    public final String j() {
        gk6 gk6Var = this.F;
        if (gk6Var != null) {
            return "task=[" + gk6Var + "]";
        }
        return super.j();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        gk6 gk6Var = this.F;
        if (gk6Var != null) {
            gk6Var.run();
        }
        this.F = null;
    }
}
