package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface bh6 {
    void a(long j, int i, int i2, int i3, ah6 ah6Var);

    void b(zi4 zi4Var, int i, int i2);

    int c(m41 m41Var, int i, boolean z);

    default void e(int i, zi4 zi4Var) {
        b(zi4Var, i, 0);
    }

    default int f(m41 m41Var, int i, boolean z) {
        return c(m41Var, i, z);
    }

    void g(ea2 ea2Var);

    default void d(long j) {
    }
}
