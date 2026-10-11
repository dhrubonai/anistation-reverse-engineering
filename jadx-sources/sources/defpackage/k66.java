package defpackage;

import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class k66 {
    public static final tq1 a = new tq1(new jk5((byte) 12), (byte) 1);

    public static final void a(Route route, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        Route route2;
        route.getClass();
        ub2Var.getClass();
        kd2Var.f0(1088108712);
        if (kd2Var.f(ub2Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            w44 h = xt5.h(ub2Var, kd2Var);
            w42 w42Var = (w42) kd2Var.j(a);
            boolean h2 = kd2Var.h(w42Var) | kd2Var.f(h);
            Object Q = kd2Var.Q();
            if (!h2 && Q != au0.a) {
                route2 = route;
            } else {
                route2 = route;
                Q = new e05(w42Var, route2, h, null, (byte) 9);
                kd2Var.n0(Q);
            }
            db.g(w42Var, route2, (ic2) Q, kd2Var);
        } else {
            route2 = route;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vl5((byte) 2, i, route2, ub2Var);
        }
    }
}
