package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x75 {
    public float a = 0.0f;
    public boolean b = true;
    public n21 c = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x75) {
                x75 x75Var = (x75) obj;
                if (Float.compare(this.a, x75Var.a) != 0 || this.b != x75Var.b || !a34.i(this.c, x75Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g(Float.hashCode(this.a) * 31, 31, this.b);
        n21 n21Var = this.c;
        if (n21Var == null) {
            hashCode = 0;
        } else {
            hashCode = n21Var.i.hashCode();
        }
        return (g + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
