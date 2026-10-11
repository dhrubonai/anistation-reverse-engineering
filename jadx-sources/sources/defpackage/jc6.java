package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jc6 extends d04 {
    public final boolean A;
    public final o83 B;
    public final dd6 x;
    public final gi6 y;
    public final xd6 z;

    public jc6(dd6 dd6Var, gi6 gi6Var, xd6 xd6Var, boolean z, o83 o83Var) {
        this.x = dd6Var;
        this.y = gi6Var;
        this.z = xd6Var;
        this.A = z;
        this.B = o83Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new kc6(this.x, this.y, this.z, this.A, this.B);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        kc6 kc6Var = (kc6) xz3Var;
        dd6 dd6Var = kc6Var.N;
        dd6 dd6Var2 = this.x;
        kc6Var.N = dd6Var2;
        dd6Var2.getClass();
        boolean z2 = this.A;
        kc6Var.O = z2;
        boolean z3 = !z2;
        qa6 qa6Var = dd6Var2.a;
        if (this.B.c == 4) {
            z = true;
        } else {
            z = false;
        }
        qa6Var.x.setValue(new pa6(this.y, this.z, z2, z3, z));
        if (!a34.i(dd6Var, dd6Var2)) {
            z90 z90Var = kc6Var.P;
            y90 y90Var = dd6Var2.g;
            y90 y90Var2 = z90Var.L;
            if (y90Var2 != null) {
                y90Var2.a.k(z90Var);
            }
            y90Var.a.b(z90Var);
            z90Var.L = y90Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jc6) {
                jc6 jc6Var = (jc6) obj;
                if (this.A != jc6Var.A || !a34.i(this.x, jc6Var.x) || !a34.i(this.y, jc6Var.y) || !a34.i(this.z, jc6Var.z) || !this.B.equals(jc6Var.B)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + zo5.h(this.z, (this.y.hashCode() + ((this.x.hashCode() + (Boolean.hashCode(this.A) * 31)) * 31)) * 31, 961);
    }
}
