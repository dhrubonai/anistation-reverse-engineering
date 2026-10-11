package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gk6 extends AtomicReference implements Runnable {
    public static final ns1 A;
    public static final ns1 B;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ hk6 y;
    public final Object z;

    static {
        byte b = 1;
        A = new ns1(b);
        B = new ns1(b);
    }

    public gk6(hk6 hk6Var, Callable callable) {
        this.y = hk6Var;
        callable.getClass();
        this.z = callable;
    }

    public final void a(Object obj) {
        byte b = this.x;
        hk6 hk6Var = this.y;
        switch (b) {
            case 0:
                hk6Var.n((ii3) obj);
                return;
            default:
                hk6Var.l(obj);
                return;
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        f23 f23Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof f23;
            ns1 ns1Var = B;
            if (!z2 && runnable != ns1Var) {
                break;
            }
            if (z2) {
                f23Var = (f23) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == ns1Var || compareAndSet(runnable, ns1Var)) {
                    if (!Thread.interrupted() && !z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    LockSupport.park(f23Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isDone;
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            byte b = this.x;
            hk6 hk6Var = this.y;
            switch (b) {
                case 0:
                    isDone = hk6Var.isDone();
                    break;
                default:
                    isDone = hk6Var.isDone();
                    break;
            }
            ns1 ns1Var = A;
            if (!isDone) {
                Object obj2 = this.z;
                try {
                    switch (b) {
                        case 0:
                            qb7 qb7Var = (qb7) obj2;
                            Callable callable = (Callable) qb7Var.y;
                            qg1 qg1Var = qg1.x;
                            hk6 hk6Var2 = new hk6(callable);
                            qg1Var.execute(hk6Var2);
                            io3.u(hk6Var2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qb7Var);
                            obj = hk6Var2;
                            break;
                        default:
                            obj = ((Callable) obj2).call();
                            break;
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, ns1Var)) {
                            b(currentThread);
                        }
                        if (!isDone) {
                            switch (b) {
                                case 0:
                                    hk6Var.m(th);
                                    return;
                                default:
                                    hk6Var.m(th);
                                    return;
                            }
                        }
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, ns1Var)) {
                            b(currentThread);
                        }
                        if (!isDone) {
                            a(obj);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        String obj;
        Runnable runnable = (Runnable) get();
        if (runnable == A) {
            str = "running=[DONE]";
        } else if (runnable instanceof f23) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(", ");
        byte b = this.x;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                obj = ((qb7) obj2).toString();
                break;
            default:
                obj = ((Callable) obj2).toString();
                break;
        }
        sb.append(obj);
        return sb.toString();
    }

    public gk6(hk6 hk6Var, qb7 qb7Var) {
        this.y = hk6Var;
        this.z = qb7Var;
    }
}
