package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xi4 extends d04 {
    public final bg x;

    public xi4(bg bgVar) {
        this.x = bgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, wi4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        wi4 wi4Var = (wi4) xz3Var;
        wi4Var.L = this.x;
        z51.w(wi4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xi4) {
                if (this.x == ((xi4) obj).x) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
