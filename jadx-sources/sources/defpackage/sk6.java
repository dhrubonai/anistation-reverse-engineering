package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sk6 implements gq1 {
    public final int a;
    public final int b;
    public final ar1 c;

    public sk6(int i, int i2, ar1 ar1Var) {
        this.a = i;
        this.b = i2;
        this.c = ar1Var;
    }

    @Override // defpackage.ll
    public final kr6 a(tk6 tk6Var) {
        return new ed4(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sk6) {
            sk6 sk6Var = (sk6) obj;
            if (sk6Var.a == this.a && sk6Var.b == this.b && a34.i(sk6Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.gq1, defpackage.ll
    public final mr6 a(tk6 tk6Var) {
        return new ed4(this.a, this.b, this.c);
    }
}
