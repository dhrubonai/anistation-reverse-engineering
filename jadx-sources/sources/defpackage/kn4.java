package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kn4 {
    public final um4 a;

    public kn4(um4 um4Var) {
        this.a = um4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn4)) {
            return false;
        }
        if (a34.i(this.a, ((kn4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        um4 um4Var = this.a;
        if (um4Var != null) {
            return um4Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ")";
    }
}
