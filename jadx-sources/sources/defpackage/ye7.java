package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ye7 extends ze7 {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public /* synthetic */ ye7(InputStream inputStream, int i) {
        this.d = inputStream;
        this.e = new byte[i < 8 ? 8 : i];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.ze7
    public final int A() {
        return G();
    }

    @Override // defpackage.ze7
    public final int B() {
        return G();
    }

    @Override // defpackage.ze7
    public final int C() {
        return P();
    }

    @Override // defpackage.ze7
    public final long D() {
        return Q();
    }

    @Override // defpackage.ze7
    public final int E() {
        return ze7.j(G());
    }

    @Override // defpackage.ze7
    public final long F() {
        return ze7.k(H());
    }

    @Override // defpackage.ze7
    public final int G() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) O();
    }

    @Override // defpackage.ze7
    public final long H() {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        return O();
    }

    public final void I() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
            return;
        }
        this.g = 0;
    }

    public final void J(int i) {
        if (!K(i)) {
            if (i > (Integer.MAX_VALUE - this.j) - this.h) {
                jz7.e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            } else {
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
    }

    public final boolean K(int i) {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 > i4) {
            int i5 = this.j;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
                byte[] bArr = this.e;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.j + i2;
                    this.j = i5;
                    i4 = this.f - i2;
                    this.f = i4;
                    this.h = 0;
                }
                try {
                    int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f += read;
                            I();
                            if (this.f >= i || K(i)) {
                                return true;
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                        sb.append(valueOf);
                        sb.append("#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } catch (ag7 e) {
                    e.x = true;
                    throw e;
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 66);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    public final byte[] L(int i) {
        byte[] M = M(i);
        if (M != null) {
            return M;
        }
        int i2 = this.h;
        int i3 = this.f;
        int i4 = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList N = N(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, i4);
        int size = N.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = N.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] M(int i) {
        if (i == 0) {
            return wf7.a;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 <= 0) {
            int i5 = this.k;
            if (i4 <= i5) {
                int i6 = this.f - i3;
                int i7 = i - i6;
                InputStream inputStream = this.d;
                if (i7 >= 4096) {
                    try {
                        if (i7 > inputStream.available()) {
                            return null;
                        }
                    } catch (ag7 e) {
                        e.x = true;
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.e, this.h, bArr, 0, i6);
                this.j += this.f;
                this.h = 0;
                this.f = 0;
                while (i6 < i) {
                    try {
                        int read = inputStream.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.j += read;
                            i6 += read;
                        } else {
                            jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            return null;
                        }
                    } catch (ag7 e2) {
                        e2.x = true;
                        throw e2;
                    }
                }
                return bArr;
            }
            g((i5 - i2) - i3);
            jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        jz7.e("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        return null;
    }

    public final ArrayList N(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.d.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.j += read;
                        i2 += read;
                    } else {
                        jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                } catch (ag7 e) {
                    e.x = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                J(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        jz7.e("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int P() {
        int i = this.h;
        if (this.f - i < 4) {
            J(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long Q() {
        int i = this.h;
        if (this.f - i < 8) {
            J(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.ze7
    public final int a(int i) {
        if (i >= 0) {
            int i2 = this.j + this.h + i;
            if (i2 >= 0) {
                int i3 = this.k;
                if (i2 <= i3) {
                    this.k = i2;
                    I();
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
        this.k = i;
        I();
    }

    @Override // defpackage.ze7
    public final int c() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.j + this.h);
    }

    @Override // defpackage.ze7
    public final boolean d() {
        if (this.h == this.f && !K(1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ze7
    public final int e() {
        return this.j + this.h;
    }

    @Override // defpackage.ze7
    public final int f(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 >= 0 && (i | i2) >= 0) {
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.f;
            int i4 = this.h;
            int i5 = i3 - i4;
            if (i5 > 0) {
                int min = Math.min(i2, i5);
                System.arraycopy(this.e, this.h, bArr, i, min);
                this.h += min;
                return min;
            }
            int min2 = Math.min(i2, (this.k - this.j) - i4);
            if (min2 <= 0) {
                return -1;
            }
            try {
                int read = this.d.read(bArr, i, min2);
                if (read != -1) {
                    this.j += read;
                }
                return read;
            } catch (ag7 e) {
                e.x = true;
                throw e;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ze7
    public final void g(int i) {
        InputStream inputStream = this.d;
        int i2 = this.f;
        int i3 = this.h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        if (i >= 0) {
            int i5 = this.j;
            int i6 = i5 + i3;
            int i7 = this.k;
            if (i6 + i <= i7) {
                this.j = i6;
                this.f = 0;
                this.h = 0;
                while (i4 < i) {
                    long j = i - i4;
                    try {
                        try {
                            long skip = inputStream.skip(j);
                            if (skip >= 0 && skip <= j) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i4 += (int) skip;
                                }
                            } else {
                                String valueOf = String.valueOf(inputStream.getClass());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                                sb.append(valueOf);
                                sb.append("#skip returned invalid result: ");
                                sb.append(skip);
                                sb.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb.toString());
                            }
                        } catch (ag7 e) {
                            e.x = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.j += i4;
                        I();
                        throw th;
                    }
                }
                this.j += i4;
                I();
                if (i4 < i) {
                    int i8 = this.f;
                    int i9 = i8 - this.h;
                    this.h = i8;
                    J(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.f;
                        if (i10 > i11) {
                            i9 += i11;
                            this.h = i11;
                            J(1);
                        } else {
                            this.h = i10;
                            return;
                        }
                    }
                }
            } else {
                g((i7 - i5) - i3);
                jz7.e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // defpackage.ze7
    public final int l() {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int G = G();
        this.i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        jz7.e("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.ze7
    public final void m(int i) {
        if (this.i == i) {
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
                g(G());
                return true;
            }
            g(8);
            return true;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            jz7.e("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                J(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        jz7.e("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.ze7
    public final double o() {
        return Double.longBitsToDouble(Q());
    }

    @Override // defpackage.ze7
    public final float p() {
        return Float.intBitsToFloat(P());
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
        return G();
    }

    @Override // defpackage.ze7
    public final long t() {
        return Q();
    }

    @Override // defpackage.ze7
    public final int u() {
        return P();
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
        int G = G();
        byte[] bArr = this.e;
        if (G > 0) {
            int i = this.f;
            int i2 = this.h;
            if (G <= i - i2) {
                String str = new String(bArr, i2, G, StandardCharsets.UTF_8);
                this.h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G >= 0) {
            if (G <= this.f) {
                J(G);
                String str2 = new String(bArr, this.h, G, StandardCharsets.UTF_8);
                this.h += G;
                return str2;
            }
            return new String(L(G), StandardCharsets.UTF_8);
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // defpackage.ze7
    public final String x() {
        int G = G();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArr = this.e;
        if (G <= i3 && G > 0) {
            this.h = i + G;
        } else {
            if (G == 0) {
                return "";
            }
            if (G >= 0) {
                i = 0;
                if (G <= i2) {
                    J(G);
                    this.h = G;
                } else {
                    bArr = L(G);
                }
            } else {
                jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
        }
        return kh7.d(bArr, i, G);
    }

    @Override // defpackage.ze7
    public final ve7 y() {
        int G = G();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (G <= i3 && G > 0) {
            ve7 k = we7.k(bArr, i2, G);
            this.h += G;
            return k;
        }
        if (G == 0) {
            return we7.y;
        }
        if (G >= 0) {
            byte[] M = M(G);
            if (M != null) {
                return we7.k(M, 0, M.length);
            }
            int i4 = this.h;
            int i5 = this.f;
            int i6 = i5 - i4;
            this.j += i5;
            this.h = 0;
            this.f = 0;
            ArrayList N = N(G - i6);
            byte[] bArr2 = new byte[G];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int size = N.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = N.get(i7);
                i7++;
                byte[] bArr3 = (byte[]) obj;
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i6, length);
                i6 += length;
            }
            try {
                ve7 ve7Var = we7.y;
                if (G == 0) {
                    return we7.y;
                }
                return new ve7(bArr2);
            } catch (ag7 e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // defpackage.ze7
    public final byte[] z() {
        int G = G();
        int i = this.f;
        int i2 = this.h;
        if (G <= i - i2 && G > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.e, i2, i2 + G);
            this.h += G;
            return copyOfRange;
        }
        if (G >= 0) {
            return L(G);
        }
        jz7.e("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }
}
