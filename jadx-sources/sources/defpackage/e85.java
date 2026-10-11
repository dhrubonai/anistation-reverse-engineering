package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class e85 implements RunnableFuture {
    public Exception A;
    public Object B;
    public Thread C;
    public boolean D;
    public final nv0 x = new nv0();
    public final nv0 y = new nv0();
    public final Object z = new Object();

    public final void b() {
        this.y.b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.z) {
            try {
                if (!this.D && !this.y.e()) {
                    this.D = true;
                    c();
                    Thread thread = this.C;
                    if (thread != null) {
                        if (z) {
                            thread.interrupt();
                        }
                    } else {
                        this.x.f();
                        this.y.f();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public abstract Object d();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        nv0 nv0Var = this.y;
        synchronized (nv0Var) {
            if (convert <= 0) {
                z = nv0Var.b;
            } else {
                nv0Var.a.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    nv0Var.a();
                } else {
                    while (!nv0Var.b && elapsedRealtime < j2) {
                        nv0Var.a.getClass();
                        nv0Var.wait(j2 - elapsedRealtime);
                        nv0Var.a.getClass();
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = nv0Var.b;
            }
        }
        if (z) {
            if (!this.D) {
                Exception exc = this.A;
                if (exc == null) {
                    return this.B;
                }
                throw new ExecutionException(exc);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.D;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.y.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.z) {
            try {
                if (this.D) {
                    return;
                }
                this.C = Thread.currentThread();
                this.x.f();
                try {
                    try {
                        this.B = d();
                        synchronized (this.z) {
                            this.y.f();
                            this.C = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.z) {
                            this.y.f();
                            this.C = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.A = e;
                    synchronized (this.z) {
                        this.y.f();
                        this.C = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.y.a();
        if (!this.D) {
            Exception exc = this.A;
            if (exc == null) {
                return this.B;
            }
            throw new ExecutionException(exc);
        }
        throw new CancellationException();
    }
}
