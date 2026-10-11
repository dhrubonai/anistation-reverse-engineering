package x3;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.k4;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q implements v, z3.h, x {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f11239h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final h1.z f11240a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.o f11241b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.g f11242c;

    /* renamed from: d, reason: collision with root package name */
    public final k4 f11243d;

    /* renamed from: e, reason: collision with root package name */
    public final c1.r f11244e;

    /* renamed from: f, reason: collision with root package name */
    public final y.c f11245f;

    /* renamed from: g, reason: collision with root package name */
    public final c f11246g;

    public q(z3.g gVar, z3.d dVar, a4.c cVar, a4.c cVar2, a4.c cVar3, a4.c cVar4) {
        this.f11242c = gVar;
        p pVar = new p(dVar);
        c cVar5 = new c();
        this.f11246g = cVar5;
        synchronized (this) {
            synchronized (cVar5) {
                cVar5.f11153e = this;
            }
        }
        this.f11241b = new w1.o(20);
        this.f11240a = new h1.z(1);
        this.f11243d = new k4(cVar, cVar2, cVar3, cVar4, this, this);
        this.f11245f = new y.c(pVar);
        this.f11244e = new c1.r(4);
        gVar.f12047e = this;
    }

    public static void d(String str, long j4, v3.i iVar) {
        StringBuilder a10 = p.j.a(str, " in ");
        a10.append(p4.g.a(j4));
        a10.append("ms, key: ");
        a10.append(iVar);
        Log.v("Engine", a10.toString());
    }

    public static void g(e0 e0Var) {
        if (e0Var instanceof y) {
            ((y) e0Var).c();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final k a(com.bumptech.glide.f fVar, Object obj, v3.i iVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, o oVar, p4.c cVar, boolean z9, boolean z10, v3.l lVar, boolean z11, boolean z12, boolean z13, boolean z14, l4.g gVar2, Executor executor) {
        long j4;
        if (f11239h) {
            int i12 = p4.g.f8564b;
            j4 = SystemClock.elapsedRealtimeNanos();
        } else {
            j4 = 0;
        }
        long j10 = j4;
        this.f11241b.getClass();
        w wVar = new w(obj, iVar, i10, i11, cVar, cls, cls2, lVar);
        synchronized (this) {
            try {
                y c6 = c(wVar, z11, j10);
                if (c6 == null) {
                    return h(fVar, obj, iVar, i10, i11, cls, cls2, gVar, oVar, cVar, z9, z10, lVar, z11, z12, z13, z14, gVar2, executor, wVar, j10);
                }
                ((l4.h) gVar2).m(c6, v3.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y b(v3.i iVar) {
        y yVar;
        Object obj;
        z3.g gVar = this.f11242c;
        synchronized (gVar) {
            p4.h hVar = (p4.h) gVar.f8567a.remove(iVar);
            yVar = null;
            if (hVar == null) {
                obj = null;
            } else {
                gVar.f8569c -= hVar.f8566b;
                obj = hVar.f8565a;
            }
        }
        e0 e0Var = (e0) obj;
        if (e0Var != null) {
            if (e0Var instanceof y) {
                yVar = (y) e0Var;
            } else {
                yVar = new y(e0Var, true, true, iVar, this);
            }
        }
        if (yVar != null) {
            yVar.a();
            this.f11246g.a(iVar, yVar);
        }
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y c(w wVar, boolean z9, long j4) {
        y yVar;
        if (!z9) {
            return null;
        }
        c cVar = this.f11246g;
        synchronized (cVar) {
            b bVar = (b) cVar.f11151c.get(wVar);
            if (bVar == null) {
                yVar = null;
            } else {
                yVar = (y) bVar.get();
                if (yVar == null) {
                    cVar.b(bVar);
                }
            }
        }
        if (yVar != null) {
            yVar.a();
        }
        if (yVar != null) {
            if (f11239h) {
                d("Loaded resource from active resources", j4, wVar);
            }
            return yVar;
        }
        y b10 = b(wVar);
        if (b10 == null) {
            return null;
        }
        if (f11239h) {
            d("Loaded resource from cache", j4, wVar);
        }
        return b10;
    }

    public final synchronized void e(u uVar, v3.i iVar, y yVar) {
        Map map;
        if (yVar != null) {
            if (yVar.f11271a) {
                this.f11246g.a(iVar, yVar);
            }
        }
        h1.z zVar = this.f11240a;
        zVar.getClass();
        if (uVar.G) {
            map = zVar.f4647b;
        } else {
            map = zVar.f4646a;
        }
        if (uVar.equals(map.get(iVar))) {
            map.remove(iVar);
        }
    }

    public final void f(v3.i iVar, y yVar) {
        c cVar = this.f11246g;
        synchronized (cVar) {
            b bVar = (b) cVar.f11151c.remove(iVar);
            if (bVar != null) {
                bVar.f11148c = null;
                bVar.clear();
            }
        }
        if (yVar.f11271a) {
        } else {
            this.f11244e.f(yVar, false);
        }
    }

    public final k h(com.bumptech.glide.f fVar, Object obj, v3.i iVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, o oVar, p4.c cVar, boolean z9, boolean z10, v3.l lVar, boolean z11, boolean z12, boolean z13, boolean z14, l4.g gVar2, Executor executor, w wVar, long j4) {
        h1.z zVar = this.f11240a;
        u uVar = (u) (z14 ? zVar.f4647b : zVar.f4646a).get(wVar);
        if (uVar != null) {
            uVar.a(gVar2, executor);
            if (f11239h) {
                d("Added to existing load", j4, wVar);
            }
            return new k(this, gVar2, uVar);
        }
        u uVar2 = (u) ((f0.c) this.f11243d.f557g).j();
        w7.b.q(uVar2);
        synchronized (uVar2) {
            uVar2.C = wVar;
            uVar2.D = z11;
            uVar2.E = z12;
            uVar2.F = z13;
            uVar2.G = z14;
        }
        y.c cVar2 = this.f11245f;
        l lVar2 = (l) ((f0.c) cVar2.f11425c).j();
        w7.b.q(lVar2);
        int i12 = cVar2.f11423a;
        cVar2.f11423a = i12 + 1;
        i iVar2 = lVar2.f11219a;
        iVar2.f11194c = fVar;
        iVar2.f11195d = obj;
        iVar2.f11205n = iVar;
        iVar2.f11196e = i10;
        iVar2.f11197f = i11;
        iVar2.f11206p = oVar;
        iVar2.f11198g = cls;
        iVar2.f11199h = lVar2.f11222d;
        iVar2.f11202k = cls2;
        iVar2.o = gVar;
        iVar2.f11200i = lVar;
        iVar2.f11201j = cVar;
        iVar2.f11207q = z9;
        iVar2.f11208r = z10;
        lVar2.f11226y = fVar;
        lVar2.f11227z = iVar;
        lVar2.A = gVar;
        lVar2.B = wVar;
        lVar2.C = i10;
        lVar2.D = i11;
        lVar2.E = oVar;
        lVar2.J = z14;
        lVar2.F = lVar;
        lVar2.G = uVar2;
        lVar2.H = i12;
        lVar2.W = 1;
        lVar2.K = obj;
        h1.z zVar2 = this.f11240a;
        zVar2.getClass();
        (uVar2.G ? zVar2.f4647b : zVar2.f4646a).put(wVar, uVar2);
        uVar2.a(gVar2, executor);
        uVar2.k(lVar2);
        if (f11239h) {
            d("Started new load", j4, wVar);
        }
        return new k(this, gVar2, uVar2);
    }
}
