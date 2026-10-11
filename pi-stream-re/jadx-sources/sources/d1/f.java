package d1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3054b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3055c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3056d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3057e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3058f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3059g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3060h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f3061i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f3062j;

    /* renamed from: k, reason: collision with root package name */
    public int f3063k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f3064l;

    /* renamed from: m, reason: collision with root package name */
    public int f3065m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f3066n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f3067p;

    /* renamed from: q, reason: collision with root package name */
    public int f3068q;

    /* renamed from: r, reason: collision with root package name */
    public int f3069r;

    /* renamed from: s, reason: collision with root package name */
    public int f3070s;

    /* renamed from: t, reason: collision with root package name */
    public int f3071t;

    /* renamed from: u, reason: collision with root package name */
    public int f3072u;

    /* renamed from: v, reason: collision with root package name */
    public int f3073v;

    public f(float f10, float f11, int i10, int i11, int i12) {
        this.f3053a = i10;
        this.f3054b = i11;
        this.f3055c = f10;
        this.f3056d = f11;
        this.f3057e = i10 / i12;
        this.f3058f = i10 / 400;
        int i13 = i10 / 65;
        this.f3059g = i13;
        int i14 = i13 * 2;
        this.f3060h = i14;
        this.f3061i = new short[i14];
        this.f3062j = new short[i14 * i11];
        this.f3064l = new short[i14 * i11];
        this.f3066n = new short[i14 * i11];
    }

    public static void d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        int i12 = this.f3060h / i11;
        int i13 = this.f3054b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f3061i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] b(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f3054b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int c(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f3054b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f3072u = i15 / i16;
        this.f3073v = i17 / i14;
        return i16;
    }

    public final void e() {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        boolean z9;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22 = this.f3065m;
        float f11 = this.f3055c;
        float f12 = this.f3056d;
        float f13 = f11 / f12;
        float f14 = this.f3057e * f12;
        double d10 = f13;
        int i23 = this.f3053a;
        int i24 = this.f3054b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            short[] sArr = this.f3062j;
            int i25 = this.f3063k;
            short[] b10 = b(this.f3064l, i22, i25);
            this.f3064l = b10;
            System.arraycopy(sArr, 0 * i24, b10, this.f3065m * i24, i24 * i25);
            this.f3065m += i25;
            this.f3063k = 0;
        } else {
            int i26 = this.f3063k;
            int i27 = this.f3060h;
            if (i26 >= i27) {
                int i28 = 0;
                while (true) {
                    int i29 = this.f3069r;
                    if (i29 > 0) {
                        int min = Math.min(i27, i29);
                        short[] sArr2 = this.f3062j;
                        short[] b11 = b(this.f3064l, this.f3065m, min);
                        this.f3064l = b11;
                        i10 = i22;
                        System.arraycopy(sArr2, i28 * i24, b11, this.f3065m * i24, i24 * min);
                        this.f3065m += min;
                        this.f3069r -= min;
                        i28 += min;
                        f10 = f14;
                        i12 = i23;
                    } else {
                        i10 = i22;
                        short[] sArr3 = this.f3062j;
                        if (i23 > 4000) {
                            i11 = i23 / 4000;
                        } else {
                            i11 = 1;
                        }
                        int i30 = this.f3059g;
                        int i31 = this.f3058f;
                        if (i24 == 1 && i11 == 1) {
                            i13 = c(sArr3, i28, i31, i30);
                            f10 = f14;
                            i12 = i23;
                        } else {
                            a(sArr3, i28, i11);
                            i12 = i23;
                            short[] sArr4 = this.f3061i;
                            f10 = f14;
                            int c6 = c(sArr4, 0, i31 / i11, i30 / i11);
                            if (i11 != 1) {
                                int i32 = c6 * i11;
                                int i33 = i11 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                if (i34 >= i31) {
                                    i31 = i34;
                                }
                                if (i35 <= i30) {
                                    i30 = i35;
                                }
                                if (i24 == 1) {
                                    i13 = c(sArr3, i28, i31, i30);
                                } else {
                                    a(sArr3, i28, 1);
                                    i13 = c(sArr4, 0, i31, i30);
                                }
                            } else {
                                i13 = c6;
                            }
                        }
                        int i36 = this.f3072u;
                        int i37 = this.f3073v;
                        if (i36 != 0 && this.f3070s != 0 && i37 <= i36 * 3 && i36 * 2 > this.f3071t * 3) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i14 = this.f3070s;
                        } else {
                            i14 = i13;
                        }
                        this.f3071t = i36;
                        this.f3070s = i13;
                        if (d10 > 1.0d) {
                            short[] sArr5 = this.f3062j;
                            if (f13 >= 2.0f) {
                                i16 = (int) (i14 / (f13 - 1.0f));
                            } else {
                                this.f3069r = (int) (((2.0f - f13) * i14) / (f13 - 1.0f));
                                i16 = i14;
                            }
                            short[] b12 = b(this.f3064l, this.f3065m, i16);
                            this.f3064l = b12;
                            int i38 = i28;
                            d(i16, this.f3054b, b12, this.f3065m, sArr5, i38, sArr5, i28 + i14);
                            this.f3065m += i16;
                            i28 = i14 + i16 + i38;
                        } else {
                            int i39 = i28;
                            short[] sArr6 = this.f3062j;
                            if (f13 < 0.5f) {
                                i15 = (int) ((i14 * f13) / (1.0f - f13));
                            } else {
                                this.f3069r = (int) ((((2.0f * f13) - 1.0f) * i14) / (1.0f - f13));
                                i15 = i14;
                            }
                            int i40 = i14 + i15;
                            short[] b13 = b(this.f3064l, this.f3065m, i40);
                            this.f3064l = b13;
                            System.arraycopy(sArr6, i39 * i24, b13, this.f3065m * i24, i24 * i14);
                            d(i15, this.f3054b, this.f3064l, this.f3065m + i14, sArr6, i39 + i14, sArr6, i39);
                            this.f3065m += i40;
                            i28 = i39 + i15;
                        }
                    }
                    if (i28 + i27 > i26) {
                        break;
                    }
                    i22 = i10;
                    i23 = i12;
                    f14 = f10;
                }
                int i41 = this.f3063k - i28;
                short[] sArr7 = this.f3062j;
                System.arraycopy(sArr7, i28 * i24, sArr7, 0, i24 * i41);
                this.f3063k = i41;
                if (f10 == 1.0f && this.f3065m != (i17 = i10)) {
                    int i42 = i12;
                    int i43 = (int) (i42 / f10);
                    int i44 = i42;
                    while (true) {
                        if (i43 <= 16384 && i44 <= 16384) {
                            break;
                        }
                        i43 /= 2;
                        i44 /= 2;
                    }
                    int i45 = this.f3065m - i17;
                    short[] b14 = b(this.f3066n, this.o, i45);
                    this.f3066n = b14;
                    System.arraycopy(this.f3064l, i17 * i24, b14, this.o * i24, i24 * i45);
                    this.f3065m = i17;
                    this.o += i45;
                    int i46 = 0;
                    while (true) {
                        i18 = this.o;
                        i19 = i18 - 1;
                        if (i46 >= i19) {
                            break;
                        }
                        while (true) {
                            i20 = this.f3067p + 1;
                            int i47 = i20 * i43;
                            i21 = this.f3068q;
                            if (i47 <= i21 * i44) {
                                break;
                            }
                            this.f3064l = b(this.f3064l, this.f3065m, 1);
                            for (int i48 = 0; i48 < i24; i48++) {
                                short[] sArr8 = this.f3064l;
                                int i49 = (this.f3065m * i24) + i48;
                                short[] sArr9 = this.f3066n;
                                int i50 = (i46 * i24) + i48;
                                short s9 = sArr9[i50];
                                short s10 = sArr9[i50 + i24];
                                int i51 = this.f3068q * i44;
                                int i52 = this.f3067p;
                                int i53 = i52 * i43;
                                int i54 = (i52 + 1) * i43;
                                int i55 = i54 - i51;
                                int i56 = i54 - i53;
                                sArr8[i49] = (short) ((((i56 - i55) * s10) + (s9 * i55)) / i56);
                            }
                            this.f3068q++;
                            this.f3065m++;
                        }
                        this.f3067p = i20;
                        if (i20 == i44) {
                            this.f3067p = 0;
                            if (i21 == i43) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            w7.b.u(z10);
                            this.f3068q = 0;
                        }
                        i46++;
                    }
                    if (i19 != 0) {
                        short[] sArr10 = this.f3066n;
                        System.arraycopy(sArr10, i19 * i24, sArr10, 0, (i18 - i19) * i24);
                        this.o -= i19;
                        return;
                    }
                    return;
                }
            }
        }
        i10 = i22;
        f10 = f14;
        i12 = i23;
        if (f10 == 1.0f) {
        }
    }
}
