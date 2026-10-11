package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s7 implements ox3 {
    public final w50 a;
    public final w50 b;
    public final int c;

    public s7(w50 w50Var, w50 w50Var2, int i) {
        this.a = w50Var;
        this.b = w50Var2;
        this.c = i;
    }

    @Override // defpackage.ox3
    public final int a(g13 g13Var, long j, int i, ia3 ia3Var) {
        int a = this.b.a(0, g13Var.d(), ia3Var);
        int i2 = -this.a.a(0, i, ia3Var);
        ia3 ia3Var2 = ia3.x;
        int i3 = this.c;
        if (ia3Var != ia3Var2) {
            i3 = -i3;
        }
        return g13Var.a + a + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s7) {
                s7 s7Var = (s7) obj;
                if (!this.a.equals(s7Var.a) || !this.b.equals(s7Var.b) || this.c != s7Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qx1.b(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return qx1.o(sb, this.c, ')');
    }
}
