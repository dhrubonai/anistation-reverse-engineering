package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xq6 implements t47 {
    public final String a;
    public final ti4 b;

    public xq6(h03 h03Var, String str) {
        this.a = str;
        this.b = xt5.g(h03Var);
    }

    @Override // defpackage.t47
    public final int a(ud1 ud1Var) {
        return e().b;
    }

    @Override // defpackage.t47
    public final int b(ud1 ud1Var, ia3 ia3Var) {
        return e().c;
    }

    @Override // defpackage.t47
    public final int c(ud1 ud1Var) {
        return e().d;
    }

    @Override // defpackage.t47
    public final int d(ud1 ud1Var, ia3 ia3Var) {
        return e().a;
    }

    public final h03 e() {
        return (h03) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xq6)) {
            return false;
        }
        return a34.i(e(), ((xq6) obj).e());
    }

    public final void f(h03 h03Var) {
        this.b.setValue(h03Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
