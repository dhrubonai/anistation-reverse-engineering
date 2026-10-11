package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dx1 extends cx1 implements vc1 {
    public final Executor y;

    public dx1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.y = executor;
        Method method2 = hv0.a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = hv0.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.vc1
    public final ei1 a(long j, Runnable runnable, l11 l11Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                h98.i(l11Var, z51.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            return new di1(scheduledFuture);
        }
        return m81.G.a(j, runnable, l11Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.y;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.vc1
    public final void d0(long j, qg0 qg0Var) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.y;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            yc2 yc2Var = new yc2(this, qg0Var, (byte) 5);
            l11 l11Var = qg0Var.B;
            try {
                scheduledFuture = scheduledExecutorService.schedule(yc2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                h98.i(l11Var, z51.b("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            qg0Var.w(new kg0(scheduledFuture, (byte) 0));
        } else {
            m81.G.d0(j, qg0Var);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dx1) && ((dx1) obj).y == this.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.y);
    }

    @Override // defpackage.n11
    public final String toString() {
        return this.y.toString();
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        try {
            this.y.execute(runnable);
        } catch (RejectedExecutionException e) {
            h98.i(l11Var, z51.b("The task was rejected", e));
            ja1 ja1Var = rh1.a;
            j91.y.u0(l11Var, runnable);
        }
    }

    @Override // defpackage.cx1
    public final Executor y0() {
        return this.y;
    }
}
