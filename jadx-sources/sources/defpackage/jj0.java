package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jj0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    public jj0(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        if (this.a == jj0Var.a && this.b == jj0Var.b && this.c == jj0Var.c && this.d == jj0Var.d && this.e == jj0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qx1.c(this.d, qx1.c(this.c, qx1.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        boolean z = this.e;
        StringBuilder u = qx1.u("Change(preStart=", i, ", preEnd=", i2, ", originalStart=");
        h11.y(u, i3, ", originalEnd=", i4, ", isFromHardwareSource=");
        return qx1.r(u, z, ")");
    }
}
