package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k95 implements j95 {
    public static final y23 B = new y23(new wj3(27), new rs4(11), 14);
    public final pz3 A;
    public final Map x;
    public final p44 y;
    public n95 z;

    public k95(Map map) {
        this.x = map;
        long[] jArr = cb5.a;
        this.y = new p44();
        this.A = new pz3((Object) this, (byte) 19);
    }

    @Override // defpackage.j95
    public final void e(Object obj, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(533563200);
        if ((i & 6) == 0) {
            if (kd2Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            kd2Var.g0(obj);
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                pz3 pz3Var = this.A;
                if (((Boolean) pz3Var.invoke(obj)).booleanValue()) {
                    Map map = (Map) this.x.get(obj);
                    tq1 tq1Var = p95.a;
                    q95 q95Var = new q95(new o95(map, pz3Var));
                    kd2Var.n0(q95Var);
                    Q = q95Var;
                } else {
                    ov3.m("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
            }
            q95 q95Var2 = (q95) Q;
            kb0.c(new mw4[]{p95.a.a(q95Var2), ck3.a.a(q95Var2)}, os0Var, kd2Var, (i2 & 112) | 8);
            boolean h = kd2Var.h(this) | kd2Var.h(obj) | kd2Var.h(q95Var2);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == q18Var) {
                Q2 = new bg((Object) this, obj, (Object) q95Var2, (byte) 22);
                kd2Var.n0(Q2);
            }
            db.c(pn6.a, (ub2) Q2, kd2Var);
            if (kd2Var.y && kd2Var.G.i == kd2Var.z) {
                kd2Var.z = -1;
                kd2Var.y = false;
            }
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 11, i, (Object) this, obj, (Object) os0Var);
        }
    }

    @Override // defpackage.j95
    public final void f(Object obj) {
        if (this.y.l(obj) == null) {
            this.x.remove(obj);
        }
    }
}
