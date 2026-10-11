package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class q61 extends qa0 {
    public final x21 A = new x21();
    public ByteBuffer B;
    public boolean C;
    public long D;
    public ByteBuffer E;
    public final byte F;
    public ea2 z;

    static {
        cr3.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q61(int i) {
        this.F = i;
    }

    public void f() {
        this.y = 0;
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.E;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.C = false;
    }

    public final ByteBuffer i(int i) {
        int capacity;
        byte b = this.F;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException(qx1.l("Buffer too small (", capacity, " < ", i, ")"));
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer == null) {
            this.B = i(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.B = byteBuffer;
            return;
        }
        ByteBuffer i3 = i(i2);
        i3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i3.put(byteBuffer);
        }
        this.B = i3;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.E;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
