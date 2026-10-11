package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fx4 extends d04 {
    public final float A;
    public final boolean x;
    public final sb2 y;
    public final mx4 z;

    public fx4(boolean z, sb2 sb2Var, mx4 mx4Var, float f) {
        this.x = z;
        this.y = sb2Var;
        this.z = mx4Var;
        this.A = f;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new lx4(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        lx4 lx4Var = (lx4) xz3Var;
        lx4Var.O = this.y;
        lx4Var.P = true;
        lx4Var.Q = this.z;
        lx4Var.R = this.A;
        boolean z = lx4Var.N;
        boolean z2 = this.x;
        if (z != z2) {
            lx4Var.N = z2;
            tl7.z(lx4Var.O0(), null, null, new nf6(lx4Var, null, (byte) 4), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fx4) {
                fx4 fx4Var = (fx4) obj;
                if (this.x != fx4Var.x || this.y != fx4Var.y || !a34.i(this.z, fx4Var.z) || !vm1.c(this.A, fx4Var.A)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.A) + ((this.z.hashCode() + ((this.y.hashCode() + zo5.g(Boolean.hashCode(this.x) * 31, 31, true)) * 31)) * 31);
    }
}
