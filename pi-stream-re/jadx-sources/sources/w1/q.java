package w1;

import c1.v;
import d2.g0;
import h1.d0;
import v1.u0;

/* loaded from: classes.dex */
public final class q extends a {
    public final int F;
    public final v G;
    public long H;
    public boolean I;

    public q(h1.h hVar, h1.l lVar, v vVar, int i10, Object obj, long j4, long j10, long j11, int i11, v vVar2) {
        super(hVar, lVar, vVar, i10, obj, j4, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.F = i11;
        this.G = vVar2;
    }

    @Override // w1.n
    public final boolean b() {
        return this.I;
    }

    @Override // z1.l
    public final void c() {
        d0 d0Var = this.f10774z;
        c cVar = this.D;
        w7.b.w(cVar);
        for (u0 u0Var : cVar.f10750b) {
            if (u0Var.F != 0) {
                u0Var.F = 0L;
                u0Var.f10558z = true;
            }
        }
        g0 a10 = cVar.a(this.F);
        a10.b(this.G);
        try {
            long m5 = d0Var.m(this.f10767b.a(this.H));
            if (m5 != -1) {
                m5 += this.H;
            }
            d2.l lVar = new d2.l(this.f10774z, this.H, m5);
            for (int i10 = 0; i10 != -1; i10 = a10.c(lVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                this.H += i10;
            }
            a10.d(this.f10772x, 1, (int) this.H, 0, null);
            w7.b.C(d0Var);
            this.I = true;
        } catch (Throwable th) {
            w7.b.C(d0Var);
            throw th;
        }
    }

    @Override // z1.l
    public final void m() {
    }
}
