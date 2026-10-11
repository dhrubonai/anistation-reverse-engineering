package k9;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import r6.h0;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final w f6542a;

    /* renamed from: b, reason: collision with root package name */
    public final g f6543b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6544c;

    public q(w wVar) {
        h0.u(wVar, "source");
        this.f6542a = wVar;
        this.f6543b = new g();
    }

    @Override // k9.i
    public final void A(long j4) {
        if (q(j4)) {
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        com.bumptech.glide.c.i(16);
        com.bumptech.glide.c.i(16);
        r1 = java.lang.Integer.toString(r2, 16);
        r6.h0.s(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // k9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D() {
        /*
            r6 = this;
            r0 = 1
            r6.A(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.q(r2)
            k9.g r3 = r6.f6543b
            if (r2 == 0) goto L51
            long r4 = (long) r0
            byte r2 = r3.q(r4)
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
            goto L51
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            com.bumptech.glide.c.i(r1)
            com.bumptech.glide.c.i(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            r6.h0.s(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L51:
            long r0 = r3.D()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.q.D():long");
    }

    @Override // k9.i
    public final String E(Charset charset) {
        g gVar = this.f6543b;
        gVar.e(this.f6542a);
        return gVar.x(gVar.f6521b, charset);
    }

    @Override // k9.i
    public final f F() {
        return new f(this, 1);
    }

    public final long a(byte b10, long j4, long j10) {
        boolean z9 = true;
        if (!this.f6544c) {
            long j11 = 0;
            if (0 > j10) {
                z9 = false;
            }
            if (z9) {
                while (j11 < j10) {
                    long r8 = this.f6543b.r(b10, j11, j10);
                    if (r8 != -1) {
                        return r8;
                    }
                    g gVar = this.f6543b;
                    long j12 = gVar.f6521b;
                    if (j12 >= j10 || this.f6542a.z(gVar, 8192L) == -1) {
                        return -1L;
                    }
                    j11 = Math.max(j11, j12);
                }
                return -1L;
            }
            throw new IllegalArgumentException(a3.g.q("fromIndex=0 toIndex=", j10).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.i
    public final void b(long j4) {
        if (!this.f6544c) {
            while (j4 > 0) {
                g gVar = this.f6543b;
                if (gVar.f6521b == 0 && this.f6542a.z(gVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j4, gVar.f6521b);
                gVar.b(min);
                j4 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k9.w
    public final y c() {
        return this.f6542a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f6544c) {
            this.f6544c = true;
            this.f6542a.close();
            this.f6543b.a();
        }
    }

    public final int f() {
        A(4L);
        int readInt = this.f6543b.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // k9.i
    public final j h(long j4) {
        A(j4);
        return this.f6543b.h(j4);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f6544c;
    }

    @Override // k9.i
    public final String k() {
        return u(Long.MAX_VALUE);
    }

    @Override // k9.i
    public final byte[] l() {
        w wVar = this.f6542a;
        g gVar = this.f6543b;
        gVar.e(wVar);
        return gVar.l();
    }

    @Override // k9.i
    public final g m() {
        return this.f6543b;
    }

    @Override // k9.i
    public final boolean n() {
        if (!this.f6544c) {
            g gVar = this.f6543b;
            if (gVar.n() && this.f6542a.z(gVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean q(long j4) {
        boolean z9;
        g gVar;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!(!this.f6544c)) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                gVar = this.f6543b;
                if (gVar.f6521b >= j4) {
                    return true;
                }
            } while (this.f6542a.z(gVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h0.u(byteBuffer, "sink");
        g gVar = this.f6543b;
        if (gVar.f6521b == 0 && this.f6542a.z(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(byteBuffer);
    }

    @Override // k9.i
    public final byte readByte() {
        A(1L);
        return this.f6543b.readByte();
    }

    @Override // k9.i
    public final int readInt() {
        A(4L);
        return this.f6543b.readInt();
    }

    @Override // k9.i
    public final short readShort() {
        A(2L);
        return this.f6543b.readShort();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return -1;
     */
    @Override // k9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(k9.o r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            r6.h0.u(r8, r0)
            boolean r0 = r7.f6544c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L34
        Lb:
            k9.g r0 = r7.f6543b
            int r2 = l9.a.b(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L24
            if (r2 == r4) goto L32
            k9.j[] r8 = r8.f6537a
            r8 = r8[r2]
            int r8 = r8.c()
            long r3 = (long) r8
            r0.b(r3)
            goto L33
        L24:
            k9.w r2 = r7.f6542a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.z(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
        L32:
            r2 = r4
        L33:
            return r2
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.q.s(k9.o):int");
    }

    public final String toString() {
        return "buffer(" + this.f6542a + ')';
    }

    @Override // k9.i
    public final String u(long j4) {
        boolean z9;
        long j10;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (j4 == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j4 + 1;
            }
            long a10 = a((byte) 10, 0L, j10);
            g gVar = this.f6543b;
            if (a10 != -1) {
                return l9.a.a(gVar, a10);
            }
            if (j10 < Long.MAX_VALUE && q(j10) && gVar.q(j10 - 1) == 13 && q(1 + j10) && gVar.q(j10) == 10) {
                return l9.a.a(gVar, j10);
            }
            g gVar2 = new g();
            gVar.f(gVar2, 0L, Math.min(32, gVar.f6521b));
            throw new EOFException("\\n not found: limit=" + Math.min(gVar.f6521b, j4) + " content=" + gVar2.h(gVar2.f6521b).d() + (char) 8230);
        }
        throw new IllegalArgumentException(a3.g.q("limit < 0: ", j4).toString());
    }

    @Override // k9.w
    public final long z(g gVar, long j4) {
        boolean z9;
        h0.u(gVar, "sink");
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (!this.f6544c) {
                g gVar2 = this.f6543b;
                if (gVar2.f6521b == 0 && this.f6542a.z(gVar2, 8192L) == -1) {
                    return -1L;
                }
                return gVar2.z(gVar, Math.min(j4, gVar2.f6521b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
