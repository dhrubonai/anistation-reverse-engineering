package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ex3 {
    public static final ex3 b = new ex3("text/*");
    public static final ex3 c = new ex3("*/*");
    public final String a;

    public ex3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex3)) {
            return false;
        }
        return this.a.equals(((ex3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qx1.m("MediaType(representation='", this.a, "')");
    }
}
