package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y74 extends z74 {
    public final l74 a;
    public final int b;

    public y74(l74 l74Var, int i) {
        l74Var.getClass();
        this.a = l74Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y74.class == obj.getClass()) {
                y74 y74Var = (y74) obj;
                if (this.b == y74Var.b && a34.i(this.a, y74Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
        sb.append(this.a);
        sb.append(", direction=");
        return qx1.o(sb, this.b, ')');
    }
}
