package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wp5 {
    public final Object a;
    public final j74 b;
    public final List c;
    public final List d;
    public final os0 e = new os0(-322904035, true, new x64(this, 1));

    public wp5(Object obj, j74 j74Var, List list) {
        this.a = obj;
        this.b = j74Var;
        this.c = list;
        this.d = te4.H(j74Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wp5.class == obj.getClass()) {
                wp5 wp5Var = (wp5) obj;
                if (a34.i(this.a, wp5Var.a) && a34.i(this.b, wp5Var.b) && this.c.equals(wp5Var.c) && a34.i(this.d, wp5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.a + ", entry=" + this.b + ", previousEntries=" + this.c + ", entries=" + this.d + ")";
    }
}
