package m1;

import f1.b0;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final d2.j f7093a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7094b;

    public l(d2.j jVar, long j4) {
        this.f7093a = jVar;
        this.f7094b = j4;
    }

    @Override // m1.k
    public final long b(long j4) {
        return this.f7093a.f3161e[(int) j4] - this.f7094b;
    }

    @Override // m1.k
    public final long c(long j4, long j10) {
        return b0.f(this.f7093a.f3161e, j4 + this.f7094b, true);
    }

    @Override // m1.k
    public final long d(long j4, long j10) {
        return this.f7093a.f3160d[(int) j4];
    }

    @Override // m1.k
    public final long e(long j4, long j10) {
        return 0L;
    }

    @Override // m1.k
    public final long f(long j4, long j10) {
        return -9223372036854775807L;
    }

    @Override // m1.k
    public final n1.j g(long j4) {
        return new n1.j(null, this.f7093a.f3159c[(int) j4], r0.f3158b[r8]);
    }

    @Override // m1.k
    public final boolean h() {
        return true;
    }

    @Override // m1.k
    public final long i() {
        return 0L;
    }

    @Override // m1.k
    public final long j(long j4) {
        return this.f7093a.f3157a;
    }

    @Override // m1.k
    public final long k(long j4, long j10) {
        return this.f7093a.f3157a;
    }
}
