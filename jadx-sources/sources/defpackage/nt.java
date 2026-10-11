package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nt implements pt {
    public final xh4 a;

    public nt(xh4 xh4Var) {
        this.a = xh4Var;
    }

    @Override // defpackage.pt
    public final xh4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nt) && a34.i(this.a, ((nt) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        xh4 xh4Var = this.a;
        if (xh4Var == null) {
            return 0;
        }
        return xh4Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
