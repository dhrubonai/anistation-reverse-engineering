package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d41 implements Closeable {
    public nw4 A;
    public nw4 B;
    public nw4 x;
    public l03 y;
    public nw4 z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((l85) this.A.get()).close();
    }
}
