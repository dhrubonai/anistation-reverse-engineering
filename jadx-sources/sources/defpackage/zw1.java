package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zw1 implements t47 {
    public final t47 a;
    public final t47 b;

    public zw1(t47 t47Var, t47 t47Var2) {
        this.a = t47Var;
        this.b = t47Var2;
    }

    @Override // defpackage.t47
    public final int a(ud1 ud1Var) {
        int a = this.a.a(ud1Var) - this.b.a(ud1Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.t47
    public final int b(ud1 ud1Var, ia3 ia3Var) {
        int b = this.a.b(ud1Var, ia3Var) - this.b.b(ud1Var, ia3Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.t47
    public final int c(ud1 ud1Var) {
        int c = this.a.c(ud1Var) - this.b.c(ud1Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.t47
    public final int d(ud1 ud1Var, ia3 ia3Var) {
        int d = this.a.d(ud1Var, ia3Var) - this.b.d(ud1Var, ia3Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw1)) {
            return false;
        }
        zw1 zw1Var = (zw1) obj;
        if (a34.i(zw1Var.a, this.a) && a34.i(zw1Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
