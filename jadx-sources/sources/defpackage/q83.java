package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q83 {
    public final Float a;
    public ar1 b;

    public q83(Float f, ar1 ar1Var) {
        this.a = f;
        this.b = ar1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q83) {
            q83 q83Var = (q83) obj;
            if (q83Var.a.equals(this.a) && a34.i(q83Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + qx1.c(0, this.a.hashCode() * 31, 31);
    }
}
