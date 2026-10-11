package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ka3 {
    public final int a;
    public final int b;
    public final boolean c;

    public ka3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3Var = (ka3) obj;
        if (this.a == ka3Var.a && this.b == ka3Var.b && this.c == ka3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qx1.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qx1.r(qx1.u("BidiRun(start=", this.a, ", end=", this.b, ", isRtl="), this.c, ")");
    }
}
