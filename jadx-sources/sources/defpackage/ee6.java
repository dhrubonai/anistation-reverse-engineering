package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ee6 {
    public static final fe6[] b = {new fe6(0), new fe6(4294967296L), new fe6(8589934592L)};
    public static final long c = hz5.h(Float.NaN, 0);
    public final long a;

    public /* synthetic */ ee6(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (fe6.a(b2, 0L)) {
            return "Unspecified";
        }
        if (fe6.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (fe6.a(b2, 8589934592L)) {
            return c(j) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ee6) {
            if (this.a != ((ee6) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
