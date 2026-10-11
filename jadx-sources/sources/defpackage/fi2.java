package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fi2 implements ih4 {
    public ic2 A;
    public sb2 B;
    public boolean D;
    public float[] F;
    public boolean G;
    public int K;
    public bb4 M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public di2 x;
    public final ci2 y;
    public final oa z;
    public long C = 9223372034707292159L;
    public final float[] E = jo3.a();
    public ud1 H = tl7.d();
    public ia3 I = ia3.x;
    public final xg0 J = new xg0();
    public long L = xh6.b;
    public boolean P = true;
    public final lz0 R = new lz0(this, 10);

    public fi2(di2 di2Var, ci2 ci2Var, oa oaVar, ic2 ic2Var, sb2 sb2Var) {
        this.x = di2Var;
        this.y = ci2Var;
        this.z = oaVar;
        this.A = ic2Var;
        this.B = sb2Var;
    }

    public final float[] a() {
        float[] fArr = this.F;
        if (fArr == null) {
            fArr = jo3.a();
            this.F = fArr;
        }
        if (!this.O) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.O = false;
            float[] b = b();
            if (this.P) {
                return b;
            }
            if (!tl7.w(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.N;
        float[] fArr = this.E;
        if (z) {
            di2 di2Var = this.x;
            long j = di2Var.z;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = bx7.w(m37.O(this.C));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            hi2 hi2Var = di2Var.a;
            float f = hi2Var.n;
            float f2 = hi2Var.o;
            float f3 = hi2Var.s;
            float f4 = hi2Var.t;
            float f5 = hi2Var.u;
            float f6 = hi2Var.l;
            float f7 = hi2Var.m;
            double d = f3 * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f8 = -sin;
            float f9 = (f2 * cos) - (0.0f * sin);
            float f10 = (0.0f * cos) + (f2 * sin);
            double d2 = f4 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f11 = -sin2;
            float f12 = sin * sin2;
            float f13 = sin * cos2;
            float f14 = cos * sin2;
            float f15 = cos * cos2;
            float f16 = (f10 * sin2) + (f * cos2);
            float f17 = (f10 * cos2) + ((-f) * sin2);
            double d3 = f5 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f18 = -sin3;
            float f19 = (cos3 * f12) + (f18 * cos2);
            float f20 = ((f12 * sin3) + (cos2 * cos3)) * f6;
            float f21 = sin3 * cos * f6;
            float f22 = ((sin3 * f13) + (cos3 * f11)) * f6;
            float f23 = f19 * f7;
            float f24 = cos * cos3 * f7;
            float f25 = ((cos3 * f13) + (f18 * f11)) * f7;
            float f26 = f14 * 1.0f;
            float f27 = f8 * 1.0f;
            float f28 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -intBitsToFloat;
                fArr[12] = ((f20 * f29) - (intBitsToFloat2 * f23)) + f16 + intBitsToFloat;
                fArr[13] = ((f21 * f29) - (intBitsToFloat2 * f24)) + f9 + intBitsToFloat2;
                fArr[14] = ((f29 * f22) - (intBitsToFloat2 * f25)) + f17;
                fArr[15] = 1.0f;
            }
            this.N = false;
            this.P = v94.z(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.G && !this.D) {
            this.z.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        boolean k = oa.k();
        oa oaVar = this.z;
        if (k) {
            oaVar.K(-4.0f);
        }
        di2 di2Var = this.x;
        if (!c13.b(di2Var.t, j)) {
            di2Var.t = j;
            di2Var.h(j, di2Var.u);
        }
        ViewParent parent = oaVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(oaVar, oaVar);
        }
    }

    public final void e(long j) {
        if (!k13.a(j, this.C)) {
            if (oa.k()) {
                this.z.K(-4.0f);
            }
            this.C = j;
            c();
        }
    }

    public final void f(boolean z) {
        if (z != this.G) {
            this.G = z;
            oa oaVar = this.z;
            f44 f44Var = oaVar.a0;
            boolean z2 = oaVar.c0;
            if (!z) {
                if (!z2) {
                    f44Var.k(this);
                    f44 f44Var2 = oaVar.b0;
                    if (f44Var2 != null) {
                        f44Var2.k(this);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!z2) {
                f44Var.a(this);
                return;
            }
            f44 f44Var3 = oaVar.b0;
            if (f44Var3 == null) {
                f44Var3 = new f44();
                oaVar.b0 = f44Var3;
            }
            f44Var3.a(this);
        }
    }

    public final void g() {
        oa.k();
        if (this.G) {
            if (!xh6.a(this.L, xh6.b) && !k13.a(this.x.u, this.C)) {
                di2 di2Var = this.x;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.L >> 32)) * ((int) (this.C >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.L & 4294967295L)) * ((int) (this.C & 4294967295L));
                di2Var.g((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            }
            di2 di2Var2 = this.x;
            ud1 ud1Var = this.H;
            ia3 ia3Var = this.I;
            long j = this.C;
            if (!k13.a(di2Var2.u, j)) {
                di2Var2.u = j;
                di2Var2.h(di2Var2.t, j);
                if (di2Var2.i == 9205357640488583168L) {
                    di2Var2.g = true;
                    di2Var2.a();
                }
            }
            di2Var2.b = ud1Var;
            di2Var2.c = ia3Var;
            di2Var2.d = this.R;
            di2Var2.e();
            f(false);
        }
    }
}
