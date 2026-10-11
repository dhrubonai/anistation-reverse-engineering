package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ya5 {
    public final float a;
    public final long b;
    public final j32 c;

    public ya5(float f, long j, j32 j32Var) {
        this.a = f;
        this.b = j;
        this.c = j32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya5)) {
            return false;
        }
        ya5 ya5Var = (ya5) obj;
        if (Float.compare(this.a, ya5Var.a) == 0 && xh6.a(this.b, ya5Var.b) && a34.i(this.c, ya5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = xh6.c;
        return this.c.hashCode() + qx1.d(hashCode, this.b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + xh6.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
