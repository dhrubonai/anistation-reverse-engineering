package h3;

/* loaded from: classes.dex */
public final class c implements d2.p {

    /* renamed from: a, reason: collision with root package name */
    public final d f4696a = new d(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final f1.t f4697b = new f1.t(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f4698c;

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f4698c = false;
        this.f4696a.a();
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        this.f4696a.f(rVar, new i0(0, 1));
        rVar.b();
        rVar.s(new d2.u(-9223372036854775807L));
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        int i10;
        f1.t tVar = new f1.t(10);
        int i11 = 0;
        while (true) {
            qVar.n(tVar.f3858a, 0, 10);
            tVar.G(0);
            if (tVar.x() != 4801587) {
                break;
            }
            tVar.H(3);
            int u9 = tVar.u();
            i11 += u9 + 10;
            qVar.o(u9);
        }
        qVar.g();
        qVar.o(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            qVar.n(tVar.f3858a, 0, 7);
            tVar.G(0);
            int A = tVar.A();
            if (A != 44096 && A != 44097) {
                qVar.g();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                qVar.o(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = tVar.f3858a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (A == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                qVar.o(i10 - 7);
            }
        }
    }

    @Override // d2.p
    public final int i(d2.q qVar, d2.t tVar) {
        f1.t tVar2 = this.f4697b;
        int p3 = qVar.p(tVar2.f3858a, 0, 16384);
        if (p3 == -1) {
            return -1;
        }
        tVar2.G(0);
        tVar2.F(p3);
        boolean z9 = this.f4698c;
        d dVar = this.f4696a;
        if (!z9) {
            dVar.f4712n = 0L;
            this.f4698c = true;
        }
        dVar.d(tVar2);
        return 0;
    }
}
