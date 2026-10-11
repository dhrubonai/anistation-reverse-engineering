package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xy4 implements db0 {
    public final bv5 x;
    public final pa0 y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    public xy4(bv5 bv5Var) {
        bv5Var.getClass();
        this.x = bv5Var;
        this.y = new Object();
    }

    public final boolean D() {
        if (!this.z) {
            pa0 pa0Var = this.y;
            if (!pa0Var.D() || this.x.j0(8192L, pa0Var) != -1) {
                return false;
            }
            return true;
        }
        ze0.m("closed");
        return false;
    }

    @Override // defpackage.db0
    public final int F(lg4 lg4Var) {
        lg4Var.getClass();
        if (this.z) {
            ze0.m("closed");
            return 0;
        }
        while (true) {
            pa0 pa0Var = this.y;
            int d = b.d(pa0Var, lg4Var, true);
            if (d != -2) {
                if (d != -1) {
                    pa0Var.skip(lg4Var.x[d].d());
                    return d;
                }
            } else if (this.x.j0(8192L, pa0Var) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, pa0] */
    @Override // defpackage.db0
    public final String K(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long a = a((byte) 10, 0L, j2);
            pa0 pa0Var = this.y;
            if (a != -1) {
                return b.c(a, pa0Var);
            }
            if (j2 < Long.MAX_VALUE && g(j2) && pa0Var.p(j2 - 1) == 13 && g(j2 + 1) && pa0Var.p(j2) == 10) {
                return b.c(j2, pa0Var);
            }
            ?? obj = new Object();
            pa0Var.l(obj, 0L, Math.min(32L, pa0Var.y));
            throw new EOFException("\\n not found: limit=" + Math.min(pa0Var.y, j) + " content=" + obj.s(obj.y).e() + (char) 8230);
        }
        ze0.e(h11.h(j, "limit < 0: "));
        return null;
    }

    @Override // defpackage.db0
    public final long S(cb0 cb0Var) {
        pa0 pa0Var;
        long j = 0;
        while (true) {
            bv5 bv5Var = this.x;
            pa0Var = this.y;
            if (bv5Var.j0(8192L, pa0Var) == -1) {
                break;
            }
            long a = pa0Var.a();
            if (a > 0) {
                j += a;
                cb0Var.f0(a, pa0Var);
            }
        }
        long j2 = pa0Var.y;
        if (j2 > 0) {
            long j3 = j + j2;
            cb0Var.f0(j2, pa0Var);
            return j3;
        }
        return j;
    }

    @Override // defpackage.db0
    public final String Z(Charset charset) {
        bv5 bv5Var = this.x;
        pa0 pa0Var = this.y;
        pa0Var.v0(bv5Var);
        return pa0Var.T(pa0Var.y, charset);
    }

    public final long a(byte b, long j, long j2) {
        if (!this.z) {
            if (0 <= j2) {
                long j3 = 0;
                while (j3 < j2) {
                    pa0 pa0Var = this.y;
                    byte b2 = b;
                    long j4 = j2;
                    long q = pa0Var.q(b2, j3, j4);
                    if (q != -1) {
                        return q;
                    }
                    long j5 = pa0Var.y;
                    if (j5 >= j4 || this.x.j0(8192L, pa0Var) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            ze0.e(h11.h(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        ze0.m("closed");
        return 0L;
    }

    @Override // defpackage.db0
    public final pa0 c() {
        return this.y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.z) {
            this.z = true;
            this.x.close();
            pa0 pa0Var = this.y;
            pa0Var.skip(pa0Var.y);
        }
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x.d();
    }

    @Override // defpackage.db0
    public final String e0() {
        return K(Long.MAX_VALUE);
    }

    @Override // defpackage.db0
    public final boolean g(long j) {
        pa0 pa0Var;
        if (j >= 0) {
            if (this.z) {
                ze0.m("closed");
                return false;
            }
            do {
                pa0Var = this.y;
                if (pa0Var.y >= j) {
                    return true;
                }
            } while (this.x.j0(8192L, pa0Var) != -1);
            return false;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.z;
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (j >= 0) {
            if (!this.z) {
                pa0 pa0Var2 = this.y;
                if (pa0Var2.y == 0) {
                    if (j == 0) {
                        return 0L;
                    }
                    if (this.x.j0(8192L, pa0Var2) == -1) {
                        return -1L;
                    }
                }
                return pa0Var2.j0(Math.min(j, pa0Var2.y), pa0Var);
            }
            ze0.m("closed");
            return 0L;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return 0L;
    }

    public final int l() {
        m(4L);
        int readInt = this.y.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // defpackage.db0
    public final void m(long j) {
        if (g(j)) {
        } else {
            throw new EOFException();
        }
    }

    public final long p() {
        char c;
        char c2;
        long j;
        m(8L);
        pa0 pa0Var = this.y;
        if (pa0Var.y >= 8) {
            zf5 zf5Var = pa0Var.x;
            zf5Var.getClass();
            int i = zf5Var.b;
            int i2 = zf5Var.c;
            if (i2 - i < 8) {
                j = ((pa0Var.readInt() & 4294967295L) << 32) | (4294967295L & pa0Var.readInt());
                c = 24;
                c2 = '(';
            } else {
                byte[] bArr = zf5Var.a;
                c = 24;
                c2 = '(';
                int i3 = i + 7;
                long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
                int i4 = i + 8;
                long j3 = j2 | (bArr[i3] & 255);
                pa0Var.y -= 8;
                if (i4 == i2) {
                    pa0Var.x = zf5Var.a();
                    hg5.a(zf5Var);
                } else {
                    zf5Var.b = i4;
                }
                j = j3;
            }
            return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
        }
        throw new EOFException();
    }

    public final short q() {
        m(2L);
        return this.y.I();
    }

    @Override // defpackage.db0
    public final boolean r(long j, zd0 zd0Var) {
        long a;
        boolean z;
        boolean z2;
        long j2;
        zd0Var.getClass();
        int d = zd0Var.d();
        if (!this.z) {
            if (d < 0 || j < 0 || d > zd0Var.d()) {
                return false;
            }
            if (d == 0) {
                return true;
            }
            long j3 = 1;
            long j4 = j + 1;
            long j5 = d;
            tl7.m(zd0Var.d(), 0L, j5);
            if (!this.z) {
                long j6 = j;
                loop0: while (true) {
                    pa0 pa0Var = this.y;
                    a = b.a(pa0Var, zd0Var, j6, j4, d);
                    if (a != -1) {
                        z = false;
                        z2 = true;
                        break;
                    }
                    long j7 = pa0Var.y;
                    z = false;
                    z2 = true;
                    long j8 = (j7 - j5) + j3;
                    if (j8 >= j4) {
                        break;
                    }
                    if (j7 < j4) {
                        j2 = j4;
                    } else {
                        int max = (int) Math.max(j3, (j7 - j4) + j3);
                        int min = ((int) Math.min(j5, (pa0Var.y - j6) + j3)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j2 = j4;
                            if (!pa0Var.A(pa0Var.y - min, zd0Var, min)) {
                                if (min == max) {
                                    break loop0;
                                }
                                min--;
                                j4 = j2;
                            } else {
                                break;
                            }
                        }
                    }
                    if (this.x.j0(8192L, pa0Var) == -1) {
                        break;
                    }
                    j6 = Math.max(j6, j8);
                    j4 = j2;
                    j3 = 1;
                }
                a = -1;
                if (a != -1) {
                    return z2;
                }
                return z;
            }
            ze0.m("closed");
            return false;
        }
        ze0.m("closed");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.t80.z(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.db0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r0() {
        /*
            r6 = this;
            r0 = 1
            r6.m(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.g(r2)
            pa0 r3 = r6.y
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.p(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.t80.z(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L4c:
            long r0 = r3.r0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy4.r0():long");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        pa0 pa0Var = this.y;
        if (pa0Var.y == 0 && this.x.j0(8192L, pa0Var) == -1) {
            return -1;
        }
        return pa0Var.read(byteBuffer);
    }

    @Override // defpackage.db0
    public final byte readByte() {
        m(1L);
        return this.y.readByte();
    }

    @Override // defpackage.db0
    public final int readInt() {
        m(4L);
        return this.y.readInt();
    }

    @Override // defpackage.db0
    public final short readShort() {
        m(2L);
        return this.y.readShort();
    }

    @Override // defpackage.db0
    public final zd0 s(long j) {
        m(j);
        return this.y.s(j);
    }

    @Override // defpackage.db0
    public final void skip(long j) {
        if (!this.z) {
            while (j > 0) {
                pa0 pa0Var = this.y;
                if (pa0Var.y == 0 && this.x.j0(8192L, pa0Var) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, pa0Var.y);
                pa0Var.skip(min);
                j -= min;
            }
            return;
        }
        ze0.m("closed");
    }

    public final String t(long j) {
        m(j);
        return this.y.T(j, kl0.a);
    }

    @Override // defpackage.db0
    public final InputStream t0() {
        return new na0((Closeable) this, (byte) 2);
    }

    public final String toString() {
        return "buffer(" + this.x + ')';
    }

    @Override // defpackage.db0
    public final byte[] z() {
        bv5 bv5Var = this.x;
        pa0 pa0Var = this.y;
        pa0Var.v0(bv5Var);
        return pa0Var.G(pa0Var.y);
    }
}
