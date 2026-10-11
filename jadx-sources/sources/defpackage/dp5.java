package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dp5 {
    public final Object a;
    public final long b;
    public final y5 c;
    public final boolean d;

    public dp5(cp5 cp5Var) {
        this.a = cp5Var.a;
        this.b = cp5Var.b;
        this.c = cp5Var.c;
        this.d = cp5Var.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dp5) {
                dp5 dp5Var = (dp5) obj;
                if (this.a.equals(dp5Var.a) && this.b == dp5Var.b && this.c.equals(dp5Var.c) && this.d == dp5Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 217) * 31;
        long j = this.b;
        return ((this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.d ? 1 : 0);
    }
}
