package t7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p7.c0;
import p7.f0;
import p7.k0;
import p7.x1;

/* loaded from: classes.dex */
public final class k extends p7.w implements f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10068y = AtomicIntegerFieldUpdater.newUpdater(k.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final p7.w f10069c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f10071e;

    /* renamed from: f, reason: collision with root package name */
    public final o f10072f;
    private volatile int runningWorkers;

    /* renamed from: x, reason: collision with root package name */
    public final Object f10073x;

    /* JADX WARN: Multi-variable type inference failed */
    public k(u7.k kVar, int i10) {
        f0 f0Var;
        this.f10069c = kVar;
        this.f10070d = i10;
        if (kVar instanceof f0) {
            f0Var = (f0) kVar;
        } else {
            f0Var = null;
        }
        this.f10071e = f0Var == null ? c0.f8669a : f0Var;
        this.f10072f = new o();
        this.f10073x = new Object();
    }

    @Override // p7.w
    public final void G(z6.i iVar, Runnable runnable) {
        boolean z9;
        Runnable I;
        this.f10072f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10068y;
        if (atomicIntegerFieldUpdater.get(this) < this.f10070d) {
            synchronized (this.f10073x) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f10070d) {
                    z9 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z9 = true;
                }
            }
            if (z9 && (I = I()) != null) {
                this.f10069c.G(this, new androidx.appcompat.widget.j(6, this, I));
            }
        }
    }

    public final Runnable I() {
        while (true) {
            Runnable runnable = (Runnable) this.f10072f.d();
            if (runnable == null) {
                synchronized (this.f10073x) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10068y;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f10072f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // p7.f0
    public final k0 q(long j4, x1 x1Var, z6.i iVar) {
        return this.f10071e.q(j4, x1Var, iVar);
    }
}
