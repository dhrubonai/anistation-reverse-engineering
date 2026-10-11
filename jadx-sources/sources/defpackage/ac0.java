package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ac0 implements bv5 {
    public final ByteBuffer x;
    public final int y;

    public ac0(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.x = slice;
        this.y = slice.capacity();
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return of6.d;
    }

    @Override // defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        ByteBuffer byteBuffer = this.x;
        int position = byteBuffer.position();
        int i = this.y;
        if (position == i) {
            return -1L;
        }
        int position2 = (int) (byteBuffer.position() + j);
        if (position2 <= i) {
            i = position2;
        }
        byteBuffer.limit(i);
        return pa0Var.write(byteBuffer);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
