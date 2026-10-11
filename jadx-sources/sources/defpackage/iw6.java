package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iw6 {
    public final Object a;
    public final cw6 b;
    public int c;
    public boolean d;

    public iw6(Object obj) {
        cw6 cw6Var = new cw6();
        this.a = obj;
        this.b = cw6Var;
        this.c = 0;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iw6) {
                iw6 iw6Var = (iw6) obj;
                if (a34.i(this.a, iw6Var.a) && this.b == iw6Var.b && this.c == iw6Var.c && this.d == iw6Var.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.d) + qx1.c(this.c, (this.b.hashCode() + (hashCode * 31)) * 31, 31);
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", store=" + this.b + ", refCount=" + this.c + ", isDisposable=" + this.d + ")";
    }
}
