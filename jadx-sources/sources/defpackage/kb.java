package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kb {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof kb) {
            if (this.a != ((kb) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return qx1.i(this.a, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
