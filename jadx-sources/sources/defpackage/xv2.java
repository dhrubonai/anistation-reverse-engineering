package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xv2 implements ub2 {
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ xv2(String str, int i, boolean z) {
        this.x = str;
        this.y = i;
        this.z = z;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int length;
        o96 o96Var = (o96) obj;
        nd6 nd6Var = o96Var.D;
        String str = this.x;
        if (nd6Var != null) {
            long j = nd6Var.a;
            h41.H(o96Var, (int) (j >> 32), (int) (j & 4294967295L), str);
        } else {
            h41.H(o96Var, nd6.g(o96Var.C), nd6.f(o96Var.C), str);
        }
        int g = nd6.g(o96Var.C);
        int i = this.y;
        if (i > 0) {
            length = (g + i) - 1;
        } else {
            length = (g + i) - str.length();
        }
        o96Var.A = this.z;
        int C = db.C(length, 0, o96Var.y.length());
        o96Var.g(fy5.a(C, C));
        return pn6.a;
    }
}
