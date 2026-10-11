package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v17 {
    public final int a;
    public final boolean b;

    public v17(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v17)) {
            return false;
        }
        v17 v17Var = (v17) obj;
        if (this.a == v17Var.a && this.b == v17Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CastFallbackScope(episodeNumber=" + this.a + ", dubEnabled=" + this.b + ")";
    }
}
