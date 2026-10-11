package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ne5 implements kc2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ w72 E;
    public final /* synthetic */ List x;
    public final /* synthetic */ ic6 y;
    public final /* synthetic */ p72 z;

    public ne5(List list, ic6 ic6Var, p72 p72Var, ub2 ub2Var, ub2 ub2Var2, w44 w44Var, w44 w44Var2, w72 w72Var) {
        this.x = list;
        this.y = ic6Var;
        this.z = p72Var;
        this.A = ub2Var;
        this.B = ub2Var2;
        this.C = w44Var;
        this.D = w44Var2;
        this.E = w72Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        p72 p72Var;
        int i2;
        int i3;
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
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            String str = (String) this.x.get(intValue);
            kd2Var.e0(-1811228000);
            ic6 ic6Var = this.y;
            boolean f = kd2Var.f(ic6Var) | kd2Var.f(str);
            p72 p72Var2 = this.z;
            boolean h = f | kd2Var.h(p72Var2);
            ub2 ub2Var = this.A;
            boolean f2 = h | kd2Var.f(ub2Var);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (!f2 && Q != q18Var) {
                p72Var = p72Var2;
            } else {
                me5 me5Var = new me5(ic6Var, str, p72Var2, ub2Var, (byte) 0);
                p72Var = p72Var2;
                kd2Var.n0(me5Var);
                Q = me5Var;
            }
            sb2 sb2Var = (sb2) Q;
            boolean f3 = kd2Var.f(ic6Var) | kd2Var.f(str);
            ub2 ub2Var2 = this.B;
            boolean f4 = f3 | kd2Var.f(ub2Var2);
            Object Q2 = kd2Var.Q();
            if (f4 || Q2 == q18Var) {
                me5 me5Var2 = new me5(ic6Var, str, ub2Var2, this.E, (byte) 1);
                kd2Var.n0(me5Var2);
                Q2 = me5Var2;
            }
            sb2 sb2Var2 = (sb2) Q2;
            boolean h2 = kd2Var.h(p72Var);
            w44 w44Var = this.C;
            boolean f5 = h2 | kd2Var.f(w44Var) | kd2Var.f(str);
            w44 w44Var2 = this.D;
            boolean f6 = f5 | kd2Var.f(w44Var2);
            Object Q3 = kd2Var.Q();
            if (f6 || Q3 == q18Var) {
                Q3 = new me5(p72Var, str, w44Var, w44Var2);
                kd2Var.n0(Q3);
            }
            bx7.c(str, sb2Var, sb2Var2, (sb2) Q3, zc3.a(zc3Var, vz3.x), kd2Var, 0);
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
