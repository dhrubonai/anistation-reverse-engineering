package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vk4 {
    public final int a;
    public final long b;

    public vk4(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk4)) {
            return false;
        }
        vk4 vk4Var = (vk4) obj;
        if (this.a == vk4Var.a && this.b == vk4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingPlaybackSeek(episodeNumber=" + this.a + ", positionMs=" + this.b + ")";
    }
}
