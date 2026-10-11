package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jj3 extends q82 {
    public final cn7 C;

    public jj3(cn7 cn7Var) {
        this.C = cn7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj3)) {
            return false;
        }
        if (this.C == ((jj3) obj).C) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.C + ")";
    }
}
