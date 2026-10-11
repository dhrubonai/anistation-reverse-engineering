package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class oa0 implements cv5, qq5 {
    public yf5 x;
    public yf5 y;
    public long z;

    public final void A(long j) {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.z + ", required: " + j + ')');
    }

    @Override // defpackage.iy4
    public final long C(oa0 oa0Var, long j) {
        if (j >= 0) {
            long j2 = this.z;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            oa0Var.d0(this, j);
            return j;
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
        return 0L;
    }

    @Override // defpackage.cv5
    public final boolean D() {
        if (this.z == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cv5
    public final int E(byte[] bArr, int i, int i2) {
        q23.j(bArr.length, i, i2);
        yf5 yf5Var = this.x;
        if (yf5Var == null) {
            return -1;
        }
        int min = Math.min(i2 - i, yf5Var.b());
        int i3 = (i + min) - i;
        byte[] bArr2 = yf5Var.a;
        int i4 = yf5Var.b;
        ms.v0(i, i4, i4 + i3, bArr2, bArr);
        yf5Var.b += i3;
        this.z -= min;
        if (db.Z(yf5Var)) {
            q();
        }
        return min;
    }

    public final long G(iy4 iy4Var) {
        iy4Var.getClass();
        long j = 0;
        while (true) {
            long C = iy4Var.C(this, 8192L);
            if (C != -1) {
                j += C;
            } else {
                return j;
            }
        }
    }

    public final long I(qq5 qq5Var) {
        qq5Var.getClass();
        long j = this.z;
        if (j > 0) {
            ((oa0) qq5Var).d0(this, j);
        }
        return j;
    }

    public final /* synthetic */ yf5 T(int i) {
        if (i >= 1 && i <= 8192) {
            yf5 yf5Var = this.y;
            if (yf5Var == null) {
                yf5 b = ig5.b();
                this.x = b;
                this.y = b;
                return b;
            }
            if (yf5Var.c + i <= 8192 && yf5Var.e) {
                return yf5Var;
            }
            yf5 b2 = ig5.b();
            yf5Var.e(b2);
            this.y = b2;
            return b2;
        }
        ze0.e(qx1.i(i, "unexpected capacity (", "), should be in range [1, 8192]"));
        return null;
    }

    public final byte a(long j) {
        long j2 = 0;
        if (j >= 0 && j < this.z) {
            yf5 yf5Var = this.x;
            if (j == 0) {
                yf5Var.getClass();
                return yf5Var.c(0);
            }
            yf5Var.getClass();
            long j3 = this.z;
            if (j3 - j < j) {
                yf5 yf5Var2 = this.y;
                while (yf5Var2 != null && j3 > j) {
                    j3 -= yf5Var2.c - yf5Var2.b;
                    if (j3 <= j) {
                        break;
                    }
                    yf5Var2 = yf5Var2.g;
                }
                yf5Var2.getClass();
                return yf5Var2.c((int) (j - j3));
            }
            yf5 yf5Var3 = this.x;
            while (yf5Var3 != null) {
                long j4 = (yf5Var3.c - yf5Var3.b) + j2;
                if (j4 > j) {
                    break;
                }
                yf5Var3 = yf5Var3.f;
                j2 = j4;
            }
            yf5Var3.getClass();
            return yf5Var3.c((int) (j - j2));
        }
        ze0.g(qx1.k(this.z, "))", zo5.n(j, "position (", ") is not within the range [0..size(")));
        return (byte) 0;
    }

    public final void d0(oa0 oa0Var, long j) {
        yf5 b;
        int i;
        if (oa0Var != this) {
            long j2 = oa0Var.z;
            if (0 <= j2 && j2 >= j && j >= 0) {
                while (j > 0) {
                    oa0Var.x.getClass();
                    int i2 = 0;
                    if (j < r0.b()) {
                        yf5 yf5Var = this.y;
                        if (yf5Var != null && yf5Var.e) {
                            long j3 = yf5Var.c + j;
                            x05 x05Var = yf5Var.d;
                            if (x05Var != null && x05Var.a > 0) {
                                i = 0;
                            } else {
                                i = yf5Var.b;
                            }
                            if (j3 - i <= 8192) {
                                yf5 yf5Var2 = oa0Var.x;
                                yf5Var2.getClass();
                                yf5Var2.g(yf5Var, (int) j);
                                oa0Var.z -= j;
                                this.z += j;
                                return;
                            }
                        }
                        yf5 yf5Var3 = oa0Var.x;
                        yf5Var3.getClass();
                        int i3 = (int) j;
                        if (i3 > 0 && i3 <= yf5Var3.c - yf5Var3.b) {
                            if (i3 >= 1024) {
                                b = yf5Var3.f();
                            } else {
                                b = ig5.b();
                                byte[] bArr = yf5Var3.a;
                                byte[] bArr2 = b.a;
                                int i4 = yf5Var3.b;
                                ms.v0(0, i4, i4 + i3, bArr, bArr2);
                            }
                            b.c = b.b + i3;
                            yf5Var3.b += i3;
                            yf5 yf5Var4 = yf5Var3.g;
                            if (yf5Var4 != null) {
                                yf5Var4.e(b);
                            } else {
                                b.f = yf5Var3;
                                yf5Var3.g = b;
                            }
                            oa0Var.x = b;
                        } else {
                            ze0.k("byteCount out of range");
                            return;
                        }
                    }
                    yf5 yf5Var5 = oa0Var.x;
                    yf5Var5.getClass();
                    long b2 = yf5Var5.b();
                    yf5 d = yf5Var5.d();
                    oa0Var.x = d;
                    if (d == null) {
                        oa0Var.y = null;
                    }
                    if (this.x == null) {
                        this.x = yf5Var5;
                        this.y = yf5Var5;
                    } else {
                        yf5 yf5Var6 = this.y;
                        yf5Var6.getClass();
                        yf5Var6.e(yf5Var5);
                        yf5 yf5Var7 = yf5Var5.g;
                        if (yf5Var7 != null) {
                            if (yf5Var7.e) {
                                int i5 = yf5Var5.c - yf5Var5.b;
                                int i6 = 8192 - yf5Var7.c;
                                yf5Var7.getClass();
                                x05 x05Var2 = yf5Var7.d;
                                if (x05Var2 == null || x05Var2.a <= 0) {
                                    yf5 yf5Var8 = yf5Var5.g;
                                    yf5Var8.getClass();
                                    i2 = yf5Var8.b;
                                }
                                if (i5 <= i6 + i2) {
                                    yf5 yf5Var9 = yf5Var5.g;
                                    yf5Var9.getClass();
                                    yf5Var5.g(yf5Var9, i5);
                                    if (yf5Var5.d() == null) {
                                        ig5.a(yf5Var5);
                                        yf5Var5 = yf5Var9;
                                    } else {
                                        ze0.m("Check failed.");
                                        return;
                                    }
                                }
                            }
                            this.y = yf5Var5;
                            if (yf5Var5.g == null) {
                                this.x = yf5Var5;
                            }
                        } else {
                            ze0.m("cannot compact");
                            return;
                        }
                    }
                    oa0Var.z -= b2;
                    this.z += b2;
                    j -= b2;
                }
                return;
            }
            ze0.k(qx1.k(j2, "))", zo5.n(j, "offset (0) and byteCount (", ") are not within the range [0..size(")));
            return;
        }
        ze0.k("source == this");
    }

    @Override // defpackage.cv5
    public final boolean g(long j) {
        if (j >= 0) {
            if (this.z >= j) {
                return true;
            }
            return false;
        }
        ze0.e(qx1.j(j, "byteCount: ", " < 0"));
        return false;
    }

    public final void k0(cv5 cv5Var, long j) {
        cv5Var.getClass();
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                long C = cv5Var.C(this, j2);
                if (C != -1) {
                    j2 -= C;
                } else {
                    throw new EOFException(qx1.k(j - j2, " were read.", zo5.n(j, "Source exhausted before reading ", " bytes. Only ")));
                }
            }
            return;
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
    }

    public final qz4 l() {
        return new qz4(new rk4(this));
    }

    public final void l0(byte b) {
        yf5 T = T(1);
        byte[] bArr = T.a;
        int i = T.c;
        T.c = i + 1;
        bArr[i] = b;
        this.z++;
    }

    @Override // defpackage.cv5
    public final void m(long j) {
        if (j >= 0) {
            if (this.z >= j) {
                return;
            }
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.z + ", required: " + j + ')');
        }
        ze0.e(h11.h(j, "byteCount: "));
    }

    public final void p(qq5 qq5Var, long j) {
        qq5Var.getClass();
        if (j >= 0) {
            long j2 = this.z;
            if (j2 >= j) {
                ((oa0) qq5Var).d0(this, j);
                return;
            } else {
                ((oa0) qq5Var).d0(this, j2);
                throw new EOFException(qx1.k(this.z, " bytes were written.", zo5.n(j, "Buffer exhausted before writing ", " bytes. Only ")));
            }
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
    }

    public final void q() {
        yf5 yf5Var = this.x;
        yf5Var.getClass();
        yf5 yf5Var2 = yf5Var.f;
        this.x = yf5Var2;
        if (yf5Var2 == null) {
            this.y = null;
        } else {
            yf5Var2.g = null;
        }
        yf5Var.f = null;
        ig5.a(yf5Var);
    }

    @Override // defpackage.cv5
    public final byte readByte() {
        yf5 yf5Var = this.x;
        if (yf5Var != null) {
            int b = yf5Var.b();
            if (b == 0) {
                q();
                return readByte();
            }
            byte[] bArr = yf5Var.a;
            int i = yf5Var.b;
            yf5Var.b = i + 1;
            byte b2 = bArr[i];
            this.z--;
            if (b == 1) {
                q();
            }
            return b2;
        }
        A(1L);
        throw null;
    }

    @Override // defpackage.cv5
    public final int readInt() {
        yf5 yf5Var = this.x;
        if (yf5Var != null) {
            int b = yf5Var.b();
            if (b < 4) {
                m(4L);
                if (b == 0) {
                    q();
                    return readInt();
                }
                return (readShort() & 65535) | (readShort() << 16);
            }
            byte[] bArr = yf5Var.a;
            int i = yf5Var.b;
            int i2 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
            yf5Var.b = i + 4;
            this.z -= 4;
            if (b == 4) {
                q();
            }
            return i2;
        }
        A(4L);
        throw null;
    }

    @Override // defpackage.cv5
    public final long readLong() {
        yf5 yf5Var = this.x;
        if (yf5Var != null) {
            int b = yf5Var.b();
            if (b < 8) {
                m(8L);
                if (b == 0) {
                    q();
                    return readLong();
                }
                return (readInt() << 32) | (readInt() & 4294967295L);
            }
            byte[] bArr = yf5Var.a;
            long j = ((bArr[r8] & 255) << 56) | ((bArr[r8 + 1] & 255) << 48) | ((bArr[r8 + 2] & 255) << 40) | ((bArr[r8 + 3] & 255) << 32) | ((bArr[r8 + 4] & 255) << 24) | ((bArr[r8 + 5] & 255) << 16) | ((bArr[r8 + 6] & 255) << 8) | (bArr[r8 + 7] & 255);
            yf5Var.b = yf5Var.b + 8;
            this.z -= 8;
            if (b == 8) {
                q();
            }
            return j;
        }
        A(8L);
        throw null;
    }

    public final short readShort() {
        yf5 yf5Var = this.x;
        if (yf5Var != null) {
            int b = yf5Var.b();
            if (b < 2) {
                m(2L);
                if (b == 0) {
                    q();
                    return readShort();
                }
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = yf5Var.a;
            int i = yf5Var.b;
            short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
            yf5Var.b = i + 2;
            this.z -= 2;
            if (b == 2) {
                q();
            }
            return s;
        }
        A(2L);
        throw null;
    }

    public final void skip(long j) {
        if (j >= 0) {
            long j2 = j;
            while (j2 > 0) {
                yf5 yf5Var = this.x;
                if (yf5Var != null) {
                    int min = (int) Math.min(j2, yf5Var.c - yf5Var.b);
                    long j3 = min;
                    this.z -= j3;
                    j2 -= j3;
                    int i = yf5Var.b + min;
                    yf5Var.b = i;
                    if (i == yf5Var.c) {
                        q();
                    }
                } else {
                    throw new EOFException(qx1.j(j, "Buffer exhausted before skipping ", " bytes."));
                }
            }
            return;
        }
        ze0.e(qx1.j(j, "byteCount (", ") < 0"));
    }

    public final /* synthetic */ void t() {
        yf5 yf5Var = this.y;
        yf5Var.getClass();
        yf5 yf5Var2 = yf5Var.g;
        this.y = yf5Var2;
        if (yf5Var2 == null) {
            this.x = null;
        } else {
            yf5Var2.f = null;
        }
        yf5Var.g = null;
        ig5.a(yf5Var);
    }

    public final String toString() {
        int i;
        long j = this.z;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int min = (int) Math.min(64L, j);
        int i2 = min * 2;
        if (this.z > 64) {
            i = 1;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(i2 + i);
        int i3 = 0;
        for (yf5 yf5Var = this.x; yf5Var != null; yf5Var = yf5Var.f) {
            int i4 = 0;
            while (i3 < min && i4 < yf5Var.b()) {
                int i5 = i4 + 1;
                byte c = yf5Var.c(i4);
                i3++;
                char[] cArr = q23.h;
                sb.append(cArr[(c >> 4) & 15]);
                sb.append(cArr[c & 15]);
                i4 = i5;
            }
        }
        if (this.z > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.z + " hex=" + ((Object) sb) + ')';
    }

    public final void u0(short s) {
        yf5 T = T(2);
        byte[] bArr = T.a;
        int i = T.c;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        T.c = i + 2;
        this.z += 2;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        q23.j(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            yf5 T = T(1);
            int min = Math.min(i2 - i3, T.a()) + i3;
            ms.v0(T.c, i3, min, bArr, T.a);
            T.c = (min - i3) + T.c;
            i3 = min;
        }
        this.z += i2 - i;
    }

    @Override // defpackage.cv5
    public final oa0 c() {
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
