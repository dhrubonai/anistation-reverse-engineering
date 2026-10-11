package m1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.lifecycle.q0;
import c1.f0;
import c1.k0;
import c1.l0;
import h1.e0;
import k1.i0;
import v1.b0;
import v1.u;
import v1.w;

/* loaded from: classes.dex */
public final class j extends v1.a {
    public z1.o A;
    public e0 B;
    public b C;
    public Handler D;
    public c1.e0 E;
    public Uri F;
    public final Uri G;
    public n1.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public k0 P;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7075h;

    /* renamed from: i, reason: collision with root package name */
    public final h1.g f7076i;

    /* renamed from: j, reason: collision with root package name */
    public final m f7077j;

    /* renamed from: k, reason: collision with root package name */
    public final j6.e f7078k;

    /* renamed from: l, reason: collision with root package name */
    public final o1.q f7079l;

    /* renamed from: m, reason: collision with root package name */
    public final q0 f7080m;

    /* renamed from: n, reason: collision with root package name */
    public final i.g f7081n;
    public final long o;

    /* renamed from: p, reason: collision with root package name */
    public final long f7082p;

    /* renamed from: q, reason: collision with root package name */
    public final b0 f7083q;

    /* renamed from: r, reason: collision with root package name */
    public final z1.q f7084r;

    /* renamed from: s, reason: collision with root package name */
    public final i f7085s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f7086t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f7087u;

    /* renamed from: v, reason: collision with root package name */
    public final e f7088v;

    /* renamed from: w, reason: collision with root package name */
    public final e f7089w;

    /* renamed from: x, reason: collision with root package name */
    public final f f7090x;

    /* renamed from: y, reason: collision with root package name */
    public final z1.p f7091y;

    /* renamed from: z, reason: collision with root package name */
    public h1.h f7092z;

    static {
        l0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [m1.e] */
    /* JADX WARN: Type inference failed for: r2v11, types: [m1.e] */
    public j(k0 k0Var, h1.g gVar, z1.q qVar, m mVar, j6.e eVar, o1.q qVar2, q0 q0Var, long j4, long j10) {
        this.P = k0Var;
        this.E = k0Var.f1770c;
        f0 f0Var = k0Var.f1769b;
        f0Var.getClass();
        Uri uri = f0Var.f1682a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f7076i = gVar;
        this.f7084r = qVar;
        this.f7077j = mVar;
        this.f7079l = qVar2;
        this.f7080m = q0Var;
        this.o = j4;
        this.f7082p = j10;
        this.f7078k = eVar;
        this.f7081n = new i.g(5);
        final int i10 = 0;
        this.f7075h = false;
        this.f7083q = a(null);
        this.f7086t = new Object();
        this.f7087u = new SparseArray();
        this.f7090x = new f(this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f7085s = new i(this, i10);
        this.f7091y = new f(this);
        this.f7088v = new Runnable(this) { // from class: m1.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f7060b;

            {
                this.f7060b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                j jVar = this.f7060b;
                switch (i11) {
                    case 0:
                        jVar.x();
                        return;
                    default:
                        jVar.w(false);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f7089w = new Runnable(this) { // from class: m1.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f7060b;

            {
                this.f7060b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                j jVar = this.f7060b;
                switch (i112) {
                    case 0:
                        jVar.x();
                        return;
                    default:
                        jVar.w(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(n1.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f7944c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            n1.a r2 = (n1.a) r2
            int r2 = r2.f7899b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j.t(n1.h):boolean");
    }

    @Override // v1.a
    public final u b(w wVar, z1.d dVar, long j4) {
        int intValue = ((Integer) wVar.f10559a).intValue() - this.O;
        b0 a10 = a(wVar);
        o1.n nVar = new o1.n(this.f10356d.f8164c, 0, wVar);
        int i10 = this.O + intValue;
        n1.c cVar = this.H;
        i.g gVar = this.f7081n;
        m mVar = this.f7077j;
        e0 e0Var = this.B;
        o1.q qVar = this.f7079l;
        q0 q0Var = this.f7080m;
        long j10 = this.L;
        z1.p pVar = this.f7091y;
        j6.e eVar = this.f7078k;
        f fVar = this.f7090x;
        i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        d dVar2 = new d(i10, cVar, gVar, intValue, mVar, e0Var, qVar, nVar, q0Var, a10, j10, pVar, dVar, eVar, fVar, i0Var);
        this.f7087u.put(i10, dVar2);
        return dVar2;
    }

    @Override // v1.a
    public final synchronized k0 h() {
        return this.P;
    }

    @Override // v1.a
    public final void j() {
        this.f7091y.b();
    }

    @Override // v1.a
    public final void l(e0 e0Var) {
        this.B = e0Var;
        Looper myLooper = Looper.myLooper();
        i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        o1.q qVar = this.f7079l;
        qVar.d(myLooper, i0Var);
        qVar.k();
        if (this.f7075h) {
            w(false);
            return;
        }
        this.f7092z = this.f7076i.a();
        this.A = new z1.o("DashMediaSource");
        this.D = f1.b0.l(null);
        x();
    }

    @Override // v1.a
    public final void n(u uVar) {
        d dVar = (d) uVar;
        t tVar = dVar.D;
        tVar.f7142z = true;
        tVar.f7137d.removeCallbacksAndMessages(null);
        for (w1.k kVar : dVar.I) {
            kVar.B(dVar);
        }
        dVar.H = null;
        this.f7087u.remove(dVar.f7050a);
    }

    @Override // v1.a
    public final void p() {
        n1.c cVar;
        this.I = false;
        this.f7092z = null;
        z1.o oVar = this.A;
        if (oVar != null) {
            oVar.f(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        if (this.f7075h) {
            cVar = this.H;
        } else {
            cVar = null;
        }
        this.H = cVar;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f7087u.clear();
        this.f7081n.f();
        this.f7079l.a();
    }

    @Override // v1.a
    public final synchronized void s(k0 k0Var) {
        this.P = k0Var;
    }

    public final void u() {
        boolean z9;
        z1.o oVar = this.A;
        f fVar = new f(this);
        synchronized (a2.b.f33b) {
            z9 = a2.b.f34c;
        }
        if (z9) {
            fVar.a();
            return;
        }
        if (oVar == null) {
            oVar = new z1.o("SntpClient");
        }
        oVar.g(new w1.o((Object) null), new i(fVar, 2), 1);
    }

    public final void v(z1.r rVar, long j4, long j10) {
        long j11 = rVar.f11945a;
        Uri uri = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        this.f7080m.getClass();
        this.f7083q.c(nVar, rVar.f11947c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f0, code lost:
    
        if (r10 != (-9223372036854775807L)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x035c, code lost:
    
        if (r12.f1648a == (-9223372036854775807L)) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r2v43, types: [y1.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(boolean r41) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j.w(boolean):void");
    }

    public final void x() {
        Uri uri;
        this.D.removeCallbacks(this.f7088v);
        if (this.A.d()) {
            return;
        }
        if (this.A.e()) {
            this.I = true;
            return;
        }
        synchronized (this.f7086t) {
            uri = this.F;
        }
        this.I = false;
        z1.r rVar = new z1.r(this.f7092z, uri, 4, this.f7084r);
        this.f7083q.l(new v1.n(rVar.f11945a, rVar.f11946b, this.A.g(rVar, this.f7085s, this.f7080m.z(4))), rVar.f11947c);
    }
}
