package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l46 {
    public final String a;
    public final int b;
    public final int c;

    public l46(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l46)) {
            return false;
        }
        l46 l46Var = (l46) obj;
        if (a34.i(this.a, l46Var.a) && this.b == l46Var.b && this.c == l46Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qx1.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return zo5.k(this.c, ")", h11.m(this.b, "SystemIdInfo(workSpecId=", this.a, ", generation=", ", systemId="));
    }
}
