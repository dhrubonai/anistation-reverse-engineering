package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class v30 implements ko4 {
    public final jf6 a = new jf6();

    @Override // defpackage.ko4
    public final void A() {
        g1(6);
    }

    @Override // defpackage.ko4
    public final void A0(int i, int i2) {
        if (i != i2) {
            B0(i, i + 1, i2);
        }
    }

    @Override // defpackage.ko4
    public final void B() {
        f1(s0(), 4, -9223372036854775807L, false);
    }

    @Override // defpackage.ko4
    public final boolean C0() {
        kf6 G0 = G0();
        if (!G0.p() && G0.m(s0(), this.a, 0L).i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko4
    public final void E0(List list) {
        c0(Integer.MAX_VALUE, list);
    }

    @Override // defpackage.ko4
    public final void I0(int i, ar3 ar3Var) {
        y0(nw2.s(ar3Var), i, i + 1);
    }

    @Override // defpackage.ko4
    public final void J() {
        Y(false);
    }

    @Override // defpackage.ko4
    public final boolean M() {
        return true;
    }

    @Override // defpackage.ko4
    public final void M0(ar3 ar3Var) {
        X0(nw2.s(ar3Var));
    }

    @Override // defpackage.ko4
    public final void N(int i) {
        R(i, i + 1);
    }

    @Override // defpackage.ko4
    public final void O(int i, ar3 ar3Var) {
        c0(i, nw2.s(ar3Var));
    }

    @Override // defpackage.ko4
    public final int P() {
        return G0().o();
    }

    @Override // defpackage.ko4
    public final void Q(long j) {
        f1(s0(), 5, j, false);
    }

    @Override // defpackage.ko4
    public long Q0() {
        return Z0();
    }

    @Override // defpackage.ko4
    public final void S0() {
        int e;
        if (!G0().p() && !h()) {
            if (c1()) {
                kf6 G0 = G0();
                if (G0.p()) {
                    e = -1;
                } else {
                    int s0 = s0();
                    int F0 = F0();
                    if (F0 == 1) {
                        F0 = 0;
                    }
                    e = G0.e(s0, F0, O0());
                }
                if (e == -1) {
                    e1(9);
                    return;
                } else if (e == s0()) {
                    f1(s0(), 9, -9223372036854775807L, true);
                    return;
                } else {
                    f1(e, 9, -9223372036854775807L, false);
                    return;
                }
            }
            if (b1() && C0()) {
                f1(s0(), 9, -9223372036854775807L, false);
                return;
            } else {
                e1(9);
                return;
            }
        }
        e1(9);
    }

    @Override // defpackage.ko4
    public final void T0() {
        long Z0 = Z0() + a0();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            Z0 = Math.min(Z0, duration);
        }
        f1(s0(), 12, Math.max(Z0, 0L), false);
    }

    @Override // defpackage.ko4
    public final void V() {
        if (!G0().p() && !h()) {
            boolean d1 = d1();
            if (b1() && !f0()) {
                if (d1) {
                    g1(7);
                    return;
                } else {
                    e1(7);
                    return;
                }
            }
            if (d1 && Z0() <= u()) {
                g1(7);
                return;
            } else {
                f1(s0(), 7, 0L, false);
                return;
            }
        }
        e1(7);
    }

    @Override // defpackage.ko4
    public final void V0() {
        long Z0 = Z0() + (-a1());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            Z0 = Math.min(Z0, duration);
        }
        f1(s0(), 11, Math.max(Z0, 0L), false);
    }

    @Override // defpackage.ko4
    public final void Z(int i) {
        f1(i, 10, -9223372036854775807L, false);
    }

    @Override // defpackage.ko4
    public long b0() {
        return Z0();
    }

    @Override // defpackage.ko4
    public final boolean b1() {
        kf6 G0 = G0();
        if (!G0.p() && G0.m(s0(), this.a, 0L).a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko4
    public final void c(float f) {
        b(new rn4(f, e().b));
    }

    public final boolean c1() {
        int e;
        kf6 G0 = G0();
        if (G0.p()) {
            e = -1;
        } else {
            int s0 = s0();
            int F0 = F0();
            if (F0 == 1) {
                F0 = 0;
            }
            e = G0.e(s0, F0, O0());
        }
        if (e == -1) {
            return false;
        }
        return true;
    }

    public final boolean d1() {
        int k;
        kf6 G0 = G0();
        if (G0.p()) {
            k = -1;
        } else {
            int s0 = s0();
            int F0 = F0();
            if (F0 == 1) {
                F0 = 0;
            }
            k = G0.k(s0, F0, O0());
        }
        if (k == -1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ko4
    public long e0() {
        return Z0();
    }

    public final void e1(int i) {
        f1(-1, i, -9223372036854775807L, false);
    }

    @Override // defpackage.ko4
    public final boolean f0() {
        kf6 G0 = G0();
        if (!G0.p() && G0.m(s0(), this.a, 0L).h) {
            return true;
        }
        return false;
    }

    public abstract void f1(int i, int i2, long j, boolean z);

    @Override // defpackage.ko4
    public final void g0() {
        int e;
        kf6 G0 = G0();
        if (G0.p()) {
            e = -1;
        } else {
            int s0 = s0();
            int F0 = F0();
            if (F0 == 1) {
                F0 = 0;
            }
            e = G0.e(s0, F0, O0());
        }
        if (e == -1) {
            e1(8);
        } else if (e == s0()) {
            f1(s0(), 8, -9223372036854775807L, true);
        } else {
            f1(e, 8, -9223372036854775807L, false);
        }
    }

    public final void g1(int i) {
        int k;
        kf6 G0 = G0();
        if (G0.p()) {
            k = -1;
        } else {
            int s0 = s0();
            int F0 = F0();
            if (F0 == 1) {
                F0 = 0;
            }
            k = G0.k(s0, F0, O0());
        }
        if (k == -1) {
            e1(i);
        } else if (k == s0()) {
            f1(s0(), i, -9223372036854775807L, true);
        } else {
            f1(k, i, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.ko4
    public long getDuration() {
        return w();
    }

    @Override // defpackage.ko4
    public final long i() {
        kf6 G0 = G0();
        if (!G0.p()) {
            int s0 = s0();
            jf6 jf6Var = this.a;
            if (G0.m(s0, jf6Var, 0L).f != -9223372036854775807L) {
                return (eq6.F(jf6Var.g) - jf6Var.f) - b0();
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ko4
    public final void k(int i, long j) {
        f1(i, 10, j, false);
    }

    @Override // defpackage.ko4
    public final boolean l0() {
        if (h0() == 3 && n() && D0() == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko4
    public final void m(ar3 ar3Var, long j) {
        W(nw2.s(ar3Var), 0, j);
    }

    @Override // defpackage.ko4
    public final void o() {
        R(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.ko4
    public final void p0() {
        Y(true);
    }

    @Override // defpackage.ko4
    public final ar3 q() {
        kf6 G0 = G0();
        if (G0.p()) {
            return null;
        }
        return G0.m(s0(), this.a, 0L).c;
    }

    @Override // defpackage.ko4
    public final void q0(List list) {
        X0(list);
    }

    @Override // defpackage.ko4
    public final int s() {
        if (t0(16)) {
            long e0 = e0();
            long duration = getDuration();
            if (e0 != -9223372036854775807L && duration != -9223372036854775807L) {
                if (duration == 0) {
                    return 100;
                }
                return eq6.j(eq6.Z(e0, duration), 0, 100);
            }
        }
        return 0;
    }

    @Override // defpackage.ko4
    public final ar3 t(int i) {
        return G0().m(i, this.a, 0L).c;
    }

    @Override // defpackage.ko4
    public final boolean t0(int i) {
        return l().a(i);
    }

    @Override // defpackage.ko4
    public final long w() {
        kf6 G0 = G0();
        if (G0.p()) {
            return -9223372036854775807L;
        }
        return eq6.l0(G0.m(s0(), this.a, 0L).m);
    }

    @Override // defpackage.ko4
    public int x() {
        return s0();
    }

    @Override // defpackage.ko4
    public final void x0(ar3 ar3Var) {
        X0(nw2.s(ar3Var));
    }
}
