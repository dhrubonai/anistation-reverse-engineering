package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class og1 extends ea1 {
    public final char C;

    /* JADX WARN: Multi-variable type inference failed */
    public og1(int i, int i2) {
        super(i);
        this.C = i2;
    }

    @Override // defpackage.ea1
    public final Object a(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // defpackage.ea1
    public final Object l() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.C);
        allocateDirect.getClass();
        return allocateDirect;
    }

    @Override // defpackage.ea1
    public final void q(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.getClass();
        if (byteBuffer.capacity() == this.C) {
            if (byteBuffer.isDirect()) {
                return;
            }
            ze0.m("Check failed.");
            return;
        }
        ze0.m("Check failed.");
    }
}
