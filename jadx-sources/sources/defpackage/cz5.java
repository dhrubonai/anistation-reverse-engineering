package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cz5 implements go {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof cz5) {
            if (!this.a.equals(((cz5) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qx1.m("StringAnnotation(value=", this.a, ")");
    }
}
