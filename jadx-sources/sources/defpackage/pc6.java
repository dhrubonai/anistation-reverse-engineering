package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pc6 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof pc6) {
            if (this.a != ((pc6) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        return qx1.i(this.a ? 1 : 0, "TextHighlightType(value=", ")");
    }
}
