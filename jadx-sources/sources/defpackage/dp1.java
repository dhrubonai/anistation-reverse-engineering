package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dp1 extends d04 {
    public final ub2 x;

    public dp1(ub2 ub2Var) {
        this.x = ub2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new ve0(new we0(), this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ve0 ve0Var = (ve0) xz3Var;
        ve0Var.N = this.x;
        ve0Var.a1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp1)) {
            return false;
        }
        if (this.x == ((dp1) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
