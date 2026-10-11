package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mk<S> extends d04 {
    public final qi6 x;
    public final w44 y;
    public final qk z;

    public mk(qi6 qi6Var, w44 w44Var, qk qkVar) {
        this.x = qi6Var;
        this.y = w44Var;
        this.z = qkVar;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new pk(this.x, this.y, this.z);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        pk pkVar = (pk) xz3Var;
        pkVar.M = this.x;
        pkVar.N = this.y;
        pkVar.O = this.z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mk) {
            mk mkVar = (mk) obj;
            if (a34.i(mkVar.x, this.x) && mkVar.y.equals(this.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.z.hashCode() * 31;
        qi6 qi6Var = this.x;
        if (qi6Var != null) {
            i = qi6Var.hashCode();
        } else {
            i = 0;
        }
        return this.y.hashCode() + ((hashCode + i) * 31);
    }
}
