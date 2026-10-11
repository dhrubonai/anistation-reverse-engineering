package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x60 extends d04 {
    public final ub2 x;

    public x60(ub2 ub2Var) {
        this.x = ub2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new y60(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        fa4 fa4Var;
        y60 y60Var = (y60) xz3Var;
        ub2 ub2Var = this.x;
        y60Var.L = ub2Var;
        if (y60Var.x.K && (fa4Var = wc7.M(y60Var, 2).S) != null) {
            fa4Var.y1(ub2Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        if (this.x == ((x60) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
