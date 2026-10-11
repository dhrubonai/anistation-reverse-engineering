package j1;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5750a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f5751b;

    /* renamed from: c, reason: collision with root package name */
    public int f5752c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5753d;

    /* renamed from: e, reason: collision with root package name */
    public int f5754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5755f;

    /* renamed from: g, reason: collision with root package name */
    public int f5756g;

    public g0(b1 b1Var) {
        this.f5751b = b1Var;
    }

    public final void a(int i10) {
        boolean z9;
        boolean z10 = this.f5750a;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f5750a = z10 | z9;
        this.f5752c += i10;
    }
}
