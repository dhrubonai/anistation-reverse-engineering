package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q62 {
    public final void a(ro3 ro3Var, ro3 ro3Var2, long j) {
        long n = v94.n(j, nb3.x);
        if (ro3Var != null) {
            int k = ro3Var.k(rx0.g(n));
            new w03(w03.a(k, ro3Var.O(k)));
        }
        if (ro3Var2 != null) {
            int k2 = ro3Var2.k(rx0.g(n));
            new w03(w03.a(k2, ro3Var2.O(k2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof q62)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qx1.c(0, p62.x.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + p62.x + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
