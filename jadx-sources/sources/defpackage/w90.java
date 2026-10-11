package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w90 extends d04 {
    public final y90 x;

    public w90(y90 y90Var) {
        this.x = y90Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new z90(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        z90 z90Var = (z90) xz3Var;
        y90 y90Var = z90Var.L;
        if (y90Var != null) {
            y90Var.a.k(z90Var);
        }
        y90 y90Var2 = this.x;
        if (y90Var2 != null) {
            y90Var2.a.b(z90Var);
        }
        z90Var.L = y90Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w90) {
                if (!a34.i(this.x, ((w90) obj).x)) {
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
