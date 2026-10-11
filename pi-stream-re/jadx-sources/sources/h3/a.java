package h3;

/* loaded from: classes.dex */
public final class a implements d2.p {

    /* renamed from: a, reason: collision with root package name */
    public final b f4662a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4663b = new f1.t(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4664c;

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f4664c = false;
        this.f4662a.a();
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        this.f4662a.f(rVar, new i0(0, 1));
        rVar.b();
        rVar.s(new d2.u(-9223372036854775807L));
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        boolean z9;
        int t9;
        f1.t tVar = new f1.t(10);
        int i10 = 0;
        while (true) {
            qVar.n(tVar.f3858a, 0, 10);
            tVar.G(0);
            if (tVar.x() != 4801587) {
                break;
            }
            tVar.H(3);
            int u9 = tVar.u();
            i10 += u9 + 10;
            qVar.o(u9);
        }
        qVar.g();
        qVar.o(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.n(tVar.f3858a, 0, 6);
            tVar.G(0);
            if (tVar.A() != 2935) {
                qVar.g();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.o(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = tVar.f3858a;
                if (bArr.length < 6) {
                    t9 = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        t9 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b10 = bArr[4];
                        t9 = com.bumptech.glide.c.t((b10 & 192) >> 6, b10 & 63);
                    }
                }
                if (t9 == -1) {
                    return false;
                }
                qVar.o(t9 - 6);
            }
        }
    }

    @Override // d2.p
    public final int i(d2.q qVar, d2.t tVar) {
        f1.t tVar2 = this.f4663b;
        int p3 = qVar.p(tVar2.f3858a, 0, 2786);
        if (p3 == -1) {
            return -1;
        }
        tVar2.G(0);
        tVar2.F(p3);
        boolean z9 = this.f4664c;
        b bVar = this.f4662a;
        if (!z9) {
            bVar.f4684m = 0L;
            this.f4664c = true;
        }
        bVar.d(tVar2);
        return 0;
    }
}
