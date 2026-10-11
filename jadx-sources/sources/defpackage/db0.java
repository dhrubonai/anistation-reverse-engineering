package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface db0 extends bv5, ReadableByteChannel {
    int F(lg4 lg4Var);

    String K(long j);

    long S(cb0 cb0Var);

    String Z(Charset charset);

    pa0 c();

    String e0();

    boolean g(long j);

    void m(long j);

    boolean r(long j, zd0 zd0Var);

    long r0();

    byte readByte();

    int readInt();

    short readShort();

    zd0 s(long j);

    void skip(long j);

    InputStream t0();

    byte[] z();
}
