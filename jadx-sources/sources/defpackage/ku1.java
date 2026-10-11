package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ku1 {
    public final mu2 a;
    public final boolean b;
    public final p41 c;
    public final String d;

    public ku1(mu2 mu2Var, boolean z, p41 p41Var, String str) {
        this.a = mu2Var;
        this.b = z;
        this.c = p41Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku1)) {
            return false;
        }
        ku1 ku1Var = (ku1) obj;
        if (a34.i(this.a, ku1Var.a) && this.b == ku1Var.b && this.c == ku1Var.c && a34.i(this.d, ku1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + zo5.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
