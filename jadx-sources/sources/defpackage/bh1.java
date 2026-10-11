package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bh1 {
    public final boolean a;
    public final boolean b;
    public final wg1 c;

    public bh1(boolean z, boolean z2, wg1 wg1Var) {
        this.a = z;
        this.b = z2;
        this.c = wg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh1)) {
            return false;
        }
        bh1 bh1Var = (bh1) obj;
        if (this.a == bh1Var.a && this.b == bh1Var.b && a34.i(this.c, bh1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        wg1 wg1Var = this.c;
        if (wg1Var == null) {
            hashCode = 0;
        } else {
            hashCode = wg1Var.hashCode();
        }
        return g + hashCode;
    }

    public final String toString() {
        return "RuntimeState(appForeground=" + this.a + ", hostAttached=" + this.b + ", playback=" + this.c + ")";
    }
}
