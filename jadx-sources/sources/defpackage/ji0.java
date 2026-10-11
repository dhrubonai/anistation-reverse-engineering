package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ji0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ji0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        if (this.a == ji0Var.a && this.b == ji0Var.b && this.c == ji0Var.c && this.d == ji0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qx1.c(this.c, qx1.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder u = qx1.u("EventFormat(columnCount=", this.a, ", startIndex=", this.b, ", endIndex=");
        u.append(this.c);
        u.append(", textIndex=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
