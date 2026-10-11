package k2;

import d2.p;
import d2.q;
import d2.r;
import d2.u;
import f1.t;
import w2.m;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public r f6414b;

    /* renamed from: c, reason: collision with root package name */
    public int f6415c;

    /* renamed from: d, reason: collision with root package name */
    public int f6416d;

    /* renamed from: e, reason: collision with root package name */
    public int f6417e;

    /* renamed from: g, reason: collision with root package name */
    public r2.a f6419g;

    /* renamed from: h, reason: collision with root package name */
    public q f6420h;

    /* renamed from: i, reason: collision with root package name */
    public d f6421i;

    /* renamed from: j, reason: collision with root package name */
    public m f6422j;

    /* renamed from: a, reason: collision with root package name */
    public final t f6413a = new t(6);

    /* renamed from: f, reason: collision with root package name */
    public long f6418f = -1;

    @Override // d2.p
    public final void a() {
        m mVar = this.f6422j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    public final void b() {
        r rVar = this.f6414b;
        rVar.getClass();
        rVar.b();
        this.f6414b.s(new u(-9223372036854775807L));
        this.f6415c = 6;
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    public final int d(q qVar) {
        t tVar = this.f6413a;
        tVar.D(2);
        qVar.n(tVar.f3858a, 0, 2);
        return tVar.A();
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        if (j4 == 0) {
            this.f6415c = 0;
            this.f6422j = null;
        } else if (this.f6415c == 5) {
            m mVar = this.f6422j;
            mVar.getClass();
            mVar.e(j4, j10);
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f6414b = rVar;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        if (d(qVar) != 65496) {
            return false;
        }
        int d10 = d(qVar);
        this.f6416d = d10;
        t tVar = this.f6413a;
        if (d10 == 65504) {
            tVar.D(2);
            qVar.n(tVar.f3858a, 0, 2);
            qVar.o(tVar.A() - 2);
            this.f6416d = d(qVar);
        }
        if (this.f6416d != 65505) {
            return false;
        }
        qVar.o(2);
        tVar.D(6);
        qVar.n(tVar.f3858a, 0, 6);
        if (tVar.w() != 1165519206 || tVar.A() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r25, d2.t r26) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.a.i(d2.q, d2.t):int");
    }
}
