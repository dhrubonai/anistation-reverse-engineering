package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class r01 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ uf3 y;

    public /* synthetic */ r01(uf3 uf3Var, byte b) {
        this.x = b;
        this.y = uf3Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        String str;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        uf3 uf3Var = this.y;
        switch (b) {
            case 0:
                ha3 ha3Var = (ha3) obj;
                cd6 d = uf3Var.d();
                if (d != null) {
                    d.c = ha3Var;
                }
                return pn6Var;
            case 1:
                ti4 ti4Var = uf3Var.t;
                mc6 mc6Var = (mc6) obj;
                String str2 = mc6Var.a.y;
                ko koVar = uf3Var.j;
                if (koVar != null) {
                    str = koVar.y;
                } else {
                    str = null;
                }
                if (!a34.i(str2, str)) {
                    uf3Var.k.setValue(hj2.x);
                    if (((Boolean) ti4Var.getValue()).booleanValue()) {
                        ti4Var.setValue(Boolean.FALSE);
                    } else {
                        uf3Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = nd6.b;
                uf3Var.f(j);
                uf3Var.e(j);
                uf3Var.u.invoke(mc6Var);
                zz4 zz4Var = uf3Var.b;
                a05 a05Var = zz4Var.a;
                if (a05Var != null) {
                    a05Var.f(zz4Var, null);
                }
                return pn6Var;
            case 2:
                uf3Var.r.F(((sv2) obj).a);
                return pn6Var;
            case 3:
                return Boolean.valueOf(uf3Var.r.F(((sv2) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                uf3Var.q.setValue(bool);
                return pn6Var;
        }
    }
}
