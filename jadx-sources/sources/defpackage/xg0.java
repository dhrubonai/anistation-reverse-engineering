package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xg0 implements bp1 {
    public ad A;
    public final wg0 x;
    public final dn0 y;
    public ad z;

    /* JADX WARN: Type inference failed for: r0v0, types: [wg0, java.lang.Object] */
    public xg0() {
        xd1 xd1Var = bx7.f;
        ?? obj = new Object();
        obj.a = xd1Var;
        obj.b = ia3.x;
        obj.c = gt1.a;
        obj.d = 0L;
        this.x = obj;
        this.y = new dn0(this);
    }

    public static ad a(xg0 xg0Var, long j, bb4 bb4Var, float f, int i) {
        ad d = xg0Var.d(bb4Var);
        Paint paint = (Paint) d.z;
        if (f != 1.0f) {
            j = ep0.b(ep0.c(j) * f, j);
        }
        long a = c97.a.a(paint);
        int i2 = ep0.j;
        if (!cm6.a(a, j)) {
            d.r(j);
        }
        if (((Shader) d.A) != null) {
            d.u(null);
        }
        if (!a34.i((w60) d.B, null)) {
            d.s(null);
        }
        if (d.y != i) {
            d.q(i);
        }
        if (paint.isFilterBitmap()) {
            return d;
        }
        d.t(1);
        return d;
    }

    @Override // defpackage.bp1
    public final void C0(ka0 ka0Var, long j, long j2, long j3, float f, bb4 bb4Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.x.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c(ka0Var, bb4Var, f, null, 3, 1));
    }

    @Override // defpackage.bp1
    public final void E0(id idVar, ka0 ka0Var, float f, bb4 bb4Var, int i) {
        this.x.c.f(idVar, c(ka0Var, bb4Var, f, null, i, 1));
    }

    @Override // defpackage.bp1
    public final void F(long j, long j2, long j3, float f, int i) {
        vg0 vg0Var = this.x.c;
        ad adVar = this.A;
        if (adVar == null) {
            adVar = n77.l();
            adVar.y(1);
            this.A = adVar;
        }
        Paint paint = (Paint) adVar.z;
        long a = c97.a.a(paint);
        int i2 = ep0.j;
        if (!cm6.a(a, j)) {
            adVar.r(j);
        }
        if (((Shader) adVar.A) != null) {
            adVar.u(null);
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
        if (adVar.l() != i) {
            adVar.v(i);
        }
        if (adVar.m() != 0) {
            adVar.w(0);
        }
        if (!paint.isFilterBitmap()) {
            adVar.t(1);
        }
        vg0Var.i(j2, j3, adVar);
    }

    @Override // defpackage.bp1
    public final void M(long j, float f, float f2, long j2, long j3, float f3, bb4 bb4Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.x.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, bb4Var, f3, 3));
    }

    @Override // defpackage.bp1
    public final void Q(id idVar, long j, float f, bb4 bb4Var) {
        this.x.c.f(idVar, a(this, j, bb4Var, f, 3));
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x.a.b();
    }

    public final ad c(ka0 ka0Var, bb4 bb4Var, float f, w60 w60Var, int i, int i2) {
        ad d = d(bb4Var);
        Paint paint = (Paint) d.z;
        if (ka0Var != null) {
            ka0Var.a(f, g(), d);
        } else {
            if (((Shader) d.A) != null) {
                d.u(null);
            }
            long a = c97.a.a(paint);
            long j = ep0.b;
            if (!cm6.a(a, j)) {
                d.r(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                d.p(f);
            }
        }
        if (!a34.i((w60) d.B, w60Var)) {
            d.s(w60Var);
        }
        if (d.y != i) {
            d.q(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return d;
        }
        d.t(i2);
        return d;
    }

    @Override // defpackage.bp1
    public final void c0(float f, long j, long j2) {
        this.x.c.d(f, j2, a(this, j, y22.O, 1.0f, 3));
    }

    public final ad d(bb4 bb4Var) {
        if (a34.i(bb4Var, y22.O)) {
            ad adVar = this.z;
            if (adVar == null) {
                ad l = n77.l();
                l.y(0);
                this.z = l;
                return l;
            }
            return adVar;
        }
        if (bb4Var instanceof d06) {
            ad adVar2 = this.A;
            if (adVar2 == null) {
                adVar2 = n77.l();
                adVar2.y(1);
                this.A = adVar2;
            }
            Paint paint = (Paint) adVar2.z;
            float strokeWidth = paint.getStrokeWidth();
            d06 d06Var = (d06) bb4Var;
            float f = d06Var.O;
            if (strokeWidth != f) {
                adVar2.x(f);
            }
            int l2 = adVar2.l();
            int i = d06Var.Q;
            if (l2 != i) {
                adVar2.v(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = d06Var.P;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int m = adVar2.m();
            int i2 = d06Var.R;
            if (m == i2) {
                return adVar2;
            }
            adVar2.w(i2);
            return adVar2;
        }
        ze0.l();
        return null;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.x.a.getFontScale();
    }

    @Override // defpackage.bp1
    public final ia3 getLayoutDirection() {
        return this.x.b;
    }

    @Override // defpackage.bp1
    public final void h0(ka0 ka0Var, long j, long j2, float f, bb4 bb4Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.x.c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), c(ka0Var, bb4Var, f, null, 3, 1));
    }

    @Override // defpackage.bp1
    public final dn0 n0() {
        return this.y;
    }

    @Override // defpackage.bp1
    public final void v(long j, long j2, long j3, float f, bb4 bb4Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.x.c.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, bb4Var, f, i));
    }

    @Override // defpackage.bp1
    public final void w0(pc pcVar, long j, long j2, long j3, float f, w60 w60Var, int i) {
        this.x.c.e(pcVar, j, j2, j3, c(null, y22.O, f, w60Var, 3, i));
    }
}
