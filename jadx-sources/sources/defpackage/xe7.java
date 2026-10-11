package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xe7 extends ze7 {
    public final byte[] d;
    public int f;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int e = 0;
    public int g = 0;

    public /* synthetic */ xe7(byte[] bArr) {
        this.d = bArr;
    }

    @Override // defpackage.ze7
    public final int A() {
        return M();
    }

    @Override // defpackage.ze7
    public final int B() {
        return M();
    }

    @Override // defpackage.ze7
    public final int C() {
        return J();
    }

    @Override // defpackage.ze7
    public final long D() {
        return K();
    }

    @Override // defpackage.ze7
    public final int E() {
        return ze7.j(M());
    }

    @Override // defpackage.ze7
    public final long F() {
        return ze7.k(H());
    }

    @Override // defpackage.ze7
    public final int G() {
        return M();
    }

    @Override // defpackage.ze7
    public final long H() {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (bArr[i10] << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (bArr[i6] << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 != this.e) {
                this.g = i2 + 1;
                j |= (r5 & Byte.MAX_VALUE) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            } else {
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
        }
        jz7.e("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int J() {
        int i = this.g;
        if (this.e - i >= 4) {
            this.g = i + 4;
            byte[] bArr = this.d;
            int i2 = bArr[i] & 255;
            int i3 = bArr[i + 1] & 255;
            int i4 = bArr[i + 2] & 255;
            return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public final long K() {
        int i = this.g;
        if (this.e - i >= 8) {
            this.g = i + 8;
            byte[] bArr = this.d;
            long j = bArr[i];
            long j2 = bArr[i + 2];
            long j3 = bArr[i + 3];
            long j4 = bArr[i + 4];
            return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0L;
    }

    public final byte[] L(int i) {
        if (i > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.g = i4;
                return Arrays.copyOfRange(this.d, i3, i4);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                return wf7.a;
            }
            jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    public final int M() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) I();
    }

    @Override // defpackage.ze7
    public final int a(int i) {
        if (i >= 0) {
            int i2 = i + this.g;
            if (i2 >= 0) {
                int i3 = this.i;
                if (i2 <= i3) {
                    this.i = i2;
                    int i4 = this.e + this.f;
                    this.e = i4;
                    if (i4 > i2) {
                        int i5 = i4 - i2;
                        this.f = i5;
                        this.e = i4 - i5;
                        return i3;
                    }
                    this.f = 0;
                    return i3;
                }
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            jz7.e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    @Override // defpackage.ze7
    public final void b(int i) {
        this.i = i;
        int i2 = this.e + this.f;
        this.e = i2;
        if (i2 > i) {
            int i3 = i2 - i;
            this.f = i3;
            this.e = i2 - i3;
            return;
        }
        this.f = 0;
    }

    @Override // defpackage.ze7
    public final int c() {
        int i = this.i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }

    @Override // defpackage.ze7
    public final boolean d() {
        if (this.g == this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ze7
    public final int e() {
        return this.g;
    }

    @Override // defpackage.ze7
    public final int f(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 >= 0 && (i | i2) >= 0) {
            if (i2 == 0) {
                return 0;
            }
            int min = Math.min(i2, this.e - this.g);
            if (min == 0) {
                return -1;
            }
            System.arraycopy(this.d, this.g, bArr, i, min);
            this.g += min;
            return min;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ze7
    public final void g(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.ze7
    public final int l() {
        if (d()) {
            this.h = 0;
            return 0;
        }
        int M = M();
        this.h = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        jz7.e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.ze7
    public final void m(int i) {
        if (this.h == i) {
            return;
        }
        jz7.e("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.ze7
    public final boolean n(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                g(4);
                                return true;
                            }
                            p65.p();
                            return false;
                        }
                        if (this.b == 0) {
                            m(0);
                        }
                        return false;
                    }
                    i();
                    m(((i >>> 3) << 3) | 4);
                    return true;
                }
                g(M());
                return true;
            }
            g(8);
            return true;
        }
        int i3 = this.e - this.g;
        byte[] bArr = this.d;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            jz7.e("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.g;
            if (i7 != this.e) {
                this.g = i7 + 1;
                if (bArr[i7] < 0) {
                }
            } else {
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
        }
        jz7.e("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.ze7
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // defpackage.ze7
    public final float p() {
        return Float.intBitsToFloat(J());
    }

    @Override // defpackage.ze7
    public final long q() {
        return H();
    }

    @Override // defpackage.ze7
    public final long r() {
        return H();
    }

    @Override // defpackage.ze7
    public final int s() {
        return M();
    }

    @Override // defpackage.ze7
    public final long t() {
        return K();
    }

    @Override // defpackage.ze7
    public final int u() {
        return J();
    }

    @Override // defpackage.ze7
    public final boolean v() {
        if (H() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ze7
    public final String w() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                String str = new String(this.d, i2, M, StandardCharsets.UTF_8);
                this.g += M;
                return str;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.ze7
    public final String x() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                String d = kh7.d(this.d, i2, M);
                this.g += M;
                return d;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.ze7
    public final ve7 y() {
        int M = M();
        if (M > 0) {
            int i = this.e;
            int i2 = this.g;
            if (M <= i - i2) {
                ve7 k = we7.k(this.d, i2, M);
                this.g += M;
                return k;
            }
        }
        if (M == 0) {
            return we7.y;
        }
        byte[] L = L(M);
        ve7 ve7Var = we7.y;
        if (L.length == 0) {
            return we7.y;
        }
        return new ve7(L);
    }

    @Override // defpackage.ze7
    public final byte[] z() {
        return L(M());
    }
}
