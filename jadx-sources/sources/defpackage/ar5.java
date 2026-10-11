package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ar5 {
    public static final z22 a;
    public static final z22 b;
    public static final z22 c;
    public static final x87 d;
    public static final x87 e;
    public static final x87 f;
    public static final x87 g;
    public static final x87 h;
    public static final x87 i;

    static {
        tg1 tg1Var = tg1.y;
        a = new z22(tg1Var, 1.0f);
        tg1 tg1Var2 = tg1.x;
        b = new z22(tg1Var2, 1.0f);
        tg1 tg1Var3 = tg1.z;
        c = new z22(tg1Var3, 1.0f);
        w50 w50Var = pk2.L;
        byte b2 = 12;
        d = new x87(tg1Var, new cu5(w50Var, b2), w50Var);
        w50 w50Var2 = pk2.K;
        e = new x87(tg1Var, new cu5(w50Var2, b2), w50Var2);
        x50 x50Var = pk2.I;
        byte b3 = 13;
        f = new x87(tg1Var2, new cu5(x50Var, b3), x50Var);
        x50 x50Var2 = pk2.H;
        g = new x87(tg1Var2, new cu5(x50Var2, b3), x50Var2);
        y50 y50Var = pk2.C;
        byte b4 = 14;
        h = new x87(tg1Var3, new cu5(y50Var, b4), y50Var);
        y50 y50Var2 = pk2.y;
        i = new x87(tg1Var3, new cu5(y50Var2, b4), y50Var2);
    }

    public static final yz3 a(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new to6(f2, f3));
    }

    public static yz3 b(yz3 yz3Var) {
        return yz3Var.w(c);
    }

    public static final yz3 c(yz3 yz3Var, float f2) {
        z22 z22Var;
        if (f2 == 1.0f) {
            z22Var = a;
        } else {
            z22Var = new z22(tg1.y, f2);
        }
        return yz3Var.w(z22Var);
    }

    public static final yz3 e(yz3 yz3Var, float f2) {
        return yz3Var.w(new zq5(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final yz3 f(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new zq5(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static yz3 g(yz3 yz3Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(yz3Var, f2, f3);
    }

    public static yz3 h(yz3 yz3Var, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        float f7;
        float f8;
        if ((i2 & 2) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f3;
        }
        if ((i2 & 4) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f4;
        }
        if ((i2 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        return yz3Var.w(new zq5(f2, f6, f7, f8, false));
    }

    public static final yz3 i(yz3 yz3Var, float f2) {
        return yz3Var.w(new zq5(f2, f2, f2, f2, true));
    }

    public static final yz3 j(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new zq5(f2, f3, f2, f3, true));
    }

    public static final yz3 k(yz3 yz3Var, float f2, float f3, float f4, float f5) {
        return yz3Var.w(new zq5(f2, f3, f4, f5, true));
    }

    public static final yz3 l(yz3 yz3Var, float f2) {
        return yz3Var.w(new zq5(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final yz3 m(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new zq5(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static yz3 n(yz3 yz3Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return m(yz3Var, f2, f3);
    }

    public static yz3 o(yz3 yz3Var) {
        x87 x87Var;
        x50 x50Var = pk2.I;
        if (a34.i(x50Var, x50Var)) {
            x87Var = f;
        } else if (a34.i(x50Var, pk2.H)) {
            x87Var = g;
        } else {
            x87Var = new x87(tg1.x, new cu5(x50Var, (byte) 13), x50Var);
        }
        return yz3Var.w(x87Var);
    }

    public static yz3 p(yz3 yz3Var, int i2) {
        x87 x87Var;
        y50 y50Var = pk2.B;
        y50 y50Var2 = pk2.C;
        if ((i2 & 1) != 0) {
            y50Var = y50Var2;
        }
        if (y50Var.equals(y50Var2)) {
            x87Var = h;
        } else if (y50Var.equals(pk2.y)) {
            x87Var = i;
        } else {
            x87Var = new x87(tg1.z, new cu5(y50Var, (byte) 14), y50Var);
        }
        return yz3Var.w(x87Var);
    }

    public static yz3 q(yz3 yz3Var) {
        x87 x87Var;
        w50 w50Var = pk2.L;
        if (a34.i(w50Var, w50Var)) {
            x87Var = d;
        } else if (a34.i(w50Var, pk2.K)) {
            x87Var = e;
        } else {
            x87Var = new x87(tg1.y, new cu5(w50Var, (byte) 12), w50Var);
        }
        return yz3Var.w(x87Var);
    }
}
