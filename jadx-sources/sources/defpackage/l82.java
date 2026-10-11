package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l82 extends d04 {
    public final u34 x;

    public l82(u34 u34Var) {
        this.x = u34Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new m82(this.x, (aa6) null, 6);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((m82) xz3Var).f1(this.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l82)) {
            return false;
        }
        if (a34.i(this.x, ((l82) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        u34 u34Var = this.x;
        if (u34Var != null) {
            return u34Var.hashCode();
        }
        return 0;
    }
}
