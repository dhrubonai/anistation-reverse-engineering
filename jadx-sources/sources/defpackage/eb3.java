package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eb3 implements x06, xo3 {
    public final /* synthetic */ hb3 x;
    public final /* synthetic */ mb3 y;

    public eb3(mb3 mb3Var) {
        this.y = mb3Var;
        this.x = mb3Var.E;
    }

    @Override // defpackage.ud1
    public final long D0(long j) {
        return this.x.D0(j);
    }

    @Override // defpackage.x06
    public final List H(Object obj, ic2 ic2Var) {
        fb3 fb3Var;
        mb3 mb3Var = this.y;
        za3 za3Var = mb3Var.x;
        p44 p44Var = mb3Var.D;
        za3 za3Var2 = (za3) p44Var.g(obj);
        if (za3Var2 != null && ((z44) ((d44) za3Var.o()).y).j(za3Var2) < mb3Var.A) {
            return za3Var2.m();
        }
        p44 p44Var2 = mb3Var.I;
        p44 p44Var3 = mb3Var.G;
        z44 z44Var = mb3Var.J;
        if (z44Var.z < mb3Var.B) {
            ez2.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        za3 za3Var3 = (za3) p44Var.g(obj);
        int i = z44Var.z;
        int i2 = mb3Var.B;
        if (i == i2) {
            z44Var.b(obj);
        } else {
            Object[] objArr = z44Var.x;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        mb3Var.B++;
        boolean b = p44Var3.b(obj);
        if (!b && za3Var3 == null) {
            mb3Var.k(obj, ic2Var, false);
            p44Var2.n(obj, mb3Var.e(obj));
        } else {
            if (!b && za3Var3 != null) {
                mb3Var.j(((z44) ((d44) za3Var.o()).y).j(za3Var3), ((z44) ((d44) za3Var.o()).y).z);
                mb3Var.L++;
                p44Var.l(obj);
                p44Var3.n(obj, za3Var3);
                p44Var2.n(obj, mb3Var.e(obj));
                if (za3Var.I()) {
                    mb3Var.h();
                }
            }
            za3 za3Var4 = (za3) p44Var3.g(obj);
            nk4 nk4Var = null;
            if (za3Var4 != null) {
                fb3Var = (fb3) mb3Var.C.g(za3Var4);
            } else {
                fb3Var = null;
            }
            if (fb3Var != null && fb3Var.d) {
                mb3Var.m(za3Var4, obj, false, ic2Var);
            }
            if (fb3Var != null) {
                nk4Var = fb3Var.f;
            }
            if (nk4Var != null) {
                mb3Var.b(fb3Var, true);
            }
        }
        za3 za3Var5 = (za3) p44Var3.g(obj);
        if (za3Var5 != null) {
            List f0 = za3Var5.d0.p.f0();
            d44 d44Var = (d44) f0;
            int i3 = ((z44) d44Var.y).z;
            for (int i4 = 0; i4 < i3; i4++) {
                ((uo3) d44Var.get(i4)).C.b = true;
            }
            return f0;
        }
        return nt1.x;
    }

    @Override // defpackage.ud1
    public final float H0(long j) {
        return this.x.H0(j);
    }

    @Override // defpackage.xo3
    public final wo3 L(int i, int i2, Map map, ub2 ub2Var) {
        return this.x.v0(i, i2, map, null, ub2Var);
    }

    @Override // defpackage.ud1
    public final long N(float f) {
        return this.x.N(f);
    }

    @Override // defpackage.ud1
    public final float T(int i) {
        return this.x.T(i);
    }

    @Override // defpackage.ud1
    public final float W(float f) {
        return f / this.x.b();
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x.y;
    }

    @Override // defpackage.j23
    public final boolean d0() {
        return this.x.d0();
    }

    @Override // defpackage.ud1
    public final float g0(float f) {
        return this.x.b() * f;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.x.z;
    }

    @Override // defpackage.j23
    public final ia3 getLayoutDirection() {
        return this.x.x;
    }

    @Override // defpackage.ud1
    public final int p0(long j) {
        return this.x.p0(j);
    }

    @Override // defpackage.ud1
    public final long r(float f) {
        return this.x.r(f);
    }

    @Override // defpackage.ud1
    public final long s(long j) {
        return this.x.s(j);
    }

    @Override // defpackage.xo3
    public final wo3 v0(int i, int i2, Map map, ub2 ub2Var, ub2 ub2Var2) {
        return this.x.v0(i, i2, map, ub2Var, ub2Var2);
    }

    @Override // defpackage.ud1
    public final int x0(float f) {
        return this.x.x0(f);
    }

    @Override // defpackage.ud1
    public final float y(long j) {
        return this.x.y(j);
    }
}
