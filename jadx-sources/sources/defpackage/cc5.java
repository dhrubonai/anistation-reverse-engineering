package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cc5 {
    public static final Class a;
    public static final fo6 b;
    public static final fo6 c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, fo6] */
    static {
        Class<?> cls;
        Class<?> cls2;
        ew4 ew4Var = ew4.c;
        fo6 fo6Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            ew4 ew4Var2 = ew4.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                fo6Var = (fo6) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = fo6Var;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += to0.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (to0.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (to0.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += to0.j(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += to0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += to0.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += to0.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += to0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += to0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void k(fo6 fo6Var, Object obj, Object obj2) {
        fo6Var.getClass();
        vd2 vd2Var = (vd2) obj;
        eo6 eo6Var = vd2Var.unknownFields;
        eo6 eo6Var2 = ((vd2) obj2).unknownFields;
        eo6 eo6Var3 = eo6.f;
        if (!eo6Var3.equals(eo6Var2)) {
            if (eo6Var3.equals(eo6Var)) {
                int i = eo6Var.a + eo6Var2.a;
                int[] copyOf = Arrays.copyOf(eo6Var.b, i);
                System.arraycopy(eo6Var2.b, 0, copyOf, eo6Var.a, eo6Var2.a);
                Object[] copyOf2 = Arrays.copyOf(eo6Var.c, i);
                System.arraycopy(eo6Var2.c, 0, copyOf2, eo6Var.a, eo6Var2.a);
                eo6Var = new eo6(i, copyOf, copyOf2, true);
            } else {
                eo6Var.getClass();
                if (!eo6Var2.equals(eo6Var3)) {
                    if (eo6Var.e) {
                        int i2 = eo6Var.a + eo6Var2.a;
                        eo6Var.a(i2);
                        System.arraycopy(eo6Var2.b, 0, eo6Var.b, eo6Var.a, eo6Var2.a);
                        System.arraycopy(eo6Var2.c, 0, eo6Var.c, eo6Var.a, eo6Var2.a);
                        eo6Var.a = i2;
                    } else {
                        ze0.d();
                        return;
                    }
                }
            }
        }
        vd2Var.unknownFields = eo6Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void o(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += to0.j(((Integer) list.get(i4)).intValue());
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void r(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void s(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += to0.j(((Integer) list.get(i4)).intValue());
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.w(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void t(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += to0.j(((Long) list.get(i4)).longValue());
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void u(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void v(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void w(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += to0.i((intValue >> 31) ^ (intValue << 1));
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    to0Var.D((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                to0Var.C(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void x(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += to0.j((longValue >> 63) ^ (longValue << 1));
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    to0Var.F((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                to0Var.E(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void y(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += to0.i(((Integer) list.get(i4)).intValue());
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.D(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, i75 i75Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            to0 to0Var = (to0) i75Var.y;
            int i2 = 0;
            if (z) {
                to0Var.B(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += to0.j(((Long) list.get(i4)).longValue());
                }
                to0Var.D(i3);
                while (i2 < list.size()) {
                    to0Var.F(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                to0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static Object j(Object obj, int i, x13 x13Var, Object obj2, fo6 fo6Var) {
        return obj2;
    }
}
