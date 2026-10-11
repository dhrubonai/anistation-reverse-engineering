package defpackage;

import com.anistation.model.AnimeWatchOrderItem;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ob5 implements kc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ List y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ ob5(List list, Object obj, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = list;
        this.A = obj;
        this.z = ub2Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean i3;
        Integer J;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        List list = this.y;
        int i4 = 16;
        int i5 = 2;
        Object obj5 = this.A;
        switch (b) {
            case 0:
                zc3 zc3Var = (zc3) obj;
                int intValue = ((Number) obj2).intValue();
                kd2 kd2Var = (kd2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (kd2Var.f(zc3Var)) {
                        i5 = 4;
                    }
                    i = intValue2 | i5;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (kd2Var.d(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(i & 1, z)) {
                    Map.Entry entry = (Map.Entry) list.get(intValue);
                    kd2Var.e0(330841598);
                    Object key = entry.getKey();
                    key.getClass();
                    String str = (String) key;
                    Object value = entry.getValue();
                    value.getClass();
                    List list2 = (List) value;
                    if (intValue == ((List) obj5).size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m37.b(str, list2, z2, this.z, kd2Var, 0);
                    kd2Var.q(false);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                zc3 zc3Var2 = (zc3) obj;
                int intValue3 = ((Number) obj2).intValue();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue4 = ((Number) obj4).intValue();
                String str2 = (String) obj5;
                if ((intValue4 & 6) == 0) {
                    if (kd2Var2.f(zc3Var2)) {
                        i5 = 4;
                    }
                    i2 = i5 | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (kd2Var2.d(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var2.V(i2 & 1, z3)) {
                    AnimeWatchOrderItem animeWatchOrderItem = (AnimeWatchOrderItem) list.get(intValue3);
                    kd2Var2.e0(-1388672048);
                    if (str2 != null && (J = b06.J(10, str2)) != null) {
                        if (J.intValue() <= 0) {
                            J = null;
                        }
                        if (J != null) {
                            if (J.intValue() == animeWatchOrderItem.getAnilistId()) {
                                i3 = true;
                            } else {
                                i3 = false;
                            }
                            et5.a(animeWatchOrderItem, intValue3 + 1, zc3.a(zc3Var2, n77.S(vz3.x, 10.0f, 4.0f)), i3, this.z, kd2Var2, 0);
                            kd2Var2.q(false);
                        }
                    }
                    i3 = a34.i(str2, animeWatchOrderItem.getId());
                    et5.a(animeWatchOrderItem, intValue3 + 1, zc3.a(zc3Var2, n77.S(vz3.x, 10.0f, 4.0f)), i3, this.z, kd2Var2, 0);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
