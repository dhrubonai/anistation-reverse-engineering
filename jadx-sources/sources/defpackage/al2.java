package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class al2 {
    public static final int[] a;
    public static final int[] b;
    public static final long[] c;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        c = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        qi2.i(cm6.b(j), "The resulting string length is too big: ");
        return 0;
    }

    public static final int b(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final int c(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String d(byte[] bArr) {
        int[] iArr;
        dl2 dl2Var = dl2.d;
        bArr.getClass();
        dl2Var.getClass();
        int length = bArr.length;
        db.u(0, length, bArr.length);
        if (length == 0) {
            return "";
        }
        if (dl2Var.a) {
            iArr = b;
        } else {
            iArr = a;
        }
        bl2 bl2Var = dl2Var.b;
        if (bl2Var.a) {
            if (bl2Var.b) {
                char[] cArr = new char[a(length * 2)];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    i = b(bArr, i2, iArr, cArr, i);
                }
                return new String(cArr);
            }
            if (length > 0) {
                char[] cArr2 = new char[a(length * 2)];
                int c2 = c("", cArr2, b(bArr, 0, iArr, cArr2, c("", cArr2, 0)));
                for (int i3 = 1; i3 < length; i3++) {
                    c2 = c("", cArr2, b(bArr, i3, iArr, cArr2, c("", cArr2, c("", cArr2, c2))));
                }
                return new String(cArr2);
            }
            ze0.k("Failed requirement.");
            return null;
        }
        if (length > 0) {
            int i4 = (length - 1) / Integer.MAX_VALUE;
            int i5 = length % Integer.MAX_VALUE;
            if (i5 == 0) {
                i5 = Integer.MAX_VALUE;
            }
            int a2 = a((2 * length) + (((i5 - 1) / Integer.MAX_VALUE) * 2) + i4);
            char[] cArr3 = new char[a2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (i7 == Integer.MAX_VALUE) {
                    cArr3[i6] = '\n';
                    i8 = 0;
                    i6++;
                    i7 = 0;
                } else if (i8 == Integer.MAX_VALUE) {
                    i6 = c("  ", cArr3, i6);
                    i8 = 0;
                }
                if (i8 != 0) {
                    i6 = c("", cArr3, i6);
                }
                i6 = c("", cArr3, b(bArr, i9, iArr, cArr3, c("", cArr3, i6)));
                i8++;
                i7++;
            }
            if (i6 == a2) {
                return new String(cArr3);
            }
            ze0.m("Check failed.");
            return null;
        }
        ze0.k("Failed requirement.");
        return null;
    }
}
