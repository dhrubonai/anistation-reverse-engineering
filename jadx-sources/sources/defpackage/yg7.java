package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yg7 {
    public static final p7 a;

    static {
        int i = se7.a;
        a = new p7((byte) 19);
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
        mf7 mf7Var = (mf7) obj;
        gh7 gh7Var = mf7Var.zzc;
        gh7 gh7Var2 = ((mf7) obj2).zzc;
        gh7 gh7Var3 = gh7.f;
        if (!gh7Var3.equals(gh7Var2)) {
            if (gh7Var3.equals(gh7Var)) {
                int i = gh7Var.a + gh7Var2.a;
                int[] copyOf = Arrays.copyOf(gh7Var.b, i);
                System.arraycopy(gh7Var2.b, 0, copyOf, gh7Var.a, gh7Var2.a);
                Object[] copyOf2 = Arrays.copyOf(gh7Var.c, i);
                System.arraycopy(gh7Var2.c, 0, copyOf2, gh7Var.a, gh7Var2.a);
                gh7Var = new gh7(i, copyOf, copyOf2, true);
            } else {
                gh7Var.getClass();
                if (!gh7Var2.equals(gh7Var3)) {
                    if (gh7Var.e) {
                        int i2 = gh7Var.a + gh7Var2.a;
                        gh7Var.e(i2);
                        System.arraycopy(gh7Var2.b, 0, gh7Var.b, gh7Var.a, gh7Var2.a);
                        System.arraycopy(gh7Var2.c, 0, gh7Var.c, gh7Var.a, gh7Var2.a);
                        gh7Var.a = i2;
                    } else {
                        ze0.d();
                        return;
                    }
                }
            }
        }
        mf7Var.zzc = gh7Var;
    }

    public static Object c(Object obj, int i, yf7 yf7Var, je7 je7Var, Object obj2, p7 p7Var) {
        if (je7Var == null) {
            return obj2;
        }
        if (yf7Var != null) {
            int size = yf7Var.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) yf7Var.get(i3);
                int intValue = num.intValue();
                if (je7Var.a(intValue)) {
                    if (i3 != i2) {
                        yf7Var.set(i2, num);
                    }
                    i2++;
                } else {
                    if (obj2 == null) {
                        p7Var.getClass();
                        obj2 = p7.b(obj);
                    }
                    p7Var.getClass();
                    ((gh7) obj2).d(i << 3, Long.valueOf(intValue));
                }
            }
            if (i2 != size) {
                yf7Var.subList(i2, size).clear();
            }
            return obj2;
        }
        Iterator it = yf7Var.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!je7Var.a(intValue2)) {
                if (obj2 == null) {
                    p7Var.getClass();
                    obj2 = p7.b(obj);
                }
                p7Var.getClass();
                ((gh7) obj2).d(i << 3, Long.valueOf(intValue2));
                it.remove();
            }
        }
        return obj2;
    }

    public static void d(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (z) {
                ef7Var.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                ef7Var.r(i3);
                while (i2 < list.size()) {
                    ef7Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void e(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (z) {
                ef7Var.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                ef7Var.r(i3);
                while (i2 < list.size()) {
                    ef7Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void f(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof eg7) {
                eg7 eg7Var = (eg7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < eg7Var.z; i4++) {
                        i3 += ef7.b(eg7Var.c(i4));
                    }
                    ef7Var.r(i3);
                    while (i2 < eg7Var.z) {
                        ef7Var.t(eg7Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < eg7Var.z) {
                    ef7Var.h(i, eg7Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += ef7.b(((Long) list.get(i6)).longValue());
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof eg7) {
                eg7 eg7Var = (eg7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < eg7Var.z; i4++) {
                        i3 += ef7.b(eg7Var.c(i4));
                    }
                    ef7Var.r(i3);
                    while (i2 < eg7Var.z) {
                        ef7Var.t(eg7Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < eg7Var.z) {
                    ef7Var.h(i, eg7Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += ef7.b(((Long) list.get(i6)).longValue());
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.t(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.h(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void h(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof eg7) {
                eg7 eg7Var = (eg7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < eg7Var.z; i4++) {
                        long c = eg7Var.c(i4);
                        i3 += ef7.b((c >> 63) ^ (c + c));
                    }
                    ef7Var.r(i3);
                    while (i2 < eg7Var.z) {
                        long c2 = eg7Var.c(i2);
                        ef7Var.t((c2 >> 63) ^ (c2 + c2));
                        i2++;
                    }
                    return;
                }
                while (i2 < eg7Var.z) {
                    long c3 = eg7Var.c(i2);
                    ef7Var.h(i, (c3 >> 63) ^ (c3 + c3));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += ef7.b((longValue >> 63) ^ (longValue + longValue));
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    ef7Var.t((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                ef7Var.h(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void i(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof eg7) {
                eg7 eg7Var = (eg7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < eg7Var.z; i4++) {
                        eg7Var.c(i4);
                        i3 += 8;
                    }
                    ef7Var.r(i3);
                    while (i2 < eg7Var.z) {
                        ef7Var.u(eg7Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < eg7Var.z) {
                    ef7Var.i(i, eg7Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof eg7) {
                eg7 eg7Var = (eg7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < eg7Var.z; i4++) {
                        eg7Var.c(i4);
                        i3 += 8;
                    }
                    ef7Var.r(i3);
                    while (i2 < eg7Var.z) {
                        ef7Var.u(eg7Var.c(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < eg7Var.z) {
                    ef7Var.i(i, eg7Var.c(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    i5 += 8;
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.i(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        i3 += ef7.b(nf7Var.d(i4));
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        ef7Var.q(nf7Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    ef7Var.e(i, nf7Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += ef7.b(((Integer) list.get(i6)).intValue());
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        i3 += ef7.a(nf7Var.d(i4));
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        ef7Var.r(nf7Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    ef7Var.f(i, nf7Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += ef7.a(((Integer) list.get(i6)).intValue());
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.r(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void m(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        int d = nf7Var.d(i4);
                        i3 += ef7.a((d >> 31) ^ (d + d));
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        int d2 = nf7Var.d(i2);
                        ef7Var.r((d2 >> 31) ^ (d2 + d2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    int d3 = nf7Var.d(i2);
                    ef7Var.f(i, (d3 >> 31) ^ (d3 + d3));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += ef7.a((intValue >> 31) ^ (intValue + intValue));
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    ef7Var.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                ef7Var.f(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void n(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        nf7Var.d(i4);
                        i3 += 4;
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        ef7Var.s(nf7Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    ef7Var.g(i, nf7Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void o(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        nf7Var.d(i4);
                        i3 += 4;
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        ef7Var.s(nf7Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    ef7Var.g(i, nf7Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    i5 += 4;
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.s(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void p(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (list instanceof nf7) {
                nf7 nf7Var = (nf7) list;
                if (z) {
                    ef7Var.d(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < nf7Var.z; i4++) {
                        i3 += ef7.b(nf7Var.d(i4));
                    }
                    ef7Var.r(i3);
                    while (i2 < nf7Var.z) {
                        ef7Var.q(nf7Var.d(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < nf7Var.z) {
                    ef7Var.e(i, nf7Var.d(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                ef7Var.d(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += ef7.b(((Integer) list.get(i6)).intValue());
                }
                ef7Var.r(i5);
                while (i2 < list.size()) {
                    ef7Var.q(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void q(int i, List list, ub7 ub7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ef7 ef7Var = (ef7) ub7Var.y;
            int i2 = 0;
            if (z) {
                ef7Var.d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                ef7Var.r(i3);
                while (i2 < list.size()) {
                    ef7Var.p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ef7Var.j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eg7) {
            eg7 eg7Var = (eg7) list;
            int i2 = 0;
            while (i < size) {
                i2 += ef7.b(eg7Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ef7.b(((Long) list.get(i)).longValue());
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
        if (list instanceof eg7) {
            eg7 eg7Var = (eg7) list;
            int i2 = 0;
            while (i < size) {
                i2 += ef7.b(eg7Var.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ef7.b(((Long) list.get(i)).longValue());
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
        if (list instanceof eg7) {
            eg7 eg7Var = (eg7) list;
            int i2 = 0;
            while (i < size) {
                long c = eg7Var.c(i);
                i2 += ef7.b((c >> 63) ^ (c + c));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i3 += ef7.b((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof nf7) {
            nf7 nf7Var = (nf7) list;
            int i2 = 0;
            while (i < size) {
                i2 += ef7.b(nf7Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ef7.b(((Integer) list.get(i)).intValue());
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
        if (list instanceof nf7) {
            nf7 nf7Var = (nf7) list;
            int i2 = 0;
            while (i < size) {
                i2 += ef7.b(nf7Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ef7.b(((Integer) list.get(i)).intValue());
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
        if (list instanceof nf7) {
            nf7 nf7Var = (nf7) list;
            int i2 = 0;
            while (i < size) {
                i2 += ef7.a(nf7Var.d(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += ef7.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof nf7) {
            nf7 nf7Var = (nf7) list;
            int i2 = 0;
            while (i < size) {
                int d = nf7Var.d(i);
                i2 += ef7.a((d >> 31) ^ (d + d));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i3 += ef7.a((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i3;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ef7.a(i << 3) + 4) * size;
    }

    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ef7.a(i << 3) + 8) * size;
    }
}
