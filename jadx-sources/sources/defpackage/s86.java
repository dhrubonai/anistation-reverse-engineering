package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s86 extends d04 {
    public final ic2 x;

    public s86(ic2 ic2Var) {
        this.x = ic2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new u86(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((u86) xz3Var).N = this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s86)) {
            return false;
        }
        if (this.x == ((s86) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ic2 ic2Var = this.x;
        if (ic2Var != null) {
            return ic2Var.hashCode();
        }
        return 0;
    }
}
