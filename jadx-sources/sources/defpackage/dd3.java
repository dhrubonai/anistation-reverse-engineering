package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dd3 extends d04 {
    public final hd3 x;
    public final v90 y;
    public final rg4 z;

    public dd3(hd3 hd3Var, v90 v90Var, rg4 rg4Var) {
        this.x = hd3Var;
        this.y = v90Var;
        this.z = rg4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, gd3] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        gd3 gd3Var = (gd3) xz3Var;
        gd3Var.L = this.x;
        gd3Var.M = this.y;
        gd3Var.N = this.z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd3) {
                dd3 dd3Var = (dd3) obj;
                if (!a34.i(this.x, dd3Var.x) || !a34.i(this.y, dd3Var.y) || this.z != dd3Var.z) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.z.hashCode() + zo5.g((this.y.hashCode() + (this.x.hashCode() * 31)) * 31, 31, false);
    }
}
