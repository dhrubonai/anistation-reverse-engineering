package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f13 extends d13 {
    public static final f13 A = new d13(1, 0, 1);

    @Override // defpackage.d13
    public final boolean equals(Object obj) {
        if (obj instanceof f13) {
            if (!isEmpty() || !((f13) obj).isEmpty()) {
                f13 f13Var = (f13) obj;
                if (this.x == f13Var.x && this.y == f13Var.y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.d13
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.x * 31) + this.y;
    }

    @Override // defpackage.d13
    public final boolean isEmpty() {
        if (this.x > this.y) {
            return true;
        }
        return false;
    }

    @Override // defpackage.d13
    public final String toString() {
        return this.x + ".." + this.y;
    }
}
