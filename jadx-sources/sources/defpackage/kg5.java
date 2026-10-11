package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kg5 {
    public final /* synthetic */ byte a;
    public final List b;
    public final bh6[] c;
    public final sp d;

    public kg5(List list, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = list;
                this.c = new bh6[list.size()];
                sp spVar = new sp(new xv3(this, (byte) 18));
                this.d = spVar;
                spVar.j(3);
                return;
            default:
                this.b = list;
                this.c = new bh6[list.size()];
                this.d = new sp(new xv3(this, (byte) 9));
                return;
        }
    }

    public void a(long j, zi4 zi4Var) {
        if (zi4Var.a() >= 9) {
            int m = zi4Var.m();
            int m2 = zi4Var.m();
            int A = zi4Var.A();
            if (m == 434 && m2 == 1195456820 && A == 3) {
                this.d.a(j, zi4Var);
            }
        }
    }

    public final void b(d12 d12Var, lk6 lk6Var) {
        boolean z;
        boolean z2;
        byte b = this.a;
        List list = this.b;
        bh6[] bh6VarArr = this.c;
        switch (b) {
            case 0:
                for (int i = 0; i < bh6VarArr.length; i++) {
                    lk6Var.a();
                    lk6Var.b();
                    bh6 G = d12Var.G(lk6Var.d, 3);
                    ea2 ea2Var = (ea2) list.get(i);
                    String str = ea2Var.p;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    io3.p(z, "Invalid closed caption MIME type provided: %s", str);
                    String str2 = ea2Var.a;
                    if (str2 == null) {
                        lk6Var.b();
                        str2 = lk6Var.e;
                    }
                    da2 da2Var = new da2();
                    da2Var.a = str2;
                    da2Var.n = qy3.n("video/mp2t");
                    da2Var.o = qy3.n(str);
                    da2Var.e = ea2Var.e;
                    da2Var.d = ea2Var.d;
                    da2Var.O = ea2Var.P;
                    da2Var.r = ea2Var.s;
                    zo5.q(da2Var, G);
                    bh6VarArr[i] = G;
                }
                return;
            default:
                for (int i2 = 0; i2 < bh6VarArr.length; i2++) {
                    lk6Var.a();
                    lk6Var.b();
                    bh6 G2 = d12Var.G(lk6Var.d, 3);
                    ea2 ea2Var2 = (ea2) list.get(i2);
                    String str3 = ea2Var2.p;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    io3.p(z2, "Invalid closed caption MIME type provided: %s", str3);
                    da2 da2Var2 = new da2();
                    lk6Var.b();
                    da2Var2.a = lk6Var.e;
                    da2Var2.n = qy3.n("video/mp2t");
                    da2Var2.o = qy3.n(str3);
                    da2Var2.e = ea2Var2.e;
                    da2Var2.d = ea2Var2.d;
                    da2Var2.O = ea2Var2.P;
                    da2Var2.r = ea2Var2.s;
                    zo5.q(da2Var2, G2);
                    bh6VarArr[i2] = G2;
                }
                return;
        }
    }
}
