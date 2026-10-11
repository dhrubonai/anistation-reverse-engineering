package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s70 {
    public final float a;
    public final su5 b;

    public s70(float f, su5 su5Var) {
        this.a = f;
        this.b = su5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s70) {
                s70 s70Var = (s70) obj;
                if (!vm1.c(this.a, s70Var.a) || !this.b.equals(s70Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + vm1.d(this.a) + ", brush=" + this.b + ")";
    }
}
