package defpackage;

import com.anistation.model.Anime;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fo implements kc2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ List y;
    public final /* synthetic */ float z;

    public /* synthetic */ fo(List list, float f, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = list;
        this.z = f;
        this.A = ub2Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.A;
        float f = this.z;
        vz3 vz3Var = vz3.x;
        List list = this.y;
        int i3 = 16;
        int i4 = 2;
        switch (b) {
            case 0:
                fc3 fc3Var = (fc3) obj;
                int intValue = ((Number) obj2).intValue();
                kd2 kd2Var = (kd2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (kd2Var.f(fc3Var)) {
                        i4 = 4;
                    }
                    i = i4 | intValue2;
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
                    Anime anime = (Anime) list.get(intValue);
                    kd2Var.e0(685767988);
                    a34.c(0, ub2Var, kd2Var, fc3.a(fc3Var, ar5.l(vz3Var, f)), anime);
                    kd2Var.q(false);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                fc3 fc3Var2 = (fc3) obj;
                int intValue3 = ((Number) obj2).intValue();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (kd2Var2.f(fc3Var2)) {
                        i4 = 4;
                    }
                    i2 = i4 | intValue4;
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
                    Anime anime2 = (Anime) list.get(intValue3);
                    kd2Var2.e0(-960356323);
                    a34.c(0, ub2Var, kd2Var2, fc3.a(fc3Var2, ar5.l(vz3Var, f)), anime2);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
