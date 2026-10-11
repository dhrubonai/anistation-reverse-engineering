package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l71 {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public float K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public uy V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final dn0 b;
    public boolean b0;
    public final yj0 c;
    public long c0;
    public final bk6 d;
    public long d0;
    public final ag6 e;
    public Handler e0;
    public final ag6 f;
    public final o15 g;
    public final ArrayDeque h;
    public int i;
    public h71 j;
    public final g90 k;
    public final g90 l;
    public cp4 m;
    public af2 n;
    public j71 o;
    public j71 p;
    public uv q;
    public yw r;
    public g71 s;
    public ww t;
    public ru u;
    public k71 v;
    public k71 w;
    public rn4 x;
    public boolean y;
    public long z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0082, code lost:
    
        r9 = r0.getDeviceId();
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [f30, java.lang.Object, bk6] */
    /* JADX WARN: Type inference failed for: r9v2, types: [f30, java.lang.Object, yj0] */
    /* JADX WARN: Type inference failed for: r9v5, types: [uy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l71(defpackage.i71 r9) {
        /*
            r8 = this;
            r8.<init>()
            android.content.Context r0 = r9.a
            if (r0 != 0) goto L9
            r1 = 0
            goto Ld
        L9:
            android.content.Context r1 = r0.getApplicationContext()
        Ld:
            r8.a = r1
            ru r1 = defpackage.ru.i
            r8.u = r1
            dn0 r1 = r9.c
            r8.b = r1
            r1 = 0
            r8.i = r1
            yw r9 = r9.f
            r8.r = r9
            yj0 r9 = new yj0
            r9.<init>()
            r8.c = r9
            bk6 r2 = new bk6
            r2.<init>()
            byte[] r3 = defpackage.eq6.b
            r2.m = r3
            r8.d = r2
            ag6 r3 = new ag6
            r4 = 1
            r3.<init>(r4)
            r8.e = r3
            ag6 r3 = new ag6
            r3.<init>(r1)
            r8.f = r3
            o15 r9 = defpackage.nw2.t(r2, r9)
            r8.g = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.K = r9
            r8.T = r1
            uy r9 = new uy
            r9.<init>()
            r8.V = r9
            k71 r2 = new k71
            rn4 r3 = defpackage.rn4.d
            r4 = 0
            r6 = 0
            r2.<init>(r3, r4, r6)
            r8.w = r2
            r8.x = r3
            r8.y = r1
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>()
            r8.h = r9
            g90 r9 = new g90
            r9.<init>(r8)
            r8.k = r9
            g90 r9 = new g90
            r9.<init>(r8)
            r8.l = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = -1
            if (r9 < r1) goto L8b
            if (r0 != 0) goto L82
            goto L8b
        L82:
            int r9 = defpackage.m9.a(r0)
            if (r9 == 0) goto L8b
            if (r9 == r2) goto L8b
            r2 = r9
        L8b:
            r8.X = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l71.<init>(i71):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(int r10, java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l71.i(int, java.nio.ByteBuffer):int");
    }

    public final void a(long j) {
        rn4 rn4Var;
        boolean z;
        boolean z2;
        boolean v = v();
        boolean z3 = false;
        dn0 dn0Var = this.b;
        if (!v) {
            if (!this.Y && this.p.b()) {
                int i = this.p.a.M;
                rn4Var = this.x;
                xu5 xu5Var = (xu5) dn0Var.A;
                float f = rn4Var.a;
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                io3.n(z);
                if (xu5Var.d != f) {
                    xu5Var.d = f;
                    xu5Var.j = true;
                }
                float f2 = rn4Var.b;
                if (f2 > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.n(z2);
                if (xu5Var.e != f2) {
                    xu5Var.e = f2;
                    xu5Var.j = true;
                }
            } else {
                rn4Var = rn4.d;
            }
            this.x = rn4Var;
        } else {
            rn4Var = rn4.d;
        }
        rn4 rn4Var2 = rn4Var;
        if (!this.Y && this.p.b()) {
            int i2 = this.p.a.M;
            z3 = this.y;
            ((ro5) dn0Var.z).j = z3;
        }
        this.y = z3;
        this.h.add(new k71(rn4Var2, Math.max(0L, j), eq6.c0(this.p.e.b, j())));
        u(j);
        af2 af2Var = this.n;
        if (af2Var != null) {
            boolean z4 = this.y;
            pz2 pz2Var = ((jp3) af2Var.y).f1;
            Handler handler = (Handler) pz2Var.y;
            if (handler != null) {
                handler.post(new dw(pz2Var, z4));
            }
        }
    }

    public final ww b(rv rvVar) {
        try {
            return this.r.a(rvVar);
        } catch (pv e) {
            mw mwVar = new mw(rvVar.b, rvVar.c, rvVar.a, rvVar.f, this.p.a, rvVar.e, e);
            af2 af2Var = this.n;
            if (af2Var != null) {
                af2Var.l(mwVar);
                throw mwVar;
            }
            throw mwVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [ew2, jw2] */
    public final void c(kw kwVar) {
        int i;
        int i2;
        uv uvVar;
        ea2 ea2Var;
        Object obj;
        if (this.s == null && this.a != null) {
            g71 g71Var = new g71(this);
            this.s = g71Var;
            yw ywVar = this.r;
            ywVar.f();
            ui3 ui3Var = ywVar.e;
            if (ui3Var == null) {
                ui3Var = new ui3(Thread.currentThread());
                ywVar.e = ui3Var;
            }
            ui3Var.a(g71Var);
        }
        ea2 ea2Var2 = kwVar.a;
        String str = ea2Var2.p;
        int i3 = ea2Var2.J;
        int i4 = ea2Var2.M;
        int i5 = -1;
        if ("audio/raw".equals(str)) {
            io3.n(eq6.N(i4));
            int v = eq6.v(i4) * i3;
            ?? ew2Var = new ew2(4);
            ew2Var.d(this.g);
            ew2Var.c(this.e);
            ew2Var.f((zv[]) this.b.y);
            uv uvVar2 = new uv(ew2Var.g());
            if (uvVar2.equals(this.q)) {
                uvVar2 = this.q;
            }
            int i6 = ea2Var2.N;
            int i7 = ea2Var2.O;
            bk6 bk6Var = this.d;
            bk6Var.i = i6;
            bk6Var.j = i7;
            this.c.i = kwVar.b;
            try {
                vv a = uvVar2.a(new vv(ea2Var2));
                int i8 = a.b;
                int i9 = a.c;
                da2 a2 = ea2Var2.a();
                a2.L = i9;
                a2.K = a.a;
                a2.I = i8;
                if (i8 == i3) {
                    i5 = ea2Var2.K;
                }
                a2.J = i5;
                ea2 ea2Var3 = new ea2(a2);
                int v2 = eq6.v(i9) * i8;
                i = v;
                i2 = v2;
                uvVar = uvVar2;
                ea2Var = ea2Var3;
            } catch (yv e) {
                throw new lw(e, ea2Var2);
            }
        } else {
            z62 z62Var = nw2.y;
            i = -1;
            i2 = -1;
            uvVar = new uv(o15.B);
            ea2Var = ea2Var2;
        }
        nv g = g(ea2Var);
        ea2 ea2Var4 = g.a;
        try {
            rv c = this.r.c(g);
            boolean z = c.e;
            if (c.a != 0) {
                if (c.c != 0) {
                    this.a0 = false;
                    kf6 kf6Var = kwVar.c;
                    jw3 jw3Var = kwVar.d;
                    if (jw3Var != null) {
                        obj = jw3Var.a;
                    } else {
                        obj = null;
                    }
                    j71 j71Var = new j71(ea2Var2, ea2Var, i, i2, c, uvVar, kf6Var, obj);
                    if (m()) {
                        this.o = j71Var;
                        return;
                    } else {
                        this.p = j71Var;
                        return;
                    }
                }
                throw new lw(ea2Var4, "Invalid output channel config (isOffload=" + z + ")");
            }
            throw new lw(ea2Var4, "Invalid output encoding (isOffload=" + z + ")");
        } catch (mv e2) {
            throw new lw(e2, ea2Var2);
        }
    }

    public final void d(long j) {
        af2 af2Var;
        zy1 zy1Var;
        boolean z;
        g90 g90Var = this.l;
        if (this.N != null) {
            boolean z2 = false;
            if (((Exception) g90Var.z) != null) {
                ((l71) g90Var.A).r.getClass();
                synchronized (ww.p) {
                    if (ww.r > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z || SystemClock.elapsedRealtime() < g90Var.y) {
                    return;
                }
            }
            int remaining = this.N.remaining();
            try {
                boolean c = this.t.c(this.N, this.M, j);
                this.Z = SystemClock.elapsedRealtime();
                g90Var.z = null;
                g90Var.x = -9223372036854775807L;
                g90Var.y = -9223372036854775807L;
                if (this.t.a.isOffloadedPlayback()) {
                    if (this.C > 0) {
                        this.b0 = false;
                    }
                    if (this.R && (af2Var = this.n) != null && !c && !this.b0 && (zy1Var = ((jp3) af2Var.y).e0) != null) {
                        zy1Var.a.p0 = true;
                    }
                }
                int remaining2 = remaining - this.N.remaining();
                if (this.p.b()) {
                    this.B += remaining2;
                }
                j71 j71Var = this.p;
                if (c) {
                    if (!j71Var.b()) {
                        if (this.N == this.L) {
                            z2 = true;
                        }
                        io3.B(z2);
                        this.C = ((this.D * this.M) - this.F) + this.C;
                        this.F = 0L;
                    }
                    this.N = null;
                    return;
                }
                if (!j71Var.b() && remaining2 > 0) {
                    if (this.E > 0) {
                        z2 = true;
                    }
                    io3.B(z2);
                    long e0 = eq6.e0(this.E - this.N.remaining(), this.M * this.D, this.E, RoundingMode.CEILING);
                    this.C += e0 - this.F;
                    this.F = e0;
                }
            } catch (lv e) {
                boolean z3 = e.y;
                if (z3) {
                    if (j() <= 0) {
                        if (this.t.a.isOffloadedPlayback()) {
                            if (this.p.e.e) {
                                this.a0 = true;
                            }
                        }
                    }
                    z2 = true;
                }
                ow owVar = new ow(e.x, this.p.a, z2);
                af2 af2Var2 = this.n;
                if (af2Var2 != null) {
                    af2Var2.l(owVar);
                }
                if (!z3) {
                    g90Var.g(owVar);
                    return;
                }
                throw owVar;
            }
        }
    }

    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.q.f()) {
            d(Long.MIN_VALUE);
            if (this.N != null) {
                return false;
            }
            return true;
        }
        this.q.h();
        p(Long.MIN_VALUE);
        if (!this.q.e() || ((byteBuffer = this.N) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (m()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new k71(this.x, 0L, 0L);
            this.I = 0L;
            this.v = null;
            this.h.clear();
            this.L = null;
            this.M = 0;
            this.N = null;
            this.P = false;
            this.O = false;
            this.Q = false;
            this.d.o = 0L;
            u(-9223372036854775807L);
            this.j = null;
            j71 j71Var = this.o;
            if (j71Var != null) {
                this.p = j71Var;
                this.o = null;
            }
            ww wwVar = this.t;
            if (wwVar.e.d.getPlayState() == 3) {
                wwVar.a.pause();
            }
            if (wwVar.a.isOffloadedPlayback()) {
                dn0 dn0Var = wwVar.h;
                dn0Var.getClass();
                ((ww) dn0Var.A).a.unregisterStreamEventCallback((vw) dn0Var.z);
                ((Handler) dn0Var.y).removeCallbacksAndMessages(null);
            }
            zp2 zp2Var = wwVar.d;
            if (zp2Var != null) {
                AudioTrack audioTrack = (AudioTrack) zp2Var.x;
                sw swVar = (sw) zp2Var.A;
                swVar.getClass();
                audioTrack.removeOnRoutingChangedListener(swVar);
                zp2Var.A = null;
                wwVar.d = null;
            }
            AudioTrack audioTrack2 = wwVar.a;
            ui3 ui3Var = wwVar.i;
            Handler p = eq6.p(null);
            synchronized (ww.p) {
                try {
                    ScheduledExecutorService scheduledExecutorService = ww.q;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new fv0("ExoPlayer:AudioTrackReleaseThread", (byte) 1));
                        ww.q = scheduledExecutorService;
                    }
                    ww.r++;
                    scheduledExecutorService.schedule(new ze((Object) audioTrack2, (Object) p, (Object) ui3Var, (byte) 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        g90 g90Var = this.l;
        g90Var.z = null;
        g90Var.x = -9223372036854775807L;
        g90Var.y = -9223372036854775807L;
        g90 g90Var2 = this.k;
        g90Var2.z = null;
        g90Var2.x = -9223372036854775807L;
        g90Var2.y = -9223372036854775807L;
        this.c0 = 0L;
        this.d0 = 0L;
        Handler handler = this.e0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final nv g(ea2 ea2Var) {
        boolean z;
        nv nvVar = new nv(ea2Var);
        nvVar.b = this.u;
        if (this.i != 0) {
            z = true;
        } else {
            z = false;
        }
        nvVar.d = z;
        nvVar.c = this.W;
        nvVar.e = this.T;
        nvVar.g = this.Y;
        nvVar.f = this.X;
        return new nv(nvVar);
    }

    public final int h(ea2 ea2Var) {
        boolean z;
        if (eq6.N(ea2Var.M) && ea2Var.M != 2) {
            da2 a = ea2Var.a();
            a.L = 2;
            ea2Var = new ea2(a);
            z = true;
        } else {
            z = false;
        }
        int i = this.r.b(g(ea2Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (this.p.b()) {
            long j = this.B;
            long j2 = this.p.d;
            return ((j + j2) - 1) / j2;
        }
        return this.C;
    }

    public final boolean k() {
        if (m()) {
            if (!this.t.a.isOffloadedPlayback() || !this.Q) {
                long j = j();
                long a = this.t.a();
                ww wwVar = this.t;
                wwVar.getClass();
                if (j > eq6.r(wwVar.a.getSampleRate(), a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        int C;
        ww wwVar;
        boolean z;
        y23 y23Var;
        boolean equals;
        boolean z2;
        LogSessionId unused;
        g90 g90Var = this.k;
        byte b = 0;
        if (((Exception) g90Var.z) != null) {
            ((l71) g90Var.A).r.getClass();
            synchronized (ww.p) {
                if (ww.r > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2 || SystemClock.elapsedRealtime() < g90Var.y) {
                return false;
            }
        }
        try {
            wwVar = b(this.p.e);
        } catch (mw e) {
            rv rvVar = this.p.e;
            int i = rvVar.f;
            boolean N = eq6.N(rvVar.a);
            j71 j71Var = this.p;
            if (N) {
                C = j71Var.e.b * j71Var.d;
            } else {
                int i2 = j71Var.a.k;
                if (i2 != -1) {
                    C = i2 / 8;
                } else {
                    C = w65.C(j71Var.e.a);
                    if (C == -2147483647) {
                        C = 1000000;
                    }
                }
            }
            rv rvVar2 = this.p.e;
            int max = Math.max(C, AudioTrack.getMinBufferSize(rvVar2.b, rvVar2.c, rvVar2.a));
            int i3 = this.p.d;
            if (i3 == -1) {
                i3 = 1;
            }
            while (i > max) {
                i = Math.max(max, i / 2);
                int i4 = i % i3;
                if (i4 != 0) {
                    i = (i3 - i4) + i;
                }
                qv a = this.p.e.a();
                a.f = i;
                rv rvVar3 = new rv(a);
                try {
                    ww b2 = b(rvVar3);
                    this.p = this.p.a(rvVar3);
                    wwVar = b2;
                } catch (mw e2) {
                    e.addSuppressed(e2);
                }
            }
            if (this.p.e.e) {
                this.a0 = true;
                throw e;
            }
            throw e;
        }
        this.t = wwVar;
        h71 h71Var = new h71(this, this.p.e);
        this.j = h71Var;
        wwVar.i.a(h71Var);
        if (this.t.a.isOffloadedPlayback()) {
            j71 j71Var2 = this.p;
            if (j71Var2.e.k) {
                ww wwVar2 = this.t;
                ea2 ea2Var = j71Var2.a;
                wwVar2.a.setOffloadDelayPadding(ea2Var.N, ea2Var.O);
            }
        }
        cp4 cp4Var = this.m;
        if (cp4Var != null) {
            ww wwVar3 = this.t;
            wwVar3.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId a2 = cp4Var.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a2.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    wwVar3.a.setLogSessionId(a2);
                }
            }
        }
        if (m()) {
            this.t.a.setVolume(this.K);
        }
        this.V.getClass();
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.H = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        if (audioSessionId != this.T) {
            z = true;
        } else {
            z = false;
        }
        this.T = audioSessionId;
        af2 af2Var = this.n;
        if (af2Var != null) {
            rv rvVar4 = this.p.e;
            q18 q18Var = new q18((byte) 6);
            pz2 pz2Var = ((jp3) af2Var.y).f1;
            Handler handler = (Handler) pz2Var.y;
            if (handler != null) {
                handler.post(new cw(pz2Var, q18Var, b));
            }
            if (z) {
                this.U = true;
                j71 j71Var3 = this.p;
                qv a3 = j71Var3.e.a();
                a3.h = this.T;
                this.p = j71Var3.a(new rv(a3));
                j71 j71Var4 = this.o;
                if (j71Var4 != null) {
                    qv a4 = j71Var4.e.a();
                    a4.h = this.T;
                    this.o = j71Var4.a(new rv(a4));
                }
                af2 af2Var2 = this.n;
                int i5 = this.T;
                jp3 jp3Var = (jp3) af2Var2.y;
                if (Build.VERSION.SDK_INT >= 35 && (y23Var = jp3Var.h1) != null) {
                    y23Var.b0(i5);
                }
                pz2 pz2Var2 = jp3Var.f1;
                Handler handler2 = (Handler) pz2Var2.y;
                if (handler2 != null) {
                    handler2.post(new ew(pz2Var2, i5, b));
                }
            }
        }
        return true;
    }

    public final boolean m() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.R = true;
        if (m()) {
            ww wwVar = this.t;
            AudioTrack audioTrack = wwVar.a;
            ax axVar = wwVar.e;
            if (axVar.u != -9223372036854775807L) {
                axVar.b.getClass();
                axVar.u = eq6.U(SystemClock.elapsedRealtime());
            }
            axVar.j = eq6.c0(axVar.e, axVar.a());
            axVar.h.a(0);
            if (!wwVar.j || audioTrack.isOffloadedPlayback()) {
                audioTrack.play();
            }
        }
    }

    public final void o() {
        if (!this.P) {
            this.P = true;
            if (this.t.a.isOffloadedPlayback()) {
                this.Q = false;
            }
            ww wwVar = this.t;
            if (!wwVar.j) {
                wwVar.j = true;
                ax axVar = wwVar.e;
                long b = wwVar.b();
                axVar.w = axVar.a();
                axVar.b.getClass();
                axVar.u = eq6.U(SystemClock.elapsedRealtime());
                axVar.x = b;
                wwVar.a.stop();
            }
        }
    }

    public final void p(long j) {
        d(j);
        if (this.N == null) {
            if (!this.q.f()) {
                ByteBuffer byteBuffer = this.L;
                if (byteBuffer != null) {
                    t(byteBuffer);
                    d(j);
                    return;
                }
                return;
            }
            while (!this.q.e()) {
                do {
                    ByteBuffer d = this.q.d();
                    if (d.hasRemaining()) {
                        t(d);
                        d(j);
                    } else {
                        ByteBuffer byteBuffer2 = this.L;
                        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                            this.q.i(this.L);
                        } else {
                            return;
                        }
                    }
                } while (this.N == null);
                return;
            }
        }
    }

    public final void q() {
        j71 j71Var = this.p;
        if (j71Var != null) {
            j71 j71Var2 = this.o;
            if (j71Var2 != null) {
                this.p = j71Var2;
                this.o = null;
                j71Var = j71Var2;
            }
            try {
                this.p = this.p.a(this.r.c(g(j71Var.b)));
            } catch (mv e) {
                throw new IllegalStateException(new lw(e, this.p.a));
            }
        }
        f();
    }

    public final void r() {
        f();
        z62 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((zv) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        uv uvVar = this.q;
        if (uvVar != null) {
            uvVar.j();
        }
        this.R = false;
        this.a0 = false;
    }

    public final void s() {
        if (m()) {
            ww wwVar = this.t;
            rn4 rn4Var = this.x;
            AudioTrack audioTrack = wwVar.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(eq6.i(rn4Var.a, 0.1f, 8.0f)).setPitch(eq6.i(rn4Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                kb0.P("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            ax axVar = wwVar.e;
            axVar.i = audioTrack.getPlaybackParams().getSpeed();
            axVar.h.a(0);
            axVar.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new rn4(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ef, code lost:
    
        if (r9 < 0.0d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0181, code lost:
    
        if (r9 < 0.0f) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (r9 < 0.0d) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        r9 = (-r9) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bd, code lost:
    
        r9 = r9 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d6, code lost:
    
        if (r9 < 0.0f) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00d8, code lost:
    
        r9 = (-r9) * (-2.1474836E9f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00de, code lost:
    
        r9 = r9 * 2.1474836E9f;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.nio.ByteBuffer r26) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l71.t(java.nio.ByteBuffer):void");
    }

    public final void u(long j) {
        long j2;
        j71 j71Var = this.p;
        this.q = j71Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (j71Var.g != kf6.a && j71Var.h != null) {
                hf6 hf6Var = new hf6();
                j71 j71Var2 = this.p;
                j71Var2.g.g(j71Var2.h, hf6Var);
                j2 += hf6Var.e;
            }
        }
        uv uvVar = this.q;
        wv wvVar = new wv((byte) 0);
        j71 j71Var3 = this.p;
        wvVar.b = j71Var3.g;
        wvVar.c = j71Var3.h;
        wvVar.a = j2;
        uvVar.b(wvVar.b());
    }

    public final boolean v() {
        j71 j71Var = this.p;
        if (j71Var != null && j71Var.e.j) {
            return true;
        }
        return false;
    }
}
