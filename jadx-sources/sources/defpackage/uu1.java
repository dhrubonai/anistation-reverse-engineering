package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uu1 extends d04 {
    public final qi6 A;
    public final iv1 B;
    public final rx1 C;
    public final ln5 D;
    public final sb2 E;
    public final vu1 F;
    public final xi6 x;
    public final qi6 y;
    public final qi6 z;

    public uu1(xi6 xi6Var, qi6 qi6Var, qi6 qi6Var2, qi6 qi6Var3, iv1 iv1Var, rx1 rx1Var, ln5 ln5Var, sb2 sb2Var, vu1 vu1Var) {
        this.x = xi6Var;
        this.y = qi6Var;
        this.z = qi6Var2;
        this.A = qi6Var3;
        this.B = iv1Var;
        this.C = rx1Var;
        this.D = ln5Var;
        this.E = sb2Var;
        this.F = vu1Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new hv1(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        hv1 hv1Var = (hv1) xz3Var;
        hv1Var.M = this.x;
        hv1Var.N = this.y;
        hv1Var.O = this.z;
        hv1Var.P = this.A;
        hv1Var.Q = this.B;
        hv1Var.R = this.C;
        hv1Var.S = this.D;
        hv1Var.T = this.E;
        hv1Var.U = this.F;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uu1) {
            uu1 uu1Var = (uu1) obj;
            if (uu1Var.x == this.x && a34.i(uu1Var.y, this.y) && a34.i(uu1Var.z, this.z) && a34.i(uu1Var.A, this.A) && uu1Var.B.equals(this.B) && a34.i(uu1Var.C, this.C) && uu1Var.D == this.D && uu1Var.E == this.E && a34.i(uu1Var.F, this.F)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.x.hashCode() * 31;
        int i3 = 0;
        qi6 qi6Var = this.y;
        if (qi6Var != null) {
            i = qi6Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        qi6 qi6Var2 = this.z;
        if (qi6Var2 != null) {
            i2 = qi6Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        qi6 qi6Var3 = this.A;
        if (qi6Var3 != null) {
            i3 = qi6Var3.hashCode();
        }
        return this.D.hashCode() + (this.F.hashCode() * 31) + ((this.E.hashCode() + ((this.C.a.hashCode() + ((this.B.a.hashCode() + ((i5 + i3) * 31)) * 31)) * 31)) * 31);
    }
}
