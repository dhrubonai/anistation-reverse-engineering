package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nd6 {
    public static final long b = fy5.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ nd6(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if (g(j) <= g(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (f(j2) <= f(j)) {
            z2 = true;
        }
        return z & z2;
    }

    public static boolean b(long j, Object obj) {
        if (!(obj instanceof nd6) || j != ((nd6) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j) {
        if (((int) (j >> 32)) == ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int e(long j) {
        return f(j) - g(j);
    }

    public static final int f(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int g(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean h(long j) {
        if (((int) (j >> 32)) > ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String i(long j) {
        return qx1.l("TextRange(", (int) (j >> 32), ", ", (int) (j & 4294967295L), ")");
    }

    public final boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
