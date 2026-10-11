package h3;

/* loaded from: classes.dex */
public final class w implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f1.t f4962a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.b f4963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4965d;

    /* renamed from: e, reason: collision with root package name */
    public d2.g0 f4966e;

    /* renamed from: f, reason: collision with root package name */
    public String f4967f;

    /* renamed from: g, reason: collision with root package name */
    public int f4968g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4969h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4970i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4971j;

    /* renamed from: k, reason: collision with root package name */
    public long f4972k;

    /* renamed from: l, reason: collision with root package name */
    public int f4973l;

    /* renamed from: m, reason: collision with root package name */
    public long f4974m;

    public w(String str, int i10) {
        f1.t tVar = new f1.t(4);
        this.f4962a = tVar;
        tVar.f3858a[0] = -1;
        this.f4963b = new d2.b();
        this.f4974m = -9223372036854775807L;
        this.f4964c = str;
        this.f4965d = i10;
    }

    @Override // h3.k
    public final void a() {
        this.f4968g = 0;
        this.f4969h = 0;
        this.f4971j = false;
        this.f4974m = -9223372036854775807L;
    }

    @Override // h3.k
    public final void d(f1.t tVar) {
        boolean z9;
        boolean z10;
        w7.b.w(this.f4966e);
        while (true) {
            int i10 = tVar.f3860c;
            int i11 = tVar.f3859b;
            int i12 = i10 - i11;
            if (i12 > 0) {
                int i13 = this.f4968g;
                boolean z11 = true;
                f1.t tVar2 = this.f4962a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            int min = Math.min(i12, this.f4973l - this.f4969h);
                            this.f4966e.f(min, tVar);
                            int i14 = this.f4969h + min;
                            this.f4969h = i14;
                            if (i14 >= this.f4973l) {
                                if (this.f4974m == -9223372036854775807L) {
                                    z11 = false;
                                }
                                w7.b.u(z11);
                                this.f4966e.d(this.f4974m, 1, this.f4973l, 0, null);
                                this.f4974m += this.f4972k;
                                this.f4969h = 0;
                                this.f4968g = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int min2 = Math.min(i12, 4 - this.f4969h);
                        tVar.d(tVar2.f3858a, this.f4969h, min2);
                        int i15 = this.f4969h + min2;
                        this.f4969h = i15;
                        if (i15 >= 4) {
                            tVar2.G(0);
                            int f10 = tVar2.f();
                            d2.b bVar = this.f4963b;
                            if (!bVar.a(f10)) {
                                this.f4969h = 0;
                                this.f4968g = 1;
                            } else {
                                this.f4973l = bVar.f3095c;
                                if (!this.f4970i) {
                                    this.f4972k = (bVar.f3099g * 1000000) / bVar.f3096d;
                                    c1.u uVar = new c1.u();
                                    uVar.f1897a = this.f4967f;
                                    uVar.e((String) bVar.f3094b);
                                    uVar.f1909m = 4096;
                                    uVar.f1920y = bVar.f3097e;
                                    uVar.f1921z = bVar.f3096d;
                                    uVar.f1900d = this.f4964c;
                                    uVar.f1902f = this.f4965d;
                                    this.f4966e.b(new c1.v(uVar));
                                    this.f4970i = true;
                                }
                                tVar2.G(0);
                                this.f4966e.f(4, tVar2);
                                this.f4968g = 2;
                            }
                        }
                    }
                } else {
                    byte[] bArr = tVar.f3858a;
                    while (true) {
                        if (i11 < i10) {
                            byte b10 = bArr[i11];
                            if ((b10 & 255) == 255) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (this.f4971j && (b10 & 224) == 224) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f4971j = z9;
                            if (z10) {
                                tVar.G(i11 + 1);
                                this.f4971j = false;
                                tVar2.f3858a[1] = bArr[i11];
                                this.f4969h = 2;
                                this.f4968g = 1;
                                break;
                            }
                            i11++;
                        } else {
                            tVar.G(i10);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4974m = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4967f = i0Var.f4810e;
        i0Var.b();
        this.f4966e = rVar.i(i0Var.f4809d, 1);
    }

    @Override // h3.k
    public final void g() {
    }
}
