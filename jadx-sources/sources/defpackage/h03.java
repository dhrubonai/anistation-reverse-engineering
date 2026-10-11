package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h03 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public h03(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        if (this.a == h03Var.a && this.b == h03Var.b && this.c == h03Var.c && this.d == h03Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder u = qx1.u("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        u.append(this.c);
        u.append(", bottom=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
