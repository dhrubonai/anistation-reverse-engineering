package k9;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface h extends u, WritableByteChannel {
    h B(String str);

    h C(long j4);

    h d(byte[] bArr, int i10, int i11);

    long e(w wVar);

    @Override // k9.u, java.io.Flushable
    void flush();

    h g(long j4);

    h i(int i10);

    h j(int i10);

    h o(int i10);

    h p(byte[] bArr);

    h y(j jVar);
}
