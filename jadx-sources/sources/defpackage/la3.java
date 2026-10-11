package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class la3 extends d04 {
    public final Object x;

    public la3(Object obj) {
        this.x = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, ma3] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((ma3) xz3Var).L = this.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof la3) || !this.x.equals(((la3) obj).x)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.x + ")";
    }
}
