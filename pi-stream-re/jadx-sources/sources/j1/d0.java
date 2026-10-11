package j1;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.appcompat.widget.x3;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import c1.m1;
import c1.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import r6.n1;

/* loaded from: classes.dex */
public final class d0 extends c1.i implements p {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f5664i0 = 0;
    public final x3 A;
    public final x3 B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public final j1 J;
    public v1.y0 K;
    public c1.v0 L;
    public c1.n0 M;
    public AudioTrack N;
    public Object O;
    public Surface P;
    public SurfaceHolder Q;
    public c2.k R;
    public boolean S;
    public TextureView T;
    public final int U;
    public f1.u V;
    public final int W;
    public final c1.g X;
    public float Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public e1.c f5665a0;

    /* renamed from: b, reason: collision with root package name */
    public final y1.w f5666b;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f5667b0;

    /* renamed from: c, reason: collision with root package name */
    public final c1.v0 f5668c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5669c0;

    /* renamed from: d, reason: collision with root package name */
    public final c1.r f5670d = new c1.r(1);

    /* renamed from: d0, reason: collision with root package name */
    public p1 f5671d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5672e;

    /* renamed from: e0, reason: collision with root package name */
    public c1.n0 f5673e0;

    /* renamed from: f, reason: collision with root package name */
    public final c1.z0 f5674f;

    /* renamed from: f0, reason: collision with root package name */
    public b1 f5675f0;

    /* renamed from: g, reason: collision with root package name */
    public final g1[] f5676g;

    /* renamed from: g0, reason: collision with root package name */
    public int f5677g0;

    /* renamed from: h, reason: collision with root package name */
    public final y1.v f5678h;

    /* renamed from: h0, reason: collision with root package name */
    public long f5679h0;

    /* renamed from: i, reason: collision with root package name */
    public final f1.x f5680i;

    /* renamed from: j, reason: collision with root package name */
    public final t f5681j;

    /* renamed from: k, reason: collision with root package name */
    public final j0 f5682k;

    /* renamed from: l, reason: collision with root package name */
    public final r.e f5683l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f5684m;

    /* renamed from: n, reason: collision with root package name */
    public final c1.c1 f5685n;
    public final ArrayList o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5686p;

    /* renamed from: q, reason: collision with root package name */
    public final k1.a f5687q;

    /* renamed from: r, reason: collision with root package name */
    public final Looper f5688r;

    /* renamed from: s, reason: collision with root package name */
    public final z1.c f5689s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5690t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5691u;

    /* renamed from: v, reason: collision with root package name */
    public final f1.v f5692v;

    /* renamed from: w, reason: collision with root package name */
    public final z f5693w;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f5694x;

    /* renamed from: y, reason: collision with root package name */
    public final i4.v f5695y;

    /* renamed from: z, reason: collision with root package name */
    public final d f5696z;

    static {
        c1.l0.a("media3.exoplayer");
    }

