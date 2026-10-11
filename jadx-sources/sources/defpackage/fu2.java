package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fu2 extends wc7 {
    public static final qi2 j = new qi2((byte) 3);
    public static final qi2 k = new qi2((byte) 4);
    public final du2 i;

    public fu2(du2 du2Var) {
        this.i = du2Var;
    }

    public static mp Z(zi4 zi4Var, int i, int i2) {
        int r0;
        String str;
        byte[] copyOfRange;
        int A = zi4Var.A();
        Charset o0 = o0(A);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        zi4Var.k(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + wc7.U(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            r0 = 2;
        } else {
            r0 = r0(0, bArr);
            String U = wc7.U(new String(bArr, 0, r0, StandardCharsets.ISO_8859_1));
            if (U.indexOf(47) == -1) {
                str = "image/".concat(U);
            } else {
                str = U;
            }
        }
        int i4 = bArr[r0 + 1] & 255;
        int i5 = r0 + 2;
        int q0 = q0(bArr, i5, A);
        String str2 = new String(bArr, i5, q0 - i5, o0);
        int n0 = n0(A) + q0;
        if (i3 <= n0) {
            copyOfRange = eq6.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, n0, i3);
        }
        return new mp(str, str2, i4, copyOfRange);
    }

    public static hk0 a0(zi4 zi4Var, int i, int i2, boolean z, int i3, du2 du2Var) {
        long j2;
        int i4 = zi4Var.b;
        int r0 = r0(i4, zi4Var.a);
        String str = new String(zi4Var.a, i4, r0 - i4, StandardCharsets.ISO_8859_1);
        zi4Var.N(r0 + 1);
        int m = zi4Var.m();
        int m2 = zi4Var.m();
        if (m > m2) {
            return null;
        }
        long C = zi4Var.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = zi4Var.C();
        if (C2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (zi4Var.b < i5) {
            gu2 d0 = d0(i2, zi4Var, z, i3, du2Var);
            if (d0 != null) {
                arrayList.add(d0);
            }
        }
        return new hk0(str, m, m2, C, j2, (gu2[]) arrayList.toArray(new gu2[0]));
    }

    public static jk0 b0(zi4 zi4Var, int i, int i2, boolean z, int i3, du2 du2Var) {
        boolean z2;
        boolean z3;
        int i4 = zi4Var.b;
        int r0 = r0(i4, zi4Var.a);
        String str = new String(zi4Var.a, i4, r0 - i4, StandardCharsets.ISO_8859_1);
        zi4Var.N(r0 + 1);
        int A = zi4Var.A();
        if ((A & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((A & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int A2 = zi4Var.A();
        String[] strArr = new String[A2];
        for (int i5 = 0; i5 < A2; i5++) {
            int i6 = zi4Var.b;
            int r02 = r0(i6, zi4Var.a);
            strArr[i5] = new String(zi4Var.a, i6, r02 - i6, StandardCharsets.ISO_8859_1);
            zi4Var.N(r02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (zi4Var.b < i7) {
            gu2 d0 = d0(i2, zi4Var, z, i3, du2Var);
            if (d0 != null) {
                arrayList.add(d0);
            }
        }
        return new jk0(str, z2, z3, strArr, (gu2[]) arrayList.toArray(new gu2[0]));
    }

    public static lq0 c0(int i, zi4 zi4Var) {
        if (i < 4) {
            return null;
        }
        int A = zi4Var.A();
        Charset o0 = o0(A);
        byte[] bArr = new byte[3];
        zi4Var.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        zi4Var.k(bArr2, 0, i2);
        int q0 = q0(bArr2, 0, A);
        String str2 = new String(bArr2, 0, q0, o0);
        int n0 = n0(A) + q0;
        return new lq0(str, str2, h0(bArr2, n0, q0(bArr2, n0, A), o0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01ae, code lost:
    
        if (r5 == 67) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0247  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [gu2] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [zi4] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gu2 d0(int r19, defpackage.zi4 r20, boolean r21, int r22, defpackage.du2 r23) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.d0(int, zi4, boolean, int, du2):gu2");
    }

    public static ae2 e0(int i, zi4 zi4Var) {
        byte[] copyOfRange;
        int A = zi4Var.A();
        Charset o0 = o0(A);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zi4Var.k(bArr, 0, i2);
        int r0 = r0(0, bArr);
        String n = qy3.n(new String(bArr, 0, r0, StandardCharsets.ISO_8859_1));
        int i3 = r0 + 1;
        int q0 = q0(bArr, i3, A);
        String h0 = h0(bArr, i3, q0, o0);
        int n0 = n0(A) + q0;
        int q02 = q0(bArr, n0, A);
        String h02 = h0(bArr, n0, q02, o0);
        int n02 = n0(A) + q02;
        if (i2 <= n02) {
            copyOfRange = eq6.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, n02, i2);
        }
        return new ae2(n, h0, h02, copyOfRange);
    }

    public static yy3 f0(int i, zi4 zi4Var) {
        int H = zi4Var.H();
        int D = zi4Var.D();
        int D2 = zi4Var.D();
        int A = zi4Var.A();
        int A2 = zi4Var.A();
        yi0 yi0Var = new yi0();
        yi0Var.l(zi4Var);
        int i2 = ((i - 10) * 8) / (A + A2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int g = yi0Var.g(A);
            int g2 = yi0Var.g(A2);
            iArr[i3] = g;
            iArr2[i3] = g2;
        }
        return new yy3(H, D, D2, iArr, iArr2);
    }

    public static fu4 g0(int i, zi4 zi4Var) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        zi4Var.k(bArr, 0, i);
        int r0 = r0(0, bArr);
        String str = new String(bArr, 0, r0, StandardCharsets.ISO_8859_1);
        int i2 = r0 + 1;
        if (i <= i2) {
            copyOfRange = eq6.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new fu4(str, copyOfRange);
    }

    public static String h0(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    public static rc6 i0(int i, zi4 zi4Var, String str) {
        if (i < 1) {
            return null;
        }
        int A = zi4Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zi4Var.k(bArr, 0, i2);
        return new rc6(j0(bArr, A, 0), str, null);
    }

    public static o15 j0(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return nw2.s("");
        }
        jw2 k2 = nw2.k();
        int q0 = q0(bArr, i2, i);
        while (i2 < q0) {
            k2.c(new String(bArr, i2, q0 - i2, o0(i)));
            i2 = n0(i) + q0;
            q0 = q0(bArr, i2, i);
        }
        o15 g = k2.g();
        if (g.isEmpty()) {
            return nw2.s("");
        }
        return g;
    }

    public static rc6 k0(int i, zi4 zi4Var) {
        if (i < 1) {
            return null;
        }
        int A = zi4Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zi4Var.k(bArr, 0, i2);
        int q0 = q0(bArr, 0, A);
        return new rc6(j0(bArr, A, n0(A) + q0), "TXXX", new String(bArr, 0, q0, o0(A)));
    }

    public static qp6 l0(int i, zi4 zi4Var, String str) {
        byte[] bArr = new byte[i];
        zi4Var.k(bArr, 0, i);
        return new qp6(str, null, new String(bArr, 0, r0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static qp6 m0(int i, zi4 zi4Var) {
        if (i < 1) {
            return null;
        }
        int A = zi4Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        zi4Var.k(bArr, 0, i2);
        int q0 = q0(bArr, 0, A);
        String str = new String(bArr, 0, q0, o0(A));
        int n0 = n0(A) + q0;
        return new qp6("WXXX", str, h0(bArr, n0, r0(n0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int n0(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset o0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String p0(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int q0(byte[] bArr, int i, int i2) {
        int r0 = r0(i, bArr);
        if (i2 != 0 && i2 != 3) {
            while (r0 < bArr.length - 1) {
                if ((r0 - i) % 2 == 0 && bArr[r0 + 1] == 0) {
                    return r0;
                }
                r0 = r0(r0 + 1, bArr);
            }
            return bArr.length;
        }
        return r0;
    }

    public static int r0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int s0(int i, zi4 zi4Var) {
        byte[] bArr = zi4Var.a;
        int i2 = zi4Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t0(defpackage.zi4 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.m()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.C()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.H()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.D()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.D()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.N(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.N(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.N(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.N(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.O(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.N(r2)
            return r4
        Lb0:
            r1.N(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.t0(zi4, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fy3 Y(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.Y(int, byte[]):fy3");
    }

    @Override // defpackage.wc7
    public final fy3 n(hy3 hy3Var, ByteBuffer byteBuffer) {
        return Y(byteBuffer.limit(), byteBuffer.array());
    }
}
