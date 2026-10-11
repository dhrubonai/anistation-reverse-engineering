package v1;

import j1.j1;

/* loaded from: classes.dex */
public final class f1 implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u f10423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10424b;

    /* renamed from: c, reason: collision with root package name */
    public t f10425c;

    public f1(u uVar, long j4) {
        this.f10423a = uVar;
        this.f10424b = j4;
    }

    @Override // v1.x0
    public final boolean c() {
        return this.f10423a.c();
    }

    @Override // v1.u
    public final long d(long j4, j1 j1Var) {
        long j10 = this.f10424b;
        return this.f10423a.d(j4 - j10, j1Var) + j10;
    }

    @Override // v1.x0
    public final long h() {
        long h10 = this.f10423a.h();
        if (h10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10424b + h10;
    }

    @Override // v1.t
    public final void i(u uVar) {
        t tVar = this.f10425c;
        tVar.getClass();
        tVar.i(this);
    }

    @Override // v1.u
    public final long j() {
        long j4 = this.f10423a.j();
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10424b + j4;
    }

    @Override // v1.u
    public final void k(t tVar, long j4) {
        this.f10425c = tVar;
        this.f10423a.k(this, j4 - this.f10424b);
    }

    @Override // v1.u
    public final long l(y1.s[] sVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j4) {
        v0[] v0VarArr2 = new v0[v0VarArr.length];
        int i10 = 0;
        while (true) {
            v0 v0Var = null;
            if (i10 >= v0VarArr.length) {
                break;
            }
            e1 e1Var = (e1) v0VarArr[i10];
            if (e1Var != null) {
                v0Var = e1Var.f10411a;
            }
            v0VarArr2[i10] = v0Var;
            i10++;
        }
        u uVar = this.f10423a;
        long j10 = this.f10424b;
        long l10 = uVar.l(sVarArr, zArr, v0VarArr2, zArr2, j4 - j10);
        for (int i11 = 0; i11 < v0VarArr.length; i11++) {
            v0 v0Var2 = v0VarArr2[i11];
            if (v0Var2 == null) {
                v0VarArr[i11] = null;
            } else {
                v0 v0Var3 = v0VarArr[i11];
                if (v0Var3 == null || ((e1) v0Var3).f10411a != v0Var2) {
                    v0VarArr[i11] = new e1(v0Var2, j10);
                }
            }
        }
        return l10 + j10;
    }

    @Override // v1.u
    public final g1 m() {
        return this.f10423a.m();
    }

    @Override // v1.x0
    public final boolean n(j1.n0 n0Var) {
        j1.m0 m0Var = new j1.m0(n0Var);
        m0Var.f5830a = n0Var.f5835a - this.f10424b;
        return this.f10423a.n(new j1.n0(m0Var));
    }

    @Override // v1.x0
    public final long o() {
        long o = this.f10423a.o();
        if (o == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10424b + o;
    }

    @Override // v1.u
    public final void p() {
        this.f10423a.p();
    }

    @Override // v1.w0
    public final void s(x0 x0Var) {
        t tVar = this.f10425c;
        tVar.getClass();
        tVar.s(this);
    }

    @Override // v1.u
    public final long t(long j4) {
        long j10 = this.f10424b;
        return this.f10423a.t(j4 - j10) + j10;
    }

    @Override // v1.u
    public final void u(long j4) {
        this.f10423a.u(j4 - this.f10424b);
    }

    @Override // v1.x0
    public final void v(long j4) {
        this.f10423a.v(j4 - this.f10424b);
    }
}
