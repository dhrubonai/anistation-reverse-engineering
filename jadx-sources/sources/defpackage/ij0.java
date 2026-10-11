package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ij0 {
    public final e7 a;
    public final ub2 b;
    public final j32 c;
    public final boolean d;

    public ij0(e7 e7Var, ub2 ub2Var, j32 j32Var, boolean z) {
        this.a = e7Var;
        this.b = ub2Var;
        this.c = j32Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        if (a34.i(this.a, ij0Var.a) && a34.i(this.b, ij0Var.b) && a34.i(this.c, ij0Var.c) && this.d == ij0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
