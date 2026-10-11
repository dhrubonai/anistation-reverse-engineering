package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk2 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final zp2 o;

    public zk2(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, zp2 zp2Var) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = zp2Var;
    }

    public static zk2 a(zi4 zi4Var, boolean z, zp2 zp2Var) {
        String str;
        boolean z2;
        List singletonList;
        mm5 a0;
        int i;
        int i2 = 4;
        try {
            if (z) {
                zi4Var.O(4);
            } else {
                zi4Var.O(21);
            }
            int A = zi4Var.A() & 3;
            int A2 = zi4Var.A();
            int i3 = zi4Var.b;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= A2) {
                    break;
                }
                zi4Var.O(1);
                int H = zi4Var.H();
                for (int i7 = 0; i7 < H; i7++) {
                    int H2 = zi4Var.H();
                    i6 += H2 + 4;
                    zi4Var.O(H2);
                }
                i5++;
            }
            zi4Var.N(i3);
            byte[] bArr = new byte[i6];
            zp2 zp2Var2 = zp2Var;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < A2) {
                int A3 = zi4Var.A() & 63;
                int H3 = zi4Var.H();
                int i20 = i4;
                zp2 zp2Var3 = zp2Var2;
                while (i20 < H3) {
                    boolean z3 = z2;
                    int H4 = zi4Var.H();
                    int i21 = A;
                    System.arraycopy(io3.d, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(zi4Var.a, zi4Var.b, bArr, i22, H4);
                    if (A3 == 32 && i20 == 0) {
                        zp2Var3 = io3.c0(bArr, i22, i22 + H4);
                    } else {
                        if (A3 == 33 && i20 == 0) {
                            j64 b0 = io3.b0(bArr, i22, i22 + H4, zp2Var3);
                            i8 = b0.a + 1;
                            i9 = b0.h;
                            int i23 = b0.i;
                            i11 = b0.d + 8;
                            i12 = b0.e + 8;
                            int i24 = b0.l;
                            i10 = i23;
                            int i25 = b0.m;
                            int i26 = b0.n;
                            float f2 = b0.j;
                            int i27 = b0.k;
                            g64 g64Var = b0.b;
                            if (g64Var != null) {
                                i = i27;
                                str2 = ko0.a(g64Var.a, g64Var.b, g64Var.c, g64Var.d, g64Var.e, g64Var.f);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (A3 == 39 && i20 == 0 && (a0 = io3.a0(bArr, i22, i22 + H4)) != null && zp2Var3 != null) {
                            i4 = 0;
                            if (a0.x == ((f64) ((nw2) zp2Var3.x).get(0)).b) {
                                i16 = 4;
                            } else {
                                i16 = 5;
                            }
                        }
                        i4 = 0;
                    }
                    i19 = i22 + H4;
                    zi4Var.O(H4);
                    i20++;
                    z2 = z3;
                    A = i21;
                    i2 = 4;
                }
                i18++;
                zp2Var2 = zp2Var3;
                i2 = 4;
            }
            int i28 = A;
            if (i6 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zk2(singletonList, i28 + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str2, zp2Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (z) {
                str = "L-HEVC config";
            } else {
                str = "HEVC config";
            }
            throw bj4.a("Error parsing".concat(str), e);
        }
    }
}
