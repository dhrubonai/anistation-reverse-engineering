package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bz0 extends xz3 implements zo1, ra3, sh5 {
    public e7 L;
    public dz0 M;
    public float N = 1.0f;
    public boolean O = true;
    public String P;
    public ux0 Q;
    public final qt R;

    public bz0(qt qtVar, e7 e7Var, dz0 dz0Var, String str, ux0 ux0Var) {
        this.L = e7Var;
        this.M = dz0Var;
        this.P = str;
        this.Q = ux0Var;
        this.R = qtVar;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        String str = this.P;
        if (str != null) {
            zh5.c(bi5Var, str);
            zh5.f(bi5Var, 5);
        }
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        v11 O0 = O0();
        qt qtVar = this.R;
        qtVar.I = O0;
        qtVar.c();
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.R.b();
    }

    @Override // defpackage.xz3
    public final void U0() {
        this.R.l(null);
    }

    public final long a1(long j) {
        if (uq5.f(j)) {
            return 0L;
        }
        long h = this.R.h();
        if (h != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
            if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
            if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            long a = this.M.a(floatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (a >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & a))) <= Float.MAX_VALUE) {
                return te4.S(floatToRawIntBits, a);
            }
        }
        return j;
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        long b = sx0.b(0, i, 0, 0, 13);
        ux0 ux0Var = this.Q;
        if (ux0Var != null) {
            ux0Var.b(b);
        }
        if (this.R.h() != 9205357640488583168L) {
            long b1 = b1(b);
            return Math.max(rx0.i(b1), ro3Var.c(i));
        }
        return ro3Var.c(i);
    }

    public final long b1(long j) {
        boolean z;
        float j2;
        int i;
        float f;
        boolean f2 = rx0.f(j);
        boolean e = rx0.e(j);
        if (!f2 || !e) {
            if (rx0.d(j) && rx0.c(j)) {
                z = true;
            } else {
                z = false;
            }
            qt qtVar = this.R;
            long h = qtVar.h();
            if (h == 9205357640488583168L) {
                if (z && ((pt) qtVar.Q.x.getValue()).a() != null) {
                    return rx0.a(j, rx0.h(j), 0, rx0.g(j), 0, 10);
                }
            } else {
                if (z && (f2 || e)) {
                    j2 = rx0.h(j);
                    i = rx0.g(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
                    if (Math.abs(intBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = lq6.b;
                        float j3 = rx0.j(j);
                        float h2 = rx0.h(j);
                        if (intBitsToFloat < j3) {
                            intBitsToFloat = j3;
                        }
                        if (intBitsToFloat <= h2) {
                            h2 = intBitsToFloat;
                        }
                        j2 = h2;
                    } else {
                        j2 = rx0.j(j);
                    }
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = lq6.b;
                        float i4 = rx0.i(j);
                        float g = rx0.g(j);
                        if (intBitsToFloat2 < i4) {
                            intBitsToFloat2 = i4;
                        }
                        if (intBitsToFloat2 <= g) {
                            g = intBitsToFloat2;
                        }
                        f = g;
                        long a1 = a1((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32));
                        return rx0.a(j, sx0.g(io3.h0(Float.intBitsToFloat((int) (a1 >> 32))), j), 0, sx0.f(io3.h0(Float.intBitsToFloat((int) (a1 & 4294967295L))), j), 0, 10);
                    }
                    i = rx0.i(j);
                }
                f = i;
                long a12 = a1((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32));
                return rx0.a(j, sx0.g(io3.h0(Float.intBitsToFloat((int) (a12 >> 32))), j), 0, sx0.f(io3.h0(Float.intBitsToFloat((int) (a12 & 4294967295L))), j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        ux0 ux0Var = this.Q;
        if (ux0Var != null) {
            ux0Var.b(j);
        }
        em4 p = ro3Var.p(b1(j));
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 0));
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        long b = sx0.b(0, 0, 0, i, 7);
        ux0 ux0Var = this.Q;
        if (ux0Var != null) {
            ux0Var.b(b);
        }
        if (this.R.h() != 9205357640488583168L) {
            long b1 = b1(b);
            return Math.max(rx0.j(b1), ro3Var.n(i));
        }
        return ro3Var.n(i);
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        long b = sx0.b(0, i, 0, 0, 13);
        ux0 ux0Var = this.Q;
        if (ux0Var != null) {
            ux0Var.b(b);
        }
        if (this.R.h() != 9205357640488583168L) {
            long b1 = b1(b);
            return Math.max(rx0.i(b1), ro3Var.O(i));
        }
        return ro3Var.O(i);
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        xg0 xg0Var = bb3Var.x;
        long a1 = a1(xg0Var.g());
        long a = this.L.a(lq6.b(a1), lq6.b(xg0Var.g()), bb3Var.getLayoutDirection());
        int i = (int) (a >> 32);
        int i2 = (int) (a & 4294967295L);
        dn0 dn0Var = xg0Var.y;
        long B = dn0Var.B();
        dn0Var.y().h();
        try {
            af2 af2Var = (af2) dn0Var.y;
            dn0 dn0Var2 = (dn0) af2Var.y;
            if (this.O) {
                dn0Var2.y().n(0.0f, 0.0f, Float.intBitsToFloat((int) (dn0Var2.B() >> 32)), Float.intBitsToFloat((int) (4294967295L & dn0Var2.B())), 1);
            }
            af2Var.s(i, i2);
            this.R.g(bb3Var, a1, this.N, null);
            dn0Var.y().p();
            dn0Var.S(B);
            bb3Var.a();
        } catch (Throwable th) {
            h11.u(dn0Var, B);
            throw th;
        }
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        long b = sx0.b(0, 0, 0, i, 7);
        ux0 ux0Var = this.Q;
        if (ux0Var != null) {
            ux0Var.b(b);
        }
        if (this.R.h() != 9205357640488583168L) {
            long b1 = b1(b);
            return Math.max(rx0.j(b1), ro3Var.k(i));
        }
        return ro3Var.k(i);
    }
}
