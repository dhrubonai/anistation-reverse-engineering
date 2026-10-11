package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tq5 {
    public static final tq5 c;
    public final mg1 a;
    public final mg1 b;

    static {
        lg1 lg1Var = lg1.a;
        c = new tq5(lg1Var, lg1Var);
    }

    public tq5(mg1 mg1Var, mg1 mg1Var2) {
        this.a = mg1Var;
        this.b = mg1Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tq5) {
                tq5 tq5Var = (tq5) obj;
                if (!this.a.equals(tq5Var.a) || !this.b.equals(tq5Var.b)) {
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
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
