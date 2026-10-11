package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j42 {
    public final float a;
    public final float b;
    public final long c;

    public j42(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j42)) {
            return false;
        }
        j42 j42Var = (j42) obj;
        if (Float.compare(this.a, j42Var.a) == 0 && Float.compare(this.b, j42Var.b) == 0 && this.c == j42Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qx1.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qx1.k(this.c, ")", qx1.t("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}
