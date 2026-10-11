package w1;

import c1.v;
import h1.d0;

/* loaded from: classes.dex */
public final class m extends f {
    public final h A;
    public g B;
    public long C;
    public volatile boolean D;

    public m(h1.h hVar, h1.l lVar, v vVar, int i10, Object obj, h hVar2) {
        super(hVar, lVar, 2, vVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.A = hVar2;
    }

    @Override // z1.l
    public final void c() {
        boolean z9;
        if (this.C == 0) {
            ((e) this.A).a(this.B, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            h1.l a10 = this.f10767b.a(this.C);
            d0 d0Var = this.f10774z;
            d2.l lVar = new d2.l(d0Var, a10.f4602f, d0Var.m(a10));
            while (!this.D) {
                try {
                    int i10 = ((e) this.A).f10757a.i(lVar, e.B);
                    boolean z10 = false;
                    if (i10 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    if (i10 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.C = lVar.f3180d - this.f10767b.f4602f;
                }
            }
        } finally {
            w7.b.C(this.f10774z);
        }
    }

    @Override // z1.l
    public final void m() {
        this.D = true;
    }
}
