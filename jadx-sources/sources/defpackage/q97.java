package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class q97 extends d04 {
    public final float x;
    public final Object y;

    public q97(Object obj, float f) {
        this.x = f;
        this.y = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, r97] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        r97 r97Var = (r97) xz3Var;
        r97Var.L = this.x;
        r97Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q97) {
            q97 q97Var = (q97) obj;
            if (q97Var.x == this.x && a34.i(q97Var.y, this.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.x) * 31;
        Object obj = this.y;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
