package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ie4 extends d04 {
    public final ub2 x;

    public ie4(ub2 ub2Var) {
        this.x = ub2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, je4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = -9223372034707292160L;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        je4 je4Var = (je4) xz3Var;
        je4Var.L = this.x;
        je4Var.M = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie4)) {
            return false;
        }
        if (this.x == ((ie4) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
