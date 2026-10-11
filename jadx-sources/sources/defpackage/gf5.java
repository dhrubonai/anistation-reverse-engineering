package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gf5 {
    public final jf5 a;
    public final jf5 b;

    public gf5(jf5 jf5Var, jf5 jf5Var2) {
        this.a = jf5Var;
        this.b = jf5Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gf5.class == obj.getClass()) {
                gf5 gf5Var = (gf5) obj;
                if (this.a.equals(gf5Var.a) && this.b.equals(gf5Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        jf5 jf5Var = this.a;
        sb.append(jf5Var);
        jf5 jf5Var2 = this.b;
        if (jf5Var.equals(jf5Var2)) {
            str = "";
        } else {
            str = ", " + jf5Var2;
        }
        return h11.k(sb, str, "]");
    }
}
