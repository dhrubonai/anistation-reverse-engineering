package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pe3 extends db {
    public final eb2 u = new eb2();
    public r34 v;

    public pe3(ub2 ub2Var) {
        ub2Var.invoke(this);
    }

    public static /* synthetic */ void A0(pe3 pe3Var, String str, os0 os0Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        pe3Var.z0(str, os0Var);
    }

    public static void C0(pe3 pe3Var, String str, final os0 os0Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        eb2 eb2Var = pe3Var.u;
        r34 r34Var = pe3Var.v;
        if (r34Var == null) {
            r34Var = new r34();
            pe3Var.v = r34Var;
        }
        r34Var.a(eb2Var.y);
        final int i2 = eb2Var.y;
        pe3Var.z0(str, new os0(-1588696110, true, new jc2() { // from class: oe3
            @Override // defpackage.jc2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean z;
                int i3;
                zc3 zc3Var = (zc3) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (kd2Var.f(zc3Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    os0.this.e(zc3Var, Integer.valueOf(i2), kd2Var, Integer.valueOf(intValue & 14));
                } else {
                    kd2Var.Y();
                }
                return pn6.a;
            }
        }));
    }

    public final void B0(int i, ub2 ub2Var, ub2 ub2Var2, os0 os0Var) {
        this.u.d(i, new ne3(ub2Var, ub2Var2, os0Var));
    }

    @Override // defpackage.db
    public final eb2 T() {
        return this.u;
    }

    public final void z0(Object obj, os0 os0Var) {
        zb3 zb3Var;
        byte b = 1;
        if (obj != null) {
            zb3Var = new zb3(obj, (byte) 1);
        } else {
            zb3Var = null;
        }
        this.u.d(1, new ne3(zb3Var, new p03((byte) 8), new os0(-857469575, true, new ac3(os0Var, b))));
    }
}
