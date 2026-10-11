package com.google.protobuf;

import defpackage.aq6;
import defpackage.nu5;
import defpackage.p65;
import defpackage.qo6;
import defpackage.ro6;
import defpackage.wt5;
import defpackage.yp6;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i2 extends nu5 {
    public static int t(int i, long j, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    qo6 qo6Var = ro6.c;
                    return aq6.e(i, qo6Var.d(j), qo6Var.d(j + 1));
                }
                p65.o();
                return 0;
            }
            return aq6.d(i, ro6.c.d(j));
        }
        nu5 nu5Var = aq6.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int u(long j, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return aq6.e(i, ro6.g(j, bArr), ro6.g(j + 1, bArr));
                }
                p65.o();
                return 0;
            }
            return aq6.d(i, ro6.g(j, bArr));
        }
        nu5 nu5Var = aq6.a;
        if (i > -12) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.nu5
    public final String b(byte[] bArr, int i, int i2) {
        Charset charset = Internal.UTF_8;
        String str = new String(bArr, i, i2, charset);
        if (!str.contains("�") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            return str;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    @Override // defpackage.nu5
    public final String e(ByteBuffer byteBuffer, int i, int i2) {
        long j;
        byte d;
        byte d2;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            long a = ro6.a(byteBuffer) + i;
            long j2 = i2 + a;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (true) {
                j = 1;
                if (a >= j2 || (d2 = ro6.c.d(a)) < 0) {
                    break;
                }
                a++;
                cArr[i3] = (char) d2;
                i3++;
            }
            int i4 = i3;
            while (a < j2) {
                long j3 = a + j;
                qo6 qo6Var = ro6.c;
                byte d3 = qo6Var.d(a);
                if (d3 >= 0) {
                    int i5 = i4 + 1;
                    cArr[i4] = (char) d3;
                    while (j3 < j2 && (d = ro6.c.d(j3)) >= 0) {
                        j3 += j;
                        cArr[i5] = (char) d;
                        i5++;
                    }
                    i4 = i5;
                    a = j3;
                } else if (d3 < -32) {
                    if (j3 < j2) {
                        a += 2;
                        wt5.h(d3, qo6Var.d(j3), cArr, i4);
                        i4++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (d3 < -16) {
                    if (j3 < j2 - j) {
                        long j4 = 2 + a;
                        a += 3;
                        wt5.g(d3, qo6Var.d(j3), qo6Var.d(j4), cArr, i4);
                        i4++;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                } else if (j3 < j2 - 2) {
                    byte d4 = qo6Var.d(j3);
                    long j5 = a + 3;
                    byte d5 = qo6Var.d(2 + a);
                    a += 4;
                    wt5.f(d3, d4, d5, qo6Var.d(j5), cArr, i4);
                    i4 += 2;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                j = 1;
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // defpackage.nu5
    public final int f(String str, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char charAt;
        long j3 = i;
        long j4 = i2 + j3;
        int length = str.length();
        if (length <= i2 && bArr.length - i2 >= i) {
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                    break;
                }
                ro6.o(bArr, j3, (byte) charAt);
                i4++;
                j3 = 1 + j3;
            }
            if (i4 == length) {
                return (int) j3;
            }
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128 && j3 < j4) {
                    ro6.o(bArr, j3, (byte) charAt2);
                    j2 = j;
                    j3 += j;
                } else if (charAt2 < 2048 && j3 <= j4 - 2) {
                    j2 = j;
                    long j5 = j3 + j2;
                    ro6.o(bArr, j3, (byte) ((charAt2 >>> 6) | 960));
                    j3 += 2;
                    ro6.o(bArr, j5, (byte) ((charAt2 & '?') | 128));
                } else {
                    j2 = j;
                    if ((charAt2 < 55296 || 57343 < charAt2) && j3 <= j4 - 3) {
                        ro6.o(bArr, j3, (byte) ((charAt2 >>> '\f') | 480));
                        long j6 = 2 + j3;
                        ro6.o(bArr, j3 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 += 3;
                        ro6.o(bArr, j6, (byte) ((charAt2 & '?') | 128));
                    } else {
                        if (j3 <= j4 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = str.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    ro6.o(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                    ro6.o(bArr, j3 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j7 = j3 + 3;
                                    ro6.o(bArr, 2 + j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 += 4;
                                    ro6.o(bArr, j7, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new yp6(i4 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new yp6(i4, length);
                        }
                        p65.d(charAt2, j3);
                        return 0;
                    }
                }
                i4++;
                j = j2;
            }
            return (int) j3;
        }
        p65.c(str.charAt(length - 1), i + i2);
        return 0;
    }

    @Override // defpackage.nu5
    public final void h(String str, ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        int i;
        char charAt;
        long a = ro6.a(byteBuffer);
        long position = byteBuffer.position() + a;
        long limit = byteBuffer.limit() + a;
        int length = str.length();
        if (length <= limit - position) {
            int i2 = 0;
            while (true) {
                j = 1;
                if (i2 >= length || (charAt = str.charAt(i2)) >= 128) {
                    break;
                }
                ro6.n(position, (byte) charAt);
                i2++;
                position = 1 + position;
            }
            if (i2 == length) {
                byteBuffer.position((int) (position - a));
                return;
            }
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128 && position < limit) {
                    ro6.n(position, (byte) charAt2);
                    j3 = a;
                    j2 = j;
                    position += j;
                } else if (charAt2 < 2048 && position <= limit - 2) {
                    j2 = j;
                    long j4 = position + j2;
                    ro6.n(position, (byte) ((charAt2 >>> 6) | 960));
                    position += 2;
                    ro6.n(j4, (byte) ((charAt2 & '?') | 128));
                    j3 = a;
                } else {
                    j2 = j;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || position > limit - 3) {
                        j3 = a;
                        if (position <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt3 = str.charAt(i3);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    ro6.n(position, (byte) ((codePoint >>> 18) | 240));
                                    ro6.n(position + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = position + 3;
                                    ro6.n(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    position += 4;
                                    ro6.n(j5, (byte) ((codePoint & 63) | 128));
                                    i2 = i3;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new yp6(i2 - 1, length);
                        }
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i)))) {
                            throw new yp6(i2, length);
                        }
                        p65.d(charAt2, position);
                        return;
                    }
                    ro6.n(position, (byte) ((charAt2 >>> '\f') | 480));
                    long j6 = position + 2;
                    j3 = a;
                    ro6.n(position + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                    position += 3;
                    ro6.n(j6, (byte) ((charAt2 & '?') | 128));
                }
                i2++;
                j = j2;
                a = j3;
            }
            byteBuffer.position((int) (position - a));
            return;
        }
        p65.c(str.charAt(length - 1), byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0069, code lost:
    
        if (defpackage.ro6.g(r4, r25) > (-65)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (defpackage.ro6.g(r4, r25) > (-65)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00b0, code lost:
    
        if (defpackage.ro6.g(r4, r25) > (-65)) goto L54;
     */
    @Override // defpackage.nu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(int r22, int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i2.l(int, int, int, byte[]):int");
    }

    @Override // defpackage.nu5
    public final int o(ByteBuffer byteBuffer, int i, int i2, int i3) {
        long j;
        byte b;
        int i4;
        byte b2;
        long j2;
        if ((i2 | i3 | (byteBuffer.limit() - i3)) >= 0) {
            long a = ro6.a(byteBuffer) + i2;
            long j3 = (i3 - i2) + a;
            if (i != 0) {
                if (a >= j3) {
                    return i;
                }
                b = 0;
                byte b3 = (byte) i;
                if (b3 < -32) {
                    if (b3 >= -62) {
                        j2 = a + 1;
                        if (ro6.c.d(a) > -65) {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else if (b3 < -16) {
                    byte b4 = (byte) (~(i >> 8));
                    if (b4 == 0) {
                        long j4 = a + 1;
                        b4 = ro6.c.d(a);
                        if (j4 >= j3) {
                            return aq6.d(b3, b4);
                        }
                        a = j4;
                    }
                    if (b4 <= -65) {
                        if (b3 != -32 || b4 >= -96) {
                            if (b3 != -19 || b4 < -96) {
                                j2 = a + 1;
                                if (ro6.c.d(a) > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    j = 1;
                    byte b5 = (byte) (~(i >> 8));
                    if (b5 == 0) {
                        long j5 = a + 1;
                        byte d = ro6.c.d(a);
                        if (j5 >= j3) {
                            return aq6.d(b3, d);
                        }
                        a = j5;
                        b5 = d;
                        b2 = 0;
                    } else {
                        b2 = (byte) (i >> 16);
                    }
                    if (b2 == 0) {
                        long j6 = a + 1;
                        b2 = ro6.c.d(a);
                        if (j6 >= j3) {
                            return aq6.e(b3, b5, b2);
                        }
                        a = j6;
                    }
                    if (b5 <= -65) {
                        if ((((b5 + 112) + (b3 << 28)) >> 30) == 0 && b2 <= -65) {
                            long j7 = a + 1;
                            if (ro6.c.d(a) <= -65) {
                                a = j7;
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
                j = 1;
                a = j2;
            } else {
                j = 1;
                b = 0;
            }
            int i5 = (int) (j3 - a);
            if (i5 < 16) {
                i4 = b;
            } else {
                int i6 = (int) ((-a) & 7);
                int i7 = i6;
                long j8 = a;
                while (true) {
                    if (i7 > 0) {
                        long j9 = j8 + j;
                        if (ro6.c.d(j8) < 0) {
                            i4 = i6 - i7;
                            break;
                        }
                        i7--;
                        j8 = j9;
                    } else {
                        int i8 = i5 - i6;
                        while (i8 >= 8 && (ro6.c.h(j8) & (-9187201950435737472L)) == 0) {
                            j8 += 8;
                            i8 -= 8;
                        }
                        i4 = i5 - i8;
                    }
                }
            }
            long j10 = a + i4;
            int i9 = i5 - i4;
            while (true) {
                byte b6 = b;
                while (true) {
                    if (i9 <= 0) {
                        break;
                    }
                    long j11 = j10 + j;
                    b6 = ro6.c.d(j10);
                    if (b6 >= 0) {
                        i9--;
                        j10 = j11;
                    } else {
                        j10 = j11;
                        break;
                    }
                }
                if (i9 == 0) {
                    return b;
                }
                int i10 = i9 - 1;
                if (b6 < -32) {
                    if (i10 == 0) {
                        return b6;
                    }
                    i9 -= 2;
                    if (b6 >= -62) {
                        long j12 = j10 + j;
                        if (ro6.c.d(j10) <= -65) {
                            j10 = j12;
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else if (b6 < -16) {
                    if (i10 < 2) {
                        return t(b6, j10, i10);
                    }
                    i9 -= 3;
                    long j13 = j10 + j;
                    qo6 qo6Var = ro6.c;
                    byte d2 = qo6Var.d(j10);
                    if (d2 <= -65) {
                        if (b6 != -32 || d2 >= -96) {
                            if (b6 != -19 || d2 < -96) {
                                j10 += 2;
                                if (qo6Var.d(j13) > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                } else {
                    if (i10 < 3) {
                        return t(b6, j10, i10);
                    }
                    i9 -= 4;
                    long j14 = j10 + j;
                    qo6 qo6Var2 = ro6.c;
                    byte d3 = qo6Var2.d(j10);
                    if (d3 <= -65) {
                        if ((((d3 + 112) + (b6 << 28)) >> 30) == 0) {
                            long j15 = 2 + j10;
                            if (qo6Var2.d(j14) <= -65) {
                                j10 += 3;
                                if (qo6Var2.d(j15) > -65) {
                                    return -1;
                                }
                            } else {
                                return -1;
                            }
                        } else {
                            return -1;
                        }
                    } else {
                        return -1;
                    }
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }
}
