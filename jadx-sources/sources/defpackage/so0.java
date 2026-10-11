package defpackage;

import com.google.protobuf.t;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class so0 extends t {
    public final ByteBuffer e;
    public final int f;

    public so0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    @Override // com.google.protobuf.t, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.e.position(getTotalBytesWritten() + this.f);
    }
}
