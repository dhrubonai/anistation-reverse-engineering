package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr6 extends d04 {
    public final rx1 A;
    public final ln5 B;
    public final xi6 x;
    public final qi6 y;
    public final iv1 z;

    public rr6(xi6 xi6Var, qi6 qi6Var, iv1 iv1Var, rx1 rx1Var, ln5 ln5Var) {
        this.x = xi6Var;
        this.y = qi6Var;
        this.z = iv1Var;
        this.A = rx1Var;
        this.B = ln5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, tr6] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.y;
        xz3Var.M = this.z;
        xz3Var.N = this.A;
        xz3Var.O = this.B;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        tr6 tr6Var = (tr6) xz3Var;
        tr6Var.getClass();
        tr6Var.L = this.y;
        tr6Var.M = this.z;
        tr6Var.N = this.A;
        tr6Var.O = this.B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rr6) {
            rr6 rr6Var = (rr6) obj;
            if (this.x == rr6Var.x && a34.i(this.y, rr6Var.y) && this.z.equals(rr6Var.z) && a34.i(this.A, rr6Var.A) && this.B == rr6Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode() + ((this.A.a.hashCode() + ((this.z.a.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.x + ", veilAnimation=" + this.y + ", enter=" + this.z + ", exit=" + this.A + ", mutableTransformState=" + this.B + ")";
    }
}
