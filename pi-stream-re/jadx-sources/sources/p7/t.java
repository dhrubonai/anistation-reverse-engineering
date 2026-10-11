package p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8742b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f8743a;

    public t(Throwable th, boolean z9) {
        this.f8743a = th;
        this._handled = z9 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f8743a + ']';
    }
}
