package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class dv1 {
    public static final tk6 a = new tk6(yj.F, yj.G);
    public static final tw5 b = z51.O(0.0f, 400.0f, null, 5);
    public static final tw5 c = z51.O(0.0f, 400.0f, null, 5);
    public static final tw5 d;
    public static final tw5 e;

    static {
        Map map = sw6.a;
        d = z51.O(0.0f, 400.0f, new c13(4294967297L), 1);
        e = z51.O(0.0f, 400.0f, new k13(4294967297L), 1);
    }

    public static final void a(xi6 xi6Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        kd2Var.f0(-1186853286);
        if ((i & 6) == 0) {
            if (kd2Var.f(xi6Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(sb2Var)) {
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
            ti4 ti4Var = xi6Var.e;
            ti4 ti4Var2 = xi6Var.d;
            if (ti4Var.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a34.i(xi6Var.a.v(), ti4Var2.getValue()) && !z2) {
                sb2Var.invoke();
            }
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            Object obj = Q;
            if (Q == q18Var) {
                boolean[] zArr = {z2};
                kd2Var.n0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new Object[1];
                kd2Var.n0(Q2);
            }
            Object[] objArr = (Object[]) Q2;
            if (!a34.i(objArr[0], ti4Var2.getValue())) {
                if (!z2 && !zArr2[0]) {
                    sb2Var.invoke();
                }
                objArr[0] = ti4Var2.getValue();
            }
            zArr2[0] = z2;
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new wu1(xi6Var, sb2Var, i);
        }
    }

    public static iv1 b(j32 j32Var, int i) {
        if ((i & 1) != 0) {
            j32Var = z51.O(0.0f, 400.0f, null, 5);
        }
        return new iv1(new wi6(new j12(0.0f, j32Var), (hr5) null, (ij0) null, (ya5) null, (LinkedHashMap) null, 126));
    }

    public static rx1 c(sk6 sk6Var, int i) {
        j32 j32Var = sk6Var;
        if ((i & 1) != 0) {
            j32Var = z51.O(0.0f, 400.0f, null, 5);
        }
        return new rx1(new wi6(new j12(0.0f, j32Var), (hr5) null, (ij0) null, (ya5) null, (LinkedHashMap) null, 126));
    }

    public static rx1 d(sk6 sk6Var, float f, int i) {
        j32 j32Var = sk6Var;
        if ((i & 1) != 0) {
            j32Var = z51.O(0.0f, 400.0f, null, 5);
        }
        return new rx1(new wi6((j12) null, (hr5) null, (ij0) null, new ya5(f, xh6.b, j32Var), (LinkedHashMap) null, 119));
    }

    public static final iv1 e(j32 j32Var, ub2 ub2Var) {
        return new iv1(new wi6((j12) null, new hr5(j32Var, new cv1(ub2Var, (byte) 2)), (ij0) null, (ya5) null, (LinkedHashMap) null, 125));
    }

    public static final rx1 f(j32 j32Var, ub2 ub2Var) {
        return new rx1(new wi6((j12) null, new hr5(j32Var, new cv1(ub2Var, (byte) 3)), (ij0) null, (ya5) null, (LinkedHashMap) null, 125));
    }
}
