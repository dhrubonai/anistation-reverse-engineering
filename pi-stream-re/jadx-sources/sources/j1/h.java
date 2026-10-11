package j1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f5757a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5758b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5759c;

    /* renamed from: d, reason: collision with root package name */
    public long f5760d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f5761e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f5763g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f5764h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f5767k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    public float f5766j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f5768l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f5769m = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f5762f = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f5765i = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f5770n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public h(long j4, long j10, float f10) {
        this.f5757a = j4;
        this.f5758b = j10;
        this.f5759c = f10;
    }

    public final void a() {
        long j4;
        long j10 = this.f5760d;
        if (j10 != -9223372036854775807L) {
            j4 = this.f5761e;
            if (j4 == -9223372036854775807L) {
                long j11 = this.f5763g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j4 = this.f5764h;
                if (j4 == -9223372036854775807L || j10 <= j4) {
                    j4 = j10;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f5762f == j4) {
            return;
        }
        this.f5762f = j4;
        this.f5765i = j4;
        this.f5770n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.f5769m = -9223372036854775807L;
    }
}
