package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hr5 {
    public final ub2 a;
    public final j32 b;

    public hr5(j32 j32Var, ub2 ub2Var) {
        this.a = ub2Var;
        this.b = j32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5)) {
            return false;
        }
        hr5 hr5Var = (hr5) obj;
        if (a34.i(this.a, hr5Var.a) && a34.i(this.b, hr5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
