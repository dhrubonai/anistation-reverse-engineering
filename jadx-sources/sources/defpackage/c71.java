package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c71 implements io4, qw3, up1 {
    public final f46 a;
    public final hf6 b;
    public final jf6 c;
    public final tp d;
    public final SparseArray e;
    public ui3 f;
    public ko4 g;
    public k46 h;
    public boolean i;

    public c71(f46 f46Var) {
        f46Var.getClass();
        this.a = f46Var;
        this.f = new ui3(eq6.z());
        hf6 hf6Var = new hf6();
        this.b = hf6Var;
        this.c = new jf6();
        this.d = new tp(hf6Var);
        this.e = new SparseArray();
    }

    @Override // defpackage.io4
    public final void A(qh6 qh6Var) {
        b0(W(), 2, new w61((byte) 4));
    }

    @Override // defpackage.io4
    public final void C(int i, boolean z) {
        b0(W(), 30, new w61((byte) 23));
    }

    @Override // defpackage.io4
    public final void D(long j) {
        b0(W(), 16, new y61((byte) 7));
    }

    @Override // defpackage.io4
    public final void E(jr3 jr3Var) {
        b0(W(), 14, new w61((byte) 5));
    }

    @Override // defpackage.io4
    public final void F(jr3 jr3Var) {
        b0(W(), 15, new y61((byte) 14));
    }

    @Override // defpackage.io4
    public final void G(long j) {
        b0(W(), 17, new y61((byte) 10));
    }

    @Override // defpackage.io4
    public final void H(kf6 kf6Var, int i) {
        ko4 ko4Var = this.g;
        ko4Var.getClass();
        tp tpVar = this.d;
        tpVar.B = tp.g(ko4Var, (nw2) tpVar.z, (jw3) tpVar.C, (hf6) tpVar.y);
        tpVar.t(ko4Var.G0());
        b0(W(), 0, new w61((byte) 8));
    }

    @Override // defpackage.io4
    public final void I(yx1 yx1Var) {
        q7 W;
        jw3 jw3Var;
        if ((yx1Var instanceof yx1) && (jw3Var = yx1Var.E) != null) {
            W = X(jw3Var);
        } else {
            W = W();
        }
        b0(W, 10, new w61((byte) 14));
    }

    @Override // defpackage.io4
    public final void J(yx1 yx1Var) {
        q7 W;
        jw3 jw3Var;
        if ((yx1Var instanceof yx1) && (jw3Var = yx1Var.E) != null) {
            W = X(jw3Var);
        } else {
            W = W();
        }
        b0(W, 10, new h5(W, yx1Var, (byte) 8));
    }

    @Override // defpackage.io4
    public final void L(List list) {
        q7 W = W();
        b0(W, 27, new a71(W, list));
    }

    @Override // defpackage.io4
    public final void M(int i, boolean z) {
        b0(W(), -1, new w61((byte) 11));
    }

    @Override // defpackage.up1
    public final void N(int i, jw3 jw3Var) {
        b0(Z(i, jw3Var), 1027, new y61((byte) 2));
    }

    @Override // defpackage.io4
    public final void O(rn4 rn4Var) {
        b0(W(), 12, new w61((byte) 3));
    }

    @Override // defpackage.io4
    public final void P(go4 go4Var) {
        b0(W(), 13, new w61((byte) 7));
    }

    @Override // defpackage.io4
    public final void Q(rf1 rf1Var) {
        b0(W(), 29, new w61((byte) 27));
    }

    @Override // defpackage.io4
    public final void R(long j) {
        b0(W(), 18, new y61((byte) 8));
    }

    @Override // defpackage.io4
    public final void S(int i, int i2) {
        b0(a0(), 24, new w61((byte) 20));
    }

    @Override // defpackage.up1
    public final void T(int i, jw3 jw3Var, i18 i18Var) {
        b0(Z(i, jw3Var), 1023, new y61((byte) 3));
    }

    @Override // defpackage.qw3
    public final void U(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var, int i2) {
        b0(Z(i, jw3Var), UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, new w61((byte) 21));
    }

    @Override // defpackage.io4
    public final void V(boolean z) {
        b0(W(), 7, new w61((byte) 12));
    }

    public final q7 W() {
        return X((jw3) this.d.B);
    }

    public final q7 X(jw3 jw3Var) {
        kf6 kf6Var;
        this.g.getClass();
        if (jw3Var == null) {
            kf6Var = null;
        } else {
            kf6Var = (kf6) ((t15) this.d.A).get(jw3Var);
        }
        if (jw3Var != null && kf6Var != null) {
            return Y(kf6Var, kf6Var.g(jw3Var.a, this.b).c, jw3Var);
        }
        int s0 = this.g.s0();
        kf6 G0 = this.g.G0();
        if (s0 >= G0.o()) {
            G0 = kf6.a;
        }
        return Y(G0, s0, null);
    }

    public final q7 Y(kf6 kf6Var, int i, jw3 jw3Var) {
        jw3 jw3Var2;
        boolean z;
        if (kf6Var.p()) {
            jw3Var2 = null;
        } else {
            jw3Var2 = jw3Var;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (kf6Var.equals(this.g.G0()) && i == this.g.s0()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (jw3Var2 != null && jw3Var2.c()) {
            if (z && this.g.r0() == jw3Var2.b && this.g.H() == jw3Var2.c) {
                j = this.g.Z0();
            }
        } else if (z) {
            j = this.g.b0();
        } else if (!kf6Var.p()) {
            j = eq6.l0(kf6Var.m(i, this.c, 0L).l);
        }
        return new q7(elapsedRealtime, kf6Var, i, jw3Var2, j, this.g.G0(), this.g.s0(), (jw3) this.d.B, this.g.Z0(), this.g.j());
    }

    public final q7 Z(int i, jw3 jw3Var) {
        this.g.getClass();
        if (jw3Var != null) {
            if (((kf6) ((t15) this.d.A).get(jw3Var)) != null) {
                return X(jw3Var);
            }
            return Y(kf6.a, i, jw3Var);
        }
        kf6 G0 = this.g.G0();
        if (i >= G0.o()) {
            G0 = kf6.a;
        }
        return Y(G0, i, null);
    }

    @Override // defpackage.io4
    public final void a(hv6 hv6Var) {
        q7 a0 = a0();
        b0(a0, 25, new b71(a0, hv6Var));
    }

    public final q7 a0() {
        return X((jw3) this.d.D);
    }

    @Override // defpackage.io4
    public final void b(c31 c31Var) {
        b0(W(), 27, new y61((byte) 6));
    }

    public final void b0(q7 q7Var, int i, ri3 ri3Var) {
        this.e.put(i, q7Var);
        this.f.g(i, ri3Var);
    }

    @Override // defpackage.io4
    public final void c(int i) {
        b0(a0(), 21, new y61((byte) 0));
    }

    public final void c0(vy1 vy1Var, Looper looper) {
        boolean z;
        boolean z2 = true;
        char c = 1;
        if (this.g != null && !((nw2) this.d.z).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        vy1Var.getClass();
        this.g = vy1Var;
        this.h = this.a.a(looper, null);
        ui3 ui3Var = this.f;
        fs0 fs0Var = new fs0((Object) this, (Object) vy1Var, (byte) (c == true ? 1 : 0));
        f46 f46Var = this.a;
        if (f46Var == null) {
            z2 = false;
        }
        io3.B(z2);
        this.f = new ui3((CopyOnWriteArraySet) ui3Var.f, looper, looper.getThread(), f46Var, fs0Var, ui3Var.b);
    }

    @Override // defpackage.io4
    public final void d(int i) {
        b0(W(), 8, new y61((byte) 16));
    }

    @Override // defpackage.io4
    public final void e(boolean z) {
        b0(a0(), 23, new y61((byte) 29));
    }

    @Override // defpackage.io4
    public final void f(fy3 fy3Var) {
        b0(W(), 28, new y61((byte) 13));
    }

    @Override // defpackage.io4
    public final void g(int i) {
        b0(W(), 6, new w61((byte) 13));
    }

    @Override // defpackage.io4
    public final void j(jo4 jo4Var, jo4 jo4Var2, int i) {
        if (i == 1) {
            this.i = false;
        }
        ko4 ko4Var = this.g;
        ko4Var.getClass();
        tp tpVar = this.d;
        tpVar.B = tp.g(ko4Var, (nw2) tpVar.z, (jw3) tpVar.C, (hf6) tpVar.y);
        q7 W = W();
        b0(W, 11, new x61(W, i, jo4Var, jo4Var2));
    }

    @Override // defpackage.up1
    public final void k(int i, jw3 jw3Var, Exception exc) {
        b0(Z(i, jw3Var), 1024, new w61((byte) 28));
    }

    @Override // defpackage.qw3
    public final void l(int i, jw3 jw3Var, fr3 fr3Var) {
        q7 Z = Z(i, jw3Var);
        b0(Z, 1004, new fs0((Object) Z, (Object) fr3Var, (byte) 2));
    }

    @Override // defpackage.qw3
    public final void m(int i, jw3 jw3Var, fr3 fr3Var) {
        b0(Z(i, jw3Var), 1005, new y61((byte) 1));
    }

    @Override // defpackage.io4
    public final void n(ru ruVar) {
        b0(a0(), 20, new y61((byte) 12));
    }

    @Override // defpackage.io4
    public final void o(hh6 hh6Var) {
        b0(W(), 19, new y61((byte) 9));
    }

    @Override // defpackage.up1
    public final void p(int i, jw3 jw3Var, int i2) {
        q7 Z = Z(i, jw3Var);
        b0(Z, 1022, new w61(Z, i2));
    }

    @Override // defpackage.io4
    public final void q(boolean z) {
        b0(W(), 3, new w61((byte) 6));
    }

    @Override // defpackage.io4
    public final void r(int i, boolean z) {
        b0(W(), 5, new w61((byte) 15));
    }

    @Override // defpackage.io4
    public final void s(float f) {
        b0(a0(), 22, new y61((byte) 11));
    }

    @Override // defpackage.io4
    public final void t(int i, ar3 ar3Var) {
        b0(W(), 1, new w61((byte) 10));
    }

    @Override // defpackage.qw3
    public final void u(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        b0(Z(i, jw3Var), 1002, new w61((byte) 24));
    }

    @Override // defpackage.io4
    public final void v(int i) {
        b0(W(), 4, new w61((byte) 19));
    }

    @Override // defpackage.qw3
    public final void w(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var) {
        b0(Z(i, jw3Var), 1001, new w61((byte) 29));
    }

    @Override // defpackage.io4
    public final void x(boolean z) {
        b0(W(), 9, new y61((byte) 17));
    }

    @Override // defpackage.qw3
    public final void y(int i, jw3 jw3Var, ij3 ij3Var, fr3 fr3Var, IOException iOException, boolean z) {
        q7 Z = Z(i, jw3Var);
        b0(Z, 1003, new h5(Z, ij3Var, fr3Var, iOException, z));
    }

    @Override // defpackage.up1
    public final void z(int i, jw3 jw3Var) {
        b0(Z(i, jw3Var), 1025, new y61((byte) 4));
    }

    @Override // defpackage.io4
    public final void K() {
    }

    @Override // defpackage.io4
    public final void h(boolean z) {
    }

    @Override // defpackage.io4
    public final void i(int i) {
    }

    @Override // defpackage.io4
    public final void B(ko4 ko4Var, ho4 ho4Var) {
    }
}
