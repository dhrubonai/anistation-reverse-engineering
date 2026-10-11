package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dq0 extends d04 {
    public final sb2 A;
    public final sb2 B;
    public final boolean C;
    public final u34 x;
    public final boolean y;
    public final m65 z;

    public dq0(sb2 sb2Var, sb2 sb2Var2, u34 u34Var, m65 m65Var, boolean z, boolean z2) {
        this.x = u34Var;
        this.y = z;
        this.z = m65Var;
        this.A = sb2Var;
        this.B = sb2Var2;
        this.C = z2;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        boolean z = this.y;
        return new gq0(this.A, this.B, this.x, this.z, this.C, z);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        gq0 gq0Var = (gq0) xz3Var;
        gq0Var.i0 = this.C;
        if (gq0Var.h0 == null) {
            z = true;
        } else {
            z = false;
        }
        sb2 sb2Var = this.B;
        if (sb2Var == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            gq0Var.f1();
            z51.w(gq0Var);
            z3 = true;
        } else {
            z3 = false;
        }
        gq0Var.h0 = sb2Var;
        boolean z4 = gq0Var.S;
        boolean z5 = this.y;
        if (z4 != z5) {
            z3 = true;
        }
        gq0Var.q1(this.x, null, false, z5, null, this.z, this.A);
        if (z3) {
            gq0Var.r1(false);
            gq0Var.r1(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && dq0.class == obj.getClass()) {
                dq0 dq0Var = (dq0) obj;
                if (!a34.i(this.x, dq0Var.x) || this.y != dq0Var.y || !a34.i(this.z, dq0Var.z) || this.A != dq0Var.A || this.B != dq0Var.B || this.C != dq0Var.C) {
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
        int i3 = 0;
        u34 u34Var = this.x;
        if (u34Var != null) {
            i = u34Var.hashCode();
        } else {
            i = 0;
        }
        int g = zo5.g(zo5.g(i * 961, 31, false), 961, this.y);
        m65 m65Var = this.z;
        if (m65Var != null) {
            i2 = Integer.hashCode(m65Var.a);
        } else {
            i2 = 0;
        }
        int hashCode = (this.A.hashCode() + ((g + i2) * 31)) * 961;
        sb2 sb2Var = this.B;
        if (sb2Var != null) {
            i3 = sb2Var.hashCode();
        }
        return Boolean.hashCode(this.C) + ((hashCode + i3) * 961);
    }
}
