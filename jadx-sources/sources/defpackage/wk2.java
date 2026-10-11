package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class wk2 extends d04 {
    public final xd6 x;
    public final int y;
    public final int z;

    public wk2(xd6 xd6Var, int i, int i2) {
        this.x = xd6Var;
        this.y = i;
        this.z = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, yk2] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        xz3Var.P = -1;
        xz3Var.Q = -1;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        yk2 yk2Var = (yk2) xz3Var;
        xd6 xd6Var = yk2Var.L;
        xd6 xd6Var2 = this.x;
        boolean i = a34.i(xd6Var, xd6Var2);
        int i2 = this.y;
        int i3 = this.z;
        if (i && yk2Var.M == i2 && yk2Var.N == i3) {
            return;
        }
        yk2Var.L = xd6Var2;
        yk2Var.M = i2;
        yk2Var.N = i3;
        yk2Var.R = ez5.j(xd6Var2, wc7.O(yk2Var).W);
        yk2Var.O = true;
        w65.E(yk2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk2)) {
            return false;
        }
        wk2 wk2Var = (wk2) obj;
        if (a34.i(this.x, wk2Var.x) && this.y == wk2Var.y && this.z == wk2Var.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.x.hashCode() * 31) + this.y) * 31) + this.z;
    }
}
