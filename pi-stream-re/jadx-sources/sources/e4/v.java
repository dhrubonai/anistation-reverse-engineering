package e4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class v extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f3526a;

    /* renamed from: b, reason: collision with root package name */
    public int f3527b;

    /* renamed from: c, reason: collision with root package name */
    public int f3528c;

    /* renamed from: d, reason: collision with root package name */
    public int f3529d;

    /* renamed from: e, reason: collision with root package name */
    public int f3530e;

    /* renamed from: f, reason: collision with root package name */
    public final y3.h f3531f;

    public v(InputStream inputStream, y3.h hVar) {
        super(inputStream);
        this.f3529d = -1;
        this.f3531f = hVar;
        this.f3526a = (byte[]) hVar.d(65536, byte[].class);
    }

    public static void q() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f3529d;
        if (i10 != -1) {
            int i11 = this.f3530e - i10;
            int i12 = this.f3528c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f3527b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3531f.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3526a = bArr2;
                    this.f3531f.h(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f3530e - this.f3529d;
                this.f3530e = i13;
                this.f3529d = 0;
                this.f3527b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f3530e;
                if (read > 0) {
                    i14 += read;
                }
                this.f3527b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f3529d = -1;
            this.f3530e = 0;
            this.f3527b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3526a != null && inputStream != null) {
        } else {
            q();
            throw null;
        }
        return (this.f3527b - this.f3530e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3526a != null) {
            this.f3531f.h(this.f3526a);
            this.f3526a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void f() {
        if (this.f3526a != null) {
            this.f3531f.h(this.f3526a);
            this.f3526a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f3528c = Math.max(this.f3528c, i10);
        this.f3529d = this.f3530e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f3526a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f3530e >= this.f3527b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f3526a && (bArr = this.f3526a) == null) {
                q();
                throw null;
            }
            int i10 = this.f3527b;
            int i11 = this.f3530e;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f3530e = i11 + 1;
            return bArr[i11] & 255;
        }
        q();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f3526a != null) {
            int i10 = this.f3529d;
            if (-1 != i10) {
                this.f3530e = i10;
            } else {
                throw new m1.b("Mark has been invalidated, pos: " + this.f3530e + " markLimit: " + this.f3528c, 3);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j4) {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3526a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f3527b;
                int i11 = this.f3530e;
                if (i10 - i11 >= j4) {
                    this.f3530e = (int) (i11 + j4);
                    return j4;
                }
                long j10 = i10 - i11;
                this.f3530e = i10;
                if (this.f3529d != -1 && j4 <= this.f3528c) {
                    if (a(inputStream, bArr) == -1) {
                        return j10;
                    }
                    int i12 = this.f3527b;
                    int i13 = this.f3530e;
                    if (i12 - i13 >= j4 - j10) {
                        this.f3530e = (int) ((i13 + j4) - j10);
                        return j4;
                    }
                    long j11 = (j10 + i12) - i13;
                    this.f3530e = i12;
                    return j11;
                }
                long skip = inputStream.skip(j4 - j10);
                if (skip > 0) {
                    this.f3529d = -1;
                }
                return j10 + skip;
            }
            q();
            throw null;
        }
        q();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f3526a;
        if (bArr2 == null) {
            q();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f3530e;
            int i15 = this.f3527b;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f3530e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f3529d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f3526a && (bArr2 = this.f3526a) == null) {
                        q();
                        throw null;
                    }
                    int i17 = this.f3527b;
                    int i18 = this.f3530e;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f3530e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            q();
            throw null;
        }
    }
}
