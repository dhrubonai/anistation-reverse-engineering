package m1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final w1.h f7098a;

    /* renamed from: b, reason: collision with root package name */
    public final n1.m f7099b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.b f7100c;

    /* renamed from: d, reason: collision with root package name */
    public final k f7101d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7102e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7103f;

    public n(long j4, n1.m mVar, n1.b bVar, w1.h hVar, long j10, k kVar) {
        this.f7102e = j4;
        this.f7099b = mVar;
        this.f7100c = bVar;
        this.f7103f = j10;
        this.f7098a = hVar;
        this.f7101d = kVar;
    }

    public final n a(long j4, n1.m mVar) {
        long c6;
        long c10;
        k l10 = this.f7099b.l();
        k l11 = mVar.l();
        if (l10 == null) {
            return new n(j4, mVar, this.f7100c, this.f7098a, this.f7103f, l10);
        }
        if (!l10.h()) {
            return new n(j4, mVar, this.f7100c, this.f7098a, this.f7103f, l11);
        }
        long j10 = l10.j(j4);
        if (j10 == 0) {
            return new n(j4, mVar, this.f7100c, this.f7098a, this.f7103f, l11);
        }
        w7.b.w(l11);
        long i10 = l10.i();
        long b10 = l10.b(i10);
        long j11 = (j10 + i10) - 1;
        long d10 = l10.d(j11, j4) + l10.b(j11);
        long i11 = l11.i();
        long b11 = l11.b(i11);
        long j12 = this.f7103f;
        if (d10 == b11) {
            c6 = j11 + 1;
        } else if (d10 >= b11) {
            if (b11 < b10) {
                c10 = j12 - (l11.c(b10, j4) - i10);
                return new n(j4, mVar, this.f7100c, this.f7098a, c10, l11);
            }
            c6 = l10.c(b11, j4);
        } else {
            throw new v1.b();
        }
        c10 = (c6 - i11) + j12;
        return new n(j4, mVar, this.f7100c, this.f7098a, c10, l11);
    }

    public final long b(long j4) {
        k kVar = this.f7101d;
        w7.b.w(kVar);
        return kVar.e(this.f7102e, j4) + this.f7103f;
    }

    public final long c(long j4) {
        long b10 = b(j4);
        k kVar = this.f7101d;
        w7.b.w(kVar);
        return (kVar.k(this.f7102e, j4) + b10) - 1;
    }

    public final long d() {
        k kVar = this.f7101d;
        w7.b.w(kVar);
        return kVar.j(this.f7102e);
    }

    public final long e(long j4) {
        long f10 = f(j4);
        k kVar = this.f7101d;
        w7.b.w(kVar);
        return kVar.d(j4 - this.f7103f, this.f7102e) + f10;
    }

    public final long f(long j4) {
        k kVar = this.f7101d;
        w7.b.w(kVar);
        return kVar.b(j4 - this.f7103f);
    }

    public final boolean g(long j4, long j10) {
        k kVar = this.f7101d;
        w7.b.w(kVar);
        if (kVar.h() || j10 == -9223372036854775807L || e(j4) <= j10) {
            return true;
        }
        return false;
    }
}
