package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa1 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ wa1(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean h;
        boolean z;
        float f;
        float f2;
        byte b = this.x;
        byte b2 = 3;
        int i = 2;
        pn6 pn6Var = pn6.a;
        boolean z2 = true;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                long j = ((ep0) obj).a;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (kd2Var.e(j)) {
                        i = 4;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18) {
                    z2 = false;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    xa1.b(((w86) obj4).c, j, kd2Var, (intValue << 3) & 112);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                lg6 lg6Var = (lg6) obj;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h = kd2Var2.f(lg6Var);
                    } else {
                        h = kd2Var2.h(lg6Var);
                    }
                    if (h) {
                        i = 4;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) == 18) {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    jg6.a(lg6Var, null, 0.0f, null, 0L, 0L, nx7.R(-999924215, new fa((String) obj4, b2), kd2Var2), kd2Var2, (intValue2 & 14) | 805306368);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var3.V(intValue3 & 1, z)) {
                    i66.c((ic2) obj4, kd2Var3, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            default:
                yz3 yz3Var = (yz3) obj;
                kd2 kd2Var4 = (kd2) obj2;
                ((Number) obj3).intValue();
                kd2Var4.e0(-1498516085);
                tw5 N = sw0.N(z04.y, kd2Var4);
                tw5 N2 = sw0.N(z04.A, kd2Var4);
                xi6 xi6Var = (xi6) obj4;
                tk6 tk6Var = db.l;
                qt0 qt0Var = xi6Var.a;
                ti4 ti4Var = xi6Var.d;
                boolean booleanValue = ((Boolean) qt0Var.v()).booleanValue();
                kd2Var4.e0(-1553362193);
                float f3 = 0.8f;
                float f4 = 1.0f;
                if (booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                kd2Var4.q(false);
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) ti4Var.getValue()).booleanValue();
                kd2Var4.e0(-1553362193);
                if (booleanValue2) {
                    f3 = 1.0f;
                }
                kd2Var4.q(false);
                Float valueOf2 = Float.valueOf(f3);
                xi6Var.f();
                kd2Var4.e0(386845748);
                kd2Var4.q(false);
                ui6 q = tl7.q(xi6Var, valueOf, valueOf2, N, tk6Var, kd2Var4, 196608);
                boolean booleanValue3 = ((Boolean) xi6Var.a.v()).booleanValue();
                kd2Var4.e0(2073045083);
                if (booleanValue3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                kd2Var4.q(false);
                Float valueOf3 = Float.valueOf(f2);
                boolean booleanValue4 = ((Boolean) ti4Var.getValue()).booleanValue();
                kd2Var4.e0(2073045083);
                if (!booleanValue4) {
                    f4 = 0.0f;
                }
                kd2Var4.q(false);
                Float valueOf4 = Float.valueOf(f4);
                xi6Var.f();
                kd2Var4.e0(-281714272);
                kd2Var4.q(false);
                yz3 Q = io3.Q(yz3Var, ((Number) q.G.getValue()).floatValue(), ((Number) q.G.getValue()).floatValue(), ((Number) tl7.q(xi6Var, valueOf3, valueOf4, N2, tk6Var, kd2Var4, 196608).G.getValue()).floatValue(), 0.0f, null, 131064);
                kd2Var4.q(false);
                return Q;
        }
    }
}
