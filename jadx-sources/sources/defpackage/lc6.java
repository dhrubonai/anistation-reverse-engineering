package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lc6 {
    public final yd6 a;
    public final int b;

    public lc6(yd6 yd6Var, int i) {
        this.a = yd6Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lc6) {
                lc6 lc6Var = (lc6) obj;
                if (this.b != lc6Var.b || !this.a.equals(lc6Var.a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
