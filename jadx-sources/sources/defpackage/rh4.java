package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rh4 extends d04 {
    public final float A;
    public final float x;
    public final float y;
    public final float z;

    public rh4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        boolean z4 = true;
        if (f < 0.0f && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = z & z2;
        if (f3 < 0.0f && !Float.isNaN(f3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = z5 & z3;
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z4 = false;
        }
        if (!(z6 & z4)) {
            cz2.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, sh4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        xz3Var.O = this.A;
        xz3Var.P = true;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        sh4 sh4Var = (sh4) xz3Var;
        sh4Var.L = this.x;
        sh4Var.M = this.y;
        sh4Var.N = this.z;
        sh4Var.O = this.A;
        sh4Var.P = true;
    }

    public final boolean equals(Object obj) {
        rh4 rh4Var;
        if (obj instanceof rh4) {
            rh4Var = (rh4) obj;
        } else {
            rh4Var = null;
        }
        if (rh4Var != null && vm1.c(this.x, rh4Var.x) && vm1.c(this.y, rh4Var.y) && vm1.c(this.z, rh4Var.z) && vm1.c(this.A, rh4Var.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qx1.b(this.A, qx1.b(this.z, qx1.b(this.y, Float.hashCode(this.x) * 31, 31), 31), 31);
    }
}
