package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oy2 implements ll {
    public final gq1 a;

    public oy2(gq1 gq1Var) {
        this.a = gq1Var;
        if (gq1Var instanceof sk6) {
            sk6 sk6Var = (sk6) gq1Var;
            if (sk6Var.a != 0 || sk6Var.b != 0) {
                return;
            }
        } else if (!(gq1Var instanceof dt5) && (!(gq1Var instanceof s83) || ((s83) gq1Var).a.a != 0)) {
            return;
        }
        ze0.k("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.ll
    public final kr6 a(tk6 tk6Var) {
        return new d71(this.a.a(tk6Var));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof oy2) && ((oy2) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((c35.x.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
