package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class su2 implements r12 {
    public final mu2 a;
    public final boolean b;
    public final p41 c;

    public su2(mu2 mu2Var, boolean z, p41 p41Var) {
        this.a = mu2Var;
        this.b = z;
        this.c = p41Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof su2) {
                su2 su2Var = (su2) obj;
                if (!this.a.equals(su2Var.a) || this.b != su2Var.b || this.c != su2Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
