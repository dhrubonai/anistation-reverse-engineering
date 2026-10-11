package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class pa0 implements db0, cb0, Cloneable, ByteChannel {
    public zf5 x;
    public long y;

    public final boolean A(long j, zd0 zd0Var, int i) {
        zd0Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.y && i <= zd0Var.d()) {
            if (i == 0 || b.a(this, zd0Var, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A0(String str) {
        str.getClass();
        B0(str, 0, str.length());
    }

    public final void B0(String str, int i, int i2) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            zf5 k0 = k0(1);
                            byte[] bArr = k0.a;
                            int i3 = k0.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = k0.c;
                            int i6 = (i3 + i) - i5;
                            k0.c = i5 + i6;
                            this.y += i6;
                        } else {
                            if (charAt2 < 2048) {
                                zf5 k02 = k0(2);
                                byte[] bArr2 = k02.a;
                                int i7 = k02.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                k02.c = i7 + 2;
                                this.y += 2;
                            } else if (55296 <= charAt2 && charAt2 < 56320) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    zf5 k03 = k0(4);
                                    byte[] bArr3 = k03.a;
                                    int i10 = k03.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    k03.c = i10 + 4;
                                    this.y += 4;
                                    i += 2;
                                } else {
                                    w0(63);
                                    i = i8;
                                }
                            } else if (56320 <= charAt2 && charAt2 < 57344) {
                                w0(63);
                            } else {
                                zf5 k04 = k0(3);
                                byte[] bArr4 = k04.a;
                                int i11 = k04.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                k04.c = i11 + 3;
                                this.y += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                ze0.i(qx1.s(i2, "endIndex > string.length: ", " > "), str.length());
                return;
            }
            ze0.e(zo5.m("endIndex < beginIndex: ", " < ", i2, i));
            return;
        }
        ze0.e(qx1.h(i, "beginIndex < 0: "));
    }

    public final void C0(int i) {
        if (i < 128) {
            w0(i);
            return;
        }
        if (i < 2048) {
            zf5 k0 = k0(2);
            byte[] bArr = k0.a;
            int i2 = k0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            k0.c = i2 + 2;
            this.y += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            w0(63);
            return;
        }
        if (i < 65536) {
            zf5 k02 = k0(3);
            byte[] bArr2 = k02.a;
            int i3 = k02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            k02.c = i3 + 3;
            this.y += 3;
            return;
        }
        if (i <= 1114111) {
            zf5 k03 = k0(4);
            byte[] bArr3 = k03.a;
            int i4 = k03.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            k03.c = i4 + 4;
            this.y += 4;
            return;
        }
        ze0.k("Unexpected code point: 0x".concat(tl7.R(i)));
    }

    public final boolean D() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.db0
    public final int F(lg4 lg4Var) {
        lg4Var.getClass();
        int d = b.d(this, lg4Var, false);
        if (d == -1) {
            return -1;
        }
        skip(lg4Var.x[d].d());
        return d;
    }

    public final byte[] G(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.y >= j) {
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < i) {
                    int read = read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        ze0.e(h11.h(j, "byteCount: "));
        return null;
    }

    public final short I() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, pa0] */
    @Override // defpackage.db0
    public final String K(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long q = q((byte) 10, 0L, j3);
            if (q != -1) {
                return b.c(q, this);
            }
            if (j3 < this.y && p(j3 - 1) == 13 && p(j3) == 10) {
                return b.c(j3, this);
            }
            ?? obj = new Object();
            l(obj, 0L, Math.min(32L, this.y));
            throw new EOFException("\\n not found: limit=" + Math.min(this.y, j) + " content=" + obj.s(obj.y).e() + (char) 8230);
        }
        ze0.e(h11.h(j, "limit < 0: "));
        return null;
    }

    @Override // defpackage.db0
    public final long S(cb0 cb0Var) {
        long j = this.y;
        if (j > 0) {
            cb0Var.f0(j, this);
        }
        return j;
    }

    public final String T(long j, Charset charset) {
        charset.getClass();
        if (j >= 0 && j <= 2147483647L) {
            if (this.y >= j) {
                if (j == 0) {
                    return "";
                }
                zf5 zf5Var = this.x;
                zf5Var.getClass();
                int i = zf5Var.b;
                if (i + j > zf5Var.c) {
                    return new String(G(j), charset);
                }
                int i2 = (int) j;
                String str = new String(zf5Var.a, i, i2, charset);
                int i3 = zf5Var.b + i2;
                zf5Var.b = i3;
                this.y -= j;
                if (i3 == zf5Var.c) {
                    this.x = zf5Var.a();
                    hg5.a(zf5Var);
                }
                return str;
            }
            throw new EOFException();
        }
        ze0.e(h11.h(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 U(int i, byte[] bArr) {
        l0(i, bArr);
        return this;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 V(String str) {
        A0(str);
        return this;
    }

    @Override // defpackage.db0
    public final String Z(Charset charset) {
        return T(this.y, charset);
    }

    public final long a() {
        long j = this.y;
        if (j == 0) {
            return 0L;
        }
        zf5 zf5Var = this.x;
        zf5Var.getClass();
        zf5 zf5Var2 = zf5Var.g;
        zf5Var2.getClass();
        if (zf5Var2.c < 8192 && zf5Var2.e) {
            return j - (r2 - zf5Var2.b);
        }
        return j;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 b0(long j) {
        x0(j);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pa0] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.y == 0) {
            return obj;
        }
        zf5 zf5Var = this.x;
        zf5Var.getClass();
        zf5 c = zf5Var.c();
        obj.x = c;
        c.g = c;
        c.f = c;
        for (zf5 zf5Var2 = zf5Var.f; zf5Var2 != zf5Var; zf5Var2 = zf5Var2.f) {
            zf5 zf5Var3 = c.g;
            zf5Var3.getClass();
            zf5Var2.getClass();
            zf5Var3.b(zf5Var2.c());
        }
        obj.y = this.y;
        return obj;
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return of6.d;
    }

    public final zd0 d0(int i) {
        if (i == 0) {
            return zd0.A;
        }
        tl7.m(this.y, 0L, i);
        zf5 zf5Var = this.x;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zf5Var.getClass();
            int i5 = zf5Var.c;
            int i6 = zf5Var.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                zf5Var = zf5Var.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        zf5 zf5Var2 = this.x;
        int i7 = 0;
        while (i2 < i) {
            zf5Var2.getClass();
            bArr[i7] = zf5Var2.a;
            i2 += zf5Var2.c - zf5Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zf5Var2.b;
            zf5Var2.d = true;
            i7++;
            zf5Var2 = zf5Var2.f;
        }
        return new jg5(bArr, iArr);
    }

    @Override // defpackage.db0
    public final String e0() {
        return K(Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        long j = this.y;
        pa0 pa0Var = (pa0) obj;
        if (j != pa0Var.y) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zf5 zf5Var = this.x;
        zf5Var.getClass();
        zf5 zf5Var2 = pa0Var.x;
        zf5Var2.getClass();
        int i = zf5Var.b;
        int i2 = zf5Var2.b;
        long j2 = 0;
        while (j2 < this.y) {
            long min = Math.min(zf5Var.c - i, zf5Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zf5Var.a[i] != zf5Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zf5Var.c) {
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                i = zf5Var.b;
            }
            if (i2 == zf5Var2.c) {
                zf5Var2 = zf5Var2.f;
                zf5Var2.getClass();
                i2 = zf5Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        zf5 zf5Var;
        zf5 b;
        int i;
        pa0Var.getClass();
        if (pa0Var != this) {
            tl7.m(pa0Var.y, 0L, j);
            while (j > 0) {
                zf5 zf5Var2 = pa0Var.x;
                zf5Var2.getClass();
                int i2 = zf5Var2.c;
                zf5 zf5Var3 = pa0Var.x;
                zf5Var3.getClass();
                long j2 = i2 - zf5Var3.b;
                int i3 = 0;
                if (j < j2) {
                    zf5 zf5Var4 = this.x;
                    if (zf5Var4 != null) {
                        zf5Var = zf5Var4.g;
                    } else {
                        zf5Var = null;
                    }
                    if (zf5Var != null && zf5Var.e) {
                        long j3 = zf5Var.c + j;
                        if (zf5Var.d) {
                            i = 0;
                        } else {
                            i = zf5Var.b;
                        }
                        if (j3 - i <= 8192) {
                            zf5 zf5Var5 = pa0Var.x;
                            zf5Var5.getClass();
                            zf5Var5.d(zf5Var, (int) j);
                            pa0Var.y -= j;
                            this.y += j;
                            return;
                        }
                    }
                    zf5 zf5Var6 = pa0Var.x;
                    zf5Var6.getClass();
                    int i4 = (int) j;
                    if (i4 > 0 && i4 <= zf5Var6.c - zf5Var6.b) {
                        if (i4 >= 1024) {
                            b = zf5Var6.c();
                        } else {
                            b = hg5.b();
                            byte[] bArr = zf5Var6.a;
                            byte[] bArr2 = b.a;
                            int i5 = zf5Var6.b;
                            ms.v0(0, i5, i5 + i4, bArr, bArr2);
                        }
                        b.c = b.b + i4;
                        zf5Var6.b += i4;
                        zf5 zf5Var7 = zf5Var6.g;
                        zf5Var7.getClass();
                        zf5Var7.b(b);
                        pa0Var.x = b;
                    } else {
                        ze0.k("byteCount out of range");
                        return;
                    }
                }
                zf5 zf5Var8 = pa0Var.x;
                zf5Var8.getClass();
                long j4 = zf5Var8.c - zf5Var8.b;
                pa0Var.x = zf5Var8.a();
                zf5 zf5Var9 = this.x;
                if (zf5Var9 == null) {
                    this.x = zf5Var8;
                    zf5Var8.g = zf5Var8;
                    zf5Var8.f = zf5Var8;
                } else {
                    zf5 zf5Var10 = zf5Var9.g;
                    zf5Var10.getClass();
                    zf5Var10.b(zf5Var8);
                    zf5 zf5Var11 = zf5Var8.g;
                    if (zf5Var11 != zf5Var8) {
                        zf5Var11.getClass();
                        if (zf5Var11.e) {
                            int i6 = zf5Var8.c - zf5Var8.b;
                            zf5 zf5Var12 = zf5Var8.g;
                            zf5Var12.getClass();
                            int i7 = 8192 - zf5Var12.c;
                            zf5 zf5Var13 = zf5Var8.g;
                            zf5Var13.getClass();
                            if (!zf5Var13.d) {
                                zf5 zf5Var14 = zf5Var8.g;
                                zf5Var14.getClass();
                                i3 = zf5Var14.b;
                            }
                            if (i6 <= i7 + i3) {
                                zf5 zf5Var15 = zf5Var8.g;
                                zf5Var15.getClass();
                                zf5Var8.d(zf5Var15, i6);
                                zf5Var8.a();
                                hg5.a(zf5Var8);
                            }
                        }
                    } else {
                        ze0.m("cannot compact");
                        return;
                    }
                }
                pa0Var.y -= j4;
                this.y += j4;
                j -= j4;
            }
            return;
        }
        ze0.k("source == this");
    }

    @Override // defpackage.db0
    public final boolean g(long j) {
        if (this.y >= j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        zf5 zf5Var = this.x;
        if (zf5Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zf5Var.c;
            for (int i3 = zf5Var.b; i3 < i2; i3++) {
                i = (i * 31) + zf5Var.a[i3];
            }
            zf5Var = zf5Var.f;
            zf5Var.getClass();
        } while (zf5Var != this.x);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (j >= 0) {
            long j2 = this.y;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            pa0Var.f0(j, this);
            return j;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return 0L;
    }

    public final zf5 k0(int i) {
        if (i >= 1 && i <= 8192) {
            zf5 zf5Var = this.x;
            if (zf5Var == null) {
                zf5 b = hg5.b();
                this.x = b;
                b.g = b;
                b.f = b;
                return b;
            }
            zf5 zf5Var2 = zf5Var.g;
            zf5Var2.getClass();
            if (zf5Var2.c + i <= 8192 && zf5Var2.e) {
                return zf5Var2;
            }
            zf5 b2 = hg5.b();
            zf5Var2.b(b2);
            return b2;
        }
        ze0.k("unexpected capacity");
        return null;
    }

    public final void l(pa0 pa0Var, long j, long j2) {
        pa0Var.getClass();
        long j3 = j;
        tl7.m(this.y, j3, j2);
        if (j2 != 0) {
            pa0Var.y += j2;
            zf5 zf5Var = this.x;
            while (true) {
                zf5Var.getClass();
                long j4 = zf5Var.c - zf5Var.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                zf5Var = zf5Var.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                zf5Var.getClass();
                zf5 c = zf5Var.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                zf5 zf5Var2 = pa0Var.x;
                if (zf5Var2 == null) {
                    c.g = c;
                    c.f = c;
                    pa0Var.x = c;
                } else {
                    zf5 zf5Var3 = zf5Var2.g;
                    zf5Var3.getClass();
                    zf5Var3.b(c);
                }
                j5 -= c.c - c.b;
                zf5Var = zf5Var.f;
                j3 = 0;
            }
        }
    }

    public final void l0(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        tl7.m(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            zf5 k0 = k0(1);
            int min = Math.min(i - i2, 8192 - k0.c);
            int i3 = i2 + min;
            ms.v0(k0.c, i2, i3, bArr, k0.a);
            k0.c += min;
            i2 = i3;
        }
        this.y += j;
    }

    @Override // defpackage.db0
    public final void m(long j) {
        if (this.y >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 m0(zd0 zd0Var) {
        u0(zd0Var);
        return this;
    }

    public final byte p(long j) {
        tl7.m(this.y, j, 1L);
        zf5 zf5Var = this.x;
        zf5Var.getClass();
        long j2 = this.y;
        if (j2 - j < j) {
            while (j2 > j) {
                zf5Var = zf5Var.g;
                zf5Var.getClass();
                j2 -= zf5Var.c - zf5Var.b;
            }
            return zf5Var.a[(int) ((zf5Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zf5Var.c;
            int i2 = zf5Var.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                j3 = j4;
            } else {
                return zf5Var.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    public final long q(byte b, long j, long j2) {
        zf5 zf5Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 <= j3 && j3 <= j4) {
            long j6 = this.y;
            if (j4 > j6) {
                j4 = j6;
            }
            long j7 = -1;
            if (j3 == j4 || (zf5Var = this.x) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    zf5Var = zf5Var.g;
                    zf5Var.getClass();
                    j6 -= zf5Var.c - zf5Var.b;
                }
                while (j6 < j4) {
                    byte[] bArr = zf5Var.a;
                    long j8 = j7;
                    int min = (int) Math.min(zf5Var.c, (zf5Var.b + j4) - j6);
                    for (int i = (int) ((zf5Var.b + j3) - j6); i < min; i++) {
                        if (bArr[i] == b) {
                            return (i - zf5Var.b) + j6;
                        }
                    }
                    j6 += zf5Var.c - zf5Var.b;
                    zf5Var = zf5Var.f;
                    zf5Var.getClass();
                    j7 = j8;
                    j3 = j6;
                }
                return j7;
            }
            while (true) {
                long j9 = (zf5Var.c - zf5Var.b) + j5;
                if (j9 > j3) {
                    break;
                }
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                j5 = j9;
            }
            while (j5 < j4) {
                byte[] bArr2 = zf5Var.a;
                int min2 = (int) Math.min(zf5Var.c, (zf5Var.b + j4) - j5);
                for (int i2 = (int) ((zf5Var.b + j3) - j5); i2 < min2; i2++) {
                    if (bArr2[i2] == b) {
                        return (i2 - zf5Var.b) + j5;
                    }
                }
                j5 += zf5Var.c - zf5Var.b;
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                j3 = j5;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.y);
        qx1.w(sb, " fromIndex=", j3, " toIndex=");
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.db0
    public final boolean r(long j, zd0 zd0Var) {
        zd0Var.getClass();
        return A(j, zd0Var, zd0Var.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, pa0] */
    @Override // defpackage.db0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r0() {
        /*
            r15 = this;
            long r0 = r15.y
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            zf5 r7 = r15.x
            r7.getClass()
            byte[] r8 = r7.a
            int r9 = r7.b
            int r10 = r7.c
        L17:
            if (r9 >= r10) goto L92
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L6a
            r12 = 70
            if (r11 > r12) goto L6a
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            pa0 r15 = new pa0
            r15.<init>()
            r15.x0(r4)
            r15.w0(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            long r1 = r15.y
            java.nio.charset.Charset r3 = defpackage.kl0.a
            java.lang.String r15 = r15.T(r1, r3)
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L6a:
            r6 = 1
            if (r1 == 0) goto L6e
            goto L92
        L6e:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            char[] r1 = defpackage.db.a
            int r2 = r11 >> 4
            r2 = r2 & 15
            char r2 = r1[r2]
            r3 = r11 & 15
            char r1 = r1[r3]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r2
            r3[r6] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r15.<init>(r0)
            throw r15
        L92:
            if (r9 != r10) goto L9e
            zf5 r8 = r7.a()
            r15.x = r8
            defpackage.hg5.a(r7)
            goto La0
        L9e:
            r7.b = r9
        La0:
            if (r6 != 0) goto La6
            zf5 r7 = r15.x
            if (r7 != 0) goto Lc
        La6:
            long r2 = r15.y
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.y = r2
            return r4
        Lad:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa0.r0():long");
    }

    public final int read(byte[] bArr, int i, int i2) {
        tl7.m(bArr.length, i, i2);
        zf5 zf5Var = this.x;
        if (zf5Var == null) {
            return -1;
        }
        int min = Math.min(i2, zf5Var.c - zf5Var.b);
        byte[] bArr2 = zf5Var.a;
        int i3 = zf5Var.b;
        ms.v0(i, i3, i3 + min, bArr2, bArr);
        int i4 = zf5Var.b + min;
        zf5Var.b = i4;
        this.y -= min;
        if (i4 == zf5Var.c) {
            this.x = zf5Var.a();
            hg5.a(zf5Var);
        }
        return min;
    }

    @Override // defpackage.db0
    public final byte readByte() {
        if (this.y != 0) {
            zf5 zf5Var = this.x;
            zf5Var.getClass();
            int i = zf5Var.b;
            int i2 = zf5Var.c;
            int i3 = i + 1;
            byte b = zf5Var.a[i];
            this.y--;
            if (i3 == i2) {
                this.x = zf5Var.a();
                hg5.a(zf5Var);
                return b;
            }
            zf5Var.b = i3;
            return b;
        }
        throw new EOFException();
    }

    @Override // defpackage.db0
    public final int readInt() {
        if (this.y >= 4) {
            zf5 zf5Var = this.x;
            zf5Var.getClass();
            int i = zf5Var.b;
            int i2 = zf5Var.c;
            if (i2 - i < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = zf5Var.a;
            int i3 = i + 3;
            int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
            int i5 = i + 4;
            int i6 = (bArr[i3] & 255) | i4;
            this.y -= 4;
            if (i5 == i2) {
                this.x = zf5Var.a();
                hg5.a(zf5Var);
                return i6;
            }
            zf5Var.b = i5;
            return i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.db0
    public final short readShort() {
        if (this.y >= 2) {
            zf5 zf5Var = this.x;
            zf5Var.getClass();
            int i = zf5Var.b;
            int i2 = zf5Var.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = zf5Var.a;
            int i3 = i + 1;
            int i4 = (bArr[i] & 255) << 8;
            int i5 = i + 2;
            int i6 = (bArr[i3] & 255) | i4;
            this.y -= 2;
            if (i5 == i2) {
                this.x = zf5Var.a();
                hg5.a(zf5Var);
            } else {
                zf5Var.b = i5;
            }
            return (short) i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.db0
    public final zd0 s(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.y >= j) {
                if (j >= 4096) {
                    zd0 d0 = d0((int) j);
                    skip(j);
                    return d0;
                }
                return new zd0(G(j));
            }
            throw new EOFException();
        }
        ze0.e(h11.h(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.db0
    public final void skip(long j) {
        while (j > 0) {
            zf5 zf5Var = this.x;
            if (zf5Var != null) {
                int min = (int) Math.min(j, zf5Var.c - zf5Var.b);
                long j2 = min;
                this.y -= j2;
                j -= j2;
                int i = zf5Var.b + min;
                zf5Var.b = i;
                if (i == zf5Var.c) {
                    this.x = zf5Var.a();
                    hg5.a(zf5Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final long t(zd0 zd0Var) {
        int i;
        int i2;
        zd0Var.getClass();
        zf5 zf5Var = this.x;
        if (zf5Var != null) {
            long j = this.y;
            long j2 = 0;
            if (j < 0) {
                while (j > 0) {
                    zf5Var = zf5Var.g;
                    zf5Var.getClass();
                    j -= zf5Var.c - zf5Var.b;
                }
                if (zd0Var.d() == 2) {
                    byte i3 = zd0Var.i(0);
                    byte i4 = zd0Var.i(1);
                    while (j < this.y) {
                        byte[] bArr = zf5Var.a;
                        i = (int) ((zf5Var.b + j2) - j);
                        int i5 = zf5Var.c;
                        while (i < i5) {
                            byte b = bArr[i];
                            if (b != i3 && b != i4) {
                                i++;
                            }
                            i2 = zf5Var.b;
                        }
                        j2 = (zf5Var.c - zf5Var.b) + j;
                        zf5Var = zf5Var.f;
                        zf5Var.getClass();
                        j = j2;
                    }
                    return -1L;
                }
                byte[] h = zd0Var.h();
                while (j < this.y) {
                    byte[] bArr2 = zf5Var.a;
                    i = (int) ((zf5Var.b + j2) - j);
                    int i6 = zf5Var.c;
                    while (i < i6) {
                        byte b2 = bArr2[i];
                        for (byte b3 : h) {
                            if (b2 == b3) {
                                i2 = zf5Var.b;
                            }
                        }
                        i++;
                    }
                    j2 = (zf5Var.c - zf5Var.b) + j;
                    zf5Var = zf5Var.f;
                    zf5Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            j = 0;
            while (true) {
                long j3 = (zf5Var.c - zf5Var.b) + j;
                if (j3 > 0) {
                    break;
                }
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                j = j3;
            }
            if (zd0Var.d() == 2) {
                byte i7 = zd0Var.i(0);
                byte i8 = zd0Var.i(1);
                while (j < this.y) {
                    byte[] bArr3 = zf5Var.a;
                    i = (int) ((zf5Var.b + j2) - j);
                    int i9 = zf5Var.c;
                    while (i < i9) {
                        byte b4 = bArr3[i];
                        if (b4 != i7 && b4 != i8) {
                            i++;
                        }
                        i2 = zf5Var.b;
                    }
                    j2 = (zf5Var.c - zf5Var.b) + j;
                    zf5Var = zf5Var.f;
                    zf5Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] h2 = zd0Var.h();
            while (j < this.y) {
                byte[] bArr4 = zf5Var.a;
                i = (int) ((zf5Var.b + j2) - j);
                int i10 = zf5Var.c;
                while (i < i10) {
                    byte b5 = bArr4[i];
                    for (byte b6 : h2) {
                        if (b5 == b6) {
                            i2 = zf5Var.b;
                        }
                    }
                    i++;
                }
                j2 = (zf5Var.c - zf5Var.b) + j;
                zf5Var = zf5Var.f;
                zf5Var.getClass();
                j = j2;
            }
            return -1L;
            return (i - i2) + j;
        }
        return -1L;
    }

    @Override // defpackage.db0
    public final InputStream t0() {
        return new na0((Closeable) this, (byte) 0);
    }

    public final String toString() {
        long j = this.y;
        if (j <= 2147483647L) {
            return d0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.y).toString());
    }

    public final void u0(zd0 zd0Var) {
        zd0Var.getClass();
        zd0Var.r(this, zd0Var.d());
    }

    public final void v0(bv5 bv5Var) {
        bv5Var.getClass();
        do {
        } while (bv5Var.j0(8192L, this) != -1);
    }

    public final void w0(int i) {
        zf5 k0 = k0(1);
        byte[] bArr = k0.a;
        int i2 = k0.c;
        k0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.y++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            zf5 k0 = k0(1);
            int min = Math.min(i, 8192 - k0.c);
            byteBuffer.get(k0.a, k0.c, min);
            i -= min;
            k0.c += min;
        }
        this.y += remaining;
        return remaining;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 writeByte(int i) {
        w0(i);
        return this;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 writeInt(int i) {
        y0(i);
        return this;
    }

    @Override // defpackage.cb0
    public final /* bridge */ /* synthetic */ cb0 writeShort(int i) {
        z0(i);
        return this;
    }

    public final void x0(long j) {
        if (j == 0) {
            w0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        zf5 k0 = k0(i);
        byte[] bArr = k0.a;
        int i2 = k0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        k0.c += i;
        this.y += i;
    }

    public final void y0(int i) {
        zf5 k0 = k0(4);
        byte[] bArr = k0.a;
        int i2 = k0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        k0.c = i2 + 4;
        this.y += 4;
    }

    @Override // defpackage.db0
    public final byte[] z() {
        return G(this.y);
    }

    public final void z0(int i) {
        zf5 k0 = k0(2);
        byte[] bArr = k0.a;
        int i2 = k0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        k0.c = i2 + 2;
        this.y += 2;
    }

    @Override // defpackage.db0
    public final pa0 c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.pq5
    public final void close() {
    }

    @Override // defpackage.cb0, defpackage.pq5, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.cb0
    public final cb0 write(byte[] bArr) {
        l0(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zf5 zf5Var = this.x;
        if (zf5Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), zf5Var.c - zf5Var.b);
        byteBuffer.put(zf5Var.a, zf5Var.b, min);
        int i = zf5Var.b + min;
        zf5Var.b = i;
        this.y -= min;
        if (i == zf5Var.c) {
            this.x = zf5Var.a();
            hg5.a(zf5Var);
        }
        return min;
    }
}
