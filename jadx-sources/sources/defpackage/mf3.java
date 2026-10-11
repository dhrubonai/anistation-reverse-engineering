package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mf3 extends d04 {
    public final tc x;
    public final uf3 y;
    public final jb6 z;

    public mf3(tc tcVar, uf3 uf3Var, jb6 jb6Var) {
        this.x = tcVar;
        this.y = uf3Var;
        this.z = jb6Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new nf3(this.x, this.y, this.z);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        nf3 nf3Var = (nf3) xz3Var;
        if (nf3Var.K) {
            nf3Var.L.d();
            nf3Var.L.k(nf3Var);
        }
        tc tcVar = this.x;
        nf3Var.L = tcVar;
        if (nf3Var.K) {
            if (tcVar.a != null) {
                hz2.c("Expected textInputModifierNode to be null");
            }
            tcVar.a = nf3Var;
        }
        nf3Var.M = this.y;
        nf3Var.N = this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf3) {
            mf3 mf3Var = (mf3) obj;
            if (a34.i(this.x, mf3Var.x) && this.y == mf3Var.y && this.z == mf3Var.z) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.x + ", legacyTextFieldState=" + this.y + ", textFieldSelectionManager=" + this.z + ")";
    }
}
