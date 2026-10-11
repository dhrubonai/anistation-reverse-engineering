package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zq5 extends d04 {
    public final float A;
    public final boolean B;
    public final float x;
    public final float y;
    public final float z;

    public zq5(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, br5] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        xz3Var.O = this.A;
        xz3Var.P = this.B;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        br5 br5Var = (br5) xz3Var;
        br5Var.L = this.x;
        br5Var.M = this.y;
        br5Var.N = this.z;
        br5Var.O = this.A;
        br5Var.P = this.B;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zq5) {
                zq5 zq5Var = (zq5) obj;
                if (!vm1.c(this.x, zq5Var.x) || !vm1.c(this.y, zq5Var.y) || !vm1.c(this.z, zq5Var.z) || !vm1.c(this.A, zq5Var.A) || this.B != zq5Var.B) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.B) + qx1.b(this.A, qx1.b(this.z, qx1.b(this.y, Float.hashCode(this.x) * 31, 31), 31), 31);
    }

    public zq5(float f, float f2, float f3, float f4, boolean z) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = z;
    }
}
