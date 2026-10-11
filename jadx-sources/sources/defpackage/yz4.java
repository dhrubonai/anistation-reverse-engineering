package defpackage;

import com.anistation.model.Recommendation;
import com.anistation.model.Relation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yz4 implements kc2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ int z;

    public /* synthetic */ yz4(ArrayList arrayList, int i, float f, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = arrayList;
        this.z = i;
        this.A = f;
        this.B = ub2Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i7 = this.z;
        ub2 ub2Var = this.B;
        t53 t53Var = za3.p0;
        ArrayList arrayList = this.y;
        float f = this.A;
        vz3 vz3Var = vz3.x;
        switch (b) {
            case 0:
                zc3 zc3Var = (zc3) obj;
                int intValue = ((Number) obj2).intValue();
                kd2 kd2Var = (kd2) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (kd2Var.f(zc3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (kd2Var.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(i & 1, z)) {
                    List list = (List) arrayList.get(intValue);
                    kd2Var.e0(1494486637);
                    yz3 S = n77.S(ar5.c(vz3Var, 1.0f), 10.0f, 5.0f);
                    z75 a = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 6);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, S);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, a);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    kd2Var.e0(566785839);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zz.h((Recommendation) it.next(), zc3.a(zc3Var, ar5.l(vz3Var, f)), ub2Var, kd2Var, 0);
                    }
                    kd2Var.q(false);
                    kd2Var.e0(566800065);
                    int size = i7 - list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ov5.a(kd2Var, ar5.l(vz3Var, f));
                    }
                    kd2Var.q(false);
                    kd2Var.q(true);
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
                if ((intValue4 & 6) == 0) {
                    if (kd2Var2.f(zc3Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (kd2Var2.d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                int i9 = i4;
                if ((i9 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(i9 & 1, z2)) {
                    List list2 = (List) arrayList.get(intValue3);
                    kd2Var2.e0(-77987991);
                    yz3 S2 = n77.S(ar5.c(vz3Var, 1.0f), 10.0f, 5.0f);
                    z75 a2 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.H, kd2Var2, 6);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, S2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a2);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    kd2Var2.e0(1544957619);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        v94.i((Relation) it2.next(), zc3.a(zc3Var2, ar5.l(vz3Var, f)), ub2Var, kd2Var2, 0);
                    }
                    kd2Var2.q(false);
                    kd2Var2.e0(1544970915);
                    int size2 = i7 - list2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ov5.a(kd2Var2, ar5.l(vz3Var, f));
                    }
                    kd2Var2.q(false);
                    kd2Var2.q(true);
                    kd2Var2.q(false);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
