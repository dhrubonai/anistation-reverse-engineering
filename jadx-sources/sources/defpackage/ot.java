package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ot implements pt {
    public final xh4 a;
    public final o26 b;

    public ot(xh4 xh4Var, o26 o26Var) {
        this.a = xh4Var;
        this.b = o26Var;
    }

    @Override // defpackage.pt
    public final xh4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ot) {
                ot otVar = (ot) obj;
                if (!this.a.equals(otVar.a) || !this.b.equals(otVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
