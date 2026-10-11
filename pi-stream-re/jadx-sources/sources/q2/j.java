package q2;

import c1.p0;
import c1.q0;
import f1.b0;
import f1.s;
import f1.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class j extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final j1.l f9104h = new j1.l(21);

    /* renamed from: g, reason: collision with root package name */
    public final h f9105g;

    public j(j1.l lVar) {
        this.f9105g = lVar;
    }

    public static int A1(int i10, t tVar) {
        byte[] bArr = tVar.f3858a;
        int i11 = tVar.f3859b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11 + i10) {
                if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                    System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                    i10--;
                }
                i12 = i13;
            } else {
                return i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B1(f1.t r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.j.B1(f1.t, int, int, boolean):boolean");
    }

    public static a h1(int i10, int i11, t tVar) {
        int z12;
        String str;
        byte[] copyOfRange;
        int v9 = tVar.v();
        Charset w12 = w1(v9);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        tVar.d(bArr, 0, i12);
        if (i11 == 2) {
            String str2 = "image/" + j5.a.g0(new String(bArr, 0, 3, q6.e.f9206b));
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            z12 = 2;
        } else {
            z12 = z1(bArr, 0);
            String g02 = j5.a.g0(new String(bArr, 0, z12, q6.e.f9206b));
            if (g02.indexOf(47) == -1) {
                str = "image/".concat(g02);
            } else {
                str = g02;
            }
        }
        int i13 = bArr[z12 + 1] & 255;
        int i14 = z12 + 2;
        int y12 = y1(bArr, i14, v9);
        String str3 = new String(bArr, i14, y12 - i14, w12);
        int v12 = v1(v9) + y12;
        if (i12 <= v12) {
            copyOfRange = b0.f3804f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, v12, i12);
        }
        return new a(i13, str, str3, copyOfRange);
    }

    public static d i1(t tVar, int i10, int i11, boolean z9, int i12, h hVar) {
        long j4;
        long j10;
        int i13 = tVar.f3859b;
        int z12 = z1(tVar.f3858a, i13);
        String str = new String(tVar.f3858a, i13, z12 - i13, q6.e.f9206b);
        tVar.G(z12 + 1);
        int f10 = tVar.f();
        int f11 = tVar.f();
        long w9 = tVar.w();
        if (w9 == 4294967295L) {
            j4 = -1;
        } else {
            j4 = w9;
        }
        long w10 = tVar.w();
        if (w10 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = w10;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (tVar.f3859b < i14) {
            k l12 = l1(i11, tVar, z9, i12, hVar);
            if (l12 != null) {
                arrayList.add(l12);
            }
        }
        return new d(str, f10, f11, j4, j10, (k[]) arrayList.toArray(new k[0]));
    }

    public static e j1(t tVar, int i10, int i11, boolean z9, int i12, h hVar) {
        boolean z10;
        boolean z11;
        int i13 = tVar.f3859b;
        int z12 = z1(tVar.f3858a, i13);
        String str = new String(tVar.f3858a, i13, z12 - i13, q6.e.f9206b);
        tVar.G(z12 + 1);
        int v9 = tVar.v();
        if ((v9 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((v9 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int v10 = tVar.v();
        String[] strArr = new String[v10];
        for (int i14 = 0; i14 < v10; i14++) {
            int i15 = tVar.f3859b;
            int z13 = z1(tVar.f3858a, i15);
            strArr[i14] = new String(tVar.f3858a, i15, z13 - i15, q6.e.f9206b);
            tVar.G(z13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (tVar.f3859b < i16) {
            k l12 = l1(i11, tVar, z9, i12, hVar);
            if (l12 != null) {
                arrayList.add(l12);
            }
        }
        return new e(str, z10, z11, strArr, (k[]) arrayList.toArray(new k[0]));
    }

    public static f k1(int i10, t tVar) {
        if (i10 < 4) {
            return null;
        }
        int v9 = tVar.v();
        Charset w12 = w1(v9);
        byte[] bArr = new byte[3];
        tVar.d(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        tVar.d(bArr2, 0, i11);
        int y12 = y1(bArr2, 0, v9);
        String str2 = new String(bArr2, 0, y12, w12);
        int v12 = v1(v9) + y12;
        return new f(str, str2, p1(bArr2, v12, y1(bArr2, v12, v9), w12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ad, code lost:
    
        if (r12 == 67) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q2.k l1(int r21, f1.t r22, boolean r23, int r24, q2.h r25) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.j.l1(int, f1.t, boolean, int, q2.h):q2.k");
    }

    public static g m1(int i10, t tVar) {
        byte[] copyOfRange;
        int v9 = tVar.v();
        Charset w12 = w1(v9);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.d(bArr, 0, i11);
        int z12 = z1(bArr, 0);
        String o = q0.o(new String(bArr, 0, z12, q6.e.f9206b));
        int i12 = z12 + 1;
        int y12 = y1(bArr, i12, v9);
        String p12 = p1(bArr, i12, y12, w12);
        int v12 = v1(v9) + y12;
        int y13 = y1(bArr, v12, v9);
        String p13 = p1(bArr, v12, y13, w12);
        int v13 = v1(v9) + y13;
        if (i11 <= v13) {
            copyOfRange = b0.f3804f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, v13, i11);
        }
        return new g(o, p12, p13, copyOfRange);
    }

    public static m n1(int i10, t tVar) {
        int A = tVar.A();
        int x9 = tVar.x();
        int x10 = tVar.x();
        int v9 = tVar.v();
        int v10 = tVar.v();
        s sVar = new s();
        sVar.n(tVar.f3858a, tVar.f3860c);
        sVar.o(tVar.f3859b * 8);
        int i11 = ((i10 - 10) * 8) / (v9 + v10);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = sVar.i(v9);
            int i14 = sVar.i(v10);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new m(A, x9, x10, iArr, iArr2);
    }

    public static n o1(int i10, t tVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i10];
        tVar.d(bArr, 0, i10);
        int z12 = z1(bArr, 0);
        String str = new String(bArr, 0, z12, q6.e.f9206b);
        int i11 = z12 + 1;
        if (i10 <= i11) {
            copyOfRange = b0.f3804f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i11, i10);
        }
        return new n(str, copyOfRange);
    }

    public static String p1(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    public static o q1(int i10, t tVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int v9 = tVar.v();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.d(bArr, 0, i11);
        return new o(str, null, r1(bArr, v9, 0));
    }

    public static n1 r1(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return o0.o("");
        }
        m0 m0Var = o0.f9505b;
        h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int y12 = y1(bArr, i11, i10);
        int i12 = 0;
        while (i11 < y12) {
            String str = new String(bArr, i11, y12 - i11, w1(i10));
            int i13 = i12 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i13));
            }
            objArr[i12] = str;
            int v12 = y12 + v1(i10);
            i12 = i13;
            i11 = v12;
            y12 = y1(bArr, v12, i10);
        }
        n1 h10 = o0.h(i12, objArr);
        if (h10.isEmpty()) {
            return o0.o("");
        }
        return h10;
    }

    public static o s1(int i10, t tVar) {
        if (i10 < 1) {
            return null;
        }
        int v9 = tVar.v();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.d(bArr, 0, i11);
        int y12 = y1(bArr, 0, v9);
        return new o("TXXX", new String(bArr, 0, y12, w1(v9)), r1(bArr, v9, v1(v9) + y12));
    }

    public static p t1(int i10, t tVar, String str) {
        byte[] bArr = new byte[i10];
        tVar.d(bArr, 0, i10);
        return new p(str, null, new String(bArr, 0, z1(bArr, 0), q6.e.f9206b));
    }

    public static p u1(int i10, t tVar) {
        if (i10 < 1) {
            return null;
        }
        int v9 = tVar.v();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.d(bArr, 0, i11);
        int y12 = y1(bArr, 0, v9);
        String str = new String(bArr, 0, y12, w1(v9));
        int v12 = v1(v9) + y12;
        return new p("WXXX", str, p1(bArr, v12, z1(bArr, v12), q6.e.f9206b));
    }

    public static int v1(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset w1(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return q6.e.f9206b;
                }
                return q6.e.f9207c;
            }
            return q6.e.f9208d;
        }
        return q6.e.f9210f;
    }

    public static String x1(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int y1(byte[] bArr, int i10, int i11) {
        int z12 = z1(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (z12 < bArr.length - 1) {
                if ((z12 - i10) % 2 == 0 && bArr[z12 + 1] == 0) {
                    return z12;
                }
                z12 = z1(bArr, z12 + 1);
            }
            return bArr.length;
        }
        return z12;
    }

    public static int z1(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // r6.h0
    public final p0 H(l2.a aVar, ByteBuffer byteBuffer) {
        return g1(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c1.p0 g1(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.j.g1(byte[], int):c1.p0");
    }
}
