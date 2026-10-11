package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z22 extends d04 {
    public final tg1 x;
    public final float y;

    public z22(tg1 tg1Var, float f) {
        this.x = tg1Var;
        this.y = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, a32] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        a32 a32Var = (a32) xz3Var;
        a32Var.L = this.x;
        a32Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z22) {
                z22 z22Var = (z22) obj;
                if (this.x == z22Var.x && this.y == z22Var.y) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (this.x.hashCode() * 31);
    }
}
