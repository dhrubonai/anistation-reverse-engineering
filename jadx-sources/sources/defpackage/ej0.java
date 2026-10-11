package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ej0 {
    public static final ej0 c = new ej0(yo0.N0(new ArrayList()), null);
    public final Set a;
    public final nx7 b;

    public ej0(Set set, nx7 nx7Var) {
        this.a = set;
        this.b = nx7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ej0) {
            ej0 ej0Var = (ej0) obj;
            if (ej0Var.a.equals(this.a) && a34.i(ej0Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() + 1517) * 41;
        nx7 nx7Var = this.b;
        if (nx7Var != null) {
            i = nx7Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
