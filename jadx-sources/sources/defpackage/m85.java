package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface m85 extends AutoCloseable {
    void J(int i, String str);

    default boolean M() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }

    void b(int i, double d);

    String c0(int i);

    void e(int i, long j);

    void f(int i, byte[] bArr);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    void h(int i);

    boolean isNull(int i);

    void k();

    boolean p0();

    void reset();
}
