package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w6 implements ds1 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public bh6 h;
    public bh6 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public bh6 v;
    public long w;
    public final yi0 b = new yi0(7, new byte[7]);
    public final zi4 c = new zi4(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public w6(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        int i;
        int i2;
        byte b;
        byte b2;
        char c;
        ?? r4;
        byte b3;
        char c2;
        int i3;
        char c3;
        boolean z;
        int i4;
        this.h.getClass();
        String str = eq6.a;
        while (zi4Var.a() > 0) {
            byte b4 = this.j;
            char c4 = 65535;
            zi4 zi4Var2 = this.c;
            byte b5 = 3;
            yi0 yi0Var = this.b;
            int i5 = 0;
            int i6 = 4;
            boolean z2 = true;
            int i7 = 1;
            if (b4 != 0) {
                if (b4 != 1) {
                    if (b4 != 2) {
                        if (b4 != 3) {
                            if (b4 == 4) {
                                int min = Math.min(zi4Var.a(), this.t - this.k);
                                this.v.e(min, zi4Var);
                                int i8 = this.k + min;
                                this.k = i8;
                                if (i8 == this.t) {
                                    if (this.u == -9223372036854775807L) {
                                        z2 = false;
                                    }
                                    io3.B(z2);
                                    this.v.a(this.u, 1, this.t, 0, null);
                                    this.u += this.w;
                                    this.j = (byte) 0;
                                    this.k = 0;
                                    this.l = (short) 256;
                                }
                            } else {
                                p65.l();
                                return;
                            }
                        } else {
                            if (this.m) {
                                i = 7;
                            } else {
                                i = 5;
                            }
                            byte[] bArr = yi0Var.b;
                            int min2 = Math.min(zi4Var.a(), i - this.k);
                            zi4Var.k(bArr, this.k, min2);
                            int i9 = this.k + min2;
                            this.k = i9;
                            if (i9 == i) {
                                yi0Var.m(0);
                                if (!this.r) {
                                    int g = yi0Var.g(2) + 1;
                                    if (g != 2) {
                                        kb0.O("AdtsReader", "Detected audio object type: " + g + ", but assuming AAC LC.");
                                        g = 2;
                                    }
                                    yi0Var.o(5);
                                    int g2 = yi0Var.g(3);
                                    int i10 = this.p;
                                    byte[] bArr2 = {(byte) (((g << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((g2 << 3) & 120) | ((i10 << 7) & 128))};
                                    ed4 K = iv.K(new yi0(2, bArr2), false);
                                    da2 da2Var = new da2();
                                    da2Var.a = this.g;
                                    da2Var.n = qy3.n(this.f);
                                    da2Var.o = qy3.n("audio/mp4a-latm");
                                    da2Var.k = (String) K.z;
                                    da2Var.I = K.y;
                                    da2Var.K = K.x;
                                    da2Var.r = Collections.singletonList(bArr2);
                                    da2Var.d = this.d;
                                    da2Var.f = this.e;
                                    ea2 ea2Var = new ea2(da2Var);
                                    this.s = 1024000000 / ea2Var.L;
                                    this.h.g(ea2Var);
                                    this.r = true;
                                } else {
                                    yi0Var.o(10);
                                }
                                yi0Var.o(4);
                                int g3 = yi0Var.g(13);
                                int i11 = g3 - 7;
                                if (this.m) {
                                    i11 = g3 - 9;
                                }
                                bh6 bh6Var = this.h;
                                long j = this.s;
                                this.j = (byte) 4;
                                this.k = 0;
                                this.v = bh6Var;
                                this.w = j;
                                this.t = i11;
                            }
                        }
                    } else {
                        byte[] bArr3 = zi4Var2.a;
                        int min3 = Math.min(zi4Var.a(), 10 - this.k);
                        zi4Var.k(bArr3, this.k, min3);
                        int i12 = this.k + min3;
                        this.k = i12;
                        if (i12 == 10) {
                            this.i.e(10, zi4Var2);
                            zi4Var2.N(6);
                            bh6 bh6Var2 = this.i;
                            int z3 = zi4Var2.z() + 10;
                            this.j = (byte) 4;
                            this.k = 10;
                            this.v = bh6Var2;
                            this.w = 0L;
                            this.t = z3;
                        }
                    }
                } else if (zi4Var.a() != 0) {
                    yi0Var.b[0] = zi4Var.a[zi4Var.b];
                    yi0Var.m(2);
                    int g4 = yi0Var.g(4);
                    int i13 = this.p;
                    if (i13 != -1 && g4 != i13) {
                        this.n = false;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    } else {
                        if (!this.n) {
                            this.n = true;
                            this.o = this.q;
                            this.p = g4;
                        }
                        this.j = (byte) 3;
                        this.k = 0;
                    }
                }
            } else {
                byte[] bArr4 = zi4Var.a;
                int i14 = zi4Var.b;
                int i15 = zi4Var.c;
                while (true) {
                    if (i14 < i15) {
                        i2 = i14 + 1;
                        b = b5;
                        b2 = bArr4[i14];
                        int i16 = b2 & 255;
                        if (this.l == 512 && (((65280 | ((((byte) i16) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (this.n) {
                                break;
                            }
                            int i17 = i14 - 1;
                            zi4Var.N(i14);
                            byte[] bArr5 = yi0Var.b;
                            if (zi4Var.a() >= i7) {
                                zi4Var.k(bArr5, i5, i7);
                                yi0Var.m(i6);
                                int g5 = yi0Var.g(i7);
                                int i18 = this.o;
                                if (i18 != -1 && g5 != i18) {
                                    c = 65535;
                                } else {
                                    if (this.p != -1) {
                                        byte[] bArr6 = yi0Var.b;
                                        if (zi4Var.a() < i7) {
                                            break;
                                        }
                                        zi4Var.k(bArr6, i5, i7);
                                        yi0Var.m(2);
                                        i4 = 4;
                                        if (yi0Var.g(4) == this.p) {
                                            zi4Var.N(i2);
                                        }
                                    } else {
                                        i4 = 4;
                                    }
                                    byte[] bArr7 = yi0Var.b;
                                    if (zi4Var.a() >= i4) {
                                        zi4Var.k(bArr7, i5, i4);
                                        yi0Var.m(14);
                                        int g6 = yi0Var.g(13);
                                        if (g6 >= 7) {
                                            byte[] bArr8 = zi4Var.a;
                                            int i19 = zi4Var.c;
                                            int i20 = i17 + g6;
                                            if (i20 < i19) {
                                                byte b6 = bArr8[i20];
                                                c = 65535;
                                                if (b6 == -1) {
                                                    int i21 = i20 + 1;
                                                    if (i21 != i19) {
                                                        byte b7 = bArr8[i21];
                                                        if ((((65280 | ((b7 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b7 & 8) >> 3) == g5) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                } else if (b6 == 73) {
                                                    int i22 = i20 + 1;
                                                    if (i22 != i19) {
                                                        if (bArr8[i22] == 68) {
                                                            int i23 = i20 + 2;
                                                            if (i23 != i19) {
                                                                if (bArr8[i23] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                r4 = true;
                            }
                            c = 65535;
                            r4 = true;
                        } else {
                            c = c4;
                            r4 = i7;
                        }
                        short s = this.l;
                        int i24 = i16 | s;
                        if (i24 != 329) {
                            if (i24 != 511) {
                                if (i24 != 836) {
                                    if (i24 != 1075) {
                                        c2 = 256;
                                        if (s != 256) {
                                            this.l = (short) 256;
                                            b3 = 3;
                                            i3 = 0;
                                            c3 = 2;
                                            i7 = r4;
                                            c4 = c;
                                            i6 = 4;
                                            i5 = i3;
                                            b5 = b3;
                                        } else {
                                            b3 = 3;
                                            i3 = 0;
                                            c3 = 2;
                                        }
                                    } else {
                                        this.j = (byte) 2;
                                        this.k = 3;
                                        this.t = 0;
                                        zi4Var2.N(0);
                                        zi4Var.N(i2);
                                        break;
                                    }
                                } else {
                                    b3 = 3;
                                    c2 = 256;
                                    i3 = 0;
                                    c3 = 2;
                                    this.l = (short) 1024;
                                }
                            } else {
                                b3 = 3;
                                c2 = 256;
                                i3 = 0;
                                c3 = 2;
                                this.l = (short) 512;
                            }
                        } else {
                            b3 = 3;
                            c2 = 256;
                            i3 = 0;
                            c3 = 2;
                            this.l = (short) 768;
                        }
                        i14 = i2;
                        i7 = r4;
                        c4 = c;
                        i6 = 4;
                        i5 = i3;
                        b5 = b3;
                    } else {
                        zi4Var.N(i14);
                        break;
                    }
                }
                this.q = (b2 & 8) >> 3;
                if ((b2 & 1) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
                if (!this.n) {
                    this.j = (byte) 1;
                    this.k = 0;
                } else {
                    this.j = b;
                    this.k = 0;
                }
                zi4Var.N(i2);
            }
        }
    }

    @Override // defpackage.ds1
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.g = lk6Var.e;
        lk6Var.b();
        bh6 G = d12Var.G(lk6Var.d, 1);
        this.h = G;
        this.v = G;
        if (this.a) {
            lk6Var.a();
            lk6Var.b();
            bh6 G2 = d12Var.G(lk6Var.d, 5);
            this.i = G2;
            da2 da2Var = new da2();
            lk6Var.b();
            da2Var.a = lk6Var.e;
            da2Var.n = qy3.n(this.f);
            da2Var.o = qy3.n("application/id3");
            zo5.q(da2Var, G2);
            return;
        }
        this.i = new vg1();
    }
}
