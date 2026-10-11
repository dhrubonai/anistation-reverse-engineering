package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rb8 {
    public static final z95 a;

    static {
        int i = b98.a;
        a = new z95((byte) 10);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void b(Object obj, Object obj2) {
        ba8 ba8Var = (ba8) obj;
        tc7 tc7Var = ba8Var.zzc;
        tc7 tc7Var2 = ((ba8) obj2).zzc;
        tc7 tc7Var3 = tc7.e;
        if (!tc7Var3.equals(tc7Var2)) {
            if (tc7Var3.equals(tc7Var)) {
                tc7Var.getClass();
                tc7Var2.getClass();
                int[] copyOf = Arrays.copyOf(tc7Var.a, 0);
                System.arraycopy(tc7Var2.a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(tc7Var.b, 0);
                System.arraycopy(tc7Var2.b, 0, copyOf2, 0, 0);
                tc7Var = new tc7(copyOf, copyOf2, true);
            } else {
                tc7Var.getClass();
                if (!tc7Var2.equals(tc7Var3)) {
                    if (tc7Var.d) {
                        System.arraycopy(tc7Var2.a, 0, tc7Var.a, 0, 0);
                        System.arraycopy(tc7Var2.b, 0, tc7Var.b, 0, 0);
                    } else {
                        ze0.d();
                        return;
                    }
                }
            }
        }
        ba8Var.zzc = tc7Var;
    }

    public static void c(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (z) {
                j98Var.l(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                j98Var.t(i3);
                while (i2 < list.size()) {
                    j98Var.w(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.q(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void d(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof s98) {
                s98 s98Var = (s98) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < s98Var.z; i4++) {
                        s98Var.c(i4);
                        float f = s98Var.y[i4];
                        i3 += 4;
                    }
                    j98Var.t(i3);
                    while (i2 < s98Var.z) {
                        s98Var.c(i2);
                        j98Var.u(Float.floatToRawIntBits(s98Var.y[i2]));
                        i2++;
                    }
                    return;
                }
                while (i2 < s98Var.z) {
                    s98Var.c(i2);
                    j98Var.o(i, Float.floatToRawIntBits(s98Var.y[i2]));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) list.get(i6)).getClass();
                    i5 += 4;
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.u(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.o(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void e(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof wa8) {
                wa8 wa8Var = (wa8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < wa8Var.z; i4++) {
                        i3 += j98.z(wa8Var.c(i4));
                    }
                    j98Var.t(i3);
                    while (i2 < wa8Var.z) {
                        j98Var.v(wa8Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < wa8Var.z) {
                    j98Var.p(i, wa8Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += j98.z(((Long) list.get(i6)).longValue());
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.v(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof wa8) {
                wa8 wa8Var = (wa8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < wa8Var.z; i4++) {
                        i3 += j98.z(wa8Var.c(i4));
                    }
                    j98Var.t(i3);
                    while (i2 < wa8Var.z) {
                        j98Var.v(wa8Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < wa8Var.z) {
                    j98Var.p(i, wa8Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += j98.z(((Long) list.get(i6)).longValue());
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.v(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.p(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof wa8) {
                wa8 wa8Var = (wa8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < wa8Var.z; i4++) {
                        long c = wa8Var.c(i4);
                        i3 += j98.z((c >> 63) ^ (c + c));
                    }
                    j98Var.t(i3);
                    while (i2 < wa8Var.z) {
                        long c2 = wa8Var.c(i2);
                        j98Var.v((c2 >> 63) ^ (c2 + c2));
                        i2++;
                    }
                    return;
                }
                while (i2 < wa8Var.z) {
                    long c3 = wa8Var.c(i2);
                    j98Var.p(i, (c3 >> 63) ^ (c3 + c3));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += j98.z((longValue >> 63) ^ (longValue + longValue));
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    j98Var.v((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                j98Var.p(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void h(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof wa8) {
                wa8 wa8Var = (wa8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < wa8Var.z; i4++) {
                        wa8Var.c(i4);
                        i3 += 8;
                    }
                    j98Var.t(i3);
                    while (i2 < wa8Var.z) {
                        j98Var.w(wa8Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < wa8Var.z) {
                    j98Var.q(i, wa8Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.w(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void i(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof wa8) {
                wa8 wa8Var = (wa8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < wa8Var.z; i4++) {
                        wa8Var.c(i4);
                        i3 += 8;
                    }
                    j98Var.t(i3);
                    while (i2 < wa8Var.z) {
                        j98Var.w(wa8Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < wa8Var.z) {
                    j98Var.q(i, wa8Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.w(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.q(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        i3 += j98.z(ca8Var.d(i4));
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        j98Var.s(ca8Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    j98Var.m(i, ca8Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += j98.z(((Integer) list.get(i6)).intValue());
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        i3 += j98.y(ca8Var.d(i4));
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        j98Var.t(ca8Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    j98Var.n(i, ca8Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += j98.y(((Integer) list.get(i6)).intValue());
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.t(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.n(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        int d = ca8Var.d(i4);
                        i3 += j98.y((d >> 31) ^ (d + d));
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        int d2 = ca8Var.d(i2);
                        j98Var.t((d2 >> 31) ^ (d2 + d2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    int d3 = ca8Var.d(i2);
                    j98Var.n(i, (d3 >> 31) ^ (d3 + d3));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += j98.y((intValue >> 31) ^ (intValue + intValue));
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    j98Var.t((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                j98Var.n(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void m(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        ca8Var.d(i4);
                        i3 += 4;
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        j98Var.u(ca8Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    j98Var.o(i, ca8Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        ca8Var.d(i4);
                        i3 += 4;
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        j98Var.u(ca8Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    j98Var.o(i, ca8Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.o(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void o(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = 0;
            if (list instanceof ca8) {
                ca8 ca8Var = (ca8) list;
                if (z) {
                    j98Var.l(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < ca8Var.z; i4++) {
                        i3 += j98.z(ca8Var.d(i4));
                    }
                    j98Var.t(i3);
                    while (i2 < ca8Var.z) {
                        j98Var.s(ca8Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < ca8Var.z) {
                    j98Var.m(i, ca8Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                j98Var.l(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += j98.z(((Integer) list.get(i6)).intValue());
                }
                j98Var.t(i5);
                while (i2 < list.size()) {
                    j98Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                j98Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, qb7 qb7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            j98 j98Var = (j98) qb7Var.y;
            int i2 = j98Var.c;
            byte[] bArr = j98Var.b;
            int i3 = 0;
            if (z) {
                j98Var.l(i, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    ((Boolean) list.get(i5)).getClass();
                    i4++;
                }
                j98Var.t(i4);
                while (i3 < list.size()) {
                    byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                    int i6 = j98Var.d;
                    int i7 = i6 + 1;
                    try {
                        bArr[i6] = booleanValue;
                        j98Var.d = i7;
                        i3++;
                    } catch (IndexOutOfBoundsException e) {
                        throw new co0(i7, i2, 1, e, (byte) 14);
                    }
                }
                return;
            }
            while (i3 < list.size()) {
                byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
                j98Var.t(i << 3);
                int i8 = j98Var.d;
                int i9 = i8 + 1;
                try {
                    bArr[i8] = booleanValue2;
                    j98Var.d = i9;
                    i3++;
                } catch (IndexOutOfBoundsException e2) {
                    throw new co0(i9, i2, 1, e2, (byte) 14);
                }
            }
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wa8) {
            wa8 wa8Var = (wa8) list;
            int i2 = 0;
            while (i < size) {
                i2 += j98.z(wa8Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += j98.z(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wa8) {
            wa8 wa8Var = (wa8) list;
            int i2 = 0;
            while (i < size) {
                i2 += j98.z(wa8Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += j98.z(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof wa8) {
            wa8 wa8Var = (wa8) list;
            int i2 = 0;
            while (i < size) {
                long c = wa8Var.c(i);
                i2 += j98.z((c >> 63) ^ (c + c));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += j98.z((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i3;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ca8) {
            ca8 ca8Var = (ca8) list;
            int i2 = 0;
            while (i < size) {
                i2 += j98.z(ca8Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += j98.z(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ca8) {
            ca8 ca8Var = (ca8) list;
            int i2 = 0;
            while (i < size) {
                i2 += j98.z(ca8Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += j98.z(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ca8) {
            ca8 ca8Var = (ca8) list;
            int i2 = 0;
            while (i < size) {
                i2 += j98.y(ca8Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += j98.y(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ca8) {
            ca8 ca8Var = (ca8) list;
            int i2 = 0;
            while (i < size) {
                int d = ca8Var.d(i);
                i2 += j98.y((d >> 31) ^ (d + d));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += j98.y((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j98.y(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j98.y(i << 3) + 8) * size;
    }
}
