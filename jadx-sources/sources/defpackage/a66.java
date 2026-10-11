package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a66 extends d04 {
    public final ti4 x;
    public final int y;
    public final tw5 z;

    public a66(ti4 ti4Var, int i, tw5 tw5Var) {
        this.x = ti4Var;
        this.y = i;
        this.z = tw5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, c66] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        c66 c66Var = (c66) xz3Var;
        c66Var.L = this.x;
        c66Var.M = this.y;
        c66Var.N = this.z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a66) {
                a66 a66Var = (a66) obj;
                if (this.x == a66Var.x && this.y == a66Var.y && this.z.equals(a66Var.z)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.z.hashCode() + zo5.g(qx1.c(this.y, this.x.hashCode() * 31, 31), 31, false);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.x + ", selectedTabIndex=" + this.y + ", followContentSize=false, animationSpec=" + this.z + ')';
    }
}
