package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bk extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk(Object obj, byte b) {
        super(1);
        this.y = b;
        this.z = obj;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return Boolean.valueOf(a34.i(obj, obj2));
            case 1:
                dm4 dm4Var = (dm4) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dm4Var.f((em4) arrayList.get(i), 0, 0, 0.0f);
                }
                return pn6Var;
            case 2:
                ql qlVar = (ql) obj;
                float f = qlVar.b;
                float f2 = 0.0f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f3 = 1.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f4 = qlVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = qlVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = qlVar.a;
                if (f8 >= 0.0f) {
                    f2 = f8;
                }
                if (f2 <= 1.0f) {
                    f3 = f2;
                }
                return new ep0(ep0.a(w65.d(f, f4, f6, f3, rp0.x), (pp0) obj2));
            case 3:
                return Boolean.valueOf(!a34.i(obj, ((xi6) obj2).d.getValue()));
            case 4:
                ((p55) obj).c(((Number) ((px5) obj2).getValue()).floatValue());
                return pn6Var;
            case 5:
                bp1 bp1Var = (bp1) obj;
                di2 di2Var = (di2) obj2;
                id idVar = di2Var.l;
                if (di2Var.n && di2Var.A && idVar != null) {
                    dn0 n0 = bp1Var.n0();
                    long B = n0.B();
                    n0.y().h();
                    try {
                        ((dn0) ((af2) n0.y).y).y().m(idVar);
                        di2Var.c(bp1Var);
                    } finally {
                        h11.u(n0, B);
                    }
                } else {
                    di2Var.c(bp1Var);
                }
                return pn6Var;
            default:
                ((ii3) obj2).cancel(false);
                return pn6Var;
        }
    }
}
