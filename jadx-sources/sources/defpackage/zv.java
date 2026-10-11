package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface zv {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean d();

    ByteBuffer e();

    void f(xv xvVar);

    void g(ByteBuffer byteBuffer);

    vv h(vv vvVar);

    void i();

    boolean isActive();

    void reset();

    default long j(long j) {
        return j;
    }
}
