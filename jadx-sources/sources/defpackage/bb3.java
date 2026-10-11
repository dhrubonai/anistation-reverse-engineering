package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bb3 implements bp1 {
    public final xg0 x = new xg0();
    public zo1 y;

    @Override // defpackage.bp1
    public final long A0() {
        return this.x.A0();
    }

    @Override // defpackage.bp1
    public final void C0(ka0 ka0Var, long j, long j2, long j3, float f, bb4 bb4Var) {
        this.x.C0(ka0Var, j, j2, j3, f, bb4Var);
    }

    @Override // defpackage.ud1
    public final long D0(long j) {
        return this.x.D0(j);
    }

    @Override // defpackage.bp1
    public final void E0(id idVar, ka0 ka0Var, float f, bb4 bb4Var, int i) {
        this.x.E0(idVar, ka0Var, f, bb4Var, i);
    }

    @Override // defpackage.bp1
    public final void F(long j, long j2, long j3, float f, int i) {
        this.x.F(j, j2, j3, f, i);
    }

    @Override // defpackage.ud1
    public final float H0(long j) {
        return this.x.H0(j);
    }

    @Override // defpackage.bp1
    public final void M(long j, float f, float f2, long j2, long j3, float f3, bb4 bb4Var) {
        this.x.M(j, f, f2, j2, j3, f3, bb4Var);
    }

    @Override // defpackage.ud1
    public final long N(float f) {
        return this.x.N(f);
    }

    @Override // defpackage.bp1
    public final void Q(id idVar, long j, float f, bb4 bb4Var) {
        this.x.Q(idVar, j, f, bb4Var);
    }

    @Override // defpackage.ud1
    public final float T(int i) {
        return this.x.T(i);
    }

    @Override // defpackage.ud1
    public final float W(float f) {
        return f / this.x.b();
    }

    public final void a() {
        xg0 xg0Var = this.x;
        dn0 dn0Var = xg0Var.y;
        vg0 y = xg0Var.y.y();
        yc1 yc1Var = this.y;
        if (yc1Var != null) {
            xz3 xz3Var = (xz3) yc1Var;
            xz3 xz3Var2 = xz3Var.x.C;
            if (xz3Var2 != null && (xz3Var2.A & 4) != 0) {
                while (xz3Var2 != null) {
                    int i = xz3Var2.z;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        xz3Var2 = xz3Var2.C;
                    }
                }
            }
            xz3Var2 = null;
            if (xz3Var2 != null) {
                z44 z44Var = null;
                while (xz3Var2 != null) {
                    if (xz3Var2 instanceof zo1) {
                        zo1 zo1Var = (zo1) xz3Var2;
                        di2 di2Var = (di2) dn0Var.z;
                        fa4 M = wc7.M(zo1Var, 4);
                        long O = m37.O(M.z);
                        za3 za3Var = M.R;
                        za3Var.getClass();
                        ((oa) cb3.a(za3Var)).getSharedDrawScope().c(y, O, M, zo1Var, di2Var);
                    } else if ((xz3Var2.z & 4) != 0 && (xz3Var2 instanceof zc1)) {
                        int i2 = 0;
                        for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                            if ((xz3Var3.z & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    xz3Var2 = xz3Var3;
                                } else {
                                    if (z44Var == null) {
                                        z44Var = new z44(new xz3[16], 0);
                                    }
                                    if (xz3Var2 != null) {
                                        z44Var.b(xz3Var2);
                                        xz3Var2 = null;
                                    }
                                    z44Var.b(xz3Var3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    xz3Var2 = wc7.J(z44Var);
                }
                return;
            }
            fa4 M2 = wc7.M(yc1Var, 4);
            if (M2.Y0() == xz3Var.x) {
                M2 = M2.S;
                M2.getClass();
            }
            M2.o1(y, (di2) dn0Var.z);
            return;
        }
        throw h11.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x.b();
    }

    public final void c(vg0 vg0Var, long j, fa4 fa4Var, zo1 zo1Var, di2 di2Var) {
        zo1 zo1Var2 = this.y;
        this.y = zo1Var;
        ia3 ia3Var = fa4Var.R.W;
        dn0 dn0Var = this.x.y;
        wg0 wg0Var = ((xg0) dn0Var.A).x;
        ud1 ud1Var = wg0Var.a;
        ia3 ia3Var2 = wg0Var.b;
        vg0 y = dn0Var.y();
        long B = dn0Var.B();
        di2 di2Var2 = (di2) dn0Var.z;
        dn0Var.Q(fa4Var);
        dn0Var.R(ia3Var);
        dn0Var.P(vg0Var);
        dn0Var.S(j);
        dn0Var.z = di2Var;
        vg0Var.h();
        try {
            zo1Var.u0(this);
            vg0Var.p();
            dn0Var.Q(ud1Var);
            dn0Var.R(ia3Var2);
            dn0Var.P(y);
            dn0Var.S(B);
            dn0Var.z = di2Var2;
            this.y = zo1Var2;
        } catch (Throwable th) {
            vg0Var.p();
            dn0Var.Q(ud1Var);
            dn0Var.R(ia3Var2);
            dn0Var.P(y);
            dn0Var.S(B);
            dn0Var.z = di2Var2;
            throw th;
        }
    }

    @Override // defpackage.bp1
    public final void c0(float f, long j, long j2) {
        this.x.c0(f, j, j2);
    }

    public final void d(ka0 ka0Var, long j, long j2, float f, float f2) {
        xg0 xg0Var = this.x;
        vg0 vg0Var = xg0Var.x.c;
        ad adVar = xg0Var.A;
        if (adVar == null) {
            adVar = n77.l();
            adVar.y(1);
            xg0Var.A = adVar;
        }
        Paint paint = (Paint) adVar.z;
        if (ka0Var != null) {
            ka0Var.a(f2, xg0Var.g(), adVar);
        } else if (paint.getAlpha() / 255.0f != f2) {
            adVar.p(f2);
        }
        if (!a34.i((w60) adVar.B, null)) {
            adVar.s(null);
        }
        if (adVar.y != 3) {
            adVar.q(3);
        }
        if (paint.getStrokeWidth() != f) {
            adVar.x(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (adVar.l() != 0) {
            adVar.v(0);
        }
        if (adVar.m() != 0) {
            adVar.w(0);
        }
        if (!paint.isFilterBitmap()) {
            adVar.t(1);
        }
        vg0Var.i(j, j2, adVar);
    }

    @Override // defpackage.bp1
    public final long g() {
        return this.x.g();
    }

    @Override // defpackage.ud1
    public final float g0(float f) {
        return this.x.b() * f;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.x.getFontScale();
    }

    @Override // defpackage.bp1
    public final ia3 getLayoutDirection() {
        return this.x.x.b;
    }

    @Override // defpackage.bp1
    public final void h0(ka0 ka0Var, long j, long j2, float f, bb4 bb4Var) {
        this.x.h0(ka0Var, j, j2, f, bb4Var);
    }

    @Override // defpackage.bp1
    public final dn0 n0() {
        return this.x.y;
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

    @Override // defpackage.bp1
    public final void v(long j, long j2, long j3, float f, bb4 bb4Var, int i) {
        this.x.v(j, j2, j3, f, bb4Var, i);
    }

    @Override // defpackage.bp1
    public final void w0(pc pcVar, long j, long j2, long j3, float f, w60 w60Var, int i) {
        this.x.w0(pcVar, j, j2, j3, f, w60Var, i);
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
