package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cm2 extends t30 {
    public final x81 i;
    public final i75 j;
    public final m18 k;
    public final xp1 l;
    public final q18 m;
    public final boolean n;
    public final boolean o;
    public final b91 p;
    public final long q;
    public uq3 r;
    public n71 s;
    public ar3 t;

    static {
        cr3.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cm2(ar3 ar3Var, i75 i75Var, x81 x81Var, m18 m18Var, xp1 xp1Var, q18 q18Var, b91 b91Var, long j, boolean z, int i) {
        this.t = ar3Var;
        this.r = ar3Var.c;
        this.j = i75Var;
        this.i = x81Var;
        this.k = m18Var;
        this.l = xp1Var;
        this.m = q18Var;
        this.p = b91Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static wl2 t(long j, List list) {
        wl2 wl2Var = null;
        for (int i = 0; i < list.size(); i++) {
            wl2 wl2Var2 = (wl2) list.get(i);
            long j2 = wl2Var2.B;
            if (j2 <= j && wl2Var2.I) {
                wl2Var = wl2Var2;
            } else if (j2 > j) {
                break;
            }
        }
        return wl2Var;
    }

    @Override // defpackage.lw3
    public final boolean a(ar3 ar3Var) {
        ar3 c = c();
        vq3 vq3Var = c.b;
        vq3Var.getClass();
        vq3 vq3Var2 = ar3Var.b;
        if (vq3Var2 != null && vq3Var2.a.equals(vq3Var.a) && vq3Var2.e.equals(vq3Var.e) && Objects.equals(vq3Var2.c, vq3Var.c) && c.c.equals(ar3Var.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lw3
    public final or3 b(jw3 jw3Var, l7 l7Var, long j) {
        eb2 eb2Var = new eb2((CopyOnWriteArrayList) this.c.A, 0, jw3Var);
        tp1 tp1Var = new tp1(this.d.c, 0, jw3Var);
        n71 n71Var = this.s;
        cp4 cp4Var = this.g;
        cp4Var.getClass();
        return new sl2(this.i, this.p, this.j, n71Var, this.l, tp1Var, this.m, eb2Var, l7Var, this.k, this.n, this.o ? 1 : 0, cp4Var);
    }

    @Override // defpackage.lw3
    public final synchronized ar3 c() {
        return this.t;
    }

    @Override // defpackage.lw3
    public final void d() {
        b91 b91Var = this.p;
        dn0 dn0Var = b91Var.D;
        if (dn0Var != null) {
            IOException iOException = (IOException) dn0Var.A;
            if (iOException == null) {
                lj3 lj3Var = (lj3) dn0Var.z;
                if (lj3Var != null) {
                    int i = lj3Var.x;
                    IOException iOException2 = lj3Var.B;
                    if (iOException2 != null && lj3Var.C > i) {
                        throw iOException2;
                    }
                }
            } else {
                throw iOException;
            }
        }
        bj4 bj4Var = b91Var.I;
        if (bj4Var == null) {
            Uri uri = b91Var.O;
            if (uri != null) {
                b91Var.j(uri);
                return;
            }
            return;
        }
        throw bj4Var;
    }

    @Override // defpackage.lw3
    public final synchronized void g(ar3 ar3Var) {
        this.t = ar3Var;
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        sl2 sl2Var = (sl2) or3Var;
        sl2Var.y.B.remove(sl2Var);
        for (tm2 tm2Var : sl2Var.Q) {
            if (tm2Var.a0) {
                for (sm2 sm2Var : tm2Var.S) {
                    sm2Var.j();
                    qp1 qp1Var = sm2Var.h;
                    if (qp1Var != null) {
                        qp1Var.c(sm2Var.e);
                        sm2Var.h = null;
                        sm2Var.g = null;
                    }
                }
            }
            nl2 nl2Var = tm2Var.A;
            int m = nl2Var.s.m();
            b91 b91Var = nl2Var.g;
            Uri b = nl2Var.e[m].b();
            a91 a91Var = (a91) b91Var.A.get(b);
            if (a91Var != null) {
                HashMap hashMap = a91Var.b;
                io3.B(hashMap.containsKey(b));
                z81 z81Var = (z81) hashMap.get(b);
                z81Var.getClass();
                z81Var.I = false;
            }
            nl2Var.o = null;
            tm2Var.G.L(tm2Var);
            tm2Var.O.removeCallbacksAndMessages(null);
            tm2Var.e0 = true;
            tm2Var.P.clear();
        }
        sl2Var.N = null;
    }

    @Override // defpackage.t30
    public final void n(n71 n71Var) {
        this.s = n71Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cp4 cp4Var = this.g;
        cp4Var.getClass();
        xp1 xp1Var = this.l;
        xp1Var.d(myLooper, cp4Var);
        xp1Var.a();
        boolean z = false;
        eb2 eb2Var = new eb2((CopyOnWriteArrayList) this.c.A, 0, (jw3) null);
        vq3 vq3Var = c().b;
        vq3Var.getClass();
        Uri uri = vq3Var.a;
        z20 z20Var = this.h;
        z20Var.getClass();
        Handler p = eq6.p(null);
        b91 b91Var = this.p;
        b91Var.E = p;
        b91Var.C = eb2Var;
        b91Var.F = this;
        b91Var.G = z20Var;
        Map map = Collections.EMPTY_MAP;
        io3.w(uri, "The uri must be set.");
        gj4 gj4Var = new gj4(((o41) b91Var.x.y).H(), new v41(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, b91Var.y.u());
        if (b91Var.D == null) {
            z = true;
        }
        io3.B(z);
        dn0 dn0Var = new dn0("DefaultHlsPlaylistTracker:MultivariantPlaylist", (byte) 2);
        b91Var.D = dn0Var;
        dn0Var.T(gj4Var, b91Var, b91Var.z.i(gj4Var.c));
    }

    @Override // defpackage.t30
    public final void q() {
        b91 b91Var = this.p;
        HashMap hashMap = b91Var.A;
        b91Var.O = null;
        b91Var.P = null;
        b91Var.H = null;
        ol2 ol2Var = b91Var.J;
        if (ol2Var != null) {
            ol2Var.f();
        }
        b91Var.K = null;
        b91Var.L = null;
        b91Var.M = null;
        b91Var.N = null;
        b91Var.I = null;
        b91Var.S = -9223372036854775807L;
        b91Var.D.L(null);
        b91Var.D = null;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((a91) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((z81) it2.next()).z.L(null);
            }
        }
        b91Var.E.removeCallbacksAndMessages(null);
        b91Var.E = null;
        b91Var.G = null;
        hashMap.clear();
        this.l.release();
    }

    public final void u(bm2 bm2Var) {
        long j;
        long j2;
        long j3;
        yp5 yp5Var;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        float f;
        long j8;
        long j9;
        boolean z2 = bm2Var.p;
        boolean z3 = bm2Var.g;
        nw2 nw2Var = bm2Var.r;
        long j10 = bm2Var.u;
        long j11 = bm2Var.e;
        int i = bm2Var.d;
        long j12 = bm2Var.h;
        if (z2) {
            j = eq6.l0(j12);
        } else {
            j = -9223372036854775807L;
        }
        if (i != 2 && i != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        b91 b91Var = this.p;
        b91Var.H.getClass();
        i18 i18Var = new i18((byte) 21);
        if (b91Var.R) {
            am2 am2Var = bm2Var.v;
            long j13 = am2Var.c;
            long j14 = am2Var.d;
            long j15 = j12 - b91Var.S;
            boolean z4 = bm2Var.o;
            if (z4) {
                j4 = j15 + j10;
            } else {
                j4 = -9223372036854775807L;
            }
            if (bm2Var.p) {
                j5 = eq6.U(eq6.F(this.q)) - (j12 + j10);
            } else {
                j5 = 0;
            }
            long j16 = this.r.a;
            if (j16 != -9223372036854775807L) {
                j7 = eq6.U(j16);
            } else {
                if (j11 != -9223372036854775807L) {
                    j6 = j10 - j11;
                } else if (j14 != -9223372036854775807L && bm2Var.n != -9223372036854775807L) {
                    j6 = j14;
                } else if (j13 != -9223372036854775807L) {
                    j6 = j13;
                } else {
                    j6 = 3 * bm2Var.m;
                }
                j7 = j6 + j5;
            }
            long j17 = j10 + j5;
            long k = eq6.k(j7, j5, j17);
            uq3 uq3Var = c().c;
            boolean z5 = false;
            if (uq3Var.d == -3.4028235E38f && uq3Var.e == -3.4028235E38f && j13 == -9223372036854775807L && j14 == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            tq3 a = this.r.a();
            a.a = eq6.l0(k);
            float f2 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = this.r.d;
            }
            a.d = f;
            if (!z) {
                f2 = this.r.e;
            }
            a.e = f2;
            uq3 uq3Var2 = new uq3(a);
            this.r = uq3Var2;
            if (j11 == -9223372036854775807L) {
                j11 = j17 - eq6.U(uq3Var2.a);
            }
            if (z3) {
                j9 = j11;
            } else {
                wl2 t = t(j11, bm2Var.s);
                if (t != null) {
                    j8 = t.B;
                } else if (nw2Var.isEmpty()) {
                    j9 = 0;
                } else {
                    yl2 yl2Var = (yl2) nw2Var.get(eq6.d(nw2Var, Long.valueOf(j11), true));
                    wl2 t2 = t(j11, yl2Var.J);
                    if (t2 != null) {
                        j8 = t2.B;
                    } else {
                        j8 = yl2Var.B;
                    }
                }
                j9 = j8;
            }
            if (i == 2 && bm2Var.f) {
                z5 = true;
            }
            yp5Var = new yp5(j2, j, j4, bm2Var.u, j15, j9, true, !z4, z5, i18Var, c(), this.r);
        } else {
            if (j11 != -9223372036854775807L && !nw2Var.isEmpty()) {
                if (!z3 && j11 != j10) {
                    j11 = ((yl2) nw2Var.get(eq6.d(nw2Var, Long.valueOf(j11), true))).B;
                }
                j3 = j11;
            } else {
                j3 = 0;
            }
            long j18 = bm2Var.u;
            yp5Var = new yp5(j2, j, j18, j18, 0L, j3, true, false, true, i18Var, c(), null);
        }
        o(yp5Var);
    }
}
