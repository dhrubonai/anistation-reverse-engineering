package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mo1<T> extends d04 {
    public final d9 x;
    public final ic2 y;

    public mo1(d9 d9Var, ic2 ic2Var) {
        this.x = d9Var;
        this.y = ic2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, no1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = rg4.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        no1 no1Var = (no1) xz3Var;
        no1Var.L = this.x;
        no1Var.M = this.y;
        no1Var.N = rg4.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mo1) {
            mo1 mo1Var = (mo1) obj;
            if (a34.i(this.x, mo1Var.x) && this.y == mo1Var.y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return rg4.x.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31);
    }
}
