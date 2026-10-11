package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kl0.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(pa0 pa0Var, zd0 zd0Var, long j, long j2, int i) {
        zf5 zf5Var;
        long j3 = j;
        long j4 = j2;
        zd0Var.getClass();
        long j5 = i;
        tl7.m(zd0Var.d(), 0L, j5);
        if (i > 0) {
            if (j3 >= 0) {
                if (j3 <= j4) {
                    long j6 = pa0Var.y;
                    if (j4 > j6) {
                        j4 = j6;
                    }
                    if (j3 != j4 && (zf5Var = pa0Var.x) != null) {
                        long j7 = 0;
                        if (j6 - j3 < j3) {
                            while (j6 > j3) {
                                zf5Var = zf5Var.g;
                                zf5Var.getClass();
                                j6 -= zf5Var.c - zf5Var.b;
                            }
                            byte[] h = zd0Var.h();
                            byte b2 = h[0];
                            long min = Math.min(j4, (pa0Var.y - j5) + 1);
                            while (j6 < min) {
                                byte[] bArr = zf5Var.a;
                                int min2 = (int) Math.min(zf5Var.c, (zf5Var.b + min) - j6);
                                for (int i2 = (int) ((zf5Var.b + j3) - j6); i2 < min2; i2++) {
                                    if (bArr[i2] == b2 && b(zf5Var, i2 + 1, h, 1, i)) {
                                        return (i2 - zf5Var.b) + j6;
                                    }
                                }
                                j6 += zf5Var.c - zf5Var.b;
                                zf5Var = zf5Var.f;
                                zf5Var.getClass();
                                j3 = j6;
                            }
                            return -1L;
                        }
                        while (true) {
                            long j8 = j7 + (zf5Var.c - zf5Var.b);
                            if (j8 > j3) {
                                break;
                            }
                            zf5Var = zf5Var.f;
                            zf5Var.getClass();
                            j7 = j8;
                        }
                        byte[] h2 = zd0Var.h();
                        byte b3 = h2[0];
                        long min3 = Math.min(j4, (pa0Var.y - j5) + 1);
                        while (j7 < min3) {
                            byte[] bArr2 = zf5Var.a;
                            int min4 = (int) Math.min(zf5Var.c, (zf5Var.b + min3) - j7);
                            for (int i3 = (int) ((zf5Var.b + j3) - j7); i3 < min4; i3++) {
                                if (bArr2[i3] == b3 && b(zf5Var, i3 + 1, h2, 1, i)) {
                                    return (i3 - zf5Var.b) + j7;
                                }
                            }
                            j7 += zf5Var.c - zf5Var.b;
                            zf5Var = zf5Var.f;
                            zf5Var.getClass();
                            j3 = j7;
                        }
                        return -1L;
                    }
                    return -1L;
                }
                StringBuilder n = zo5.n(j3, "fromIndex > toIndex: ", " > ");
                n.append(j4);
                throw new IllegalArgumentException(n.toString().toString());
            }
            ze0.e(h11.h(j3, "fromIndex < 0: "));
            return 0L;
        }
        ze0.k("byteCount == 0");
        return 0L;
    }

    public static final boolean b(zf5 zf5Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = zf5Var.c;
        byte[] bArr2 = zf5Var.a;
        while (i2 < i3) {
            if (i == i4) {
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                byte[] bArr3 = zf5Var.a;
                bArr2 = bArr3;
                i = zf5Var.b;
                i4 = zf5Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(long j, pa0 pa0Var) {
        if (j > 0) {
            long j2 = j - 1;
            if (pa0Var.p(j2) == 13) {
                String T = pa0Var.T(j2, kl0.a);
                pa0Var.skip(2L);
                return T;
            }
        }
        String T2 = pa0Var.T(j, kl0.a);
        pa0Var.skip(1L);
        return T2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(defpackage.pa0 r16, defpackage.lg4 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(pa0, lg4, boolean):int");
    }
}
