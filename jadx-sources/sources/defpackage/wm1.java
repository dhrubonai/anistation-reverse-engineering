package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wm1 implements g11 {
    public final float a;

    public wm1(float f) {
        this.a = f;
    }

    @Override // defpackage.g11
    public final float a(long j, ud1 ud1Var) {
        return ud1Var.g0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof wm1) || !vm1.c(this.a, ((wm1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
