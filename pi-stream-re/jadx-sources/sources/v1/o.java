package v1;

import j1.j1;

/* loaded from: classes.dex */
public final class o implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final w f10482a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10483b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.d f10484c;

    /* renamed from: d, reason: collision with root package name */
    public a f10485d;

    /* renamed from: e, reason: collision with root package name */
    public u f10486e;

    /* renamed from: f, reason: collision with root package name */
    public t f10487f;

    /* renamed from: x, reason: collision with root package name */
    public long f10488x = -9223372036854775807L;

    public o(w wVar, z1.d dVar, long j4) {
        this.f10482a = wVar;
        this.f10484c = dVar;
        this.f10483b = j4;
    }

    public final void a(w wVar) {
        long j4 = this.f10488x;
        if (j4 == -9223372036854775807L) {
            j4 = this.f10483b;
        }
        a aVar = this.f10485d;
        aVar.getClass();
        u b10 = aVar.b(wVar, this.f10484c, j4);
        this.f10486e = b10;
        if (this.f10487f != null) {
            b10.k(this, j4);
        }
    }

    @Override // v1.x0
    public final boolean c() {
        u uVar = this.f10486e;
        if (uVar != null && uVar.c()) {
            return true;
        }
        return false;
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.d(j4, j1Var);
    }

    @Override // v1.x0
    public final long h() {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.h();
    }

    @Override // v1.t
    public final void i(u uVar) {
        t tVar = this.f10487f;
        int i10 = f1.b0.f3799a;
        tVar.i(this);
    }

    @Override // v1.u
    public final long j() {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.j();
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        this.f10487f = tVar;
        u uVar = this.f10486e;
        if (uVar != null) {
            long j10 = this.f10488x;
            if (j10 == -9223372036854775807L) {
                j10 = this.f10483b;
            }
            uVar.k(this, j10);
        }
    }

    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        long j10;
        long j11 = this.f10488x;
        if (j11 != -9223372036854775807L && j4 == this.f10483b) {
            j10 = j11;
        } else {
            j10 = j4;
        }
        this.f10488x = -9223372036854775807L;
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.l(sVarArr, zArr, v0VarArr, zArr2, j10);
    }

    @Override // v1.u
    public final g1 m() {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.m();
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        u uVar = this.f10486e;
        if (uVar != null && uVar.n(n0Var)) {
            return true;
        }
        return false;
    }

    @Override // v1.x0
    public final long o() {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.o();
    }

    @Override // v1.u
    public final void p() {
        u uVar = this.f10486e;
        if (uVar != null) {
            uVar.p();
            return;
        }
        a aVar = this.f10485d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        t tVar = this.f10487f;
        int i10 = f1.b0.f3799a;
        tVar.s(this);
    }

    @Override // v1.u
    public final long t(long j4) {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        return uVar.t(j4);
    }

    @Override // v1.u
    public final void u(long j4) {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        uVar.u(j4);
    }

    @Override // v1.x0
    public final void v(long j4) {
        u uVar = this.f10486e;
        int i10 = f1.b0.f3799a;
        uVar.v(j4);
    }
}
