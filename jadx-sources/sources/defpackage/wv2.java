package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wv2 implements ub2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String x;
    public final /* synthetic */ List y;
    public final /* synthetic */ int z;

    public /* synthetic */ wv2(String str, List list, int i, boolean z) {
        this.x = str;
        this.y = list;
        this.z = i;
        this.A = z;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int length;
        o96 o96Var = (o96) obj;
        nd6 nd6Var = o96Var.D;
        String str = this.x;
        List list = this.y;
        if (nd6Var != null) {
            long j = nd6Var.a;
            int i = (int) (j >> 32);
            h41.H(o96Var, i, (int) (j & 4294967295L), str);
            if (str.length() > 0) {
                o96Var.e(list, i, str.length() + i);
            }
        } else {
            int g = nd6.g(o96Var.C);
            h41.H(o96Var, g, nd6.f(o96Var.C), str);
            if (str.length() > 0) {
                o96Var.e(list, g, str.length() + g);
            }
        }
        int g2 = nd6.g(o96Var.C);
        int i2 = this.z;
        if (i2 > 0) {
            length = (g2 + i2) - 1;
        } else {
            length = (g2 + i2) - str.length();
        }
        o96Var.A = this.A;
        int C = db.C(length, 0, o96Var.y.length());
        o96Var.g(fy5.a(C, C));
        return pn6.a;
    }
}
