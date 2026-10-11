package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xg5 {
    public final c45 a;
    public final int b;
    public final long c;

    public xg5(c45 c45Var, int i, long j) {
        this.a = c45Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg5)) {
            return false;
        }
        xg5 xg5Var = (xg5) obj;
        if (this.a == xg5Var.a && this.b == xg5Var.b && this.c == xg5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return qx1.k(this.c, ")", sb);
    }
}
