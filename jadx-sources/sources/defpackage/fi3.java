package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class fi3 implements aj5 {
    public final aj5 a;

    public fi3(aj5 aj5Var) {
        this.a = aj5Var;
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        Integer J = b06.J(10, str);
        if (J != null) {
            return J.intValue();
        }
        ze0.k(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.aj5
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fi3) {
                fi3 fi3Var = (fi3) obj;
                if (a34.i(this.a, fi3Var.a) && a34.i(a(), fi3Var.a())) {
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
        return String.valueOf(i);
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        if (i >= 0) {
            return nt1.x;
        }
        StringBuilder s = qx1.s(i, "Illegal index ", ", ");
        s.append(a());
        s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s.toString().toString());
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return f06.b;
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder s = qx1.s(i, "Illegal index ", ", ");
        s.append(a());
        s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder s = qx1.s(i, "Illegal index ", ", ");
        s.append(a());
        s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
