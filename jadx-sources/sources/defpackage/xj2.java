package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xj2 implements aj5 {
    public final String a;
    public final aj5 b;
    public final aj5 c;

    public xj2(String str, aj5 aj5Var, aj5 aj5Var2) {
        this.a = str;
        this.b = aj5Var;
        this.c = aj5Var2;
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        Integer J = b06.J(10, str);
        if (J != null) {
            return J.intValue();
        }
        ze0.k(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.aj5
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xj2) {
                xj2 xj2Var = (xj2) obj;
                if (!this.a.equals(xj2Var.a) || !a34.i(this.b, xj2Var.b) || !a34.i(this.c, xj2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        if (i >= 0) {
            return nt1.x;
        }
        ze0.e(h11.k(qx1.s(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return f06.c;
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                ze0.m("Unreached");
                return null;
            }
            return this.b;
        }
        ze0.e(h11.k(qx1.s(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        ze0.e(h11.k(qx1.s(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
