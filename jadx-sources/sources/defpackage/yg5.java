package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yg5 {
    public final xg5 a;
    public final xg5 b;
    public final boolean c;

    public yg5(xg5 xg5Var, xg5 xg5Var2, boolean z) {
        this.a = xg5Var;
        this.b = xg5Var2;
        this.c = z;
    }

    public static yg5 a(yg5 yg5Var, xg5 xg5Var, xg5 xg5Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            xg5Var = yg5Var.a;
        }
        if ((i & 2) != 0) {
            xg5Var2 = yg5Var.b;
        }
        yg5Var.getClass();
        return new yg5(xg5Var, xg5Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5)) {
            return false;
        }
        yg5 yg5Var = (yg5) obj;
        if (a34.i(this.a, yg5Var.a) && a34.i(this.b, yg5Var.b) && this.c == yg5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return qx1.r(sb, this.c, ")");
    }
}
