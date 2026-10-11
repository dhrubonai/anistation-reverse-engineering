package p7;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v0 extends u0 implements f0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8749c;

    public v0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f8749c = executor;
        Method method2 = t7.c.f10054a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = t7.c.f10054a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p7.w
    public final void G(z6.i iVar, Runnable runnable) {
        try {
            this.f8749c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a1 a1Var = (a1) iVar.r(androidx.lifecycle.q0.f1134x);
            if (a1Var != null) {
                ((k1) a1Var).k(cancellationException);
            }
            i0.f8692b.G(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f8749c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v0) && ((v0) obj).f8749c == this.f8749c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8749c);
    }

    @Override // p7.f0
    public final k0 q(long j4, x1 x1Var, z6.i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f8749c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(x1Var, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a1 a1Var = (a1) iVar.r(androidx.lifecycle.q0.f1134x);
                if (a1Var != null) {
                    ((k1) a1Var).k(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new j0(scheduledFuture);
        }
        return b0.f8663z.q(j4, x1Var, iVar);
    }

    @Override // p7.w
    public final String toString() {
        return this.f8749c.toString();
    }
}
