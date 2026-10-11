package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ob3 extends d04 {
    public final float x;
    public final boolean y;

    public ob3(float f, boolean z) {
        this.x = f;
        this.y = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, pb3] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        pb3 pb3Var = (pb3) xz3Var;
        pb3Var.L = this.x;
        pb3Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        ob3 ob3Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ob3) {
            ob3Var = (ob3) obj;
        } else {
            ob3Var = null;
        }
        if (ob3Var != null && this.x == ob3Var.x && this.y == ob3Var.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }
}
