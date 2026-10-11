package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yz extends d04 {
    public final long x;
    public final ka0 y;
    public final om5 z;

    public yz(long j, oh3 oh3Var, om5 om5Var, int i) {
        j = (i & 1) != 0 ? ep0.i : j;
        oh3Var = (i & 2) != 0 ? null : oh3Var;
        this.x = j;
        this.y = oh3Var;
        this.z = om5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, a00] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = 1.0f;
        xz3Var.O = this.z;
        xz3Var.P = 9205357640488583168L;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        a00 a00Var = (a00) xz3Var;
        a00Var.L = this.x;
        a00Var.M = this.y;
        a00Var.N = 1.0f;
        om5 om5Var = a00Var.O;
        om5 om5Var2 = this.z;
        if (!a34.i(om5Var, om5Var2)) {
            a00Var.O = om5Var2;
            z51.w(a00Var);
        }
        v94.y(a00Var);
    }

    public final boolean equals(Object obj) {
        yz yzVar;
        if (obj instanceof yz) {
            yzVar = (yz) obj;
        } else {
            yzVar = null;
        }
        if (yzVar != null) {
            long j = yzVar.x;
            int i = ep0.j;
            if (cm6.a(this.x, j) && a34.i(this.y, yzVar.y) && a34.i(this.z, yzVar.z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ep0.j;
        int hashCode = Long.hashCode(this.x) * 31;
        ka0 ka0Var = this.y;
        if (ka0Var != null) {
            i = ka0Var.hashCode();
        } else {
            i = 0;
        }
        return this.z.hashCode() + qx1.b(1.0f, (hashCode + i) * 31, 31);
    }
}
