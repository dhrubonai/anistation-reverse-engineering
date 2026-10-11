package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mn6 implements t47 {
    public final t47 a;
    public final t47 b;

    public mn6(t47 t47Var, t47 t47Var2) {
        this.a = t47Var;
        this.b = t47Var2;
    }

    @Override // defpackage.t47
    public final int a(ud1 ud1Var) {
        return Math.max(this.a.a(ud1Var), this.b.a(ud1Var));
    }

    @Override // defpackage.t47
    public final int b(ud1 ud1Var, ia3 ia3Var) {
        return Math.max(this.a.b(ud1Var, ia3Var), this.b.b(ud1Var, ia3Var));
    }

    @Override // defpackage.t47
    public final int c(ud1 ud1Var) {
        return Math.max(this.a.c(ud1Var), this.b.c(ud1Var));
    }

    @Override // defpackage.t47
    public final int d(ud1 ud1Var, ia3 ia3Var) {
        return Math.max(this.a.d(ud1Var, ia3Var), this.b.d(ud1Var, ia3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn6)) {
            return false;
        }
        mn6 mn6Var = (mn6) obj;
        if (a34.i(mn6Var.a, this.a) && a34.i(mn6Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
