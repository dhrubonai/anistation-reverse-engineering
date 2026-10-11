package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kx1 extends gx1 {
    public kx1(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.x.mark(Integer.MAX_VALUE);
        } else {
            ze0.k("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void l(long j) {
        int i = this.y;
        if (i > j) {
            this.y = 0;
            this.x.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public kx1(byte[] bArr) {
        super(bArr);
        this.x.mark(Integer.MAX_VALUE);
    }
}
