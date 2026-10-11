package k9;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import r6.h0;

/* loaded from: classes.dex */
public final class g implements i, h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public r f6520a;

    /* renamed from: b, reason: collision with root package name */
    public long f6521b;

    @Override // k9.i
    public final void A(long j4) {
        if (this.f6521b >= j4) {
        } else {
            throw new EOFException();
        }
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h B(String str) {
        Q(str);
        return this;
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h C(long j4) {
        L(j4);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8 A[EDGE_INSN: B:41:0x00a8->B:38:0x00a8 BREAK  A[LOOP:0: B:4:0x000c->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // k9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D() {
        /*
            r14 = this;
            long r0 = r14.f6521b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Laf
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            k9.r r7 = r14.f6520a
            r6.h0.q(r7)
            int r8 = r7.f6546b
            int r9 = r7.f6547c
        L15:
            if (r8 >= r9) goto L94
            byte[] r10 = r7.f6545a
            r10 = r10[r8]
            r11 = 48
            if (r10 < r11) goto L26
            r11 = 57
            if (r10 > r11) goto L26
            int r11 = r10 + (-48)
            goto L3d
        L26:
            r11 = 97
            if (r10 < r11) goto L31
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L31
            int r11 = r10 + (-97)
            goto L3b
        L31:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-65)
        L3b:
            int r11 = r11 + 10
        L3d:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4d
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L15
        L4d:
            k9.g r0 = new k9.g
            r0.<init>()
            r0.M(r4)
            r0.K(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            long r2 = r0.f6521b
            java.nio.charset.Charset r4 = o7.a.f8311a
            java.lang.String r0 = r0.x(r2, r4)
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6c:
            r6 = 1
            if (r1 == 0) goto L70
            goto L94
        L70:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = w7.b.f11024d
            int r4 = r10 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r2[r0] = r4
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r6] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L94:
            if (r8 != r9) goto La0
            k9.r r8 = r7.a()
            r14.f6520a = r8
            k9.s.a(r7)
            goto La2
        La0:
            r7.f6546b = r8
        La2:
            if (r6 != 0) goto La8
            k9.r r7 = r14.f6520a
            if (r7 != 0) goto Lc
        La8:
            long r2 = r14.f6521b
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f6521b = r2
            return r4
        Laf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.g.D():long");
    }

    @Override // k9.i
    public final String E(Charset charset) {
        return x(this.f6521b, charset);
    }

    @Override // k9.i
    public final f F() {
        return new f(this, 0);
    }

    public final j G(int i10) {
        if (i10 == 0) {
            return j.f6522d;
        }
        q6.g.h(this.f6521b, 0L, i10);
        r rVar = this.f6520a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            h0.q(rVar);
            int i14 = rVar.f6547c;
            int i15 = rVar.f6546b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                rVar = rVar.f6550f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        r rVar2 = this.f6520a;
        int i16 = 0;
        while (i11 < i10) {
            h0.q(rVar2);
            bArr[i16] = rVar2.f6545a;
            i11 += rVar2.f6547c - rVar2.f6546b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = rVar2.f6546b;
            rVar2.f6548d = true;
            i16++;
            rVar2 = rVar2.f6550f;
        }
        return new t(bArr, iArr);
    }

    public final r H(int i10) {
        boolean z9 = true;
        if (i10 < 1 || i10 > 8192) {
            z9 = false;
        }
        if (z9) {
            r rVar = this.f6520a;
            if (rVar == null) {
                r b10 = s.b();
                this.f6520a = b10;
                b10.f6551g = b10;
                b10.f6550f = b10;
                return b10;
            }
            r rVar2 = rVar.f6551g;
            h0.q(rVar2);
            if (rVar2.f6547c + i10 <= 8192 && rVar2.f6549e) {
                return rVar2;
            }
            r b11 = s.b();
            rVar2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void I(j jVar) {
        h0.u(jVar, "byteString");
        jVar.k(this, jVar.c());
    }

    public final void J(byte[] bArr, int i10, int i11) {
        h0.u(bArr, "source");
        long j4 = i11;
        q6.g.h(bArr.length, i10, j4);
        int i12 = i11 + i10;
        while (i10 < i12) {
            r H = H(1);
            int min = Math.min(i12 - i10, 8192 - H.f6547c);
            int i13 = i10 + min;
            x6.i.h1(bArr, H.f6547c, H.f6545a, i10, i13);
            H.f6547c += min;
            i10 = i13;
        }
        this.f6521b += j4;
    }

    public final void K(int i10) {
        r H = H(1);
        int i11 = H.f6547c;
        H.f6547c = i11 + 1;
        H.f6545a[i11] = (byte) i10;
        this.f6521b++;
    }

    public final g L(long j4) {
        boolean z9;
        byte[] bArr;
        if (j4 == 0) {
            K(48);
        } else {
            int i10 = 1;
            if (j4 < 0) {
                j4 = -j4;
                if (j4 < 0) {
                    Q("-9223372036854775808");
                } else {
                    z9 = true;
                }
            } else {
                z9 = false;
            }
            if (j4 < 100000000) {
                if (j4 < 10000) {
                    if (j4 < 100) {
                        if (j4 >= 10) {
                            i10 = 2;
                        }
                    } else if (j4 < 1000) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (j4 < 1000000) {
                    if (j4 < 100000) {
                        i10 = 5;
                    } else {
                        i10 = 6;
                    }
                } else if (j4 < 10000000) {
                    i10 = 7;
                } else {
                    i10 = 8;
                }
            } else if (j4 < 1000000000000L) {
                if (j4 < 10000000000L) {
                    if (j4 < 1000000000) {
                        i10 = 9;
                    } else {
                        i10 = 10;
                    }
                } else if (j4 < 100000000000L) {
                    i10 = 11;
                } else {
                    i10 = 12;
                }
            } else if (j4 < 1000000000000000L) {
                if (j4 < 10000000000000L) {
                    i10 = 13;
                } else if (j4 < 100000000000000L) {
                    i10 = 14;
                } else {
                    i10 = 15;
                }
            } else if (j4 < 100000000000000000L) {
                if (j4 < 10000000000000000L) {
                    i10 = 16;
                } else {
                    i10 = 17;
                }
            } else if (j4 < 1000000000000000000L) {
                i10 = 18;
            } else {
                i10 = 19;
            }
            if (z9) {
                i10++;
            }
            r H = H(i10);
            int i11 = H.f6547c + i10;
            while (true) {
                bArr = H.f6545a;
                if (j4 == 0) {
                    break;
                }
                long j10 = 10;
                i11--;
                bArr[i11] = l9.a.f7037a[(int) (j4 % j10)];
                j4 /= j10;
            }
            if (z9) {
                bArr[i11 - 1] = 45;
            }
            H.f6547c += i10;
            this.f6521b += i10;
        }
        return this;
    }

    public final g M(long j4) {
        if (j4 == 0) {
            K(48);
        } else {
            long j10 = (j4 >>> 1) | j4;
            long j11 = j10 | (j10 >>> 2);
            long j12 = j11 | (j11 >>> 4);
            long j13 = j12 | (j12 >>> 8);
            long j14 = j13 | (j13 >>> 16);
            long j15 = j14 | (j14 >>> 32);
            long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
            long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
            long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
            long j19 = j18 + (j18 >>> 8);
            long j20 = j19 + (j19 >>> 16);
            int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
            r H = H(i10);
            int i11 = H.f6547c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                H.f6545a[i12] = l9.a.f7037a[(int) (15 & j4)];
                j4 >>>= 4;
            }
            H.f6547c += i10;
            this.f6521b += i10;
        }
        return this;
    }

    public final void N(int i10) {
        r H = H(4);
        int i11 = H.f6547c;
        int i12 = i11 + 1;
        byte[] bArr = H.f6545a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        H.f6547c = i14 + 1;
        this.f6521b += 4;
    }

    public final void O(int i10) {
        r H = H(2);
        int i11 = H.f6547c;
        int i12 = i11 + 1;
        byte[] bArr = H.f6545a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        H.f6547c = i12 + 1;
        this.f6521b += 2;
    }

    public final void P(int i10, int i11, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        char charAt;
        char c6;
        boolean z12;
        h0.u(str, "string");
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i11 >= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 <= str.length()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            r H = H(1);
                            int i12 = H.f6547c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = H.f6545a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = H.f6547c;
                            int i15 = (i12 + i10) - i14;
                            H.f6547c = i14 + i15;
                            this.f6521b += i15;
                        } else {
                            if (charAt2 < 2048) {
                                r H2 = H(2);
                                int i16 = H2.f6547c;
                                byte[] bArr2 = H2.f6545a;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                H2.f6547c = i16 + 2;
                                this.f6521b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c6 = str.charAt(i17);
                                } else {
                                    c6 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c6 && c6 < 57344) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        int i18 = (((charAt2 & 1023) << 10) | (c6 & 1023)) + 65536;
                                        r H3 = H(4);
                                        int i19 = H3.f6547c;
                                        byte[] bArr3 = H3.f6545a;
                                        bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                        bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                        bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                        bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                        H3.f6547c = i19 + 4;
                                        this.f6521b += 4;
                                        i10 += 2;
                                    }
                                }
                                K(63);
                                i10 = i17;
                            } else {
                                r H4 = H(3);
                                int i20 = H4.f6547c;
                                byte[] bArr4 = H4.f6545a;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                H4.f6547c = i20 + 3;
                                this.f6521b += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder u9 = a3.g.u("endIndex > string.length: ", i11, " > ");
                u9.append(str.length());
                throw new IllegalArgumentException(u9.toString().toString());
            }
            throw new IllegalArgumentException(a3.g.p("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(a3.g.n("beginIndex < 0: ", i10).toString());
    }

    public final void Q(String str) {
        h0.u(str, "string");
        P(0, str.length(), str);
    }

    public final void R(int i10) {
        boolean z9;
        String str;
        if (i10 < 128) {
            K(i10);
            return;
        }
        if (i10 < 2048) {
            r H = H(2);
            int i11 = H.f6547c;
            byte[] bArr = H.f6545a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            H.f6547c = i11 + 2;
            this.f6521b += 2;
            return;
        }
        int i12 = 0;
        if (55296 <= i10 && i10 < 57344) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            K(63);
            return;
        }
        if (i10 < 65536) {
            r H2 = H(3);
            int i13 = H2.f6547c;
            byte[] bArr2 = H2.f6545a;
            bArr2[i13] = (byte) ((i10 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
            H2.f6547c = i13 + 3;
            this.f6521b += 3;
            return;
        }
        if (i10 <= 1114111) {
            r H3 = H(4);
            int i14 = H3.f6547c;
            byte[] bArr3 = H3.f6545a;
            bArr3[i14] = (byte) ((i10 >> 18) | 240);
            bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
            H3.f6547c = i14 + 4;
            this.f6521b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = w7.b.f11024d;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i12 < 8 && cArr2[i12] == '0') {
                i12++;
            }
            if (i12 >= 0) {
                if (i12 <= 8) {
                    str = new String(cArr2, i12, 8 - i12);
                } else {
                    throw new IllegalArgumentException(a3.g.o("startIndex: ", i12, " > endIndex: 8"));
                }
            } else {
                throw new IndexOutOfBoundsException(a3.g.o("startIndex: ", i12, ", endIndex: 8, size: 8"));
            }
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a() {
        b(this.f6521b);
    }

    @Override // k9.i
    public final void b(long j4) {
        while (j4 > 0) {
            r rVar = this.f6520a;
            if (rVar != null) {
                int min = (int) Math.min(j4, rVar.f6547c - rVar.f6546b);
                long j10 = min;
                this.f6521b -= j10;
                j4 -= j10;
                int i10 = rVar.f6546b + min;
                rVar.f6546b = i10;
                if (i10 == rVar.f6547c) {
                    this.f6520a = rVar.a();
                    s.a(rVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // k9.w
    public final y c() {
        return y.f6558d;
    }

    public final Object clone() {
        g gVar = new g();
        if (this.f6521b != 0) {
            r rVar = this.f6520a;
            h0.q(rVar);
            r c6 = rVar.c();
            gVar.f6520a = c6;
            c6.f6551g = c6;
            c6.f6550f = c6;
            for (r rVar2 = rVar.f6550f; rVar2 != rVar; rVar2 = rVar2.f6550f) {
                r rVar3 = c6.f6551g;
                h0.q(rVar3);
                h0.q(rVar2);
                rVar3.b(rVar2.c());
            }
            gVar.f6521b = this.f6521b;
        }
        return gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, k9.u
    public final void close() {
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h d(byte[] bArr, int i10, int i11) {
        J(bArr, i10, i11);
        return this;
    }

    @Override // k9.h
    public final long e(w wVar) {
        h0.u(wVar, "source");
        long j4 = 0;
        while (true) {
            long z9 = wVar.z(this, 8192L);
            if (z9 != -1) {
                j4 += z9;
            } else {
                return j4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                long j4 = this.f6521b;
                g gVar = (g) obj;
                if (j4 == gVar.f6521b) {
                    if (j4 != 0) {
                        r rVar = this.f6520a;
                        h0.q(rVar);
                        r rVar2 = gVar.f6520a;
                        h0.q(rVar2);
                        int i10 = rVar.f6546b;
                        int i11 = rVar2.f6546b;
                        long j10 = 0;
                        while (j10 < this.f6521b) {
                            long min = Math.min(rVar.f6547c - i10, rVar2.f6547c - i11);
                            long j11 = 0;
                            while (j11 < min) {
                                int i12 = i10 + 1;
                                byte b10 = rVar.f6545a[i10];
                                int i13 = i11 + 1;
                                if (b10 == rVar2.f6545a[i11]) {
                                    j11++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == rVar.f6547c) {
                                r rVar3 = rVar.f6550f;
                                h0.q(rVar3);
                                i10 = rVar3.f6546b;
                                rVar = rVar3;
                            }
                            if (i11 == rVar2.f6547c) {
                                rVar2 = rVar2.f6550f;
                                h0.q(rVar2);
                                i11 = rVar2.f6546b;
                            }
                            j10 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f(g gVar, long j4, long j10) {
        h0.u(gVar, "out");
        q6.g.h(this.f6521b, j4, j10);
        if (j10 != 0) {
            gVar.f6521b += j10;
            r rVar = this.f6520a;
            while (true) {
                h0.q(rVar);
                long j11 = rVar.f6547c - rVar.f6546b;
                if (j4 < j11) {
                    break;
                }
                j4 -= j11;
                rVar = rVar.f6550f;
            }
            while (j10 > 0) {
                h0.q(rVar);
                r c6 = rVar.c();
                int i10 = c6.f6546b + ((int) j4);
                c6.f6546b = i10;
                c6.f6547c = Math.min(i10 + ((int) j10), c6.f6547c);
                r rVar2 = gVar.f6520a;
                if (rVar2 == null) {
                    c6.f6551g = c6;
                    c6.f6550f = c6;
                    gVar.f6520a = c6;
                } else {
                    r rVar3 = rVar2.f6551g;
                    h0.q(rVar3);
                    rVar3.b(c6);
                }
                j10 -= c6.f6547c - c6.f6546b;
                rVar = rVar.f6550f;
                j4 = 0;
            }
        }
    }

    @Override // k9.h, k9.u, java.io.Flushable
    public final void flush() {
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h g(long j4) {
        M(j4);
        return this;
    }

    @Override // k9.i
    public final j h(long j4) {
        boolean z9;
        if (j4 >= 0 && j4 <= 2147483647L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f6521b >= j4) {
                if (j4 >= 4096) {
                    j G = G((int) j4);
                    b(j4);
                    return G;
                }
                return new j(v(j4));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a3.g.q("byteCount: ", j4).toString());
    }

    public final int hashCode() {
        r rVar = this.f6520a;
        if (rVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = rVar.f6547c;
            for (int i12 = rVar.f6546b; i12 < i11; i12++) {
                i10 = (i10 * 31) + rVar.f6545a[i12];
            }
            rVar = rVar.f6550f;
            h0.q(rVar);
        } while (rVar != this.f6520a);
        return i10;
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h i(int i10) {
        O(i10);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h j(int i10) {
        N(i10);
        return this;
    }

    @Override // k9.i
    public final String k() {
        return u(Long.MAX_VALUE);
    }

    @Override // k9.i
    public final byte[] l() {
        return v(this.f6521b);
    }

    @Override // k9.i
    public final g m() {
        return this;
    }

    @Override // k9.i
    public final boolean n() {
        if (this.f6521b == 0) {
            return true;
        }
        return false;
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h o(int i10) {
        K(i10);
        return this;
    }

    @Override // k9.h
    public final h p(byte[] bArr) {
        h0.u(bArr, "source");
        J(bArr, 0, bArr.length);
        return this;
    }

    public final byte q(long j4) {
        q6.g.h(this.f6521b, j4, 1L);
        r rVar = this.f6520a;
        if (rVar != null) {
            long j10 = this.f6521b;
            if (j10 - j4 < j4) {
                while (j10 > j4) {
                    rVar = rVar.f6551g;
                    h0.q(rVar);
                    j10 -= rVar.f6547c - rVar.f6546b;
                }
                return rVar.f6545a[(int) ((rVar.f6546b + j4) - j10)];
            }
            long j11 = 0;
            while (true) {
                int i10 = rVar.f6547c;
                int i11 = rVar.f6546b;
                long j12 = (i10 - i11) + j11;
                if (j12 <= j4) {
                    rVar = rVar.f6550f;
                    h0.q(rVar);
                    j11 = j12;
                } else {
                    return rVar.f6545a[(int) ((i11 + j4) - j11)];
                }
            }
        } else {
            h0.q(null);
            throw null;
        }
    }

    public final long r(byte b10, long j4, long j10) {
        r rVar;
        long j11 = 0;
        boolean z9 = false;
        if (0 <= j4 && j4 <= j10) {
            z9 = true;
        }
        if (z9) {
            long j12 = this.f6521b;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j4 == j10 || (rVar = this.f6520a) == null) {
                return -1L;
            }
            if (j12 - j4 < j4) {
                while (j12 > j4) {
                    rVar = rVar.f6551g;
                    h0.q(rVar);
                    j12 -= rVar.f6547c - rVar.f6546b;
                }
                while (j12 < j10) {
                    int min = (int) Math.min(rVar.f6547c, (rVar.f6546b + j10) - j12);
                    for (int i10 = (int) ((rVar.f6546b + j4) - j12); i10 < min; i10++) {
                        if (rVar.f6545a[i10] == b10) {
                            return (i10 - rVar.f6546b) + j12;
                        }
                    }
                    j12 += rVar.f6547c - rVar.f6546b;
                    rVar = rVar.f6550f;
                    h0.q(rVar);
                    j4 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (rVar.f6547c - rVar.f6546b) + j11;
                if (j13 > j4) {
                    break;
                }
                rVar = rVar.f6550f;
                h0.q(rVar);
                j11 = j13;
            }
            while (j11 < j10) {
                int min2 = (int) Math.min(rVar.f6547c, (rVar.f6546b + j10) - j11);
                for (int i11 = (int) ((rVar.f6546b + j4) - j11); i11 < min2; i11++) {
                    if (rVar.f6545a[i11] == b10) {
                        return (i11 - rVar.f6546b) + j11;
                    }
                }
                j11 += rVar.f6547c - rVar.f6546b;
                rVar = rVar.f6550f;
                h0.q(rVar);
                j4 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f6521b + " fromIndex=" + j4 + " toIndex=" + j10).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h0.u(byteBuffer, "sink");
        r rVar = this.f6520a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f6547c - rVar.f6546b);
        byteBuffer.put(rVar.f6545a, rVar.f6546b, min);
        int i10 = rVar.f6546b + min;
        rVar.f6546b = i10;
        this.f6521b -= min;
        if (i10 == rVar.f6547c) {
            this.f6520a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    @Override // k9.i
    public final byte readByte() {
        if (this.f6521b != 0) {
            r rVar = this.f6520a;
            h0.q(rVar);
            int i10 = rVar.f6546b;
            int i11 = rVar.f6547c;
            int i12 = i10 + 1;
            byte b10 = rVar.f6545a[i10];
            this.f6521b--;
            if (i12 == i11) {
                this.f6520a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f6546b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // k9.i
    public final int readInt() {
        if (this.f6521b >= 4) {
            r rVar = this.f6520a;
            h0.q(rVar);
            int i10 = rVar.f6546b;
            int i11 = rVar.f6547c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i12 = i10 + 1;
            byte[] bArr = rVar.f6545a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            this.f6521b -= 4;
            if (i17 == i11) {
                this.f6520a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f6546b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // k9.i
    public final short readShort() {
        if (this.f6521b >= 2) {
            r rVar = this.f6520a;
            h0.q(rVar);
            int i10 = rVar.f6546b;
            int i11 = rVar.f6547c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i12 = i10 + 1;
            byte[] bArr = rVar.f6545a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f6521b -= 2;
            if (i13 == i11) {
                this.f6520a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f6546b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // k9.i
    public final int s(o oVar) {
        h0.u(oVar, "options");
        int b10 = l9.a.b(this, oVar, false);
        if (b10 == -1) {
            return -1;
        }
        b(oVar.f6537a[b10].c());
        return b10;
    }

    public final int t(byte[] bArr, int i10, int i11) {
        h0.u(bArr, "sink");
        q6.g.h(bArr.length, i10, i11);
        r rVar = this.f6520a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i11, rVar.f6547c - rVar.f6546b);
        int i12 = rVar.f6546b;
        x6.i.h1(rVar.f6545a, i10, bArr, i12, i12 + min);
        int i13 = rVar.f6546b + min;
        rVar.f6546b = i13;
        this.f6521b -= min;
        if (i13 == rVar.f6547c) {
            this.f6520a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final String toString() {
        boolean z9;
        long j4 = this.f6521b;
        if (j4 <= 2147483647L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return G((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f6521b).toString());
    }

    @Override // k9.i
    public final String u(long j4) {
        boolean z9;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            long j10 = Long.MAX_VALUE;
            if (j4 != Long.MAX_VALUE) {
                j10 = j4 + 1;
            }
            long r8 = r((byte) 10, 0L, j10);
            if (r8 != -1) {
                return l9.a.a(this, r8);
            }
            if (j10 < this.f6521b && q(j10 - 1) == 13 && q(j10) == 10) {
                return l9.a.a(this, j10);
            }
            g gVar = new g();
            f(gVar, 0L, Math.min(32, this.f6521b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f6521b, j4) + " content=" + gVar.h(gVar.f6521b).d() + (char) 8230);
        }
        throw new IllegalArgumentException(a3.g.q("limit < 0: ", j4).toString());
    }

    public final byte[] v(long j4) {
        boolean z9;
        int i10 = 0;
        if (j4 >= 0 && j4 <= 2147483647L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f6521b >= j4) {
                int i11 = (int) j4;
                byte[] bArr = new byte[i11];
                while (i10 < i11) {
                    int t9 = t(bArr, i10, i11 - i10);
                    if (t9 != -1) {
                        i10 += t9;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a3.g.q("byteCount: ", j4).toString());
    }

    @Override // k9.u
    public final void w(g gVar, long j4) {
        boolean z9;
        boolean z10;
        int i10;
        r rVar;
        boolean z11;
        r b10;
        int i11;
        h0.u(gVar, "source");
        if (gVar != this) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            q6.g.h(gVar.f6521b, 0L, j4);
            while (j4 > 0) {
                r rVar2 = gVar.f6520a;
                h0.q(rVar2);
                int i12 = rVar2.f6547c;
                h0.q(gVar.f6520a);
                if (j4 < i12 - r3.f6546b) {
                    r rVar3 = this.f6520a;
                    if (rVar3 != null) {
                        rVar = rVar3.f6551g;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.f6549e) {
                        long j10 = rVar.f6547c + j4;
                        if (rVar.f6548d) {
                            i11 = 0;
                        } else {
                            i11 = rVar.f6546b;
                        }
                        if (j10 - i11 <= 8192) {
                            r rVar4 = gVar.f6520a;
                            h0.q(rVar4);
                            rVar4.d(rVar, (int) j4);
                            gVar.f6521b -= j4;
                            this.f6521b += j4;
                            return;
                        }
                    }
                    r rVar5 = gVar.f6520a;
                    h0.q(rVar5);
                    int i13 = (int) j4;
                    if (i13 > 0 && i13 <= rVar5.f6547c - rVar5.f6546b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (i13 >= 1024) {
                            b10 = rVar5.c();
                        } else {
                            b10 = s.b();
                            int i14 = rVar5.f6546b;
                            x6.i.h1(rVar5.f6545a, 0, b10.f6545a, i14, i14 + i13);
                        }
                        b10.f6547c = b10.f6546b + i13;
                        rVar5.f6546b += i13;
                        r rVar6 = rVar5.f6551g;
                        h0.q(rVar6);
                        rVar6.b(b10);
                        gVar.f6520a = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                r rVar7 = gVar.f6520a;
                h0.q(rVar7);
                long j11 = rVar7.f6547c - rVar7.f6546b;
                gVar.f6520a = rVar7.a();
                r rVar8 = this.f6520a;
                if (rVar8 == null) {
                    this.f6520a = rVar7;
                    rVar7.f6551g = rVar7;
                    rVar7.f6550f = rVar7;
                } else {
                    r rVar9 = rVar8.f6551g;
                    h0.q(rVar9);
                    rVar9.b(rVar7);
                    r rVar10 = rVar7.f6551g;
                    if (rVar10 != rVar7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        h0.q(rVar10);
                        if (rVar10.f6549e) {
                            int i15 = rVar7.f6547c - rVar7.f6546b;
                            r rVar11 = rVar7.f6551g;
                            h0.q(rVar11);
                            int i16 = 8192 - rVar11.f6547c;
                            r rVar12 = rVar7.f6551g;
                            h0.q(rVar12);
                            if (rVar12.f6548d) {
                                i10 = 0;
                            } else {
                                r rVar13 = rVar7.f6551g;
                                h0.q(rVar13);
                                i10 = rVar13.f6546b;
                            }
                            if (i15 <= i16 + i10) {
                                r rVar14 = rVar7.f6551g;
                                h0.q(rVar14);
                                rVar7.d(rVar14, i15);
                                rVar7.a();
                                s.a(rVar7);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                gVar.f6521b -= j11;
                this.f6521b += j11;
                j4 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h0.u(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            r H = H(1);
            int min = Math.min(i10, 8192 - H.f6547c);
            byteBuffer.get(H.f6545a, H.f6547c, min);
            i10 -= min;
            H.f6547c += min;
        }
        this.f6521b += remaining;
        return remaining;
    }

    public final String x(long j4, Charset charset) {
        boolean z9;
        h0.u(charset, "charset");
        if (j4 >= 0 && j4 <= 2147483647L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f6521b >= j4) {
                if (j4 == 0) {
                    return "";
                }
                r rVar = this.f6520a;
                h0.q(rVar);
                int i10 = rVar.f6546b;
                if (i10 + j4 > rVar.f6547c) {
                    return new String(v(j4), charset);
                }
                int i11 = (int) j4;
                String str = new String(rVar.f6545a, i10, i11, charset);
                int i12 = rVar.f6546b + i11;
                rVar.f6546b = i12;
                this.f6521b -= j4;
                if (i12 == rVar.f6547c) {
                    this.f6520a = rVar.a();
                    s.a(rVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(a3.g.q("byteCount: ", j4).toString());
    }

    @Override // k9.h
    public final /* bridge */ /* synthetic */ h y(j jVar) {
        I(jVar);
        return this;
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
            long j10 = this.f6521b;
            if (j10 == 0) {
                return -1L;
            }
            if (j4 > j10) {
                j4 = j10;
            }
            gVar.w(this, j4);
            return j4;
        }
        throw new IllegalArgumentException(a3.g.q("byteCount < 0: ", j4).toString());
    }
}
