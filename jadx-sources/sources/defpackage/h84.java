package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h84 extends d04 {
    public final d84 x;
    public final g84 y;

    public h84(d84 d84Var, g84 g84Var) {
        this.x = d84Var;
        this.y = g84Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new k84(this.x, this.y);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        k84 k84Var = (k84) xz3Var;
        k84Var.L = this.x;
        g84 g84Var = k84Var.M;
        if (g84Var.a == k84Var) {
            g84Var.a = null;
            g84Var.d = null;
            g84Var.c = bb4.K;
        }
        g84 g84Var2 = this.y;
        if (g84Var2 == null) {
            g84Var = new g84();
            k84Var.M = g84Var;
        } else if (g84Var2 != g84Var) {
            k84Var.M = g84Var2;
            g84Var = g84Var2;
        }
        if (k84Var.K) {
            g84Var.a = k84Var;
            g84Var.b = null;
            k84Var.N = null;
            g84Var.c = new vt0(k84Var, (byte) 26);
            g84Var.d = k84Var.O0();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h84)) {
            return false;
        }
        h84 h84Var = (h84) obj;
        if (!a34.i(h84Var.x, this.x) || !a34.i(h84Var.y, this.y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.x.hashCode() * 31;
        g84 g84Var = this.y;
        if (g84Var != null) {
            i = g84Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
