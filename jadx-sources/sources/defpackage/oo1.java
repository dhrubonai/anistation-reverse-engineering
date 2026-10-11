package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oo1 extends d04 {
    public static final f01 F = new f01((byte) 13);
    public final u34 A;
    public final boolean B;
    public final jc2 C;
    public final jc2 D;
    public final boolean E;
    public final uo1 x;
    public final rg4 y;
    public final boolean z;

    public oo1(uo1 uo1Var, rg4 rg4Var, boolean z, u34 u34Var, boolean z2, qo1 qo1Var, jc2 jc2Var, boolean z3) {
        this.x = uo1Var;
        this.y = rg4Var;
        this.z = z;
        this.A = u34Var;
        this.B = z2;
        this.C = qo1Var;
        this.D = jc2Var;
        this.E = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, to1, ho1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? ho1Var = new ho1(F, this.z, this.A, this.y);
        ho1Var.g0 = this.x;
        ho1Var.h0 = this.B;
        ho1Var.i0 = this.C;
        ho1Var.j0 = this.D;
        ho1Var.k0 = this.E;
        return ho1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        boolean z2;
        to1 to1Var = (to1) xz3Var;
        uo1 uo1Var = to1Var.g0;
        uo1 uo1Var2 = this.x;
        if (!a34.i(uo1Var, uo1Var2)) {
            to1Var.g0 = uo1Var2;
            z = true;
        } else {
            z = false;
        }
        boolean z3 = to1Var.k0;
        boolean z4 = this.E;
        if (z3 != z4) {
            to1Var.k0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        to1Var.i0 = this.C;
        to1Var.j0 = this.D;
        to1Var.h0 = this.B;
        to1Var.u1(F, this.z, this.A, this.y, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo1.class != obj.getClass()) {
            return false;
        }
        oo1 oo1Var = (oo1) obj;
        if (a34.i(this.x, oo1Var.x) && this.y == oo1Var.y && this.z == oo1Var.z && a34.i(this.A, oo1Var.A) && this.B == oo1Var.B && a34.i(this.C, oo1Var.C) && a34.i(this.D, oo1Var.D) && this.E == oo1Var.E) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int g = zo5.g((this.y.hashCode() + (this.x.hashCode() * 31)) * 31, 31, this.z);
        u34 u34Var = this.A;
        if (u34Var != null) {
            i = u34Var.hashCode();
        } else {
            i = 0;
        }
        return Boolean.hashCode(this.E) + ((this.D.hashCode() + ((this.C.hashCode() + zo5.g((g + i) * 31, 31, this.B)) * 31)) * 31);
    }
}
