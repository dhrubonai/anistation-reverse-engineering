package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bd5 extends d04 {
    public final boolean A;
    public final u34 B;
    public final kd5 x;
    public final rg4 y;
    public final boolean z;

    public bd5(kd5 kd5Var, rg4 rg4Var, boolean z, boolean z2, u34 u34Var) {
        this.x = kd5Var;
        this.y = rg4Var;
        this.z = z;
        this.A = z2;
        this.B = u34Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new jd5(null, null, null, this.B, this.y, this.x, this.z, this.A);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((jd5) xz3Var).v1(null, null, null, this.B, this.y, this.x, this.z, this.A);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bd5) {
                bd5 bd5Var = (bd5) obj;
                if (!a34.i(this.x, bd5Var.x) || this.y != bd5Var.y || this.z != bd5Var.z || this.A != bd5Var.A || !a34.i(this.B, bd5Var.B)) {
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
        int g = zo5.g(zo5.g((this.y.hashCode() + (this.x.hashCode() * 31)) * 961, 31, this.z), 961, this.A);
        u34 u34Var = this.B;
        if (u34Var != null) {
            i = u34Var.hashCode();
        } else {
            i = 0;
        }
        return (g + i) * 31;
    }
}
