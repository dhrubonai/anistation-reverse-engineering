package defpackage;

import com.anistation.model.Anime;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vh0 implements kc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ List y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ vh0(List list, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = list;
        this.z = ub2Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.z;
        List list = this.y;
        int i3 = 16;
        int i4 = 2;
        switch (b) {
            case 0:
                zc3 zc3Var = (zc3) obj;
                int intValue = ((Number) obj2).intValue();
                kd2 kd2Var = (kd2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (kd2Var.f(zc3Var)) {
                        i4 = 4;
                    }
                    i = intValue2 | i4;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (kd2Var.d(intValue)) {
                        i3 = 32;
                    }
                    i |= i3;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(i & 1, z)) {
                    yh0 yh0Var = (yh0) list.get(intValue);
                    kd2Var.e0(61669778);
                    String str = yh0Var.a;
                    boolean f = kd2Var.f(ub2Var) | kd2Var.f(yh0Var);
                    Object Q = kd2Var.Q();
                    if (f || Q == au0.a) {
                        Q = new uh0(ub2Var, yh0Var, (byte) 0);
                        kd2Var.n0(Q);
                    }
                    n77.e(str, (sb2) Q, kd2Var, 0);
                    kd2Var.q(false);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                fc3 fc3Var = (fc3) obj;
                int intValue3 = ((Number) obj2).intValue();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (kd2Var2.f(fc3Var)) {
                        i4 = 4;
                    }
                    i2 = intValue4 | i4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (kd2Var2.d(intValue3)) {
                        i3 = 32;
                    }
                    i2 |= i3;
                }
                if ((i2 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(i2 & 1, z2)) {
                    Anime anime = (Anime) list.get(intValue3);
                    kd2Var2.e0(-1454037704);
                    wc7.e(0, ub2Var, kd2Var2, fc3.a(fc3Var, vz3.x), anime);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
