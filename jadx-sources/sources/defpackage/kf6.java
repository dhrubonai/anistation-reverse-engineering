package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kf6 {
    public static final gf6 a = new Object();
    public static final String b;
    public static final String c;
    public static final String d;

    /* JADX WARN: Type inference failed for: r0v0, types: [gf6, java.lang.Object] */
    static {
        String str = eq6.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public int b(Object obj) {
        if (obj == xn3.h) {
            return 0;
        }
        return -1;
    }

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, hf6 hf6Var, jf6 jf6Var, int i2, boolean z) {
        int i3 = f(i, hf6Var, false).c;
        if (m(i3, jf6Var, 0L).o == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, jf6Var, 0L).n;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                    return i + 1;
                }
                p65.l();
                return 0;
            }
            return i;
        }
        if (i == c(z)) {
            return -1;
        }
        return i + 1;
    }

    public boolean equals(Object obj) {
        int c2;
        if (this != obj) {
            if (obj instanceof kf6) {
                kf6 kf6Var = (kf6) obj;
                if (kf6Var.o() == o() && kf6Var.h() == h()) {
                    jf6 jf6Var = new jf6();
                    hf6 hf6Var = new hf6();
                    jf6 jf6Var2 = new jf6();
                    hf6 hf6Var2 = new hf6();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, jf6Var, 0L).equals(kf6Var.m(i, jf6Var2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, hf6Var, true).equals(kf6Var.f(i2, hf6Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == kf6Var.a(true) && (c2 = c(true)) == kf6Var.c(true)) {
                                        while (a2 != c2) {
                                            int e = e(a2, 0, true);
                                            if (e == kf6Var.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public hf6 f(int i, hf6 hf6Var, boolean z) {
        Integer num;
        Object obj = null;
        if (z) {
            num = 0;
        } else {
            num = null;
        }
        if (z) {
            obj = xn3.h;
        }
        hf6Var.h(num, obj, 0, -9223372036854775807L, 0L, y5.c, true);
        return hf6Var;
    }

    public hf6 g(Object obj, hf6 hf6Var) {
        return f(b(obj), hf6Var, true);
    }

    public int h() {
        return 1;
    }

    public int hashCode() {
        jf6 jf6Var = new jf6();
        hf6 hf6Var = new hf6();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, jf6Var, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, hf6Var, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(jf6 jf6Var, hf6 hf6Var, int i, long j) {
        Pair j2 = j(jf6Var, hf6Var, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(jf6 jf6Var, hf6 hf6Var, int i, long j, long j2) {
        io3.r(i, o());
        m(i, jf6Var, j2);
        if (j == -9223372036854775807L) {
            j = jf6Var.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = jf6Var.n;
        f(i2, hf6Var, false);
        while (i2 < jf6Var.o && hf6Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, hf6Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, hf6Var, true);
        long j3 = j - hf6Var.e;
        long j4 = hf6Var.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = hf6Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                    return i - 1;
                }
                p65.l();
                return 0;
            }
            return i;
        }
        if (i == a(z)) {
            return -1;
        }
        return i - 1;
    }

    public Object l(int i) {
        return xn3.h;
    }

    public jf6 m(int i, jf6 jf6Var, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final void n(int i, jf6 jf6Var) {
        m(i, jf6Var, 0L);
    }

    public int o() {
        return 1;
    }

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
