package j1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import r6.n1;

/* loaded from: classes.dex */
public final class j0 implements Handler.Callback, v1.t, j {
    public final Looper A;
    public final c1.d1 B;
    public final c1.c1 C;
    public final long D;
    public final k E;
    public final ArrayList F;
    public final f1.a G;
    public final t H;
    public final r0 I;
    public final a1 J;
    public final h K;
    public final long L;
    public j1 M;
    public b1 N;
    public g0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final g1[] f5792a;

    /* renamed from: a0, reason: collision with root package name */
    public int f5793a0;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5794b;

    /* renamed from: b0, reason: collision with root package name */
    public i0 f5795b0;

    /* renamed from: c, reason: collision with root package name */
    public final e[] f5796c;

    /* renamed from: c0, reason: collision with root package name */
    public long f5797c0;

    /* renamed from: d, reason: collision with root package name */
    public final y1.v f5798d;

    /* renamed from: d0, reason: collision with root package name */
    public int f5799d0;

    /* renamed from: e, reason: collision with root package name */
    public final y1.w f5800e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5801e0;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f5802f;

    /* renamed from: f0, reason: collision with root package name */
    public m f5803f0;

    /* renamed from: x, reason: collision with root package name */
    public final z1.c f5805x;

    /* renamed from: y, reason: collision with root package name */
    public final f1.x f5806y;

    /* renamed from: z, reason: collision with root package name */
    public final HandlerThread f5807z;

    /* renamed from: g0, reason: collision with root package name */
    public long f5804g0 = -9223372036854775807L;
    public long T = -9223372036854775807L;

