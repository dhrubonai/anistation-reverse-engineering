package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class to6 extends d04 {
    public final float x;
    public final float y;

    public to6(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, uo6] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        uo6 uo6Var = (uo6) xz3Var;
        uo6Var.L = this.x;
        uo6Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof to6) {
            to6 to6Var = (to6) obj;
            if (vm1.c(this.x, to6Var.x) && vm1.c(this.y, to6Var.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }
}
