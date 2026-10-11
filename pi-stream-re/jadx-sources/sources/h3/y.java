package h3;

/* loaded from: classes.dex */
public final class y implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f4981a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.s f4982b = new f1.s(new byte[10], 0, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public int f4983c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4984d;

    /* renamed from: e, reason: collision with root package name */
    public f1.y f4985e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4986f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4987g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4988h;

    /* renamed from: i, reason: collision with root package name */
    public int f4989i;

    /* renamed from: j, reason: collision with root package name */
    public int f4990j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4991k;

    /* renamed from: l, reason: collision with root package name */
    public long f4992l;

    public y(k kVar) {
        this.f4981a = kVar;
    }

    @Override // h3.j0
    public final void a() {
        this.f4983c = 0;
        this.f4984d = 0;
        this.f4988h = false;
        this.f4981a.a();
    }

    @Override // h3.j0
    public final void b(int i10, f1.t tVar) {
        int i11;
        int i12;
        boolean z9;
        int i13;
        w7.b.w(this.f4985e);
        int i14 = i10 & 1;
        k kVar = this.f4981a;
        int i15 = -1;
        int i16 = 3;
        int i17 = 2;
        if (i14 != 0) {
            int i18 = this.f4983c;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        if (this.f4990j != -1) {
                            f1.o.f("PesReader", "Unexpected start indicator: expected " + this.f4990j + " more bytes");
                        }
                        kVar.g();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    f1.o.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f4983c = 1;
            this.f4984d = 0;
        }
        int i19 = i10;
        while (true) {
            int i20 = tVar.f3860c;
            int i21 = tVar.f3859b;
            int i22 = i20 - i21;
            if (i22 > 0) {
                int i23 = this.f4983c;
                if (i23 != 0) {
                    f1.s sVar = this.f4982b;
                    if (i23 != 1) {
                        if (i23 != i17) {
                            if (i23 == i16) {
                                int i24 = this.f4990j;
                                if (i24 == i15) {
                                    i11 = 0;
                                } else {
                                    i11 = i22 - i24;
                                }
                                if (i11 > 0) {
                                    i22 -= i11;
                                    tVar.F(i21 + i22);
                                }
                                kVar.d(tVar);
                                int i25 = this.f4990j;
                                if (i25 != i15) {
                                    int i26 = i25 - i22;
                                    this.f4990j = i26;
                                    if (i26 == 0) {
                                        kVar.g();
                                        this.f4983c = 1;
                                        this.f4984d = 0;
                                    }
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (c(Math.min(10, this.f4989i), tVar, sVar.f3851b) && c(this.f4989i, tVar, null)) {
                                sVar.o(0);
                                this.f4992l = -9223372036854775807L;
                                if (this.f4986f) {
                                    sVar.r(4);
                                    sVar.r(1);
                                    sVar.r(1);
                                    long i27 = (sVar.i(i16) << 30) | (sVar.i(15) << 15) | sVar.i(15);
                                    sVar.r(1);
                                    if (!this.f4988h && this.f4987g) {
                                        sVar.r(4);
                                        sVar.r(1);
                                        sVar.r(1);
                                        sVar.r(1);
                                        this.f4985e.b((sVar.i(15) << 15) | (sVar.i(3) << 30) | sVar.i(15));
                                        this.f4988h = true;
                                    }
                                    this.f4992l = this.f4985e.b(i27);
                                }
                                if (this.f4991k) {
                                    i12 = 4;
                                } else {
                                    i12 = 0;
                                }
                                i19 |= i12;
                                kVar.e(i19, this.f4992l);
                                i16 = 3;
                                this.f4983c = 3;
                                this.f4984d = 0;
                            }
                            i15 = -1;
                            i17 = 2;
                        }
                    } else if (!c(9, tVar, sVar.f3851b)) {
                        i15 = -1;
                        i17 = 2;
                    } else {
                        sVar.o(0);
                        int i28 = sVar.i(24);
                        if (i28 != 1) {
                            a3.g.A("Unexpected start code prefix: ", i28, "PesReader");
                            i15 = -1;
                            this.f4990j = -1;
                            i17 = 2;
                            z9 = false;
                        } else {
                            sVar.r(8);
                            int i29 = sVar.i(16);
                            sVar.r(5);
                            this.f4991k = sVar.h();
                            sVar.r(2);
                            this.f4986f = sVar.h();
                            this.f4987g = sVar.h();
                            sVar.r(6);
                            int i30 = sVar.i(8);
                            this.f4989i = i30;
                            if (i29 == 0) {
                                i15 = -1;
                                this.f4990j = -1;
                            } else {
                                int i31 = ((i29 + 6) - 9) - i30;
                                this.f4990j = i31;
                                if (i31 < 0) {
                                    f1.o.f("PesReader", "Found negative packet payload size: " + this.f4990j);
                                    i15 = -1;
                                    this.f4990j = -1;
                                } else {
                                    i15 = -1;
                                }
                            }
                            i17 = 2;
                            z9 = true;
                        }
                        if (z9) {
                            i13 = i17;
                        } else {
                            i13 = 0;
                        }
                        this.f4983c = i13;
                        this.f4984d = 0;
                    }
                } else {
                    tVar.H(i22);
                }
            } else {
                return;
            }
        }
    }

    public final boolean c(int i10, f1.t tVar, byte[] bArr) {
        int min = Math.min(tVar.f3860c - tVar.f3859b, i10 - this.f4984d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.H(min);
        } else {
            tVar.d(bArr, this.f4984d, min);
        }
        int i11 = this.f4984d + min;
        this.f4984d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // h3.j0
    public final void e(f1.y yVar, d2.r rVar, i0 i0Var) {
        this.f4985e = yVar;
        this.f4981a.f(rVar, i0Var);
    }
}
