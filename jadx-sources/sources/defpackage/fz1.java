package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fz1 implements Handler.Callback, nr3, ih6, ms6 {
    public static final long D0 = eq6.l0(10000);
    public final mb1 A;
    public long A0;
    public final jh6 B;
    public boolean B0;
    public final r91 C;
    public float C0;
    public final k46 D;
    public final ad E;
    public final Looper F;
    public final jf6 G;
    public final hf6 H;
    public final long I;
    public final s91 J;
    public final ArrayList K;
    public final f46 L;
    public final ey1 M;
    public final rr3 N;
    public final ax3 O;
    public final p91 P;
    public final short Q;
    public final cp4 R;
    public final boolean S;
    public final c71 T;
    public final k46 U;
    public final boolean V;
    public final bv W;
    public boolean X;
    public if5 Y;
    public sd5 Z;
    public boolean a0;
    public boolean b0;
    public ez1 c0;
    public int d0;
    public qn4 e0;
    public cz1 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public ez1 s0;
    public long t0;
    public long u0;
    public int v0;
    public boolean w0;
    public final y25[] x;
    public yx1 x0;
    public final w30[] y;
    public long y0;
    public final boolean[] z;
    public ay1 z0;

    /* JADX WARN: Type inference failed for: r9v5, types: [short, int] */
    public fz1(Context context, w30[] w30VarArr, w30[] w30VarArr2, mb1 mb1Var, jh6 jh6Var, r91 r91Var, z20 z20Var, int i, boolean z, c71 c71Var, if5 if5Var, p91 p91Var, long j, boolean z2, Looper looper, f46 f46Var, ey1 ey1Var, cp4 cp4Var, final ms6 ms6Var, boolean z3) {
        boolean z4;
        Looper looper2;
        ay1 ay1Var = ay1.a;
        this.A0 = -9223372036854775807L;
        this.M = ey1Var;
        this.A = mb1Var;
        this.B = jh6Var;
        this.C = r91Var;
        this.m0 = i;
        this.n0 = z;
        this.Y = if5Var;
        this.P = p91Var;
        this.Q = (int) j;
        boolean z5 = false;
        this.h0 = false;
        this.S = z2;
        this.L = f46Var;
        this.R = cp4Var;
        this.z0 = ay1Var;
        this.T = c71Var;
        this.C0 = 1.0f;
        this.Z = sd5.b;
        this.X = z3;
        this.y0 = -9223372036854775807L;
        this.k0 = -9223372036854775807L;
        this.I = r91Var.n;
        gf6 gf6Var = kf6.a;
        qn4 k = qn4.k(jh6Var);
        this.e0 = k;
        this.f0 = new cz1(k);
        this.y = new w30[w30VarArr.length];
        this.z = new boolean[w30VarArr.length];
        mb1Var.getClass();
        this.x = new y25[w30VarArr.length];
        boolean z6 = false;
        for (int i2 = 0; i2 < w30VarArr.length; i2++) {
            w30 w30Var = w30VarArr[i2];
            w30Var.B = i2;
            w30Var.C = cp4Var;
            w30Var.D = f46Var;
            this.y[i2] = w30Var;
            w30 w30Var2 = this.y[i2];
            synchronized (w30Var2.x) {
                w30Var2.P = mb1Var;
            }
            w30 w30Var3 = w30VarArr2[i2];
            if (w30Var3 != null) {
                w30Var3.B = i2;
                w30Var3.C = cp4Var;
                w30Var3.D = f46Var;
                z6 = true;
            }
            this.x[i2] = new y25(w30VarArr[i2], w30Var3, i2);
        }
        this.V = z6;
        this.J = new s91(this, f46Var);
        this.K = new ArrayList();
        this.G = new jf6();
        this.H = new hf6();
        if (mb1Var.a == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        io3.B(z4);
        mb1Var.a = this;
        mb1Var.b = z20Var;
        mb1Var.f = mb1Var.e;
        this.w0 = true;
        k46 a = f46Var.a(looper, null);
        this.U = a;
        this.N = new rr3(c71Var, a, new h5((Object) this, (byte) 21), w30VarArr.length);
        this.O = new ax3(this, c71Var, a, cp4Var, z20Var);
        ad adVar = new ad();
        this.E = adVar;
        synchronized (adVar.z) {
            try {
                looper2 = (Looper) adVar.A;
                if (looper2 == null) {
                    if (adVar.y == 0 && ((HandlerThread) adVar.B) == null) {
                        z5 = true;
                    }
                    io3.B(z5);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    adVar.B = handlerThread;
                    handlerThread.start();
                    looper2 = ((HandlerThread) adVar.B).getLooper();
                    adVar.A = looper2;
                }
                adVar.y++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.F = looper2;
        k46 a2 = f46Var.a(looper2, this);
        this.D = a2;
        this.W = new bv(context, looper2, this);
        a2.c(35, new ms6() { // from class: xy1
            @Override // defpackage.ms6
            public final void d(long j2, long j3, ea2 ea2Var, MediaFormat mediaFormat) {
                ms6Var.d(j2, j3, ea2Var, mediaFormat);
                fz1.this.d(j2, j3, ea2Var, mediaFormat);
            }
        }).b();
        a2.c(39, new yy1(this)).b();
    }

    public static Pair T(kf6 kf6Var, ez1 ez1Var, boolean z, int i, boolean z2, jf6 jf6Var, hf6 hf6Var) {
        kf6 kf6Var2;
        int U;
        kf6 kf6Var3 = ez1Var.a;
        if (!kf6Var.p()) {
            if (kf6Var3.p()) {
                kf6Var2 = kf6Var;
            } else {
                kf6Var2 = kf6Var3;
            }
            try {
                Pair i2 = kf6Var2.i(jf6Var, hf6Var, ez1Var.b, ez1Var.c);
                if (!kf6Var.equals(kf6Var2)) {
                    if (kf6Var.b(i2.first) != -1) {
                        if (kf6Var2.g(i2.first, hf6Var).f && kf6Var2.m(hf6Var.c, jf6Var, 0L).n == kf6Var2.b(i2.first)) {
                            return kf6Var.i(jf6Var, hf6Var, kf6Var.g(i2.first, hf6Var).c, ez1Var.c);
                        }
                    } else {
                        if (z && (U = U(jf6Var, hf6Var, i, z2, i2.first, kf6Var2, kf6Var)) != -1) {
                            return kf6Var.i(jf6Var, hf6Var, U, -9223372036854775807L);
                        }
                        return null;
                    }
                }
                return i2;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int U(jf6 jf6Var, hf6 hf6Var, int i, boolean z, Object obj, kf6 kf6Var, kf6 kf6Var2) {
        jf6 jf6Var2 = jf6Var;
        kf6 kf6Var3 = kf6Var;
        Object obj2 = kf6Var3.m(kf6Var3.g(obj, hf6Var).c, jf6Var, 0L).a;
        for (int i2 = 0; i2 < kf6Var2.o(); i2++) {
            if (kf6Var2.m(i2, jf6Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = kf6Var3.b(obj);
        int h = kf6Var3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            kf6 kf6Var4 = kf6Var3;
            int d = kf6Var4.d(b, hf6Var, jf6Var2, i, z);
            if (d == -1) {
                break;
            }
            i3 = kf6Var2.b(kf6Var4.l(d));
            i4++;
            kf6Var3 = kf6Var4;
            b = d;
            jf6Var2 = jf6Var;
        }
        if (i3 == -1) {
            return -1;
        }
        return kf6Var2.f(i3, hf6Var, false).c;
    }

    public static boolean z(pr3 pr3Var) {
        long f;
        if (pr3Var != null) {
            try {
                wn3 wn3Var = pr3Var.a;
                if (!pr3Var.e) {
                    wn3Var.i();
                } else {
                    for (g95 g95Var : pr3Var.c) {
                        if (g95Var != null) {
                            g95Var.s();
                        }
                    }
                }
                if (!pr3Var.e) {
                    f = 0;
                } else {
                    f = wn3Var.f();
                }
                if (f != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        for (int i = 0; i < this.x.length; i++) {
            rr3 rr3Var = this.N;
            if (rr3Var.i != rr3Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void A0(List list, int i, int i2) {
        boolean z;
        boolean z2 = true;
        this.f0.a(1);
        ax3 ax3Var = this.O;
        ax3Var.getClass();
        ArrayList arrayList = ax3Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        io3.n(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((zw3) arrayList.get(i3)).a.g((ar3) list.get(i3 - i));
        }
        v(ax3Var.b(), false);
    }

    public final boolean B(int i, jw3 jw3Var) {
        rr3 rr3Var = this.N;
        pr3 pr3Var = rr3Var.k[i];
        if (pr3Var != null && pr3Var.g.a.equals(jw3Var)) {
            return this.x[i].h(rr3Var.k[i]);
        }
        return false;
    }

    public final void B0(int i, int i2, int i3, boolean z) {
        boolean z2;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.a0;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            if (z3) {
                i2 = 4;
            } else {
                i2 = 0;
            }
        }
        qn4 qn4Var = this.e0;
        if (qn4Var.l != z2 || qn4Var.n != i2 || qn4Var.m != i3) {
            this.e0 = qn4Var.e(i3, i2, z2);
            E0(false, false);
            rr3 rr3Var = this.N;
            for (pr3 pr3Var = rr3Var.i; pr3Var != null; pr3Var = pr3Var.m) {
                for (jz1 jz1Var : (jz1[]) pr3Var.o.z) {
                    if (jz1Var != null) {
                        jz1Var.g(z2);
                    }
                }
            }
            if (!t0()) {
                x0();
                C0();
                qn4 qn4Var2 = this.e0;
                if (qn4Var2.p) {
                    this.e0 = qn4Var2.i(false);
                }
                rr3Var.r(this.t0);
                return;
            }
            int i4 = this.e0.e;
            k46 k46Var = this.D;
            if (i4 == 3) {
                s91 s91Var = this.J;
                s91Var.C = true;
                s91Var.x.c();
                v0();
                k46Var.j(2);
                return;
            }
            if (i4 == 2) {
                k46Var.j(2);
            }
        }
    }

    public final boolean C() {
        pr3 pr3Var = this.N.i;
        long j = pr3Var.g.e;
        if (pr3Var.e) {
            if (j == -9223372036854775807L || this.e0.s < j || !t0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0() {
        long j;
        long j2;
        float f;
        long k;
        pr3 pr3Var = this.N.i;
        if (pr3Var != null) {
            if (pr3Var.e) {
                j = pr3Var.a.n();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                if (!pr3Var.g()) {
                    this.N.s(pr3Var);
                    h();
                    u(false);
                    D();
                }
                R(j, true);
                if (j != this.e0.s) {
                    qn4 qn4Var = this.e0;
                    this.e0 = y(qn4Var.b, j, qn4Var.c, j, true, 5);
                }
            } else {
                s91 s91Var = this.J;
                boolean A = A();
                ss3 ss3Var = s91Var.x;
                w30 w30Var = s91Var.z;
                if (w30Var != null && !w30Var.k() && ((!A || s91Var.z.E == 2) && (s91Var.z.n() || (!A && !s91Var.z.j())))) {
                    fp3 fp3Var = s91Var.A;
                    fp3Var.getClass();
                    long m = fp3Var.m();
                    if (s91Var.B) {
                        if (m < ss3Var.m()) {
                            if (ss3Var.x) {
                                ss3Var.a(ss3Var.m());
                                ss3Var.x = false;
                            }
                        } else {
                            s91Var.B = false;
                            if (s91Var.C) {
                                ss3Var.c();
                            }
                        }
                    }
                    ss3Var.a(m);
                    rn4 e = fp3Var.e();
                    if (!e.equals((rn4) ss3Var.B)) {
                        ss3Var.b(e);
                        s91Var.y.D.c(16, e).b();
                    }
                } else {
                    s91Var.B = true;
                    if (s91Var.C) {
                        ss3Var.c();
                    }
                }
                long m2 = s91Var.m();
                this.t0 = m2;
                long j3 = m2 - pr3Var.p;
                long j4 = this.e0.s;
                if (!this.K.isEmpty() && !this.e0.b.c()) {
                    if (this.w0) {
                        this.w0 = false;
                    }
                    qn4 qn4Var2 = this.e0;
                    qn4Var2.a.b(qn4Var2.b.a);
                    int min = Math.min(this.v0, this.K.size());
                    if (min > 0 && this.K.get(min - 1) != null) {
                        ov3.d();
                        return;
                    } else {
                        if (min < this.K.size() && this.K.get(min) != null) {
                            ov3.d();
                            return;
                        }
                        this.v0 = min;
                    }
                }
                if (this.J.o()) {
                    boolean z = !this.f0.d;
                    qn4 qn4Var3 = this.e0;
                    this.e0 = y(qn4Var3.b, j3, qn4Var3.c, j3, z, 6);
                } else {
                    qn4 qn4Var4 = this.e0;
                    qn4Var4.s = j3;
                    qn4Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.e0.q = this.N.l.d();
            qn4 qn4Var5 = this.e0;
            qn4Var5.r = p(qn4Var5.q);
            qn4 qn4Var6 = this.e0;
            if (qn4Var6.l && qn4Var6.e == 3 && u0(qn4Var6.a, qn4Var6.b)) {
                qn4 qn4Var7 = this.e0;
                float f2 = 1.0f;
                if (qn4Var7.o.a == 1.0f) {
                    p91 p91Var = this.P;
                    long m3 = m(qn4Var7.a, qn4Var7.b.a, qn4Var7.s);
                    long j5 = this.e0.r;
                    if (p91Var.c != -9223372036854775807L) {
                        long j6 = m3 - j5;
                        if (p91Var.m == -9223372036854775807L) {
                            p91Var.m = j6;
                            p91Var.n = 0L;
                        } else {
                            p91Var.m = Math.max(j6, (((float) j6) * 9.999871E-4f) + (((float) r9) * 0.999f));
                            p91Var.n = (9.999871E-4f * ((float) Math.abs(j6 - r9))) + (((float) p91Var.n) * 0.999f);
                        }
                        if (p91Var.l != -9223372036854775807L) {
                            j2 = 1000;
                            if (SystemClock.elapsedRealtime() - p91Var.l < 1000) {
                                f2 = p91Var.k;
                            }
                        } else {
                            j2 = 1000;
                        }
                        p91Var.l = SystemClock.elapsedRealtime();
                        long j7 = (p91Var.n * 3) + p91Var.m;
                        if (p91Var.h > j7) {
                            float U = (float) eq6.U(j2);
                            f = 1.0E-7f;
                            long[] jArr = {j7, p91Var.e, p91Var.h - (((p91Var.k - 1.0f) * U) + ((p91Var.i - 1.0f) * U))};
                            k = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j8 = jArr[i];
                                if (j8 > k) {
                                    k = j8;
                                }
                            }
                            p91Var.h = k;
                        } else {
                            f = 1.0E-7f;
                            k = eq6.k(m3 - (Math.max(0.0f, p91Var.k - 1.0f) / 1.0E-7f), p91Var.h, j7);
                            p91Var.h = k;
                            long j9 = p91Var.g;
                            if (j9 != -9223372036854775807L && k > j9) {
                                p91Var.h = j9;
                                k = j9;
                            }
                        }
                        long j10 = m3 - k;
                        if (Math.abs(j10) < p91Var.a) {
                            p91Var.k = 1.0f;
                        } else {
                            f2 = eq6.i((f * ((float) j10)) + 1.0f, p91Var.j, p91Var.i);
                            p91Var.k = f2;
                        }
                    }
                    if (this.J.e().a != f2) {
                        rn4 rn4Var = new rn4(f2, this.e0.o.b);
                        this.D.i(16);
                        this.J.b(rn4Var);
                        x(this.e0.o, this.J.e().a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long f;
        long j;
        boolean b;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!z(this.N.l)) {
            b = false;
        } else {
            pr3 pr3Var = this.N.l;
            if (!pr3Var.e) {
                f = 0;
            } else {
                f = pr3Var.a.f();
            }
            long p = p(f);
            pr3 pr3Var2 = this.N.i;
            if (u0(this.e0.a, pr3Var.g.a)) {
                j = this.P.h;
            } else {
                j = -9223372036854775807L;
            }
            cp4 cp4Var = this.R;
            kf6 kf6Var = this.e0.a;
            jw3 jw3Var = pr3Var.g.a;
            float f2 = this.J.e().a;
            boolean z4 = this.e0.l;
            ej3 ej3Var = new ej3(cp4Var, kf6Var, jw3Var, p, f2, this.j0, j);
            b = this.C.b(ej3Var);
            pr3 pr3Var3 = this.N.i;
            if (!b && pr3Var3.e && p < 500000 && this.I > 0) {
                pr3Var3.a.l(this.e0.s);
                b = this.C.b(ej3Var);
            }
        }
        this.l0 = b;
        if (b) {
            pr3 pr3Var4 = this.N.l;
            pr3Var4.getClass();
            pj3 pj3Var = new pj3();
            pj3Var.a = this.t0 - pr3Var4.p;
            float f3 = this.J.e().a;
            if (f3 <= 0.0f && f3 != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            io3.n(z);
            pj3Var.b = f3;
            long j2 = this.k0;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            io3.n(z2);
            pj3Var.c = j2;
            qj3 qj3Var = new qj3(pj3Var);
            if (pr3Var4.m == null) {
                z3 = true;
            }
            io3.B(z3);
            pr3Var4.a.q(qj3Var);
        }
        y0();
    }

    public final void D0(kf6 kf6Var, jw3 jw3Var, kf6 kf6Var2, jw3 jw3Var2, long j, boolean z) {
        Object obj;
        rn4 rn4Var;
        boolean u0 = u0(kf6Var, jw3Var);
        Object obj2 = jw3Var.a;
        if (!u0) {
            if (jw3Var.c()) {
                rn4Var = rn4.d;
            } else {
                rn4Var = this.e0.o;
            }
            s91 s91Var = this.J;
            if (!s91Var.e().equals(rn4Var)) {
                this.D.i(16);
                s91Var.b(rn4Var);
                x(this.e0.o, rn4Var.a, false, false);
                return;
            }
            return;
        }
        hf6 hf6Var = this.H;
        int i = kf6Var.g(obj2, hf6Var).c;
        jf6 jf6Var = this.G;
        kf6Var.n(i, jf6Var);
        uq3 uq3Var = jf6Var.j;
        String str = eq6.a;
        p91 p91Var = this.P;
        p91Var.getClass();
        p91Var.c = eq6.U(uq3Var.a);
        p91Var.f = eq6.U(uq3Var.b);
        p91Var.g = eq6.U(uq3Var.c);
        float f = uq3Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        p91Var.j = f;
        float f2 = uq3Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        p91Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            p91Var.c = -9223372036854775807L;
        }
        p91Var.a();
        if (j != -9223372036854775807L) {
            p91Var.d = m(kf6Var, obj2, j);
            p91Var.a();
            return;
        }
        Object obj3 = jf6Var.a;
        if (!kf6Var2.p()) {
            obj = kf6Var2.m(kf6Var2.g(jw3Var2.a, hf6Var).c, jf6Var, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        p91Var.d = -9223372036854775807L;
        p91Var.a();
    }

    public final void E() {
        boolean z;
        boolean z2;
        rr3 rr3Var = this.N;
        rr3Var.p();
        pr3 pr3Var = rr3Var.m;
        if (pr3Var != null) {
            wn3 wn3Var = pr3Var.a;
            if ((!pr3Var.d || pr3Var.e) && !wn3Var.d()) {
                kf6 kf6Var = this.e0.a;
                if (pr3Var.e) {
                    wn3Var.s();
                }
                Iterator it = this.C.p.values().iterator();
                while (it.hasNext()) {
                    if (((q91) it.next()).b) {
                        return;
                    }
                }
                boolean z3 = true;
                if (!pr3Var.d) {
                    long j = pr3Var.g.b;
                    pr3Var.d = true;
                    wn3Var.o(this, j);
                    return;
                }
                pj3 pj3Var = new pj3();
                pj3Var.a = this.t0 - pr3Var.p;
                float f = this.J.e().a;
                if (f <= 0.0f && f != -3.4028235E38f) {
                    z = false;
                } else {
                    z = true;
                }
                io3.n(z);
                pj3Var.b = f;
                long j2 = this.k0;
                if (j2 < 0 && j2 != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                io3.n(z2);
                pj3Var.c = j2;
                qj3 qj3Var = new qj3(pj3Var);
                if (pr3Var.m != null) {
                    z3 = false;
                }
                io3.B(z3);
                wn3Var.q(qj3Var);
            }
        }
    }

    public final void E0(boolean z, boolean z2) {
        long j;
        this.j0 = z;
        if (z && !z2) {
            this.L.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.k0 = j;
    }

    public final void F(int i) {
        boolean z;
        cz1 cz1Var = this.f0;
        qn4 qn4Var = this.e0;
        boolean z2 = cz1Var.a;
        boolean z3 = false;
        if (cz1Var.b != qn4Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        cz1Var.a = z4;
        cz1Var.b = qn4Var;
        if (z4) {
            if (!qn4Var.a.p()) {
                qn4 qn4Var2 = this.e0;
                if (qn4Var2.a.b(qn4Var2.b.a) != -1) {
                    z3 = true;
                }
                Locale locale = Locale.US;
                qn4 qn4Var3 = this.e0;
                io3.A(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", qn4Var3.b.a, qn4Var3.a.getClass().getName(), Integer.valueOf(this.e0.a.o()), Integer.valueOf(i)), z3);
            }
            cz1 cz1Var2 = this.f0;
            vy1 vy1Var = this.M.y;
            vy1Var.j.f(new gb(vy1Var, cz1Var2, (byte) 28));
            this.f0 = new cz1(this.e0);
        }
    }

    public final void G(int i) {
        y25 y25Var = this.x[i];
        try {
            pr3 pr3Var = this.N.i;
            pr3Var.getClass();
            w30 d = y25Var.d(pr3Var);
            d.getClass();
            g95 g95Var = d.F;
            g95Var.getClass();
            g95Var.s();
        } catch (IOException | RuntimeException e) {
            byte b = y25Var.a.y;
            if (b != 3 && b != 5) {
                throw e;
            }
            jh6 jh6Var = this.N.i.o;
            kb0.t("ExoPlayerImplInternal", "Disabling track due to error: ".concat(ea2.d(((jz1[]) jh6Var.z)[i].n())), e);
            jh6 jh6Var2 = new jh6((x25[]) ((x25[]) jh6Var.y).clone(), (jz1[]) ((jz1[]) jh6Var.z).clone(), (qh6) jh6Var.A, jh6Var.B);
            ((x25[]) jh6Var2.y)[i] = null;
            ((jz1[]) jh6Var2.z)[i] = null;
            i(i);
            pr3 pr3Var2 = this.N.i;
            pr3Var2.a(jh6Var2, this.e0.s, false, new boolean[pr3Var2.j.length]);
        }
    }

    public final void H(final int i, final boolean z) {
        boolean[] zArr = this.z;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.U.f(new Runnable() { // from class: wy1
                @Override // java.lang.Runnable
                public final void run() {
                    fz1 fz1Var = fz1.this;
                    c71 c71Var = fz1Var.T;
                    y25[] y25VarArr = fz1Var.x;
                    int i2 = i;
                    byte b = y25VarArr[i2].a.y;
                    q7 a0 = c71Var.a0();
                    c71Var.b0(a0, 1033, new w61(a0, i2, b, z));
                }
            });
        }
    }

    public final void I() {
        v(this.O.b(), true);
    }

    public final void J(bz1 bz1Var) {
        boolean z;
        kf6 b;
        this.f0.a(1);
        int i = bz1Var.a;
        int i2 = bz1Var.b;
        int i3 = bz1Var.c;
        lo5 lo5Var = bz1Var.d;
        ax3 ax3Var = this.O;
        ArrayList arrayList = ax3Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        ax3Var.k = lo5Var;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((zw3) arrayList.get(min)).d;
            eq6.T(arrayList, i, i2, i3);
            while (min <= max) {
                zw3 zw3Var = (zw3) arrayList.get(min);
                zw3Var.d = i4;
                i4 += zw3Var.a.o.e.o();
                min++;
            }
            b = ax3Var.b();
        } else {
            b = ax3Var.b();
        }
        v(b, false);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [q91, java.lang.Object] */
    public final void K() {
        boolean z;
        int i;
        int i2;
        this.f0.a(1);
        P(false, false, false, true);
        r91 r91Var = this.C;
        ConcurrentHashMap concurrentHashMap = r91Var.p;
        long id = Thread.currentThread().getId();
        long j = r91Var.q;
        if (j != -1 && j != id) {
            z = false;
        } else {
            z = true;
        }
        io3.A("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        r91Var.q = id;
        cp4 cp4Var = this.R;
        q91 q91Var = (q91) concurrentHashMap.get(cp4Var);
        if (q91Var == null) {
            ?? obj = new Object();
            obj.a = 1;
            concurrentHashMap.put(cp4Var, obj);
        } else {
            q91Var.a++;
        }
        q91 q91Var2 = (q91) concurrentHashMap.get(cp4Var);
        q91Var2.getClass();
        Integer num = (Integer) r91Var.o.get(cp4Var.a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = r91Var.l;
        }
        if (i == -1) {
            i = 13107200;
        }
        q91Var2.c = i;
        q91Var2.b = false;
        if (this.e0.a.p()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        p0(i2);
        qn4 qn4Var = this.e0;
        boolean z2 = qn4Var.l;
        B0(this.W.c(qn4Var.e, z2), qn4Var.n, qn4Var.m, z2);
        ax3 ax3Var = this.O;
        ArrayList arrayList = ax3Var.c;
        io3.B(!ax3Var.l);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zw3 zw3Var = (zw3) arrayList.get(i3);
            ax3Var.e(zw3Var);
            ax3Var.h.add(zw3Var);
        }
        ax3Var.l = true;
        this.D.j(2);
    }

    public final void L(nv0 nv0Var) {
        ad adVar = this.E;
        k46 k46Var = this.D;
        try {
            P(true, false, true, false);
            M();
            r91 r91Var = this.C;
            cp4 cp4Var = this.R;
            ConcurrentHashMap concurrentHashMap = r91Var.p;
            q91 q91Var = (q91) concurrentHashMap.get(cp4Var);
            if (q91Var != null) {
                int i = q91Var.a - 1;
                q91Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(cp4Var);
                    r91Var.c();
                }
            }
            if (r91Var.p.isEmpty()) {
                r91Var.q = -1L;
            }
            bv bvVar = this.W;
            bvVar.c = null;
            bvVar.a();
            bvVar.b(0);
            this.A.j();
            p0(1);
        } finally {
            k46Var.h();
            adVar.n();
            nv0Var.f();
        }
    }

    public final void M() {
        boolean z;
        for (int i = 0; i < this.x.length; i++) {
            w30 w30Var = this.y[i];
            synchronized (w30Var.x) {
                w30Var.P = null;
            }
            y25 y25Var = this.x[i];
            w30 w30Var2 = y25Var.a;
            boolean z2 = true;
            if (w30Var2.E == 0) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            w30Var2.s();
            y25Var.e = false;
            w30 w30Var3 = y25Var.c;
            if (w30Var3 != null) {
                if (w30Var3.E != 0) {
                    z2 = false;
                }
                io3.B(z2);
                w30Var3.s();
                y25Var.f = false;
            }
        }
    }

    public final void N(int i, int i2, lo5 lo5Var) {
        boolean z = true;
        this.f0.a(1);
        ax3 ax3Var = this.O;
        ax3Var.getClass();
        if (i < 0 || i > i2 || i2 > ax3Var.c.size()) {
            z = false;
        }
        io3.n(z);
        ax3Var.k = lo5Var;
        ax3Var.f(i, i2);
        v(ax3Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.O():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z;
        pr3 pr3Var = this.N.i;
        if (pr3Var != null && pr3Var.g.h && this.h0) {
            z = true;
        } else {
            z = false;
        }
        this.i0 = z;
    }

    public final void R(long j, boolean z) {
        long j2;
        pr3 pr3Var = this.N.i;
        if (pr3Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = pr3Var.p;
        }
        long j3 = j + j2;
        this.t0 = j3;
        this.J.x.a(j3);
        for (y25 y25Var : this.x) {
            long j4 = this.t0;
            w30 d = y25Var.d(pr3Var);
            if (d != null) {
                d.B(j4, false, z);
            }
        }
        for (pr3 pr3Var2 = r0.i; pr3Var2 != null; pr3Var2 = pr3Var2.m) {
            for (jz1 jz1Var : (jz1[]) pr3Var2.o.z) {
                if (jz1Var != null) {
                    jz1Var.s();
                }
            }
        }
    }

    public final void S(kf6 kf6Var, kf6 kf6Var2) {
        if (kf6Var.p() && kf6Var2.p()) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            h11.v(arrayList.get(size));
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(long r17) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r0.S
            r2 = 0
            if (r1 != 0) goto L13
            boolean r1 = r0.a0
            if (r1 == 0) goto L11
            sd5 r1 = r0.Z
            r1.getClass()
            goto L13
        L11:
            r1 = r2
            goto L14
        L13:
            r1 = 1
        L14:
            qn4 r3 = r0.e0
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 3
            long r7 = defpackage.fz1.D0
            if (r1 == 0) goto L8d
            int r1 = r3.e
            if (r1 != r6) goto L22
            goto L23
        L22:
            r4 = r7
        L23:
            y25[] r1 = r0.x
            int r3 = r1.length
        L26:
            if (r2 >= r3) goto L5b
            r6 = r1[r2]
            long r9 = r0.t0
            long r11 = r0.u0
            w30 r13 = r6.c
            w30 r6 = r6.a
            boolean r14 = defpackage.y25.k(r6)
            if (r14 == 0) goto L3d
            long r14 = r6.g(r9, r11)
            goto L42
        L3d:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L42:
            if (r13 == 0) goto L50
            byte r6 = r13.E
            if (r6 == 0) goto L50
            long r9 = r13.g(r9, r11)
            long r14 = java.lang.Math.min(r14, r9)
        L50:
            long r9 = defpackage.eq6.l0(r14)
            long r4 = java.lang.Math.min(r4, r9)
            int r2 = r2 + 1
            goto L26
        L5b:
            qn4 r1 = r0.e0
            boolean r1 = r1.m()
            if (r1 == 0) goto L99
            rr3 r1 = r0.N
            pr3 r1 = r1.i
            if (r1 == 0) goto L6c
            pr3 r1 = r1.m
            goto L6d
        L6c:
            r1 = 0
        L6d:
            if (r1 == 0) goto L99
            long r2 = r0.t0
            float r2 = (float) r2
            long r9 = defpackage.eq6.U(r4)
            float r3 = (float) r9
            qn4 r6 = r0.e0
            rn4 r6 = r6.o
            float r6 = r6.a
            float r3 = r3 * r6
            float r3 = r3 + r2
            long r1 = r1.e()
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L99
            long r4 = java.lang.Math.min(r4, r7)
            goto L99
        L8d:
            int r1 = r3.e
            if (r1 != r6) goto L98
            boolean r1 = r0.t0()
            if (r1 != 0) goto L98
            goto L99
        L98:
            r4 = r7
        L99:
            long r1 = r17 + r4
            k46 r0 = r0.D
            android.os.Handler r0 = r0.a
            r3 = 2
            r0.sendEmptyMessageAtTime(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.V(long):void");
    }

    public final void W(boolean z) {
        jw3 jw3Var = this.N.i.g.a;
        long Y = Y(jw3Var, this.e0.s, true, false);
        if (Y != this.e0.s) {
            qn4 qn4Var = this.e0;
            this.e0 = y(jw3Var, Y, qn4Var.c, qn4Var.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:27|(7:(9:69|70|(1:93)(3:76|(1:80)|81)|82|(1:92)|89|90|19|20)(1:29)|46|47|48|18|19|20)|30|31|(1:33)(1:66)|34|35|36|(1:38)(1:61)|39|40|41|42|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0191, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0192, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0194, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(defpackage.ez1 r23) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.X(ez1):void");
    }

    public final long Y(jw3 jw3Var, long j, boolean z, boolean z2) {
        rr3 rr3Var;
        boolean z3;
        byte b;
        x0();
        boolean z4 = true;
        E0(false, true);
        if (z2 || this.e0.e == 3) {
            p0(2);
        }
        pr3 pr3Var = this.N.i;
        pr3 pr3Var2 = pr3Var;
        while (pr3Var2 != null && !jw3Var.equals(pr3Var2.g.a)) {
            pr3Var2 = pr3Var2.m;
        }
        if (z || pr3Var != pr3Var2 || (pr3Var2 != null && pr3Var2.p + j < 0)) {
            for (int i = 0; i < this.x.length; i++) {
                i(i);
            }
            this.A0 = -9223372036854775807L;
            if (pr3Var2 != null) {
                while (true) {
                    rr3Var = this.N;
                    if (rr3Var.i == pr3Var2) {
                        break;
                    }
                    rr3Var.a();
                }
                rr3Var.s(pr3Var2);
                pr3Var2.p = 1000000000000L;
                io3.B(!A());
                l(new boolean[this.x.length], this.N.d().e());
                b0(pr3Var2);
            }
        }
        h();
        if (this.a0) {
            for (y25 y25Var : this.x) {
                if (y25Var.j() && ((b = y25Var.a.y) == 2 || b == 4)) {
                    this.b0 = true;
                    break;
                }
            }
        }
        rr3 rr3Var2 = this.N;
        if (pr3Var2 != null) {
            rr3Var2.s(pr3Var2);
            if (!pr3Var2.e) {
                pr3Var2.g = pr3Var2.g.b(j, -9223372036854775807L);
            } else if (pr3Var2.f) {
                if (this.a0) {
                    this.Z.getClass();
                    if (!this.e0.a.p() && pr3Var2.g.a.equals(this.e0.b)) {
                        long j2 = pr3Var2.p + j;
                        boolean z5 = true;
                        for (y25 y25Var2 : this.x) {
                            if (y25Var2.j()) {
                                w30 d = y25Var2.d(pr3Var2);
                                if (d != null && d.F(j2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 &= z3;
                            }
                        }
                        if (z5) {
                            wn3 wn3Var = pr3Var2.a;
                            long j3 = this.e0.s;
                            if5 if5Var = if5.d;
                            if (wn3Var.h(j3, if5Var) == pr3Var2.a.h(j, if5Var)) {
                                z4 = false;
                            }
                        }
                    }
                }
                j = pr3Var2.a.j(j);
                pr3Var2.a.l(j - this.I);
            }
            R(j, z4);
            D();
        } else {
            rr3Var2.b();
            R(j, true);
        }
        u(false);
        this.D.j(2);
        return j;
    }

    public final void Z(lp4 lp4Var) {
        lp4Var.getClass();
        k46 k46Var = this.D;
        if (lp4Var.e == this.F) {
            synchronized (lp4Var) {
            }
            try {
                lp4Var.a.c(lp4Var.c, lp4Var.d);
                lp4Var.a(true);
                int i = this.e0.e;
                if (i != 3 && i != 2) {
                    return;
                }
                k46Var.j(2);
                return;
            } catch (Throwable th) {
                lp4Var.a(true);
                throw th;
            }
        }
        k46Var.c(15, lp4Var).b();
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        this.D.c(8, or3Var).b();
    }

    public final void a0(lp4 lp4Var) {
        Looper looper = lp4Var.e;
        if (!looper.getThread().isAlive()) {
            kb0.O("TAG", "Trying to send message on a dead thread.");
            lp4Var.a(false);
        } else {
            this.L.a(looper, null).f(new p0(this, lp4Var));
        }
    }

    public final void b(az1 az1Var, int i) {
        this.f0.a(1);
        ax3 ax3Var = this.O;
        if (i == -1) {
            i = ax3Var.c.size();
        }
        v(ax3Var.a(i, az1Var.a, az1Var.b), false);
    }

    public final void b0(pr3 pr3Var) {
        for (int i = 0; i < this.x.length; i++) {
            pr3Var.h[i] = true;
        }
    }

    public final void c() {
        sd5 sd5Var;
        for (y25 y25Var : this.x) {
            if (this.a0) {
                sd5Var = this.Z;
            } else {
                sd5Var = null;
            }
            y25Var.a.c(18, sd5Var);
            w30 w30Var = y25Var.c;
            if (w30Var != null) {
                w30Var.c(18, sd5Var);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r7.a == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(defpackage.ru r7, boolean r8) {
        /*
            r6 = this;
            mb1 r0 = r6.A
            ru r1 = r0.i
            boolean r1 = r1.equals(r7)
            r2 = 0
            if (r1 == 0) goto Lc
            goto L29
        Lc:
            r0.i = r7
            hb1 r1 = r0.f
            boolean r1 = r1.A0
            if (r1 == 0) goto L29
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 32
            if (r1 < r3) goto L29
            tu r1 = r0.h
            if (r1 == 0) goto L29
            boolean r1 = r1.x
            if (r1 == 0) goto L29
            ih6 r0 = r0.a
            if (r0 == 0) goto L29
            r0.f(r2)
        L29:
            if (r8 == 0) goto L2c
            goto L2d
        L2c:
            r7 = r2
        L2d:
            bv r8 = r6.W
            ru r0 = r8.d
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L6a
            r8.d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L3f
        L3d:
            r3 = r0
            goto L5e
        L3f:
            int r2 = r7.c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L58;
                case 1: goto L56;
                case 2: goto L54;
                case 3: goto L3d;
                case 4: goto L54;
                case 5: goto L5e;
                case 6: goto L5e;
                case 7: goto L5e;
                case 8: goto L5e;
                case 9: goto L5e;
                case 10: goto L5e;
                case 11: goto L50;
                case 12: goto L5e;
                case 13: goto L5e;
                case 14: goto L56;
                case 15: goto L48;
                case 16: goto L4e;
                default: goto L48;
            }
        L48:
            java.lang.String r7 = "Unidentified audio usage: "
            defpackage.h11.r(r2, r7, r5)
            goto L3d
        L4e:
            r3 = 4
            goto L5e
        L50:
            int r7 = r7.a
            if (r7 != r1) goto L5e
        L54:
            r3 = r4
            goto L5e
        L56:
            r3 = r1
            goto L5e
        L58:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.kb0.O(r5, r7)
            goto L56
        L5e:
            r8.f = r3
            if (r3 == r1) goto L64
            if (r3 != 0) goto L65
        L64:
            r0 = r1
        L65:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.io3.m(r7, r0)
        L6a:
            qn4 r7 = r6.e0
            boolean r0 = r7.l
            int r1 = r7.n
            int r2 = r7.m
            int r7 = r7.e
            int r7 = r8.c(r7, r0)
            r6.B0(r7, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.c0(ru, boolean):void");
    }

    @Override // defpackage.ms6
    public final void d(long j, long j2, ea2 ea2Var, MediaFormat mediaFormat) {
        if (this.b0) {
            this.D.a(37).b();
        }
    }

    public final void d0(int i) {
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.a;
            byte b = w30Var.y;
            if (b == 1 || b == 2) {
                w30Var.c(10, Integer.valueOf(i));
                w30 w30Var2 = y25Var.c;
                if (w30Var2 != null) {
                    w30Var2.c(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final boolean e() {
        if (!this.V) {
            return false;
        }
        for (y25 y25Var : this.x) {
            if (y25Var.g()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z, nv0 nv0Var) {
        if (this.o0 != z) {
            this.o0 = z;
            if (!z) {
                for (y25 y25Var : this.x) {
                    y25Var.n();
                }
            }
        }
        if (nv0Var != null) {
            nv0Var.f();
        }
    }

    @Override // defpackage.ih6
    public final void f(hh6 hh6Var) {
        this.D.c(10, hh6Var).b();
    }

    public final void f0(yy1 yy1Var) {
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.a;
            if (w30Var.y == 4) {
                w30Var.c(23, yy1Var);
                w30 w30Var2 = y25Var.c;
                if (w30Var2 != null) {
                    w30Var2.c(23, yy1Var);
                }
            }
        }
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        this.D.c(9, (or3) ui5Var).b();
    }

    public final void g0(az1 az1Var) {
        this.f0.a(1);
        int i = az1Var.c;
        lo5 lo5Var = az1Var.b;
        ArrayList arrayList = az1Var.a;
        if (i != -1) {
            this.s0 = new ez1(new hq4(arrayList, lo5Var), az1Var.c, az1Var.d);
        }
        ax3 ax3Var = this.O;
        ArrayList arrayList2 = ax3Var.c;
        ax3Var.f(0, arrayList2.size());
        v(ax3Var.a(arrayList2.size(), arrayList, lo5Var), false);
    }

    public final void h() {
        boolean z;
        w30 w30Var;
        if (this.V && e()) {
            for (y25 y25Var : this.x) {
                int c = y25Var.c();
                s91 s91Var = this.J;
                if (y25Var.g()) {
                    int i = y25Var.d;
                    int i2 = 1;
                    if (i != 5 && i != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i != 5 && i != 3) {
                        i2 = 0;
                    }
                    if (z) {
                        try {
                            w30Var = y25Var.a;
                        } catch (RuntimeException e) {
                            kb0.t("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        w30Var = y25Var.c;
                        w30Var.getClass();
                    }
                    y25Var.a(w30Var, s91Var);
                    try {
                        y25Var.l(z);
                    } catch (RuntimeException e2) {
                        kb0.t("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    y25Var.d = i2;
                }
                this.r0 -= c - y25Var.c();
            }
            this.A0 = -9223372036854775807L;
        }
    }

    public final void h0(boolean z) {
        this.h0 = z;
        Q();
        if (this.i0 && A()) {
            W(true);
            u(false);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        k46 k46Var;
        int i;
        pr3 pr3Var;
        jw3 jw3Var;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = message.arg2;
                    this.f0.a(1);
                    B0(this.W.c(this.e0.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    X((ez1) message.obj);
                    break;
                case 4:
                    i0((rn4) message.obj);
                    break;
                case 5:
                    this.Y = (if5) message.obj;
                    break;
                case 6:
                    w0(false, true);
                    break;
                case 7:
                    L((nv0) message.obj);
                    return true;
                case 8:
                    w((or3) message.obj);
                    break;
                case 9:
                    s((or3) message.obj);
                    break;
                case 10:
                    this.A.i((hh6) message.obj);
                    O();
                    break;
                case 11:
                    k0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    n0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    e0(z3, (nv0) message.obj);
                    break;
                case 14:
                    Z((lp4) message.obj);
                    break;
                case 15:
                    a0((lp4) message.obj);
                    break;
                case 16:
                    rn4 rn4Var = (rn4) message.obj;
                    x(rn4Var, rn4Var.a, true, false);
                    break;
                case 17:
                    g0((az1) message.obj);
                    break;
                case 18:
                    b((az1) message.obj, message.arg1);
                    break;
                case 19:
                    J((bz1) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (lo5) message.obj);
                    break;
                case 21:
                    o0((lo5) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    h0(z4);
                    break;
                case 24:
                    if (message.arg1 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.X = z5;
                    break;
                case 25:
                    O();
                    W(true);
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    A0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    j0((ay1) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    r0(pair.first, (nv0) pair.second);
                    break;
                case 31:
                    ru ruVar = (ru) message.obj;
                    if (message.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c0(ruVar, z6);
                    break;
                case 32:
                    s0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    q0((ms6) message.obj);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                    l0(((Boolean) message.obj).booleanValue());
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                    this.b0 = false;
                    ez1 ez1Var = this.c0;
                    if (ez1Var != null) {
                        X(ez1Var);
                        this.c0 = null;
                        break;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    m0((sd5) message.obj);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                    f0((yy1) message.obj);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                    d0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (bj4 e) {
            boolean z7 = e.x;
            byte b = e.y;
            if (b == 1) {
                if (z7) {
                    i2 = 3001;
                } else {
                    i2 = 3003;
                }
            } else {
                if (b == 4) {
                    if (z7) {
                        i2 = 3002;
                    } else {
                        i2 = 3004;
                    }
                }
                t(i3, e);
            }
            i3 = i2;
            t(i3, e);
        } catch (RuntimeException e2) {
            if ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) {
                i3 = 1004;
            }
            yx1 yx1Var = new yx1(2, e2, i3);
            kb0.t("ExoPlayerImplInternal", "Playback error", yx1Var);
            w0(true, false);
            this.e0 = this.e0.f(yx1Var);
        } catch (pp1 e3) {
            t(e3.x, e3);
        } catch (s41 e4) {
            t(e4.x, e4);
        } catch (s50 e5) {
            t(1002, e5);
        } catch (IOException e6) {
            t(2000, e6);
        } catch (yx1 e7) {
            e = e7;
            byte b2 = e.z;
            rr3 rr3Var = this.N;
            if (b2 == 1 && e.E == null) {
                y25 y25Var = this.x[e.B];
                pr3 pr3Var2 = rr3Var.i;
                while (pr3Var2 != null && !y25Var.i(pr3Var2)) {
                    pr3Var2 = pr3Var2.m;
                }
                if (pr3Var2 == null) {
                    pr3Var2 = rr3Var.d();
                }
                if (pr3Var2 != null) {
                    e = e.a(pr3Var2.g.a);
                }
            }
            int i5 = e.B;
            byte b3 = e.z;
            k46 k46Var2 = this.D;
            if (b3 == 1 && (jw3Var = e.E) != null && B(i5, jw3Var)) {
                this.B0 = true;
                h();
                pr3 k = rr3Var.k(i5);
                pr3 pr3Var3 = rr3Var.i;
                if (pr3Var3 != k) {
                    while (pr3Var3 != null) {
                        pr3 pr3Var4 = pr3Var3.m;
                        if (pr3Var4 == k) {
                            break;
                        }
                        pr3Var3 = pr3Var4;
                    }
                }
                rr3Var.s(pr3Var3);
                if (this.e0.e != 4) {
                    D();
                    k46Var2.j(2);
                }
            } else {
                yx1 yx1Var2 = this.x0;
                if (yx1Var2 != null) {
                    yx1Var2.addSuppressed(e);
                    e = this.x0;
                }
                if (e.z == 1 && rr3Var.i != rr3Var.f()) {
                    pr3 pr3Var5 = rr3Var.i;
                    while (pr3Var5 != null && !pr3Var5.g.a.equals(e.E)) {
                        pr3Var5 = pr3Var5.m;
                    }
                    if (pr3Var5 == null) {
                        pr3Var5 = rr3Var.d();
                    }
                    while (true) {
                        pr3Var = rr3Var.i;
                        if (pr3Var == pr3Var5) {
                            break;
                        }
                        rr3Var.a();
                    }
                    io3.v(pr3Var);
                    F(message.what);
                    qr3 qr3Var = pr3Var.g;
                    jw3 jw3Var2 = qr3Var.a;
                    long j = qr3Var.b;
                    k46Var = k46Var2;
                    this.e0 = y(jw3Var2, j, qr3Var.d, j, true, 0);
                } else {
                    k46Var = k46Var2;
                }
                if (e.F && (this.x0 == null || (i = e.x) == 5004 || i == 5003)) {
                    kb0.P("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.x0 == null) {
                        this.x0 = e;
                    }
                    j46 c = k46Var.c(25, e);
                    Handler handler = k46Var.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    kb0.t("ExoPlayerImplInternal", "Playback error", e);
                    w0(true, false);
                    this.e0 = this.e0.f(e);
                }
            }
        }
        F(message.what);
        return true;
    }

    public final void i(int i) {
        y25[] y25VarArr = this.x;
        int c = y25VarArr[i].c();
        y25 y25Var = y25VarArr[i];
        w30 w30Var = y25Var.a;
        s91 s91Var = this.J;
        y25Var.a(w30Var, s91Var);
        w30 w30Var2 = y25Var.c;
        if (w30Var2 != null) {
            int i2 = y25Var.d;
            boolean z = true;
            if (i2 != 5 && i2 != 1 && i2 != 3) {
                z = false;
            }
            y25Var.a(w30Var2, s91Var);
            y25Var.l(false);
            if (z) {
                w30 w30Var3 = y25Var.a;
                w30Var2.getClass();
                w30Var2.c(17, w30Var3);
            }
        }
        y25Var.d = 0;
        H(i, false);
        this.r0 -= c;
    }

    public final void i0(rn4 rn4Var) {
        this.D.i(16);
        s91 s91Var = this.J;
        s91Var.b(rn4Var);
        rn4 e = s91Var.e();
        x(e, e.a, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0449, code lost:
    
        if (defpackage.y25.k(r8) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x08da, code lost:
    
        if (r5 >= r4.c) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0311, code lost:
    
        if ((((float) (r4.e() - r30.t0)) / r30.J.e().a) > r18) goto L273;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0665  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 2595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.j():void");
    }

    public final void j0(ay1 ay1Var) {
        this.z0 = ay1Var;
        kf6 kf6Var = this.e0.a;
        rr3 rr3Var = this.N;
        rr3Var.getClass();
        ay1Var.getClass();
        if (!rr3Var.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < rr3Var.q.size(); i++) {
                ((pr3) rr3Var.q.get(i)).i();
            }
            rr3Var.q = arrayList;
            rr3Var.m = null;
            rr3Var.p();
        }
    }

    public final void k(pr3 pr3Var, int i, boolean z, long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        y25 y25Var = this.x[i];
        boolean j2 = y25Var.j();
        w30 w30Var = y25Var.a;
        if (!j2) {
            if (pr3Var == this.N.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            jh6 jh6Var = pr3Var.o;
            x25 x25Var = ((x25[]) jh6Var.y)[i];
            jz1 jz1Var = ((jz1[]) jh6Var.z)[i];
            if (t0() && this.e0.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.r0++;
            g95 g95Var = pr3Var.c[i];
            long j3 = pr3Var.p;
            jw3 jw3Var = pr3Var.g.a;
            w30 w30Var2 = y25Var.c;
            if (jz1Var != null) {
                i2 = jz1Var.length();
            } else {
                i2 = 0;
            }
            ea2[] ea2VarArr = new ea2[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jz1Var.getClass();
                ea2VarArr[i3] = jz1Var.h(i3);
            }
            int i4 = y25Var.d;
            s91 s91Var = this.J;
            if (i4 != 0 && i4 != 2 && i4 != 5) {
                y25Var.f = true;
                w30Var2.getClass();
                if (w30Var2.E == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                io3.B(z6);
                w30Var2.A = x25Var;
                w30Var2.N = jw3Var;
                w30Var2.E = (byte) 1;
                w30Var2.q(z4, z2);
                w30Var2.A(ea2VarArr, g95Var, j, j3, jw3Var);
                w30Var2.B(j, z4, true);
                s91Var.a(w30Var2);
            } else {
                y25Var.e = true;
                if (w30Var.E == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                io3.B(z5);
                w30Var.A = x25Var;
                w30Var.N = jw3Var;
                w30Var.E = (byte) 1;
                w30Var.q(z4, z2);
                w30Var.A(ea2VarArr, g95Var, j, j3, jw3Var);
                w30Var.B(j, z4, true);
                s91Var.a(w30Var);
            }
            zy1 zy1Var = new zy1(this);
            w30 d = y25Var.d(pr3Var);
            d.getClass();
            d.c(11, zy1Var);
            if (z3 && z2) {
                y25Var.p();
            }
        }
    }

    public final void k0(int i) {
        this.m0 = i;
        kf6 kf6Var = this.e0.a;
        rr3 rr3Var = this.N;
        rr3Var.g = i;
        int w = rr3Var.w(kf6Var);
        if ((w & 1) != 0) {
            W(true);
        } else if ((w & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j) {
        y25[] y25VarArr;
        fz1 fz1Var;
        long j2;
        io3.B(!A());
        pr3 d = this.N.d();
        jh6 jh6Var = d.o;
        int i = 0;
        while (true) {
            y25VarArr = this.x;
            if (i >= y25VarArr.length) {
                break;
            }
            if (!jh6Var.d(i)) {
                y25VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < y25VarArr.length) {
            if (jh6Var.d(i2) && !y25VarArr[i2].i(d)) {
                fz1Var = this;
                j2 = j;
                fz1Var.k(d, i2, zArr[i2], j2);
            } else {
                fz1Var = this;
                j2 = j;
            }
            i2++;
            this = fz1Var;
            j = j2;
        }
    }

    public final void l0(boolean z) {
        if (!z) {
            ez1 ez1Var = this.c0;
            k46 k46Var = this.D;
            if (ez1Var != null && this.b0 && !k46Var.a.hasMessages(37)) {
                this.d0++;
            }
            int i = this.d0;
            if (i > 0) {
                this.U.f(new p0(this, i));
            }
            this.d0 = 0;
            this.b0 = false;
            k46Var.i(37);
            ez1 ez1Var2 = this.c0;
            if (ez1Var2 != null) {
                X(ez1Var2);
                this.c0 = null;
                this.b0 = false;
            }
        }
        this.a0 = z;
        c();
    }

    public final long m(kf6 kf6Var, Object obj, long j) {
        hf6 hf6Var = this.H;
        int i = kf6Var.g(obj, hf6Var).c;
        jf6 jf6Var = this.G;
        kf6Var.n(i, jf6Var);
        if (jf6Var.f == -9223372036854775807L || !jf6Var.a() || !jf6Var.i) {
            return -9223372036854775807L;
        }
        return eq6.U(eq6.F(jf6Var.g) - jf6Var.f) - (j + hf6Var.e);
    }

    public final void m0(sd5 sd5Var) {
        this.Z = sd5Var;
        c();
    }

    public final Pair n(kf6 kf6Var) {
        long j = 0;
        if (kf6Var.p()) {
            return Pair.create(qn4.u, 0L);
        }
        int a = kf6Var.a(this.n0);
        Pair i = kf6Var.i(this.G, this.H, a, -9223372036854775807L);
        jw3 u = this.N.u(this.e0, kf6Var, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            hf6 hf6Var = this.H;
            kf6Var.g(obj, hf6Var);
            if (u.c == hf6Var.e(u.b)) {
                hf6Var.g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void n0(boolean z) {
        this.n0 = z;
        kf6 kf6Var = this.e0.a;
        rr3 rr3Var = this.N;
        rr3Var.h = z;
        int w = rr3Var.w(kf6Var);
        if ((w & 1) != 0) {
            W(true);
        } else if ((w & 2) != 0) {
            h();
        }
        u(false);
    }

    public final long o(pr3 pr3Var, int i) {
        if (pr3Var == null) {
            return 0L;
        }
        if (pr3Var.e) {
            y25[] y25VarArr = this.x;
            if (y25VarArr[i].i(pr3Var)) {
                w30 d = y25VarArr[i].d(pr3Var);
                Objects.requireNonNull(d);
                return d.J;
            }
        }
        return pr3Var.p;
    }

    public final void o0(lo5 lo5Var) {
        this.f0.a(1);
        ax3 ax3Var = this.O;
        int size = ax3Var.c.size();
        if (lo5Var.b.length != size) {
            lo5Var = new lo5(new Random(lo5Var.a.nextLong())).a(0, size);
        }
        ax3Var.k = lo5Var;
        v(ax3Var.b(), false);
    }

    public final long p(long j) {
        pr3 pr3Var = this.N.l;
        if (pr3Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.t0 - pr3Var.p));
    }

    public final void p0(int i) {
        qn4 qn4Var = this.e0;
        if (qn4Var.e != i) {
            if (i != 2) {
                this.y0 = -9223372036854775807L;
            }
            if (i != 3 && qn4Var.p) {
                qn4Var = qn4Var.i(false);
                this.e0 = qn4Var;
            }
            this.e0 = qn4Var.h(i);
        }
    }

    public final void q(int i) {
        qn4 qn4Var = this.e0;
        B0(i, qn4Var.n, qn4Var.m, qn4Var.l);
    }

    public final void q0(ms6 ms6Var) {
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.a;
            byte b = w30Var.y;
            if (b == 2 || b == 4) {
                w30Var.c(7, ms6Var);
                w30 w30Var2 = y25Var.c;
                if (w30Var2 != null) {
                    w30Var2.c(7, ms6Var);
                }
            }
        }
    }

    public final void r() {
        s0(this.C0);
    }

    public final void r0(Object obj, nv0 nv0Var) {
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.a;
            if (w30Var.y == 2) {
                int i = y25Var.d;
                if (i != 5 && i != 3 && i != 1) {
                    w30Var.c(1, obj);
                } else {
                    w30 w30Var2 = y25Var.c;
                    w30Var2.getClass();
                    w30Var2.c(1, obj);
                }
            }
        }
        int i2 = this.e0.e;
        if (i2 == 3 || i2 == 2) {
            this.D.j(2);
        }
        if (nv0Var != null) {
            nv0Var.f();
        }
    }

    public final void s(or3 or3Var) {
        rr3 rr3Var = this.N;
        pr3 pr3Var = rr3Var.l;
        if (pr3Var != null && pr3Var.a == or3Var) {
            rr3Var.r(this.t0);
            D();
            return;
        }
        pr3 pr3Var2 = rr3Var.m;
        if (pr3Var2 != null && pr3Var2.a == or3Var) {
            E();
        }
    }

    public final void s0(float f) {
        this.C0 = f;
        float f2 = f * this.W.g;
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.a;
            if (w30Var.y == 1) {
                w30Var.c(2, Float.valueOf(f2));
                w30 w30Var2 = y25Var.c;
                if (w30Var2 != null) {
                    w30Var2.c(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void t(int i, IOException iOException) {
        yx1 yx1Var = new yx1(0, iOException, i);
        pr3 pr3Var = this.N.i;
        if (pr3Var != null) {
            yx1Var = yx1Var.a(pr3Var.g.a);
        }
        kb0.t("ExoPlayerImplInternal", "Playback error", yx1Var);
        w0(false, false);
        this.e0 = this.e0.f(yx1Var);
    }

    public final boolean t0() {
        qn4 qn4Var = this.e0;
        if (qn4Var.l && qn4Var.n == 0) {
            return true;
        }
        return false;
    }

    public final void u(boolean z) {
        jw3 jw3Var;
        long d;
        pr3 pr3Var = this.N.l;
        if (pr3Var == null) {
            jw3Var = this.e0.b;
        } else {
            jw3Var = pr3Var.g.a;
        }
        boolean equals = this.e0.k.equals(jw3Var);
        if (!equals) {
            this.e0 = this.e0.c(jw3Var);
        }
        qn4 qn4Var = this.e0;
        if (pr3Var == null) {
            d = qn4Var.s;
        } else {
            d = pr3Var.d();
        }
        qn4Var.q = d;
        qn4 qn4Var2 = this.e0;
        qn4Var2.r = p(qn4Var2.q);
        if ((!equals || z) && pr3Var != null && pr3Var.e) {
            z0(pr3Var.g.a, pr3Var.o);
        }
    }

    public final boolean u0(kf6 kf6Var, jw3 jw3Var) {
        if (!jw3Var.c() && !kf6Var.p()) {
            int i = kf6Var.g(jw3Var.a, this.H).c;
            jf6 jf6Var = this.G;
            kf6Var.n(i, jf6Var);
            if (jf6Var.a() && jf6Var.i && jf6Var.f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0309, code lost:
    
        if (r6 != 2) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.kf6 r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.v(kf6, boolean):void");
    }

    public final void v0() {
        pr3 pr3Var = this.N.i;
        if (pr3Var != null) {
            jh6 jh6Var = pr3Var.o;
            int i = 0;
            while (true) {
                y25[] y25VarArr = this.x;
                if (i < y25VarArr.length) {
                    if (jh6Var.d(i)) {
                        y25VarArr[i].p();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void w(or3 or3Var) {
        pr3 pr3Var;
        fz1 fz1Var;
        rr3 rr3Var = this.N;
        pr3 pr3Var2 = rr3Var.l;
        s91 s91Var = this.J;
        if (pr3Var2 != null && pr3Var2.a == or3Var) {
            pr3Var2.getClass();
            if (!pr3Var2.e) {
                float f = s91Var.e().a;
                qn4 qn4Var = this.e0;
                pr3Var2.f(f, qn4Var.a, qn4Var.l);
            }
            z0(pr3Var2.g.a, pr3Var2.o);
            if (pr3Var2 == rr3Var.i) {
                R(pr3Var2.g.b, true);
                io3.B(!A());
                l(new boolean[this.x.length], rr3Var.d().e());
                b0(pr3Var2);
                qn4 qn4Var2 = this.e0;
                jw3 jw3Var = qn4Var2.b;
                long j = pr3Var2.g.b;
                fz1Var = this;
                fz1Var.e0 = y(jw3Var, j, qn4Var2.c, j, false, 5);
            } else {
                fz1Var = this;
            }
            fz1Var.D();
            return;
        }
        int i = 0;
        while (true) {
            if (i < rr3Var.q.size()) {
                pr3Var = (pr3) rr3Var.q.get(i);
                if (pr3Var.a == or3Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                pr3Var = null;
                break;
            }
        }
        if (pr3Var != null) {
            io3.B(!pr3Var.e);
            float f2 = s91Var.e().a;
            qn4 qn4Var3 = this.e0;
            pr3Var.f(f2, qn4Var3.a, qn4Var3.l);
            pr3 pr3Var3 = rr3Var.m;
            if (pr3Var3 != null && pr3Var3.a == or3Var) {
                E();
            }
        }
    }

    public final void w0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.o0) {
            z3 = false;
        } else {
            z3 = true;
        }
        P(z3, false, true, false);
        this.f0.a(z2 ? 1 : 0);
        r91 r91Var = this.C;
        ConcurrentHashMap concurrentHashMap = r91Var.p;
        cp4 cp4Var = this.R;
        q91 q91Var = (q91) concurrentHashMap.get(cp4Var);
        if (q91Var != null) {
            int i = q91Var.a - 1;
            q91Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(cp4Var);
                r91Var.c();
            }
        }
        this.W.c(1, this.e0.l);
        p0(1);
    }

    public final void x(rn4 rn4Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f0.a(1);
            }
            this.e0 = this.e0.g(rn4Var);
        }
        float f2 = rn4Var.a;
        pr3 pr3Var = this.N.i;
        while (true) {
            i = 0;
            if (pr3Var == null) {
                break;
            }
            jz1[] jz1VarArr = (jz1[]) pr3Var.o.z;
            int length = jz1VarArr.length;
            while (i < length) {
                jz1 jz1Var = jz1VarArr[i];
                if (jz1Var != null) {
                    jz1Var.q(f2);
                }
                i++;
            }
            pr3Var = pr3Var.m;
        }
        y25[] y25VarArr = this.x;
        int length2 = y25VarArr.length;
        while (i < length2) {
            y25 y25Var = y25VarArr[i];
            float f3 = rn4Var.a;
            y25Var.a.C(f, f3);
            w30 w30Var = y25Var.c;
            if (w30Var != null) {
                w30Var.C(f, f3);
            }
            i++;
        }
    }

    public final void x0() {
        s91 s91Var = this.J;
        s91Var.C = false;
        ss3 ss3Var = s91Var.x;
        if (ss3Var.x) {
            ss3Var.a(ss3Var.m());
            ss3Var.x = false;
        }
        for (y25 y25Var : this.x) {
            w30 w30Var = y25Var.c;
            w30 w30Var2 = y25Var.a;
            if (y25.k(w30Var2)) {
                y25.b(w30Var2);
            }
            if (w30Var != null && w30Var.E != 0) {
                y25.b(w30Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [ew2, jw2] */
    public final qn4 y(jw3 jw3Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        boolean z3;
        o15 o15Var;
        pr3 pr3Var;
        boolean z4;
        boolean z5;
        if (!this.w0 && j == this.e0.s && jw3Var.equals(this.e0.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.w0 = z2;
        Q();
        qn4 qn4Var = this.e0;
        zg6 zg6Var = qn4Var.h;
        jh6 jh6Var = qn4Var.i;
        List list = qn4Var.j;
        if (this.O.l) {
            pr3 pr3Var2 = this.N.i;
            if (pr3Var2 == null) {
                zg6Var = zg6.d;
            } else {
                zg6Var = pr3Var2.n;
            }
            if (pr3Var2 == null) {
                jh6Var = this.B;
            } else {
                jh6Var = pr3Var2.o;
            }
            jz1[] jz1VarArr = (jz1[]) jh6Var.z;
            ?? ew2Var = new ew2(4);
            boolean z6 = false;
            for (jz1 jz1Var : jz1VarArr) {
                if (jz1Var != null) {
                    fy3 fy3Var = jz1Var.h(0).m;
                    if (fy3Var == null) {
                        ew2Var.c(new fy3(new ey3[0]));
                    } else {
                        ew2Var.c(fy3Var);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                o15Var = ew2Var.g();
            } else {
                z62 z62Var = nw2.y;
                o15Var = o15.B;
            }
            list = o15Var;
            if (pr3Var2 != null) {
                qr3 qr3Var = pr3Var2.g;
                if (qr3Var.d != j2) {
                    pr3Var2.g = qr3Var.a(j2);
                }
            }
            y25[] y25VarArr = this.x;
            if (!A() && (pr3Var = this.N.i) != null) {
                jh6 jh6Var2 = pr3Var.o;
                int i2 = 0;
                boolean z7 = false;
                while (true) {
                    if (i2 < y25VarArr.length) {
                        if (jh6Var2.d(i2)) {
                            if (y25VarArr[i2].a.y != 1) {
                                z4 = false;
                                break;
                            }
                            if (((x25[]) jh6Var2.y)[i2].a != 0) {
                                z7 = true;
                            }
                        }
                        i2++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z7 && z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != this.q0) {
                    this.q0 = z5;
                    if (!z5 && this.e0.p) {
                        this.D.j(2);
                    }
                }
            }
        } else if (!jw3Var.equals(qn4Var.b)) {
            zg6Var = zg6.d;
            jh6Var = this.B;
            z62 z62Var2 = nw2.y;
            list = o15.B;
        }
        jh6 jh6Var3 = jh6Var;
        List list2 = list;
        zg6 zg6Var2 = zg6Var;
        if (z) {
            cz1 cz1Var = this.f0;
            if (cz1Var.d && cz1Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                io3.n(z3);
            } else {
                cz1Var.a = true;
                cz1Var.d = true;
                cz1Var.e = i;
            }
        }
        qn4 qn4Var2 = this.e0;
        return qn4Var2.d(jw3Var, j, j2, j3, p(qn4Var2.q), zg6Var2, jh6Var3, list2);
    }

    public final void y0() {
        boolean z;
        pr3 pr3Var = this.N.l;
        if (!this.l0 && (pr3Var == null || !pr3Var.a.d())) {
            z = false;
        } else {
            z = true;
        }
        qn4 qn4Var = this.e0;
        if (z != qn4Var.g) {
            this.e0 = qn4Var.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0(defpackage.jw3 r9, defpackage.jh6 r10) {
        /*
            r8 = this;
            rr3 r0 = r8.N
            pr3 r0 = r0.l
            r0.getClass()
            long r1 = r0.d()
            r8.p(r1)
            qn4 r1 = r8.e0
            kf6 r1 = r1.a
            qr3 r0 = r0.g
            jw3 r0 = r0.a
            boolean r0 = r8.u0(r1, r0)
            if (r0 == 0) goto L20
            p91 r0 = r8.P
            long r0 = r0.h
        L20:
            qn4 r0 = r8.e0
            kf6 r0 = r0.a
            s91 r1 = r8.J
            rn4 r1 = r1.e()
            float r1 = r1.a
            qn4 r1 = r8.e0
            boolean r1 = r1.l
            java.lang.Object r10 = r10.z
            jz1[] r10 = (defpackage.jz1[]) r10
            r91 r1 = r8.C
            r1.getClass()
            rw2 r2 = r1.o
            cp4 r8 = r8.R
            java.lang.String r3 = r8.a
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = -1
            if (r2 == 0) goto L53
            int r4 = r2.intValue()
            if (r4 == r3) goto L53
            int r2 = r2.intValue()
            goto L55
        L53:
            int r2 = r1.l
        L55:
            java.util.concurrent.ConcurrentHashMap r4 = r1.p
            java.lang.Object r8 = r4.get(r8)
            q91 r8 = (defpackage.q91) r8
            r8.getClass()
            if (r2 != r3) goto Lc7
            java.lang.Object r9 = r9.a
            hf6 r2 = r1.b
            hf6 r9 = r0.g(r9, r2)
            int r9 = r9.c
            jf6 r2 = r1.a
            r3 = 0
            jf6 r9 = r0.m(r9, r2, r3)
            ar3 r9 = r9.c
            vq3 r9 = r9.b
            r0 = 0
            if (r9 != 0) goto L7d
        L7b:
            r9 = r0
            goto L92
        L7d:
            android.net.Uri r9 = r9.a
            java.lang.String r9 = r9.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L91
            o15 r2 = defpackage.r91.r
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L7b
        L91:
            r9 = 1
        L92:
            int r2 = r10.length
            r3 = r0
            r4 = r3
        L95:
            r5 = 13107200(0xc80000, float:1.8367099E-38)
            if (r3 >= r2) goto Lc1
            r6 = r10[r3]
            if (r6 == 0) goto Lbe
            yg6 r6 = r6.c()
            int r6 = r6.c
            r7 = 131072(0x20000, float:1.83671E-40)
            switch(r6) {
                case -2: goto Lbc;
                case -1: goto Lbd;
                case 0: goto Lb9;
                case 1: goto Lbd;
                case 2: goto Lb1;
                case 3: goto Lac;
                case 4: goto Lae;
                case 5: goto Lac;
                case 6: goto Lac;
                default: goto La8;
            }
        La8:
            defpackage.p65.b()
            return
        Lac:
            r5 = r7
            goto Lbd
        Lae:
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            goto Lbd
        Lb1:
            if (r9 == 0) goto Lb6
            r5 = 19660800(0x12c0000, float:3.159141E-38)
            goto Lbd
        Lb6:
            r5 = 131072000(0x7d00000, float:3.1296362E-34)
            goto Lbd
        Lb9:
            r5 = 144310272(0x89a0000, float:9.268538E-34)
            goto Lbd
        Lbc:
            r5 = r0
        Lbd:
            int r4 = r4 + r5
        Lbe:
            int r3 = r3 + 1
            goto L95
        Lc1:
            r9 = 210239488(0xc880000, float:2.0954118E-31)
            int r2 = defpackage.eq6.j(r4, r5, r9)
        Lc7:
            r8.c = r2
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.z0(jw3, jh6):void");
    }
}
