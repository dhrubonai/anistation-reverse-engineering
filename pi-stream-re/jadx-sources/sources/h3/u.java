package h3;

/* loaded from: classes.dex */
public final class u implements k {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.a0 f4927a;

    /* renamed from: b, reason: collision with root package name */
    public String f4928b;

    /* renamed from: c, reason: collision with root package name */
    public d2.g0 f4929c;

    /* renamed from: d, reason: collision with root package name */
    public t f4930d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4931e;

    /* renamed from: l, reason: collision with root package name */
    public long f4938l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f4932f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final x f4933g = new x(32);

    /* renamed from: h, reason: collision with root package name */
    public final x f4934h = new x(33);

    /* renamed from: i, reason: collision with root package name */
    public final x f4935i = new x(34);

    /* renamed from: j, reason: collision with root package name */
    public final x f4936j = new x(39);

    /* renamed from: k, reason: collision with root package name */
    public final x f4937k = new x(40);

    /* renamed from: m, reason: collision with root package name */
    public long f4939m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final f1.t f4940n = new f1.t();

    public u(androidx.appcompat.widget.a0 a0Var) {
        this.f4927a = a0Var;
    }

    @Override // h3.k
    public final void a() {
        this.f4938l = 0L;
        this.f4939m = -9223372036854775807L;
        g1.g.a(this.f4932f);
        this.f4933g.f();
        this.f4934h.f();
        this.f4935i.f();
        this.f4936j.f();
        this.f4937k.f();
        t tVar = this.f4930d;
        if (tVar != null) {
            tVar.f4919f = false;
            tVar.f4920g = false;
            tVar.f4921h = false;
            tVar.f4922i = false;
            tVar.f4923j = false;
        }
    }

    public final void b(byte[] bArr, int i10, int i11) {
        boolean z9;
        t tVar = this.f4930d;
        if (tVar.f4919f) {
            int i12 = tVar.f4917d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                tVar.f4920g = z9;
                tVar.f4919f = false;
            } else {
                tVar.f4917d = (i11 - i10) + i12;
            }
        }
        if (!this.f4931e) {
            this.f4933g.a(bArr, i10, i11);
            this.f4934h.a(bArr, i10, i11);
            this.f4935i.a(bArr, i10, i11);
        }
        this.f4936j.a(bArr, i10, i11);
        this.f4937k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023e  */
    @Override // h3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(f1.t r37) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.u.d(f1.t):void");
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        this.f4939m = j4;
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        i0Var.a();
        i0Var.b();
        this.f4928b = i0Var.f4810e;
        i0Var.b();
        d2.g0 i10 = rVar.i(i0Var.f4809d, 2);
        this.f4929c = i10;
        this.f4930d = new t(i10);
        this.f4927a.H(rVar, i0Var);
    }

    @Override // h3.k
    public final void g() {
    }
}
