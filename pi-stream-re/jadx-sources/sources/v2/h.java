package v2;

import d2.a0;
import d2.c0;
import f1.b0;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f10624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10627d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10628e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10629f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f10630g;

    public h(long j4, int i10, long j10, int i11, long j11, long[] jArr) {
        this.f10624a = j4;
        this.f10625b = i10;
        this.f10626c = j10;
        this.f10627d = i11;
        this.f10628e = j11;
        this.f10630g = jArr;
        this.f10629f = j11 != -1 ? j4 + j11 : -1L;
    }

    @Override // v2.f
    public final long b(long j4) {
        long j10;
        double d10;
        long j11 = j4 - this.f10624a;
        if (g() && j11 > this.f10625b) {
            long[] jArr = this.f10630g;
            w7.b.w(jArr);
            double d11 = (j11 * 256.0d) / this.f10628e;
            int f10 = b0.f(jArr, (long) d11, true);
            long j12 = this.f10626c;
            long j13 = (f10 * j12) / 100;
            long j14 = jArr[f10];
            int i10 = f10 + 1;
            long j15 = (j12 * i10) / 100;
            if (f10 == 99) {
                j10 = 256;
            } else {
                j10 = jArr[i10];
            }
            if (j14 == j10) {
                d10 = 0.0d;
            } else {
                d10 = (d11 - j14) / (j10 - j14);
            }
            return Math.round(d10 * (j15 - j13)) + j13;
        }
        return 0L;
    }

    @Override // v2.f
    public final long d() {
        return this.f10629f;
    }

    @Override // d2.b0
    public final boolean g() {
        if (this.f10630g != null) {
            return true;
        }
        return false;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        double d10;
        double d11;
        boolean g10 = g();
        int i10 = this.f10625b;
        long j10 = this.f10624a;
        if (!g10) {
            c0 c0Var = new c0(0L, j10 + i10);
            return new a0(c0Var, c0Var);
        }
        long i11 = b0.i(j4, 0L, this.f10626c);
        double d12 = (i11 * 100.0d) / this.f10626c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d10 = 256.0d;
                d13 = 256.0d;
                double d14 = d13 / d10;
                long j11 = this.f10628e;
                c0 c0Var2 = new c0(i11, j10 + b0.i(Math.round(d14 * j11), i10, j11 - 1));
                return new a0(c0Var2, c0Var2);
            }
            int i12 = (int) d12;
            long[] jArr = this.f10630g;
            w7.b.w(jArr);
            double d15 = jArr[i12];
            if (i12 == 99) {
                d11 = 256.0d;
            } else {
                d11 = jArr[i12 + 1];
            }
            d13 = ((d11 - d15) * (d12 - i12)) + d15;
        }
        d10 = 256.0d;
        double d142 = d13 / d10;
        long j112 = this.f10628e;
        c0 c0Var22 = new c0(i11, j10 + b0.i(Math.round(d142 * j112), i10, j112 - 1));
        return new a0(c0Var22, c0Var22);
    }

    @Override // v2.f
    public final int k() {
        return this.f10627d;
    }

    @Override // d2.b0
    public final long l() {
        return this.f10626c;
    }
}
