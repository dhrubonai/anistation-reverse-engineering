package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface gl {
    boolean b();

    long c();

    tk6 d();

    rl e(long j);

    default boolean f(long j) {
        if (j >= c()) {
            return true;
        }
        return false;
    }

    Object g(long j);

    Object h();
}
