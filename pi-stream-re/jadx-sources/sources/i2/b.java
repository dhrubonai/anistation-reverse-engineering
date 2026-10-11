package i2;

import d2.p;
import d2.q;
import d2.r;
import f1.t;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: f, reason: collision with root package name */
    public r f5291f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5293h;

    /* renamed from: i, reason: collision with root package name */
    public long f5294i;

    /* renamed from: j, reason: collision with root package name */
    public int f5295j;

    /* renamed from: k, reason: collision with root package name */
    public int f5296k;

    /* renamed from: l, reason: collision with root package name */
    public int f5297l;

    /* renamed from: m, reason: collision with root package name */
    public long f5298m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5299n;
    public a o;

    /* renamed from: p, reason: collision with root package name */
    public e f5300p;

    /* renamed from: a, reason: collision with root package name */
    public final t f5286a = new t(4);

    /* renamed from: b, reason: collision with root package name */
    public final t f5287b = new t(9);

    /* renamed from: c, reason: collision with root package name */
    public final t f5288c = new t(11);

    /* renamed from: d, reason: collision with root package name */
    public final t f5289d = new t();

    /* renamed from: e, reason: collision with root package name */
    public final c f5290e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f5292g = 1;

    @Override // d2.p
    public final void a() {
    }

    public final t b(q qVar) {
        int i10 = this.f5297l;
        t tVar = this.f5289d;
        byte[] bArr = tVar.f3858a;
        if (i10 > bArr.length) {
            tVar.E(new byte[Math.max(bArr.length * 2, i10)], 0);
        } else {
            tVar.G(0);
        }
        tVar.F(this.f5297l);
        qVar.readFully(tVar.f3858a, 0, this.f5297l);
        return tVar;
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        if (j4 == 0) {
            this.f5292g = 1;
            this.f5293h = false;
        } else {
            this.f5292g = 3;
        }
        this.f5295j = 0;
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f5291f = rVar;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        t tVar = this.f5286a;
        qVar.n(tVar.f3858a, 0, 3);
        tVar.G(0);
        if (tVar.x() != 4607062) {
            return false;
        }
        qVar.n(tVar.f3858a, 0, 2);
        tVar.G(0);
        if ((tVar.A() & 250) != 0) {
            return false;
        }
        qVar.n(tVar.f3858a, 0, 4);
        tVar.G(0);
        int f10 = tVar.f();
        qVar.g();
        qVar.o(f10);
        qVar.n(tVar.f3858a, 0, 4);
        tVar.G(0);
        if (tVar.f() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r2.o(r14, r7) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0088, code lost:
    
        if (r2.o(r14, r7) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0009 A[SYNTHETIC] */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r17, d2.t r18) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.b.i(d2.q, d2.t):int");
    }
}
