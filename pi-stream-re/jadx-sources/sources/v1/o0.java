package v1;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes.dex */
public final class o0 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final h1.g f10489h;

    /* renamed from: i, reason: collision with root package name */
    public final w.f f10490i;

    /* renamed from: j, reason: collision with root package name */
    public final o1.q f10491j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.q0 f10492k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10493l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10494m = true;

    /* renamed from: n, reason: collision with root package name */
    public long f10495n = -9223372036854775807L;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10496p;

    /* renamed from: q, reason: collision with root package name */
    public h1.e0 f10497q;

    /* renamed from: r, reason: collision with root package name */
    public c1.k0 f10498r;

    public o0(c1.k0 k0Var, h1.g gVar, w.f fVar, o1.q qVar, androidx.lifecycle.q0 q0Var, int i10) {
        this.f10498r = k0Var;
        this.f10489h = gVar;
        this.f10490i = fVar;
        this.f10491j = qVar;
        this.f10492k = q0Var;
        this.f10493l = i10;
    }

    @Override // v1.a
    public final u b(w wVar, z1.d dVar, long j4) {
        h1.h a10 = this.f10489h.a();
        h1.e0 e0Var = this.f10497q;
        if (e0Var != null) {
            a10.f(e0Var);
        }
        c1.f0 f0Var = h().f1769b;
        f0Var.getClass();
        Uri uri = f0Var.f1682a;
        w7.b.w(this.f10359g);
        return new m0(uri, a10, new f.c((d2.s) this.f10490i.f10698b), this.f10491j, new o1.n(this.f10356d.f8164c, 0, wVar), this.f10492k, a(wVar), this, dVar, f0Var.f1686e, this.f10493l, f1.b0.O(f0Var.f1689h));
    }

    @Override // v1.a
    public final synchronized c1.k0 h() {
        return this.f10498r;
    }

    @Override // v1.a
    public final void j() {
    }

    @Override // v1.a
    public final void l(h1.e0 e0Var) {
        this.f10497q = e0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k1.i0 i0Var = this.f10359g;
        w7.b.w(i0Var);
        o1.q qVar = this.f10491j;
        qVar.d(myLooper, i0Var);
        qVar.k();
        t();
    }

    @Override // v1.a
    public final void n(u uVar) {
        m0 m0Var = (m0) uVar;
        if (m0Var.N) {
            for (u0 u0Var : m0Var.K) {
                u0Var.j();
                o1.k kVar = u0Var.f10541h;
                if (kVar != null) {
                    kVar.a(u0Var.f10538e);
                    u0Var.f10541h = null;
                    u0Var.f10540g = null;
                }
            }
        }
        m0Var.B.f(m0Var);
        m0Var.G.removeCallbacksAndMessages(null);
        m0Var.I = null;
        m0Var.f10472d0 = true;
    }

    @Override // v1.a
    public final void p() {
        this.f10491j.a();
    }

    @Override // v1.a
    public final synchronized void s(c1.k0 k0Var) {
        this.f10498r = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [v1.n0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [v1.o0, v1.a] */
    public final void t() {
        z0 z0Var = new z0(this.f10495n, this.o, this.f10496p, h());
        if (this.f10494m) {
            z0Var = new n0((o0) this, z0Var);
        }
        m(z0Var);
    }

    public final void u(long j4, boolean z9, boolean z10) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f10495n;
        }
        if (!this.f10494m && this.f10495n == j4 && this.o == z9 && this.f10496p == z10) {
            return;
        }
        this.f10495n = j4;
        this.o = z9;
        this.f10496p = z10;
        this.f10494m = false;
        t();
    }
}
