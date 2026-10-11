package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j30 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public j30(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int y = oi4.y(length);
            this.d = y;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(y);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.e = i;
            this.f = y >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[oi4.o(i2 * 8, i3)] = true;
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j30) {
            j30 j30Var = (j30) obj;
            if (this.h == j30Var.h && Arrays.equals(this.b, j30Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.b);
        if (this.h) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j30(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L4a
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            r8 = 0
            if (r7 == 0) goto L38
            r7 = r1[r5]
            if (r7 != r2) goto L1d
            goto L1e
        L1d:
            r6 = r3
        L1e:
            if (r6 == 0) goto L26
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L26:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r9 = defpackage.ss5.f(r10, r9)
            defpackage.ze0.k(r9)
            throw r8
        L38:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r9 = defpackage.ss5.f(r10, r9)
            defpackage.ze0.k(r9)
            throw r8
        L4a:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j30.<init>(java.lang.String, char[]):void");
    }
}
