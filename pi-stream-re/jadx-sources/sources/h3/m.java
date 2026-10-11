package h3;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f4825q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f4826a;

    /* renamed from: b, reason: collision with root package name */
    public d2.g0 f4827b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f4828c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.t f4829d;

    /* renamed from: e, reason: collision with root package name */
    public final x f4830e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f4831f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final l f4832g = new l();

    /* renamed from: h, reason: collision with root package name */
    public long f4833h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4834i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4835j;

    /* renamed from: k, reason: collision with root package name */
    public long f4836k;

    /* renamed from: l, reason: collision with root package name */
    public long f4837l;

    /* renamed from: m, reason: collision with root package name */
    public long f4838m;

    /* renamed from: n, reason: collision with root package name */
    public long f4839n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4840p;

    public m(k0 k0Var) {
        this.f4828c = k0Var;
        if (k0Var != null) {
            this.f4830e = new x(178);
            this.f4829d = new f1.t();
        } else {
            this.f4830e = null;
            this.f4829d = null;
        }
        this.f4837l = -9223372036854775807L;
        this.f4839n = -9223372036854775807L;
    }

    @Override // h3.k
    public final void a() {
        g1.g.a(this.f4831f);
        l lVar = this.f4832g;
        lVar.f4821a = false;
        lVar.f4822b = 0;
        lVar.f4823c = 0;
        x xVar = this.f4830e;
        if (xVar != null) {
            xVar.f();
        }
        this.f4833h = 0L;
        this.f4834i = false;
        this.f4837l = -9223372036854775807L;
        this.f4839n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r21) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4837l = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4826a = i0Var.f4810e;
        i0Var.b();
        this.f4827b = rVar.i(i0Var.f4809d, 2);
        k0 k0Var = this.f4828c;
        if (k0Var != null) {
            k0Var.b(rVar, i0Var);
        }
    }

    @Override // h3.k
    public final void g() {
    }
}
