package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i80 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i80(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = z;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        vc6 vc6Var;
        ha3 ha3Var;
        ha3 ha3Var2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        boolean z = this.y;
        Object obj6 = this.z;
        switch (b) {
            case 0:
                do5 do5Var = (do5) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                v11 v11Var = (v11) obj2;
                bi5 bi5Var = (bi5) obj;
                if (do5Var.e.d().a.size() > 1 && z) {
                    eo5 c = do5Var.c();
                    d9 d9Var = do5Var.e;
                    eo5 eo5Var = eo5.z;
                    if (c == eo5Var) {
                        if (((Boolean) d9Var.d.invoke(eo5.y)).booleanValue()) {
                            h80 h80Var = new h80(v11Var, do5Var, (byte) 1);
                            w73[] w73VarArr = zh5.a;
                            bi5Var.b(oh5.t, new o3(str, h80Var));
                        }
                    } else if (((Boolean) d9Var.d.invoke(eo5Var)).booleanValue()) {
                        h80 h80Var2 = new h80(v11Var, do5Var, (byte) 2);
                        w73[] w73VarArr2 = zh5.a;
                        bi5Var.b(oh5.u, new o3(str2, h80Var2));
                    }
                    if (!do5Var.c) {
                        h80 h80Var3 = new h80(v11Var, do5Var, (byte) 3);
                        w73[] w73VarArr3 = zh5.a;
                        bi5Var.b(oh5.v, new o3(str3, h80Var3));
                    }
                }
                return pn6Var;
            default:
                uf3 uf3Var = (uf3) obj6;
                ti4 ti4Var = uf3Var.o;
                r47 r47Var = (r47) obj5;
                jb6 jb6Var = (jb6) obj4;
                mc6 mc6Var = (mc6) obj3;
                h12 h12Var = (h12) obj2;
                ha3 ha3Var3 = (ha3) obj;
                uf3Var.h = ha3Var3;
                cd6 d = uf3Var.d();
                if (d != null) {
                    d.b = ha3Var3;
                }
                if (z) {
                    if (uf3Var.a() == hj2.y) {
                        if (((Boolean) uf3Var.l.getValue()).booleanValue() && ((lf3) r47Var).a()) {
                            jb6Var.s();
                        } else {
                            jb6Var.m();
                        }
                        uf3Var.m.setValue(Boolean.valueOf(nu5.j(jb6Var, true)));
                        uf3Var.n.setValue(Boolean.valueOf(nu5.j(jb6Var, false)));
                        ti4Var.setValue(Boolean.valueOf(nd6.d(mc6Var.b)));
                    } else if (uf3Var.a() == hj2.z) {
                        ti4Var.setValue(Boolean.valueOf(nu5.j(jb6Var, true)));
                    }
                    n77.M(uf3Var, mc6Var, h12Var);
                    cd6 d2 = uf3Var.d();
                    if (d2 != null && (vc6Var = uf3Var.e) != null && uf3Var.b() && (ha3Var = d2.b) != null && ha3Var.m() && (ha3Var2 = d2.c) != null) {
                        bd6 bd6Var = d2.a;
                        yd ydVar = new yd(ha3Var, (byte) 7);
                        n05 O = sw0.O(ha3Var);
                        n05 G = ha3Var.G(ha3Var2, false);
                        if (a34.i((vc6) vc6Var.a.b.get(), vc6Var)) {
                            vc6Var.b.h(mc6Var, h12Var, bd6Var, ydVar, O, G);
                        }
                    }
                }
                return pn6Var;
        }
    }
}
