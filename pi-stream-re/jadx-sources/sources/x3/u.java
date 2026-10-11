package x3;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class u implements j, q4.b {
    public static final w1.o Q = new w1.o(19);
    public final a4.c A;
    public final AtomicInteger B;
    public v3.i C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public e0 H;
    public v3.a I;
    public boolean J;
    public a0 K;
    public boolean L;
    public y M;
    public l N;
    public volatile boolean O;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public final t f11253a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.d f11254b;

    /* renamed from: c, reason: collision with root package name */
    public final x f11255c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.c f11256d;

    /* renamed from: e, reason: collision with root package name */
    public final w1.o f11257e;

    /* renamed from: f, reason: collision with root package name */
    public final v f11258f;

    /* renamed from: x, reason: collision with root package name */
    public final a4.c f11259x;

    /* renamed from: y, reason: collision with root package name */
    public final a4.c f11260y;

    /* renamed from: z, reason: collision with root package name */
    public final a4.c f11261z;

    public u(a4.c cVar, a4.c cVar2, a4.c cVar3, a4.c cVar4, v vVar, x xVar, f0.c cVar5) {
        w1.o oVar = Q;
        this.f11253a = new t(new ArrayList(2));
        this.f11254b = new q4.d();
        this.B = new AtomicInteger();
        this.f11259x = cVar;
        this.f11260y = cVar2;
        this.f11261z = cVar3;
        this.A = cVar4;
        this.f11258f = vVar;
        this.f11255c = xVar;
        this.f11256d = cVar5;
        this.f11257e = oVar;
    }

    public final synchronized void a(l4.g gVar, Executor executor) {
        this.f11254b.a();
        t tVar = this.f11253a;
        tVar.getClass();
        tVar.f11252a.add(new s(gVar, executor));
        boolean z9 = true;
        char c6 = 1;
        if (this.J) {
            e(1);
            executor.execute(new r(this, gVar, c6 == true ? 1 : 0));
        } else {
            int i10 = 0;
            if (this.L) {
                e(1);
                executor.execute(new r(this, gVar, i10));
            } else {
                if (this.O) {
                    z9 = false;
                }
                w7.b.h(z9, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public final void b() {
        Map map;
        if (f()) {
            return;
        }
        this.O = true;
        l lVar = this.N;
        lVar.T = true;
        h hVar = lVar.R;
        if (hVar != null) {
            hVar.cancel();
        }
        v vVar = this.f11258f;
        v3.i iVar = this.C;
        q qVar = (q) vVar;
        synchronized (qVar) {
            h1.z zVar = qVar.f11240a;
            zVar.getClass();
            if (this.G) {
                map = zVar.f4647b;
            } else {
                map = zVar.f4646a;
            }
            if (equals(map.get(iVar))) {
                map.remove(iVar);
            }
        }
    }

    @Override // q4.b
    public final q4.d c() {
        return this.f11254b;
    }

    public final void d() {
        boolean z9;
        y yVar;
        synchronized (this) {
            this.f11254b.a();
            w7.b.h(f(), "Not yet complete!");
            int decrementAndGet = this.B.decrementAndGet();
            if (decrementAndGet >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.h(z9, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                yVar = this.M;
                i();
            } else {
                yVar = null;
            }
        }
        if (yVar != null) {
            yVar.c();
        }
    }

    public final synchronized void e(int i10) {
        y yVar;
        w7.b.h(f(), "Not yet complete!");
        if (this.B.getAndAdd(i10) == 0 && (yVar = this.M) != null) {
            yVar.a();
        }
    }

    public final boolean f() {
        if (!this.L && !this.J && !this.O) {
            return false;
        }
        return true;
    }

    public final void g() {
        synchronized (this) {
            this.f11254b.a();
            if (this.O) {
                i();
                return;
            }
            if (!this.f11253a.f11252a.isEmpty()) {
                if (!this.L) {
                    this.L = true;
                    v3.i iVar = this.C;
                    t tVar = this.f11253a;
                    tVar.getClass();
                    ArrayList<s> arrayList = new ArrayList(tVar.f11252a);
                    e(arrayList.size() + 1);
                    ((q) this.f11258f).e(this, iVar, null);
                    for (s sVar : arrayList) {
                        sVar.f11251b.execute(new r(this, sVar.f11250a, 0));
                    }
                    d();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            }
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
    }

    public final void h() {
        synchronized (this) {
            this.f11254b.a();
            if (this.O) {
                this.H.e();
                i();
                return;
            }
            if (!this.f11253a.f11252a.isEmpty()) {
                if (!this.J) {
                    w1.o oVar = this.f11257e;
                    e0 e0Var = this.H;
                    boolean z9 = this.D;
                    v3.i iVar = this.C;
                    x xVar = this.f11255c;
                    oVar.getClass();
                    this.M = new y(e0Var, z9, true, iVar, xVar);
                    int i10 = 1;
                    this.J = true;
                    t tVar = this.f11253a;
                    tVar.getClass();
                    ArrayList<s> arrayList = new ArrayList(tVar.f11252a);
                    e(arrayList.size() + 1);
                    ((q) this.f11258f).e(this, this.C, this.M);
                    for (s sVar : arrayList) {
                        sVar.f11251b.execute(new r(this, sVar.f11250a, i10));
                    }
                    d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            }
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    public final synchronized void i() {
        if (this.C != null) {
            this.f11253a.f11252a.clear();
            this.C = null;
            this.M = null;
            this.H = null;
            this.L = false;
            this.O = false;
            this.J = false;
            this.P = false;
            this.N.n();
            this.N = null;
            this.K = null;
            this.I = null;
            this.f11256d.b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void j(l4.g gVar) {
        boolean z9;
        this.f11254b.a();
        t tVar = this.f11253a;
        tVar.f11252a.remove(new s(gVar, z7.c.f12113g));
        if (this.f11253a.f11252a.isEmpty()) {
            b();
            if (!this.J && !this.L) {
                z9 = false;
                if (z9 && this.B.get() == 0) {
                    i();
                }
            }
            z9 = true;
            if (z9) {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        r0 = r3.f11259x;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void k(x3.l r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.N = r4     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            int r1 = r4.i(r0)     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            if (r1 == r2) goto L10
            r2 = 3
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L15
            a4.c r0 = r3.f11259x     // Catch: java.lang.Throwable -> L2a
            goto L25
        L15:
            boolean r0 = r3.E     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L1c
            a4.c r0 = r3.f11261z     // Catch: java.lang.Throwable -> L2a
            goto L25
        L1c:
            boolean r0 = r3.F     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L23
            a4.c r0 = r3.A     // Catch: java.lang.Throwable -> L2a
            goto L25
        L23:
            a4.c r0 = r3.f11260y     // Catch: java.lang.Throwable -> L2a
        L25:
            r0.execute(r4)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.u.k(x3.l):void");
    }
}
