package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h08 {
    public final sz7 a;
    public final gj3 b;

    public h08(sz7 sz7Var, gj3 gj3Var) {
        this.a = sz7Var;
        this.b = gj3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h08) {
            h08 h08Var = (h08) obj;
            sz7 sz7Var = h08Var.a;
            sz7 sz7Var2 = this.a;
            if (sz7Var2 != null ? sz7Var2 == sz7Var : sz7Var == null) {
                if (this.b == h08Var.b) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        sz7 sz7Var = this.a;
        if (sz7Var == null) {
            hashCode = 0;
        } else {
            hashCode = sz7Var.hashCode();
        }
        return this.b.hashCode() ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        qx1.x(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
