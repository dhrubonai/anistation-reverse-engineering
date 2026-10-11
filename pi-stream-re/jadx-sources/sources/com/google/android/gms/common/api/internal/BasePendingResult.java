package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.s> extends com.google.android.gms.common.api.q {
    static final ThreadLocal<Boolean> zaa = new d1(0);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private e1 mResultGuardian;
    protected final f zab;
    protected final WeakReference<com.google.android.gms.common.api.o> zac;
    private com.google.android.gms.common.api.t zah;
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.n zao;
    private volatile w0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList<com.google.android.gms.common.api.p> zag = new ArrayList<>();
    private final AtomicReference<x0> zai = new AtomicReference<>();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        Looper mainLooper;
        if (oVar != null) {
            mainLooper = ((j0) oVar).f2437b.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.zab = new f(mainLooper);
        this.zac = new WeakReference<>(oVar);
    }

    public static void zal(com.google.android.gms.common.api.s sVar) {
    }

    public final com.google.android.gms.common.api.s a() {
        R r8;
        synchronized (this.zae) {
            w7.b.v("Result has already been consumed.", !this.zal);
            w7.b.v("Result is not ready.", isReady());
            r8 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        a3.g.z(this.zai.getAndSet(null));
        w7.b.s(r8);
        return r8;
    }

    public final void addStatusListener(com.google.android.gms.common.api.p pVar) {
        boolean z9;
        if (pVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.i("Callback cannot be null.", z9);
        synchronized (this.zae) {
            if (isReady()) {
                pVar.a(this.zak);
            } else {
                this.zag.add(pVar);
            }
        }
    }

    public final R await() {
        w7.b.p("await must not be called on the UI thread");
        w7.b.v("Result has already been consumed", !this.zal);
        w7.b.v("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f2357x);
        }
        w7.b.v("Result is not ready.", isReady());
        return (R) a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(com.google.android.gms.common.api.s sVar) {
        this.zaj = sVar;
        this.zak = sVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.t tVar = this.zah;
            if (tVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(tVar, a());
            }
        }
        ArrayList<com.google.android.gms.common.api.p> arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                zal(this.zaj);
                this.zam = true;
                b(createFailedResult(Status.A));
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z9;
        synchronized (this.zae) {
            z9 = this.zam;
        }
        return z9;
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.n nVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r8) {
        synchronized (this.zae) {
            if (!this.zan && !this.zam) {
                isReady();
                w7.b.v("Results have already been set", !isReady());
                w7.b.v("Result has already been consumed", !this.zal);
                b(r8);
                return;
            }
            zal(r8);
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar) {
        synchronized (this.zae) {
            if (tVar == null) {
                this.zah = null;
                return;
            }
            boolean z9 = true;
            w7.b.v("Result has already been consumed.", !this.zal);
            if (this.zap != null) {
                z9 = false;
            }
            w7.b.v("Cannot set callbacks if then() has been called.", z9);
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(tVar, a());
            } else {
                this.zah = tVar;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.s> com.google.android.gms.common.api.v then(com.google.android.gms.common.api.u uVar) {
        boolean z9;
        w0 a10;
        w7.b.v("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            boolean z10 = false;
            if (this.zap == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.v("Cannot call then() twice.", z9);
            if (this.zah == null) {
                z10 = true;
            }
            w7.b.v("Cannot call then() if callbacks are set.", z10);
            w7.b.v("Cannot call then() if result was canceled.", !this.zam);
            this.zaq = true;
            this.zap = new w0(this.zac);
            a10 = this.zap.a();
            if (isReady()) {
                this.zab.a(this.zap, a());
            } else {
                this.zah = this.zap;
            }
        }
        return a10;
    }

    public final void zak() {
        boolean z9 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z9 = false;
        }
        this.zaq = z9;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (this.zac.get() == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(x0 x0Var) {
        this.zai.set(x0Var);
    }

    @Override // com.google.android.gms.common.api.q
    public final R await(long j4, TimeUnit timeUnit) {
        if (j4 > 0) {
            w7.b.p("await must not be called on the UI thread when time is greater than zero.");
        }
        w7.b.v("Result has already been consumed.", !this.zal);
        w7.b.v("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j4, timeUnit)) {
                forceFailureUnlessReady(Status.f2359z);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f2357x);
        }
        w7.b.v("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.t tVar, long j4, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (tVar == null) {
                this.zah = null;
                return;
            }
            boolean z9 = true;
            w7.b.v("Result has already been consumed.", !this.zal);
            if (this.zap != null) {
                z9 = false;
            }
            w7.b.v("Cannot set callbacks if then() has been called.", z9);
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(tVar, a());
            } else {
                this.zah = tVar;
                f fVar = this.zab;
                fVar.sendMessageDelayed(fVar.obtainMessage(2, this), timeUnit.toMillis(j4));
            }
        }
    }
}
