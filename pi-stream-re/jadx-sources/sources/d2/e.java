package d2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f3128a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3129b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3130c;

    /* renamed from: d, reason: collision with root package name */
    public long f3131d;

    /* renamed from: e, reason: collision with root package name */
    public long f3132e;

    /* renamed from: f, reason: collision with root package name */
    public long f3133f;

    /* renamed from: g, reason: collision with root package name */
    public long f3134g;

    /* renamed from: h, reason: collision with root package name */
    public long f3135h;

    public e(long j4, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f3128a = j4;
        this.f3129b = j10;
        this.f3131d = j11;
        this.f3132e = j12;
        this.f3133f = j13;
        this.f3134g = j14;
        this.f3130c = j15;
        this.f3135h = a(j10, j11, j12, j13, j14, j15);
    }

    public static long a(long j4, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j4 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return f1.b0.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
