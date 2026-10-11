package k0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6288a;

    /* renamed from: b, reason: collision with root package name */
    public int f6289b;

    /* renamed from: c, reason: collision with root package name */
    public float f6290c;

    /* renamed from: d, reason: collision with root package name */
    public float f6291d;

    /* renamed from: h, reason: collision with root package name */
    public float f6295h;

    /* renamed from: i, reason: collision with root package name */
    public int f6296i;

    /* renamed from: e, reason: collision with root package name */
    public long f6292e = Long.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public long f6294g = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f6293f = 0;

    public final float a(long j4) {
        long j10 = this.f6292e;
        if (j4 < j10) {
            return 0.0f;
        }
        long j11 = this.f6294g;
        if (j11 >= 0 && j4 >= j11) {
            float f10 = this.f6295h;
            return (g.b(((float) (j4 - j11)) / this.f6296i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
        return g.b(((float) (j4 - j10)) / this.f6288a, 0.0f, 1.0f) * 0.5f;
    }
}
