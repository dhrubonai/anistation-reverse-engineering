package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface cb0 extends pq5, WritableByteChannel {
    cb0 U(int i, byte[] bArr);

    cb0 V(String str);

    cb0 b0(long j);

    @Override // defpackage.pq5, java.io.Flushable
    void flush();

    cb0 m0(zd0 zd0Var);

    cb0 write(byte[] bArr);

    cb0 writeByte(int i);

    cb0 writeInt(int i);

    cb0 writeShort(int i);
}
