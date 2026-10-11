package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x87 extends d04 {
    public final tg1 x;
    public final ic2 y;
    public final Object z;

    public x87(tg1 tg1Var, ic2 ic2Var, Object obj) {
        this.x = tg1Var;
        this.y = ic2Var;
        this.z = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, z87] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        z87 z87Var = (z87) xz3Var;
        z87Var.L = this.x;
        z87Var.M = this.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x87.class == obj.getClass()) {
                x87 x87Var = (x87) obj;
                if (this.x != x87Var.x || !a34.i(this.z, x87Var.z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.z.hashCode() + zo5.g(this.x.hashCode() * 31, 31, false);
    }
}
