package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qv4 extends t30 {
    public final o41 i;
    public final xv3 j;
    public final xp1 k;
    public final q18 l;
    public final int m;
    public final ea2 n;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public boolean s;
    public n71 t;
    public ar3 u;
    public kj1 v;

    public qv4(ar3 ar3Var, o41 o41Var, xv3 xv3Var, xp1 xp1Var, q18 q18Var, int i, ea2 ea2Var) {
        this.u = ar3Var;
        this.i = o41Var;
        this.j = xv3Var;
        this.k = xp1Var;
        this.l = q18Var;
        this.m = i;
        this.n = ea2Var;
    }

    @Override // defpackage.lw3
    public final boolean a(ar3 ar3Var) {
        vq3 vq3Var = c().b;
        vq3Var.getClass();
        vq3 vq3Var2 = ar3Var.b;
        if (vq3Var2 != null && vq3Var2.a.equals(vq3Var.a) && vq3Var2.h == vq3Var.h && Objects.equals(vq3Var2.f, vq3Var.f)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lw3
    public final or3 b(jw3 jw3Var, l7 l7Var, long j) {
        q41 H = this.i.H();
        n71 n71Var = this.t;
        if (n71Var != null) {
            H.z(n71Var);
        }
        vq3 vq3Var = c().b;
        vq3Var.getClass();
        Uri uri = vq3Var.a;
        this.g.getClass();
        return new nv4(uri, H, new dn0(this.j.y, (byte) 6), this.k, new tp1(this.d.c, 0, jw3Var), this.l, new eb2((CopyOnWriteArrayList) this.c.A, 0, jw3Var), this, l7Var, vq3Var.f, this.m, this.n, eq6.U(vq3Var.h), null);
    }

    @Override // defpackage.lw3
    public final synchronized ar3 c() {
        return this.u;
    }

    @Override // defpackage.lw3
    public final synchronized void g(ar3 ar3Var) {
        this.u = ar3Var;
    }

    @Override // defpackage.lw3
    public final void h(or3 or3Var) {
        nv4 nv4Var = (nv4) or3Var;
        if (nv4Var.V) {
            for (f95 f95Var : nv4Var.S) {
                f95Var.j();
                qp1 qp1Var = f95Var.h;
                if (qp1Var != null) {
                    qp1Var.c(f95Var.e);
                    f95Var.h = null;
                    f95Var.g = null;
                }
            }
        }
        nv4Var.J.L(nv4Var);
        nv4Var.O.removeCallbacksAndMessages(null);
        nv4Var.P = null;
        nv4Var.q0 = true;
    }

    @Override // defpackage.t30
    public final void n(n71 n71Var) {
        this.t = n71Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        cp4 cp4Var = this.g;
        cp4Var.getClass();
        xp1 xp1Var = this.k;
        xp1Var.d(myLooper, cp4Var);
        xp1Var.a();
        t();
    }

    @Override // defpackage.t30
    public final void q() {
        this.k.release();
    }

    public final void t() {
        uq3 uq3Var;
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        ar3 c = c();
        if (z2) {
            uq3Var = c.c;
        } else {
            uq3Var = null;
        }
        kf6 yp5Var = new yp5(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c, uq3Var);
        if (this.o) {
            yp5Var = new ma2(yp5Var);
        }
        o(yp5Var);
    }

    public final void u(long j, hf5 hf5Var, boolean z) {
        if (!this.s || !hf5Var.e()) {
            this.s = !hf5Var.e();
            if (j == -9223372036854775807L) {
                j = this.p;
            }
            boolean b = hf5Var.b();
            if (this.o || this.p != j || this.q != b || this.r != z) {
                this.p = j;
                this.q = b;
                this.r = z;
                this.o = false;
                t();
                kj1 kj1Var = this.v;
                if (kj1Var != null) {
                    kj1Var.F = hf5Var;
                }
            }
        }
    }

    @Override // defpackage.lw3
    public final void d() {
    }
}
