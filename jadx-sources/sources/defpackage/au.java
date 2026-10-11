package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class au {
    public final e45 a;

    public au(e45 e45Var) {
        this.a = e45Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof au) || !a34.i(this.a, ((au) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
