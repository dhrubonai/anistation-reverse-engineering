package p7;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future f8702a;

    public j0(ScheduledFuture scheduledFuture) {
        this.f8702a = scheduledFuture;
    }

    @Override // p7.k0
    public final void b() {
        this.f8702a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8702a + ']';
    }
}
