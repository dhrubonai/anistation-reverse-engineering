package p4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f8555a;

    /* renamed from: b, reason: collision with root package name */
    public int f8556b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f8555a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8555a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f8556b = this.f8555a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f8555a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.f8556b;
        if (i10 != -1) {
            this.f8555a.position(i10);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j4) {
        ByteBuffer byteBuffer = this.f8555a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j4, available());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f8555a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, available());
        byteBuffer.get(bArr, i10, min);
        return min;
    }
}
