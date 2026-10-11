package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bh4 extends bb4 {
    public final m75 O;
    public final id P;

    public bh4(m75 m75Var) {
        id idVar;
        this.O = m75Var;
        if (!bx7.A(m75Var)) {
            idVar = kd.a();
            id.b(idVar, m75Var);
        } else {
            idVar = null;
        }
        this.P = idVar;
    }

    @Override // defpackage.bb4
    public final n05 D() {
        m75 m75Var = this.O;
        return new n05(m75Var.a, m75Var.b, m75Var.c, m75Var.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bh4) {
                if (!this.O.equals(((bh4) obj).O)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.O.hashCode();
    }
}
