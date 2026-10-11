package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sg5 extends d04 {
    public final boolean A;
    public final m65 B;
    public final sb2 C;
    public final boolean x;
    public final u34 y;
    public final by2 z;

    public sg5(boolean z, u34 u34Var, by2 by2Var, boolean z2, m65 m65Var, sb2 sb2Var) {
        this.x = z;
        this.y = u34Var;
        this.z = by2Var;
        this.A = z2;
        this.B = m65Var;
        this.C = sb2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, k0, vg5] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? k0Var = new k0(this.y, this.z, false, this.A, null, this.B, this.C);
        k0Var.j0 = this.x;
        return k0Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        vg5 vg5Var = (vg5) xz3Var;
        boolean z = vg5Var.j0;
        boolean z2 = this.x;
        if (z != z2) {
            vg5Var.j0 = z2;
            z51.w(vg5Var);
        }
        vg5Var.q1(this.y, this.z, false, this.A, null, this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sg5.class == obj.getClass()) {
                sg5 sg5Var = (sg5) obj;
                if (this.x != sg5Var.x || !a34.i(this.y, sg5Var.y) || !a34.i(this.z, sg5Var.z) || this.A != sg5Var.A || !this.B.equals(sg5Var.B) || this.C != sg5Var.C) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Boolean.hashCode(this.x) * 31;
        u34 u34Var = this.y;
        if (u34Var != null) {
            i = u34Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        by2 by2Var = this.z;
        if (by2Var != null) {
            i2 = by2Var.hashCode();
        } else {
            i2 = 0;
        }
        return this.C.hashCode() + qx1.c(this.B.a, zo5.g(zo5.g((i3 + i2) * 31, 31, false), 31, this.A), 31);
    }
}
