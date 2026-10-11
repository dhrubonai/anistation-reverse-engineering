package h3;

/* loaded from: classes.dex */
public final class d0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4713a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4714b = new f1.t(32);

    /* renamed from: c, reason: collision with root package name */
    public int f4715c;

    /* renamed from: d, reason: collision with root package name */
    public int f4716d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4717e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4718f;

    public d0(c0 c0Var) {
        this.f4713a = c0Var;
    }

    @Override // h3.j0
    public final void a() {
        this.f4718f = true;
    }

    @Override // h3.j0
    public final void b(int i10, f1.t tVar) {
        boolean z9;
        int i11;
        boolean z10;
        if ((i10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 = tVar.f3859b + tVar.v();
        } else {
            i11 = -1;
        }
        if (this.f4718f) {
            if (!z9) {
                return;
            }
            this.f4718f = false;
            tVar.G(i11);
            this.f4716d = 0;
        }
        while (true) {
            int i12 = tVar.f3860c;
            int i13 = tVar.f3859b;
            if (i12 - i13 > 0) {
                int i14 = this.f4716d;
                f1.t tVar2 = this.f4714b;
                if (i14 < 3) {
                    if (i14 == 0) {
                        int v9 = tVar.v();
                        tVar.G(tVar.f3859b - 1);
                        if (v9 == 255) {
                            this.f4718f = true;
                            return;
                        }
                    }
                    int min = Math.min(tVar.f3860c - tVar.f3859b, 3 - this.f4716d);
                    tVar.d(tVar2.f3858a, this.f4716d, min);
                    int i15 = this.f4716d + min;
                    this.f4716d = i15;
                    if (i15 == 3) {
                        tVar2.G(0);
                        tVar2.F(3);
                        tVar2.H(1);
                        int v10 = tVar2.v();
                        int v11 = tVar2.v();
                        if ((v10 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f4717e = z10;
                        int i16 = (((v10 & 15) << 8) | v11) + 3;
                        this.f4715c = i16;
                        byte[] bArr = tVar2.f3858a;
                        if (bArr.length < i16) {
                            tVar2.a(Math.min(4098, Math.max(i16, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i12 - i13, this.f4715c - i14);
                    tVar.d(tVar2.f3858a, this.f4716d, min2);
                    int i17 = this.f4716d + min2;
                    this.f4716d = i17;
                    int i18 = this.f4715c;
                    if (i17 != i18) {
                        continue;
                    } else {
                        if (this.f4717e) {
                            if (f1.b0.k(0, tVar2.f3858a, i18, -1) != 0) {
                                this.f4718f = true;
                                return;
                            }
                            tVar2.F(this.f4715c - 4);
                        } else {
                            tVar2.F(i18);
                        }
                        tVar2.G(0);
                        this.f4713a.d(tVar2);
                        this.f4716d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // h3.j0
    public final void e(f1.y yVar, d2.r rVar, i0 i0Var) {
        this.f4713a.e(yVar, rVar, i0Var);
        this.f4718f = true;
    }
}
