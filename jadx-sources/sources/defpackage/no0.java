package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class no0 extends po0 {
    public int A;
    public int B;
    public int C;
    public final int D;
    public int E;
    public int F = Integer.MAX_VALUE;
    public final byte[] z;

    public no0(byte[] bArr, int i, int i2, boolean z) {
        this.z = bArr;
        this.A = i2 + i;
        this.C = i;
        this.D = i;
    }

    @Override // defpackage.po0
    public final int A() {
        return H();
    }

    @Override // defpackage.po0
    public final long B() {
        return I();
    }

    @Override // defpackage.po0
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            L(4);
                            return true;
                        }
                        throw b33.b();
                    }
                    D();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                L(H());
                return true;
            }
            L(8);
            return true;
        }
        int i4 = this.A - this.C;
        byte[] bArr = this.z;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.C;
                this.C = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw b33.c();
        }
        while (i3 < 10) {
            int i6 = this.C;
            if (i6 != this.A) {
                this.C = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            } else {
                throw b33.e();
            }
        }
        throw b33.c();
        return true;
    }

    public final int F() {
        int i = this.C;
        if (this.A - i >= 4) {
            this.C = i + 4;
            byte[] bArr = this.z;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw b33.e();
    }

    public final long G() {
        int i = this.C;
        if (this.A - i >= 8) {
            this.C = i + 8;
            byte[] bArr = this.z;
            return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
        }
        throw b33.e();
    }

    public final int H() {
        int i;
        int i2 = this.C;
        int i3 = this.A;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.z;
            byte b = bArr[i2];
            if (b >= 0) {
                this.C = i4;
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
                this.C = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.C;
        int i2 = this.A;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.z;
            byte b = bArr[i];
            if (b >= 0) {
                this.C = i3;
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
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.C = i4;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.C;
            if (i2 != this.A) {
                this.C = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.z[i2] & 128) == 0) {
                    return j;
                }
            } else {
                throw b33.e();
            }
        }
        throw b33.c();
    }

    public final void K() {
        int i = this.A + this.B;
        this.A = i;
        int i2 = i - this.D;
        int i3 = this.F;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.B = i4;
            this.A = i - i4;
            return;
        }
        this.B = 0;
    }

    public final void L(int i) {
        if (i >= 0) {
            int i2 = this.A;
            int i3 = this.C;
            if (i <= i2 - i3) {
                this.C = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw b33.d();
        }
        throw b33.e();
    }

    @Override // defpackage.po0
    public final void a(int i) {
        if (this.E == i) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.po0
    public final int b() {
        return this.C - this.D;
    }

    @Override // defpackage.po0
    public final boolean c() {
        if (this.C == this.A) {
            return true;
        }
        return false;
    }

    @Override // defpackage.po0
    public final void h(int i) {
        this.F = i;
        K();
    }

    @Override // defpackage.po0
    public final int j(int i) {
        if (i >= 0) {
            int b = b() + i;
            if (b >= 0) {
                int i2 = this.F;
                if (b <= i2) {
                    this.F = b;
                    K();
                    return i2;
                }
                throw b33.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw b33.d();
    }

    @Override // defpackage.po0
    public final boolean k() {
        if (I() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.po0
    public final xd0 l() {
        byte[] bArr;
        int H = H();
        byte[] bArr2 = this.z;
        if (H > 0) {
            int i = this.A;
            int i2 = this.C;
            if (H <= i - i2) {
                xd0 d = xd0.d(bArr2, i2, H);
                this.C += H;
                return d;
            }
        }
        if (H == 0) {
            return xd0.z;
        }
        if (H > 0) {
            int i3 = this.A;
            int i4 = this.C;
            if (H <= i3 - i4) {
                int i5 = H + i4;
                this.C = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                xd0 xd0Var = xd0.z;
                return new xd0(bArr);
            }
        }
        if (H <= 0) {
            if (H == 0) {
                bArr = y13.b;
                xd0 xd0Var2 = xd0.z;
                return new xd0(bArr);
            }
            throw b33.d();
        }
        throw b33.e();
    }

    @Override // defpackage.po0
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // defpackage.po0
    public final int n() {
        return H();
    }

    @Override // defpackage.po0
    public final int o() {
        return F();
    }

    @Override // defpackage.po0
    public final long p() {
        return G();
    }

    @Override // defpackage.po0
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // defpackage.po0
    public final int r() {
        return H();
    }

    @Override // defpackage.po0
    public final long s() {
        return I();
    }

    @Override // defpackage.po0
    public final int t() {
        return F();
    }

    @Override // defpackage.po0
    public final long u() {
        return G();
    }

    @Override // defpackage.po0
    public final int v() {
        int H = H();
        return (-(H & 1)) ^ (H >>> 1);
    }

    @Override // defpackage.po0
    public final long w() {
        long I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // defpackage.po0
    public final String x() {
        int H = H();
        if (H > 0) {
            int i = this.A;
            int i2 = this.C;
            if (H <= i - i2) {
                String str = new String(this.z, i2, H, y13.a);
                this.C += H;
                return str;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H < 0) {
            throw b33.d();
        }
        throw b33.e();
    }

    @Override // defpackage.po0
    public final String y() {
        int H = H();
        if (H > 0) {
            int i = this.A;
            int i2 = this.C;
            if (H <= i - i2) {
                String c = bq6.a.c(this.z, i2, H);
                this.C += H;
                return c;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H <= 0) {
            throw b33.d();
        }
        throw b33.e();
    }

    @Override // defpackage.po0
    public final int z() {
        if (c()) {
            this.E = 0;
            return 0;
        }
        int H = H();
        this.E = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
