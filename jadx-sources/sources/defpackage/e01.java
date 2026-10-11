package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class e01 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ px5 C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ float y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ e01(w05 w05Var, float f, gl glVar, ml mlVar, ub2 ub2Var) {
        this.A = w05Var;
        this.y = f;
        this.B = glVar;
        this.C = mlVar;
        this.z = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        px5 px5Var = this.C;
        Object obj2 = this.B;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                List list = (List) obj3;
                w44 w44Var = (w44) px5Var;
                pe3 pe3Var = (pe3) obj;
                pe3Var.getClass();
                f01 f01Var = new f01((byte) 0);
                pe3Var.B0(list.size(), new od(f01Var, list, (byte) 7), new eo(list, (byte) 3), new os0(802480018, true, new i01(list, this.y, this.z, (w44) obj2, w44Var)));
                return pn6Var;
            default:
                long longValue = ((Long) obj).longValue();
                Object obj4 = ((w05) obj3).x;
                obj4.getClass();
                nv5.h((kl) obj4, longValue, this.y, (gl) obj2, (ml) px5Var, this.z);
                return pn6Var;
        }
    }

    public /* synthetic */ e01(List list, float f, ub2 ub2Var, w44 w44Var, w44 w44Var2) {
        this.A = list;
        this.y = f;
        this.z = ub2Var;
        this.B = w44Var;
        this.C = w44Var2;
    }
}
