package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i83 extends d04 {
    public final ub2 x;
    public final ub2 y;

    public i83(ub2 ub2Var, ub2 ub2Var2) {
        this.x = ub2Var;
        this.y = ub2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, k83] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        k83 k83Var = (k83) xz3Var;
        k83Var.L = this.x;
        k83Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i83)) {
            return false;
        }
        i83 i83Var = (i83) obj;
        if (this.x == i83Var.x && this.y == i83Var.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        ub2 ub2Var = this.x;
        if (ub2Var != null) {
            i = ub2Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ub2 ub2Var2 = this.y;
        if (ub2Var2 != null) {
            i2 = ub2Var2.hashCode();
        }
        return i3 + i2;
    }
}
