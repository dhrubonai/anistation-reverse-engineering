package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m81 extends rw1 implements Runnable {
    public static final m81 G;
    public static final long H;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [mw1, m81, n11] */
    static {
        Long l;
        ?? n11Var = new n11();
        G = n11Var;
        n11Var.A0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        H = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.rw1
    public final void D0(Runnable runnable) {
        if (debugStatus != 4) {
            super.D0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.rw1
    public final Thread G0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(G.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // defpackage.rw1
    public final void I0(long j, pw1 pw1Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void K0() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        Unsafe unsafe = qs.a;
        unsafe.putObjectVolatile(this, rw1.E, (Object) null);
        unsafe.putObjectVolatile(this, rw1.C, (Object) null);
        notifyAll();
    }

    @Override // defpackage.vc1
    public final ei1 a(long j, Runnable runnable, l11 l11Var) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            ow1 ow1Var = new ow1(runnable, j2 + nanoTime);
            J0(nanoTime, ow1Var);
            return ow1Var;
        }
        return ma4.x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean H0;
        me6.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!H0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long B0 = B0();
                    if (B0 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = H + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            K0();
                            if (!H0()) {
                                G0();
                                return;
                            }
                            return;
                        }
                        if (B0 > j2) {
                            B0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (B0 > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2 && i2 != 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            _thread = null;
                            K0();
                            if (!H0()) {
                                G0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, B0);
                    }
                }
            }
        } finally {
            _thread = null;
            K0();
            if (!H0()) {
                G0();
            }
        }
    }

    @Override // defpackage.rw1, defpackage.mw1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.n11
    public final String toString() {
        return "DefaultExecutor";
    }
}
