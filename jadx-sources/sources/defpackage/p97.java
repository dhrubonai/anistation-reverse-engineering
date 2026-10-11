package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p97 extends d04 {
    public final float x;

    public p97(float f) {
        this.x = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, s97] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((s97) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p97) && Float.compare(this.x, ((p97) obj).x) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.x);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.x + ")";
    }
}
