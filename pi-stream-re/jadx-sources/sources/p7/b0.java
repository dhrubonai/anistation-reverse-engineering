package p7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b0 extends r0 implements Runnable {
    public static final long A;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: z, reason: collision with root package name */
    public static final b0 f8663z;

    static {
        Long l10;
        b0 b0Var = new b0();
        f8663z = b0Var;
        b0Var.K(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        A = timeUnit.toNanos(l10.longValue());
    }

    @Override // p7.s0
    public final Thread J() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // p7.s0
    public final void M(long j4, p0 p0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p7.r0
    public final void O(Runnable runnable) {
        boolean z9;
        if (debugStatus == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            super.O(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void T() {
        boolean z9;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return;
        }
        debugStatus = 3;
        r0.f8731f.set(this, null);
        r0.f8732x.set(this, null);
        notifyAll();
    }

    @Override // p7.r0, p7.f0
    public final k0 q(long j4, x1 x1Var, z6.i iVar) {
        w4.o oVar = t0.f8744a;
        long j10 = 0;
        if (j4 > 0) {
            if (j4 >= 9223372036854L) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 1000000 * j4;
            }
        }
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            o0 o0Var = new o0(x1Var, j10 + nanoTime);
            S(nanoTime, o0Var);
            return o0Var;
        }
        return o1.f8727a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        u1.f8748a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    z10 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z10 = true;
                }
            }
            if (!z10) {
                _thread = null;
                T();
                if (!Q()) {
                    J();
                    return;
                }
                return;
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long R = R();
                if (R == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = A + nanoTime;
                    }
                    long j10 = j4 - nanoTime;
                    if (j10 <= 0) {
                        _thread = null;
                        T();
                        if (!Q()) {
                            J();
                            return;
                        }
                        return;
                    }
                    if (R > j10) {
                        R = j10;
                    }
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (R > 0) {
                    int i11 = debugStatus;
                    if (i11 != 2 && i11 != 3) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        _thread = null;
                        T();
                        if (!Q()) {
                            J();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, R);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            T();
            if (!Q()) {
                J();
            }
            throw th;
        }
    }

    @Override // p7.r0, p7.s0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
