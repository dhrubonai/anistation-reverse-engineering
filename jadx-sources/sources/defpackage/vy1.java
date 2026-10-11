package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vy1 extends v30 implements ExoPlayer {
    public final qx2 A;
    public final short B;
    public final sp C;
    public final kf D;
    public final st3 E;
    public final pz2 F;
    public final pz2 G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public zw2 N;
    public final sd5 O;
    public if5 P;
    public lo5 Q;
    public go4 R;
    public jr3 S;
    public jr3 T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public gw5 X;
    public boolean Y;
    public TextureView Z;
    public final boolean a0;
    public final jh6 b;
    public sq5 b0;
    public final go4 c;
    public ru c0;
    public final nv0 d = new nv0();
    public float d0;
    public final Context e;
    public float e0;
    public final vy1 f;
    public boolean f0;
    public final w30[] g;
    public c31 g0;
    public final w30[] h;
    public final boolean h0;
    public final mb1 i;
    public boolean i0;
    public final k46 j;
    public final int j0;
    public final ey1 k;
    public boolean k0;
    public final fz1 l;
    public final rf1 l0;
    public final ui3 m;
    public hv6 m0;
    public final CopyOnWriteArraySet n;
    public final short n0;
    public final hf6 o;
    public final short o0;
    public final ArrayList p;
    public final short p0;
    public final boolean q;
    public jr3 q0;
    public final iw3 r;
    public qn4 r0;
    public final c71 s;
    public int s0;
    public final Looper t;
    public long t0;
    public final z20 u;
    public final f46 v;
    public final py1 w;
    public final qy1 x;
    public final tu y;
    public final y26 z;

    static {
        cr3.a("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b6 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a4, B:11:0x00b3, B:13:0x021f, B:14:0x0232, B:16:0x027c, B:18:0x0280, B:20:0x0284, B:24:0x028c, B:27:0x029f, B:29:0x02b6, B:30:0x02e1, B:36:0x0298), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0298 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:3:0x0017, B:6:0x0095, B:7:0x009e, B:9:0x00a4, B:11:0x00b3, B:13:0x021f, B:14:0x0232, B:16:0x027c, B:18:0x0280, B:20:0x0284, B:24:0x028c, B:27:0x029f, B:29:0x02b6, B:30:0x02e1, B:36:0x0298), top: B:2:0x0017 }] */
    /* JADX WARN: Type inference failed for: r3v11, types: [short, int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [qy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [st3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [short, int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [short, int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [short, int] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, ty1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, sp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vy1(defpackage.zx1 r35) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy1.<init>(zx1):void");
    }

    public static long p1(qn4 qn4Var) {
        jf6 jf6Var = new jf6();
        hf6 hf6Var = new hf6();
        qn4Var.a.g(qn4Var.b.a, hf6Var);
        long j = qn4Var.c;
        if (j == -9223372036854775807L) {
            return qn4Var.a.m(hf6Var.c, jf6Var, 0L).l;
        }
        return hf6Var.e + j;
    }

    public static qn4 q1(qn4 qn4Var, int i) {
        qn4 h = qn4Var.h(i);
        if (i != 1 && i != 4) {
            return h;
        }
        return h.b(false);
    }

    public final void A1() {
        go4 go4Var = this.R;
        go4 u = eq6.u(this.f, this.c);
        this.R = u;
        if (!u.equals(go4Var)) {
            this.m.c(13, new ey1(this, (byte) 4));
        }
    }

    @Override // defpackage.ko4
    public final void B0(int i, int i2, int i3) {
        boolean z;
        E1();
        if (i >= 0 && i <= i2 && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            kf6 G0 = G0();
            this.J++;
            eq6.T(arrayList, i, min, min2);
            lo5 lo5Var = this.Q;
            lo5Var.getClass();
            this.Q = lo5Var;
            hq4 hq4Var = new hq4(arrayList, this.Q);
            qn4 qn4Var = this.r0;
            qn4 r1 = r1(qn4Var, hq4Var, o1(G0, hq4Var, n1(qn4Var), l1(this.r0)));
            lo5 lo5Var2 = this.Q;
            fz1 fz1Var = this.l;
            fz1Var.getClass();
            fz1Var.D.c(19, new bz1(i, min, min2, lo5Var2)).b();
            C1(r1, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void B1(int i, boolean z) {
        int i2;
        if (this.M) {
            i2 = 4;
        } else if (this.r0.n == 1 && !z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        qn4 qn4Var = this.r0;
        if (qn4Var.l == z && qn4Var.n == i2 && qn4Var.m == i) {
            return;
        }
        this.J++;
        if (qn4Var.p) {
            qn4Var = qn4Var.a();
        }
        qn4 e = qn4Var.e(i, i2, z);
        this.l.D.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        C1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.ko4
    public final ru C() {
        E1();
        return this.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(final defpackage.qn4 r35, int r36, boolean r37, int r38, long r39, int r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy1.C1(qn4, int, boolean, int, long, int, boolean):void");
    }

    @Override // defpackage.ko4
    public final void D(int i, boolean z) {
        E1();
    }

    @Override // defpackage.ko4
    public final int D0() {
        E1();
        return this.r0.n;
    }

    public final void D1() {
        int h0 = h0();
        qx2 qx2Var = this.A;
        y26 y26Var = this.z;
        boolean z = false;
        if (h0 != 1) {
            if (h0 != 2 && h0 != 3) {
                if (h0 != 4) {
                    p65.l();
                    return;
                }
            } else {
                E1();
                boolean z2 = this.r0.p;
                if (n() && !z2) {
                    z = true;
                }
                y26Var.b(z);
                qx2Var.a(n());
                return;
            }
        }
        y26Var.b(false);
        qx2Var.a(false);
    }

    @Override // defpackage.ko4
    public final void E() {
        E1();
    }

    public final void E1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = eq6.a;
            Locale locale = Locale.US;
            String n = qx1.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.h0) {
                if (this.i0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                kb0.P("ExoPlayerImpl", n, illegalStateException);
                this.i0 = true;
                return;
            }
            ze0.m(n);
        }
    }

    @Override // defpackage.ko4
    public final void F(int i, int i2) {
        E1();
    }

    @Override // defpackage.ko4
    public final int F0() {
        E1();
        return this.H;
    }

    @Override // defpackage.ko4
    public final void G(int i) {
        E1();
    }

    @Override // defpackage.ko4
    public final kf6 G0() {
        E1();
        return this.r0.a;
    }

    @Override // defpackage.ko4
    public final int H() {
        E1();
        if (h()) {
            return this.r0.b.c;
        }
        return -1;
    }

    @Override // defpackage.ko4
    public final boolean H0() {
        E1();
        return false;
    }

    @Override // defpackage.ko4
    public final void I(SurfaceView surfaceView) {
        SurfaceHolder holder;
        E1();
        if (surfaceView instanceof gw5) {
            v1();
            this.X = (gw5) surfaceView;
            lp4 k1 = k1(this.x);
            io3.B(!k1.f);
            k1.c = (short) 10000;
            gw5 gw5Var = this.X;
            io3.B(!k1.f);
            k1.d = gw5Var;
            k1.b();
            CopyOnWriteArrayList copyOnWriteArrayList = this.X.x;
            py1 py1Var = this.w;
            copyOnWriteArrayList.add(py1Var);
            y1(this.X.getVideoSurface());
            SurfaceHolder holder2 = surfaceView.getHolder();
            this.Y = false;
            this.W = holder2;
            holder2.addCallback(py1Var);
            Surface surface = this.W.getSurface();
            if (surface != null && surface.isValid()) {
                Rect surfaceFrame = this.W.getSurfaceFrame();
                t1(surfaceFrame.width(), surfaceFrame.height());
                return;
            } else {
                t1(0, 0);
                return;
            }
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        T(holder);
    }

    @Override // defpackage.ko4
    public final Looper J0() {
        return this.t;
    }

    @Override // defpackage.ko4
    public final sq5 K() {
        E1();
        return this.b0;
    }

    @Override // defpackage.ko4
    public final int K0() {
        E1();
        return ((Integer) this.C.d()).intValue();
    }

    @Override // defpackage.ko4
    public final void L(hh6 hh6Var) {
        hh6 hh6Var2;
        E1();
        mb1 mb1Var = this.i;
        mb1Var.getClass();
        hh6 P0 = P0();
        if (this.M) {
            this.N = hh6Var.I;
            zw2 zw2Var = this.O.a;
            gh6 a = hh6Var.a();
            ho6 i = zw2Var.i();
            while (i.hasNext()) {
                a.m(((Integer) i.next()).intValue(), true);
            }
            hh6Var2 = a.b();
        } else {
            hh6Var2 = hh6Var;
        }
        if (!hh6Var2.equals(mb1Var.e)) {
            mb1Var.o(hh6Var2);
        }
        if (!P0.equals(hh6Var)) {
            this.m.g(19, new iy1(hh6Var, (byte) 0));
        }
    }

    @Override // defpackage.ko4
    public final void L0() {
        E1();
        if (this.d0 != 0.0f) {
            U(0.0f);
        }
    }

    @Override // defpackage.ko4
    public final void N0() {
        E1();
    }

    @Override // defpackage.ko4
    public final boolean O0() {
        E1();
        return this.I;
    }

    @Override // defpackage.ko4
    public final hh6 P0() {
        E1();
        hb1 hb1Var = this.i.e;
        if (this.M) {
            hb1Var.getClass();
            gb1 gb1Var = new gb1(hb1Var);
            gb1Var.n(this.N);
            return new hb1(gb1Var);
        }
        return hb1Var;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long Q0() {
        E1();
        if (this.r0.a.p()) {
            return this.t0;
        }
        qn4 qn4Var = this.r0;
        long j = 0;
        if (qn4Var.k.d != qn4Var.b.d) {
            return eq6.l0(qn4Var.a.m(s0(), this.a, 0L).m);
        }
        long j2 = qn4Var.q;
        if (this.r0.k.c()) {
            qn4 qn4Var2 = this.r0;
            qn4Var2.a.g(qn4Var2.k.a, this.o).d(this.r0.k.b);
        } else {
            j = j2;
        }
        qn4 qn4Var3 = this.r0;
        kf6 kf6Var = qn4Var3.a;
        Object obj = qn4Var3.k.a;
        hf6 hf6Var = this.o;
        kf6Var.g(obj, hf6Var);
        return eq6.l0(j + hf6Var.e);
    }

    @Override // defpackage.ko4
    public final void R(int i, int i2) {
        boolean z;
        E1();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            qn4 u1 = u1(this.r0, i, min);
            C1(u1, 0, !u1.b.a.equals(this.r0.b.a), 4, m1(u1), -1, false);
        }
    }

    @Override // defpackage.ko4
    public final void R0(int i) {
        E1();
    }

    @Override // defpackage.ko4
    public final void S() {
        E1();
        v1();
        y1(null);
        t1(0, 0);
    }

    @Override // defpackage.ko4
    public final void T(SurfaceHolder surfaceHolder) {
        E1();
        if (surfaceHolder == null) {
            S();
            return;
        }
        v1();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            y1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            t1(surfaceFrame.width(), surfaceFrame.height());
        } else {
            y1(null);
            t1(0, 0);
        }
    }

    @Override // defpackage.ko4
    public final void U(float f) {
        E1();
        float i = eq6.i(f, 0.0f, 1.0f);
        float f2 = this.d0;
        if (f2 == i) {
            return;
        }
        if (i != 0.0f) {
            f2 = i;
        }
        this.e0 = f2;
        this.d0 = i;
        this.l.D.c(32, Float.valueOf(i)).b();
        this.m.g(22, new ky1(i, (byte) 0));
    }

    @Override // defpackage.ko4
    public final void U0(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        E1();
        if (textureView == null) {
            S();
            return;
        }
        v1();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kb0.O("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            y1(null);
            t1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            y1(surface);
            this.V = surface;
            t1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.ko4
    public final void W(List list, int i, long j) {
        E1();
        ArrayList j1 = j1(list);
        E1();
        x1(j1, i, j, false);
    }

    @Override // defpackage.ko4
    public final jr3 W0() {
        E1();
        return this.S;
    }

    @Override // defpackage.ko4
    public final yx1 X() {
        E1();
        return this.r0.f;
    }

    @Override // defpackage.ko4
    public final void X0(List list) {
        E1();
        ArrayList j1 = j1(list);
        E1();
        x1(j1, -1, -9223372036854775807L, true);
    }

    @Override // defpackage.ko4
    public final void Y(boolean z) {
        E1();
        B1(1, z);
    }

    @Override // defpackage.ko4
    public final void Y0(SurfaceHolder surfaceHolder) {
        E1();
        if (surfaceHolder != null && surfaceHolder == this.W) {
            S();
        }
    }

    @Override // defpackage.ko4
    public final long Z0() {
        E1();
        return eq6.l0(m1(this.r0));
    }

    @Override // defpackage.ko4
    public final void a() {
        int i;
        E1();
        qn4 qn4Var = this.r0;
        if (qn4Var.e != 1) {
            return;
        }
        qn4 f = qn4Var.f(null);
        if (f.a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        qn4 q1 = q1(f, i);
        this.J++;
        this.l.D.a(29).b();
        C1(q1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.ko4
    public final long a0() {
        E1();
        return this.o0;
    }

    @Override // defpackage.ko4
    public final long a1() {
        E1();
        return this.n0;
    }

    @Override // defpackage.ko4
    public final void b(rn4 rn4Var) {
        E1();
        if (rn4Var == null) {
            rn4Var = rn4.d;
        }
        if (this.r0.o.equals(rn4Var)) {
            return;
        }
        qn4 g = this.r0.g(rn4Var);
        this.J++;
        this.l.D.c(4, rn4Var).b();
        C1(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long b0() {
        E1();
        return l1(this.r0);
    }

    @Override // defpackage.ko4
    public final void c0(int i, List list) {
        boolean z;
        boolean z2;
        E1();
        ArrayList j1 = j1(list);
        E1();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int min = Math.min(i, this.p.size());
        if (this.r0.a.p()) {
            if (this.s0 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            E1();
            x1(j1, -1, -9223372036854775807L, z2);
            return;
        }
        C1(h1(this.r0, min, j1), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.ko4
    public final boolean d() {
        E1();
        return this.r0.g;
    }

    @Override // defpackage.ko4
    public final void d0() {
        E1();
        if (this.d0 == 0.0f) {
            float f = this.e0;
            if (f != 0.0f) {
                U(f);
            }
        }
    }

    @Override // defpackage.ko4
    public final rn4 e() {
        E1();
        return this.r0.o;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long e0() {
        E1();
        if (h()) {
            qn4 qn4Var = this.r0;
            if (qn4Var.k.equals(qn4Var.b)) {
                return eq6.l0(this.r0.q);
            }
            return getDuration();
        }
        return Q0();
    }

    @Override // defpackage.ko4
    public final int f() {
        E1();
        return 0;
    }

    @Override // defpackage.v30
    public final void f1(int i, int i2, long j, boolean z) {
        boolean z2;
        E1();
        if (i != -1) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.n(z2);
            kf6 kf6Var = this.r0.a;
            if (!kf6Var.p() && i >= kf6Var.o()) {
                return;
            }
            c71 c71Var = this.s;
            if (!c71Var.i) {
                q7 W = c71Var.W();
                c71Var.i = true;
                c71Var.b0(W, -1, new y61((byte) 22));
            }
            this.J++;
            if (h()) {
                kb0.O("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                cz1 cz1Var = new cz1(this.r0);
                cz1Var.a(1);
                vy1 vy1Var = this.k.y;
                vy1Var.j.f(new gb(vy1Var, cz1Var, (byte) 28));
                return;
            }
            qn4 qn4Var = this.r0;
            int i3 = qn4Var.e;
            if (i3 == 3 || (i3 == 4 && !kf6Var.p())) {
                qn4Var = this.r0.h(2);
            }
            int s0 = s0();
            qn4 r1 = r1(qn4Var, kf6Var, s1(kf6Var, i, j));
            this.l.D.c(3, new ez1(kf6Var, i, eq6.U(j))).b();
            C1(r1, 0, true, 1, m1(r1), s0, z);
        }
    }

    @Override // defpackage.ko4
    public final void g(Surface surface) {
        int i;
        E1();
        v1();
        y1(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        t1(i, i);
    }

    @Override // defpackage.ko4
    public final rf1 getDeviceInfo() {
        E1();
        return this.l0;
    }

    @Override // defpackage.v30, defpackage.ko4
    public final long getDuration() {
        E1();
        if (h()) {
            qn4 qn4Var = this.r0;
            jw3 jw3Var = qn4Var.b;
            kf6 kf6Var = qn4Var.a;
            Object obj = jw3Var.a;
            hf6 hf6Var = this.o;
            kf6Var.g(obj, hf6Var);
            return eq6.l0(hf6Var.a(jw3Var.b, jw3Var.c));
        }
        return w();
    }

    @Override // defpackage.ko4
    public final float getVolume() {
        E1();
        return this.d0;
    }

    @Override // defpackage.ko4
    public final boolean h() {
        E1();
        return this.r0.b.c();
    }

    @Override // defpackage.ko4
    public final int h0() {
        E1();
        return this.r0.e;
    }

    public final qn4 h1(qn4 qn4Var, int i, ArrayList arrayList) {
        kf6 kf6Var = qn4Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i2 < size) {
                zw3 zw3Var = new zw3((lw3) arrayList.get(i2), this.q);
                arrayList2.add(zw3Var);
                arrayList3.add(i2 + i, new ry1(zw3Var.b, zw3Var.a));
                i2++;
            } else {
                this.Q = this.Q.a(i, arrayList2.size());
                hq4 hq4Var = new hq4(arrayList3, this.Q);
                qn4 r1 = r1(qn4Var, hq4Var, o1(kf6Var, hq4Var, n1(qn4Var), l1(qn4Var)));
                this.l.D.d(new az1(arrayList2, this.Q, -1, -9223372036854775807L), 18, i, 0).b();
                return r1;
            }
        }
    }

    @Override // defpackage.ko4
    public final void i0(int i) {
        E1();
    }

    public final jr3 i1() {
        kf6 G0 = G0();
        if (G0.p()) {
            return this.q0;
        }
        ar3 ar3Var = G0.m(s0(), this.a, 0L).c;
        hr3 a = this.q0.a();
        a.b(ar3Var.d);
        return new jr3(a);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        E1();
        return this.M;
    }

    @Override // defpackage.ko4
    public final long j() {
        E1();
        return eq6.l0(this.r0.r);
    }

    @Override // defpackage.ko4
    public final qh6 j0() {
        E1();
        return (qh6) this.r0.i.A;
    }

    public final ArrayList j1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.e((ar3) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.ko4
    public final jr3 k0() {
        E1();
        return this.T;
    }

    public final lp4 k1(kp4 kp4Var) {
        int n1 = n1(this.r0);
        kf6 kf6Var = this.r0.a;
        if (n1 == -1) {
            n1 = 0;
        }
        fz1 fz1Var = this.l;
        return new lp4(fz1Var, kp4Var, kf6Var, n1, fz1Var.F);
    }

    @Override // defpackage.ko4
    public final go4 l() {
        E1();
        return this.R;
    }

    public final long l1(qn4 qn4Var) {
        jw3 jw3Var = qn4Var.b;
        long j = qn4Var.c;
        kf6 kf6Var = qn4Var.a;
        if (jw3Var.c()) {
            Object obj = qn4Var.b.a;
            hf6 hf6Var = this.o;
            kf6Var.g(obj, hf6Var);
            if (j == -9223372036854775807L) {
                return eq6.l0(kf6Var.m(n1(qn4Var), this.a, 0L).l);
            }
            return eq6.l0(j) + eq6.l0(hf6Var.e);
        }
        return eq6.l0(m1(qn4Var));
    }

    @Override // defpackage.ko4
    public final c31 m0() {
        E1();
        return this.g0;
    }

    public final long m1(qn4 qn4Var) {
        long j;
        if (qn4Var.a.p()) {
            return eq6.U(this.t0);
        }
        if (qn4Var.p) {
            j = qn4Var.l();
        } else {
            j = qn4Var.s;
        }
        if (qn4Var.b.c()) {
            return j;
        }
        kf6 kf6Var = qn4Var.a;
        Object obj = qn4Var.b.a;
        hf6 hf6Var = this.o;
        kf6Var.g(obj, hf6Var);
        return j + hf6Var.e;
    }

    @Override // defpackage.ko4
    public final boolean n() {
        E1();
        return this.r0.l;
    }

    @Override // defpackage.ko4
    public final void n0(ru ruVar, boolean z) {
        E1();
        if (this.k0) {
            return;
        }
        boolean equals = Objects.equals(this.c0, ruVar);
        ui3 ui3Var = this.m;
        if (!equals) {
            this.c0 = ruVar;
            w1(1, 3, ruVar);
            ui3Var.c(20, new h5((Object) ruVar, (byte) 17));
        }
        this.l.D.d(this.c0, 31, z ? 1 : 0, 0).b();
        ui3Var.b();
    }

    public final int n1(qn4 qn4Var) {
        if (qn4Var.a.p()) {
            return this.s0;
        }
        return qn4Var.a.g(qn4Var.b.a, this.o).c;
    }

    @Override // defpackage.ko4
    public final void o0(jr3 jr3Var) {
        E1();
        jr3Var.getClass();
        if (jr3Var.equals(this.T)) {
            return;
        }
        this.T = jr3Var;
        this.m.g(15, new ey1(this, (byte) 0));
    }

    public final Pair o1(kf6 kf6Var, hq4 hq4Var, int i, long j) {
        boolean z;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (!kf6Var.p() && !hq4Var.p()) {
            hf6 hf6Var = this.o;
            long U = eq6.U(j);
            jf6 jf6Var = this.a;
            Pair i3 = kf6Var.i(jf6Var, hf6Var, i, U);
            Object obj = i3.first;
            if (hq4Var.b(obj) != -1) {
                return i3;
            }
            int U2 = fz1.U(jf6Var, this.o, this.H, this.I, obj, kf6Var, hq4Var);
            if (U2 != -1) {
                hq4Var.m(U2, jf6Var, 0L);
                return s1(hq4Var, U2, eq6.l0(jf6Var.l));
            }
            return s1(hq4Var, -1, -9223372036854775807L);
        }
        if (!kf6Var.p() && hq4Var.p()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = i;
        }
        if (!z) {
            j2 = j;
        }
        return s1(hq4Var, i2, j2);
    }

    @Override // defpackage.ko4
    public final void p(Surface surface) {
        E1();
        if (surface == this.U) {
            S();
        }
    }

    @Override // defpackage.ko4
    public final void r(boolean z) {
        E1();
        if (this.I != z) {
            this.I = z;
            this.l.D.b(12, z ? 1 : 0, 0).b();
            jy1 jy1Var = new jy1((byte) 0, z);
            ui3 ui3Var = this.m;
            ui3Var.c(9, jy1Var);
            A1();
            ui3Var.b();
        }
    }

    @Override // defpackage.ko4
    public final int r0() {
        E1();
        if (h()) {
            return this.r0.b.b;
        }
        return -1;
    }

    public final qn4 r1(qn4 qn4Var, kf6 kf6Var, Pair pair) {
        boolean z;
        jw3 jw3Var;
        zg6 zg6Var;
        jh6 jh6Var;
        List list;
        long j;
        if (!kf6Var.p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        kf6 kf6Var2 = qn4Var.a;
        long l1 = l1(qn4Var);
        qn4 j2 = qn4Var.j(kf6Var);
        if (kf6Var.p()) {
            jw3 jw3Var2 = qn4.u;
            long U = eq6.U(this.t0);
            zg6 zg6Var2 = zg6.d;
            jh6 jh6Var2 = this.b;
            z62 z62Var = nw2.y;
            qn4 c = j2.d(jw3Var2, U, U, U, 0L, zg6Var2, jh6Var2, o15.B).c(jw3Var2);
            c.q = c.s;
            return c;
        }
        Object obj = j2.b.a;
        String str = eq6.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            jw3Var = new jw3(pair.first);
        } else {
            jw3Var = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long U2 = eq6.U(l1);
        if (!kf6Var2.p()) {
            U2 -= kf6Var2.g(obj, this.o).e;
            if (equals && U2 - longValue == 1 && U2 == kf6Var2.g(obj, this.o).d) {
                U2--;
            }
        }
        if (!equals || longValue < U2) {
            jw3 jw3Var3 = jw3Var;
            io3.B(!jw3Var3.c());
            if (!equals) {
                zg6Var = zg6.d;
            } else {
                zg6Var = j2.h;
            }
            zg6 zg6Var3 = zg6Var;
            if (!equals) {
                jh6Var = this.b;
            } else {
                jh6Var = j2.i;
            }
            jh6 jh6Var3 = jh6Var;
            if (!equals) {
                z62 z62Var2 = nw2.y;
                list = o15.B;
            } else {
                list = j2.j;
            }
            qn4 c2 = j2.d(jw3Var3, longValue, longValue, longValue, 0L, zg6Var3, jh6Var3, list).c(jw3Var3);
            c2.q = longValue;
            return c2;
        }
        if (longValue == U2) {
            int b = kf6Var.b(j2.k.a);
            if (b != -1 && kf6Var.f(b, this.o, false).c == kf6Var.g(jw3Var.a, this.o).c) {
                return j2;
            }
            kf6Var.g(jw3Var.a, this.o);
            boolean c3 = jw3Var.c();
            hf6 hf6Var = this.o;
            if (c3) {
                j = hf6Var.a(jw3Var.b, jw3Var.c);
            } else {
                j = hf6Var.d;
            }
            jw3 jw3Var4 = jw3Var;
            qn4 c4 = j2.d(jw3Var4, j2.s, j2.s, j2.d, j - j2.s, j2.h, j2.i, j2.j).c(jw3Var4);
            c4.q = j;
            return c4;
        }
        jw3 jw3Var5 = jw3Var;
        io3.B(!jw3Var5.c());
        long max = Math.max(0L, j2.r - (longValue - U2));
        long j3 = j2.q;
        if (j2.k.equals(j2.b)) {
            j3 = longValue + max;
        }
        qn4 d = j2.d(jw3Var5, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
        d.q = j3;
        return d;
    }

    @Override // defpackage.ko4
    public final void release() {
        boolean z;
        Context context;
        kb0.B("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "] [" + cr3.b() + "]");
        E1();
        this.y.f();
        boolean z2 = false;
        this.z.b(false);
        this.A.a(false);
        st3 st3Var = this.E;
        if (st3Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) st3Var.x).get()) != null) {
            context.unregisterDeviceIdChangeListener((ty1) st3Var.y);
        }
        kf kfVar = this.D;
        ((k46) kfVar.D).h();
        ((vy1) kfVar.y).w0((g06) kfVar.z);
        fz1 fz1Var = this.l;
        if (!fz1Var.g0 && fz1Var.F.getThread().isAlive()) {
            fz1Var.g0 = true;
            nv0 nv0Var = new nv0(fz1Var.L);
            fz1Var.D.c(7, nv0Var).b();
            z = nv0Var.c(fz1Var.Q);
        } else {
            z = true;
        }
        if (!z) {
            this.m.g(10, new v71((byte) 21));
        }
        this.m.d();
        this.j.h();
        this.u.f(this.s);
        qn4 qn4Var = this.r0;
        if (qn4Var.p) {
            qn4Var = qn4Var.a();
            this.r0 = qn4Var;
        }
        qn4 q1 = q1(qn4Var, 1);
        this.r0 = q1;
        qn4 c = q1.c(q1.b);
        this.r0 = c;
        c.q = c.s;
        this.r0.r = 0L;
        c71 c71Var = this.s;
        k46 k46Var = c71Var.h;
        k46Var.getClass();
        k46Var.f(new p0((Object) c71Var, (byte) 11));
        v1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        this.g0 = c31.d;
        this.k0 = true;
        if (!this.r0.a.p()) {
            qn4 qn4Var2 = this.r0;
            if (qn4Var2.a.b(qn4Var2.b.a) != -1) {
                z2 = true;
            }
            Locale locale = Locale.US;
            qn4 qn4Var3 = this.r0;
            io3.A(String.format(locale, "periodUid %s not found in timeline %s with size %d", qn4Var3.b.a, qn4Var3.a.getClass().getName(), Integer.valueOf(this.r0.a.o())), z2);
        }
    }

    @Override // defpackage.ko4
    public final int s0() {
        E1();
        int n1 = n1(this.r0);
        if (n1 == -1) {
            return 0;
        }
        return n1;
    }

    public final Pair s1(kf6 kf6Var, int i, long j) {
        if (kf6Var.p()) {
            this.s0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.t0 = j;
            return null;
        }
        jf6 jf6Var = this.a;
        if (i == -1 || i >= kf6Var.o()) {
            i = kf6Var.a(this.I);
            j = eq6.l0(kf6Var.m(i, jf6Var, 0L).l);
        }
        return kf6Var.i(jf6Var, this.o, i, eq6.U(j));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        E1();
        w1(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        hh6 hh6Var;
        E1();
        if (z == this.M) {
            return;
        }
        this.M = z;
        sd5 sd5Var = this.O;
        if (!sd5Var.a.isEmpty()) {
            mb1 mb1Var = this.i;
            mb1Var.getClass();
            hb1 hb1Var = mb1Var.e;
            if (z) {
                this.N = hb1Var.I;
                zw2 zw2Var = sd5Var.a;
                gh6 a = hb1Var.a();
                ho6 i = zw2Var.i();
                while (i.hasNext()) {
                    a.m(((Integer) i.next()).intValue(), true);
                }
                hh6Var = a.b();
            } else {
                hb1Var.getClass();
                gb1 gb1Var = new gb1(hb1Var);
                gb1Var.n(this.N);
                hb1 hb1Var2 = new hb1(gb1Var);
                this.N = null;
                hh6Var = hb1Var2;
            }
            if (!hh6Var.equals(hb1Var)) {
                mb1Var.o(hh6Var);
            }
        }
        this.l.D.c(36, Boolean.valueOf(z)).b();
        qn4 qn4Var = this.r0;
        B1(qn4Var.m, qn4Var.l);
    }

    @Override // defpackage.ko4
    public final void stop() {
        E1();
        z1(null);
        z62 z62Var = nw2.y;
        this.g0 = new c31(this.r0.s, o15.B);
    }

    public final void t1(int i, int i2) {
        sq5 sq5Var = this.b0;
        if (i == sq5Var.a && i2 == sq5Var.b) {
            return;
        }
        this.b0 = new sq5(i, i2);
        this.m.g(24, new gy1(i, i2, (byte) 0));
        w1(2, 14, new sq5(i, i2));
    }

    @Override // defpackage.ko4
    public final long u() {
        E1();
        return this.p0;
    }

    @Override // defpackage.ko4
    public final void u0(int i) {
        E1();
        if (this.H != i) {
            this.H = i;
            this.l.D.b(11, i, 0).b();
            x61 x61Var = new x61(i, (byte) 2);
            ui3 ui3Var = this.m;
            ui3Var.c(8, x61Var);
            A1();
            ui3Var.b();
        }
    }

    public final qn4 u1(qn4 qn4Var, int i, int i2) {
        ArrayList arrayList;
        int n1 = n1(qn4Var);
        long l1 = l1(qn4Var);
        kf6 kf6Var = qn4Var.a;
        this.J++;
        int i3 = i2 - 1;
        while (true) {
            arrayList = this.p;
            if (i3 < i) {
                break;
            }
            arrayList.remove(i3);
            i3--;
        }
        lo5 lo5Var = this.Q;
        int i4 = i2 - i;
        int[] iArr = lo5Var.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 >= i && i7 < i2) {
                i5++;
            } else {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            }
        }
        this.Q = new lo5(iArr2, new Random(lo5Var.a.nextLong()));
        hq4 hq4Var = new hq4(arrayList, this.Q);
        qn4 r1 = r1(qn4Var, hq4Var, o1(kf6Var, hq4Var, n1, l1));
        int i9 = r1.e;
        if (i9 != 1 && i9 != 4 && n1 >= i && n1 < i2) {
            if (fz1.U(this.a, this.o, this.H, this.I, qn4Var.b.a, kf6Var, hq4Var) == -1) {
                r1 = q1(r1, 4);
            }
        }
        this.l.D.d(this.Q, 20, i, i2).b();
        return r1;
    }

    @Override // defpackage.ko4
    public final void v(io4 io4Var) {
        io4Var.getClass();
        this.m.a(io4Var);
    }

    @Override // defpackage.ko4
    public final void v0(boolean z) {
        E1();
    }

    public final void v1() {
        gw5 gw5Var = this.X;
        py1 py1Var = this.w;
        if (gw5Var != null) {
            lp4 k1 = k1(this.x);
            io3.B(!k1.f);
            k1.c = (short) 10000;
            io3.B(!k1.f);
            k1.d = null;
            k1.b();
            this.X.x.remove(py1Var);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != py1Var) {
                kb0.O("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(py1Var);
            this.W = null;
        }
    }

    @Override // defpackage.ko4
    public final void w0(io4 io4Var) {
        E1();
        io4Var.getClass();
        this.m.e(io4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(int i, int i2, Object obj) {
        for (w30 w30Var : this.g) {
            if (i == -1 || w30Var.y == i) {
                lp4 k1 = k1(w30Var);
                io3.B(!k1.f);
                k1.c = i2;
                io3.B(!k1.f);
                k1.d = obj;
                k1.b();
            }
        }
        for (w30 w30Var2 : this.h) {
            if (w30Var2 != null && (i == -1 || w30Var2.y == i)) {
                lp4 k12 = k1(w30Var2);
                io3.B(!k12.f);
                k12.c = i2;
                io3.B(!k12.f);
                k12.d = obj;
                k12.b();
            }
        }
    }

    @Override // defpackage.v30, defpackage.ko4
    public final int x() {
        E1();
        if (this.r0.a.p()) {
            int i = this.s0;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        qn4 qn4Var = this.r0;
        return qn4Var.a.b(qn4Var.b.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(java.util.List r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy1.x1(java.util.List, int, long, boolean):void");
    }

    @Override // defpackage.ko4
    public final void y(TextureView textureView) {
        E1();
        if (textureView != null && textureView == this.Z) {
            S();
        }
    }

    @Override // defpackage.ko4
    public final void y0(List list, int i, int i2) {
        boolean z;
        lf6 lf6Var;
        E1();
        boolean z2 = true;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((ry1) arrayList.get(i3)).b.k.a((ar3) list.get(i3 - i))) {
                }
            }
            this.J++;
            this.l.D.d(list, 27, i, min).b();
            for (int i4 = i; i4 < min; i4++) {
                ry1 ry1Var = (ry1) arrayList.get(i4);
                kf6 kf6Var = ry1Var.c;
                ar3 ar3Var = (ar3) list.get(i4 - i);
                if (kf6Var instanceof lf6) {
                    lf6Var = new lf6(((lf6) kf6Var).e, ar3Var);
                } else {
                    lf6Var = new lf6(kf6Var, ar3Var);
                }
                ry1Var.c = lf6Var;
            }
            C1(this.r0.j(new hq4(arrayList, this.Q)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList j1 = j1(list);
        if (this.r0.a.p()) {
            if (this.s0 != -1) {
                z2 = false;
            }
            E1();
            x1(j1, -1, -9223372036854775807L, z2);
            return;
        }
        qn4 u1 = u1(h1(this.r0, min, j1), i, min);
        C1(u1, 0, !u1.b.a.equals(this.r0.b.a), 4, m1(u1), -1, false);
    }

    public final void y1(Surface surface) {
        boolean z;
        long j;
        Object obj = this.U;
        boolean z2 = true;
        if (obj != null && obj != surface) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.B;
        } else {
            j = -9223372036854775807L;
        }
        fz1 fz1Var = this.l;
        if (!fz1Var.g0 && fz1Var.F.getThread().isAlive()) {
            nv0 nv0Var = new nv0(fz1Var.L);
            fz1Var.D.c(30, new Pair(surface, nv0Var)).b();
            if (j != -9223372036854775807L) {
                z2 = nv0Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.U;
            Surface surface2 = this.V;
            if (obj2 == surface2) {
                surface2.release();
                this.V = null;
            }
        }
        this.U = surface;
        if (!z2) {
            z1(new yx1(2, new gz1(3), 1003));
        }
    }

    @Override // defpackage.ko4
    public final hv6 z() {
        E1();
        return this.m0;
    }

    @Override // defpackage.ko4
    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        E1();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        Y0(holder);
    }

    public final void z1(yx1 yx1Var) {
        qn4 qn4Var = this.r0;
        qn4 c = qn4Var.c(qn4Var.b);
        c.q = c.s;
        c.r = 0L;
        qn4 q1 = q1(c, 1);
        if (yx1Var != null) {
            q1 = q1.f(yx1Var);
        }
        this.J++;
        this.l.D.a(6).b();
        C1(q1, 0, false, 5, -9223372036854775807L, -1, false);
    }
}
