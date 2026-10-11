package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class je implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ je(int i, String str, sb2 sb2Var, yz3 yz3Var) {
        this.x = (byte) 16;
        this.z = i;
        this.A = str;
        this.B = sb2Var;
        this.y = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        int i = this.z;
        Object obj3 = this.y;
        Object obj4 = this.B;
        pn6 pn6Var = pn6.a;
        Object obj5 = this.A;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x97.e((ad4) obj5, (e7) obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                q23.d((yz3) obj5, (jw4) obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                io3.e((ng6) obj5, (w44) obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                n03.d((String) obj5, (String) obj4, (yz3) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 4:
                ((Integer) obj2).getClass();
                ((os0) obj3).d(obj5, obj4, (kd2) obj, kb0.N(i) | 1);
                return pn6Var;
            case 5:
                ((Integer) obj2).getClass();
                uz0.a((qz0) obj5, (yz3) obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 6:
                ((Integer) obj2).getClass();
                xa1.c((b96) obj5, (q86) obj4, (sb2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 7:
                ((Integer) obj2).getClass();
                if1.d((List) obj5, this.z, (yz3) obj4, (ub2) obj3, (kd2) obj, kb0.N(385));
                return pn6Var;
            case 8:
                ((Integer) obj2).getClass();
                iv.l((rd3) obj5, this.B, this.z, this.y, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 9:
                ((Integer) obj2).getClass();
                ((df3) obj5).e(obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 10:
                ((Integer) obj2).intValue();
                te4.k((og3) obj5, (xg3) obj4, (ub2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 11:
                ((Integer) obj2).getClass();
                ((k95) obj5).e(obj4, (os0) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 12:
                ((Integer) obj2).getClass();
                qs5.b((rs5) obj5, (yz3) obj4, (jc2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 13:
                ((Integer) obj2).getClass();
                te4.m((w06) obj5, (yz3) obj4, (ic2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 14:
                ((Integer) obj2).getClass();
                wt5.b((String) obj5, (List) obj4, this.z, (ub2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 15:
                ((Integer) obj2).getClass();
                ((hd6) obj5).b((Object[]) obj4, (ub2) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            default:
                String str = (String) obj5;
                sb2 sb2Var = (sb2) obj4;
                yz3 yz3Var = (yz3) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    nx7.g(this.z, 0, 0, sb2Var, kd2Var, yz3Var, str);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ je(byte b, int i, Object obj, Object obj2, Object obj3) {
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.y = obj3;
        this.z = i;
    }

    public /* synthetic */ je(os0 os0Var, Object obj, Object obj2, int i) {
        this.x = (byte) 4;
        this.y = os0Var;
        this.A = obj;
        this.B = obj2;
        this.z = i;
    }

    public /* synthetic */ je(ng6 ng6Var, w44 w44Var, os0 os0Var, int i) {
        this.x = (byte) 2;
        this.A = ng6Var;
        this.B = w44Var;
        this.y = os0Var;
        this.z = i;
    }

    public /* synthetic */ je(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.z = i;
        this.y = obj3;
    }

    public /* synthetic */ je(List list, int i, yz3 yz3Var, ub2 ub2Var, int i2) {
        this.x = (byte) 7;
        this.A = list;
        this.z = i;
        this.B = yz3Var;
        this.y = ub2Var;
    }
}
