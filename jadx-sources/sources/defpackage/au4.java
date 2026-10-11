package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class au4 implements aj5 {
    public final String a;
    public final xt4 b;

    public au4(String str, xt4 xt4Var) {
        xt4Var.getClass();
        this.a = str;
        this.b = xt4Var;
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(h11.k(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.aj5
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof au4) {
                au4 au4Var = (au4) obj;
                if (this.a.equals(au4Var.a) && a34.i(this.b, au4Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return this.b;
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return qx1.p(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
