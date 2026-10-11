package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v88 extends a88 implements RunnableFuture {
    public volatile u88 E;

    public v88(Callable callable) {
        this.E = new u88(this, callable);
    }

    @Override // defpackage.a88
    public final void d() {
        u88 u88Var;
        Object obj = this.x;
        if ((obj instanceof w78) && ((w78) obj).a && (u88Var = this.E) != null) {
            ns1 ns1Var = u88.A;
            ns1 ns1Var2 = u88.z;
            Runnable runnable = (Runnable) u88Var.get();
            if (runnable instanceof Thread) {
                l88 l88Var = new l88(u88Var);
                l88Var.a(Thread.currentThread());
                if (u88Var.compareAndSet(runnable, l88Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) u88Var.getAndSet(ns1Var2)) == ns1Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) u88Var.getAndSet(ns1Var2)) == ns1Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.E = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a88
    public final String e() {
        u88 u88Var = this.E;
        if (u88Var != null) {
            String u88Var2 = u88Var.toString();
            return qx1.q(new StringBuilder(u88Var2.length() + 7), "task=[", u88Var2, "]");
        }
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        u88 u88Var = this.E;
        if (u88Var != null) {
            u88Var.run();
        }
        this.E = null;
    }
}
