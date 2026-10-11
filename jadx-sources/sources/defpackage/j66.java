package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j66 {
    public final float a;
    public final float b;
    public final float c;

    public j66(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j66) {
                j66 j66Var = (j66) obj;
                if (!vm1.c(this.a, j66Var.a) || !vm1.c(this.b, j66Var.b) || !vm1.c(this.c, j66Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + qx1.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) vm1.d(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) vm1.d(f + f2));
        sb.append(", width=");
        sb.append((Object) vm1.d(f2));
        sb.append(", contentWidth=");
        sb.append((Object) vm1.d(this.c));
        sb.append(')');
        return sb.toString();
    }
}
