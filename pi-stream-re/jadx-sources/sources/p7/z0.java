package p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class z0 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8759f = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final h7.l f8760e;

    public z0(h7.l lVar) {
        this.f8760e = lVar;
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return w6.f.f11019a;
    }

    @Override // p7.e1
    public final void l(Throwable th) {
        if (f8759f.compareAndSet(this, 0, 1)) {
            this.f8760e.invoke(th);
        }
    }
}
