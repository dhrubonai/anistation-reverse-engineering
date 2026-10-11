package z1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class k extends Handler implements Runnable {
    public final /* synthetic */ o A;

    /* renamed from: a, reason: collision with root package name */
    public final int f11930a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11931b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11932c;

    /* renamed from: d, reason: collision with root package name */
    public j f11933d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f11934e;

    /* renamed from: f, reason: collision with root package name */
    public int f11935f;

    /* renamed from: x, reason: collision with root package name */
    public Thread f11936x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11937y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f11938z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Looper looper, l lVar, j jVar, int i10, long j4) {
        super(looper);
        this.A = oVar;
        this.f11931b = lVar;
        this.f11933d = jVar;
        this.f11930a = i10;
        this.f11932c = j4;
    }

    public final void a(boolean z9) {
        this.f11938z = z9;
        this.f11934e = null;
        if (hasMessages(0)) {
            this.f11937y = true;
            removeMessages(0);
            if (!z9) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f11937y = true;
                this.f11931b.m();
                Thread thread = this.f11936x;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z9) {
            this.A.f11943b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.f11933d;
            jVar.getClass();
            jVar.r(this.f11931b, elapsedRealtime, elapsedRealtime - this.f11932c, true);
            this.f11933d = null;
        }
    }

    public final void b(long j4) {
        boolean z9;
        o oVar = this.A;
        if (oVar.f11943b == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        oVar.f11943b = this;
        if (j4 > 0) {
            sendEmptyMessageDelayed(0, j4);
            return;
        }
        this.f11934e = null;
        ExecutorService executorService = oVar.f11942a;
        k kVar = oVar.f11943b;
        kVar.getClass();
        executorService.execute(kVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f11938z) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f11934e = null;
            o oVar = this.A;
            ExecutorService executorService = oVar.f11942a;
            k kVar = oVar.f11943b;
            kVar.getClass();
            executorService.execute(kVar);
            return;
        }
        if (i10 != 3) {
            this.A.f11943b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f11932c;
            j jVar = this.f11933d;
            jVar.getClass();
            if (this.f11937y) {
                jVar.r(this.f11931b, elapsedRealtime, j4, false);
                return;
            }
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f11934e = iOException;
                    int i12 = this.f11935f + 1;
                    this.f11935f = i12;
                    i q9 = jVar.q(this.f11931b, elapsedRealtime, j4, iOException, i12);
                    int i13 = q9.f11928a;
                    if (i13 == 3) {
                        this.A.f11944c = this.f11934e;
                        return;
                    } else {
                        if (i13 != 2) {
                            if (i13 == 1) {
                                this.f11935f = 1;
                            }
                            long j10 = q9.f11929b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f11935f - 1) * 1000, 5000);
                            }
                            b(j10);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            try {
                jVar.f(this.f11931b, elapsedRealtime, j4);
                return;
            } catch (RuntimeException e10) {
                f1.o.d("LoadTask", "Unexpected exception handling load completed", e10);
                this.A.f11944c = new n(e10);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                if (!this.f11937y) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f11936x = Thread.currentThread();
            }
            if (z9) {
                com.bumptech.glide.d.c("load:".concat(this.f11931b.getClass().getSimpleName()));
                try {
                    this.f11931b.c();
                    com.bumptech.glide.d.s();
                } catch (Throwable th) {
                    com.bumptech.glide.d.s();
                    throw th;
                }
            }
            synchronized (this) {
                this.f11936x = null;
                Thread.interrupted();
            }
            if (!this.f11938z) {
                sendEmptyMessage(1);
            }
        } catch (IOException e10) {
            if (!this.f11938z) {
                obtainMessage(2, e10).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f11938z) {
                f1.o.d("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new n(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f11938z) {
                f1.o.d("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (!this.f11938z) {
                f1.o.d("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new n(e13)).sendToTarget();
            }
        }
    }
}
