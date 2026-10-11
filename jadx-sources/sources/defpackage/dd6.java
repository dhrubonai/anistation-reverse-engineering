package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dd6 {
    public final qa6 a;
    public final qa6 b;
    public final ti4 c;
    public final ti4 d;
    public final ti4 e;
    public final ti4 f;
    public final y90 g;

    public dd6() {
        qa6 qa6Var = new qa6();
        this.a = qa6Var;
        this.b = qa6Var;
        h95 h95Var = h95.H;
        this.c = new ti4(null, h95Var);
        this.d = new ti4(null, h95Var);
        this.e = new ti4(null, h95Var);
        this.f = xt5.g(new vm1(0.0f));
        this.g = new y90();
    }

    public final long a(long j) {
        n05 n05Var;
        ha3 e = e();
        n05 n05Var2 = n05.e;
        if (e != null) {
            if (e.m()) {
                ha3 b = b();
                if (b != null) {
                    n05Var = b.G(e, true);
                } else {
                    n05Var = null;
                }
            } else {
                n05Var = n05Var2;
            }
            if (n05Var != null) {
                n05Var2 = n05Var;
            }
        }
        return rv5.b(j, n05Var2);
    }

    public final ha3 b() {
        return (ha3) this.e.getValue();
    }

    public final bd6 c() {
        return (bd6) this.b.getValue();
    }

    public final int d(long j, boolean z) {
        bd6 c = c();
        if (c == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return c.b.g(rv5.c(this, j));
    }

    public final ha3 e() {
        return (ha3) this.c.getValue();
    }

    public final boolean f(long j) {
        bd6 c = c();
        if (c != null) {
            long c2 = rv5.c(this, a(j));
            int e = c.b.e(Float.intBitsToFloat((int) (4294967295L & c2)));
            int i = (int) (c2 >> 32);
            if (Float.intBitsToFloat(i) >= c.f(e) && Float.intBitsToFloat(i) <= c.g(e)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
