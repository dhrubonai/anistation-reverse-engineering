package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d96 extends d04 {
    public final v01 A;
    public final fg6 x;
    public final s96 y;
    public final eb6 z;

    public d96(fg6 fg6Var, s96 s96Var, eb6 eb6Var, v01 v01Var) {
        this.x = fg6Var;
        this.y = s96Var;
        this.z = eb6Var;
        this.A = v01Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new f96(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        eg6 eg6Var;
        f96 f96Var = (f96) xz3Var;
        f96Var.N.a = null;
        fg6 fg6Var = this.x;
        f96Var.N = fg6Var;
        fg6Var.a = f96Var;
        if (f96Var.K) {
            eg6Var = eg6.z;
        } else {
            eg6Var = eg6.y;
        }
        fg6Var.b = eg6Var;
        f96Var.O = this.y;
        f96Var.P = this.z;
        f96Var.Q = this.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d96) {
                d96 d96Var = (d96) obj;
                if (this.x != d96Var.x || this.y != d96Var.y || this.z != d96Var.z || this.A != d96Var.A) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31);
    }
}
