package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t7 implements px3 {
    public final x50 a;
    public final x50 b;
    public final int c;

    public t7(x50 x50Var, x50 x50Var2, int i) {
        this.a = x50Var;
        this.b = x50Var2;
        this.c = i;
    }

    @Override // defpackage.px3
    public final int a(g13 g13Var, long j, int i) {
        int a = this.b.a(0, g13Var.b());
        return g13Var.b + a + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t7) {
                t7 t7Var = (t7) obj;
                if (!this.a.equals(t7Var.a) || !this.b.equals(t7Var.b) || this.c != t7Var.c) {
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
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return qx1.o(sb, this.c, ')');
    }
}
