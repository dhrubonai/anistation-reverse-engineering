package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ld2 implements su0 {
    public final pu0 x;

    public ld2(pu0 pu0Var) {
        this.x = pu0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ld2) {
            if (this.x.equals(((ld2) obj).x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() * 31;
    }
}
