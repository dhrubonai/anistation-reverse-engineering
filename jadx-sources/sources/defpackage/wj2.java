package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wj2 {
    public final vj2 a;
    public final oo5 b;
    public final xb4 c;
    public final String d;

    public wj2(vj2 vj2Var, oo5 oo5Var, xb4 xb4Var) {
        this.a = vj2Var;
        this.b = oo5Var;
        this.c = xb4Var;
        this.d = vj2Var.name() + "with" + oo5Var.name();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wj2) {
                wj2 wj2Var = (wj2) obj;
                if (this.a != wj2Var.a || this.b != wj2Var.b || !a34.i(this.c, wj2Var.c)) {
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
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xb4 xb4Var = this.c;
        if (xb4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xb4Var.a.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "HashAndSign(hash=" + this.a + ", sign=" + this.b + ", oid=" + this.c + ')';
    }
}
