package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s31 {
    public final px4 a;
    public final boolean b;

    public s31(px4 px4Var, boolean z) {
        this.a = px4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s31) {
            s31 s31Var = (s31) obj;
            if (s31Var.a.equals(this.a) && s31Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
