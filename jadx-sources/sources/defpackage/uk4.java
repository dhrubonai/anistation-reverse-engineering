package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uk4 {
    public final bm1 a;
    public final String b;
    public final boolean c;

    public uk4(bm1 bm1Var, String str, boolean z) {
        this.a = bm1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uk4) {
                uk4 uk4Var = (uk4) obj;
                if (this.a != uk4Var.a || !this.b.equals(uk4Var.b) || this.c != uk4Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.i(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingDownloadRequest(target=");
        sb.append(this.a);
        sb.append(", quality=");
        sb.append(this.b);
        sb.append(", requiresAd=");
        return qx1.r(sb, this.c, ")");
    }
}
