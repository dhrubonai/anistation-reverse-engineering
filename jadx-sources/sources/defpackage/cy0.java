package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cy0 {
    public final int a;
    public final long b;
    public final dy0 c;
    public final eo3 d;

    public cy0(int i, long j, dy0 dy0Var, eo3 eo3Var) {
        this.a = i;
        this.b = j;
        this.c = dy0Var;
        this.d = eo3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cy0) {
                cy0 cy0Var = (cy0) obj;
                if (this.a != cy0Var.a || this.b != cy0Var.b || this.c != cy0Var.c || !a34.i(this.d, cy0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + qx1.d(Integer.hashCode(this.a) * 31, this.b, 31)) * 31;
        eo3 eo3Var = this.d;
        if (eo3Var == null) {
            hashCode = 0;
        } else {
            hashCode = eo3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
