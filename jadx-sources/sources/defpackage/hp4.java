package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hp4 {
    public final gp4 a;
    public final int b;

    public hp4(gp4 gp4Var, int i) {
        this.a = gp4Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hp4) {
                hp4 hp4Var = (hp4) obj;
                if (this.a != hp4Var.a || this.b != hp4Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerLockNotice(message=" + this.a + ", sequence=" + this.b + ")";
    }
}
