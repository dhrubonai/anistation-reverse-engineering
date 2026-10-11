package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u17 {
    public final String a;
    public final int b;
    public final long c;

    public u17(long j, int i, String str) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u17) {
                u17 u17Var = (u17) obj;
                if (!this.a.equals(u17Var.a) || this.b != u17Var.b || this.c != u17Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return qx1.k(this.c, ")", h11.m(this.b, "CastAudioTrackSelection(mediaContentId=", this.a, ", mediaItemId=", ", trackId="));
    }
}
