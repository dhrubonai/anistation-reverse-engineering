package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y83 {
    public final e04 a;
    public final k03 b;

    public y83(e04 e04Var, k03 k03Var) {
        e04Var.getClass();
        this.a = e04Var;
        this.b = k03Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y83) {
                y83 y83Var = (y83) obj;
                if (!a34.i(this.a, y83Var.a) || !this.b.equals(y83Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.a + ", factory=" + this.b + ')';
    }
}
