package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class po0 {
    public int x;
    public Object y;

    public po0(za8 za8Var, int i) {
        if (za8Var != null) {
            if (i >= 0) {
                this.x = i;
                this.y = za8Var;
                return;
            } else {
                ze0.k(h11.g(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
                throw null;
            }
        }
        ze0.k("format options cannot be null");
        throw null;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        int z;
        do {
            z = z();
            if (z != 0) {
                int i = this.x;
                if (i < 100) {
                    this.x = i + 1;
                    this.x--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (C(z));
    }

    public void E(df2 df2Var, Object obj) {
        df2Var.d(Integer.valueOf(obj.hashCode()), xa8.HEX, (za8) this.y);
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract v57 f(v57 v57Var, List list);

    public abstract l33 g(c57 c57Var, l33 l33Var);

    public abstract void h(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract xd0 l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(c57 c57Var) {
    }

    public void e(c57 c57Var) {
    }

    public po0() {
    }

    public po0(int i) {
        this.x = i;
    }
}
