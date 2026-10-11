package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bd4 extends d04 {
    public final ub2 x;

    public bd4(ub2 ub2Var) {
        this.x = ub2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, cd4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = true;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        cd4 cd4Var = (cd4) xz3Var;
        ub2 ub2Var = cd4Var.L;
        ub2 ub2Var2 = this.x;
        if (ub2Var != ub2Var2 || !cd4Var.M) {
            wc7.O(cd4Var).V(false);
        }
        cd4Var.L = ub2Var2;
        cd4Var.M = true;
    }

    public final boolean equals(Object obj) {
        bd4 bd4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bd4) {
            bd4Var = (bd4) obj;
        } else {
            bd4Var = null;
        }
        if (bd4Var != null && this.x == bd4Var.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.x.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.x + ", rtlAware=true)";
    }
}
