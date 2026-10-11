package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface gc4 extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    default void close() {
        dispose();
    }

    void dispose();

    void i0(Object obj);

    Object y();
}
