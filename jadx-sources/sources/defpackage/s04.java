package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s04 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof s04) {
            if (this.a != ((s04) obj).a) {
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
        return qx1.j(this.a, "IndirectPointerEventData(packedValue=", ")");
    }
}
