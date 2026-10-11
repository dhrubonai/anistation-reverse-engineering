package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lj3 extends Handler implements Runnable {
    public kj3 A;
    public IOException B;
    public int C;
    public Thread D;
    public boolean E;
    public volatile boolean F;
    public final /* synthetic */ dn0 G;
    public final int x;
    public final mj3 y;
    public final long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj3(dn0 dn0Var, Looper looper, mj3 mj3Var, kj3 kj3Var, int i, long j) {
        super(looper);
        this.G = dn0Var;
        this.y = mj3Var;
        this.A = kj3Var;
        this.x = i;
        this.z = j;
    }

    public final void a(boolean z) {
        this.F = z;
        this.B = null;
        if (hasMessages(1)) {
            this.E = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.E = true;
                    this.y.b();
                    Thread thread = this.D;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.G.z = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            kj3 kj3Var = this.A;
            kj3Var.getClass();
            kj3Var.g(this.y, elapsedRealtime, elapsedRealtime - this.z, true);
            this.A = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.z;
        kj3 kj3Var = this.A;
        kj3Var.getClass();
        kj3Var.r(this.y, elapsedRealtime, j, this.C);
        this.B = null;
        dn0 dn0Var = this.G;
        l04 l04Var = (l04) dn0Var.y;
        lj3 lj3Var = (lj3) dn0Var.z;
        lj3Var.getClass();
        l04Var.execute(lj3Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        if (!this.F) {
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i != 4) {
                this.G.z = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.z;
                kj3 kj3Var = this.A;
                kj3Var.getClass();
                if (this.E) {
                    kj3Var.g(this.y, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 2) {
                    if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.B = iOException;
                        int i3 = this.C + 1;
                        this.C = i3;
                        q03 B = kj3Var.B(this.y, elapsedRealtime, j, iOException, i3);
                        int i4 = B.x;
                        if (i4 == 3) {
                            this.G.A = this.B;
                            return;
                        }
                        if (i4 != 2) {
                            if (i4 == 1) {
                                this.C = 1;
                            }
                            long j2 = B.y;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.C - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                            }
                            dn0 dn0Var = this.G;
                            if (((lj3) dn0Var.z) == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            io3.B(z);
                            dn0Var.z = this;
                            if (j2 > 0) {
                                sendEmptyMessageDelayed(1, j2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                try {
                    kj3Var.k(this.y, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    kb0.t("LoadTask", "Unexpected exception handling load completed", e);
                    this.G.A = new oj3(e);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.E;
                this.D = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.y.getClass().getSimpleName()));
                try {
                    this.y.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.D = null;
                Thread.interrupted();
            }
            if (!this.F) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.F) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.F) {
                kb0.t("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new oj3(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.F) {
                kb0.t("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new oj3(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.F) {
                kb0.t("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
