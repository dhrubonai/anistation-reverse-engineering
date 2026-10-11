package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cf0 {
    public static final cf0 b = new cf0();
    public final h94 a;

    public cf0() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cf0) {
            if (a34.i(this.a, ((cf0) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        h94 h94Var = this.a;
        if (h94Var != null) {
            return h94Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public cf0(h94 h94Var) {
        this.a = h94Var;
    }
}
