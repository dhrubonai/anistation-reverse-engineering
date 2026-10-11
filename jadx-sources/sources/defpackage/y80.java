package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y80 extends d04 {
    public final y50 x;
    public final boolean y;

    public y80(y50 y50Var, boolean z) {
        this.x = y50Var;
        this.y = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, z80] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        z80 z80Var = (z80) xz3Var;
        z80Var.L = this.x;
        z80Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        y80 y80Var;
        if (this != obj) {
            if (obj instanceof y80) {
                y80Var = (y80) obj;
            } else {
                y80Var = null;
            }
            if (y80Var != null && this.x.equals(y80Var.x) && this.y == y80Var.y) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + (this.x.hashCode() * 31);
    }
}
