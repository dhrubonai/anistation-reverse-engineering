package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yc4 extends d04 {
    public final float x;
    public final float y;

    public yc4(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, zc4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = true;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        zc4 zc4Var = (zc4) xz3Var;
        float f = zc4Var.L;
        float f2 = this.x;
        boolean c = vm1.c(f, f2);
        float f3 = this.y;
        if (!c || !vm1.c(zc4Var.M, f3) || !zc4Var.N) {
            wc7.O(zc4Var).V(false);
        }
        zc4Var.L = f2;
        zc4Var.M = f3;
        zc4Var.N = true;
    }

    public final boolean equals(Object obj) {
        yc4 yc4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof yc4) {
            yc4Var = (yc4) obj;
        } else {
            yc4Var = null;
        }
        if (yc4Var != null && vm1.c(this.x, yc4Var.x) && vm1.c(this.y, yc4Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qx1.b(this.y, Float.hashCode(this.x) * 31, 31);
    }

    public final String toString() {
        return qx1.n("OffsetModifierElement(x=", vm1.d(this.x), ", y=", vm1.d(this.y), ", rtlAware=true)");
    }
}
