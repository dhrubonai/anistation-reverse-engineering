package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sd5 {
    public static final sd5 b;
    public final zw2 a;

    static {
        sn3 sn3Var = new sn3((byte) 14, false);
        sn3Var.y = zw2.p(1, 5);
        b = new sd5(sn3Var);
    }

    public sd5(sn3 sn3Var) {
        this.a = (zw2) sn3Var.y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof sd5) && this.a.equals(((sd5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
