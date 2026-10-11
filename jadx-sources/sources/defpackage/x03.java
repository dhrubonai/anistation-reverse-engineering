package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x03 {
    public final f44 a;
    public final w34 b;
    public int c;
    public int d;
    public final int e;
    public final boolean f;
    public r34 g;

    public x03(x03 x03Var) {
        int i;
        if (x03Var != null) {
            f44 f44Var = new f44(x03Var.a.b);
            f44Var.b(x03Var.a);
            this.a = f44Var;
            w34 w34Var = new w34(x03Var.b.b);
            w34 w34Var2 = x03Var.b;
            int i2 = w34Var.b;
            w34Var2.getClass();
            if (i2 >= 0 && i2 <= (i = w34Var.b)) {
                int i3 = w34Var2.b;
                if (i3 != 0) {
                    w34Var.b(i + i3);
                    long[] jArr = w34Var.a;
                    int i4 = w34Var.b;
                    if (i2 != i4) {
                        ms.z0(jArr, jArr, w34Var2.b + i2, i2, i4);
                    }
                    ms.z0(w34Var2.a, jArr, i2, 0, w34Var2.b);
                    w34Var.b += w34Var2.b;
                }
                this.b = w34Var;
                this.e = x03Var.e;
                this.d = x03Var.d;
                this.c = x03Var.c;
                this.f = x03Var.f;
                return;
            }
            ze0.g("");
            throw null;
        }
        f44 f44Var2 = new f44();
        this.a = f44Var2;
        w34 w34Var3 = new w34();
        this.b = w34Var3;
        long P = n77.P(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false);
        int i5 = w34Var3.b;
        w34Var3.a(n77.P(0, 0, false, false));
        w34Var3.a(0L);
        w34Var3.a(P);
        w34Var3.a(P);
        f44Var2.a(null);
        this.e = i5;
        this.d = i5;
        this.c = 0;
        this.f = true;
    }

    public final void a(int i) {
        int l;
        int i2 = this.d;
        int i3 = this.e;
        int i4 = i3;
        while (i2 != i3) {
            if (m(i) <= m(i2)) {
                l = h(i2);
            } else {
                l = l(i2);
            }
            int i5 = l;
            i4 = i2;
            i2 = i5;
        }
        v(i, i4);
        if (i4 == i3) {
            this.d = i;
        } else if (m(i) <= m(i4)) {
            t(i4, i);
        } else {
            w(i4, i);
        }
        y(i4);
        while (i != this.d && f(k(i)) == 0) {
            int k = k(k(i));
            if (k(i) == h(k)) {
                int l2 = l(k);
                if (f(l2) == 0) {
                    s(l2, 1);
                    s(k(i), 1);
                    s(k, 0);
                    i = k;
                } else {
                    if (i == l(k(i))) {
                        i = k(i);
                        q(i);
                    }
                    s(k(i), 1);
                    s(k, 0);
                    r(k);
                }
            } else {
                int h = h(k);
                if (f(h) == 0) {
                    s(h, 1);
                    s(k(i), 1);
                    s(k, 0);
                    i = k;
                } else {
                    if (i == h(k(i))) {
                        i = k(i);
                        r(i);
                    }
                    s(k(i), 1);
                    s(k, 0);
                    q(k);
                }
            }
        }
        s(this.d, 1);
    }

    public final void b() {
        w34 w34Var;
        if (this.c == 0) {
            return;
        }
        r34 o = o();
        o.b(p());
        int p = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            w34Var = this.b;
            if (i >= p) {
                break;
            }
            if (n77.i0(w34Var.c(i * 4))) {
                i2++;
            }
            o.a((i - i2) * 4);
            i++;
        }
        this.d = o.c(this.d / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = w34Var.b;
            f44 f44Var = this.a;
            if (i3 < i5) {
                long c = w34Var.c(i3);
                if (n77.i0(c)) {
                    i3 += 4;
                } else {
                    if (i4 != i3) {
                        w34Var.e(i4, (c & (-2147483648L)) | o.c(((int) (2147483647L & c)) / 4));
                        long c2 = w34Var.c(i3 + 1);
                        w34Var.e(i4 + 1, (o.c(((int) (c2 >> 32)) / 4) << 32) | (o.c(((int) (c2 & 4294967295L)) / 4) & 4294967295L));
                        w34Var.e(i4 + 2, w34Var.c(i3 + 2));
                        w34Var.e(i4 + 3, w34Var.c(i3 + 3));
                        f44Var.o(i4 / 4, f44Var.g(i3 / 4));
                    } else {
                        w34Var.e(i4, (c & (-2147483648L)) | o.c(((int) (2147483647L & c)) / 4));
                        long c3 = w34Var.c(i3 + 1);
                        w34Var.e(i4 + 1, (o.c(((int) (c3 >> 32)) / 4) << 32) | (o.c(((int) (c3 & 4294967295L)) / 4) & 4294967295L));
                    }
                    i3 += 4;
                    i4 += 4;
                }
            } else {
                w34Var.d(i4, i5);
                int i6 = f44Var.b;
                f44Var.m(i6 - this.c, i6);
                this.c = 0;
                o.b = 0;
                return;
            }
        }
    }

    public final void c() {
        if (p() > 64 && this.c >= p() / 2) {
            b();
        }
    }

    public final void d(int i) {
        int k;
        int i2;
        int k2;
        int f = f(i);
        int h = h(i);
        int i3 = this.e;
        if (h == i3) {
            i2 = l(i);
            k = k(i);
            x(i, l(i));
            y(k);
            y(i3);
        } else if (l(i) == i3) {
            i2 = h(i);
            k = k(i);
            x(i, h(i));
            y(k);
            y(i3);
        } else {
            int l = l(i);
            while (h(l) != i3) {
                l = h(l);
            }
            int f2 = f(l);
            int l2 = l(l);
            if (k(l) == i) {
                k = l;
            } else {
                k = k(l);
                x(l, l(l));
                w(l, l(i));
                v(l(l), l);
            }
            t(l, h(i));
            v(h(l), l);
            s(l, f(i));
            u(l, this.b.c(i + 3));
            x(i, l);
            y(k);
            y(l);
            f = f2;
            i2 = l2;
        }
        if (f == 1) {
            while (i2 != this.d && f(i2) == 1) {
                if (i2 == h(k)) {
                    int l3 = l(k);
                    if (f(l3) == 0) {
                        s(l3, 1);
                        s(k, 0);
                        q(k);
                        l3 = l(k);
                    }
                    if (f(h(l3)) == 1 && f(l(l3)) == 1) {
                        s(l3, 0);
                        k2 = k(k);
                        i2 = k;
                        k = k2;
                    } else {
                        if (f(l(l3)) == 1) {
                            s(h(l3), 1);
                            s(l3, 0);
                            r(l3);
                            l3 = l(k);
                        }
                        s(l3, f(k));
                        s(k, 1);
                        s(l(l3), 1);
                        q(k);
                        i2 = this.d;
                    }
                } else {
                    int h2 = h(k);
                    if (f(h2) == 0) {
                        s(h2, 1);
                        s(k, 0);
                        r(k);
                        h2 = h(k);
                    }
                    if (f(l(h2)) == 1 && f(h(h2)) == 1) {
                        s(h2, 0);
                        k2 = k(k);
                        i2 = k;
                        k = k2;
                    } else {
                        if (f(h(h2)) == 1) {
                            s(l(h2), 1);
                            s(h2, 0);
                            q(h2);
                            h2 = h(k);
                        }
                        s(h2, f(k));
                        s(k, 1);
                        s(h(h2), 1);
                        r(k);
                        i2 = this.d;
                    }
                }
            }
            s(i2, 1);
        }
    }

    public final void e(int i) {
        w34 w34Var = this.b;
        w34Var.e(i, w34Var.c(i) | 2147483648L);
        this.c++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x03)) {
            return false;
        }
        int i = this.d + 3;
        w34 w34Var = this.b;
        long c = w34Var.c(i);
        x03 x03Var = (x03) obj;
        w34 w34Var2 = x03Var.b;
        if (c != w34Var2.c(x03Var.d + 3) || p() - this.c != x03Var.p() - x03Var.c) {
            return false;
        }
        int i2 = 4;
        int i3 = 4;
        while (i2 < w34Var.b && i3 < w34Var2.b) {
            if (n77.i0(w34Var.c(i2))) {
                i2 += 4;
            } else {
                if (!n77.i0(w34Var2.c(i3))) {
                    if (w34Var.c(i2 + 2) != w34Var2.c(i3 + 2)) {
                        return false;
                    }
                    if (!a34.i(this.a.g(i2 / 4), x03Var.a.g(i3 / 4))) {
                        return false;
                    }
                    i2 += 4;
                }
                i3 += 4;
            }
        }
        return true;
    }

    public final int f(int i) {
        return !n77.h0(this.b.c(i)) ? 1 : 0;
    }

    public final int g(int i) {
        return (int) (n(i) & 2147483647L);
    }

    public final int h(int i) {
        return (int) (this.b.c(i + 1) >> 32);
    }

    public final int hashCode() {
        int i;
        int i2 = 4;
        int i3 = 0;
        while (true) {
            w34 w34Var = this.b;
            if (i2 < w34Var.b) {
                if (!n77.i0(w34Var.c(i2))) {
                    int g = (g(i2) + ((m(i2) + (i3 * 31)) * 31)) * 31;
                    Object g2 = this.a.g(i2 / 4);
                    if (g2 != null) {
                        i = g2.hashCode();
                    } else {
                        i = 0;
                    }
                    i3 = g + i;
                }
                i2 += 4;
            } else {
                return i3;
            }
        }
    }

    public final int i(int i) {
        return (int) (this.b.c(i + 3) & 2147483647L);
    }

    public final int j(int i) {
        return n77.j0(this.b.c(i + 3));
    }

    public final int k(int i) {
        return (int) (this.b.c(i) & 2147483647L);
    }

    public final int l(int i) {
        return (int) (this.b.c(i + 1) & 4294967295L);
    }

    public final int m(int i) {
        return n77.j0(n(i));
    }

    public final long n(int i) {
        return this.b.c(i + 2);
    }

    public final r34 o() {
        r34 r34Var = this.g;
        if (r34Var == null) {
            r34 r34Var2 = new r34();
            this.g = r34Var2;
            return r34Var2;
        }
        return r34Var;
    }

    public final int p() {
        return this.b.b / 4;
    }

    public final void q(int i) {
        int l = l(i);
        w(i, h(l));
        int h = h(l);
        int i2 = this.e;
        if (h != i2) {
            v(h(l), i);
        }
        v(l, k(i));
        if (k(i) == i2) {
            this.d = l;
        } else if (h(k(i)) == i) {
            t(k(i), l);
        } else {
            w(k(i), l);
        }
        t(l, i);
        v(i, l);
        y(i);
        y(k(i));
    }

    public final void r(int i) {
        int h = h(i);
        t(i, l(h));
        int l = l(h);
        int i2 = this.e;
        if (l != i2) {
            v(l(h), i);
        }
        v(h, k(i));
        if (k(i) == i2) {
            this.d = h;
        } else if (l(k(i)) == i) {
            w(k(i), h);
        } else {
            t(k(i), h);
        }
        w(h, i);
        v(i, h);
        y(i);
        y(k(i));
    }

    public final void s(int i, int i2) {
        long j;
        w34 w34Var = this.b;
        long c = w34Var.c(i);
        if (i2 == 0) {
            j = c | Long.MIN_VALUE;
        } else {
            j = c & Long.MAX_VALUE;
        }
        w34Var.e(i, j);
    }

    public final void t(int i, int i2) {
        w34 w34Var = this.b;
        w34Var.e(i + 1, (((int) (w34Var.c(r7) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    public final void u(int i, long j) {
        this.b.e(i + 3, j);
    }

    public final void v(int i, int i2) {
        w34 w34Var = this.b;
        w34Var.e(i, (w34Var.c(i) & (-2147483648L)) | i2);
    }

    public final void w(int i, int i2) {
        w34 w34Var = this.b;
        w34Var.e(i + 1, (((int) (w34Var.c(r7) >> 32)) << 32) | (i2 & 4294967295L));
    }

    public final void x(int i, int i2) {
        if (i == i2) {
            return;
        }
        int k = k(i);
        int i3 = this.e;
        if (k == i3) {
            this.d = i2;
        } else if (i == h(k(i))) {
            t(k(i), i2);
        } else {
            w(k(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        v(i2, k(i));
    }

    public final void y(int i) {
        while (i != this.e) {
            long c = this.b.c(i + 3);
            int min = Math.min(m(i), Math.min(j(h(i)), j(l(i))));
            int max = Math.max(g(i), Math.max(i(h(i)), i(l(i))));
            if (n77.j0(c) == min && ((int) (c & 2147483647L)) == max) {
                return;
            }
            u(i, n77.P(min, max, false, false));
            i = k(i);
        }
    }
}
