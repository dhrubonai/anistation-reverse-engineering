package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cy {
    public final String a;
    public final String b;

    public cy(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            qi2.m("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cy) {
                cy cyVar = (cy) obj;
                if (this.a.equals(cyVar.a) && this.b.equals(cyVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return h11.k(sb, this.b, "}");
    }
}
