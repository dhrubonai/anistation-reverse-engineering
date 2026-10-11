package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uf3 {
    public final ti4 A;
    public final ti4 B;
    public tf1 a;
    public final zz4 b;
    public final ou5 c;
    public final pz2 d;
    public vc6 e;
    public final ti4 f;
    public final ti4 g;
    public ha3 h;
    public final ti4 i;
    public ko j;
    public final ti4 k;
    public final ti4 l;
    public final ti4 m;
    public final ti4 n;
    public final ti4 o;
    public boolean p;
    public final ti4 q;
    public final st3 r;
    public final ti4 s;
    public final ti4 t;
    public ub2 u;
    public final r01 v;
    public final r01 w;
    public final r01 x;
    public final ad y;
    public long z;

    public uf3(tf1 tf1Var, zz4 zz4Var, ou5 ou5Var) {
        this.a = tf1Var;
        this.b = zz4Var;
        this.c = ou5Var;
        pz2 pz2Var = new pz2((byte) 20, false);
        ko koVar = lo.a;
        long j = nd6.b;
        mc6 mc6Var = new mc6(koVar, j, (nd6) null);
        pz2Var.y = mc6Var;
        pz2Var.z = new sr1(koVar, mc6Var.b);
        this.d = pz2Var;
        Boolean bool = Boolean.FALSE;
        this.f = xt5.g(bool);
        this.g = xt5.g(new vm1(0.0f));
        this.i = xt5.g(null);
        this.k = xt5.g(hj2.x);
        this.l = xt5.g(bool);
        this.m = xt5.g(bool);
        this.n = xt5.g(bool);
        this.o = xt5.g(bool);
        this.p = true;
        this.q = xt5.g(Boolean.TRUE);
        this.r = new st3(ou5Var);
        this.s = xt5.g(bool);
        this.t = xt5.g(bool);
        this.u = new p03((byte) 12);
        this.v = new r01(this, (byte) 1);
        this.w = new r01(this, (byte) 2);
        this.x = new r01(this, (byte) 3);
        this.y = n77.l();
        this.z = ep0.i;
        this.A = xt5.g(new nd6(j));
        this.B = xt5.g(new nd6(j));
    }

    public final hj2 a() {
        return (hj2) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final ha3 c() {
        ha3 ha3Var = this.h;
        if (ha3Var != null && ha3Var.m()) {
            return ha3Var;
        }
        return null;
    }

    public final cd6 d() {
        return (cd6) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new nd6(j));
    }

    public final void f(long j) {
        this.A.setValue(new nd6(j));
    }
}
