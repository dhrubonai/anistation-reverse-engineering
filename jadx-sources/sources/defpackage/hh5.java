package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hh5 {
    public final cj2 a;
    public final long b;
    public final gh5 c;
    public final boolean d;

    public hh5(cj2 cj2Var, long j, gh5 gh5Var, boolean z) {
        this.a = cj2Var;
        this.b = j;
        this.c = gh5Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hh5) {
                hh5 hh5Var = (hh5) obj;
                if (this.a != hh5Var.a || !xc4.b(this.b, hh5Var.b) || this.c != hh5Var.c || this.d != hh5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + qx1.d(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + xc4.h(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
