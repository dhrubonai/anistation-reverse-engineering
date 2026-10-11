package u7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p7.u0;

/* loaded from: classes.dex */
public abstract class g extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final b f10317c;

    public g(int i10, int i11, long j4, String str) {
        this.f10317c = new b(i10, i11, j4, str);
    }

    @Override // p7.w
    public final void G(z6.i iVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f10304y;
        this.f10317c.f(runnable, j.f10327g, false);
    }
}
