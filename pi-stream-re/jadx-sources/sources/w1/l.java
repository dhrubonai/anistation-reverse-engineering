package w1;

import c1.q0;
import c1.v;
import d2.g0;
import f1.t;
import h1.d0;
import v1.u0;

/* loaded from: classes.dex */
public final class l extends a {
    public final int F;
    public final long G;
    public final h H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public l(h1.h hVar, h1.l lVar, v vVar, int i10, Object obj, long j4, long j10, long j11, long j12, long j13, int i11, long j14, h hVar2) {
        super(hVar, lVar, vVar, i10, obj, j4, j10, j11, j12, j13);
        this.F = i11;
        this.G = j14;
        this.H = hVar2;
    }

    @Override // w1.n
    public final long a() {
        return this.A + this.F;
    }

    @Override // w1.n
    public final boolean b() {
        return this.K;
    }

    @Override // z1.l
    public final void c() {
        boolean z9;
        boolean z10;
        long j4;
        long j10;
        c cVar = this.D;
        w7.b.w(cVar);
        if (this.I == 0) {
            long j11 = this.G;
            for (u0 u0Var : cVar.f10750b) {
                if (u0Var.F != j11) {
                    u0Var.F = j11;
                    u0Var.f10558z = true;
                }
            }
            h hVar = this.H;
            long j12 = this.B;
            if (j12 == -9223372036854775807L) {
                j4 = -9223372036854775807L;
            } else {
                j4 = j12 - this.G;
            }
            long j13 = this.C;
            if (j13 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j13 - this.G;
            }
            ((e) hVar).a(cVar, j4, j10);
        }
        try {
            h1.l a10 = this.f10767b.a(this.I);
            d0 d0Var = this.f10774z;
            d2.l lVar = new d2.l(d0Var, a10.f4602f, d0Var.m(a10));
            while (!this.J) {
                try {
                    int i10 = ((e) this.H).f10757a.i(lVar, e.B);
                    if (i10 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.I = lVar.f3180d - this.f10767b.f4602f;
                }
            }
            e(cVar);
            this.I = lVar.f3180d - this.f10767b.f4602f;
            w7.b.C(this.f10774z);
            this.K = !this.J;
        } catch (Throwable th) {
            w7.b.C(this.f10774z);
            throw th;
        }
    }

    public final void e(c cVar) {
        v vVar = this.f10769d;
        if (!q0.l(vVar.f1934l)) {
            return;
        }
        int i10 = vVar.G;
        int i11 = vVar.H;
        if ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1) {
            g0 a10 = cVar.a(4);
            int i12 = i10 * i11;
            long j4 = (this.f10773y - this.f10772x) / i12;
            for (int i13 = 1; i13 < i12; i13++) {
                a10.f(0, new t());
                a10.d(i13 * j4, 0, 0, 0, null);
            }
        }
    }

    @Override // z1.l
    public final void m() {
        this.J = true;
    }
}
