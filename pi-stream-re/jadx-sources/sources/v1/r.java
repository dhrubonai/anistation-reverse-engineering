package v1;

/* loaded from: classes.dex */
public final class r extends g {

    /* renamed from: k, reason: collision with root package name */
    public final a f10514k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10515l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.d1 f10516m;

    /* renamed from: n, reason: collision with root package name */
    public final c1.c1 f10517n;
    public p o;

    /* renamed from: p, reason: collision with root package name */
    public o f10518p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10519q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10520r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10521s;

    public r(a aVar, boolean z9) {
        boolean z10;
        this.f10514k = aVar;
        if (z9 && aVar.i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10515l = z10;
        this.f10516m = new c1.d1();
        this.f10517n = new c1.c1();
        c1.e1 g10 = aVar.g();
        if (g10 != null) {
            this.o = new p(g10, null, null);
            this.f10521s = true;
        } else {
            this.o = new p(new q(aVar.h()), c1.d1.f1653r, p.f10499e);
        }
    }

    public final void A(long j4) {
        o oVar = this.f10518p;
        int b10 = this.o.b(oVar.f10482a.f10559a);
        if (b10 == -1) {
            return;
        }
        p pVar = this.o;
        c1.c1 c1Var = this.f10517n;
        pVar.g(b10, c1Var, false);
        long j10 = c1Var.f1644d;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            j4 = Math.max(0L, j10 - 1);
        }
        oVar.f10488x = j4;
    }

    @Override // v1.a
    public final c1.e1 g() {
        return this.f10514k.g();
    }

    @Override // v1.a
    public final c1.k0 h() {
        return this.f10514k.h();
    }

    @Override // v1.a
    public final boolean i() {
        return this.f10514k.i();
    }

    @Override // v1.a
    public final void j() {
    }

    @Override // v1.a
    public final void l(h1.e0 e0Var) {
        this.f10428j = e0Var;
        this.f10427i = f1.b0.l(null);
        if (!this.f10515l) {
            this.f10519q = true;
            z();
        }
    }

    @Override // v1.a
    public final void n(u uVar) {
        o oVar = (o) uVar;
        if (oVar.f10486e != null) {
            a aVar = oVar.f10485d;
            aVar.getClass();
            aVar.n(oVar.f10486e);
        }
        if (uVar == this.f10518p) {
            this.f10518p = null;
        }
    }

    @Override // v1.g, v1.a
    public final void p() {
        this.f10520r = false;
        this.f10519q = false;
        super.p();
    }

    @Override // v1.a
    public final void s(c1.k0 k0Var) {
        if (this.f10521s) {
            p pVar = this.o;
            this.o = new p(new n0(this.o.f10453b, k0Var), pVar.f10500c, pVar.f10501d);
        } else {
            this.o = new p(new q(k0Var), c1.d1.f1653r, p.f10499e);
        }
        this.f10514k.s(k0Var);
    }

    @Override // v1.g
    public final w t(Object obj, w wVar) {
        Object obj2 = wVar.f10559a;
        Object obj3 = this.o.f10501d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = p.f10499e;
        }
        return wVar.a(obj2);
    }

    @Override // v1.g
    public final long u(Object obj, long j4) {
        return j4;
    }

    @Override // v1.g
    public final int v(int i10, Object obj) {
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ca  */
    @Override // v1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r13, v1.a r14, c1.e1 r15) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.r.w(java.lang.Object, v1.a, c1.e1):void");
    }

    @Override // v1.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o b(w wVar, z1.d dVar, long j4) {
        boolean z9;
        o oVar = new o(wVar, dVar, j4);
        if (oVar.f10485d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        oVar.f10485d = this.f10514k;
        if (this.f10520r) {
            Object obj = this.o.f10501d;
            Object obj2 = wVar.f10559a;
            if (obj != null && obj2.equals(p.f10499e)) {
                obj2 = this.o.f10501d;
            }
            oVar.a(wVar.a(obj2));
        } else {
            this.f10518p = oVar;
            if (!this.f10519q) {
                this.f10519q = true;
                z();
            }
        }
        return oVar;
    }

    public final void z() {
        x(null, this.f10514k);
    }
}
