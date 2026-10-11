package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jr6 extends hr6 {
    public final ka0 A;
    public final float B;
    public final ka0 C;
    public final float D;
    public final float E;
    public final int F;
    public final int G;
    public final float H;
    public final float I;
    public final float J;
    public final float K;
    public final String x;
    public final List y;
    public final int z;

    public jr6(String str, List list, int i, ka0 ka0Var, float f, ka0 ka0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.x = str;
        this.y = list;
        this.z = i;
        this.A = ka0Var;
        this.B = f;
        this.C = ka0Var2;
        this.D = f2;
        this.E = f3;
        this.F = i2;
        this.G = i3;
        this.H = f4;
        this.I = f5;
        this.J = f6;
        this.K = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jr6.class == obj.getClass()) {
                jr6 jr6Var = (jr6) obj;
                if (this.x.equals(jr6Var.x) && a34.i(this.A, jr6Var.A) && this.B == jr6Var.B && a34.i(this.C, jr6Var.C) && this.D == jr6Var.D && this.E == jr6Var.E && this.F == jr6Var.F && this.G == jr6Var.G && this.H == jr6Var.H && this.I == jr6Var.I && this.J == jr6Var.J && this.K == jr6Var.K && this.z == jr6Var.z && a34.i(this.y, jr6Var.y)) {
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
        int j = zo5.j(this.y, this.x.hashCode() * 31, 31);
        int i2 = 0;
        ka0 ka0Var = this.A;
        if (ka0Var != null) {
            i = ka0Var.hashCode();
        } else {
            i = 0;
        }
        int b = qx1.b(this.B, (j + i) * 31, 31);
        ka0 ka0Var2 = this.C;
        if (ka0Var2 != null) {
            i2 = ka0Var2.hashCode();
        }
        return Integer.hashCode(this.z) + qx1.b(this.K, qx1.b(this.J, qx1.b(this.I, qx1.b(this.H, qx1.c(this.G, qx1.c(this.F, qx1.b(this.E, qx1.b(this.D, (b + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
