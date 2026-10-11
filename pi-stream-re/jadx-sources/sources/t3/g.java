package t3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f10020a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f10021b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f10022c;

    /* renamed from: d, reason: collision with root package name */
    public int f10023d;

    /* renamed from: e, reason: collision with root package name */
    public int f10024e;

    public g(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(h.f10025a)) {
                this.f10020a = fileInputStream;
                this.f10021b = charset;
                this.f10022c = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() {
        int i10;
        synchronized (this.f10020a) {
            byte[] bArr = this.f10022c;
            if (bArr != null) {
                if (this.f10023d >= this.f10024e) {
                    int read = this.f10020a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f10023d = 0;
                        this.f10024e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f10023d; i11 != this.f10024e; i11++) {
                    byte[] bArr2 = this.f10022c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f10023d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f10021b.name());
                                this.f10023d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f10021b.name());
                        this.f10023d = i11 + 1;
                        return str2;
                    }
                }
                f fVar = new f(this, (this.f10024e - this.f10023d) + 80);
                while (true) {
                    byte[] bArr3 = this.f10022c;
                    int i13 = this.f10023d;
                    fVar.write(bArr3, i13, this.f10024e - i13);
                    this.f10024e = -1;
                    byte[] bArr4 = this.f10022c;
                    int read2 = this.f10020a.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f10023d = 0;
                        this.f10024e = read2;
                        for (int i14 = 0; i14 != this.f10024e; i14++) {
                            byte[] bArr5 = this.f10022c;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f10023d;
                                if (i14 != i15) {
                                    fVar.write(bArr5, i15, i14 - i15);
                                }
                                this.f10023d = i14 + 1;
                                return fVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f10020a) {
            if (this.f10022c != null) {
                this.f10022c = null;
                this.f10020a.close();
            }
        }
    }
}
