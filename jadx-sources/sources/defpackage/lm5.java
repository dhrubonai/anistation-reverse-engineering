package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lm5 extends d04 {
    public final long A;
    public final long B;
    public final float x;
    public final om5 y;
    public final boolean z;

    public lm5(float f, om5 om5Var, boolean z, long j, long j2) {
        this.x = f;
        this.y = om5Var;
        this.z = z;
        this.A = j;
        this.B = j2;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new y60(new pz3(this, (byte) 29));
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        fa4 fa4Var;
        y60 y60Var = (y60) xz3Var;
        pz3 pz3Var = new pz3(this, (byte) 29);
        y60Var.L = pz3Var;
        if (y60Var.x.K && (fa4Var = wc7.M(y60Var, 2).S) != null) {
            fa4Var.y1(pz3Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lm5) {
                lm5 lm5Var = (lm5) obj;
                if (vm1.c(this.x, lm5Var.x) && a34.i(this.y, lm5Var.y) && this.z == lm5Var.z) {
                    long j = lm5Var.A;
                    int i = ep0.j;
                    if (!cm6.a(this.A, j) || !cm6.a(this.B, lm5Var.B)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int g = zo5.g((this.y.hashCode() + (Float.hashCode(this.x) * 31)) * 31, 31, this.z);
        int i = ep0.j;
        return Long.hashCode(this.B) + qx1.d(g, this.A, 31);
    }

    public final String toString() {
        String d = vm1.d(this.x);
        String h = ep0.h(this.A);
        String h2 = ep0.h(this.B);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(d);
        sb.append(", shape=");
        sb.append(this.y);
        sb.append(", clip=");
        sb.append(this.z);
        sb.append(", ambientColor=");
        sb.append(h);
        sb.append(", spotColor=");
        return h11.k(sb, h2, ")");
    }
}
