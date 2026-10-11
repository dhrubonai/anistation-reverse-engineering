package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fx5 implements ll {
    public final ll a;
    public final long b;

    public fx5(j32 j32Var, long j) {
        this.a = j32Var;
        this.b = j;
    }

    @Override // defpackage.ll
    public final kr6 a(tk6 tk6Var) {
        return new gx5(this.a.a(tk6Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fx5)) {
            return false;
        }
        fx5 fx5Var = (fx5) obj;
        if (fx5Var.b != this.b || !a34.i(fx5Var.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
