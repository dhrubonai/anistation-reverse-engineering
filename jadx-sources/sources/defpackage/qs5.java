package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anistation.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qs5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l12] */
    public static final void a(yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        os0 os0Var = zs0.a;
        kd2Var.f0(-977568115);
        if ((i & 6) == 0) {
            if (kd2Var.f(null)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(os0Var)) {
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
            String m = lt5.m(R.string.m3c_snackbar_pane_title, kd2Var);
            Object Q = kd2Var.Q();
            Object obj = Q;
            if (Q == au0.a) {
                ?? obj2 = new Object();
                obj2.a = new Object();
                obj2.b = new ArrayList();
                kd2Var.n0(obj2);
                obj = obj2;
            }
            l12 l12Var = (l12) obj;
            Object obj3 = l12Var.a;
            ArrayList arrayList = l12Var.b;
            if (!a34.i(null, obj3)) {
                kd2Var.e0(1154891761);
                l12Var.a = null;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((k12) arrayList.get(i6)).getClass();
                    arrayList2.add(null);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(null)) {
                    arrayList3.add(null);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj4 = arrayList3.get(i7);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    if (arrayList4.get(i8) == null) {
                        arrayList.add(new k12(nx7.R(-1952400805, new ps5(l12Var, m), kd2Var)));
                    } else {
                        ov3.d();
                        return;
                    }
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(1443908949);
                kd2Var.q(false);
            }
            vo3 c = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            zz4 B = kd2Var.B();
            if (B != null) {
                B.b |= 1;
                l12Var.c = B;
                kd2Var.e0(-1888182177);
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    k12 k12Var = (k12) arrayList.get(i9);
                    k12Var.getClass();
                    os0 os0Var2 = k12Var.a;
                    kd2Var.c0(1325010085, null);
                    os0 os0Var3 = zs0.a;
                    os0Var2.invoke(nx7.R(-1893791890, new rs0((byte) 10), kd2Var), kd2Var, 6);
                    kd2Var.q(false);
                }
                kd2Var.q(false);
                kd2Var.q(true);
            } else {
                ze0.m("no recompose scope found");
                return;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cc3(yz3Var, i);
        }
    }

    public static final void b(rs5 rs5Var, yz3 yz3Var, jc2 jc2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        yz3 yz3Var2;
        int i3;
        kd2Var.f0(-1077081618);
        if ((i & 6) == 0) {
            if (kd2Var.f(rs5Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i4 & 1, z)) {
            jc2Var = zs0.a;
            if (rs5Var.a.getValue() == null) {
                x3 x3Var = (x3) kd2Var.j(bv0.a);
                vz0 vz0Var = null;
                boolean f = kd2Var.f(null) | kd2Var.h(x3Var);
                Object Q = kd2Var.Q();
                if (f || Q == au0.a) {
                    Q = new ji(x3Var, vz0Var, (byte) 8);
                    kd2Var.n0(Q);
                }
                db.f((ic2) Q, kd2Var, null);
                if (rs5Var.a.getValue() == null) {
                    int i5 = i4 & 1008;
                    vz3 vz3Var = vz3.x;
                    a(vz3Var, kd2Var, i5);
                    yz3Var2 = vz3Var;
                } else {
                    ov3.d();
                    return;
                }
            } else {
                ov3.d();
                return;
            }
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        jc2 jc2Var2 = jc2Var;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 12, i, (Object) rs5Var, (Object) yz3Var2, (Object) jc2Var2);
        }
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ze0.k(str);
    }

    public static final void d(qz5 qz5Var, qz5 qz5Var2) {
        for (Map.Entry entry : qz5Var2.a()) {
            qz5Var.j((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static yf6 e(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return yf6.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return yf6.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return yf6.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return yf6.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return yf6.SSL_3_0;
        }
        ze0.k("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final ga5 f(View view) {
        ga5 ga5Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof ga5) {
                ga5Var = (ga5) tag;
            } else {
                ga5Var = null;
            }
            if (ga5Var != null) {
                return ga5Var;
            }
            Object d = nz5.d(view);
            if (d instanceof View) {
                view = (View) d;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final long g(float f, long j) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return ep0.b(ep0.c(j) * f, j);
        }
        return j;
    }

    public static final double h(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static void i(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object j(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        ze0.m(h11.k(h11.o("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
