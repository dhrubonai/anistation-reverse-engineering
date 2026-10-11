package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qm0 extends d04 implements qh5 {
    public final ub2 x;

    public qm0(ub2 ub2Var) {
        this.x = ub2Var;
    }

    @Override // defpackage.qh5
    public final ph5 L0() {
        ph5 ph5Var = new ph5();
        ph5Var.z = false;
        ph5Var.A = true;
        this.x.invoke(ph5Var);
        return ph5Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new n01(false, true, this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((n01) xz3Var).N = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm0)) {
            return false;
        }
        if (this.x == ((qm0) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
