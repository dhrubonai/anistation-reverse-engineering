package k1;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import c1.c1;
import c1.d1;
import c1.e1;
import c1.k0;
import c1.k1;
import c1.m1;
import c1.n0;
import c1.p0;
import c1.p1;
import c1.t0;
import c1.v0;
import c1.w0;
import c1.y0;
import c1.z0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final f1.a f6313a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f6314b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f6315c;

    /* renamed from: d, reason: collision with root package name */
    public final z f6316d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f6317e;

    /* renamed from: f, reason: collision with root package name */
    public r.e f6318f;

    /* renamed from: x, reason: collision with root package name */
    public z0 f6319x;

    /* renamed from: y, reason: collision with root package name */
    public f1.x f6320y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6321z;

    public a0(f1.a aVar) {
        aVar.getClass();
        this.f6313a = aVar;
        int i10 = f1.b0.f3799a;
        Looper myLooper = Looper.myLooper();
        this.f6318f = new r.e(myLooper == null ? Looper.getMainLooper() : myLooper, aVar, new j1.l(3));
        c1 c1Var = new c1();
        this.f6314b = c1Var;
        this.f6315c = new d1();
        this.f6316d = new z(c1Var);
        this.f6317e = new SparseArray();
    }

    @Override // o1.o
    public final void A(int i10, v1.w wVar, Exception exc) {
        b U = U(i10, wVar);
        W(U, 1024, new y(U, exc, 3));
    }

    @Override // v1.c0
    public final void B(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        b U = U(i10, wVar);
        W(U, 1000, new o(U, nVar, sVar, 0));
    }

    @Override // c1.x0
    public final void C(boolean z9) {
        b R = R();
        W(R, 9, new s(2, R, z9));
    }

    @Override // v1.c0
    public final void D(int i10, v1.w wVar, final v1.n nVar, final v1.s sVar, final IOException iOException, final boolean z9) {
        final b U = U(i10, wVar);
        W(U, 1003, new f1.l(U, nVar, sVar, iOException, z9) { // from class: k1.l

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v1.s f6387a;

            {
                this.f6387a = sVar;
            }

            @Override // f1.l
            public final void invoke(Object obj) {
                f0 f0Var = (f0) ((c) obj);
                f0Var.getClass();
                f0Var.f6374v = this.f6387a.f10525a;
            }
        });
    }

    @Override // c1.x0
    public final void E(final int i10, final int i11) {
        final b V = V();
        W(V, 24, new f1.l(V, i10, i11) { // from class: k1.k
            @Override // f1.l
            public final void invoke(Object obj) {
                ((c) obj).getClass();
            }
        });
    }

    @Override // v1.c0
    public final void F(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        b U = U(i10, wVar);
        W(U, 1001, new o(U, nVar, sVar, 2));
    }

    @Override // c1.x0
    public final void G(j1.m mVar) {
        b R;
        v1.w wVar;
        if ((mVar instanceof j1.m) && (wVar = mVar.f5828y) != null) {
            R = T(wVar);
        } else {
            R = R();
        }
        W(R, 10, new h(R, mVar, 1));
    }

    @Override // c1.x0
    public final void H(k1 k1Var) {
        b R = R();
        W(R, 19, new x(10, R, k1Var));
    }

    @Override // c1.x0
    public final void I() {
    }

    @Override // c1.x0
    public final void J(p1 p1Var) {
        b V = V();
        W(V, 25, new x(9, V, p1Var));
    }

    @Override // c1.x0
    public final void K(k0 k0Var, int i10) {
        b R = R();
        W(R, 1, new j1.s(R, k0Var, i10));
    }

    @Override // o1.o
    public final void L(int i10, v1.w wVar) {
        b U = U(i10, wVar);
        W(U, 1026, new j(U, 5));
    }

    @Override // c1.x0
    public final void M(n0 n0Var) {
        b R = R();
        W(R, 14, new x(8, R, n0Var));
    }

    @Override // c1.x0
    public final void N(m1 m1Var) {
        b R = R();
        W(R, 2, new x(3, R, m1Var));
    }

    @Override // o1.o
    public final void O(int i10, v1.w wVar) {
        b U = U(i10, wVar);
        W(U, 1023, new j(U, 4));
    }

    @Override // o1.o
    public final /* synthetic */ void P() {
    }

    @Override // c1.x0
    public final void Q(boolean z9) {
        b R = R();
        W(R, 7, new s(1, R, z9));
    }

    public final b R() {
        return T(this.f6316d.f6410d);
    }

    public final b S(e1 e1Var, int i10, v1.w wVar) {
        v1.w wVar2;
        boolean z9;
        long c02;
        if (e1Var.q()) {
            wVar2 = null;
        } else {
            wVar2 = wVar;
        }
        ((f1.v) this.f6313a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = true;
        if (e1Var.equals(((j1.d0) this.f6319x).A()) && i10 == ((j1.d0) this.f6319x).w()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (wVar2 != null && wVar2.b()) {
            if (!z9 || ((j1.d0) this.f6319x).u() != wVar2.f10560b || ((j1.d0) this.f6319x).v() != wVar2.f10561c) {
                z10 = false;
            }
            if (z10) {
                c02 = ((j1.d0) this.f6319x).y();
            }
            c02 = 0;
        } else if (z9) {
            j1.d0 d0Var = (j1.d0) this.f6319x;
            d0Var.h0();
            c02 = d0Var.t(d0Var.f5675f0);
        } else {
            if (!e1Var.q()) {
                c02 = f1.b0.c0(e1Var.n(i10, this.f6315c).f1667m);
            }
            c02 = 0;
        }
        v1.w wVar3 = this.f6316d.f6410d;
        e1 A = ((j1.d0) this.f6319x).A();
        int w9 = ((j1.d0) this.f6319x).w();
        long y9 = ((j1.d0) this.f6319x).y();
        j1.d0 d0Var2 = (j1.d0) this.f6319x;
        d0Var2.h0();
        return new b(elapsedRealtime, e1Var, i10, wVar2, c02, A, w9, wVar3, y9, f1.b0.c0(d0Var2.f5675f0.f5651q));
    }

    public final b T(v1.w wVar) {
        e1 e1Var;
        boolean z9;
        this.f6319x.getClass();
        if (wVar == null) {
            e1Var = null;
        } else {
            e1Var = (e1) this.f6316d.f6409c.get(wVar);
        }
        if (wVar != null && e1Var != null) {
            return S(e1Var, e1Var.h(wVar.f10559a, this.f6314b).f1643c, wVar);
        }
        int w9 = ((j1.d0) this.f6319x).w();
        e1 A = ((j1.d0) this.f6319x).A();
        if (w9 < A.p()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            A = e1.f1676a;
        }
        return S(A, w9, null);
    }

    public final b U(int i10, v1.w wVar) {
        this.f6319x.getClass();
        boolean z9 = true;
        if (wVar != null) {
            if (((e1) this.f6316d.f6409c.get(wVar)) == null) {
                z9 = false;
            }
            if (z9) {
                return T(wVar);
            }
            return S(e1.f1676a, i10, wVar);
        }
        e1 A = ((j1.d0) this.f6319x).A();
        if (i10 >= A.p()) {
            z9 = false;
        }
        if (!z9) {
            A = e1.f1676a;
        }
        return S(A, i10, null);
    }

    public final b V() {
        return T(this.f6316d.f6412f);
    }

    public final void W(b bVar, int i10, f1.l lVar) {
        this.f6317e.put(i10, bVar);
        this.f6318f.l(i10, lVar);
    }

    public final void X(z0 z0Var, Looper looper) {
        boolean z9;
        if (this.f6319x != null && !this.f6316d.f6408b.isEmpty()) {
            z9 = false;
        } else {
            z9 = true;
        }
        w7.b.u(z9);
        z0Var.getClass();
        this.f6319x = z0Var;
        this.f6320y = ((f1.v) this.f6313a).a(looper, null);
        r.e eVar = this.f6318f;
        x xVar = new x(4, this, z0Var);
        this.f6318f = new r.e((CopyOnWriteArraySet) eVar.f9266f, looper, (f1.a) eVar.f9263c, xVar, eVar.f9262b);
    }

    @Override // c1.x0
    public final void a(int i10) {
        b R = R();
        W(R, 6, new r(R, i10, 0));
    }

    @Override // c1.x0
    public final void b(c1.n nVar) {
        b R = R();
        W(R, 29, new x(2, R, nVar));
    }

    @Override // c1.x0
    public final void c(int i10) {
        z0 z0Var = this.f6319x;
        z0Var.getClass();
        z zVar = this.f6316d;
        zVar.f6410d = z.b(z0Var, zVar.f6408b, zVar.f6411e, zVar.f6407a);
        zVar.d(((j1.d0) z0Var).A());
        b R = R();
        W(R, 0, new r(R, i10, 2));
    }

    @Override // c1.x0
    public final void d(w0 w0Var) {
    }

    @Override // c1.x0
    public final void e(j1.m mVar) {
        b R;
        v1.w wVar;
        if ((mVar instanceof j1.m) && (wVar = mVar.f5828y) != null) {
            R = T(wVar);
        } else {
            R = R();
        }
        W(R, 10, new h(R, mVar, 0));
    }

    @Override // c1.x0
    public final void f(final int i10, final y0 y0Var, final y0 y0Var2) {
        if (i10 == 1) {
            this.f6321z = false;
        }
        z0 z0Var = this.f6319x;
        z0Var.getClass();
        z zVar = this.f6316d;
        zVar.f6410d = z.b(z0Var, zVar.f6408b, zVar.f6411e, zVar.f6407a);
        final b R = R();
        W(R, 11, new f1.l(i10, y0Var, y0Var2, R) { // from class: k1.e

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6352a;

            @Override // f1.l
            public final void invoke(Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                f0 f0Var = (f0) cVar;
                int i11 = this.f6352a;
                if (i11 == 1) {
                    f0Var.f6373u = true;
                }
                f0Var.f6364k = i11;
            }
        });
    }

    @Override // v1.c0
    public final void g(int i10, v1.w wVar, v1.s sVar) {
        b U = U(i10, wVar);
        W(U, 1004, new m(U, sVar, 1));
    }

    @Override // c1.x0
    public final void h() {
    }

    @Override // v1.c0
    public final void i(int i10, v1.w wVar, v1.s sVar) {
        b U = U(i10, wVar);
        W(U, 1005, new m(U, sVar, 0));
    }

    @Override // c1.x0
    public final void j(v0 v0Var) {
        b R = R();
        W(R, 13, new x(1, R, v0Var));
    }

    @Override // c1.x0
    public final void k(int i10) {
        b R = R();
        W(R, 8, new r(R, i10, 1));
    }

    @Override // o1.o
    public final void l(int i10, v1.w wVar) {
        b U = U(i10, wVar);
        W(U, 1027, new j(U, 1));
    }

    @Override // c1.x0
    public final void m(boolean z9) {
        b R = R();
        W(R, 3, new s(0, R, z9));
    }

    @Override // c1.x0
    public final void n() {
    }

    @Override // c1.x0
    public final void o(e1.c cVar) {
        b R = R();
        W(R, 27, new x(7, R, cVar));
    }

    @Override // c1.x0
    public final void p(boolean z9) {
        b V = V();
        W(V, 23, new s(3, V, z9));
    }

    @Override // v1.c0
    public final void q(int i10, v1.w wVar, v1.n nVar, v1.s sVar) {
        b U = U(i10, wVar);
        W(U, 1002, new o(U, nVar, sVar, 1));
    }

    @Override // c1.x0
    public final void r(p0 p0Var) {
        b R = R();
        W(R, 28, new x(6, R, p0Var));
    }

    @Override // c1.x0
    public final void s(List list) {
        b R = R();
        W(R, 27, new x(5, R, list));
    }

    @Override // c1.x0
    public final void t(int i10, boolean z9) {
        b R = R();
        W(R, -1, new u(R, z9, i10, 0));
    }

    @Override // c1.x0
    public final void u(int i10, boolean z9) {
        b R = R();
        W(R, 5, new u(R, z9, i10, 2));
    }

    @Override // c1.x0
    public final void v(final float f10) {
        final b V = V();
        W(V, 22, new f1.l(V, f10) { // from class: k1.w
            @Override // f1.l
            public final void invoke(Object obj) {
                ((c) obj).getClass();
            }
        });
    }

    @Override // o1.o
    public final void w(int i10, v1.w wVar) {
        b U = U(i10, wVar);
        W(U, 1025, new j(U, 3));
    }

    @Override // c1.x0
    public final void x(t0 t0Var) {
        b R = R();
        W(R, 12, new x(0, R, t0Var));
    }

    @Override // o1.o
    public final void y(int i10, v1.w wVar, int i11) {
        b U = U(i10, wVar);
        W(U, 1022, new r(U, i11, 4));
    }

    @Override // c1.x0
    public final void z(int i10) {
        b R = R();
        W(R, 4, new r(R, i10, 3));
    }
}