    public d0(o oVar) {
        boolean z9;
        k1.i0 a10;
        boolean z10;
        try {
            f1.o.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.3.1] [" + f1.b0.f3803e + "]");
            this.f5672e = oVar.f5838a.getApplicationContext();
            this.f5687q = (k1.a) oVar.f5845h.apply(oVar.f5839b);
            this.X = oVar.f5847j;
            this.U = oVar.f5848k;
            this.Z = false;
            this.C = oVar.f5854r;
            z zVar = new z(this);
            this.f5693w = zVar;
            this.f5694x = new a0();
            Handler handler = new Handler(oVar.f5846i);
            g1[] createRenderers = ((DefaultRenderersFactory) oVar.f5840c.get()).createRenderers(handler, zVar, zVar, zVar, zVar);
            this.f5676g = createRenderers;
            if (createRenderers.length > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.u(z9);
            this.f5678h = (y1.v) oVar.f5842e.get();
            this.f5689s = (z1.c) oVar.f5844g.get();
            this.f5686p = oVar.f5849l;
            this.J = oVar.f5850m;
            this.f5690t = oVar.f5851n;
            this.f5691u = oVar.o;
            Looper looper = oVar.f5846i;
            this.f5688r = looper;
            f1.v vVar = oVar.f5839b;
            this.f5692v = vVar;
            this.f5674f = this;
            this.f5683l = new r.e(looper, vVar, new t(this));
            this.f5684m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.K = new v1.y0();
            this.f5666b = new y1.w(new i1[createRenderers.length], new y1.s[createRenderers.length], m1.f1835b, null);
            this.f5685n = new c1.c1();
            c1.r rVar = new c1.r(0);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 20; i10++) {
                rVar.a(iArr[i10]);
            }
            this.f5678h.getClass();
            rVar.a(29);
            c1.s b10 = rVar.b();
            this.f5668c = new c1.v0(b10);
            c1.r rVar2 = new c1.r(0);
            for (int i11 = 0; i11 < b10.b(); i11++) {
                rVar2.a(b10.a(i11));
            }
            rVar2.a(4);
            rVar2.a(10);
            this.L = new c1.v0(rVar2.b());
            this.f5680i = this.f5692v.a(this.f5688r, null);
            t tVar = new t(this);
            this.f5681j = tVar;
            this.f5675f0 = b1.i(this.f5666b);
            ((k1.a0) this.f5687q).X(this.f5674f, this.f5688r);
            int i12 = f1.b0.f3799a;
            if (i12 < 31) {
                a10 = new k1.i0();
            } else {
                a10 = y.a(this.f5672e, this, oVar.f5855s);
            }
            this.f5682k = new j0(this.f5676g, this.f5678h, this.f5666b, (l0) oVar.f5843f.get(), this.f5689s, this.D, this.E, this.f5687q, this.J, oVar.f5852p, oVar.f5853q, false, this.f5688r, this.f5692v, tVar, a10);
            this.Y = 1.0f;
            this.D = 0;
            c1.n0 n0Var = c1.n0.G;
            this.M = n0Var;
            this.f5673e0 = n0Var;
            int i13 = -1;
            this.f5677g0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.N;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.N.release();
                    this.N = null;
                }
                if (this.N == null) {
                    this.N = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.W = this.N.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f5672e.getSystemService("audio");
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.W = i13;
            }
            this.f5665a0 = e1.c.f3363b;
            this.f5667b0 = true;
            k1.a aVar = this.f5687q;
            aVar.getClass();
            this.f5683l.a(aVar);
            z1.c cVar = this.f5689s;
            Handler handler2 = new Handler(this.f5688r);
            k1.a aVar2 = this.f5687q;
            z1.g gVar = (z1.g) cVar;
            gVar.getClass();
            aVar2.getClass();
            f.p0 p0Var = gVar.f11912b;
            p0Var.getClass();
            p0Var.H(aVar2);
            ((CopyOnWriteArrayList) p0Var.f3762b).add(new z1.b(handler2, aVar2));
            this.f5684m.add(this.f5693w);
            i4.v vVar2 = new i4.v(oVar.f5838a, handler, this.f5693w);
            this.f5695y = vVar2;
            vVar2.i(false);
            d dVar = new d(oVar.f5838a, handler, this.f5693w);
            this.f5696z = dVar;
            dVar.c();
            x3 x3Var = new x3(oVar.f5838a, 1);
            this.A = x3Var;
            x3Var.e();
            x3 x3Var2 = new x3(oVar.f5838a, 2);
            this.B = x3Var2;
            x3Var2.e();
            q();
            this.f5671d0 = p1.f1878e;
            this.V = f1.u.f3861c;
            y1.v vVar3 = this.f5678h;
            c1.g gVar2 = this.X;
            y1.p pVar = (y1.p) vVar3;
            synchronized (pVar.f11517c) {
                z10 = !pVar.f11523i.equals(gVar2);
                pVar.f11523i = gVar2;
            }
            if (z10) {
                pVar.i();
            }
            S(Integer.valueOf(this.W), 1, 10);
            S(Integer.valueOf(this.W), 2, 10);
            S(this.X, 1, 3);
            S(Integer.valueOf(this.U), 2, 4);
            S(0, 2, 5);
            S(Boolean.valueOf(this.Z), 1, 9);
            S(this.f5694x, 2, 7);
            S(this.f5694x, 6, 8);
        } finally {
            this.f5670d.e();
        }
    }

    public static long H(b1 b1Var) {
        c1.d1 d1Var = new c1.d1();
        c1.c1 c1Var = new c1.c1();
        b1Var.f5636a.h(b1Var.f5637b.f10559a, c1Var);
        long j4 = b1Var.f5638c;
        if (j4 == -9223372036854775807L) {
            return b1Var.f5636a.n(c1Var.f1643c, d1Var).f1667m;
        }
        return c1Var.f1645e + j4;
    }

    public static c1.n q() {
        c1.m mVar = new c1.m();
        mVar.f1807b = 0;
        mVar.f1808c = 0;
        return new c1.n(mVar);
    }

    public final c1.e1 A() {
        h0();
        return this.f5675f0.f5636a;
    }

    public final m1 B() {
        h0();
        return this.f5675f0.f5644i.f11538d;
    }

    public final int C(b1 b1Var) {
        if (b1Var.f5636a.q()) {
            return this.f5677g0;
        }
        return b1Var.f5636a.h(b1Var.f5637b.f10559a, this.f5685n).f1643c;
    }

    public final long D() {
        h0();
        if (L()) {
            b1 b1Var = this.f5675f0;
            v1.w wVar = b1Var.f5637b;
            c1.e1 e1Var = b1Var.f5636a;
            Object obj = wVar.f10559a;
            c1.c1 c1Var = this.f5685n;
            e1Var.h(obj, c1Var);
            return f1.b0.c0(c1Var.a(wVar.f10560b, wVar.f10561c));
        }
        return a();
    }

    public final boolean E() {
        h0();
        return this.f5675f0.f5647l;
    }

    public final c1.t0 F() {
        h0();
        return this.f5675f0.f5649n;
    }

    public final int G() {
        h0();
        return this.f5675f0.f5640e;
    }

    public final y1.j I() {
        y1.j jVar;
        h0();
        y1.p pVar = (y1.p) this.f5678h;
        synchronized (pVar.f11517c) {
            jVar = pVar.f11521g;
        }
        return jVar;
    }

    public final y1.v J() {
        h0();
        return this.f5678h;
    }

    public final boolean K() {
        return true;
    }

    public final boolean L() {
        h0();
        return this.f5675f0.f5637b.b();
    }

    public final b1 M(b1 b1Var, c1.e1 e1Var, Pair pair) {
        boolean z9;
        v1.w wVar;
        v1.g1 g1Var;
        y1.w wVar2;
        List list;
        long j4;
        if (!e1Var.q() && pair == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.g(z9);
        c1.e1 e1Var2 = b1Var.f5636a;
        long t9 = t(b1Var);
        b1 h10 = b1Var.h(e1Var);
        if (e1Var.q()) {
            v1.w wVar3 = b1.f5635t;
            long O = f1.b0.O(this.f5679h0);
            b1 b10 = h10.c(wVar3, O, O, O, 0L, v1.g1.f10431d, this.f5666b, n1.f9497e).b(wVar3);
            b10.f5650p = b10.f5652r;
            return b10;
        }
        Object obj = h10.f5637b.f10559a;
        boolean z10 = !obj.equals(pair.first);
        if (z10) {
            wVar = new v1.w(pair.first);
        } else {
            wVar = h10.f5637b;
        }
        v1.w wVar4 = wVar;
        long longValue = ((Long) pair.second).longValue();
        long O2 = f1.b0.O(t9);
        if (!e1Var2.q()) {
            O2 -= e1Var2.h(obj, this.f5685n).f1645e;
        }
        if (!z10 && longValue >= O2) {
            if (longValue == O2) {
                int b11 = e1Var.b(h10.f5646k.f10559a);
                if (b11 == -1 || e1Var.g(b11, this.f5685n, false).f1643c != e1Var.h(wVar4.f10559a, this.f5685n).f1643c) {
                    e1Var.h(wVar4.f10559a, this.f5685n);
                    if (wVar4.b()) {
                        j4 = this.f5685n.a(wVar4.f10560b, wVar4.f10561c);
                    } else {
                        j4 = this.f5685n.f1644d;
                    }
                    b1 b12 = h10.c(wVar4, h10.f5652r, h10.f5652r, h10.f5639d, j4 - h10.f5652r, h10.f5643h, h10.f5644i, h10.f5645j).b(wVar4);
                    b12.f5650p = j4;
                    return b12;
                }
                return h10;
            }
            w7.b.u(!wVar4.b());
            long max = Math.max(0L, h10.f5651q - (longValue - O2));
            long j10 = h10.f5650p;
            if (h10.f5646k.equals(h10.f5637b)) {
                j10 = longValue + max;
            }
            b1 c6 = h10.c(wVar4, longValue, longValue, longValue, max, h10.f5643h, h10.f5644i, h10.f5645j);
            c6.f5650p = j10;
            return c6;
        }
        w7.b.u(!wVar4.b());
        if (z10) {
            g1Var = v1.g1.f10431d;
        } else {
            g1Var = h10.f5643h;
        }
        v1.g1 g1Var2 = g1Var;
        if (z10) {
            wVar2 = this.f5666b;
        } else {
            wVar2 = h10.f5644i;
        }
        y1.w wVar5 = wVar2;
        if (z10) {
            r6.m0 m0Var = r6.o0.f9505b;
            list = n1.f9497e;
        } else {
            list = h10.f5645j;
        }
        b1 b13 = h10.c(wVar4, longValue, longValue, longValue, 0L, g1Var2, wVar5, list).b(wVar4);
        b13.f5650p = longValue;
        return b13;
    }

    public final Pair N(c1.e1 e1Var, int i10, long j4) {
        if (e1Var.q()) {
            this.f5677g0 = i10;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.f5679h0 = j4;
            return null;
        }
        if (i10 == -1 || i10 >= e1Var.p()) {
            i10 = e1Var.a(this.E);
            j4 = f1.b0.c0(e1Var.n(i10, this.f1711a).f1667m);
        }
        return e1Var.j(this.f1711a, this.f5685n, i10, f1.b0.O(j4));
    }

    public final void O(final int i10, final int i11) {
        f1.u uVar = this.V;
        if (i10 != uVar.f3862a || i11 != uVar.f3863b) {
            this.V = new f1.u(i10, i11);
            this.f5683l.l(24, new f1.l() { // from class: j1.u
                @Override // f1.l
                public final void invoke(Object obj) {
                    ((c1.x0) obj).E(i10, i11);
                }
            });
            S(new f1.u(i10, i11), 2, 14);
        }
    }

    public final void P() {
        int i10;
        h0();
        boolean E = E();
        int i11 = 2;
        int e10 = this.f5696z.e(2, E);
        if (E && e10 != 1) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        d0(e10, i10, E);
        b1 b1Var = this.f5675f0;
        if (b1Var.f5640e != 1) {
            return;
        }
        b1 e11 = b1Var.e(null);
        if (e11.f5636a.q()) {
            i11 = 4;
        }
        b1 g10 = e11.g(i11);
        this.F++;
        f1.x xVar = this.f5682k.f5806y;
        xVar.getClass();
        f1.w b10 = f1.x.b();
        b10.f3864a = xVar.f3866a.obtainMessage(0);
        b10.a();
        e0(g10, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Q(c1.x0 x0Var) {
        h0();
        x0Var.getClass();
        r.e eVar = this.f5683l;
        eVar.m();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) eVar.f9266f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            f1.n nVar = (f1.n) it.next();
            if (nVar.f3834a.equals(x0Var)) {
                f1.m mVar = (f1.m) eVar.f9265e;
                nVar.f3837d = true;
                if (nVar.f3836c) {
                    nVar.f3836c = false;
                    mVar.b(nVar.f3834a, nVar.f3835b.b());
                }
                copyOnWriteArraySet.remove(nVar);
            }
        }
    }

    public final void R() {
        c2.k kVar = this.R;
        z zVar = this.f5693w;
        if (kVar != null) {
            d1 r8 = r(this.f5694x);
            w7.b.u(!r8.f5703g);
            r8.f5700d = 10000;
            w7.b.u(!r8.f5703g);
            r8.f5701e = null;
            r8.c();
            this.R.f2015a.remove(zVar);
            this.R = null;
        }
        TextureView textureView = this.T;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != zVar) {
                f1.o.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.T.setSurfaceTextureListener(null);
            }
            this.T = null;
        }
        SurfaceHolder surfaceHolder = this.Q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(zVar);
            this.Q = null;
        }
    }

    public final void S(Object obj, int i10, int i11) {
        for (g1 g1Var : this.f5676g) {
            if (((e) g1Var).f5707b == i10) {
                d1 r8 = r(g1Var);
                w7.b.u(!r8.f5703g);
                r8.f5700d = i11;
                w7.b.u(!r8.f5703g);
                r8.f5701e = obj;
                r8.c();
            }
        }
    }

    public final void T(v1.a aVar) {
        h0();
        List singletonList = Collections.singletonList(aVar);
        h0();
        h0();
        C(this.f5675f0);
        y();
        this.F++;
        ArrayList arrayList = this.o;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            v1.y0 y0Var = this.K;
            int i11 = size + 0;
            int[] iArr = y0Var.f10570b;
            int[] iArr2 = new int[iArr.length - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 >= 0 && i14 < size) {
                    i12++;
                } else {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= i11;
                    }
                    iArr2[i15] = i14;
                }
            }
            this.K = new v1.y0(iArr2, new Random(y0Var.f10569a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < singletonList.size(); i16++) {
            z0 z0Var = new z0((v1.a) singletonList.get(i16), this.f5686p);
            arrayList2.add(z0Var);
            arrayList.add(i16 + 0, new b0(z0Var.f5934b, z0Var.f5933a));
        }
        this.K = this.K.a(arrayList2.size());
        f1 f1Var = new f1(arrayList, this.K);
        boolean q9 = f1Var.q();
        int i17 = f1Var.f5738d;
        if (!q9 && -1 >= i17) {
            throw new c1.w();
        }
        int a10 = f1Var.a(this.E);
        b1 M = M(this.f5675f0, f1Var, N(f1Var, a10, -9223372036854775807L));
        int i18 = M.f5640e;
        if (a10 != -1 && i18 != 1) {
            i18 = (f1Var.q() || a10 >= i17) ? 4 : 2;
        }
        b1 g10 = M.g(i18);
        this.f5682k.f5806y.a(17, new f0(arrayList2, this.K, a10, f1.b0.O(-9223372036854775807L))).a();
        if (!this.f5675f0.f5637b.f10559a.equals(g10.f5637b.f10559a) && !this.f5675f0.f5636a.q()) {
            z9 = true;
        }
        e0(g10, 0, 1, z9, 4, z(g10), -1, false);
    }

    public final void U(SurfaceHolder surfaceHolder) {
        this.S = false;
        this.Q = surfaceHolder;
        surfaceHolder.addCallback(this.f5693w);
        Surface surface = this.Q.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.Q.getSurfaceFrame();
            O(surfaceFrame.width(), surfaceFrame.height());
        } else {
            O(0, 0);
        }
    }

    public final void V(boolean z9) {
        h0();
        int e10 = this.f5696z.e(G(), z9);
        int i10 = 1;
        if (z9 && e10 != 1) {
            i10 = 2;
        }
        d0(e10, i10, z9);
    }

    public final void W(c1.t0 t0Var) {
        h0();
        if (this.f5675f0.f5649n.equals(t0Var)) {
            return;
        }
        b1 f10 = this.f5675f0.f(t0Var);
        this.F++;
        this.f5682k.f5806y.a(4, t0Var).a();
        e0(f10, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void X(int i10) {
        h0();
        if (this.D != i10) {
            this.D = i10;
            f1.x xVar = this.f5682k.f5806y;
            xVar.getClass();
            f1.w b10 = f1.x.b();
            b10.f3864a = xVar.f3866a.obtainMessage(11, i10, 0);
            b10.a();
            h3.e eVar = new h3.e(i10);
            r.e eVar2 = this.f5683l;
            eVar2.j(8, eVar);
            c0();
            eVar2.g();
        }
    }

    public final void Y(c1.k1 k1Var) {
        y1.j jVar;
        h0();
        y1.v vVar = this.f5678h;
        vVar.getClass();
        y1.p pVar = (y1.p) vVar;
        synchronized (pVar.f11517c) {
            jVar = pVar.f11521g;
        }
        if (k1Var.equals(jVar)) {
            return;
        }
        if (k1Var instanceof y1.j) {
            pVar.o((y1.j) k1Var);
        }
        y1.i iVar = new y1.i(pVar.g());
        iVar.b(k1Var);
        pVar.o(new y1.j(iVar));
        this.f5683l.l(19, new w.f(k1Var, 3));
    }

    public final void Z(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        for (g1 g1Var : this.f5676g) {
            if (((e) g1Var).f5707b == 2) {
                d1 r8 = r(g1Var);
                w7.b.u(!r8.f5703g);
                r8.f5700d = 1;
                w7.b.u(true ^ r8.f5703g);
                r8.f5701e = obj;
                r8.c();
                arrayList.add(r8);
            }
        }
        Object obj2 = this.O;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).a(this.C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z9 = true;
            }
            Object obj3 = this.O;
            Surface surface = this.P;
            if (obj3 == surface) {
                surface.release();
                this.P = null;
            }
        }
        this.O = obj;
        if (z9) {
            b0(new m(2, 1003, new k0(3)));
        }
    }

    public final void a0(float f10) {
        h0();
        final float g10 = f1.b0.g(f10, 0.0f, 1.0f);
        if (this.Y == g10) {
            return;
        }
        this.Y = g10;
        S(Float.valueOf(this.f5696z.f5662g * g10), 1, 2);
        this.f5683l.l(22, new f1.l() { // from class: j1.v
            @Override // f1.l
            public final void invoke(Object obj) {
                ((c1.x0) obj).v(g10);
            }
        });
    }

    public final void b0(m mVar) {
        b1 b1Var = this.f5675f0;
        b1 b10 = b1Var.b(b1Var.f5637b);
        b10.f5650p = b10.f5652r;
        b10.f5651q = 0L;
        b1 g10 = b10.g(1);
        if (mVar != null) {
            g10 = g10.e(mVar);
        }
        b1 b1Var2 = g10;
        this.F++;
        f1.x xVar = this.f5682k.f5806y;
        xVar.getClass();
        f1.w b11 = f1.x.b();
        b11.f3864a = xVar.f3866a.obtainMessage(6);
        b11.a();
        e0(b1Var2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void c0() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        c1.v0 v0Var = this.L;
        int i10 = f1.b0.f3799a;
        d0 d0Var = (d0) this.f5674f;
        boolean L = d0Var.L();
        boolean g10 = d0Var.g();
        boolean z17 = false;
        if (d0Var.c() != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (d0Var.b() != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean f10 = d0Var.f();
        boolean e10 = d0Var.e();
        boolean q9 = d0Var.A().q();
        c1.u0 u0Var = new c1.u0();
        c1.s sVar = this.f5668c.f1948a;
        c1.r rVar = u0Var.f1922a;
        rVar.getClass();
        for (int i11 = 0; i11 < sVar.b(); i11++) {
            rVar.a(sVar.a(i11));
        }
        boolean z18 = !L;
        u0Var.a(4, z18);
        if (g10 && !L) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0Var.a(5, z11);
        if (z9 && !L) {
            z12 = true;
        } else {
            z12 = false;
        }
        u0Var.a(6, z12);
        if (!q9 && ((z9 || !f10 || g10) && !L)) {
            z13 = true;
        } else {
            z13 = false;
        }
        u0Var.a(7, z13);
        if (z10 && !L) {
            z14 = true;
        } else {
            z14 = false;
        }
        u0Var.a(8, z14);
        if (!q9 && ((z10 || (f10 && e10)) && !L)) {
            z15 = true;
        } else {
            z15 = false;
        }
        u0Var.a(9, z15);
        u0Var.a(10, z18);
        if (g10 && !L) {
            z16 = true;
        } else {
            z16 = false;
        }
        u0Var.a(11, z16);
        if (g10 && !L) {
            z17 = true;
        }
        u0Var.a(12, z17);
        c1.v0 v0Var2 = new c1.v0(rVar.b());
        this.L = v0Var2;
        if (!v0Var2.equals(v0Var)) {
            this.f5683l.j(13, new t(this));
        }
    }

    public final void d0(int i10, int i11, boolean z9) {
        boolean z10;
        int i12 = 1;
        if (z9 && i10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i10 == 1) {
            i12 = 0;
        }
        b1 b1Var = this.f5675f0;
        if (b1Var.f5647l == z10 && b1Var.f5648m == i12) {
            return;
        }
        f0(i11, i12, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(final j1.b1 r39, final int r40, final int r41, boolean r42, int r43, long r44, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d0.e0(j1.b1, int, int, boolean, int, long, int, boolean):void");
    }

    public final void f0(int i10, int i11, boolean z9) {
        this.F++;
        b1 b1Var = this.f5675f0;
        if (b1Var.o) {
            b1Var = b1Var.a();
        }
        b1 d10 = b1Var.d(i11, z9);
        f1.x xVar = this.f5682k.f5806y;
        xVar.getClass();
        f1.w b10 = f1.x.b();
        b10.f3864a = xVar.f3866a.obtainMessage(1, z9 ? 1 : 0, i11);
        b10.a();
        e0(d10, 0, i10, false, 5, -9223372036854775807L, -1, false);
    }

    public final void g0() {
        int G = G();
        x3 x3Var = this.B;
        x3 x3Var2 = this.A;
        boolean z9 = true;
        if (G != 1) {
            if (G != 2 && G != 3) {
                if (G != 4) {
                    throw new IllegalStateException();
                }
            } else {
                h0();
                boolean z10 = this.f5675f0.o;
                if (!E() || z10) {
                    z9 = false;
                }
                x3Var2.f(z9);
                x3Var.f(E());
                return;
            }
        }
        x3Var2.f(false);
        x3Var.f(false);
    }

    public final void h0() {
        IllegalStateException illegalStateException;
        c1.r rVar = this.f5670d;
        synchronized (rVar) {
            boolean z9 = false;
            while (!rVar.f1885a) {
                try {
                    rVar.wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f5688r.getThread()) {
            String m5 = f1.b0.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f5688r.getThread().getName());
            if (!this.f5667b0) {
                if (this.f5669c0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                f1.o.g("ExoPlayerImpl", m5, illegalStateException);
                this.f5669c0 = true;
                return;
            }
            throw new IllegalStateException(m5);
        }
    }

    @Override // c1.i
    public final void i(int i10, long j4, boolean z9) {
        boolean z10;
        h0();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        k1.a0 a0Var = (k1.a0) this.f5687q;
        if (!a0Var.f6321z) {
            k1.b R = a0Var.R();
            a0Var.f6321z = true;
            a0Var.W(R, -1, new k1.j(R, 0));
        }
        c1.e1 e1Var = this.f5675f0.f5636a;
        if (!e1Var.q() && i10 >= e1Var.p()) {
            return;
        }
        this.F++;
        if (L()) {
            f1.o.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            g0 g0Var = new g0(this.f5675f0);
            g0Var.a(1);
            d0 d0Var = this.f5681j.f5903a;
            d0Var.f5680i.c(new f.m0(5, d0Var, g0Var));
            return;
        }
        b1 b1Var = this.f5675f0;
        int i11 = b1Var.f5640e;
        if (i11 == 3 || (i11 == 4 && !e1Var.q())) {
            b1Var = this.f5675f0.g(2);
        }
        int w9 = w();
        b1 M = M(b1Var, e1Var, N(e1Var, i10, j4));
        this.f5682k.f5806y.a(3, new i0(e1Var, i10, f1.b0.O(j4))).a();
        e0(M, 0, 1, true, 1, z(M), w9, z9);
    }

    public final c1.n0 o() {
        byte[] bArr;
        c1.e1 A = A();
        if (A.q()) {
            return this.f5673e0;
        }
        c1.k0 k0Var = A.n(w(), this.f1711a).f1657c;
        c1.n0 n0Var = this.f5673e0;
        n0Var.getClass();
        c1.m0 m0Var = new c1.m0(n0Var);
        c1.n0 n0Var2 = k0Var.f1771d;
        if (n0Var2 != null) {
            CharSequence charSequence = n0Var2.f1841a;
            if (charSequence != null) {
                m0Var.f1810a = charSequence;
            }
            CharSequence charSequence2 = n0Var2.f1842b;
            if (charSequence2 != null) {
                m0Var.f1811b = charSequence2;
            }
            CharSequence charSequence3 = n0Var2.f1843c;
            if (charSequence3 != null) {
                m0Var.f1812c = charSequence3;
            }
            CharSequence charSequence4 = n0Var2.f1844d;
            if (charSequence4 != null) {
                m0Var.f1813d = charSequence4;
            }
            CharSequence charSequence5 = n0Var2.f1845e;
            if (charSequence5 != null) {
                m0Var.f1814e = charSequence5;
            }
            CharSequence charSequence6 = n0Var2.f1846f;
            if (charSequence6 != null) {
                m0Var.f1815f = charSequence6;
            }
            CharSequence charSequence7 = n0Var2.f1847g;
            if (charSequence7 != null) {
                m0Var.f1816g = charSequence7;
            }
            byte[] bArr2 = n0Var2.f1848h;
            Uri uri = n0Var2.f1850j;
            if (uri != null || bArr2 != null) {
                m0Var.f1819j = uri;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                m0Var.f1817h = bArr;
                m0Var.f1818i = n0Var2.f1849i;
            }
            Integer num = n0Var2.f1851k;
            if (num != null) {
                m0Var.f1820k = num;
            }
            Integer num2 = n0Var2.f1852l;
            if (num2 != null) {
                m0Var.f1821l = num2;
            }
            Integer num3 = n0Var2.f1853m;
            if (num3 != null) {
                m0Var.f1822m = num3;
            }
            Boolean bool = n0Var2.f1854n;
            if (bool != null) {
                m0Var.f1823n = bool;
            }
            Boolean bool2 = n0Var2.o;
            if (bool2 != null) {
                m0Var.o = bool2;
            }
            Integer num4 = n0Var2.f1855p;
            if (num4 != null) {
                m0Var.f1824p = num4;
            }
            Integer num5 = n0Var2.f1856q;
            if (num5 != null) {
                m0Var.f1824p = num5;
            }
            Integer num6 = n0Var2.f1857r;
            if (num6 != null) {
                m0Var.f1825q = num6;
            }
            Integer num7 = n0Var2.f1858s;
            if (num7 != null) {
                m0Var.f1826r = num7;
            }
            Integer num8 = n0Var2.f1859t;
            if (num8 != null) {
                m0Var.f1827s = num8;
            }
            Integer num9 = n0Var2.f1860u;
            if (num9 != null) {
                m0Var.f1828t = num9;
            }
            Integer num10 = n0Var2.f1861v;
            if (num10 != null) {
                m0Var.f1829u = num10;
            }
            CharSequence charSequence8 = n0Var2.f1862w;
            if (charSequence8 != null) {
                m0Var.f1830v = charSequence8;
            }
            CharSequence charSequence9 = n0Var2.f1863x;
            if (charSequence9 != null) {
                m0Var.f1831w = charSequence9;
            }
            CharSequence charSequence10 = n0Var2.f1864y;
            if (charSequence10 != null) {
                m0Var.f1832x = charSequence10;
            }
            Integer num11 = n0Var2.f1865z;
            if (num11 != null) {
                m0Var.f1833y = num11;
            }
            Integer num12 = n0Var2.A;
            if (num12 != null) {
                m0Var.f1834z = num12;
            }
            CharSequence charSequence11 = n0Var2.B;
            if (charSequence11 != null) {
                m0Var.A = charSequence11;
            }
            CharSequence charSequence12 = n0Var2.C;
            if (charSequence12 != null) {
                m0Var.B = charSequence12;
            }
            CharSequence charSequence13 = n0Var2.D;
            if (charSequence13 != null) {
                m0Var.C = charSequence13;
            }
            Integer num13 = n0Var2.E;
            if (num13 != null) {
                m0Var.D = num13;
            }
            Bundle bundle = n0Var2.F;
            if (bundle != null) {
                m0Var.E = bundle;
            }
        }
        return new c1.n0(m0Var);
    }

    public final void p() {
        h0();
        R();
        Z(null);
        O(0, 0);
    }

    public final d1 r(c1 c1Var) {
        int C = C(this.f5675f0);
        c1.e1 e1Var = this.f5675f0.f5636a;
        if (C == -1) {
            C = 0;
        }
        f1.v vVar = this.f5692v;
        j0 j0Var = this.f5682k;
        return new d1(j0Var, c1Var, e1Var, C, vVar, j0Var.A);
    }

    public final long s() {
        h0();
        if (this.f5675f0.f5636a.q()) {
            return this.f5679h0;
        }
        b1 b1Var = this.f5675f0;
        if (b1Var.f5646k.f10562d != b1Var.f5637b.f10562d) {
            return f1.b0.c0(b1Var.f5636a.n(w(), this.f1711a).f1668n);
        }
        long j4 = b1Var.f5650p;
        if (this.f5675f0.f5646k.b()) {
            b1 b1Var2 = this.f5675f0;
            c1.c1 h10 = b1Var2.f5636a.h(b1Var2.f5646k.f10559a, this.f5685n);
            long d10 = h10.d(this.f5675f0.f5646k.f10560b);
            if (d10 == Long.MIN_VALUE) {
                j4 = h10.f1644d;
            } else {
                j4 = d10;
            }
        }
        b1 b1Var3 = this.f5675f0;
        c1.e1 e1Var = b1Var3.f5636a;
        Object obj = b1Var3.f5646k.f10559a;
        c1.c1 c1Var = this.f5685n;
        e1Var.h(obj, c1Var);
        return f1.b0.c0(j4 + c1Var.f1645e);
    }

    public final long t(b1 b1Var) {
        if (b1Var.f5637b.b()) {
            Object obj = b1Var.f5637b.f10559a;
            c1.e1 e1Var = b1Var.f5636a;
            c1.c1 c1Var = this.f5685n;
            e1Var.h(obj, c1Var);
            long j4 = b1Var.f5638c;
            if (j4 == -9223372036854775807L) {
                return f1.b0.c0(e1Var.n(C(b1Var), this.f1711a).f1667m);
            }
            return f1.b0.c0(c1Var.f1645e) + f1.b0.c0(j4);
        }
        return f1.b0.c0(z(b1Var));
    }

    public final int u() {
        h0();
        if (L()) {
            return this.f5675f0.f5637b.f10560b;
        }
        return -1;
    }

    public final int v() {
        h0();
        if (L()) {
            return this.f5675f0.f5637b.f10561c;
        }
        return -1;
    }

    public final int w() {
        h0();
        int C = C(this.f5675f0);
        if (C == -1) {
            return 0;
        }
        return C;
    }

    public final int x() {
        h0();
        if (this.f5675f0.f5636a.q()) {
            return 0;
        }
        b1 b1Var = this.f5675f0;
        return b1Var.f5636a.b(b1Var.f5637b.f10559a);
    }

    public final long y() {
        h0();
        return f1.b0.c0(z(this.f5675f0));
    }

    public final long z(b1 b1Var) {
        long j4;
        if (b1Var.f5636a.q()) {
            return f1.b0.O(this.f5679h0);
        }
        if (b1Var.o) {
            j4 = b1Var.j();
        } else {
            j4 = b1Var.f5652r;
        }
        if (b1Var.f5637b.b()) {
            return j4;
        }
        c1.e1 e1Var = b1Var.f5636a;
        Object obj = b1Var.f5637b.f10559a;
        c1.c1 c1Var = this.f5685n;
        e1Var.h(obj, c1Var);
        return j4 + c1Var.f1645e;
    }
}
