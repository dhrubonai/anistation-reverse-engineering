package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y15 extends iv5 {
    public final iv5 a;
    public final int b;

    public y15(iv5 iv5Var, int i) {
        this.a = iv5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y15) {
            y15 y15Var = (y15) obj;
            if (y15Var.a.equals(this.a) && y15Var.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
