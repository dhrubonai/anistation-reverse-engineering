package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr3 {
    public final c71 c;
    public final k46 d;
    public final h5 e;
    public long f;
    public int g;
    public boolean h;
    public pr3 i;
    public final pr3[] j;
    public final pr3[] k;
    public pr3 l;
    public pr3 m;
    public int n;
    public Object o;
    public long p;
    public final hf6 a = new hf6();
    public final jf6 b = new jf6();
    public ArrayList q = new ArrayList();

    public rr3(c71 c71Var, k46 k46Var, h5 h5Var, int i) {
        this.c = c71Var;
        this.d = k46Var;
        this.e = h5Var;
        this.j = new pr3[i];
        this.k = new pr3[i];
    }

    public static boolean m(pr3[] pr3VarArr, long[] jArr, pr3 pr3Var, long j) {
        for (int i = 0; i < pr3VarArr.length; i++) {
            pr3 pr3Var2 = pr3VarArr[i];
            if (pr3Var2 != null) {
                for (pr3 pr3Var3 = pr3Var.m; pr3Var3 != null; pr3Var3 = pr3Var3.m) {
                    if (pr3Var3 == pr3Var2) {
                        return true;
                    }
                }
                if (pr3Var2 != pr3Var) {
                    continue;
                } else {
                    long j2 = jArr[i];
                    if (j2 == Long.MIN_VALUE || j2 >= j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static jw3 t(kf6 kf6Var, Object obj, long j, long j2, jf6 jf6Var, hf6 hf6Var) {
        kf6Var.g(obj, hf6Var);
        kf6Var.n(hf6Var.c, jf6Var);
        kf6Var.b(obj);
        int i = hf6Var.g.a;
        if (i != 0) {
            if (i == 1) {
                hf6Var.f(0);
            }
            hf6Var.g.getClass();
            hf6Var.g(0);
        }
        kf6Var.g(obj, hf6Var);
        int c = hf6Var.c(j);
        if (c == -1) {
            return new jw3(obj, j2, hf6Var.b(j));
        }
        return new jw3(obj, c, hf6Var.e(c), j2, -1);
    }

    public final pr3 a() {
        pr3 pr3Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            pr3[] pr3VarArr = this.j;
            if (i2 >= pr3VarArr.length) {
                break;
            }
            if (this.i.equals(pr3VarArr[i2])) {
                pr3VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            pr3[] pr3VarArr2 = this.k;
            int length = pr3VarArr2.length;
            pr3Var = this.i;
            if (i >= length) {
                break;
            }
            if (pr3Var.equals(pr3VarArr2[i])) {
                pr3VarArr2[i] = this.i.m;
            }
            i++;
        }
        pr3Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            pr3 pr3Var2 = this.i;
            this.o = pr3Var2.b;
            this.p = pr3Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        pr3 pr3Var = this.i;
        pr3Var.getClass();
        this.o = pr3Var.b;
        this.p = pr3Var.g.a.d;
        while (pr3Var != null) {
            pr3Var.i();
            pr3Var = pr3Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final pr3 c() {
        pr3 pr3Var = this.i;
        while (pr3Var != null) {
            for (pr3 pr3Var2 : this.k) {
                if (pr3Var == pr3Var2) {
                    return pr3Var;
                }
            }
            pr3Var = pr3Var.m;
        }
        return pr3Var;
    }

    public final pr3 d() {
        pr3 pr3Var = this.i;
        while (pr3Var != null) {
            for (pr3 pr3Var2 : this.j) {
                if (pr3Var == pr3Var2) {
                    return pr3Var;
                }
            }
            pr3Var = pr3Var.m;
        }
        return pr3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qr3 e(defpackage.kf6 r22, defpackage.pr3 r23, long r24) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr3.e(kf6, pr3, long):qr3");
    }

    public final pr3 f() {
        pr3[] pr3VarArr = this.j;
        if (pr3VarArr.length == 0) {
            return null;
        }
        pr3 pr3Var = pr3VarArr[0];
        for (pr3 pr3Var2 = this.i; pr3Var2 != null; pr3Var2 = pr3Var2.m) {
            int length = pr3VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (pr3Var2 != pr3VarArr[i]) {
                    i++;
                } else {
                    pr3Var = pr3Var2;
                    break;
                }
            }
        }
        return pr3Var;
    }

    public final long g(kf6 kf6Var, jw3 jw3Var) {
        Object obj = jw3Var.a;
        hf6 hf6Var = this.a;
        kf6Var.g(obj, hf6Var);
        if (jw3Var.c()) {
            return hf6Var.a(jw3Var.b, jw3Var.c);
        }
        int i = jw3Var.e;
        if (i != -1) {
            hf6Var.d(i);
            return 0L;
        }
        return hf6Var.d;
    }

    public final qr3 h(kf6 kf6Var, jw3 jw3Var, long j, long j2, long j3) {
        kf6Var.g(jw3Var.a, this.a);
        boolean c = jw3Var.c();
        Object obj = jw3Var.a;
        if (c) {
            return i(kf6Var, obj, jw3Var.b, jw3Var.c, j, jw3Var.d);
        }
        return j(kf6Var, obj, j2, j3, j, jw3Var.d);
    }

    public final qr3 i(kf6 kf6Var, Object obj, int i, int i2, long j, long j2) {
        jw3 jw3Var = new jw3(obj, i, i2, j2, -1);
        hf6 hf6Var = this.a;
        long a = kf6Var.g(obj, hf6Var).a(i, i2);
        if (i2 == hf6Var.e(i)) {
            hf6Var.g.getClass();
        }
        hf6Var.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new qr3(jw3Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final qr3 j(kf6 kf6Var, Object obj, long j, long j2, long j3, long j4) {
        boolean z;
        long j5;
        hf6 hf6Var = this.a;
        kf6Var.g(obj, hf6Var);
        int b = hf6Var.b(j);
        if (b != -1) {
            hf6Var.g(b);
        }
        if (b != -1) {
            hf6Var.g(b);
        }
        jw3 jw3Var = new jw3(obj, j4, b);
        if (!jw3Var.c() && b == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean o = o(kf6Var, jw3Var);
        boolean n = n(kf6Var, jw3Var, z);
        long g = g(kf6Var, jw3Var);
        if (g != -9223372036854775807L && j >= g) {
            j5 = Math.max(0L, g - 1);
        } else {
            j5 = j;
        }
        return new qr3(jw3Var, j5, j2, j3, g, false, z, o, n);
    }

    public final pr3 k(int i) {
        return this.k[i];
    }

    public final qr3 l(kf6 kf6Var, qr3 qr3Var) {
        boolean z;
        jw3 jw3Var = qr3Var.a;
        int i = jw3Var.e;
        if (!jw3Var.c() && i == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean o = o(kf6Var, jw3Var);
        boolean n = n(kf6Var, jw3Var, z2);
        long g = g(kf6Var, jw3Var);
        Object obj = jw3Var.a;
        hf6 hf6Var = this.a;
        kf6Var.g(obj, hf6Var);
        if (jw3Var.c()) {
            hf6Var.g(jw3Var.b);
        } else if (i != -1) {
            hf6Var.g(i);
        }
        return new qr3(jw3Var, qr3Var.b, qr3Var.c, qr3Var.d, g, false, z2, o, n);
    }

    public final boolean n(kf6 kf6Var, jw3 jw3Var, boolean z) {
        int b = kf6Var.b(jw3Var.a);
        hf6 hf6Var = this.a;
        int i = kf6Var.f(b, hf6Var, false).c;
        jf6 jf6Var = this.b;
        if (kf6Var.m(i, jf6Var, 0L).i || kf6Var.d(b, hf6Var, jf6Var, this.g, this.h) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean o(kf6 kf6Var, jw3 jw3Var) {
        boolean z;
        if (!jw3Var.c() && jw3Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = jw3Var.a;
        if (z) {
            if (kf6Var.m(kf6Var.g(obj, this.a).c, this.b, 0L).o == kf6Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        pr3 pr3Var = this.m;
        if (pr3Var == null || pr3Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                pr3 pr3Var2 = (pr3) this.q.get(i);
                if (!pr3Var2.h()) {
                    this.m = pr3Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        jw3 jw3Var;
        pr3 pr3Var;
        jw2 k = nw2.k();
        for (pr3 pr3Var2 = this.i; pr3Var2 != null; pr3Var2 = pr3Var2.m) {
            k.c(pr3Var2.g.a);
        }
        pr3[] pr3VarArr = this.j;
        if (pr3VarArr.length != 0 && (pr3Var = pr3VarArr[0]) != null) {
            jw3Var = pr3Var.g.a;
        } else {
            jw3Var = null;
        }
        this.d.f(new ze((Object) this, (Object) k, (Object) jw3Var, (byte) 12));
    }

    public final void r(long j) {
        boolean z;
        pr3 pr3Var = this.l;
        if (pr3Var != null) {
            if (pr3Var.m == null) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            if (pr3Var.e) {
                pr3Var.a.v(j - pr3Var.p);
            }
        }
    }

    public final int s(pr3 pr3Var) {
        pr3[] pr3VarArr;
        pr3[] pr3VarArr2;
        pr3Var.getClass();
        if (pr3Var == this.l) {
            return 0;
        }
        this.l = pr3Var;
        int i = 0;
        while (true) {
            pr3Var = pr3Var.m;
            if (pr3Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                pr3VarArr = this.j;
                int length = pr3VarArr.length;
                pr3VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (pr3Var == pr3VarArr[i2]) {
                    pr3 pr3Var2 = this.i;
                    pr3VarArr[i2] = pr3Var2;
                    pr3VarArr2[i2] = pr3Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < pr3VarArr2.length; i3++) {
                if (pr3Var == pr3VarArr2[i3]) {
                    pr3VarArr2[i3] = pr3VarArr[i3];
                    i |= 2;
                }
            }
            pr3Var.i();
            this.n--;
        }
        pr3 pr3Var3 = this.l;
        pr3Var3.getClass();
        if (pr3Var3.m != null) {
            pr3Var3.b();
            pr3Var3.m = null;
            pr3Var3.c();
        }
        q();
        return i;
    }

    public final jw3 u(qn4 qn4Var, kf6 kf6Var, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        hf6 hf6Var = this.a;
        int i = kf6Var.g(obj, hf6Var).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 != null && (b = kf6Var.b(obj2)) != -1 && kf6Var.f(b, hf6Var, false).c == i) {
            v = this.p;
        } else {
            pr3 pr3Var = this.i;
            while (true) {
                if (pr3Var != null) {
                    if (pr3Var.b.equals(obj)) {
                        v = pr3Var.g.a.d;
                        break;
                    }
                    pr3Var = pr3Var.m;
                } else {
                    pr3 pr3Var2 = this.i;
                    while (true) {
                        if (pr3Var2 != null) {
                            int b2 = kf6Var.b(pr3Var2.b);
                            if (b2 != -1 && kf6Var.f(b2, hf6Var, false).c == i) {
                                v = pr3Var2.g.a.d;
                                break;
                            }
                            pr3Var2 = pr3Var2.m;
                        } else {
                            v = v(obj);
                            if (v == -1) {
                                v = this.f;
                                this.f = 1 + v;
                                if (this.i == null) {
                                    this.o = obj;
                                    this.p = v;
                                }
                            }
                        }
                    }
                }
            }
        }
        jf6 jf6Var = this.b;
        if (!z && !z2) {
            jw3 jw3Var = qn4Var.b;
            long j2 = v;
            jw3 t = t(kf6Var, obj, j, j2, jf6Var, hf6Var);
            if (jw3Var.c() && jw3Var.equals(t)) {
                return jw3Var;
            }
            kf6Var.g(obj, hf6Var);
            return new jw3(obj, j2, hf6Var.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        kf6Var.g(obj3, hf6Var);
        kf6Var.n(hf6Var.c, jf6Var);
        int b3 = kf6Var.b(obj);
        boolean z4 = false;
        while (b3 >= jf6Var.n) {
            boolean z5 = true;
            kf6Var.f(b3, hf6Var, true);
            if (hf6Var.g.a <= 0) {
                z5 = z3;
            }
            z4 |= z5;
            jf6 jf6Var2 = jf6Var;
            if (hf6Var.c(hf6Var.d) != -1) {
                obj3 = hf6Var.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || hf6Var.d != 0)) {
                jf6Var = jf6Var2;
                break;
            }
            b3--;
            z3 = false;
            jf6Var = jf6Var2;
        }
        jw3 t2 = t(kf6Var, obj3, j, j3, jf6Var, hf6Var);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            kf6Var.g(obj4, hf6Var);
            hf6Var.g.a(i2).getClass();
            if (0 != j) {
                return new jw3(obj4, t2.d, hf6Var.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            pr3 pr3Var = (pr3) this.q.get(i);
            if (pr3Var.b.equals(obj)) {
                return pr3Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(kf6 kf6Var) {
        kf6 kf6Var2;
        pr3 pr3Var;
        pr3 pr3Var2 = this.i;
        if (pr3Var2 == null) {
            return 0;
        }
        int b = kf6Var.b(pr3Var2.b);
        while (true) {
            kf6Var2 = kf6Var;
            b = kf6Var2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                pr3Var = pr3Var2.m;
                if (pr3Var == null || pr3Var2.g.g) {
                    break;
                }
                pr3Var2 = pr3Var;
            }
            if (b == -1 || pr3Var == null || kf6Var2.b(pr3Var.b) != b) {
                break;
            }
            pr3Var2 = pr3Var;
            kf6Var = kf6Var2;
        }
        int s = s(pr3Var2);
        pr3Var2.g = l(kf6Var2, pr3Var2.g);
        return s;
    }

    public final int x(kf6 kf6Var, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        qr3 qr3Var;
        long j3;
        int i2;
        int i3;
        pr3 pr3Var = null;
        for (pr3 pr3Var2 = this.i; pr3Var2 != null; pr3Var2 = pr3Var2.m) {
            qr3 qr3Var2 = pr3Var2.g;
            jw3 jw3Var = qr3Var2.a;
            if (pr3Var == null) {
                qr3Var = l(kf6Var, qr3Var2);
                j2 = -9223372036854775807L;
                i = 0;
            } else {
                qr3 e = e(kf6Var, pr3Var, j);
                if (e != null) {
                    long j4 = e.b;
                    long j5 = qr3Var2.c;
                    j2 = -9223372036854775807L;
                    long j6 = qr3Var2.b;
                    i = 0;
                    if (jw3Var.equals(e.a)) {
                        if (j6 != j4) {
                            if (j5 != -9223372036854775807L) {
                                long j7 = e.c;
                                if (j7 != -9223372036854775807L) {
                                    if (Math.abs((j4 - j7) - (j6 - j5)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        if (j6 != j4) {
                            qr3Var = e.b(j6, j5);
                        } else {
                            qr3Var = e;
                        }
                    }
                }
                return s(pr3Var);
            }
            long j8 = qr3Var2.d;
            long j9 = qr3Var2.e;
            qr3 a = qr3Var.a(j8);
            pr3Var2.g = a;
            long j10 = qr3Var.e;
            if (j9 != j10) {
                if (j10 == j2) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j10 + pr3Var2.p;
                }
                if (!a.f && m(this.j, jArr, pr3Var2, j3)) {
                    i2 = 1;
                } else {
                    i2 = i;
                }
                boolean m = m(this.k, jArr2, pr3Var2, j3);
                int s = s(pr3Var2);
                if (s != 0) {
                    return s;
                }
                if (i2 != 0 && (j9 != j2 || jw3Var.e != -1)) {
                    i3 = 1;
                } else {
                    i3 = i;
                }
                if (m) {
                    return i3 | 2;
                }
                return i3;
            }
            pr3Var = pr3Var2;
        }
        return 0;
    }
}
