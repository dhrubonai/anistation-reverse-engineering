package defpackage;

import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c74 implements kc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ c74(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        eg3 eg3Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        Object obj8 = this.y;
        switch (b) {
            case 0:
                xi6 xi6Var = (xi6) obj8;
                zt5 zt5Var = (zt5) obj7;
                w05 w05Var = (w05) obj6;
                Map map = (Map) obj5;
                Object obj9 = (jk) obj;
                wp5 wp5Var = (wp5) obj2;
                kd2 kd2Var = (kd2) obj3;
                ((Integer) obj4).getClass();
                if (a34.i(xi6Var.a.v(), xi6Var.d.getValue()) && zt5Var.isEmpty()) {
                    eg3Var = eg3.B;
                } else {
                    eg3Var = eg3.A;
                }
                gt0 M = bb4.M(eg3Var, kd2Var);
                Object Q = kd2Var.Q();
                if (Q == au0.a) {
                    kd2Var.n0(obj9);
                } else {
                    obj9 = Q;
                }
                w05Var.x = (jk) obj9;
                mw4 a = vj3.a.a(M);
                tq1 tq1Var = yj3.a;
                Object obj10 = w05Var.x;
                if (obj10 != null) {
                    kb0.c(new mw4[]{a, tq1Var.a((jk) obj10), en5.a.a(wp5Var), jb5.a.a(vn3.Q(new xk(wp5Var), map))}, nx7.R(-1734941436, new x64(wp5Var, (byte) 0), kd2Var), kd2Var, 56);
                    return pn6Var;
                }
                a34.s0("animatedContentScope");
                throw null;
            default:
                vm1 vm1Var = (vm1) obj8;
                xh4 xh4Var = (xh4) obj7;
                List list = (List) obj6;
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj5;
                ((Integer) obj2).getClass();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((zc3) obj).getClass();
                if ((intValue & 129) != 128) {
                    z = true;
                }
                if (kd2Var2.V(intValue & 1, z)) {
                    x97.b(n77.V(bx7.h(ar5.c(vz3.x, 1.0f), ((mp0) kd2Var2.j(op0.a)).n, ((cn5) kd2Var2.j(dn5.a)).d), 0.0f, 5.0f, 0.0f, 0.0f, 13), pk2.z, nx7.R(-111211745, new sd3(vm1Var, xh4Var, list, subtitleStyleSettings, (byte) 7), kd2Var2), kd2Var2, 3120, 4);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
