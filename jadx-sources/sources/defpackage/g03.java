package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g03 implements th4 {
    public final t47 a;
    public final ud1 b;

    public g03(t47 t47Var, ud1 ud1Var) {
        this.a = t47Var;
        this.b = ud1Var;
    }

    @Override // defpackage.th4
    public final float a() {
        t47 t47Var = this.a;
        ud1 ud1Var = this.b;
        return ud1Var.T(t47Var.c(ud1Var));
    }

    @Override // defpackage.th4
    public final float b(ia3 ia3Var) {
        t47 t47Var = this.a;
        ud1 ud1Var = this.b;
        return ud1Var.T(t47Var.d(ud1Var, ia3Var));
    }

    @Override // defpackage.th4
    public final float c(ia3 ia3Var) {
        t47 t47Var = this.a;
        ud1 ud1Var = this.b;
        return ud1Var.T(t47Var.b(ud1Var, ia3Var));
    }

    @Override // defpackage.th4
    public final float d() {
        t47 t47Var = this.a;
        ud1 ud1Var = this.b;
        return ud1Var.T(t47Var.a(ud1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g03)) {
            return false;
        }
        g03 g03Var = (g03) obj;
        if (a34.i(this.a, g03Var.a) && a34.i(this.b, g03Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
