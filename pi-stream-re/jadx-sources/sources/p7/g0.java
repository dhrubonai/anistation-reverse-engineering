package p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class g0 extends t7.w {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8681e = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_decision");
    private volatile int _decision;

    @Override // t7.w, p7.k1
    public final void i(Object obj) {
        j(obj);
    }

    @Override // t7.w, p7.k1
    public final void j(Object obj) {
        boolean z9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8681e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            z9 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, 0, 2)) {
                z9 = true;
                break;
            }
        }
        if (z9) {
            return;
        }
        t7.j.a(com.bumptech.glide.d.F(this.f10089d), com.bumptech.glide.c.d0(obj), null);
    }
}
