package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mx1 extends InputStream {
    public final InputStream x;
    public int y = 1073741824;

    public mx1(InputStream inputStream) {
        this.x = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.y;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.x.read();
        if (read == -1) {
            this.y = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.x.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.x.read(bArr);
        if (read == -1) {
            this.y = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.x.read(bArr, i, i2);
        if (read == -1) {
            this.y = 0;
        }
        return read;
    }
}
