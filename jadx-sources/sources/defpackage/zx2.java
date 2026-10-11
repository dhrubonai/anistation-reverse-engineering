package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zx2 extends d04 {
    public final u34 x;
    public final by2 y;

    public zx2(u34 u34Var, by2 by2Var) {
        this.x = u34Var;
        this.y = by2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, zc1, ay2] */
    @Override // defpackage.d04
    public final xz3 a() {
        yc1 a = this.y.a(this.x);
        ?? zc1Var = new zc1();
        zc1Var.N = a;
        zc1Var.a1(a);
        return zc1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ay2 ay2Var = (ay2) xz3Var;
        yc1 a = this.y.a(this.x);
        ay2Var.b1(ay2Var.N);
        ay2Var.N = a;
        ay2Var.a1(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx2)) {
            return false;
        }
        zx2 zx2Var = (zx2) obj;
        if (a34.i(this.x, zx2Var.x) && a34.i(this.y, zx2Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }
}
