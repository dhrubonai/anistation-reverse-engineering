package d2;

/* loaded from: classes.dex */
public final class d implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f3114a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3115b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3116c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f3117d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3118e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3119f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3120g;

    public d(f fVar, long j4, long j10, long j11, long j12, long j13) {
        this.f3114a = fVar;
        this.f3115b = j4;
        this.f3117d = j10;
        this.f3118e = j11;
        this.f3119f = j12;
        this.f3120g = j13;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        c0 c0Var = new c0(j4, e.a(this.f3114a.f(j4), this.f3116c, this.f3117d, this.f3118e, this.f3119f, this.f3120g));
        return new a0(c0Var, c0Var);
    }

    @Override // d2.b0
    public final long l() {
        return this.f3115b;
    }
}
