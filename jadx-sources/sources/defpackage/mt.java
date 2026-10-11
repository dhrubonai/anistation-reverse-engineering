package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mt implements pt {
    public final xh4 a;
    public final jw1 b;

    public mt(xh4 xh4Var, jw1 jw1Var) {
        this.a = xh4Var;
        this.b = jw1Var;
    }

    @Override // defpackage.pt
    public final xh4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mt) {
                mt mtVar = (mt) obj;
                if (!a34.i(this.a, mtVar.a) || !this.b.equals(mtVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        xh4 xh4Var = this.a;
        if (xh4Var == null) {
            hashCode = 0;
        } else {
            hashCode = xh4Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
