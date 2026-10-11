package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hp6 extends UploadDataProvider {
    public volatile FileChannel x;
    public final gp6 y;
    public final Object z = new Object();

    public hp6(gp6 gp6Var) {
        this.y = gp6Var;
    }

    public final FileChannel a() {
        if (this.x == null) {
            synchronized (this.z) {
                try {
                    if (this.x == null) {
                        this.x = this.y.l();
                    }
                } finally {
                }
            }
        }
        return this.x;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.x;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            FileChannel a = a();
            int i = 0;
            while (i == 0) {
                int read = a.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        ze0.m("Cronet passed a buffer with no bytes remaining");
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
