package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d03 extends d04 {
    public final t47 x;

    public d03(t47 t47Var) {
        this.x = t47Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new f03(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        f03 f03Var = (f03) xz3Var;
        t47 t47Var = f03Var.N;
        t47 t47Var2 = this.x;
        if (!a34.i(t47Var2, t47Var)) {
            f03Var.N = t47Var2;
            f03Var.b1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        return a34.i(((d03) obj).x, this.x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
