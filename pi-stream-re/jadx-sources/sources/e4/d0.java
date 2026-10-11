package e4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d0 extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f3479a;

    public d0(ByteBuffer byteBuffer) {
        this.f3479a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f3479a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f3479a;
        if (j4 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j4);
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }
}
