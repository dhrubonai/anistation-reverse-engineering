package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nm2 {
    public final ea2 a;
    public final String b;
    public final String c;

    public nm2(ea2 ea2Var, String str, String str2) {
        da2 a = ea2Var.a();
        a.a = null;
        a.l = null;
        this.a = new ea2(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nm2) {
                nm2 nm2Var = (nm2) obj;
                if (this.a.equals(nm2Var.a) && Objects.equals(this.b, nm2Var.b) && Objects.equals(this.c, nm2Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
