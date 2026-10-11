package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ie3 extends d04 {
    public final boolean A;
    public final sb2 x;
    public final fe3 y;
    public final rg4 z;

    public ie3(sb2 sb2Var, fe3 fe3Var, rg4 rg4Var, boolean z) {
        this.x = sb2Var;
        this.y = fe3Var;
        this.z = rg4Var;
        this.A = z;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new le3(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        le3 le3Var = (le3) xz3Var;
        le3Var.L = this.x;
        le3Var.M = this.y;
        rg4 rg4Var = le3Var.N;
        rg4 rg4Var2 = this.z;
        if (rg4Var != rg4Var2) {
            le3Var.N = rg4Var2;
            z51.w(le3Var);
        }
        boolean z = le3Var.O;
        boolean z2 = this.A;
        if (z == z2) {
            return;
        }
        le3Var.O = z2;
        le3Var.a1();
        z51.w(le3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ie3) {
            ie3 ie3Var = (ie3) obj;
            if (this.x == ie3Var.x && a34.i(this.y, ie3Var.y) && this.z == ie3Var.z && this.A == ie3Var.A) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + zo5.g((this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31, 31, this.A);
    }
}
