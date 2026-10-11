package f2;

import b2.j;
import d2.p;
import d2.q;
import d2.r;
import f1.b0;
import f1.t;
import f9.x;
import w1.o;
import y2.k;
import y2.n;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: d, reason: collision with root package name */
    public final k f3874d;

    /* renamed from: e, reason: collision with root package name */
    public int f3875e;

    /* renamed from: g, reason: collision with root package name */
    public c f3877g;

    /* renamed from: j, reason: collision with root package name */
    public long f3880j;

    /* renamed from: k, reason: collision with root package name */
    public e f3881k;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3885p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3873c = false;

    /* renamed from: a, reason: collision with root package name */
    public final t f3871a = new t(12);

    /* renamed from: b, reason: collision with root package name */
    public final j f3872b = new j();

    /* renamed from: f, reason: collision with root package name */
    public r f3876f = new x(0);

    /* renamed from: i, reason: collision with root package name */
    public e[] f3879i = new e[0];

    /* renamed from: m, reason: collision with root package name */
    public long f3883m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f3884n = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f3882l = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f3878h = -9223372036854775807L;

    public b(o oVar) {
        this.f3874d = oVar;
    }

    @Override // d2.p
    public final void a() {
    }

    public final e b(int i10) {
        boolean z9;
        for (e eVar : this.f3879i) {
            if (eVar.f3895b != i10 && eVar.f3896c != i10) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return eVar;
            }
        }
        return null;
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f3880j = -1L;
        this.f3881k = null;
        for (e eVar : this.f3879i) {
            if (eVar.f3903j == 0) {
                eVar.f3901h = 0;
            } else {
                eVar.f3901h = eVar.f3905l[b0.f(eVar.f3904k, j4, true)];
            }
        }
        if (j4 == 0) {
            if (this.f3879i.length == 0) {
                this.f3875e = 0;
                return;
            } else {
                this.f3875e = 3;
                return;
            }
        }
        this.f3875e = 6;
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f3875e = 0;
        if (this.f3873c) {
            rVar = new n(rVar, this.f3874d);
        }
        this.f3876f = rVar;
        this.f3880j = -1L;
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        t tVar = this.f3871a;
        qVar.n(tVar.f3858a, 0, 12);
        tVar.G(0);
        if (tVar.i() != 1179011410) {
            return false;
        }
        tVar.H(4);
        if (tVar.i() != 541677121) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r24, d2.t r25) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.i(d2.q, d2.t):int");
    }
}
