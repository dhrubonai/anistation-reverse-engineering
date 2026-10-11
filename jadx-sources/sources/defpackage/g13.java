package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g13 {
    public static final g13 e = new g13(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public g13(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        if (this.a == g13Var.a && this.b == g13Var.b && this.c == g13Var.c && this.d == g13Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qx1.c(this.c, qx1.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder u = qx1.u("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        u.append(this.c);
        u.append(", ");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
