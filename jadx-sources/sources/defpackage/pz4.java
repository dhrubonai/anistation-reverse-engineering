package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pz4 implements cr5 {
    @Override // defpackage.cr5
    public final Object a(vz0 vz0Var) {
        return tq5.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pz4) {
                tq5 tq5Var = tq5.c;
                if (!tq5Var.equals(tq5Var)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return tq5.c.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + tq5.c + ")";
    }
}
