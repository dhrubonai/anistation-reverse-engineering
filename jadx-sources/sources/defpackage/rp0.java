package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rp0 {
    public static final float[] a;
    public static final float[] b;
    public static final wh6 c;
    public static final wh6 d;
    public static final b65 e;
    public static final b65 f;
    public static final b65 g;
    public static final b65 h;
    public static final b65 i;
    public static final b65 j;
    public static final b65 k;
    public static final b65 l;
    public static final b65 m;
    public static final b65 n;
    public static final b65 o;
    public static final b65 p;
    public static final b65 q;
    public static final b65 r;
    public static final v93 s;
    public static final v93 t;
    public static final b65 u;
    public static final b65 v;
    public static final b65 w;
    public static final md4 x;
    public static final pp0[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [pp0, md4] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        wh6 wh6Var = new wh6(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        wh6 wh6Var2 = new wh6(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        wh6 wh6Var3 = new wh6(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = wh6Var3;
        wh6 wh6Var4 = new wh6(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = wh6Var4;
        o47 o47Var = te4.f;
        b65 b65Var = new b65("sRGB IEC61966-2.1", fArr, o47Var, wh6Var, 0);
        e = b65Var;
        b65 b65Var2 = new b65("sRGB IEC61966-2.1 (Linear)", fArr, o47Var, 1.0d, 0.0f, 1.0f, 1);
        f = b65Var2;
        b65 b65Var3 = new b65("scRGB-nl IEC 61966-2-2:2003", fArr, o47Var, null, new ze0((byte) 21), new ze0((byte) 22), -0.799f, 2.399f, wh6Var, 2);
        g = b65Var3;
        b65 b65Var4 = new b65("scRGB IEC 61966-2-2:2003", fArr, o47Var, 1.0d, -0.5f, 7.499f, 3);
        h = b65Var4;
        b65 b65Var5 = new b65("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, o47Var, new wh6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = b65Var5;
        b65 b65Var6 = new b65("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, o47Var, new wh6(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = b65Var6;
        b65 b65Var7 = new b65("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new o47(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = b65Var7;
        b65 b65Var8 = new b65("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, o47Var, wh6Var, 7);
        l = b65Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        b65 b65Var9 = new b65("NTSC (1953)", fArr2, te4.c, new wh6(d4, d5, d6, d2, d3), 8);
        m = b65Var9;
        b65 b65Var10 = new b65("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, o47Var, new wh6(d4, d5, d6, d2, d3), 9);
        n = b65Var10;
        b65 b65Var11 = new b65("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, o47Var, 2.2d, 0.0f, 1.0f, 10);
        o = b65Var11;
        b65 b65Var12 = new b65("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, te4.d, new wh6(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = b65Var12;
        o47 o47Var2 = te4.e;
        b65 b65Var13 = new b65("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, o47Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = b65Var13;
        b65 b65Var14 = new b65("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, o47Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = b65Var14;
        v93 v93Var = new v93("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = v93Var;
        v93 v93Var2 = new v93("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = v93Var2;
        b65 b65Var15 = new b65("None", fArr, o47Var, wh6Var2, 16);
        u = b65Var15;
        b65 b65Var16 = new b65("Hybrid Log Gamma encoding", fArr3, o47Var, null, new ze0((byte) 23), new ze0((byte) 24), 0.0f, 1.0f, wh6Var3, 17);
        v = b65Var16;
        b65 b65Var17 = new b65("Perceptual Quantizer encoding", fArr3, o47Var, null, new ze0((byte) 25), new ze0((byte) 26), 0.0f, 1.0f, wh6Var4, 18);
        w = b65Var17;
        ?? pp0Var = new pp0(12884901890L, 19, "Oklab");
        x = pp0Var;
        y = new pp0[]{b65Var, b65Var2, b65Var3, b65Var4, b65Var5, b65Var6, b65Var7, b65Var8, b65Var9, b65Var10, b65Var11, b65Var12, b65Var13, b65Var14, v93Var, v93Var2, b65Var15, b65Var16, b65Var17, pp0Var};
    }

    public static double a(wh6 wh6Var, double d2) {
        double d3;
        double exp;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = wh6Var.b;
        double d6 = wh6Var.c;
        double d7 = wh6Var.d;
        double d8 = wh6Var.e;
        double d9 = wh6Var.f;
        double d10 = wh6Var.g + 1.0d;
        double d11 = d5 * d4;
        if (d11 <= 1.0d) {
            exp = Math.pow(d11, d6);
        } else {
            exp = Math.exp((d4 - d9) * d7) + d8;
        }
        return d10 * d3 * exp;
    }

    public static double b(wh6 wh6Var, double d2) {
        double d3;
        double log;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = 1.0d / wh6Var.b;
        double d5 = 1.0d / wh6Var.c;
        double d6 = 1.0d / wh6Var.d;
        double d7 = wh6Var.e;
        double d8 = wh6Var.f;
        double d9 = (d2 * d3) / (wh6Var.g + 1.0d);
        if (d9 <= 1.0d) {
            log = Math.pow(d9, d5) * d4;
        } else {
            log = (Math.log(d9 - d7) * d6) + d8;
        }
        return d3 * log;
    }

    public static double c(wh6 wh6Var, double d2) {
        double d3;
        double d4 = 0.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = wh6Var.b;
        double d7 = wh6Var.d;
        double pow = (Math.pow(d5, d7) * wh6Var.c) + d6;
        if (pow >= 0.0d) {
            d4 = pow;
        }
        return Math.pow(d4 / ((Math.pow(d5, d7) * wh6Var.f) + wh6Var.e), wh6Var.g) * d3;
    }

    public static double d(wh6 wh6Var, double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = -wh6Var.b;
        double d6 = wh6Var.e;
        double d7 = 1.0d / wh6Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-wh6Var.f)) + wh6Var.c), 1.0d / wh6Var.d) * d3;
    }
}
