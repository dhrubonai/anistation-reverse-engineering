package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class nn6 extends d04 {
    public final w32 x;

    public nn6(w32 w32Var) {
        this.x = w32Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, a03, on6] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? a03Var = new a03();
        a03Var.N = this.x;
        return a03Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        on6 on6Var = (on6) xz3Var;
        w32 w32Var = on6Var.N;
        w32 w32Var2 = this.x;
        if (!w32Var2.equals(w32Var)) {
            on6Var.N = w32Var2;
            on6Var.b1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn6)) {
            return false;
        }
        return ((nn6) obj).x.equals(this.x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
