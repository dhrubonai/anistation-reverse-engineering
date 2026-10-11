package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j98 extends mv5 {
    public static final boolean e = zc7.e;
    public qb7 a;
    public final byte[] b;
    public final int c;
    public int d;

    public j98(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
        } else {
            Locale locale = Locale.US;
            ze0.k(zo5.m("Array range is invalid. Buffer.length=", ", offset=0, length=", length, i));
            throw null;
        }
    }

    public static int y(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int z(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void l(int i, int i2) {
        t((i << 3) | i2);
    }

    public final void m(int i, int i2) {
        t(i << 3);
        s(i2);
    }

    public final void n(int i, int i2) {
        t(i << 3);
        t(i2);
    }

    public final void o(int i, int i2) {
        t((i << 3) | 5);
        u(i2);
    }

    public final void p(int i, long j) {
        t(i << 3);
        v(j);
    }

    public final void q(int i, long j) {
        t((i << 3) | 1);
        w(j);
    }

    public final void r(int i, String str) {
        t((i << 3) | 2);
        int i2 = this.d;
        try {
            int y = y(str.length() * 3);
            int y2 = y(str.length());
            int i3 = this.c;
            byte[] bArr = this.b;
            if (y2 == y) {
                int i4 = i2 + y2;
                this.d = i4;
                int b = ed7.b(str, bArr, i4, i3 - i4);
                this.d = i2;
                t((b - i2) - y2);
                this.d = b;
                return;
            }
            t(ed7.a(str));
            int i5 = this.d;
            this.d = ed7.b(str, bArr, i5, i3 - i5);
        } catch (IndexOutOfBoundsException e2) {
            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
        }
    }

    public final void s(int i) {
        if (i >= 0) {
            t(i);
        } else {
            v(i);
        }
    }

    public final void t(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new co0(i2, this.c, 1, e2, (byte) 14);
                }
            }
            throw new co0(i2, this.c, 1, e2, (byte) 14);
        }
    }

    public final void u(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new co0(i2, this.c, 4, e2, (byte) 14);
        }
    }

    public final void v(long j) {
        int i;
        int i2 = this.d;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (e && i3 - i2 >= 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                zc7.c.p(zc7.f + i2, bArr, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zc7.c.p(zc7.f + i2, bArr, (byte) j2);
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new co0(i, i3, 1, e, (byte) 14);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j3;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new co0(i, i3, 1, e, (byte) 14);
            }
        }
        this.d = i;
    }

    public final void w(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new co0(i, this.c, 8, e2, (byte) 14);
        }
    }

    public final void x(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new co0(this.d, this.c, i2, e2, (byte) 14);
        }
    }
}
