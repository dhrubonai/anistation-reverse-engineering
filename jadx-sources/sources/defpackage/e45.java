package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e45 {
    public final int a;
    public final s92 b;
    public final r92 c;

    public e45(int i, s92 s92Var, r92 r92Var) {
        this.a = i;
        this.b = s92Var;
        this.c = r92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e45) {
            e45 e45Var = (e45) obj;
            if (this.a == e45Var.a && a34.i(this.b, e45Var.b) && this.c.equals(e45Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + qx1.c(0, qx1.c(0, ((this.a * 31) + this.b.x) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=Normal, loadingStrategy=Blocking)";
    }
}
