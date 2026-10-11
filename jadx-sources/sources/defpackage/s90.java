package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s90 extends d04 {
    public final dg x;

    public s90(dg dgVar) {
        this.x = dgVar;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new u90(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        u90 u90Var = (u90) xz3Var;
        dg dgVar = this.x;
        u90Var.L = dgVar;
        if (u90Var.K) {
            dgVar.invoke(u90Var.M);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s90) {
                if (this.x != ((s90) obj).x) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
