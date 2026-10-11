package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class au7 extends pv7 {
    public static final AtomicLong H = new AtomicLong(Long.MIN_VALUE);
    public yt7 A;
    public final PriorityBlockingQueue B;
    public final LinkedBlockingQueue C;
    public final ut7 D;
    public final ut7 E;
    public final Object F;
    public final Semaphore G;
    public yt7 z;

    public au7(gu7 gu7Var) {
        super(gu7Var);
        this.F = new Object();
        this.G = new Semaphore(2);
        this.B = new PriorityBlockingQueue();
        this.C = new LinkedBlockingQueue();
        this.D = new ut7(this, "Thread death: Uncaught exception on worker thread");
        this.E = new ut7(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.qt0
    public final void L() {
        if (Thread.currentThread() == this.z) {
            return;
        }
        ze0.m("Call expected from worker thread");
    }

    @Override // defpackage.pv7
    public final boolean M() {
        return false;
    }

    public final void P() {
        if (Thread.currentThread() == this.A) {
            return;
        }
        ze0.m("Call expected from network thread");
    }

    public final void Q() {
        if (Thread.currentThread() != this.z) {
            return;
        }
        ze0.m("Call not expected from worker thread");
    }

    public final boolean R() {
        if (Thread.currentThread() == this.z) {
            return true;
        }
        return false;
    }

    public final wt7 S(Callable callable) {
        N();
        wt7 wt7Var = new wt7(this, callable, false);
        if (Thread.currentThread() == this.z) {
            if (!this.B.isEmpty()) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                es7Var.F.a("Callable skipped the worker queue.");
            }
            wt7Var.run();
            return wt7Var;
        }
        Y(wt7Var);
        return wt7Var;
    }

    public final wt7 T(Callable callable) {
        N();
        wt7 wt7Var = new wt7(this, callable, true);
        if (Thread.currentThread() == this.z) {
            wt7Var.run();
            return wt7Var;
        }
        Y(wt7Var);
        return wt7Var;
    }

    public final void U(Runnable runnable) {
        N();
        a34.x(runnable);
        Y(new wt7(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object V(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            au7 au7Var = ((gu7) this.x).D;
            gu7.l(au7Var);
            au7Var.U(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                es7 es7Var = ((gu7) this.x).C;
                gu7.l(es7Var);
                bs7 bs7Var = es7Var.F;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                bs7Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            es7 es7Var2 = ((gu7) this.x).C;
            gu7.l(es7Var2);
            es7Var2.F.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void W(Runnable runnable) {
        N();
        Y(new wt7(this, runnable, true, "Task exception on worker thread"));
    }

    public final void X(Runnable runnable) {
        N();
        wt7 wt7Var = new wt7(this, runnable, false, "Task exception on network thread");
        synchronized (this.F) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.C;
                linkedBlockingQueue.add(wt7Var);
                yt7 yt7Var = this.A;
                if (yt7Var == null) {
                    yt7 yt7Var2 = new yt7(this, "Measurement Network", linkedBlockingQueue);
                    this.A = yt7Var2;
                    yt7Var2.setUncaughtExceptionHandler(this.E);
                    this.A.start();
                } else {
                    Object obj = yt7Var.x;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(wt7 wt7Var) {
        synchronized (this.F) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.B;
                priorityBlockingQueue.add(wt7Var);
                yt7 yt7Var = this.z;
                if (yt7Var == null) {
                    yt7 yt7Var2 = new yt7(this, "Measurement Worker", priorityBlockingQueue);
                    this.z = yt7Var2;
                    yt7Var2.setUncaughtExceptionHandler(this.D);
                    this.z.start();
                } else {
                    Object obj = yt7Var.x;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
