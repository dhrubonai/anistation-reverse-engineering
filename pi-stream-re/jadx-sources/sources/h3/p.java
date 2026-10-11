package h3;

/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f4855l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final k0 f4856a;

    /* renamed from: f, reason: collision with root package name */
    public o f4861f;

    /* renamed from: g, reason: collision with root package name */
    public long f4862g;

    /* renamed from: h, reason: collision with root package name */
    public String f4863h;

    /* renamed from: i, reason: collision with root package name */
    public d2.g0 f4864i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4865j;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f4858c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final n f4859d = new n();

    /* renamed from: k, reason: collision with root package name */
    public long f4866k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final x f4860e = new x(178);

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4857b = new f1.t();

    public p(k0 k0Var) {
        this.f4856a = k0Var;
    }

    @Override // h3.k
    public final void a() {
        g1.g.a(this.f4858c);
        n nVar = this.f4859d;
        nVar.f4842a = false;
        nVar.f4844c = 0;
        nVar.f4843b = 0;
        o oVar = this.f4861f;
        if (oVar != null) {
            oVar.f4848b = false;
            oVar.f4849c = false;
            oVar.f4850d = false;
            oVar.f4851e = -1;
        }
        x xVar = this.f4860e;
        if (xVar != null) {
            xVar.f();
        }
        this.f4862g = 0L;
        this.f4866k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023e  */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r26) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.p.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4866k = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4863h = i0Var.f4810e;
        i0Var.b();
        d2.g0 i10 = rVar.i(i0Var.f4809d, 2);
        this.f4864i = i10;
        this.f4861f = new o(i10);
        k0 k0Var = this.f4856a;
        if (k0Var != null) {
            k0Var.b(rVar, i0Var);
        }
    }

    @Override // h3.k
    public final void g() {
    }
}
