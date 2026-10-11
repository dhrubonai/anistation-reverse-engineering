package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk6 implements qx4 {
    public final String a;

    public zk6(im0 im0Var) {
        this.a = f73.a(im0Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zk6.class == obj.getClass() && this.a.equals(((zk6) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qx4
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
