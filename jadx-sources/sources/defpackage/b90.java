package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class b90 {
    public static final p44 a = b(true);
    public static final p44 b = b(false);
    public static final yb c = yb.f;

    public static final void a(yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        kd2Var.f0(-211209833);
        if ((i & 6) == 0) {
            if (kd2Var.f(yz3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            int hashCode = Long.hashCode(kd2Var.T);
            yz3 E = o80.E(kd2Var, yz3Var);
            al4 l = kd2Var.l();
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new a90(yz3Var, i, b2);
        }
    }

    public static final p44 b(boolean z) {
        p44 p44Var = new p44(9);
        y50 y50Var = pk2.y;
        p44Var.n(y50Var, new e90(y50Var, z));
        y50 y50Var2 = pk2.z;
        p44Var.n(y50Var2, new e90(y50Var2, z));
        y50 y50Var3 = pk2.A;
        p44Var.n(y50Var3, new e90(y50Var3, z));
        y50 y50Var4 = pk2.B;
        p44Var.n(y50Var4, new e90(y50Var4, z));
        y50 y50Var5 = pk2.C;
        p44Var.n(y50Var5, new e90(y50Var5, z));
        y50 y50Var6 = pk2.D;
        p44Var.n(y50Var6, new e90(y50Var6, z));
        y50 y50Var7 = pk2.E;
        p44Var.n(y50Var7, new e90(y50Var7, z));
        y50 y50Var8 = pk2.F;
        p44Var.n(y50Var8, new e90(y50Var8, z));
        y50 y50Var9 = pk2.G;
        p44Var.n(y50Var9, new e90(y50Var9, z));
        return p44Var;
    }

    public static final vo3 c(e7 e7Var, boolean z) {
        p44 p44Var;
        if (z) {
            p44Var = a;
        } else {
            p44Var = b;
        }
        vo3 vo3Var = (vo3) p44Var.g(e7Var);
        if (vo3Var == null) {
            return new e90(e7Var, z);
        }
        return vo3Var;
    }

    public static final void d(dm4 dm4Var, em4 em4Var, ro3 ro3Var, ia3 ia3Var, int i, int i2, e7 e7Var) {
        z80 z80Var;
        e7 e7Var2;
        y50 y50Var;
        Object w = ro3Var.w();
        if (w instanceof z80) {
            z80Var = (z80) w;
        } else {
            z80Var = null;
        }
        if (z80Var != null && (y50Var = z80Var.L) != null) {
            e7Var2 = y50Var;
        } else {
            e7Var2 = e7Var;
        }
        dm4.i(dm4Var, em4Var, e7Var2.a((em4Var.x << 32) | (em4Var.y & 4294967295L), (i << 32) | (i2 & 4294967295L), ia3Var));
    }
}
