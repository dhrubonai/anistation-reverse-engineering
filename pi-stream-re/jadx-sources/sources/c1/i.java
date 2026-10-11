package c1;

/* loaded from: classes.dex */
public abstract class i implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f1711a = new d1();

    public final long a() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (A.q()) {
            return -9223372036854775807L;
        }
        return f1.b0.c0(A.n(d0Var.w(), this.f1711a).f1668n);
    }

    public final int b() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (A.q()) {
            return -1;
        }
        int w9 = d0Var.w();
        d0Var.h0();
        int i10 = d0Var.D;
        if (i10 == 1) {
            i10 = 0;
        }
        d0Var.h0();
        return A.e(w9, i10, d0Var.E);
    }

    public final int c() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (A.q()) {
            return -1;
        }
        int w9 = d0Var.w();
        d0Var.h0();
        int i10 = d0Var.D;
        if (i10 == 1) {
            i10 = 0;
        }
        d0Var.h0();
        return A.l(w9, i10, d0Var.E);
    }

    public final boolean d(int i10) {
        j1.d0 d0Var = (j1.d0) this;
        d0Var.h0();
        return d0Var.L.f1948a.f1889a.get(i10);
    }

    public final boolean e() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (!A.q() && A.n(d0Var.w(), this.f1711a).f1663i) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (!A.q() && A.n(d0Var.w(), this.f1711a).a()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        j1.d0 d0Var = (j1.d0) this;
        e1 A = d0Var.A();
        if (!A.q() && A.n(d0Var.w(), this.f1711a).f1662h) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        j1.d0 d0Var = (j1.d0) this;
        if (d0Var.G() == 3 && d0Var.E()) {
            d0Var.h0();
            if (d0Var.f5675f0.f5648m == 0) {
                return true;
            }
        }
        return false;
    }

    public abstract void i(int i10, long j4, boolean z9);

    public final void j(int i10, long j4) {
        i(((j1.d0) this).w(), j4, false);
    }

    public final void k(int i10, int i11) {
        i(i10, -9223372036854775807L, false);
    }

    public final void l() {
        boolean z9;
        j1.d0 d0Var = (j1.d0) this;
        if (!d0Var.A().q() && !d0Var.L()) {
            if (b() != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int b10 = b();
                if (b10 != -1) {
                    if (b10 == d0Var.w()) {
                        i(d0Var.w(), -9223372036854775807L, true);
                        return;
                    } else {
                        k(b10, 9);
                        return;
                    }
                }
                return;
            }
            if (f() && e()) {
                k(d0Var.w(), 9);
            }
        }
    }

    public final void m(int i10, long j4) {
        j1.d0 d0Var = (j1.d0) this;
        long y9 = d0Var.y() + j4;
        long D = d0Var.D();
        if (D != -9223372036854775807L) {
            y9 = Math.min(y9, D);
        }
        j(i10, Math.max(y9, 0L));
    }

    public final void n() {
        boolean z9;
        int c6;
        j1.d0 d0Var = (j1.d0) this;
        if (!d0Var.A().q() && !d0Var.L()) {
            if (c() != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (f() && !g()) {
                if (z9 && (c6 = c()) != -1) {
                    if (c6 == d0Var.w()) {
                        i(d0Var.w(), -9223372036854775807L, true);
                        return;
                    } else {
                        k(c6, 7);
                        return;
                    }
                }
                return;
            }
            if (z9) {
                long y9 = d0Var.y();
                d0Var.h0();
                if (y9 <= 3000) {
                    int c10 = c();
                    if (c10 != -1) {
                        if (c10 == d0Var.w()) {
                            i(d0Var.w(), -9223372036854775807L, true);
                            return;
                        } else {
                            k(c10, 7);
                            return;
                        }
                    }
                    return;
                }
            }
            j(7, 0L);
        }
    }
}
