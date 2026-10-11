package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class no {
    public static final ai4 a;

    static {
        nt1 nt1Var = nt1.x;
        a = new ai4(nt1Var, nt1Var);
    }

    public static final void a(ko koVar, List list, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        kd2Var.f0(-1794596951);
        if ((i & 6) == 0) {
            if (kd2Var.f(koVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(list)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                jo joVar = (jo) list.get(i5);
                jc2 jc2Var = (jc2) joVar.a;
                int i6 = joVar.b;
                int i7 = joVar.c;
                Object Q = kd2Var.Q();
                if (Q == au0.a) {
                    Q = yb.e;
                    kd2Var.n0(Q);
                }
                vo3 vo3Var = (vo3) Q;
                int hashCode = Long.hashCode(kd2Var.T);
                al4 l = kd2Var.l();
                yz3 E = o80.E(kd2Var, vz3.x);
                tt0.d.getClass();
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(za3.p0);
                } else {
                    kd2Var.q0();
                }
                ss5.i(p7.F, kd2Var, vo3Var);
                ss5.i(p7.E, kd2Var, l);
                ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                ss5.h(kd2Var);
                ss5.i(p7.D, kd2Var, E);
                jc2Var.invoke(koVar.subSequence(i6, i7).y, kd2Var, 0);
                kd2Var.q(true);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new mo((byte) 0, i, koVar, list);
        }
    }
}
