package d1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f3045a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    boolean b();

    void f();

    void flush();

    ByteBuffer g();

    void h();

    void i(ByteBuffer byteBuffer);

    b j(b bVar);
}
