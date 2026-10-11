package q1;

/* loaded from: classes.dex */
public abstract class g implements Comparable {
    public final long A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final String f8994a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8995b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8996c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8997d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8998e;

    /* renamed from: f, reason: collision with root package name */
    public final c1.p f8999f;

    /* renamed from: x, reason: collision with root package name */
    public final String f9000x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9001y;

    /* renamed from: z, reason: collision with root package name */
    public final long f9002z;

    public g(String str, f fVar, long j4, int i10, long j10, c1.p pVar, String str2, String str3, long j11, long j12, boolean z9) {
        this.f8994a = str;
        this.f8995b = fVar;
        this.f8996c = j4;
        this.f8997d = i10;
        this.f8998e = j10;
        this.f8999f = pVar;
        this.f9000x = str2;
        this.f9001y = str3;
        this.f9002z = j11;
        this.A = j12;
        this.B = z9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long longValue = l10.longValue();
        long j4 = this.f8998e;
        if (j4 > longValue) {
            return 1;
        }
        if (j4 < l10.longValue()) {
            return -1;
        }
        return 0;
    }
}
