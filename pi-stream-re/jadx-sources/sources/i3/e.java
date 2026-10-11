package i3;

import d2.a0;
import d2.b0;
import d2.c0;

/* loaded from: classes.dex */
public final class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final d2.b f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5340b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5341c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5342d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5343e;

    public e(d2.b bVar, int i10, long j4, long j10) {
        this.f5339a = bVar;
        this.f5340b = i10;
        this.f5341c = j4;
        long j11 = (j10 - j4) / bVar.f3098f;
        this.f5342d = j11;
        this.f5343e = a(j11);
    }

    public final long a(long j4) {
        return f1.b0.V(j4 * this.f5340b, 1000000L, this.f5339a.f3096d);
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        d2.b bVar = this.f5339a;
        long j10 = this.f5342d;
        long i10 = f1.b0.i((bVar.f3096d * j4) / (this.f5340b * 1000000), 0L, j10 - 1);
        long j11 = this.f5341c;
        long a10 = a(i10);
        c0 c0Var = new c0(a10, (bVar.f3098f * i10) + j11);
        if (a10 < j4 && i10 != j10 - 1) {
            long j12 = i10 + 1;
            return new a0(c0Var, new c0(a(j12), (bVar.f3098f * j12) + j11));
        }
        return new a0(c0Var, c0Var);
    }

    @Override // d2.b0
    public final long l() {
        return this.f5343e;
    }
}
