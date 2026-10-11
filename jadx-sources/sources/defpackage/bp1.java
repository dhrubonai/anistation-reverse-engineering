package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface bp1 extends ud1 {
    static void C(bp1 bp1Var, pc pcVar, long j, long j2, float f, w60 w60Var, int i, int i2) {
        long j3;
        float f2;
        int i3;
        if ((i2 & 16) != 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        bp1Var.w0(pcVar, 0L, j, j3, f2, w60Var, i3);
    }

    static void G0(bp1 bp1Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = bp1Var.A0();
        }
        bp1Var.c0(f, j, j2);
    }

    static void I(bp1 bp1Var, ka0 ka0Var, long j, long j2, long j3, bb4 bb4Var, int i) {
        long j4;
        bb4 bb4Var2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j4 = X(bp1Var.g(), j5);
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            bb4Var2 = y22.O;
        } else {
            bb4Var2 = bb4Var;
        }
        bp1Var.C0(ka0Var, j5, j4, j3, 1.0f, bb4Var2);
    }

    static void J0(bp1 bp1Var, id idVar, long j, float f, d06 d06Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        bb4 bb4Var = d06Var;
        if ((i & 8) != 0) {
            bb4Var = y22.O;
        }
        bp1Var.Q(idVar, j, f2, bb4Var);
    }

    static void N0(bp1 bp1Var, long j, float f, float f2, long j2, long j3, float f3, bb4 bb4Var, int i) {
        float f4;
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        bp1Var.M(j, f, f2, j2, j3, f4, bb4Var);
    }

    static long X(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void a0(bp1 bp1Var, ka0 ka0Var, long j, long j2, float f, bb4 bb4Var, int i) {
        float f2;
        bb4 bb4Var2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = X(bp1Var.g(), j3);
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            bb4Var2 = y22.O;
        } else {
            bb4Var2 = bb4Var;
        }
        bp1Var.h0(ka0Var, j3, j4, f2, bb4Var2);
    }

    static void e0(bp1 bp1Var, id idVar, ka0 ka0Var, float f, d06 d06Var, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        bb4 bb4Var = d06Var;
        if ((i & 8) != 0) {
            bb4Var = y22.O;
        }
        bb4 bb4Var2 = bb4Var;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        bp1Var.E0(idVar, ka0Var, f2, bb4Var2, i2);
    }

    static void i0(bp1 bp1Var, long j, long j2, long j3, float f, int i) {
        int i2;
        if ((i & 16) != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        bp1Var.F(j, j2, j3, f, i2);
    }

    static void k0(bp1 bp1Var, long j, long j2, long j3, float f, int i) {
        long j4;
        long j5;
        float f2;
        int i2;
        if ((i & 2) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = X(bp1Var.g(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        y22 y22Var = y22.O;
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        bp1Var.v(j, j4, j5, f2, y22Var, i2);
    }

    static void s0(bb3 bb3Var, pc pcVar, w60 w60Var) {
        xg0 xg0Var = bb3Var.x;
        xg0Var.x.c.a(pcVar, xg0Var.c(null, y22.O, 1.0f, w60Var, 3, 1));
    }

    default long A0() {
        return bx7.w(n0().B());
    }

    void C0(ka0 ka0Var, long j, long j2, long j3, float f, bb4 bb4Var);

    void E0(id idVar, ka0 ka0Var, float f, bb4 bb4Var, int i);

    void F(long j, long j2, long j3, float f, int i);

    void M(long j, float f, float f2, long j2, long j3, float f3, bb4 bb4Var);

    void Q(id idVar, long j, float f, bb4 bb4Var);

    void c0(float f, long j, long j2);

    default long g() {
        return n0().B();
    }

    ia3 getLayoutDirection();

    void h0(ka0 ka0Var, long j, long j2, float f, bb4 bb4Var);

    dn0 n0();

    void v(long j, long j2, long j3, float f, bb4 bb4Var, int i);

    void w0(pc pcVar, long j, long j2, long j3, float f, w60 w60Var, int i);
}
