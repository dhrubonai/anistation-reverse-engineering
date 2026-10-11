package k9;

import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public final class k extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f6526e;

    public k(y yVar) {
        h0.u(yVar, "delegate");
        this.f6526e = yVar;
    }

    @Override // k9.y
    public final y a() {
        return this.f6526e.a();
    }

    @Override // k9.y
    public final y b() {
        return this.f6526e.b();
    }

    @Override // k9.y
    public final long c() {
        return this.f6526e.c();
    }

    @Override // k9.y
    public final y d(long j4) {
        return this.f6526e.d(j4);
    }

    @Override // k9.y
    public final boolean e() {
        return this.f6526e.e();
    }

    @Override // k9.y
    public final void f() {
        this.f6526e.f();
    }

    @Override // k9.y
    public final y g(long j4, TimeUnit timeUnit) {
        h0.u(timeUnit, "unit");
        return this.f6526e.g(j4, timeUnit);
    }
}
