package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vq5 extends d04 {
    public final tw5 x;

    public vq5(tw5 tw5Var) {
        this.x = tw5Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new yq5(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((yq5) xz3Var).M = this.x;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vq5) && ((vq5) obj).x.equals(this.x)) {
            y50 y50Var = pk2.y;
            if (y50Var.equals(y50Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.x.hashCode() * 31)) * 31;
    }
}
