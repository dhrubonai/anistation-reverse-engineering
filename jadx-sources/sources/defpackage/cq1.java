package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq1 implements ds1 {
    public final zi4 a;
    public final String c;
    public final int d;
    public String e;
    public bh6 f;
    public int h;
    public int i;
    public int j;
    public long k;
    public ea2 l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public byte g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public cq1(String str, int i, int i2) {
        this.a = new zi4(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        boolean z;
        char c;
        char c2;
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        long j2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        this.f.getClass();
        while (zi4Var.a() > 0) {
            byte b3 = this.g;
            zi4 zi4Var2 = this.a;
            switch (b3) {
                case 0:
                    while (true) {
                        if (zi4Var.a() > 0) {
                            int i13 = this.j << 8;
                            this.j = i13;
                            int A = i13 | zi4Var.A();
                            this.j = A;
                            int v = h98.v(A);
                            this.o = v;
                            if (v != 0) {
                                h(this.j);
                                this.j = 0;
                                if (this.v && this.o == 2) {
                                    this.h = 0;
                                    break;
                                } else {
                                    int i14 = this.o;
                                    if (i14 == 1) {
                                        this.v = false;
                                    }
                                    if (i14 != 3 && i14 != 4) {
                                        if (i14 == 1) {
                                            this.g = (byte) 1;
                                            break;
                                        } else {
                                            this.g = (byte) 2;
                                            break;
                                        }
                                    } else {
                                        this.g = (byte) 4;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!b(zi4Var, zi4Var2.a, 18)) {
                        break;
                    } else {
                        this.u = true;
                        byte[] bArr = zi4Var2.a;
                        if (this.l == null) {
                            String str = this.e;
                            yi0 x = h98.x(bArr);
                            x.o(60);
                            int i15 = h98.f[x.g(6)];
                            int i16 = h98.g[x.g(4)];
                            c2 = 7;
                            int g = x.g(5);
                            int[] iArr = h98.h;
                            c = 5;
                            if (g >= 29) {
                                i3 = -1;
                            } else {
                                i3 = (iArr[g] * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) / 2;
                            }
                            x.o(10);
                            if (x.g(2) > 0) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            int i17 = i15 + i4;
                            da2 da2Var = new da2();
                            da2Var.a = str;
                            da2Var.n = qy3.n("video/mp2t");
                            da2Var.o = qy3.n("audio/vnd.dts");
                            da2Var.i = i3;
                            da2Var.I = i17;
                            da2Var.K = i16;
                            da2Var.s = null;
                            da2Var.d = this.c;
                            da2Var.f = this.d;
                            this.l = new ea2(da2Var);
                            this.r = true;
                        } else {
                            c = 5;
                            c2 = 7;
                        }
                        this.m = h98.u(bArr);
                        byte b4 = bArr[0];
                        if (b4 != -2) {
                            if (b4 != -1) {
                                if (b4 != 31) {
                                    i = (bArr[4] & 1) << 6;
                                    b = bArr[c];
                                } else {
                                    i = (bArr[c] & 7) << 4;
                                    b2 = bArr[6];
                                }
                            } else {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[c2];
                            }
                            i2 = b2 & 60;
                            this.k = jf7.q(eq6.c0(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                            zi4Var2.N(0);
                            this.f.e(18, zi4Var2);
                            this.g = (byte) 6;
                            break;
                        } else {
                            i = (bArr[c] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = jf7.q(eq6.c0(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                        zi4Var2.N(0);
                        this.f.e(18, zi4Var2);
                        this.g = (byte) 6;
                    }
                case 2:
                    if (b(zi4Var, zi4Var2.a, 7)) {
                        yi0 x2 = h98.x(zi4Var2.a);
                        x2.o(42);
                        if (x2.f()) {
                            i5 = 12;
                        } else {
                            i5 = 8;
                        }
                        this.p = x2.g(i5) + 1;
                        this.g = (byte) 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (b(zi4Var, zi4Var2.a, this.p)) {
                        dq1 J = h98.J(zi4Var2.a);
                        i(J);
                        this.m = J.d;
                        long j3 = J.b;
                        if (j3 != -9223372036854775807L) {
                            this.k = j3;
                        }
                        zi4Var2.N(0);
                        this.f.e(this.p, zi4Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (b(zi4Var, zi4Var2.a, 6)) {
                        yi0 x3 = h98.x(zi4Var2.a);
                        x3.o(32);
                        int L = h98.L(x3, h98.n) + 1;
                        this.q = L;
                        int i18 = this.h;
                        if (i18 > L) {
                            int i19 = i18 - L;
                            this.h = i18 - i19;
                            zi4Var.N(zi4Var.b - i19);
                        }
                        this.g = (byte) 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(zi4Var, zi4Var2.a, this.q)) {
                        byte[] bArr2 = zi4Var2.a;
                        yi0 x4 = h98.x(bArr2);
                        if (x4.g(32) == 1078008818) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        int L2 = h98.L(x4, h98.j);
                        int i20 = L2 + 1;
                        if (i6 != 0) {
                            if (x4.f()) {
                                j = -9223372036854775807L;
                                int i21 = L2 - 1;
                                int i22 = (bArr2[L2] & 255) | ((bArr2[i21] << 8) & 65535);
                                String str2 = eq6.a;
                                int i23 = 65535;
                                for (int i24 = 0; i24 < i21; i24++) {
                                    byte b5 = bArr2[i24];
                                    int i25 = (((b5 & 255) >> 4) ^ ((i23 >> 12) & 255)) & 255;
                                    int i26 = (i23 << 4) & 65535;
                                    int[] iArr2 = eq6.k;
                                    int i27 = (iArr2[i25] ^ i26) & 65535;
                                    i23 = (((i27 << 4) & 65535) ^ iArr2[((b5 & 15) ^ ((i27 >> 12) & 255)) & 255]) & 65535;
                                }
                                if (i22 == i23) {
                                    int g2 = x4.g(2);
                                    if (g2 != 0) {
                                        if (g2 != 1) {
                                            if (g2 == 2) {
                                                i9 = 384;
                                            } else {
                                                throw bj4.a("Unsupported base duration index in DTS UHD header: " + g2, null);
                                            }
                                        } else {
                                            i9 = 480;
                                        }
                                    } else {
                                        i9 = 512;
                                    }
                                    int g3 = (x4.g(3) + 1) * i9;
                                    int g4 = x4.g(2);
                                    if (g4 != 0) {
                                        if (g4 != 1) {
                                            if (g4 == 2) {
                                                i10 = 48000;
                                            } else {
                                                throw bj4.a("Unsupported clock rate index in DTS UHD header: " + g4, null);
                                            }
                                        } else {
                                            i10 = 44100;
                                        }
                                    } else {
                                        i10 = 32000;
                                    }
                                    if (x4.f()) {
                                        x4.o(36);
                                    }
                                    i7 = (1 << x4.g(2)) * i10;
                                    j2 = eq6.e0(g3, 1000000L, i10, RoundingMode.DOWN);
                                } else {
                                    throw bj4.a("CRC check failed", null);
                                }
                            } else {
                                throw bj4.d("Only supports full channel mask-based audio presentation");
                            }
                        } else {
                            j = -9223372036854775807L;
                            i7 = -2147483647;
                            j2 = -9223372036854775807L;
                        }
                        int i28 = i7;
                        int i29 = 0;
                        for (int i30 = 0; i30 < i6; i30++) {
                            i29 += h98.L(x4, h98.k);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i6 != 0) {
                            atomicInteger.set(h98.L(x4, h98.l));
                        }
                        if (atomicInteger.get() != 0) {
                            i8 = h98.L(x4, h98.m);
                        } else {
                            i8 = 0;
                        }
                        int i31 = i29 + i8 + i20;
                        dq1 dq1Var = new dq1("audio/vnd.dts.uhd;profile=p2", 2, i28, i31, j2);
                        if (this.o == 3) {
                            i(dq1Var);
                        }
                        this.m = i31;
                        if (j2 == j) {
                            j2 = 0;
                        }
                        this.k = j2;
                        zi4Var2.N(0);
                        this.f.e(this.q, zi4Var2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(zi4Var.a(), this.m - this.h);
                    this.f.e(min, zi4Var);
                    int i32 = this.h + min;
                    this.h = i32;
                    int i33 = this.m;
                    if (i32 != i33) {
                        break;
                    } else if (this.o == 1) {
                        this.n = i33;
                        this.h = 0;
                        this.i = 0;
                        this.g = (byte) 7;
                        break;
                    } else {
                        if (this.s != -9223372036854775807L) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        io3.B(z2);
                        int i34 = this.m;
                        int i35 = this.o;
                        if (i35 == 2) {
                            i11 = this.n;
                        } else {
                            i11 = 0;
                        }
                        int i36 = i34 + i11;
                        long j4 = this.s;
                        bh6 bh6Var = this.f;
                        if (i35 == 4) {
                            i12 = 0;
                        } else {
                            i12 = 1;
                        }
                        bh6Var.a(j4, i12, i36, 0, null);
                        this.s += this.k;
                        long j5 = this.t;
                        if (j5 != -9223372036854775807L) {
                            if (j5 != j4) {
                                this.s = j5;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        this.g = (byte) 0;
                        break;
                    }
                case 7:
                    while (zi4Var.a() > 0 && this.h < 4) {
                        int i37 = this.i << 8;
                        this.i = i37;
                        this.i = i37 | zi4Var.A();
                        this.h++;
                    }
                    if (this.h != 4) {
                        break;
                    } else if (h98.v(this.i) == 2) {
                        h(this.i);
                        this.o = 2;
                        this.i = 0;
                        this.g = (byte) 2;
                        break;
                    } else {
                        if (this.r) {
                            bh6 bh6Var2 = this.f;
                            ea2 ea2Var = this.l;
                            ea2Var.getClass();
                            bh6Var2.g(ea2Var);
                            this.r = false;
                        }
                        if (this.s != -9223372036854775807L) {
                            z = true;
                        } else {
                            z = false;
                        }
                        io3.B(z);
                        long j6 = this.s;
                        this.f.a(j6, 1, this.n, 0, null);
                        this.s += this.k;
                        long j7 = this.t;
                        if (j7 != -9223372036854775807L) {
                            if (j7 != j6) {
                                this.s = j7;
                            }
                            this.t = -9223372036854775807L;
                        }
                        this.n = 0;
                        int i38 = this.i;
                        this.j = i38;
                        this.i = 0;
                        int v2 = h98.v(i38);
                        this.o = v2;
                        if (v2 != 3 && v2 != 4) {
                            if (v2 == 1) {
                                h(this.j);
                                this.j = 0;
                                this.g = (byte) 1;
                                break;
                            } else {
                                this.h = 0;
                                this.g = (byte) 0;
                                break;
                            }
                        } else {
                            h(this.j);
                            this.j = 0;
                            this.g = (byte) 4;
                            break;
                        }
                    }
                default:
                    p65.l();
                    return;
            }
        }
    }

    public final boolean b(zi4 zi4Var, byte[] bArr, int i) {
        int min = Math.min(zi4Var.a(), i - this.h);
        zi4Var.k(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ds1
    public final void c() {
        this.g = (byte) 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // defpackage.ds1
    public final void e() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                bh6 bh6Var = this.f;
                ea2 ea2Var = this.l;
                ea2Var.getClass();
                bh6Var.g(ea2Var);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.a(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = (byte) 0;
        }
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = -9223372036854775807L;
            }
        }
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.e = lk6Var.e;
        lk6Var.b();
        this.f = d12Var.G(lk6Var.d, 1);
    }

    public final void h(int i) {
        byte[] bArr = this.a.a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    public final void i(dq1 dq1Var) {
        da2 a;
        int i = dq1Var.a;
        int i2 = dq1Var.c;
        if (i != -2147483647 && i2 != -1) {
            String str = (String) dq1Var.e;
            if (str == null) {
                ea2 ea2Var = this.l;
                if (ea2Var != null) {
                    str = ea2Var.p;
                } else {
                    str = null;
                }
            }
            ea2 ea2Var2 = this.l;
            if (ea2Var2 == null || this.r || i2 != ea2Var2.J || i != ea2Var2.L || !Objects.equals(str, ea2Var2.p)) {
                ea2 ea2Var3 = this.l;
                if (ea2Var3 == null) {
                    a = new da2();
                } else {
                    a = ea2Var3.a();
                }
                a.a = this.e;
                a.n = qy3.n("video/mp2t");
                a.o = qy3.n(str);
                a.I = i2;
                a.K = i;
                a.d = this.c;
                a.f = this.d;
                ea2 ea2Var4 = new ea2(a);
                this.l = ea2Var4;
                this.f.g(ea2Var4);
                this.r = false;
            }
        }
    }
}
