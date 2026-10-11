package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lr extends d04 implements qh5 {
    public final boolean x;
    public final ub2 y;

    public lr(ub2 ub2Var, boolean z) {
        this.x = z;
        this.y = ub2Var;
    }

    @Override // defpackage.qh5
    public final ph5 L0() {
        ph5 ph5Var = new ph5();
        ph5Var.z = this.x;
        this.y.invoke(ph5Var);
        return ph5Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new n01(this.x, false, this.y);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        n01 n01Var = (n01) xz3Var;
        n01Var.L = this.x;
        n01Var.N = this.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lr) {
                lr lrVar = (lr) obj;
                if (this.x != lrVar.x || this.y != lrVar.y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.x) * 31);
    }
}
