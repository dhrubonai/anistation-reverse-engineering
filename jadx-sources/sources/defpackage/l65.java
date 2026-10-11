package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l65 implements by2 {
    public final boolean a;
    public final long b;

    public l65(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.by2
    public final yc1 a(u34 u34Var) {
        return new ld1(u34Var, this.a, new sn3((Object) this, (byte) 12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l65) {
            l65 l65Var = (l65) obj;
            if (this.a != l65Var.a || !vm1.c(Float.NaN, Float.NaN)) {
                return false;
            }
            long j = l65Var.b;
            int i = ep0.j;
            return cm6.a(this.b, j);
        }
        return false;
    }

    @Override // defpackage.by2
    public final int hashCode() {
        int b = qx1.b(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = ep0.j;
        return Long.hashCode(this.b) + b;
    }
}
