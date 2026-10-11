package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q47 implements px3 {
    public final x50 a;
    public final int b;

    public q47(x50 x50Var, int i) {
        this.a = x50Var;
        this.b = i;
    }

    @Override // defpackage.px3
    public final int a(g13 g13Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        if (i >= i2 - (i3 * 2)) {
            return Math.round(((i2 - i) / 2.0f) * 1.0f);
        }
        return db.C(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q47) {
                q47 q47Var = (q47) obj;
                if (!this.a.equals(q47Var.a) || this.b != q47Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return qx1.o(sb, this.b, ')');
    }
}
