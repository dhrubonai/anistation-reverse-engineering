package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gy extends s84 {
    public final r84 a;
    public final q84 b;

    public gy(r84 r84Var, q84 q84Var) {
        this.a = r84Var;
        this.b = q84Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s84) {
            s84 s84Var = (s84) obj;
            r84 r84Var = this.a;
            if (r84Var != null ? r84Var.equals(((gy) s84Var).a) : ((gy) s84Var).a == null) {
                q84 q84Var = this.b;
                if (q84Var != null ? q84Var.equals(((gy) s84Var).b) : ((gy) s84Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        r84 r84Var = this.a;
        if (r84Var == null) {
            hashCode = 0;
        } else {
            hashCode = r84Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        q84 q84Var = this.b;
        if (q84Var != null) {
            i = q84Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
