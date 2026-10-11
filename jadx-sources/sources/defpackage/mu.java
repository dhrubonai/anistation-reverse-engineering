package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mu extends OutputStream {
    public final FileOutputStream x;
    public boolean y = false;

    public mu(File file) {
        this.x = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.x;
        if (this.y) {
            return;
        }
        this.y = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            kb0.P("AtomicFile", "Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.x.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.x.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.x.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.x.write(bArr, i, i2);
    }
}
