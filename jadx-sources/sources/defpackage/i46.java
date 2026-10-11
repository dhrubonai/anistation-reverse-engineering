package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i46 {
    public final fe2 a;
    public final int b;
    public final long c;

    public i46(fe2 fe2Var, int i, long j) {
        this.a = fe2Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i46) {
                i46 i46Var = (i46) obj;
                if (this.a != i46Var.a || this.b != i46Var.b || this.c != i46Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemGestureUiState(type=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", updatedAt=");
        return qx1.k(this.c, ")", sb);
    }
}
