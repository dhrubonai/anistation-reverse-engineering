package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ho2 extends d04 {
    public final u34 x;

    public ho2(u34 u34Var) {
        this.x = u34Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, lo2] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        lo2 lo2Var = (lo2) xz3Var;
        u34 u34Var = lo2Var.L;
        u34 u34Var2 = this.x;
        if (!a34.i(u34Var, u34Var2)) {
            lo2Var.c1();
            lo2Var.L = u34Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ho2) && a34.i(((ho2) obj).x, this.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() * 31;
    }
}
