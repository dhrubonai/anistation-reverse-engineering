package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fe7 implements Closeable {
    public static final qf y = new qf(4);
    public int x;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.x;
        if (i > 0) {
            this.x = i - 1;
            return;
        }
        throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
    }
}
