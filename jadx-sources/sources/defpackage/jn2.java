package defpackage;

import com.anistation.model.Recent;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jn2 implements kc2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ List B;
    public final /* synthetic */ int C;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;
    public final /* synthetic */ ub2 z;

    public jn2(List list, List list2, ub2 ub2Var, ub2 ub2Var2, List list3, int i) {
        this.x = list;
        this.y = list2;
        this.z = ub2Var;
        this.A = ub2Var2;
        this.B = list3;
        this.C = i;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        float f;
        int i2;
        int i3;
        fc3 fc3Var = (fc3) obj;
        int intValue = ((Number) obj2).intValue();
        kd2 kd2Var = (kd2) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (kd2Var.f(fc3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
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
        boolean z2 = true;
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            Recent recent = (Recent) this.x.get(intValue);
            kd2Var.e0(-1748875438);
            float f2 = 6.0f;
            if (intValue == 0) {
                f = 12.0f;
            } else {
                f = 6.0f;
            }
            if (intValue == this.y.size() - 1) {
                f2 = 12.0f;
            }
            vh4 k = n77.k(f, 0.0f, f2, 0.0f, 10);
            ub2 ub2Var = this.A;
            boolean f3 = kd2Var.f(ub2Var);
            List list = this.B;
            boolean h = f3 | kd2Var.h(list);
            int i4 = this.C;
            boolean d = h | kd2Var.d(i4);
            if ((((i & 112) ^ 48) <= 32 || !kd2Var.d(intValue)) && (i & 48) != 32) {
                z2 = false;
            }
            boolean z3 = d | z2;
            Object Q = kd2Var.Q();
            if (z3 || Q == au0.a) {
                gn2 gn2Var = new gn2(i4, intValue, ub2Var, list, (byte) 0);
                kd2Var.n0(gn2Var);
                Q = gn2Var;
            }
            iv.m(recent, k, null, this.z, (ub2) Q, kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