    public j0(g1[] g1VarArr, y1.v vVar, y1.w wVar, l0 l0Var, z1.c cVar, int i10, boolean z9, k1.a aVar, j1 j1Var, h hVar, long j4, boolean z10, Looper looper, f1.a aVar2, t tVar, k1.i0 i0Var) {
        this.H = tVar;
        this.f5792a = g1VarArr;
        this.f5798d = vVar;
        this.f5800e = wVar;
        this.f5802f = l0Var;
        this.f5805x = cVar;
        this.V = i10;
        this.W = z9;
        this.M = j1Var;
        this.K = hVar;
        this.L = j4;
        this.Q = z10;
        this.G = aVar2;
        this.D = ((i) l0Var).f5783g;
        b1 i11 = b1.i(wVar);
        this.N = i11;
        this.O = new g0(i11);
        this.f5796c = new e[g1VarArr.length];
        y1.p pVar = (y1.p) vVar;
        pVar.getClass();
        for (int i12 = 0; i12 < g1VarArr.length; i12++) {
            e eVar = (e) g1VarArr[i12];
            eVar.f5710e = i12;
            eVar.f5711f = i0Var;
            eVar.f5712x = aVar2;
            eVar.r();
            e[] eVarArr = this.f5796c;
            e eVar2 = (e) g1VarArr[i12];
            eVar2.getClass();
            eVarArr[i12] = eVar2;
            e eVar3 = this.f5796c[i12];
            synchronized (eVar3.f5706a) {
                eVar3.H = pVar;
            }
        }
        this.E = new k(this, aVar2);
        this.F = new ArrayList();
        this.f5794b = Collections.newSetFromMap(new IdentityHashMap());
        this.B = new c1.d1();
        this.C = new c1.c1();
        vVar.f11533a = this;
        vVar.f11534b = cVar;
        this.f5801e0 = true;
        f1.v vVar2 = (f1.v) aVar2;
        f1.x a10 = vVar2.a(looper, null);
        this.I = new r0(aVar, a10, new w.f(this, 10));
        this.J = new a1(this, aVar, a10, i0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f5807z = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.A = looper2;
        this.f5806y = vVar2.a(looper2, this);
    }

    public static Pair I(c1.e1 e1Var, i0 i0Var, boolean z9, int i10, boolean z10, c1.d1 d1Var, c1.c1 c1Var) {
        c1.e1 e1Var2;
        Pair j4;
        Object J;
        c1.e1 e1Var3 = i0Var.f5786a;
        if (e1Var.q()) {
            return null;
        }
        if (e1Var3.q()) {
            e1Var2 = e1Var;
        } else {
            e1Var2 = e1Var3;
        }
        try {
            j4 = e1Var2.j(d1Var, c1Var, i0Var.f5787b, i0Var.f5788c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (e1Var.equals(e1Var2)) {
            return j4;
        }
        if (e1Var.b(j4.first) != -1) {
            if (e1Var2.h(j4.first, c1Var).f1646f && e1Var2.n(c1Var.f1643c, d1Var).o == e1Var2.b(j4.first)) {
                return e1Var.j(d1Var, c1Var, e1Var.h(j4.first, c1Var).f1643c, i0Var.f5788c);
            }
            return j4;
        }
        if (z9 && (J = J(d1Var, c1Var, i10, z10, j4.first, e1Var2, e1Var)) != null) {
            return e1Var.j(d1Var, c1Var, e1Var.h(J, c1Var).f1643c, -9223372036854775807L);
        }
        return null;
    }

    public static Object J(c1.d1 d1Var, c1.c1 c1Var, int i10, boolean z9, Object obj, c1.e1 e1Var, c1.e1 e1Var2) {
        int b10 = e1Var.b(obj);
        int i11 = e1Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = e1Var.d(i12, c1Var, d1Var, i10, z9);
            if (i12 == -1) {
                break;
            }
            i13 = e1Var2.b(e1Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return e1Var2.m(i13);
    }

    public static void O(g1 g1Var, long j4) {
        ((e) g1Var).E = true;
        if (g1Var instanceof x1.f) {
            x1.f fVar = (x1.f) g1Var;
            w7.b.u(fVar.E);
            fVar.f11083b0 = j4;
        }
    }

    public static boolean r(g1 g1Var) {
        if (((e) g1Var).f5713y != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        try {
            E(true, false, true, false);
            B();
            ((i) this.f5802f).b(true);
            X(1);
            HandlerThread handlerThread = this.f5807z;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.P = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f5807z;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.P = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void B() {
        boolean z9;
        for (int i10 = 0; i10 < this.f5792a.length; i10++) {
            e eVar = this.f5796c[i10];
            synchronized (eVar.f5706a) {
                eVar.H = null;
            }
            e eVar2 = (e) this.f5792a[i10];
            if (eVar2.f5713y == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            eVar2.t();
        }
    }

    public final void C(int i10, int i11, v1.y0 y0Var) {
        boolean z9 = true;
        this.O.a(1);
        a1 a1Var = this.J;
        a1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > a1Var.f5620b.size()) {
            z9 = false;
        }
        w7.b.g(z9);
        a1Var.f5628j = y0Var;
        a1Var.g(i10, i11);
        m(a1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.j0.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r5.equals(r32.N.f5637b) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[LOOP:2: B:49:0x00e9->B:51:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.j0.E(boolean, boolean, boolean, boolean):void");
    }

    public final void F() {
        boolean z9;
        p0 p0Var = this.I.f5893i;
        if (p0Var != null && p0Var.f5862f.f5881h && this.Q) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.R = z9;
    }

    public final void G(long j4) {
        long j10;
        p0 p0Var = this.I.f5893i;
        if (p0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = p0Var.o;
        }
        long j11 = j4 + j10;
        this.f5797c0 = j11;
        this.E.f5811a.a(j11);
        for (g1 g1Var : this.f5792a) {
            if (r(g1Var)) {
                long j12 = this.f5797c0;
                e eVar = (e) g1Var;
                eVar.E = false;
                eVar.C = j12;
                eVar.D = j12;
                eVar.s(j12, false);
            }
        }
        for (p0 p0Var2 = r0.f5893i; p0Var2 != null; p0Var2 = p0Var2.f5868l) {
            for (y1.s sVar : p0Var2.f5870n.f11537c) {
                if (sVar != null) {
                    sVar.r();
                }
            }
        }
    }

    public final void H(c1.e1 e1Var, c1.e1 e1Var2) {
        if (e1Var.q() && e1Var2.q()) {
            return;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a3.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final void K(boolean z9) {
        v1.w wVar = this.I.f5893i.f5862f.f5874a;
        long M = M(wVar, this.N.f5652r, true, false);
        if (M != this.N.f5652r) {
            b1 b1Var = this.N;
            this.N = p(wVar, M, b1Var.f5638c, b1Var.f5639d, z9, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:6:0x009d, B:8:0x00a7, B:15:0x00ad, B:17:0x00b3, B:18:0x00b6, B:19:0x00bb, B:21:0x00c5, B:23:0x00cb, B:27:0x00d3, B:28:0x00dd, B:30:0x00ed, B:34:0x00f7, B:36:0x010b, B:39:0x0114, B:42:0x011f), top: B:5:0x009d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(j1.i0 r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.j0.L(j1.i0):void");
    }

    public final long M(v1.w wVar, long j4, boolean z9, boolean z10) {
        c0();
        i0(false, true);
        if (z10 || this.N.f5640e == 3) {
            X(2);
        }
        r0 r0Var = this.I;
        p0 p0Var = r0Var.f5893i;
        p0 p0Var2 = p0Var;
        while (p0Var2 != null && !wVar.equals(p0Var2.f5862f.f5874a)) {
            p0Var2 = p0Var2.f5868l;
        }
        if (z9 || p0Var != p0Var2 || (p0Var2 != null && p0Var2.o + j4 < 0)) {
            for (g1 g1Var : this.f5792a) {
                b(g1Var);
            }
            if (p0Var2 != null) {
                while (r0Var.f5893i != p0Var2) {
                    r0Var.a();
                }
                r0Var.l(p0Var2);
                p0Var2.o = 1000000000000L;
                d();
            }
        }
        if (p0Var2 != null) {
            r0Var.l(p0Var2);
            if (!p0Var2.f5860d) {
                p0Var2.f5862f = p0Var2.f5862f.b(j4);
            } else if (p0Var2.f5861e) {
                v1.u uVar = p0Var2.f5857a;
                j4 = uVar.t(j4);
                uVar.u(j4 - this.D);
            }
            G(j4);
            u();
        } else {
            r0Var.b();
            G(j4);
        }
        l(false);
        this.f5806y.d(2);
        return j4;
    }

    public final void N(d1 d1Var) {
        Looper looper = d1Var.f5702f;
        if (!looper.getThread().isAlive()) {
            f1.o.f("TAG", "Trying to send message on a dead thread.");
            d1Var.b(false);
        } else {
            ((f1.v) this.G).a(looper, null).c(new f.m0(6, this, d1Var));
        }
    }

    public final void P(boolean z9, AtomicBoolean atomicBoolean) {
        if (this.X != z9) {
            this.X = z9;
            if (!z9) {
                for (g1 g1Var : this.f5792a) {
                    if (!r(g1Var) && this.f5794b.remove(g1Var)) {
                        ((e) g1Var).A();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(f0 f0Var) {
        this.O.a(1);
        int i10 = f0Var.f5733c;
        v1.y0 y0Var = f0Var.f5732b;
        List list = f0Var.f5731a;
        if (i10 != -1) {
            this.f5795b0 = new i0(new f1(list, y0Var), f0Var.f5733c, f0Var.f5734d);
        }
        a1 a1Var = this.J;
        ArrayList arrayList = a1Var.f5620b;
        a1Var.g(0, arrayList.size());
        m(a1Var.a(arrayList.size(), list, y0Var), false);
    }

    public final void R(boolean z9) {
        this.Q = z9;
        F();
        if (this.R) {
            r0 r0Var = this.I;
            if (r0Var.f5894j != r0Var.f5893i) {
                K(true);
                l(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z9, boolean z10) {
        this.O.a(z10 ? 1 : 0);
        g0 g0Var = this.O;
        g0Var.f5750a = true;
        g0Var.f5755f = true;
        g0Var.f5756g = i11;
        this.N = this.N.d(i10, z9);
        i0(false, false);
        for (p0 p0Var = this.I.f5893i; p0Var != null; p0Var = p0Var.f5868l) {
            for (y1.s sVar : p0Var.f5870n.f11537c) {
                if (sVar != null) {
                    sVar.a(z9);
                }
            }
        }
        if (!Y()) {
            c0();
            g0();
            return;
        }
        int i12 = this.N.f5640e;
        f1.x xVar = this.f5806y;
        if (i12 == 3) {
            i0(false, false);
            k kVar = this.E;
            kVar.f5816f = true;
            kVar.f5811a.b();
            a0();
            xVar.d(2);
            return;
        }
        if (i12 == 2) {
            xVar.d(2);
        }
    }

    public final void T(c1.t0 t0Var) {
        this.f5806y.f3866a.removeMessages(16);
        k kVar = this.E;
        kVar.j(t0Var);
        c1.t0 h10 = kVar.h();
        o(h10, h10.f1894a, true, true);
    }

    public final void U(int i10) {
        this.V = i10;
        c1.e1 e1Var = this.N.f5636a;
        r0 r0Var = this.I;
        r0Var.f5891g = i10;
        if (!r0Var.o(e1Var)) {
            K(true);
        }
        l(false);
    }

    public final void V(boolean z9) {
        this.W = z9;
        c1.e1 e1Var = this.N.f5636a;
        r0 r0Var = this.I;
        r0Var.f5892h = z9;
        if (!r0Var.o(e1Var)) {
            K(true);
        }
        l(false);
    }

    public final void W(v1.y0 y0Var) {
        this.O.a(1);
        a1 a1Var = this.J;
        int size = a1Var.f5620b.size();
        if (y0Var.f10570b.length != size) {
            y0Var = new v1.y0(new Random(y0Var.f10569a.nextLong())).a(size);
        }
        a1Var.f5628j = y0Var;
        m(a1Var.b(), false);
    }

    public final void X(int i10) {
        b1 b1Var = this.N;
        if (b1Var.f5640e != i10) {
            if (i10 != 2) {
                this.f5804g0 = -9223372036854775807L;
            }
            this.N = b1Var.g(i10);
        }
    }

    public final boolean Y() {
        b1 b1Var = this.N;
        if (b1Var.f5647l && b1Var.f5648m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Z(c1.e1 e1Var, v1.w wVar) {
        if (wVar.b() || e1Var.q()) {
            return false;
        }
        int i10 = e1Var.h(wVar.f10559a, this.C).f1643c;
        c1.d1 d1Var = this.B;
        e1Var.n(i10, d1Var);
        if (!d1Var.a() || !d1Var.f1663i || d1Var.f1660f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void a(f0 f0Var, int i10) {
        this.O.a(1);
        a1 a1Var = this.J;
        if (i10 == -1) {
            i10 = a1Var.f5620b.size();
        }
        m(a1Var.a(i10, f0Var.f5731a, f0Var.f5732b), false);
    }

    public final void a0() {
        p0 p0Var = this.I.f5893i;
        if (p0Var == null) {
            return;
        }
        y1.w wVar = p0Var.f5870n;
        int i10 = 0;
        while (true) {
            g1[] g1VarArr = this.f5792a;
            if (i10 < g1VarArr.length) {
                if (wVar.b(i10)) {
                    e eVar = (e) g1VarArr[i10];
                    int i11 = eVar.f5713y;
                    boolean z9 = true;
                    if (i11 == 1) {
                        if (i11 != 1) {
                            z9 = false;
                        }
                        w7.b.u(z9);
                        eVar.f5713y = 2;
                        eVar.v();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(g1 g1Var) {
        boolean z9;
        boolean z10;
        if (!r(g1Var)) {
            return;
        }
        k kVar = this.E;
        if (g1Var == kVar.f5813c) {
            kVar.f5814d = null;
            kVar.f5813c = null;
            kVar.f5815e = true;
        }
        e eVar = (e) g1Var;
        int i10 = eVar.f5713y;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7.b.u(z10);
            eVar.f5713y = 1;
            eVar.w();
        }
        e eVar2 = (e) g1Var;
        if (eVar2.f5713y == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        eVar2.f5708c.G();
        eVar2.f5713y = 0;
        eVar2.f5714z = null;
        eVar2.A = null;
        eVar2.E = false;
        eVar2.p();
        this.f5793a0--;
    }

    public final void b0(boolean z9, boolean z10) {
        boolean z11;
        if (!z9 && this.X) {
            z11 = false;
        } else {
            z11 = true;
        }
        E(z11, false, true, false);
        this.O.a(z10 ? 1 : 0);
        ((i) this.f5802f).b(true);
        X(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x059f, code lost:
    
        if (r6 == false) goto L364;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033c A[EDGE_INSN: B:153:0x033c->B:154:0x033c BREAK  A[LOOP:2: B:113:0x02bc->B:124:0x0339], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f0 A[EDGE_INSN: B:198:0x03f0->B:199:0x03f0 BREAK  A[LOOP:4: B:158:0x0344->B:196:0x03e4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.j0.c():void");
    }

    public final void c0() {
        e eVar;
        int i10;
        boolean z9;
        k kVar = this.E;
        kVar.f5816f = false;
        k1 k1Var = kVar.f5811a;
        if (k1Var.f5818b) {
            k1Var.a(k1Var.k());
            k1Var.f5818b = false;
        }
        for (g1 g1Var : this.f5792a) {
            if (r(g1Var) && (i10 = (eVar = (e) g1Var).f5713y) == 2) {
                if (i10 == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w7.b.u(z9);
                eVar.f5713y = 1;
                eVar.w();
            }
        }
    }

    public final void d() {
        e(new boolean[this.f5792a.length], this.I.f5894j.e());
    }

    public final void d0() {
        boolean z9;
        p0 p0Var = this.I.f5895k;
        if (!this.U && (p0Var == null || !p0Var.f5857a.c())) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = z9;
        b1 b1Var = this.N;
        if (z10 != b1Var.f5642g) {
            this.N = new b1(b1Var.f5636a, b1Var.f5637b, b1Var.f5638c, b1Var.f5639d, b1Var.f5640e, b1Var.f5641f, z10, b1Var.f5643h, b1Var.f5644i, b1Var.f5645j, b1Var.f5646k, b1Var.f5647l, b1Var.f5648m, b1Var.f5649n, b1Var.f5650p, b1Var.f5651q, b1Var.f5652r, b1Var.f5653s, b1Var.o);
        }
    }

    public final void e(boolean[] zArr, long j4) {
        g1[] g1VarArr;
        Set set;
        int i10;
        r0 r0Var;
        p0 p0Var;
        y1.w wVar;
        g1[] g1VarArr2;
        Set set2;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        o0 o0Var;
        r0 r0Var2 = this.I;
        p0 p0Var2 = r0Var2.f5894j;
        y1.w wVar2 = p0Var2.f5870n;
        int i12 = 0;
        while (true) {
            g1VarArr = this.f5792a;
            int length = g1VarArr.length;
            set = this.f5794b;
            if (i12 >= length) {
                break;
            }
            if (!wVar2.b(i12) && set.remove(g1VarArr[i12])) {
                ((e) g1VarArr[i12]).A();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < g1VarArr.length) {
            if (wVar2.b(i13)) {
                boolean z14 = zArr[i13];
                g1 g1Var = g1VarArr[i13];
                if (!r(g1Var)) {
                    p0 p0Var3 = r0Var2.f5894j;
                    if (p0Var3 == r0Var2.f5893i) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    y1.w wVar3 = p0Var3.f5870n;
                    i1 i1Var = wVar3.f11536b[i13];
                    y1.s sVar = wVar3.f11537c[i13];
                    if (sVar != null) {
                        r0Var = r0Var2;
                        i11 = sVar.length();
                    } else {
                        r0Var = r0Var2;
                        i11 = 0;
                    }
                    c1.v[] vVarArr = new c1.v[i11];
                    wVar = wVar2;
                    for (int i14 = 0; i14 < i11; i14++) {
                        vVarArr[i14] = sVar.c(i14);
                    }
                    if (Y() && this.N.f5640e == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z14 && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f5793a0++;
                    set.add(g1Var);
                    v1.v0 v0Var = p0Var3.f5859c[i13];
                    p0Var = p0Var2;
                    boolean z15 = z10;
                    long j10 = p0Var3.o;
                    v1.w wVar4 = p0Var3.f5862f.f5874a;
                    e eVar = (e) g1Var;
                    if (eVar.f5713y == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    w7.b.u(z12);
                    eVar.f5709d = i1Var;
                    eVar.f5713y = 1;
                    eVar.q(z11, z9);
                    boolean z16 = z9;
                    i10 = i13;
                    g1VarArr2 = g1VarArr;
                    set2 = set;
                    eVar.z(vVarArr, v0Var, j4, j10, wVar4);
                    eVar.E = false;
                    eVar.C = j4;
                    eVar.D = j4;
                    eVar.s(j4, z11);
                    g1Var.e(11, new e0(this));
                    k kVar = this.E;
                    kVar.getClass();
                    o0 i15 = g1Var.i();
                    if (i15 != null && i15 != (o0Var = kVar.f5814d)) {
                        if (o0Var == null) {
                            kVar.f5814d = i15;
                            kVar.f5813c = g1Var;
                            i15.j(kVar.f5811a.f5821e);
                        } else {
                            throw new m(2, 1000, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z15 && z16) {
                        e eVar2 = (e) g1Var;
                        if (eVar2.f5713y == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        w7.b.u(z13);
                        eVar2.f5713y = 2;
                        eVar2.v();
                    }
                    i13 = i10 + 1;
                    set = set2;
                    r0Var2 = r0Var;
                    wVar2 = wVar;
                    p0Var2 = p0Var;
                    g1VarArr = g1VarArr2;
                }
            }
            i10 = i13;
            r0Var = r0Var2;
            p0Var = p0Var2;
            wVar = wVar2;
            g1VarArr2 = g1VarArr;
            set2 = set;
            i13 = i10 + 1;
            set = set2;
            r0Var2 = r0Var;
            wVar2 = wVar;
            p0Var2 = p0Var;
            g1VarArr = g1VarArr2;
        }
        p0Var2.f5863g = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0023. Please report as an issue. */
    public final void e0(y1.w wVar) {
        c1.e1 e1Var = this.N.f5636a;
        y1.s[] sVarArr = wVar.f11537c;
        i iVar = (i) this.f5802f;
        int i10 = iVar.f5782f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                g1[] g1VarArr = this.f5792a;
                int i13 = 13107200;
                if (i11 < g1VarArr.length) {
                    if (sVarArr[i11] != null) {
                        switch (((e) g1VarArr[i11]).f5707b) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        iVar.f5784h = i10;
        iVar.f5777a.a(i10);
    }

    public final long f(c1.e1 e1Var, Object obj, long j4) {
        c1.c1 c1Var = this.C;
        int i10 = e1Var.h(obj, c1Var).f1643c;
        c1.d1 d1Var = this.B;
        e1Var.n(i10, d1Var);
        if (d1Var.f1660f == -9223372036854775807L || !d1Var.a() || !d1Var.f1663i) {
            return -9223372036854775807L;
        }
        return f1.b0.O(f1.b0.x(d1Var.f1661g) - d1Var.f1660f) - (j4 + c1Var.f1645e);
    }

    public final void f0(int i10, int i11, List list) {
        boolean z9;
        boolean z10 = true;
        this.O.a(1);
        a1 a1Var = this.J;
        a1Var.getClass();
        ArrayList arrayList = a1Var.f5620b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        if (list.size() != i11 - i10) {
            z10 = false;
        }
        w7.b.g(z10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((z0) arrayList.get(i12)).f5933a.s((c1.k0) list.get(i12 - i10));
        }
        m(a1Var.b(), false);
    }

    public final long g() {
        p0 p0Var = this.I.f5894j;
        if (p0Var == null) {
            return 0L;
        }
        long j4 = p0Var.o;
        if (!p0Var.f5860d) {
            return j4;
        }
        int i10 = 0;
        while (true) {
            g1[] g1VarArr = this.f5792a;
            if (i10 < g1VarArr.length) {
                if (r(g1VarArr[i10])) {
                    g1 g1Var = g1VarArr[i10];
                    if (((e) g1Var).f5714z != p0Var.f5859c[i10]) {
                        continue;
                    } else {
                        long j10 = ((e) g1Var).D;
                        if (j10 == Long.MIN_VALUE) {
                            return Long.MIN_VALUE;
                        }
                        j4 = Math.max(j10, j4);
                    }
                }
                i10++;
            } else {
                return j4;
            }
        }
    }

    public final void g0() {
        long j4;
        boolean z9;
        boolean z10;
        long max;
        long max2;
        p0 p0Var = this.I.f5893i;
        if (p0Var == null) {
            return;
        }
        if (p0Var.f5860d) {
            j4 = p0Var.f5857a.j();
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            if (!p0Var.f()) {
                this.I.l(p0Var);
                l(false);
                u();
            }
            G(j4);
            if (j4 != this.N.f5652r) {
                b1 b1Var = this.N;
                this.N = p(b1Var.f5637b, j4, b1Var.f5638c, j4, true, 5);
            }
        } else {
            k kVar = this.E;
            if (p0Var != this.I.f5894j) {
                z9 = true;
            } else {
                z9 = false;
            }
            g1 g1Var = kVar.f5813c;
            if (g1Var != null && !g1Var.b() && ((!z9 || ((e) kVar.f5813c).f5713y == 2) && (kVar.f5813c.a() || (!z9 && !((e) kVar.f5813c).o())))) {
                z10 = false;
            } else {
                z10 = true;
            }
            k1 k1Var = kVar.f5811a;
            if (z10) {
                kVar.f5815e = true;
                if (kVar.f5816f) {
                    k1Var.b();
                }
            } else {
                o0 o0Var = kVar.f5814d;
                o0Var.getClass();
                long k10 = o0Var.k();
                if (kVar.f5815e) {
                    if (k10 < k1Var.k()) {
                        if (k1Var.f5818b) {
                            k1Var.a(k1Var.k());
                            k1Var.f5818b = false;
                        }
                    } else {
                        kVar.f5815e = false;
                        if (kVar.f5816f) {
                            k1Var.b();
                        }
                    }
                }
                k1Var.a(k10);
                c1.t0 h10 = o0Var.h();
                if (!h10.equals(k1Var.f5821e)) {
                    k1Var.j(h10);
                    ((j0) kVar.f5812b).f5806y.a(16, h10).a();
                }
            }
            long k11 = kVar.k();
            this.f5797c0 = k11;
            long j10 = k11 - p0Var.o;
            long j11 = this.N.f5652r;
            if (!this.F.isEmpty() && !this.N.f5637b.b()) {
                if (this.f5801e0) {
                    this.f5801e0 = false;
                }
                b1 b1Var2 = this.N;
                b1Var2.f5636a.b(b1Var2.f5637b.f10559a);
                int min = Math.min(this.f5799d0, this.F.size());
                if (min > 0) {
                    a3.g.z(this.F.get(min - 1));
                }
                if (min < this.F.size()) {
                    a3.g.z(this.F.get(min));
                }
                this.f5799d0 = min;
            }
            if (this.E.c()) {
                b1 b1Var3 = this.N;
                this.N = p(b1Var3.f5637b, j10, b1Var3.f5638c, j10, true, 6);
            } else {
                b1 b1Var4 = this.N;
                b1Var4.f5652r = j10;
                b1Var4.f5653s = SystemClock.elapsedRealtime();
            }
        }
        this.N.f5650p = this.I.f5895k.d();
        b1 b1Var5 = this.N;
        long j12 = b1Var5.f5650p;
        p0 p0Var2 = this.I.f5895k;
        if (p0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j12 - (this.f5797c0 - p0Var2.o));
        }
        b1Var5.f5651q = max;
        b1 b1Var6 = this.N;
        if (b1Var6.f5647l && b1Var6.f5640e == 3 && Z(b1Var6.f5636a, b1Var6.f5637b)) {
            b1 b1Var7 = this.N;
            float f10 = 1.0f;
            if (b1Var7.f5649n.f1894a == 1.0f) {
                h hVar = this.K;
                long f11 = f(b1Var7.f5636a, b1Var7.f5637b.f10559a, b1Var7.f5652r);
                long j13 = this.N.f5650p;
                p0 p0Var3 = this.I.f5895k;
                if (p0Var3 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j13 - (this.f5797c0 - p0Var3.o));
                }
                if (hVar.f5760d != -9223372036854775807L) {
                    long j14 = f11 - max2;
                    if (hVar.f5770n == -9223372036854775807L) {
                        hVar.f5770n = j14;
                        hVar.o = 0L;
                    } else {
                        float f12 = 1.0f - hVar.f5759c;
                        hVar.f5770n = Math.max(j14, (((float) j14) * f12) + (((float) r11) * r0));
                        hVar.o = (f12 * ((float) Math.abs(j14 - r11))) + (((float) hVar.o) * r0);
                    }
                    if (hVar.f5769m != -9223372036854775807L && SystemClock.elapsedRealtime() - hVar.f5769m < 1000) {
                        f10 = hVar.f5768l;
                    } else {
                        hVar.f5769m = SystemClock.elapsedRealtime();
                        long j15 = (hVar.o * 3) + hVar.f5770n;
                        if (hVar.f5765i > j15) {
                            float O = (float) f1.b0.O(1000L);
                            long[] jArr = {j15, hVar.f5762f, hVar.f5765i - (((hVar.f5768l - 1.0f) * O) + ((hVar.f5766j - 1.0f) * O))};
                            long j16 = j15;
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j17 = jArr[i10];
                                if (j17 > j16) {
                                    j16 = j17;
                                }
                            }
                            hVar.f5765i = j16;
                        } else {
                            long i11 = f1.b0.i(f11 - (Math.max(0.0f, hVar.f5768l - 1.0f) / 1.0E-7f), hVar.f5765i, j15);
                            hVar.f5765i = i11;
                            long j18 = hVar.f5764h;
                            if (j18 != -9223372036854775807L && i11 > j18) {
                                hVar.f5765i = j18;
                            }
                        }
                        long j19 = f11 - hVar.f5765i;
                        if (Math.abs(j19) < hVar.f5757a) {
                            hVar.f5768l = 1.0f;
                        } else {
                            hVar.f5768l = f1.b0.g((1.0E-7f * ((float) j19)) + 1.0f, hVar.f5767k, hVar.f5766j);
                        }
                        f10 = hVar.f5768l;
                    }
                }
                if (this.E.h().f1894a != f10) {
                    c1.t0 t0Var = new c1.t0(f10, this.N.f5649n.f1895b);
                    this.f5806y.f3866a.removeMessages(16);
                    this.E.j(t0Var);
                    o(this.N.f5649n, this.E.h().f1894a, false, false);
                }
            }
        }
    }

    public final Pair h(c1.e1 e1Var) {
        long j4 = 0;
        if (e1Var.q()) {
            return Pair.create(b1.f5635t, 0L);
        }
        Pair j10 = e1Var.j(this.B, this.C, e1Var.a(this.W), -9223372036854775807L);
        v1.w n9 = this.I.n(e1Var, j10.first, 0L);
        long longValue = ((Long) j10.second).longValue();
        if (n9.b()) {
            Object obj = n9.f10559a;
            c1.c1 c1Var = this.C;
            e1Var.h(obj, c1Var);
            if (n9.f10561c == c1Var.f(n9.f10560b)) {
                c1Var.f1647g.getClass();
            }
        } else {
            j4 = longValue;
        }
        return Pair.create(n9, Long.valueOf(j4));
    }

    public final void h0(c1.e1 e1Var, v1.w wVar, c1.e1 e1Var2, v1.w wVar2, long j4, boolean z9) {
        Object obj;
        c1.t0 t0Var;
        if (!Z(e1Var, wVar)) {
            if (wVar.b()) {
                t0Var = c1.t0.f1893d;
            } else {
                t0Var = this.N.f5649n;
            }
            k kVar = this.E;
            if (!kVar.h().equals(t0Var)) {
                this.f5806y.f3866a.removeMessages(16);
                kVar.j(t0Var);
                o(this.N.f5649n, t0Var.f1894a, false, false);
                return;
            }
            return;
        }
        Object obj2 = wVar.f10559a;
        c1.c1 c1Var = this.C;
        int i10 = e1Var.h(obj2, c1Var).f1643c;
        c1.d1 d1Var = this.B;
        e1Var.n(i10, d1Var);
        c1.e0 e0Var = d1Var.f1665k;
        h hVar = this.K;
        hVar.getClass();
        hVar.f5760d = f1.b0.O(e0Var.f1671a);
        hVar.f5763g = f1.b0.O(e0Var.f1672b);
        hVar.f5764h = f1.b0.O(e0Var.f1673c);
        float f10 = e0Var.f1674d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        hVar.f5767k = f10;
        float f11 = e0Var.f1675e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        hVar.f5766j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            hVar.f5760d = -9223372036854775807L;
        }
        hVar.a();
        if (j4 != -9223372036854775807L) {
            hVar.f5761e = f(e1Var, obj2, j4);
            hVar.a();
            return;
        }
        Object obj3 = d1Var.f1655a;
        if (!e1Var2.q()) {
            obj = e1Var2.n(e1Var2.h(wVar2.f10559a, c1Var).f1643c, d1Var).f1655a;
        } else {
            obj = null;
        }
        if (!f1.b0.a(obj, obj3) || z9) {
            hVar.f5761e = -9223372036854775807L;
            hVar.a();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        int i10;
        p0 p0Var2;
        int i11;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 0:
                    y();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    S(message.arg2, 1, z9, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    L((i0) message.obj);
                    break;
                case 4:
                    T((c1.t0) message.obj);
                    break;
                case 5:
                    this.M = (j1) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    A();
                    return true;
                case 8:
                    n((v1.u) message.obj);
                    break;
                case 9:
                    j((v1.u) message.obj);
                    break;
                case 10:
                    D();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    U(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    V(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    P(z11, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d1 d1Var = (d1) message.obj;
                    d1Var.getClass();
                    Looper looper = d1Var.f5702f;
                    Looper looper2 = this.A;
                    f1.x xVar = this.f5806y;
                    if (looper == looper2) {
                        synchronized (d1Var) {
                        }
                        try {
                            d1Var.f5697a.e(d1Var.f5700d, d1Var.f5701e);
                            d1Var.b(true);
                            int i13 = this.N.f5640e;
                            if (i13 == 3 || i13 == 2) {
                                xVar.d(2);
                                break;
                            }
                        } catch (Throwable th) {
                            d1Var.b(true);
                            throw th;
                        }
                    } else {
                        xVar.a(15, d1Var).a();
                        break;
                    }
                case 15:
                    N((d1) message.obj);
                    break;
                case 16:
                    c1.t0 t0Var = (c1.t0) message.obj;
                    o(t0Var, t0Var.f1894a, true, false);
                    break;
                case 17:
                    Q((f0) message.obj);
                    break;
                case 18:
                    a((f0) message.obj, message.arg1);
                    break;
                case 19:
                    a3.g.z(message.obj);
                    x();
                    throw null;
                case 20:
                    C(message.arg1, message.arg2, (v1.y0) message.obj);
                    break;
                case 21:
                    W((v1.y0) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    R(z12);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    D();
                    K(true);
                    break;
                case 26:
                    D();
                    K(true);
                    break;
                case 27:
                    f0(message.arg1, message.arg2, (List) message.obj);
                    break;
            }
        } catch (c1.r0 e10) {
            boolean z13 = e10.f1887a;
            int i14 = e10.f1888b;
            if (i14 == 1) {
                if (z13) {
                    i11 = 3001;
                } else {
                    i11 = 3003;
                }
            } else {
                if (i14 == 4) {
                    if (z13) {
                        i11 = 3002;
                    } else {
                        i11 = 3004;
                    }
                }
                k(e10, i12);
            }
            i12 = i11;
            k(e10, i12);
        } catch (h1.i e11) {
            k(e11, e11.f4583a);
        } catch (m e12) {
            m mVar = e12;
            int i15 = mVar.f5823c;
            r0 r0Var = this.I;
            if (i15 == 1 && (p0Var2 = r0Var.f5894j) != null) {
                mVar = mVar.a(p0Var2.f5862f.f5874a);
            }
            if (mVar.f5829z && (this.f5803f0 == null || (i10 = mVar.f1890a) == 5004 || i10 == 5003)) {
                f1.o.g("ExoPlayerImplInternal", "Recoverable renderer error", mVar);
                m mVar2 = this.f5803f0;
                if (mVar2 != null) {
                    mVar2.addSuppressed(mVar);
                    mVar = this.f5803f0;
                } else {
                    this.f5803f0 = mVar;
                }
                f1.x xVar2 = this.f5806y;
                xVar2.e(xVar2.a(25, mVar));
            } else {
                m mVar3 = this.f5803f0;
                if (mVar3 != null) {
                    mVar3.addSuppressed(mVar);
                    mVar = this.f5803f0;
                }
                m mVar4 = mVar;
                f1.o.d("ExoPlayerImplInternal", "Playback error", mVar4);
                if (mVar4.f5823c == 1 && r0Var.f5893i != r0Var.f5894j) {
                    while (true) {
                        p0Var = r0Var.f5893i;
                        if (p0Var == r0Var.f5894j) {
                            break;
                        }
                        r0Var.a();
                    }
                    p0Var.getClass();
                    q0 q0Var = p0Var.f5862f;
                    v1.w wVar = q0Var.f5874a;
                    long j4 = q0Var.f5875b;
                    this.N = p(wVar, j4, q0Var.f5876c, j4, true, 0);
                }
                b0(true, false);
                this.N = this.N.e(mVar4);
            }
        } catch (o1.j e13) {
            k(e13, e13.f8156a);
        } catch (v1.b e14) {
            k(e14, 1002);
        } catch (IOException e15) {
            k(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            m mVar5 = new m(2, i12, e16);
            f1.o.d("ExoPlayerImplInternal", "Playback error", mVar5);
            b0(true, false);
            this.N = this.N.e(mVar5);
        }
        v();
        return true;
    }

    @Override // v1.t
    public final void i(v1.u uVar) {
        this.f5806y.a(8, uVar).a();
    }

    public final void i0(boolean z9, boolean z10) {
        long elapsedRealtime;
        this.S = z9;
        if (z10) {
            elapsedRealtime = -9223372036854775807L;
        } else {
            ((f1.v) this.G).getClass();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.T = elapsedRealtime;
    }

    public final void j(v1.u uVar) {
        boolean z9;
        p0 p0Var = this.I.f5895k;
        boolean z10 = true;
        if (p0Var != null && p0Var.f5857a == uVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        long j4 = this.f5797c0;
        if (p0Var != null) {
            if (p0Var.f5868l != null) {
                z10 = false;
            }
            w7.b.u(z10);
            if (p0Var.f5860d) {
                p0Var.f5857a.v(j4 - p0Var.o);
            }
        }
        u();
    }

    public final synchronized void j0(n nVar, long j4) {
        ((f1.v) this.G).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
        boolean z9 = false;
        while (!((Boolean) nVar.get()).booleanValue() && j4 > 0) {
            try {
                this.G.getClass();
                wait(j4);
            } catch (InterruptedException unused) {
                z9 = true;
            }
            ((f1.v) this.G).getClass();
            j4 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final void k(IOException iOException, int i10) {
        m mVar = new m(0, i10, iOException);
        p0 p0Var = this.I.f5893i;
        if (p0Var != null) {
            mVar = mVar.a(p0Var.f5862f.f5874a);
        }
        f1.o.d("ExoPlayerImplInternal", "Playback error", mVar);
        b0(false, false);
        this.N = this.N.e(mVar);
    }

    public final void l(boolean z9) {
        v1.w wVar;
        long d10;
        p0 p0Var = this.I.f5895k;
        if (p0Var == null) {
            wVar = this.N.f5637b;
        } else {
            wVar = p0Var.f5862f.f5874a;
        }
        boolean z10 = !this.N.f5646k.equals(wVar);
        if (z10) {
            this.N = this.N.b(wVar);
        }
        b1 b1Var = this.N;
        if (p0Var == null) {
            d10 = b1Var.f5652r;
        } else {
            d10 = p0Var.d();
        }
        b1Var.f5650p = d10;
        b1 b1Var2 = this.N;
        long j4 = b1Var2.f5650p;
        p0 p0Var2 = this.I.f5895k;
        long j10 = 0;
        if (p0Var2 != null) {
            j10 = Math.max(0L, j4 - (this.f5797c0 - p0Var2.o));
        }
        b1Var2.f5651q = j10;
        if ((z10 || z9) && p0Var != null && p0Var.f5860d) {
            v1.w wVar2 = p0Var.f5862f.f5874a;
            e0(p0Var.f5870n);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void m(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void n(v1.u uVar) {
        boolean z9;
        r0 r0Var = this.I;
        p0 p0Var = r0Var.f5895k;
        if (p0Var != null && p0Var.f5857a == uVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        float f10 = this.E.h().f1894a;
        c1.e1 e1Var = this.N.f5636a;
        p0Var.f5860d = true;
        p0Var.f5869m = p0Var.f5857a.m();
        y1.w h10 = p0Var.h(f10, e1Var);
        q0 q0Var = p0Var.f5862f;
        long j4 = q0Var.f5875b;
        long j10 = q0Var.f5878e;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            j4 = Math.max(0L, j10 - 1);
        }
        long a10 = p0Var.a(h10, j4, false, new boolean[p0Var.f5865i.length]);
        long j11 = p0Var.o;
        q0 q0Var2 = p0Var.f5862f;
        p0Var.o = (q0Var2.f5875b - a10) + j11;
        p0Var.f5862f = q0Var2.b(a10);
        e0(p0Var.f5870n);
        if (p0Var == r0Var.f5893i) {
            G(p0Var.f5862f.f5875b);
            d();
            b1 b1Var = this.N;
            v1.w wVar = b1Var.f5637b;
            long j12 = p0Var.f5862f.f5875b;
            this.N = p(wVar, j12, b1Var.f5638c, j12, false, 5);
        }
        u();
    }

    public final void o(c1.t0 t0Var, float f10, boolean z9, boolean z10) {
        int i10;
        if (z9) {
            if (z10) {
                this.O.a(1);
            }
            this.N = this.N.f(t0Var);
        }
        float f11 = t0Var.f1894a;
        p0 p0Var = this.I.f5893i;
        while (true) {
            i10 = 0;
            if (p0Var == null) {
                break;
            }
            y1.s[] sVarArr = p0Var.f5870n.f11537c;
            int length = sVarArr.length;
            while (i10 < length) {
                y1.s sVar = sVarArr[i10];
                if (sVar != null) {
                    sVar.p(f11);
                }
                i10++;
            }
            p0Var = p0Var.f5868l;
        }
        g1[] g1VarArr = this.f5792a;
        int length2 = g1VarArr.length;
        while (i10 < length2) {
            g1 g1Var = g1VarArr[i10];
            if (g1Var != null) {
                g1Var.l(f10, t0Var.f1894a);
            }
            i10++;
        }
    }

    public final b1 p(v1.w wVar, long j4, long j10, long j11, boolean z9, int i10) {
        boolean z10;
        v1.g1 g1Var;
        y1.w wVar2;
        List list;
        long max;
        boolean z11;
        v1.g1 g1Var2;
        y1.w wVar3;
        n1 n1Var;
        boolean z12;
        boolean z13;
        if (!this.f5801e0 && j4 == this.N.f5652r && wVar.equals(this.N.f5637b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f5801e0 = z10;
        F();
        b1 b1Var = this.N;
        v1.g1 g1Var3 = b1Var.f5643h;
        y1.w wVar4 = b1Var.f5644i;
        List list2 = b1Var.f5645j;
        if (this.J.f5629k) {
            p0 p0Var = this.I.f5893i;
            if (p0Var == null) {
                g1Var2 = v1.g1.f10431d;
            } else {
                g1Var2 = p0Var.f5869m;
            }
            if (p0Var == null) {
                wVar3 = this.f5800e;
            } else {
                wVar3 = p0Var.f5870n;
            }
            y1.s[] sVarArr = wVar3.f11537c;
            r6.l0 l0Var = new r6.l0();
            boolean z14 = false;
            for (y1.s sVar : sVarArr) {
                if (sVar != null) {
                    c1.p0 p0Var2 = sVar.c(0).f1933k;
                    if (p0Var2 == null) {
                        l0Var.x0(new c1.p0(new c1.o0[0]));
                    } else {
                        l0Var.x0(p0Var2);
                        z14 = true;
                    }
                }
            }
            if (z14) {
                n1Var = l0Var.C0();
            } else {
                r6.m0 m0Var = r6.o0.f9505b;
                n1Var = n1.f9497e;
            }
            if (p0Var != null) {
                q0 q0Var = p0Var.f5862f;
                if (q0Var.f5876c != j10) {
                    p0Var.f5862f = q0Var.a(j10);
                }
            }
            p0 p0Var3 = this.I.f5893i;
            if (p0Var3 != null) {
                y1.w wVar5 = p0Var3.f5870n;
                int i11 = 0;
                boolean z15 = false;
                while (true) {
                    g1[] g1VarArr = this.f5792a;
                    if (i11 < g1VarArr.length) {
                        if (wVar5.b(i11)) {
                            if (((e) g1VarArr[i11]).f5707b != 1) {
                                z12 = false;
                                break;
                            }
                            if (wVar5.f11536b[i11].f5790a != 0) {
                                z15 = true;
                            }
                        }
                        i11++;
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (z15 && z12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != this.Z) {
                    this.Z = z13;
                    if (!z13 && this.N.o) {
                        this.f5806y.d(2);
                    }
                }
            }
            list = n1Var;
            g1Var = g1Var2;
            wVar2 = wVar3;
        } else if (!wVar.equals(b1Var.f5637b)) {
            g1Var = v1.g1.f10431d;
            wVar2 = this.f5800e;
            list = n1.f9497e;
        } else {
            g1Var = g1Var3;
            wVar2 = wVar4;
            list = list2;
        }
        if (z9) {
            g0 g0Var = this.O;
            if (g0Var.f5753d && g0Var.f5754e != 5) {
                if (i10 == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w7.b.g(z11);
            } else {
                g0Var.f5750a = true;
                g0Var.f5753d = true;
                g0Var.f5754e = i10;
            }
        }
        b1 b1Var2 = this.N;
        long j12 = b1Var2.f5650p;
        p0 p0Var4 = this.I.f5895k;
        if (p0Var4 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j12 - (this.f5797c0 - p0Var4.o));
        }
        return b1Var2.c(wVar, j4, j10, j11, max, g1Var, wVar2, list);
    }

    public final boolean q() {
        long h10;
        p0 p0Var = this.I.f5895k;
        if (p0Var == null) {
            return false;
        }
        if (!p0Var.f5860d) {
            h10 = 0;
        } else {
            h10 = p0Var.f5857a.h();
        }
        if (h10 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    @Override // v1.w0
    public final void s(v1.x0 x0Var) {
        this.f5806y.a(9, (v1.u) x0Var).a();
    }

    public final boolean t() {
        p0 p0Var = this.I.f5893i;
        long j4 = p0Var.f5862f.f5878e;
        if (p0Var.f5860d && (j4 == -9223372036854775807L || this.N.f5652r < j4 || !Y())) {
            return true;
        }
        return false;
    }

    public final void u() {
        long h10;
        long max;
        boolean c6;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (!q()) {
            c6 = false;
        } else {
            p0 p0Var = this.I.f5895k;
            if (!p0Var.f5860d) {
                h10 = 0;
            } else {
                h10 = p0Var.f5857a.h();
            }
            p0 p0Var2 = this.I.f5895k;
            if (p0Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, h10 - (this.f5797c0 - p0Var2.o));
            }
            if (p0Var != this.I.f5893i) {
                long j4 = p0Var.f5862f.f5875b;
            }
            c6 = ((i) this.f5802f).c(this.E.h().f1894a, max);
            if (!c6 && max < 500000 && this.D > 0) {
                this.I.f5893i.f5857a.u(this.N.f5652r);
                c6 = ((i) this.f5802f).c(this.E.h().f1894a, max);
            }
        }
        this.U = c6;
        if (c6) {
            p0 p0Var3 = this.I.f5895k;
            long j10 = this.f5797c0;
            float f10 = this.E.h().f1894a;
            long j11 = this.T;
            if (p0Var3.f5868l == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            long j12 = j10 - p0Var3.o;
            v1.u uVar = p0Var3.f5857a;
            m0 m0Var = new m0();
            m0Var.f5830a = j12;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            w7.b.g(z10);
            m0Var.f5831b = f10;
            if (j11 >= 0 || j11 == -9223372036854775807L) {
                z11 = true;
            }
            w7.b.g(z11);
            m0Var.f5832c = j11;
            uVar.n(new n0(m0Var));
        }
        d0();
    }

    public final void v() {
        boolean z9;
        g0 g0Var = this.O;
        b1 b1Var = this.N;
        boolean z10 = g0Var.f5750a;
        if (g0Var.f5751b != b1Var) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        g0Var.f5750a = z11;
        g0Var.f5751b = b1Var;
        if (z11) {
            d0 d0Var = this.H.f5903a;
            d0Var.f5680i.c(new f.m0(5, d0Var, g0Var));
            this.O = new g0(this.N);
        }
    }

    public final void w() {
        m(this.J.b(), true);
    }

    public final void x() {
        this.O.a(1);
        throw null;
    }

    public final void y() {
        int i10;
        this.O.a(1);
        int i11 = 0;
        E(false, false, false, true);
        ((i) this.f5802f).b(false);
        if (this.N.f5636a.q()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        X(i10);
        z1.g gVar = (z1.g) this.f5805x;
        gVar.getClass();
        a1 a1Var = this.J;
        w7.b.u(!a1Var.f5629k);
        a1Var.f5630l = gVar;
        while (true) {
            ArrayList arrayList = a1Var.f5620b;
            if (i11 < arrayList.size()) {
                z0 z0Var = (z0) arrayList.get(i11);
                a1Var.e(z0Var);
                a1Var.f5625g.add(z0Var);
                i11++;
            } else {
                a1Var.f5629k = true;
                this.f5806y.d(2);
                return;
            }
        }
    }

    public final synchronized boolean z() {
        if (!this.P && this.A.getThread().isAlive()) {
            this.f5806y.d(7);
            j0(new n(this, 4), this.L);
            return this.P;
        }
        return true;
    }
}
