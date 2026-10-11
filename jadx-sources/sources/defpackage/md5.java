package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class md5 extends d04 {
    public final yc5 x;
    public final boolean y;

    public md5(yc5 yc5Var, boolean z) {
        this.x = yc5Var;
        this.y = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, uc5] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        uc5 uc5Var = (uc5) xz3Var;
        uc5Var.L = this.x;
        uc5Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof md5) {
            md5 md5Var = (md5) obj;
            if (a34.i(this.x, md5Var.x) && this.y == md5Var.y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + zo5.g(this.x.hashCode() * 31, 31, false);
    }
}
