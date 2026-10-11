package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class um2 {
    public final byte a;
    public final char b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public um2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof um2) {
                um2 um2Var = (um2) obj;
                if (this.a != um2Var.a || this.b != um2Var.b || this.c != um2Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qx1.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.k(this.c, ")", qx1.u("AvcLevelLimit(level=", this.a, ", maxFrameMacroblocks=", this.b, ", maxDecodedPictureBuffer="));
    }
}
