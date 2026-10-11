package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ao3 {
    public final String a;
    public final f13 b;

    public ao3(String str, f13 f13Var) {
        this.a = str;
        this.b = f13Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ao3) {
                ao3 ao3Var = (ao3) obj;
                if (!this.a.equals(ao3Var.a) || !this.b.equals(ao3Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
