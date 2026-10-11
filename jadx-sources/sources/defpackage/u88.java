package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u88 extends AtomicReference implements Runnable {
    public static final ns1 A;
    public static final ns1 z;
    public final Callable x;
    public final /* synthetic */ v88 y;

    static {
        byte b = 7;
        z = new ns1(b);
        A = new ns1(b);
    }

    public u88(v88 v88Var, Callable callable) {
        this.y = v88Var;
        callable.getClass();
        this.x = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        l88 l88Var = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = runnable instanceof l88;
            ns1 ns1Var = A;
            if (!z3) {
                if (runnable != ns1Var) {
                    break;
                }
            } else {
                l88Var = (l88) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == ns1Var || compareAndSet(runnable, ns1Var)) {
                    if (Thread.interrupted() || z2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LockSupport.park(l88Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            v88 v88Var = this.y;
            boolean isDone = v88Var.isDone();
            ns1 ns1Var = z;
            if (!isDone) {
                try {
                    call = this.x.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, ns1Var)) {
                            a(currentThread);
                        }
                        if (f88.D.u(v88Var, null, new y78(th))) {
                            a88.g(v88Var);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, ns1Var)) {
                            a(currentThread);
                        }
                        if (f88.D.u(v88Var, null, f88.A)) {
                            a88.g(v88Var);
                        }
                        throw th2;
                    }
                }
            } else {
                call = null;
            }
            if (!compareAndSet(currentThread, ns1Var)) {
                a(currentThread);
            }
            if (!isDone) {
                if (call == null) {
                    call = f88.A;
                }
                if (f88.D.u(v88Var, null, call)) {
                    a88.g(v88Var);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == z) {
            str = "running=[DONE]";
        } else if (runnable instanceof l88) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = qx1.q(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String obj = this.x.toString();
        return qx1.q(new StringBuilder(str.length() + 2 + String.valueOf(obj).length()), str, ", ", obj);
    }
}
