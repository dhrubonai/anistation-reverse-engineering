package defpackage;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f22 implements WritableByteChannel {
    public final FileOutputStream x;
    public final FileChannel y;

    public f22(FileOutputStream fileOutputStream) {
        this.x = fileOutputStream;
        this.y = fileOutputStream.getChannel();
    }

    public final void a(long j) {
        this.y.position(j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.y.isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.y.write(byteBuffer);
    }
}
