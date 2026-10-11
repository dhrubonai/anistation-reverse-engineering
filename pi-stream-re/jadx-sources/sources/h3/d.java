package h3;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public final f1.s f4699a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4700b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4701c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4702d;

    /* renamed from: e, reason: collision with root package name */
    public String f4703e;

    /* renamed from: f, reason: collision with root package name */
    public d2.g0 f4704f;

    /* renamed from: g, reason: collision with root package name */
    public int f4705g;

    /* renamed from: h, reason: collision with root package name */
    public int f4706h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4707i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4708j;

    /* renamed from: k, reason: collision with root package name */
    public long f4709k;

    /* renamed from: l, reason: collision with root package name */
    public c1.v f4710l;

    /* renamed from: m, reason: collision with root package name */
    public int f4711m;

    /* renamed from: n, reason: collision with root package name */
    public long f4712n;

    public d(String str, int i10) {
        f1.s sVar = new f1.s(new byte[16], 0, (Object) null);
        this.f4699a = sVar;
        this.f4700b = new f1.t(sVar.f3851b);
        this.f4705g = 0;
        this.f4706h = 0;
        this.f4707i = false;
        this.f4708j = false;
        this.f4712n = -9223372036854775807L;
        this.f4701c = str;
        this.f4702d = i10;
    }

    @Override // h3.k
    public final void a() {
        this.f4705g = 0;
        this.f4706h = 0;
        this.f4707i = false;
        this.f4708j = false;
        this.f4712n = -9223372036854775807L;
    }

    @Override // h3.k
    public final void d(f1.t tVar) {
        int i10;
        boolean z9;
        boolean z10;
        int v9;
        boolean z11;
        boolean z12;
        w7.b.w(this.f4704f);
        while (true) {
            int i11 = tVar.f3860c - tVar.f3859b;
            if (i11 > 0) {
                int i12 = this.f4705g;
                f1.t tVar2 = this.f4700b;
                boolean z13 = true;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int min = Math.min(i11, this.f4711m - this.f4706h);
                            this.f4704f.f(min, tVar);
                            int i13 = this.f4706h + min;
                            this.f4706h = i13;
                            if (i13 == this.f4711m) {
                                if (this.f4712n == -9223372036854775807L) {
                                    z13 = false;
                                }
                                w7.b.u(z13);
                                this.f4704f.d(this.f4712n, 1, this.f4711m, 0, null);
                                this.f4712n += this.f4709k;
                                this.f4705g = 0;
                            }
                        }
                    } else {
                        byte[] bArr = tVar2.f3858a;
                        int min2 = Math.min(i11, 16 - this.f4706h);
                        tVar.d(bArr, this.f4706h, min2);
                        int i14 = this.f4706h + min2;
                        this.f4706h = i14;
                        if (i14 != 16) {
                            z13 = false;
                        }
                        if (z13) {
                            f1.s sVar = this.f4699a;
                            sVar.o(0);
                            c1.f P = com.bumptech.glide.d.P(sVar);
                            c1.v vVar = this.f4710l;
                            if (vVar == null || P.f1679c != vVar.f1947z || P.f1678b != vVar.A || !"audio/ac4".equals(vVar.f1935m)) {
                                c1.u uVar = new c1.u();
                                uVar.f1897a = this.f4703e;
                                uVar.e("audio/ac4");
                                uVar.f1920y = P.f1679c;
                                uVar.f1921z = P.f1678b;
                                uVar.f1900d = this.f4701c;
                                uVar.f1902f = this.f4702d;
                                c1.v vVar2 = new c1.v(uVar);
                                this.f4710l = vVar2;
                                this.f4704f.b(vVar2);
                            }
                            this.f4711m = P.f1680d;
                            this.f4709k = (P.f1681e * 1000000) / this.f4710l.A;
                            tVar2.G(0);
                            this.f4704f.f(16, tVar2);
                            this.f4705g = 2;
                        }
                    }
                } else {
                    while (true) {
                        i10 = 65;
                        if (tVar.f3860c - tVar.f3859b > 0) {
                            if (!this.f4707i) {
                                if (tVar.v() == 172) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                this.f4707i = z10;
                            } else {
                                v9 = tVar.v();
                                if (v9 == 172) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f4707i = z11;
                                if (v9 == 64 || v9 == 65) {
                                    break;
                                }
                            }
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    if (v9 == 65) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f4708j = z12;
                    z9 = true;
                    if (z9) {
                        this.f4705g = 1;
                        byte[] bArr2 = tVar2.f3858a;
                        bArr2[0] = -84;
                        if (!this.f4708j) {
                            i10 = 64;
                        }
                        bArr2[1] = (byte) i10;
                        this.f4706h = 2;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4712n = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4703e = i0Var.f4810e;
        i0Var.b();
        this.f4704f = rVar.i(i0Var.f4809d, 1);
    }

    @Override // h3.k
    public final void g() {
    }
}
