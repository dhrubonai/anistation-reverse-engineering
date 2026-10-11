package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qg implements t47 {
    public final short a;
    public final String b;
    public final ti4 c = xt5.g(yz2.e);
    public final ti4 d = xt5.g(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public qg(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final yz2 e() {
        return (yz2) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qg) {
                if (this.a == ((qg) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(v57 v57Var, int i) {
        short s = this.a;
        if (i != 0 && (i & s) == 0) {
            return;
        }
        this.c.setValue(v57Var.a.i(s));
        f(v57Var.a.u(s));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
