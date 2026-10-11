package k9;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface i extends w, ReadableByteChannel {
    void A(long j4);

    long D();

    String E(Charset charset);

    f F();

    void b(long j4);

    j h(long j4);

    String k();

    byte[] l();

    g m();

    boolean n();

    byte readByte();

    int readInt();

    short readShort();

    int s(o oVar);

    String u(long j4);
}
