package y;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: k, reason: collision with root package name */
    public static final q f11451k;

    /* renamed from: a, reason: collision with root package name */
    public final float f11452a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11453b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11454c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11455d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11456e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11457f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f11458g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11459h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11460i;

    /* renamed from: j, reason: collision with root package name */
    public final float f11461j;

    static {
        float f10;
        float f11;
        float[] fArr = j5.a.f6167z;
        float n02 = (float) ((j5.a.n0() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = j5.a.f6165x;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.100000046f;
            f11 = 0.59f;
        } else {
            f10 = 0.12999998f;
            f11 = 0.525f;
        }
        float f20 = f10 + f11;
        float exp = (1.0f - (((float) Math.exp(((-n02) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp};
        float f21 = 1.0f / ((5.0f * n02) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (0.1f * f23 * f23 * ((float) Math.cbrt(n02 * 5.0d))) + (f22 * n02);
        float n03 = j5.a.n0() / fArr[1];
        double d11 = n03;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f19) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f18) / 100.0d, 0.42d), pow2};
        float f24 = fArr7[0];
        float f25 = fArr7[1];
        f11451k = new q(n03, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f24 * 400.0f) / (f24 + 27.13f)) * 2.0f) + ((f25 * 400.0f) / (f25 + 27.13f))) * pow, pow, pow, f20, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public q(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f11457f = f10;
        this.f11452a = f11;
        this.f11453b = f12;
        this.f11454c = f13;
        this.f11455d = f14;
        this.f11456e = f15;
        this.f11458g = fArr;
        this.f11459h = f16;
        this.f11460i = f17;
        this.f11461j = f18;
    }
}
