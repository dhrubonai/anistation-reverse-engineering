package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e94 {
    public final String a;
    public final String b;
    public final b94 c;
    public final g12 d;

    public e94(String str, String str2, b94 b94Var, g12 g12Var) {
        this.a = str;
        this.b = str2;
        this.c = b94Var;
        this.d = g12Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e94) {
                e94 e94Var = (e94) obj;
                if (!this.a.equals(e94Var.a) || !a34.i(this.b, e94Var.b) || !this.c.equals(e94Var.c) || !a34.i(this.d, e94Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + zo5.i(this.b, this.a.hashCode() * 31, 31)) * 961);
    }

    public final String toString() {
        StringBuilder o = h11.o("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        o.append(this.c);
        o.append(", body=null, extras=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
