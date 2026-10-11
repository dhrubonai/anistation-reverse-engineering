package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ax6 extends xy5 {
    public zp2 n;
    public int o;
    public boolean p;
    public bx6 q;
    public sn3 r;

    @Override // defpackage.xy5
    public final void a(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        bx6 bx6Var = this.q;
        if (bx6Var != null) {
            i = bx6Var.e;
        }
        this.o = i;
    }

    @Override // defpackage.xy5
    public final long b(zi4 zi4Var) {
        int i;
        int i2 = 0;
        if ((zi4Var.a[0] & 1) == 1) {
            return -1L;
        }
        zp2 zp2Var = this.n;
        zp2Var.getClass();
        byte b = zi4Var.a[0];
        bx6 bx6Var = (bx6) zp2Var.x;
        qx2[] qx2VarArr = (qx2[]) zp2Var.A;
        if (qx2VarArr[(b >> 1) & (255 >>> (8 - ct5.j(qx2VarArr.length - 1)))].y) {
            i = bx6Var.f;
        } else {
            i = bx6Var.e;
        }
        int i3 = this.o;
        if (this.p) {
            i2 = (i3 + i) / 4;
        }
        long j = i2;
        byte[] bArr = zi4Var.a;
        int length = bArr.length;
        int i4 = zi4Var.c + 4;
        if (length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            zi4Var.L(copyOf.length, copyOf);
        } else {
            zi4Var.M(i4);
        }
        byte[] bArr2 = zi4Var.a;
        int i5 = zi4Var.c;
        bArr2[i5 - 4] = (byte) (j & 255);
        bArr2[i5 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i5 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i5 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.xy5
    public final boolean c(zi4 zi4Var, long j, l33 l33Var) {
        zp2 zp2Var;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        if (this.n != null) {
            ((ea2) l33Var.y).getClass();
            return false;
        }
        bx6 bx6Var = this.q;
        int i5 = 4;
        if (bx6Var == null) {
            ct5.p(1, zi4Var, false);
            zi4Var.s();
            int A = zi4Var.A();
            int s = zi4Var.s();
            int o = zi4Var.o();
            if (o <= 0) {
                i3 = -1;
            } else {
                i3 = o;
            }
            int o2 = zi4Var.o();
            if (o2 <= 0) {
                i4 = -1;
            } else {
                i4 = o2;
            }
            zi4Var.o();
            int A2 = zi4Var.A();
            int pow = (int) Math.pow(2.0d, A2 & 15);
            int pow2 = (int) Math.pow(2.0d, (A2 & 240) >> 4);
            zi4Var.A();
            this.q = new bx6(A, s, i3, i4, pow, pow2, Arrays.copyOf(zi4Var.a, zi4Var.c));
        } else {
            sn3 sn3Var = this.r;
            if (sn3Var == null) {
                this.r = ct5.m(zi4Var, true, true);
            } else {
                int i6 = zi4Var.c;
                byte[] bArr = new byte[i6];
                System.arraycopy(zi4Var.a, 0, bArr, 0, i6);
                short s2 = bx6Var.a;
                int i7 = 5;
                ct5.p(5, zi4Var, false);
                int A3 = zi4Var.A() + 1;
                yi0 yi0Var = new yi0(zi4Var.a);
                int i8 = 8;
                yi0Var.o(zi4Var.b * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 16;
                    if (i9 < A3) {
                        int i11 = i8;
                        if (yi0Var.g(24) == 5653314) {
                            int g = yi0Var.g(16);
                            int g2 = yi0Var.g(24);
                            if (!yi0Var.f()) {
                                boolean f = yi0Var.f();
                                for (int i12 = 0; i12 < g2; i12++) {
                                    if (f) {
                                        if (yi0Var.f()) {
                                            yi0Var.o(5);
                                        }
                                    } else {
                                        yi0Var.o(5);
                                    }
                                }
                            } else {
                                yi0Var.o(5);
                                for (int i13 = 0; i13 < g2; i13 += yi0Var.g(ct5.j(g2 - i13))) {
                                }
                            }
                            int g3 = yi0Var.g(i5);
                            if (g3 <= 2) {
                                if (g3 == 1 || g3 == 2) {
                                    yi0Var.o(32);
                                    yi0Var.o(32);
                                    int g4 = yi0Var.g(i5) + 1;
                                    yi0Var.o(1);
                                    if (g3 == 1) {
                                        if (g != 0) {
                                            j2 = (long) Math.floor(Math.pow(g2, 1.0d / g));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = g * g2;
                                    }
                                    yi0Var.o((int) (j2 * g4));
                                }
                                i9++;
                                i8 = i11;
                                i5 = 4;
                            } else {
                                throw bj4.a("lookup type greater than 2 not decodable: " + g3, null);
                            }
                        } else {
                            throw bj4.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((yi0Var.d * 8) + yi0Var.e), null);
                        }
                    } else {
                        int i14 = i8;
                        int i15 = 6;
                        int g5 = yi0Var.g(6) + 1;
                        for (int i16 = 0; i16 < g5; i16++) {
                            if (yi0Var.g(16) != 0) {
                                throw bj4.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i17 = 1;
                        int g6 = yi0Var.g(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < g6) {
                                int g7 = yi0Var.g(i10);
                                if (g7 != 0) {
                                    if (g7 == i17) {
                                        int g8 = yi0Var.g(i7);
                                        int[] iArr = new int[g8];
                                        int i20 = -1;
                                        for (int i21 = 0; i21 < g8; i21++) {
                                            int g9 = yi0Var.g(4);
                                            iArr[i21] = g9;
                                            if (g9 > i20) {
                                                i20 = g9;
                                            }
                                        }
                                        int i22 = i20 + 1;
                                        int[] iArr2 = new int[i22];
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            iArr2[i23] = yi0Var.g(i19) + 1;
                                            int g10 = yi0Var.g(2);
                                            int i24 = i14;
                                            if (g10 > 0) {
                                                yi0Var.o(i24);
                                            }
                                            int i25 = i22;
                                            int i26 = 0;
                                            for (int i27 = 1; i26 < (i27 << g10); i27 = 1) {
                                                yi0Var.o(i24);
                                                i26++;
                                                i24 = 8;
                                            }
                                            i23++;
                                            i22 = i25;
                                            i14 = 8;
                                            i19 = 3;
                                        }
                                        yi0Var.o(2);
                                        int g11 = yi0Var.g(4);
                                        int i28 = 0;
                                        int i29 = 0;
                                        int i30 = 0;
                                        while (i28 < g8) {
                                            i29 += iArr2[iArr[i28]];
                                            int i31 = i30;
                                            while (i31 < i29) {
                                                yi0Var.o(g11);
                                                i31++;
                                            }
                                            i28++;
                                            i30 = i31;
                                        }
                                    } else {
                                        throw bj4.a("floor type greater than 1 not decodable: " + g7, null);
                                    }
                                } else {
                                    int i32 = i14;
                                    yi0Var.o(i32);
                                    yi0Var.o(16);
                                    yi0Var.o(16);
                                    yi0Var.o(6);
                                    yi0Var.o(i32);
                                    int g12 = yi0Var.g(4) + 1;
                                    int i33 = 0;
                                    while (i33 < g12) {
                                        yi0Var.o(i32);
                                        i33++;
                                        i32 = 8;
                                    }
                                }
                                i18++;
                                i14 = 8;
                                i15 = 6;
                                i17 = 1;
                                i10 = 16;
                                i7 = 5;
                            } else {
                                int g13 = yi0Var.g(i15) + 1;
                                int i34 = 0;
                                while (i34 < g13) {
                                    if (yi0Var.g(16) <= 2) {
                                        yi0Var.o(24);
                                        yi0Var.o(24);
                                        yi0Var.o(24);
                                        int g14 = yi0Var.g(i15) + 1;
                                        int i35 = 8;
                                        yi0Var.o(8);
                                        int[] iArr3 = new int[g14];
                                        for (int i36 = 0; i36 < g14; i36++) {
                                            int g15 = yi0Var.g(3);
                                            if (yi0Var.f()) {
                                                i2 = yi0Var.g(5);
                                            } else {
                                                i2 = 0;
                                            }
                                            iArr3[i36] = (i2 * 8) + g15;
                                        }
                                        int i37 = 0;
                                        while (i37 < g14) {
                                            int i38 = 0;
                                            while (i38 < i35) {
                                                if ((iArr3[i37] & (1 << i38)) != 0) {
                                                    yi0Var.o(i35);
                                                }
                                                i38++;
                                                i35 = 8;
                                            }
                                            i37++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        i15 = 6;
                                    } else {
                                        throw bj4.a("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int g16 = yi0Var.g(i15) + 1;
                                for (int i39 = 0; i39 < g16; i39++) {
                                    int g17 = yi0Var.g(16);
                                    if (g17 != 0) {
                                        kb0.s("VorbisUtil", "mapping type other than 0 not supported: " + g17);
                                    } else {
                                        if (yi0Var.f()) {
                                            i = yi0Var.g(4) + 1;
                                        } else {
                                            i = 1;
                                        }
                                        if (yi0Var.f()) {
                                            int g18 = yi0Var.g(8) + 1;
                                            for (int i40 = 0; i40 < g18; i40++) {
                                                int i41 = s2 - 1;
                                                yi0Var.o(ct5.j(i41));
                                                yi0Var.o(ct5.j(i41));
                                            }
                                        }
                                        if (yi0Var.g(2) == 0) {
                                            if (i > 1) {
                                                for (int i42 = 0; i42 < s2; i42++) {
                                                    yi0Var.o(4);
                                                }
                                            }
                                            for (int i43 = 0; i43 < i; i43++) {
                                                yi0Var.o(8);
                                                yi0Var.o(8);
                                                yi0Var.o(8);
                                            }
                                        } else {
                                            throw bj4.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                    }
                                }
                                int g19 = yi0Var.g(6) + 1;
                                qx2[] qx2VarArr = new qx2[g19];
                                for (int i44 = 0; i44 < g19; i44++) {
                                    boolean f2 = yi0Var.f();
                                    yi0Var.g(16);
                                    yi0Var.g(16);
                                    yi0Var.g(8);
                                    qx2VarArr[i44] = new qx2((byte) 2, f2);
                                }
                                if (yi0Var.f()) {
                                    zp2Var = new zp2(bx6Var, sn3Var, bArr, qx2VarArr);
                                } else {
                                    throw bj4.a("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zp2Var = null;
        this.n = zp2Var;
        if (zp2Var == null) {
            return true;
        }
        bx6 bx6Var2 = (bx6) zp2Var.x;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bx6Var2.g);
        arrayList.add((byte[]) zp2Var.z);
        fy3 a = cx6.a(nw2.p((String[]) ((sn3) zp2Var.y).y));
        da2 da2Var = new da2();
        da2Var.n = qy3.n("audio/ogg");
        da2Var.o = qy3.n("audio/vorbis");
        da2Var.i = bx6Var2.d;
        da2Var.j = bx6Var2.c;
        da2Var.I = bx6Var2.a;
        da2Var.K = bx6Var2.b;
        da2Var.r = arrayList;
        da2Var.l = a;
        l33Var.y = new ea2(da2Var);
        return true;
    }

    @Override // defpackage.xy5
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
