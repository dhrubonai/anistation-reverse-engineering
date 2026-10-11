package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xm1 {
    public final long a;

    public static String a(long j) {
        if (j != 9205357640488583168L) {
            return qx1.n("(", vm1.d(Float.intBitsToFloat((int) (j >> 32))), ", ", vm1.d(Float.intBitsToFloat((int) (j & 4294967295L))), ")");
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xm1) {
            if (this.a != ((xm1) obj).a) {
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
        return a(this.a);
    }
}
