package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u95 {
    public final long a;
    public final long b;

    public u95(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u95)) {
            return false;
        }
        u95 u95Var = (u95) obj;
        if (this.a == u95Var.a && this.b == u95Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qx1.k(this.b, ")", zo5.n(this.a, "SavedPlaybackTiming(positionMs=", ", durationMs="));
    }
}
