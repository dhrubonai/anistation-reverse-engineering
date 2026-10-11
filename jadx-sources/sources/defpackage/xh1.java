package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xh1 extends d04 {
    public final od3 x;

    public xh1(od3 od3Var) {
        this.x = od3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, yh1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        yh1 yh1Var = (yh1) xz3Var;
        od3 od3Var = yh1Var.L;
        od3 od3Var2 = this.x;
        if (!a34.i(od3Var, od3Var2) && yh1Var.x.K) {
            od3 od3Var3 = yh1Var.L;
            od3Var3.e();
            od3Var3.b = null;
            od3Var3.c = -1;
            od3Var2.j = yh1Var;
            yh1Var.L = od3Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xh1) && a34.i(this.x, ((xh1) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.x + ")";
    }
}
