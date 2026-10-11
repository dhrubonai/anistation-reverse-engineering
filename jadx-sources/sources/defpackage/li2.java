package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class li2 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof li2) {
            if (this.a != ((li2) obj).a) {
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
        return qx1.j(this.a, "GridItemSpan(packedValue=", ")");
    }
}
