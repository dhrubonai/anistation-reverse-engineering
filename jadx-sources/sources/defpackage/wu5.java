package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wu5 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final uu5 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public wu5(int i, int i2, float f, float f2, int i3, boolean z) {
        uu5 vu5Var;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / CommonGatewayClient.CODE_400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        if (z) {
            vu5Var = new tu5(this);
        } else {
            vu5Var = new vu5(this);
        }
        this.i = vu5Var;
    }

    public final void a(int i, int i2) {
        uu5 uu5Var = this.i;
        uu5Var.i(i2);
        Object b = uu5Var.b();
        int i3 = this.b;
        System.arraycopy(b, i * i3, uu5Var.h(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int i;
        float f;
        int i2;
        int i3;
        double d;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        long j2;
        boolean z;
        int i11 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i12 = this.a;
        int i13 = 1;
        uu5 uu5Var = this.i;
        int i14 = this.b;
        if (d2 <= 1.0000100135803223d && d2 >= 0.9999899864196777d) {
            a(0, this.j);
            this.j = 0;
        } else {
            int i15 = this.j;
            int i16 = this.h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.o;
                    if (i18 > 0) {
                        int min = Math.min(i16, i18);
                        a(i17, min);
                        this.o -= min;
                        i17 += min;
                        f = f4;
                        d = d2;
                        i6 = i13;
                        i4 = i16;
                    } else {
                        if (i12 > 4000) {
                            i = i12 / 4000;
                        } else {
                            i = i13;
                        }
                        int i19 = this.g;
                        int i20 = this.f;
                        if (i14 == i13 && i == i13) {
                            i2 = uu5Var.f(i17, i20, i19);
                            f = f4;
                        } else {
                            uu5Var.e(i17, i);
                            f = f4;
                            int q = uu5Var.q(i20 / i, i19 / i);
                            if (i != i13) {
                                int i21 = q * i;
                                int i22 = i * 4;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                if (i23 >= i20) {
                                    i20 = i23;
                                }
                                if (i24 <= i19) {
                                    i19 = i24;
                                }
                                if (i14 == i13) {
                                    i2 = uu5Var.f(i17, i20, i19);
                                } else {
                                    uu5Var.e(i17, i13);
                                    i2 = uu5Var.q(i20, i19);
                                }
                            } else {
                                i2 = q;
                            }
                        }
                        if (uu5Var.j()) {
                            i3 = this.p;
                        } else {
                            i3 = i2;
                        }
                        uu5Var.g();
                        this.p = i2;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i7 = i13;
                                double d4 = (i3 / (d2 - 1.0d)) + d3;
                                i8 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - i8;
                                uu5Var = uu5Var;
                            } else {
                                d = d2;
                                i7 = i13;
                                double d5 = (((2.0d - d) * i3) / (d - 1.0d)) + d3;
                                int round = (int) Math.round(d5);
                                this.o = round;
                                this.q = d5 - round;
                                i8 = i3;
                            }
                            uu5Var.i(i8);
                            int i25 = i16;
                            int i26 = i8;
                            uu5Var.m(i26, this.b, this.k, i17, i17 + i3);
                            this.k += i26;
                            i17 = i3 + i26 + i17;
                            i4 = i25;
                            i6 = i7;
                        } else {
                            d = d2;
                            int i27 = i13;
                            int i28 = i16;
                            if (d < 0.5d) {
                                i4 = i28;
                                double d6 = ((i3 * d) / (1.0d - d)) + d3;
                                i5 = (int) Math.round(d6);
                                this.q = d6 - i5;
                            } else {
                                i4 = i28;
                                double d7 = ((((2.0d * d) - 1.0d) * i3) / (1.0d - d)) + d3;
                                int round2 = (int) Math.round(d7);
                                this.o = round2;
                                this.q = d7 - round2;
                                i5 = i3;
                            }
                            int i29 = i3 + i5;
                            uu5Var.i(i29);
                            i6 = i27;
                            System.arraycopy(uu5Var.b(), i17 * i14, uu5Var.h(), this.k * i14, i3 * i14);
                            int i30 = i17;
                            uu5Var.m(i5, this.b, this.k + i3, i3 + i17, i30);
                            this.k += i29;
                            i17 = i30 + i5;
                        }
                    }
                    if (i17 + i4 > i15) {
                        break;
                    }
                    i16 = i4;
                    f4 = f;
                    i13 = i6;
                    d2 = d;
                }
                int i31 = this.j - i17;
                System.arraycopy(uu5Var.b(), i17 * i14, uu5Var.b(), 0, i31 * i14);
                this.j = i31;
                if (f == 1.0f && this.k != i11) {
                    long j3 = i12 / f;
                    long j4 = i12;
                    while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                        j3 /= 2;
                        j4 /= 2;
                    }
                    int i32 = this.k - i11;
                    uu5Var.n(i32);
                    System.arraycopy(uu5Var.h(), i11 * i14, uu5Var.l(), this.l * i14, i32 * i14);
                    this.k = i11;
                    this.l += i32;
                    int i33 = 0;
                    while (true) {
                        i9 = this.l - 1;
                        if (i33 >= i9) {
                            break;
                        }
                        while (true) {
                            i10 = this.m + 1;
                            j = i10;
                            long j5 = j * j3;
                            j2 = this.n;
                            if (j5 <= j2 * j4) {
                                break;
                            }
                            int i34 = i6;
                            uu5Var.i(i34);
                            uu5Var.k(j4, i33, j3);
                            this.n += i34;
                            this.k += i34;
                        }
                        int i35 = i6;
                        this.m = i10;
                        if (j == j4) {
                            this.m = 0;
                            if (j2 == j3) {
                                z = i35;
                            } else {
                                z = 0;
                            }
                            io3.B(z);
                            this.n = 0;
                        }
                        i33++;
                        i6 = i35;
                    }
                    if (i9 != 0) {
                        System.arraycopy(uu5Var.l(), i9 * i14, uu5Var.l(), 0, (this.l - i9) * i14);
                        this.l -= i9;
                        return;
                    }
                    return;
                }
            }
        }
        f = f4;
        i6 = 1;
        if (f == 1.0f) {
        }
    }
}
