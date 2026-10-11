package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ms0 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ ms0(mp0 mp0Var, y04 y04Var, cn5 cn5Var, nl6 nl6Var, os0 os0Var, int i) {
        this.x = (byte) 1;
        this.A = mp0Var;
        this.B = y04Var;
        this.C = cn5Var;
        this.D = nl6Var;
        this.y = os0Var;
        this.z = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.D;
        Object obj6 = this.C;
        pn6 pn6Var = pn6.a;
        int i = this.z;
        Object obj7 = this.y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(i) | 1;
                ((os0) obj7).i(this.A, this.B, this.C, this.D, (kd2) obj, N);
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                ho3.a((mp0) obj4, (y04) obj3, (cn5) obj6, (nl6) obj5, (os0) obj7, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                pb5.a((vm6) obj7, (af3) obj4, (List) obj3, (kc2) obj6, (sb2) obj5, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                tl7.f((xi6) obj7, (ui6) obj6, this.A, this.B, (j32) obj5, (kd2) obj, N2);
                return pn6Var;
        }
    }

    public /* synthetic */ ms0(xi6 xi6Var, ui6 ui6Var, Object obj, Object obj2, j32 j32Var, int i) {
        this.x = (byte) 3;
        this.y = xi6Var;
        this.C = ui6Var;
        this.A = obj;
        this.B = obj2;
        this.D = j32Var;
        this.z = i;
    }

    public /* synthetic */ ms0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.x = b;
        this.y = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
        this.z = i;
    }
}
