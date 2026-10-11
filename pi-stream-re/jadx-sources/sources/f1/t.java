package f1;

import java.nio.charset.Charset;
import java.util.Arrays;
import r6.t0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f3855d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f3856e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f3857f = t0.i(5, q6.e.f9205a, q6.e.f9207c, q6.e.f9210f, q6.e.f9208d, q6.e.f9209e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3858a;

    /* renamed from: b, reason: collision with root package name */
    public int f3859b;

    /* renamed from: c, reason: collision with root package name */
    public int f3860c;

    public t() {
        this.f3858a = b0.f3804f;
    }

    public final int A() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f3859b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public final long B() {
        int i10;
        int i11;
        long j4 = this.f3858a[this.f3859b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j4) != 0) {
                i12--;
            } else if (i12 < 6) {
                j4 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f3858a[this.f3859b + i10] & 192) == 128) {
                    j4 = (j4 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(a3.g.q("Invalid UTF-8 sequence continuation byte: ", j4));
                }
            }
            this.f3859b += i11;
            return j4;
        }
        throw new NumberFormatException(a3.g.q("Invalid UTF-8 sequence first byte: ", j4));
    }

    public final Charset C() {
        int i10 = this.f3860c;
        int i11 = this.f3859b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f3858a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f3859b = i11 + 3;
                return q6.e.f9207c;
            }
        }
        if (i10 - i11 >= 2) {
            byte[] bArr2 = this.f3858a;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f3859b = i11 + 2;
                return q6.e.f9208d;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f3859b = i11 + 2;
                return q6.e.f9209e;
            }
            return null;
        }
        return null;
    }

    public final void D(int i10) {
        byte[] bArr = this.f3858a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        E(bArr, i10);
    }

    public final void E(byte[] bArr, int i10) {
        this.f3858a = bArr;
        this.f3860c = i10;
        this.f3859b = 0;
    }

    public final void F(int i10) {
        boolean z9;
        if (i10 >= 0 && i10 <= this.f3858a.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f3860c = i10;
    }

    public final void G(int i10) {
        boolean z9;
        if (i10 >= 0 && i10 <= this.f3860c) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f3859b = i10;
    }

    public final void H(int i10) {
        G(this.f3859b + i10);
    }

    public final void a(int i10) {
        byte[] bArr = this.f3858a;
        if (i10 > bArr.length) {
            this.f3858a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char b(Charset charset) {
        w7.b.f("Unsupported charset: " + charset, f3857f.contains(charset));
        return (char) (c(charset) >> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = q6.e.f9207c
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.nio.charset.Charset r0 = q6.e.f9205a
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L32
        L14:
            int r0 = r9.f3860c
            int r4 = r9.f3859b
            int r0 = r0 - r4
            if (r0 < r3) goto L32
            byte[] r10 = r9.f3858a
            r10 = r10[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r2
        L2c:
            r6.h0.l(r0, r1, r4)
            byte r10 = (byte) r10
            r4 = r3
            goto L73
        L32:
            java.nio.charset.Charset r0 = q6.e.f9210f
            boolean r0 = r10.equals(r0)
            r4 = 2
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = q6.e.f9208d
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L58
        L43:
            int r0 = r9.f3860c
            int r5 = r9.f3859b
            int r0 = r0 - r5
            if (r0 < r4) goto L58
            byte[] r10 = r9.f3858a
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L53:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            goto L72
        L58:
            java.nio.charset.Charset r0 = q6.e.f9209e
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L83
            int r10 = r9.f3860c
            int r0 = r9.f3859b
            int r10 = r10 - r0
            if (r10 < r4) goto L83
            byte[] r10 = r9.f3858a
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L53
        L72:
            byte r10 = (byte) r10
        L73:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L7c
            r2 = r3
        L7c:
            r6.h0.l(r2, r1, r5)
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.t.c(java.nio.charset.Charset):int");
    }

    public final void d(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f3858a, this.f3859b, bArr, i10, i11);
        this.f3859b += i11;
    }

    public final char e(Charset charset, char[] cArr) {
        boolean z9;
        int c6 = c(charset);
        if (c6 != 0) {
            char c10 = (char) (c6 >> 16);
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (cArr[i10] == c10) {
                        z9 = true;
                        break;
                    }
                    i10++;
                } else {
                    z9 = false;
                    break;
                }
            }
            if (z9) {
                this.f3859b += c6 & 65535;
                return c10;
            }
        }
        return (char) 0;
    }

    public final int f() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f3859b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public final String g() {
        return h(q6.e.f9207c);
    }

    public final String h(Charset charset) {
        int i10;
        w7.b.f("Unsupported charset: " + charset, f3857f.contains(charset));
        if (this.f3860c - this.f3859b == 0) {
            return null;
        }
        Charset charset2 = q6.e.f9205a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(q6.e.f9207c) && !charset.equals(charset2)) {
            if (!charset.equals(q6.e.f9210f) && !charset.equals(q6.e.f9209e) && !charset.equals(q6.e.f9208d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f3859b;
        while (true) {
            int i12 = this.f3860c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(q6.e.f9207c) || charset.equals(q6.e.f9205a)) && b0.M(this.f3858a[i11])) {
                    break;
                }
                if (charset.equals(q6.e.f9210f) || charset.equals(q6.e.f9208d)) {
                    byte[] bArr = this.f3858a;
                    if (bArr[i11] == 0 && b0.M(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(q6.e.f9209e)) {
                    byte[] bArr2 = this.f3858a;
                    if (bArr2[i11 + 1] == 0 && b0.M(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String t9 = t(i11 - this.f3859b, charset);
        if (this.f3859b == this.f3860c) {
            return t9;
        }
        if (e(charset, f3855d) == '\r') {
            e(charset, f3856e);
        }
        return t9;
    }

    public final int i() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f3859b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long j() {
        byte[] bArr = this.f3858a;
        long j4 = bArr[r1] & 255;
        int i10 = this.f3859b + 1 + 1 + 1;
        long j10 = j4 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j11 = j10 | ((bArr[i10] & 255) << 24);
        long j12 = j11 | ((bArr[r3] & 255) << 32);
        long j13 = j12 | ((bArr[r4] & 255) << 40);
        long j14 = j13 | ((bArr[r3] & 255) << 48);
        this.f3859b = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | ((bArr[r4] & 255) << 56);
    }

    public final short k() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f3859b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long l() {
        byte[] bArr = this.f3858a;
        long j4 = bArr[r1] & 255;
        int i10 = this.f3859b + 1 + 1 + 1;
        long j10 = j4 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f3859b = i10 + 1;
        return j10 | ((bArr[i10] & 255) << 24);
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(a3.g.n("Top bit not zero: ", i10));
    }

    public final int n() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f3859b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.f3858a;
        long j4 = (bArr[r1] & 255) << 56;
        int i10 = this.f3859b + 1 + 1 + 1;
        long j10 = j4 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j11 = j10 | ((bArr[i10] & 255) << 32);
        long j12 = j11 | ((bArr[r3] & 255) << 24);
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        long j14 = j13 | ((bArr[r3] & 255) << 8);
        this.f3859b = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | (bArr[r4] & 255);
    }

    public final String p() {
        int i10 = this.f3860c;
        int i11 = this.f3859b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f3860c && this.f3858a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f3858a;
        int i12 = this.f3859b;
        int i13 = b0.f3799a;
        String str = new String(bArr, i12, i11 - i12, q6.e.f9207c);
        this.f3859b = i11;
        if (i11 < this.f3860c) {
            this.f3859b = i11 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f3859b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f3860c && this.f3858a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f3858a;
        int i14 = b0.f3799a;
        String str = new String(bArr, i12, i11, q6.e.f9207c);
        this.f3859b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f3859b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String s(int i10) {
        return t(i10, q6.e.f9207c);
    }

    public final String t(int i10, Charset charset) {
        String str = new String(this.f3858a, this.f3859b, i10, charset);
        this.f3859b += i10;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        this.f3859b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long w() {
        byte[] bArr = this.f3858a;
        long j4 = (bArr[r1] & 255) << 24;
        int i10 = this.f3859b + 1 + 1 + 1;
        long j10 = j4 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f3859b = i10 + 1;
        return j10 | (bArr[i10] & 255);
    }

    public final int x() {
        byte[] bArr = this.f3858a;
        int i10 = this.f3859b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f3859b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public final int y() {
        int f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException(a3.g.n("Top bit not zero: ", f10));
    }

    public final long z() {
        long o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException(a3.g.q("Top bit not zero: ", o));
    }

    public t(int i10) {
        this.f3858a = new byte[i10];
        this.f3860c = i10;
    }

    public t(byte[] bArr) {
        this.f3858a = bArr;
        this.f3860c = bArr.length;
    }

    public t(byte[] bArr, int i10) {
        this.f3858a = bArr;
        this.f3860c = i10;
    }
}
