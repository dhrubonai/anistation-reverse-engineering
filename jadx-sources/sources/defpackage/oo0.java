package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oo0 extends po0 {
    public final byte[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G = Integer.MAX_VALUE;
    public final FileInputStream z;

    public oo0(FileInputStream fileInputStream) {
        Charset charset = y13.a;
        this.z = fileInputStream;
        this.A = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        this.B = 0;
        this.D = 0;
        this.F = 0;
    }

    @Override // defpackage.po0
    public final int A() {
        return K();
    }

    @Override // defpackage.po0
    public final long B() {
        return L();
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
                            P(4);
                            return true;
                        }
                        throw b33.b();
                    }
                    D();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                P(K());
                return true;
            }
            P(8);
            return true;
        }
        int i4 = this.B - this.D;
        byte[] bArr = this.A;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.D;
                this.D = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw b33.c();
        }
        while (i3 < 10) {
            if (this.D == this.B) {
                O(1);
            }
            int i6 = this.D;
            this.D = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw b33.c();
        return true;
    }

    public final byte[] F(int i) {
        byte[] G = G(i);
        if (G != null) {
            return G;
        }
        int i2 = this.D;
        int i3 = this.B;
        int i4 = i3 - i2;
        this.F += i3;
        this.D = 0;
        this.B = 0;
        ArrayList H = H(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.A, i2, bArr, 0, i4);
        int size = H.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = H.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) {
        if (i == 0) {
            return y13.b;
        }
        if (i >= 0) {
            int i2 = this.F;
            int i3 = this.D;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = this.G;
                if (i4 <= i5) {
                    int i6 = this.B - i3;
                    int i7 = i - i6;
                    FileInputStream fileInputStream = this.z;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > fileInputStream.available()) {
                                return null;
                            }
                        } catch (b33 e) {
                            e.x = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.A, this.D, bArr, 0, i6);
                    this.F += this.B;
                    this.D = 0;
                    this.B = 0;
                    while (i6 < i) {
                        try {
                            int read = fileInputStream.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.F += read;
                                i6 += read;
                            } else {
                                throw b33.e();
                            }
                        } catch (b33 e2) {
                            e2.x = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                P((i5 - i2) - i3);
                throw b33.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw b33.d();
    }

    public final ArrayList H(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.z.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.F += read;
                    i2 += read;
                } else {
                    throw b33.e();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() {
        int i = this.D;
        if (this.B - i < 4) {
            O(4);
            i = this.D;
        }
        this.D = i + 4;
        byte[] bArr = this.A;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() {
        int i = this.D;
        if (this.B - i < 8) {
            O(8);
            i = this.D;
        }
        this.D = i + 8;
        byte[] bArr = this.A;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int K() {
        int i;
        int i2 = this.D;
        int i3 = this.B;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.A;
            byte b = bArr[i2];
            if (b >= 0) {
                this.D = i4;
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
                this.D = i5;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.D;
        int i2 = this.B;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.A;
            byte b = bArr[i];
            if (b >= 0) {
                this.D = i3;
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
                this.D = i4;
                return j;
            }
        }
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.D == this.B) {
                O(1);
            }
            int i2 = this.D;
            this.D = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.A[i2] & 128) == 0) {
                return j;
            }
        }
        throw b33.c();
    }

    public final void N() {
        int i = this.B + this.C;
        this.B = i;
        int i2 = this.F + i;
        int i3 = this.G;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.C = i4;
            this.B = i - i4;
            return;
        }
        this.C = 0;
    }

    public final void O(int i) {
        if (!Q(i)) {
            if (i > (Integer.MAX_VALUE - this.F) - this.D) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw b33.e();
        }
    }

    public final void P(int i) {
        int i2 = this.B;
        int i3 = this.D;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.D = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.z;
        if (i >= 0) {
            int i5 = this.F;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.G;
            if (i7 <= i8) {
                this.F = i6;
                this.B = 0;
                this.D = 0;
                while (i4 < i) {
                    long j = i - i4;
                    try {
                        try {
                            long skip = fileInputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i4 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (b33 e) {
                            e.x = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.F += i4;
                        N();
                        throw th;
                    }
                }
                this.F += i4;
                N();
                if (i4 < i) {
                    int i9 = this.B;
                    int i10 = i9 - this.D;
                    this.D = i9;
                    O(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.B;
                        if (i11 > i12) {
                            i10 += i12;
                            this.D = i12;
                            O(1);
                        } else {
                            this.D = i11;
                            return;
                        }
                    }
                }
            } else {
                P((i8 - i5) - i3);
                throw b33.e();
            }
        } else {
            throw b33.d();
        }
    }

    public final boolean Q(int i) {
        FileInputStream fileInputStream = this.z;
        int i2 = this.D;
        int i3 = i2 + i;
        int i4 = this.B;
        if (i3 > i4) {
            int i5 = this.F;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.G) {
                byte[] bArr = this.A;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.F + i2;
                    this.F = i5;
                    i4 = this.B - i2;
                    this.B = i4;
                    this.D = 0;
                }
                try {
                    int read = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.B += read;
                            N();
                            if (this.B >= i) {
                                return true;
                            }
                            return Q(i);
                        }
                    } else {
                        throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (b33 e) {
                    e.x = true;
                    throw e;
                }
            }
            return false;
        }
        ze0.m(qx1.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
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
        return this.F + this.D;
    }

    @Override // defpackage.po0
    public final boolean c() {
        if (this.D == this.B && !Q(1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.po0
    public final void h(int i) {
        this.G = i;
        N();
    }

    @Override // defpackage.po0
    public final int j(int i) {
        if (i >= 0) {
            int i2 = this.F + this.D + i;
            if (i2 >= 0) {
                int i3 = this.G;
                if (i2 <= i3) {
                    this.G = i2;
                    N();
                    return i3;
                }
                throw b33.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw b33.d();
    }

    @Override // defpackage.po0
    public final boolean k() {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.po0
    public final xd0 l() {
        int K = K();
        int i = this.B;
        int i2 = this.D;
        int i3 = i - i2;
        byte[] bArr = this.A;
        if (K <= i3 && K > 0) {
            xd0 d = xd0.d(bArr, i2, K);
            this.D += K;
            return d;
        }
        if (K == 0) {
            return xd0.z;
        }
        if (K >= 0) {
            byte[] G = G(K);
            if (G != null) {
                return xd0.d(G, 0, G.length);
            }
            int i4 = this.D;
            int i5 = this.B;
            int i6 = i5 - i4;
            this.F += i5;
            this.D = 0;
            this.B = 0;
            ArrayList H = H(K - i6);
            byte[] bArr2 = new byte[K];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int size = H.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = H.get(i7);
                i7++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                i6 += bArr3.length;
            }
            xd0 xd0Var = xd0.z;
            return new xd0(bArr2);
        }
        throw b33.d();
    }

    @Override // defpackage.po0
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.po0
    public final int n() {
        return K();
    }

    @Override // defpackage.po0
    public final int o() {
        return I();
    }

    @Override // defpackage.po0
    public final long p() {
        return J();
    }

    @Override // defpackage.po0
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // defpackage.po0
    public final int r() {
        return K();
    }

    @Override // defpackage.po0
    public final long s() {
        return L();
    }

    @Override // defpackage.po0
    public final int t() {
        return I();
    }

    @Override // defpackage.po0
    public final long u() {
        return J();
    }

    @Override // defpackage.po0
    public final int v() {
        int K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }

    @Override // defpackage.po0
    public final long w() {
        long L = L();
        return (-(L & 1)) ^ (L >>> 1);
    }

    @Override // defpackage.po0
    public final String x() {
        int K = K();
        byte[] bArr = this.A;
        if (K > 0) {
            int i = this.B;
            int i2 = this.D;
            if (K <= i - i2) {
                String str = new String(bArr, i2, K, y13.a);
                this.D += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K >= 0) {
            if (K <= this.B) {
                O(K);
                String str2 = new String(bArr, this.D, K, y13.a);
                this.D += K;
                return str2;
            }
            return new String(F(K), y13.a);
        }
        throw b33.d();
    }

    @Override // defpackage.po0
    public final String y() {
        int K = K();
        int i = this.D;
        int i2 = this.B;
        int i3 = i2 - i;
        byte[] bArr = this.A;
        if (K <= i3 && K > 0) {
            this.D = i + K;
        } else {
            if (K == 0) {
                return "";
            }
            if (K >= 0) {
                i = 0;
                if (K <= i2) {
                    O(K);
                    this.D = K;
                } else {
                    bArr = F(K);
                }
            } else {
                throw b33.d();
            }
        }
        return bq6.a.c(bArr, i, K);
    }

    @Override // defpackage.po0
    public final int z() {
        if (c()) {
            this.E = 0;
            return 0;
        }
        int K = K();
        this.E = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
