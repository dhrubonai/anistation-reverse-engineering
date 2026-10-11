package x3;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class l implements g, Runnable, Comparable, q4.b {
    public com.bumptech.glide.g A;
    public w B;
    public int C;
    public int D;
    public o E;
    public v3.l F;
    public j G;
    public int H;
    public long I;
    public boolean J;
    public Object K;
    public Thread L;
    public v3.i M;
    public v3.i N;
    public Object O;
    public v3.a P;
    public com.bumptech.glide.load.data.e Q;
    public volatile h R;
    public volatile boolean S;
    public volatile boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: d, reason: collision with root package name */
    public final p f11222d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.c f11223e;

    /* renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.f f11226y;

    /* renamed from: z, reason: collision with root package name */
    public v3.i f11227z;

    /* renamed from: a, reason: collision with root package name */
    public final i f11219a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11220b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final q4.d f11221c = new q4.d();

    /* renamed from: f, reason: collision with root package name */
    public final k f11224f = new k();

    /* renamed from: x, reason: collision with root package name */
    public final l1.j f11225x = new l1.j();

    public l(p pVar, f0.c cVar) {
        this.f11222d = pVar;
        this.f11223e = cVar;
    }

    @Override // x3.g
    public final void a() {
        p(2);
    }

    @Override // x3.g
    public final void b(v3.i iVar, Object obj, com.bumptech.glide.load.data.e eVar, v3.a aVar, v3.i iVar2) {
        this.M = iVar;
        this.O = obj;
        this.Q = eVar;
        this.P = aVar;
        this.N = iVar2;
        boolean z9 = false;
        if (iVar != this.f11219a.a().get(0)) {
            z9 = true;
        }
        this.U = z9;
        if (Thread.currentThread() != this.L) {
            p(3);
        } else {
            g();
        }
    }

    @Override // q4.b
    public final q4.d c() {
        return this.f11221c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int ordinal = this.A.ordinal() - lVar.A.ordinal();
        if (ordinal == 0) {
            return this.H - lVar.H;
        }
        return ordinal;
    }

    @Override // x3.g
    public final void d(v3.i iVar, Exception exc, com.bumptech.glide.load.data.e eVar, v3.a aVar) {
        eVar.c();
        a0 a0Var = new a0("Fetching data failed", Collections.singletonList(exc));
        Class a10 = eVar.a();
        a0Var.f11142b = iVar;
        a0Var.f11143c = aVar;
        a0Var.f11144d = a10;
        this.f11220b.add(a0Var);
        if (Thread.currentThread() != this.L) {
            p(2);
        } else {
            q();
        }
    }

    public final e0 e(com.bumptech.glide.load.data.e eVar, Object obj, v3.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i10 = p4.g.f8564b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            e0 f10 = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j(elapsedRealtimeNanos, "Decoded result " + f10, null);
            }
            return f10;
        } finally {
            eVar.c();
        }
    }

    public final e0 f(Object obj, v3.a aVar) {
        boolean z9;
        Class<?> cls = obj.getClass();
        i iVar = this.f11219a;
        c0 c6 = iVar.c(cls);
        v3.l lVar = this.F;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != v3.a.RESOURCE_DISK_CACHE && !iVar.f11208r) {
                z9 = false;
            } else {
                z9 = true;
            }
            v3.k kVar = e4.p.f3506i;
            Boolean bool = (Boolean) lVar.c(kVar);
            if (bool == null || (bool.booleanValue() && !z9)) {
                lVar = new v3.l();
                p4.c cVar = this.F.f10650b;
                p4.c cVar2 = lVar.f10650b;
                cVar2.i(cVar);
                cVar2.put(kVar, Boolean.valueOf(z9));
            }
        }
        v3.l lVar2 = lVar;
        com.bumptech.glide.load.data.g h10 = this.f11226y.b().h(obj);
        try {
            return c6.a(this.C, this.D, new androidx.appcompat.widget.a0(this, aVar, 25), lVar2, h10);
        } finally {
            h10.c();
        }
    }

    public final void g() {
        e0 e0Var;
        boolean z9;
        if (Log.isLoggable("DecodeJob", 2)) {
            j(this.I, "Retrieved data", "data: " + this.O + ", cache key: " + this.M + ", fetcher: " + this.Q);
        }
        d0 d0Var = null;
        try {
            e0Var = e(this.Q, this.O, this.P);
        } catch (a0 e10) {
            v3.i iVar = this.N;
            v3.a aVar = this.P;
            e10.f11142b = iVar;
            e10.f11143c = aVar;
            e10.f11144d = null;
            this.f11220b.add(e10);
            e0Var = null;
        }
        if (e0Var != null) {
            v3.a aVar2 = this.P;
            boolean z10 = this.U;
            if (e0Var instanceof b0) {
                ((b0) e0Var).a();
            }
            boolean z11 = true;
            if (((d0) this.f11224f.f11218c) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                d0Var = (d0) d0.f11157e.j();
                w7.b.q(d0Var);
                d0Var.f11161d = false;
                d0Var.f11160c = true;
                d0Var.f11159b = e0Var;
                e0Var = d0Var;
            }
            s();
            u uVar = (u) this.G;
            synchronized (uVar) {
                uVar.H = e0Var;
                uVar.I = aVar2;
                uVar.P = z10;
            }
            uVar.h();
            this.V = 5;
            try {
                k kVar = this.f11224f;
                if (((d0) kVar.f11218c) == null) {
                    z11 = false;
                }
                if (z11) {
                    kVar.a(this.f11222d, this.F);
                }
                l();
                return;
            } finally {
                if (d0Var != null) {
                    d0Var.a();
                }
            }
        }
        q();
    }

    public final h h() {
        int b10 = p.j.b(this.V);
        i iVar = this.f11219a;
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(r.f.p(this.V)));
                }
                return new i0(iVar, this);
            }
            return new e(iVar.a(), iVar, this);
        }
        return new f0(iVar, this);
    }

    public final int i(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            boolean z9 = false;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(r.f.p(i10)));
                    }
                    if (this.J) {
                        return 6;
                    }
                    return 4;
                }
                switch (((n) this.E).f11233d) {
                    case 1:
                        break;
                    default:
                        z9 = true;
                        break;
                }
                if (z9) {
                    return 3;
                }
                return i(3);
            }
            switch (((n) this.E).f11233d) {
                case 1:
                case 2:
                    break;
                default:
                    z9 = true;
                    break;
            }
            if (z9) {
                return 2;
            }
            return i(2);
        }
        throw null;
    }

    public final void j(long j4, String str, String str2) {
        String str3;
        StringBuilder a10 = p.j.a(str, " in ");
        a10.append(p4.g.a(j4));
        a10.append(", load key: ");
        a10.append(this.B);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        a10.append(str3);
        a10.append(", thread: ");
        a10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", a10.toString());
    }

    public final void k() {
        s();
        a0 a0Var = new a0("Failed to load resource", new ArrayList(this.f11220b));
        u uVar = (u) this.G;
        synchronized (uVar) {
            uVar.K = a0Var;
        }
        uVar.g();
        m();
    }

    public final void l() {
        boolean b10;
        l1.j jVar = this.f11225x;
        synchronized (jVar) {
            jVar.f6676b = true;
            b10 = jVar.b();
        }
        if (b10) {
            o();
        }
    }

    public final void m() {
        boolean b10;
        l1.j jVar = this.f11225x;
        synchronized (jVar) {
            jVar.f6677c = true;
            b10 = jVar.b();
        }
        if (b10) {
            o();
        }
    }

    public final void n() {
        boolean b10;
        l1.j jVar = this.f11225x;
        synchronized (jVar) {
            jVar.f6675a = true;
            b10 = jVar.b();
        }
        if (b10) {
            o();
        }
    }

    public final void o() {
        l1.j jVar = this.f11225x;
        synchronized (jVar) {
            jVar.f6676b = false;
            jVar.f6675a = false;
            jVar.f6677c = false;
        }
        k kVar = this.f11224f;
        kVar.f11216a = null;
        kVar.f11217b = null;
        kVar.f11218c = null;
        i iVar = this.f11219a;
        iVar.f11194c = null;
        iVar.f11195d = null;
        iVar.f11205n = null;
        iVar.f11198g = null;
        iVar.f11202k = null;
        iVar.f11200i = null;
        iVar.o = null;
        iVar.f11201j = null;
        iVar.f11206p = null;
        iVar.f11192a.clear();
        iVar.f11203l = false;
        iVar.f11193b.clear();
        iVar.f11204m = false;
        this.S = false;
        this.f11226y = null;
        this.f11227z = null;
        this.F = null;
        this.A = null;
        this.B = null;
        this.G = null;
        this.V = 0;
        this.R = null;
        this.L = null;
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.I = 0L;
        this.T = false;
        this.K = null;
        this.f11220b.clear();
        this.f11223e.b(this);
    }

    public final void p(int i10) {
        a4.c cVar;
        this.W = i10;
        u uVar = (u) this.G;
        if (uVar.E) {
            cVar = uVar.f11261z;
        } else if (uVar.F) {
            cVar = uVar.A;
        } else {
            cVar = uVar.f11260y;
        }
        cVar.execute(this);
    }

    public final void q() {
        this.L = Thread.currentThread();
        int i10 = p4.g.f8564b;
        this.I = SystemClock.elapsedRealtimeNanos();
        boolean z9 = false;
        while (!this.T && this.R != null && !(z9 = this.R.c())) {
            this.V = i(this.V);
            this.R = h();
            if (this.V == 4) {
                p(2);
                return;
            }
        }
        if ((this.V == 6 || this.T) && !z9) {
            k();
        }
    }

    public final void r() {
        int b10 = p.j.b(this.W);
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 == 2) {
                    g();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(r.f.o(this.W)));
            }
            q();
            return;
        }
        this.V = i(1);
        this.R = h();
        q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.Q;
        try {
            try {
                if (this.T) {
                    k();
                    if (eVar != null) {
                        eVar.c();
                        return;
                    }
                    return;
                }
                r();
                if (eVar != null) {
                    eVar.c();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.c();
                }
                throw th;
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.T + ", stage: " + r.f.p(this.V), th2);
            }
            if (this.V != 5) {
                this.f11220b.add(th2);
                k();
            }
            if (!this.T) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void s() {
        Throwable th;
        this.f11221c.a();
        if (this.S) {
            if (this.f11220b.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f11220b;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.S = true;
    }
}
