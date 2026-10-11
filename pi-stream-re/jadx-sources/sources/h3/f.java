package h3;

/* loaded from: classes.dex */
public final class f implements d2.p {

    /* renamed from: d, reason: collision with root package name */
    public final f1.t f4732d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.s f4733e;

    /* renamed from: f, reason: collision with root package name */
    public d2.r f4734f;

    /* renamed from: g, reason: collision with root package name */
    public long f4735g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4738j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4739k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4740l;

    /* renamed from: a, reason: collision with root package name */
    public final int f4729a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final g f4730b = new g(null, 0, true);

    /* renamed from: c, reason: collision with root package name */
    public final f1.t f4731c = new f1.t(2048);

    /* renamed from: i, reason: collision with root package name */
    public int f4737i = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f4736h = -1;

    public f(int i10) {
        f1.t tVar = new f1.t(10);
        this.f4732d = tVar;
        this.f4733e = new f1.s(tVar.f3858a, 0, (Object) null);
    }

    @Override // d2.p
    public final void a() {
    }

    public final int b(d2.q qVar) {
        int i10 = 0;
        while (true) {
            f1.t tVar = this.f4732d;
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
        if (this.f4736h == -1) {
            this.f4736h = i10;
        }
        return i10;
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f4739k = false;
        this.f4730b.a();
        this.f4735g = j10;
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        this.f4734f = rVar;
        this.f4730b.f(rVar, new i0(0, 1));
        rVar.b();
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        boolean z9;
        int b10 = b(qVar);
        int i10 = b10;
        int i11 = 0;
        int i12 = 0;
        do {
            f1.t tVar = this.f4732d;
            qVar.n(tVar.f3858a, 0, 2);
            tVar.G(0);
            if ((tVar.A() & 65526) == 65520) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                i10++;
                qVar.g();
                qVar.o(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.n(tVar.f3858a, 0, 4);
                f1.s sVar = this.f4733e;
                sVar.o(14);
                int i13 = sVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    qVar.g();
                    qVar.o(i10);
                } else {
                    qVar.o(i13 - 6);
                    i12 += i13;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - b10 < 8192);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        r18.f4738j = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        throw c1.r0.a("Malformed ADTS stream", null);
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r19, d2.t r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.f.i(d2.q, d2.t):int");
    }
}
