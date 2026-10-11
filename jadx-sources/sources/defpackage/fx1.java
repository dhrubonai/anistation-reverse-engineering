package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fx1 extends MediaDataSource {
    public long x;
    public final /* synthetic */ kx1 y;

    public fx1(kx1 kx1Var) {
        this.y = kx1Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        kx1 kx1Var = this.y;
        DataInputStream dataInputStream = kx1Var.x;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.x;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        kx1Var.l(j);
                        this.x = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = kx1Var.read(bArr, i, i2);
                if (read >= 0) {
                    this.x += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.x = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
