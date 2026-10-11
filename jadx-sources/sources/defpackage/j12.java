package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j12 {
    public final float a;
    public final j32 b;

    public j12(float f, j32 j32Var) {
        this.a = f;
        this.b = j32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j12)) {
            return false;
        }
        j12 j12Var = (j12) obj;
        if (Float.compare(this.a, j12Var.a) == 0 && a34.i(this.b, j12Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
