package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ok extends x93 implements ub2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ byte y;
    public final /* synthetic */ pk z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok(pk pkVar, long j, byte b) {
        super(1);
        this.y = b;
        this.z = pkVar;
        this.A = j;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        j32 j32Var;
        byte b = this.y;
        long j = 0;
        long j2 = this.A;
        pk pkVar = this.z;
        switch (b) {
            case 0:
                si6 si6Var = (si6) obj;
                if (a34.i(si6Var.a(), pkVar.O.a())) {
                    if (!k13.a(pkVar.V, -9223372034707292160L)) {
                        j2 = pkVar.V;
                    }
                } else {
                    px5 px5Var = (px5) pkVar.O.d.g(si6Var.a());
                    if (px5Var != null) {
                        j2 = ((k13) px5Var.getValue()).a;
                    } else {
                        j2 = 0;
                    }
                }
                px5 px5Var2 = (px5) pkVar.O.d.g(si6Var.c());
                if (px5Var2 != null) {
                    j = ((k13) px5Var2.getValue()).a;
                }
                dr5 dr5Var = (dr5) pkVar.N.getValue();
                if (dr5Var == null || (j32Var = (j32) dr5Var.a.invoke(new k13(j2), new k13(j))) == null) {
                    return z51.O(0.0f, 400.0f, null, 5);
                }
                return j32Var;
            default:
                if (a34.i(obj, pkVar.O.a())) {
                    if (k13.a(pkVar.V, -9223372034707292160L)) {
                        j = j2;
                    } else {
                        j = pkVar.V;
                    }
                } else {
                    px5 px5Var3 = (px5) pkVar.O.d.g(obj);
                    if (px5Var3 != null) {
                        j = ((k13) px5Var3.getValue()).a;
                    }
                }
                return new k13(j);
        }
    }
}
