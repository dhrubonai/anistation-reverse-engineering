package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lx3 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lx3(boolean z, y44 y44Var, w44 w44Var, ui6 ui6Var, ui6 ui6Var2) {
        this.x = (byte) 0;
        this.y = z;
        this.z = y44Var;
        this.A = w44Var;
        this.B = ui6Var;
        this.C = ui6Var2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float f;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        boolean z = this.y;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (b) {
            case 0:
                ti4 ti4Var = ((y44) obj5).z;
                w44 w44Var = (w44) obj4;
                px5 px5Var = (px5) obj3;
                px5 px5Var2 = (px5) obj2;
                p55 p55Var = (p55) obj;
                float f2 = 0.8f;
                float f3 = 1.0f;
                if (!z) {
                    f = ((Number) px5Var.getValue()).floatValue();
                } else if (((Boolean) ti4Var.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                p55Var.h(f);
                if (!z) {
                    f2 = ((Number) px5Var.getValue()).floatValue();
                } else if (((Boolean) ti4Var.getValue()).booleanValue()) {
                    f2 = 1.0f;
                }
                p55Var.i(f2);
                if (!z) {
                    f3 = ((Number) px5Var2.getValue()).floatValue();
                } else if (!((Boolean) ti4Var.getValue()).booleanValue()) {
                    f3 = 0.0f;
                }
                p55Var.c(f3);
                p55Var.m(((xh6) w44Var.getValue()).a);
                return pn6Var;
            case 1:
                uf3 uf3Var = (uf3) obj5;
                w72 w72Var = (w72) obj4;
                jb6 jb6Var = (jb6) obj3;
                h12 h12Var = (h12) obj2;
                xc4 xc4Var = (xc4) obj;
                if (!uf3Var.b()) {
                    w72.a(w72Var);
                } else {
                    ou5 ou5Var = uf3Var.c;
                    if (ou5Var != null) {
                        ((id1) ou5Var).b();
                    }
                }
                if (uf3Var.b() && z) {
                    if (uf3Var.a() != hj2.y) {
                        cd6 d = uf3Var.d();
                        if (d != null) {
                            long j = xc4Var.a;
                            pz2 pz2Var = uf3Var.d;
                            r01 r01Var = uf3Var.v;
                            int b2 = d.b(j, true);
                            h12Var.c(b2);
                            r01Var.invoke(mc6.a((mc6) pz2Var.y, null, fy5.a(b2, b2), 5));
                            if (((ko) uf3Var.a.b).y.length() > 0) {
                                uf3Var.k.setValue(hj2.z);
                            }
                        }
                    } else {
                        jb6Var.d(xc4Var);
                    }
                }
                return pn6Var;
            default:
                cc6 cc6Var = (cc6) obj4;
                long a = ih5.a(cc6Var.o(z));
                ((v05) obj5).x = a;
                cc6Var.A((cj2) obj3, a);
                ((v05) obj2).x = 0L;
                cc6Var.v = -1;
                return pn6Var;
        }
    }

    public /* synthetic */ lx3(byte b, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.y = z;
        this.B = obj3;
        this.C = obj4;
    }
}
