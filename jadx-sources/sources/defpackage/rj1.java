package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rj1 implements jc2 {
    public final /* synthetic */ ArrayList A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ ub2 E;
    public final /* synthetic */ ub2 F;
    public final /* synthetic */ ub2 G;
    public final /* synthetic */ byte x;
    public final /* synthetic */ bw1 y;
    public final /* synthetic */ List z;

    public /* synthetic */ rj1(bw1 bw1Var, List list, ArrayList arrayList, String str, boolean z, String str2, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3, byte b) {
        this.x = b;
        this.y = bw1Var;
        this.z = list;
        this.A = arrayList;
        this.B = str;
        this.C = z;
        this.D = str2;
        this.E = ub2Var;
        this.F = ub2Var2;
        this.G = ub2Var3;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    dk1.c(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    dk1.c(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
