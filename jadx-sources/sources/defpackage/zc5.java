package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zc5 extends d04 {
    public final i42 A;
    public final u34 B;
    public final fa0 C;
    public final boolean D;
    public final fc E;
    public final kd5 x;
    public final rg4 y;
    public final boolean z;

    public zc5(fc fcVar, fa0 fa0Var, i42 i42Var, u34 u34Var, rg4 rg4Var, kd5 kd5Var, boolean z, boolean z2) {
        this.x = kd5Var;
        this.y = rg4Var;
        this.z = z;
        this.A = i42Var;
        this.B = u34Var;
        this.C = fa0Var;
        this.D = z2;
        this.E = fcVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, ad5, zc1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? zc1Var = new zc1();
        zc1Var.N = this.x;
        zc1Var.O = this.y;
        zc1Var.P = this.z;
        zc1Var.Q = this.A;
        zc1Var.R = this.B;
        zc1Var.S = this.C;
        zc1Var.T = this.D;
        zc1Var.U = this.E;
        return zc1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        u34 u34Var = this.B;
        ((ad5) xz3Var).f1(this.E, this.C, this.A, u34Var, this.y, this.x, this.D, this.z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zc5.class == obj.getClass()) {
                zc5 zc5Var = (zc5) obj;
                if (this.x.equals(zc5Var.x) && this.y == zc5Var.y && this.z == zc5Var.z && a34.i(this.A, zc5Var.A) && a34.i(this.B, zc5Var.B) && a34.i(this.C, zc5Var.C) && this.D == zc5Var.D && a34.i(this.E, zc5Var.E)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int g = zo5.g(zo5.g((this.y.hashCode() + (this.x.hashCode() * 31)) * 31, 31, this.z), 31, false);
        i42 i42Var = this.A;
        if (i42Var != null) {
            i = i42Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (g + i) * 31;
        u34 u34Var = this.B;
        if (u34Var != null) {
            i2 = u34Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        fa0 fa0Var = this.C;
        if (fa0Var != null) {
            i3 = fa0Var.hashCode();
        } else {
            i3 = 0;
        }
        int g2 = zo5.g((i6 + i3) * 31, 31, this.D);
        fc fcVar = this.E;
        if (fcVar != null) {
            i4 = fcVar.hashCode();
        }
        return g2 + i4;
    }
}
