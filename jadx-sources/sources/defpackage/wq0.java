package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class wq0 {
    public static final uq0 a = new Object();
    public static final vq0 b = new vq0(-1);
    public static final vq0 c = new vq0(1);

    public wq0 a(int i, int i2) {
        return uq0.g(Integer.compare(i, i2));
    }

    public wq0 b(long j, long j2) {
        return uq0.g(Long.compare(j, j2));
    }

    public wq0 c(Object obj, Object obj2, Comparator comparator) {
        return uq0.g(comparator.compare(obj, obj2));
    }

    public wq0 d(boolean z, boolean z2) {
        return uq0.g(Boolean.compare(z, z2));
    }

    public wq0 e(boolean z, boolean z2) {
        return uq0.g(Boolean.compare(z2, z));
    }

    public int f() {
        return 0;
    }
}
