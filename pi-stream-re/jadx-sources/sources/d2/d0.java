package d2;

/* loaded from: classes.dex */
public final class d0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3122b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3123c;

    /* renamed from: d, reason: collision with root package name */
    public int f3124d;

    /* renamed from: e, reason: collision with root package name */
    public int f3125e;

    /* renamed from: f, reason: collision with root package name */
    public r f3126f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f3127g;

    public d0(int i10, int i11, String str) {
        this.f3121a = i10;
        this.f3122b = i11;
        this.f3123c = str;
    }

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        if (j4 == 0 || this.f3125e == 1) {
            this.f3125e = 1;
            this.f3124d = 0;
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f3126f = rVar;
        g0 i10 = rVar.i(1024, 4);
        this.f3127g = i10;
        c1.u uVar = new c1.u();
        uVar.e(this.f3123c);
        i10.b(new c1.v(uVar));
        this.f3126f.b();
        this.f3126f.s(new e0());
        this.f3125e = 1;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        boolean z9;
        int i10 = this.f3122b;
        int i11 = this.f3121a;
        if (i11 != -1 && i10 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        f1.t tVar = new f1.t(i10);
        qVar.n(tVar.f3858a, 0, i10);
        if (tVar.A() == i11) {
            return true;
        }
        return false;
    }

    @Override // d2.p
    public final int i(q qVar, t tVar) {
        int i10 = this.f3125e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        g0 g0Var = this.f3127g;
        g0Var.getClass();
        int c6 = g0Var.c(qVar, 1024, true);
        if (c6 == -1) {
            this.f3125e = 2;
            this.f3127g.d(0L, 1, this.f3124d, 0, null);
            this.f3124d = 0;
        } else {
            this.f3124d += c6;
        }
        return 0;
    }
}
