package d2;

/* loaded from: classes.dex */
public class k implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3170a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3172c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3174e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3175f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3176g;

    public k(int i10, int i11, long j4, long j10, boolean z9) {
        this.f3170a = j4;
        this.f3171b = j10;
        this.f3172c = i11 == -1 ? 1 : i11;
        this.f3174e = i10;
        this.f3176g = z9;
        if (j4 == -1) {
            this.f3173d = -1L;
            this.f3175f = -9223372036854775807L;
        } else {
            long j11 = j4 - j10;
            this.f3173d = j11;
            this.f3175f = ((Math.max(0L, j11) * 8) * 1000000) / i10;
        }
    }

    @Override // d2.b0
    public final boolean g() {
        if (this.f3173d == -1 && !this.f3176g) {
            return false;
        }
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        long j10 = this.f3173d;
        long j11 = this.f3171b;
        if (j10 == -1 && !this.f3176g) {
            c0 c0Var = new c0(0L, j11);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.f3174e;
        long j12 = this.f3172c;
        long j13 = (((i10 * j4) / 8000000) / j12) * j12;
        if (j10 != -1) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = ((Math.max(0L, max - j11) * 8) * 1000000) / i10;
        c0 c0Var2 = new c0(max2, max);
        if (j10 != -1 && max2 < j4) {
            long j14 = j12 + max;
            if (j14 < this.f3170a) {
                return new a0(c0Var2, new c0(((Math.max(0L, j14 - j11) * 8) * 1000000) / i10, j14));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override // d2.b0
    public final long l() {
        return this.f3175f;
    }
}
