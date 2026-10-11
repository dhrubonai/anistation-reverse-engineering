package x2;

import d2.b0;

/* loaded from: classes.dex */
public final class b implements h {
    public long A;
    public long B;
    public long C;

    /* renamed from: a, reason: collision with root package name */
    public final g f11086a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11087b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11088c;

    /* renamed from: d, reason: collision with root package name */
    public final j f11089d;

    /* renamed from: e, reason: collision with root package name */
    public int f11090e;

    /* renamed from: f, reason: collision with root package name */
    public long f11091f;

    /* renamed from: x, reason: collision with root package name */
    public long f11092x;

    /* renamed from: y, reason: collision with root package name */
    public long f11093y;

    /* renamed from: z, reason: collision with root package name */
    public long f11094z;

    public b(j jVar, long j4, long j10, long j11, long j12, boolean z9) {
        boolean z10;
        if (j4 >= 0 && j10 > j4) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        this.f11089d = jVar;
        this.f11087b = j4;
        this.f11088c = j10;
        if (j11 != j10 - j4 && !z9) {
            this.f11090e = 0;
        } else {
            this.f11091f = j12;
            this.f11090e = 4;
        }
        this.f11086a = new g();
    }

    @Override // x2.h
    public final b0 g() {
        if (this.f11091f != 0) {
            return new a(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    @Override // x2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(d2.q r25) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.b.m(d2.q):long");
    }

    @Override // x2.h
    public final void t(long j4) {
        this.f11093y = f1.b0.i(j4, 0L, this.f11091f - 1);
        this.f11090e = 2;
        this.f11094z = this.f11087b;
        this.A = this.f11088c;
        this.B = 0L;
        this.C = this.f11091f;
    }
}
