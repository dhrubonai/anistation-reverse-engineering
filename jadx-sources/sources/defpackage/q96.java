package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q96 extends d04 {
    public final dd6 A;
    public final gi6 B;
    public final cc6 C;
    public final ka0 D;
    public final boolean E;
    public final yc5 F;
    public final rg4 G;
    public final fg6 H;
    public final bn4 I;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public q96(boolean z, boolean z2, boolean z3, dd6 dd6Var, gi6 gi6Var, cc6 cc6Var, ka0 ka0Var, boolean z4, yc5 yc5Var, rg4 rg4Var, fg6 fg6Var, bn4 bn4Var) {
        this.x = z;
        this.y = z2;
        this.z = z3;
        this.A = dd6Var;
        this.B = gi6Var;
        this.C = cc6Var;
        this.D = ka0Var;
        this.E = z4;
        this.F = yc5Var;
        this.G = rg4Var;
        this.H = fg6Var;
        this.I = bn4Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new u96(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        eg6 eg6Var;
        h43 h43Var;
        u96 u96Var = (u96) xz3Var;
        boolean d1 = u96Var.d1();
        boolean z2 = u96Var.N;
        gi6 gi6Var = u96Var.Q;
        dd6 dd6Var = u96Var.P;
        cc6 cc6Var = u96Var.R;
        yc5 yc5Var = u96Var.U;
        boolean z3 = this.x;
        u96Var.N = z3;
        cc6 cc6Var2 = this.C;
        cc6Var2.h = z3;
        boolean z4 = this.y;
        u96Var.O = z4;
        dd6 dd6Var2 = this.A;
        u96Var.P = dd6Var2;
        gi6 gi6Var2 = this.B;
        u96Var.Q = gi6Var2;
        u96Var.R = cc6Var2;
        u96Var.S = this.D;
        u96Var.T = this.E;
        yc5 yc5Var2 = this.F;
        u96Var.U = yc5Var2;
        u96Var.V = this.G;
        fg6 fg6Var = this.H;
        u96Var.W = fg6Var;
        u96Var.X = this.I;
        va6 va6Var = u96Var.e0;
        if (!z3 && !z4 && !this.z) {
            z = false;
        } else {
            z = true;
        }
        gi6 gi6Var3 = va6Var.N;
        cc6 cc6Var3 = va6Var.O;
        dd6 dd6Var3 = va6Var.P;
        boolean z5 = va6Var.Q;
        va6Var.N = gi6Var2;
        va6Var.O = cc6Var2;
        va6Var.P = dd6Var2;
        va6Var.Q = z;
        if (!a34.i(gi6Var2, gi6Var3) || cc6Var2 != cc6Var3 || !a34.i(dd6Var2, dd6Var3) || z != z5) {
            va6Var.d1();
        }
        f96 f96Var = u96Var.f0;
        f96Var.N.a = null;
        f96Var.N = fg6Var;
        fg6Var.a = f96Var;
        if (f96Var.K) {
            eg6Var = eg6.z;
        } else {
            eg6Var = eg6.y;
        }
        fg6Var.b = eg6Var;
        if (!u96Var.d1()) {
            bx5 bx5Var = u96Var.Z;
            if (bx5Var != null) {
                bx5Var.l(null);
            }
            u96Var.Z = null;
            j31 j31Var = u96Var.Y;
            if (j31Var != null && (h43Var = (h43) j31Var.b.getAndSet(null)) != null) {
                h43Var.l(null);
            }
        } else if (!z2 || !a34.i(gi6Var, gi6Var2) || !d1) {
            u96Var.e1();
        }
        if (a34.i(gi6Var, gi6Var2) && a34.i(dd6Var, dd6Var2) && a34.i(cc6Var, cc6Var2) && a34.i(yc5Var, yc5Var2)) {
            return;
        }
        w65.E(u96Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q96) {
                q96 q96Var = (q96) obj;
                if (this.x == q96Var.x && this.y == q96Var.y && this.z == q96Var.z && a34.i(this.A, q96Var.A) && a34.i(this.B, q96Var.B) && this.C == q96Var.C && a34.i(this.D, q96Var.D) && this.E == q96Var.E && a34.i(this.F, q96Var.F) && this.G == q96Var.G && a34.i(this.H, q96Var.H) && a34.i(this.I, q96Var.I)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + zo5.g((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + zo5.g(zo5.g(Boolean.hashCode(this.x) * 31, 31, this.y), 31, this.z)) * 31)) * 31)) * 31)) * 31, 31, this.E)) * 31)) * 31)) * 31;
        bn4 bn4Var = this.I;
        if (bn4Var == null) {
            hashCode = 0;
        } else {
            hashCode = bn4Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.x + ", isDragHovered=" + this.y + ", isTouchDragInProgress=" + this.z + ", textLayoutState=" + this.A + ", textFieldState=" + this.B + ", textFieldSelectionState=" + this.C + ", cursorBrush=" + this.D + ", writeable=" + this.E + ", scrollState=" + this.F + ", orientation=" + this.G + ", toolbarRequester=" + this.H + ", platformSelectionBehaviors=" + this.I + ")";
    }
}
