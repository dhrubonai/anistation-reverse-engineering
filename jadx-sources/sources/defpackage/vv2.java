package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vv2 implements ub2 {
    public final /* synthetic */ tv2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ vv2(tv2 tv2Var, int i, int i2) {
        this.x = (byte) 0;
        this.A = tv2Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        tv2 tv2Var = this.A;
        int i = this.z;
        int i2 = this.y;
        o96 o96Var = (o96) obj;
        switch (b) {
            case 0:
                long c = tv2Var.c(fy5.a(0, o96Var.y.length()));
                int g = nd6.g(c);
                int f = nd6.f(c);
                if (i2 < g) {
                    i2 = g;
                }
                if (i2 <= f) {
                    f = i2;
                }
                int g2 = nd6.g(c);
                int f2 = nd6.f(c);
                if (i < g2) {
                    i = g2;
                }
                if (i <= f2) {
                    f2 = i;
                }
                o96Var.g(tv2Var.b(fy5.a(f, f2)));
                return pn6Var;
            case 1:
                if (i2 < 0 || i < 0) {
                    hz2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i + " respectively.");
                }
                long c2 = tv2Var.c(o96Var.C);
                int f3 = nd6.f(c2);
                int i3 = f3 + i;
                if (((f3 ^ i3) & (i ^ i3)) < 0) {
                    i3 = tv2Var.a();
                }
                long b2 = tv2Var.b(fy5.a(nd6.f(c2), Math.min(i3, tv2Var.a())));
                h41.G(o96Var, nd6.g(b2), nd6.f(b2));
                int g3 = nd6.g(c2);
                int i4 = g3 - i2;
                if (((i2 ^ g3) & (g3 ^ i4)) < 0) {
                    i4 = 0;
                }
                long b3 = tv2Var.b(fy5.a(Math.max(0, i4), nd6.g(c2)));
                h41.G(o96Var, nd6.g(b3), nd6.f(b3));
                return pn6Var;
            default:
                nd6 nd6Var = o96Var.D;
                kk0 kk0Var = o96Var.y;
                if (nd6Var != null) {
                    o96Var.f(null);
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i < 0) {
                    i = 0;
                }
                long b4 = tv2Var.b(fy5.a(i2, i));
                int C = db.C(nd6.g(b4), 0, kk0Var.length());
                int C2 = db.C(nd6.f(b4), 0, kk0Var.length());
                if (C != C2) {
                    if (C < C2) {
                        o96Var.e(null, C, C2);
                    } else {
                        o96Var.e(null, C2, C);
                    }
                }
                return pn6Var;
        }
    }

    public /* synthetic */ vv2(int i, int i2, tv2 tv2Var, byte b) {
        this.x = b;
        this.y = i;
        this.z = i2;
        this.A = tv2Var;
    }
}
