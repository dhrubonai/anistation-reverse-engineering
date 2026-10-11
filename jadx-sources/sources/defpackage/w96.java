package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w96 extends d04 {
    public final boolean A;
    public final o83 B;
    public final he5 C;
    public final boolean D;
    public final u34 E;
    public final t44 F;
    public final gi6 x;
    public final dd6 y;
    public final cc6 z;

    public w96(gi6 gi6Var, dd6 dd6Var, cc6 cc6Var, boolean z, o83 o83Var, he5 he5Var, boolean z2, u34 u34Var, t44 t44Var) {
        this.x = gi6Var;
        this.y = dd6Var;
        this.z = cc6Var;
        this.A = z;
        this.B = o83Var;
        this.C = he5Var;
        this.D = z2;
        this.E = u34Var;
        this.F = t44Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new fa6(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        bx5 bx5Var;
        fa6 fa6Var = (fa6) xz3Var;
        a46 a46Var = fa6Var.X;
        m82 m82Var = fa6Var.W;
        boolean z = fa6Var.Q;
        gi6 gi6Var = fa6Var.N;
        o83 o83Var = fa6Var.R;
        cc6 cc6Var = fa6Var.P;
        u34 u34Var = fa6Var.U;
        t44 t44Var = fa6Var.V;
        gi6 gi6Var2 = this.x;
        fa6Var.N = gi6Var2;
        fa6Var.O = this.y;
        cc6 cc6Var2 = this.z;
        fa6Var.P = cc6Var2;
        boolean z2 = this.A;
        fa6Var.Q = z2;
        o83 o83Var2 = this.B;
        fa6Var.R = o83Var2;
        fa6Var.S = this.C;
        fa6Var.T = this.D;
        u34 u34Var2 = this.E;
        fa6Var.U = u34Var2;
        t44 t44Var2 = this.F;
        fa6Var.V = t44Var2;
        if (z2 != z || !a34.i(gi6Var2, gi6Var) || !o83Var2.equals(o83Var) || !a34.i(t44Var2, t44Var)) {
            if (z2 && (fa6Var.f1() || fa6Var.e0 != null)) {
                fa6Var.i1(false);
            } else if (!z2) {
                fa6Var.d1();
            }
        }
        if (z2 != z || z2 != z || o83Var2.a() != o83Var.a()) {
            z51.w(fa6Var);
        }
        if (cc6Var2 != cc6Var) {
            a46Var.c1();
            if (fa6Var.K) {
                cc6Var2.m = fa6Var.f0;
                if (fa6Var.f1() && (bx5Var = fa6Var.b0) != null) {
                    bx5Var.l(null);
                    fa6Var.b0 = tl7.z(fa6Var.O0(), null, null, new ea6(cc6Var2, null, (byte) 0), 3);
                }
            }
            cc6Var2.l = new z96(fa6Var, (byte) 2);
        }
        if (!a34.i(u34Var2, u34Var)) {
            a46Var.c1();
            if (m82Var.K) {
                m82Var.f1(u34Var2);
            }
        }
        if (z2 != z) {
            if (z2) {
                fa6Var.a1(m82Var);
                m82Var.f1(u34Var2);
            } else {
                fa6Var.b1(m82Var);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w96) {
                w96 w96Var = (w96) obj;
                if (a34.i(this.x, w96Var.x) && a34.i(this.y, w96Var.y) && this.z == w96Var.z && this.A == w96Var.A && this.B.equals(w96Var.B) && a34.i(this.C, w96Var.C) && this.D == w96Var.D && a34.i(this.E, w96Var.E) && a34.i(this.F, w96Var.F)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int hashCode2 = (this.B.hashCode() + zo5.g(zo5.g((this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 961, 31, this.A), 31, false)) * 31;
        he5 he5Var = this.C;
        if (he5Var == null) {
            hashCode = 0;
        } else {
            hashCode = he5Var.hashCode();
        }
        int g = zo5.g((this.E.hashCode() + zo5.g((hashCode2 + hashCode) * 31, 31, this.D)) * 31, 31, false);
        t44 t44Var = this.F;
        if (t44Var != null) {
            i = t44Var.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.x + ", textLayoutState=" + this.y + ", textFieldSelectionState=" + this.z + ", filter=null, enabled=" + this.A + ", readOnly=false, keyboardOptions=" + this.B + ", keyboardActionHandler=" + this.C + ", singleLine=" + this.D + ", interactionSource=" + this.E + ", isPassword=false, stylusHandwritingTrigger=" + this.F + ")";
    }
}
