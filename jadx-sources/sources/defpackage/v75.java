package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v75 {
    public final List a;
    public final boolean b;

    public v75(u92 u92Var) {
        this.a = u92Var.b;
        this.b = u92Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v75) {
                v75 v75Var = (v75) obj;
                if (this.a.equals(v75Var.a) && this.b == v75Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), null);
    }
}
