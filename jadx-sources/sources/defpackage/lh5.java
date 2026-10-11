package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lh5 {
    public final gi6 a;
    public final bd6 b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final xa6 f;
    public final p96 g;
    public final nh5 h;
    public long i;
    public m47 j;
    public final String k;

    public lh5(gi6 gi6Var, bd6 bd6Var, boolean z, boolean z2, float f, xa6 xa6Var) {
        ub2 ub2Var;
        this.a = gi6Var;
        this.b = bd6Var;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = xa6Var;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            p96 d = gi6Var.d();
            this.g = d;
            this.h = (nh5) gi6Var.d.getValue();
            et5.k(b, e, ub2Var);
            this.i = d.B;
            this.k = d.A.toString();
        } catch (Throwable th) {
            et5.k(b, e, ub2Var);
            throw th;
        }
    }

    public final void a() {
        if (this.k.length() > 0) {
            p96 p96Var = this.g;
            boolean d = nd6.d(p96Var.B);
            gi6 gi6Var = this.a;
            if (!d) {
                gi6Var.c(this.d);
            } else {
                gi6.i(gi6Var, "", fy5.a((int) (p96Var.B >> 32), (int) (this.i & 4294967295L)), !this.c, this.d, 4);
            }
            this.i = this.a.d().B;
            this.j = m47.x;
        }
    }

    public final boolean b() {
        bd6 bd6Var = this.b;
        if (bd6Var == null) {
            return true;
        }
        long j = this.i;
        int i = nd6.c;
        if (bd6Var.i((int) (j & 4294967295L)) == c45.x) {
            return true;
        }
        return false;
    }

    public final int c(bd6 bd6Var, int i) {
        long j = this.i;
        int i2 = nd6.c;
        int i3 = (int) (j & 4294967295L);
        xa6 xa6Var = this.f;
        if (Float.isNaN(xa6Var.a)) {
            xa6Var.a = bd6Var.c(i3).a;
        }
        o24 o24Var = bd6Var.b;
        int d = o24Var.d(i3) + i;
        if (d < 0) {
            return Integer.MIN_VALUE;
        }
        if (d >= o24Var.f) {
            return Integer.MAX_VALUE;
        }
        float b = o24Var.b(d) - 1.0f;
        float f = xa6Var.a;
        if ((b() && f >= bd6Var.g(d)) || (!b() && f <= bd6Var.f(d))) {
            return o24Var.c(d, true);
        }
        return o24Var.g((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(b) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.g.B;
        int i2 = nd6.c;
        int i3 = (int) (j & 4294967295L);
        bd6 bd6Var = this.b;
        if (bd6Var != null) {
            o24 o24Var = bd6Var.b;
            float f = this.e;
            if (!Float.isNaN(f)) {
                n05 j2 = bd6Var.c(i3).j(0.0f, f * i);
                float f2 = j2.d;
                float f3 = j2.b;
                float b = o24Var.b(o24Var.e(f3));
                if (Math.abs(f3 - b) > Math.abs(f2 - b)) {
                    return o24Var.g(j2.f());
                }
                return o24Var.g((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(j2.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        int i;
        bd6 bd6Var = this.b;
        if (bd6Var != null) {
            i = c(bd6Var, 1);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            this.f.a = Float.NaN;
        }
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i2 = nd6.c;
            int i3 = (int) (j & 4294967295L);
            int length = str.length();
            if (i > length) {
                i = length;
            }
            long e = vv5.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i4 != i3 || !nd6.d(this.i)) {
                this.i = fy5.a(i4, i4);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void f() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(d(1), i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void g() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(fz5.f(i2, str), i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void h() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int b = ez5.b(str, nd6.f(j));
            if (b == nd6.f(this.i) && b != str.length()) {
                b = ez5.b(str, b + 1);
            }
            long e = vv5.e(b, i, this.a);
            int i2 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i2 != i || !nd6.d(this.i)) {
                this.i = fy5.a(i2, i2);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void i() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            bd6 bd6Var = this.b;
            if (bd6Var != null) {
                int i3 = i2;
                while (true) {
                    p96 p96Var = this.g;
                    if (i3 >= p96Var.A.length()) {
                        length = p96Var.A.length();
                        break;
                    }
                    int length2 = str.length() - 1;
                    if (i3 <= length2) {
                        length2 = i3;
                    }
                    long k = bd6Var.k(length2);
                    int i4 = nd6.c;
                    int i5 = (int) (k & 4294967295L);
                    if (i5 <= i3) {
                        i3++;
                    } else {
                        length = i5;
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long e = vv5.e(length, i2, this.a);
            int i6 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i6 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i6, i6);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void j() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(fz5.g(i2, str), i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void k() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int c = ez5.c(str, nd6.g(j));
            if (c == nd6.g(this.i) && c != 0) {
                c = ez5.c(str, c - 1);
            }
            long e = vv5.e(c, i, this.a);
            int i2 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i2 != i || !nd6.d(this.i)) {
                this.i = fy5.a(i2, i2);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void l() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            bd6 bd6Var = this.b;
            if (bd6Var != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long k = bd6Var.k(length);
                    int i5 = nd6.c;
                    int i6 = (int) (k >> 32);
                    if (i6 >= i4) {
                        i4--;
                    } else {
                        i3 = i6;
                        break;
                    }
                }
            }
            long e = vv5.e(i3, i2, this.a);
            int i7 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i7 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i7, i7);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void m() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(str.length(), i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void n() {
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(0, i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void o() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (4294967295L & j);
            bd6 bd6Var = this.b;
            if (bd6Var != null) {
                o24 o24Var = bd6Var.b;
                length = o24Var.c(o24Var.d(nd6.f(j)), true);
            } else {
                length = str.length();
            }
            long e = vv5.e(length, i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void p() {
        int i;
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i2 = nd6.c;
            int i3 = (int) (4294967295L & j);
            bd6 bd6Var = this.b;
            if (bd6Var != null) {
                i = bd6Var.h(bd6Var.b.d(nd6.g(j)));
            } else {
                i = 0;
            }
            long e = vv5.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i4 != i3 || !nd6.d(this.i)) {
                this.i = fy5.a(i4, i4);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void q() {
        int i;
        bd6 bd6Var = this.b;
        if (bd6Var != null) {
            i = c(bd6Var, -1);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (i == Integer.MIN_VALUE) {
            this.f.a = Float.NaN;
        }
        if (this.k.length() > 0) {
            long j = this.i;
            int i2 = nd6.c;
            int i3 = (int) (j & 4294967295L);
            if (i < 0) {
                i = 0;
            }
            long e = vv5.e(i, i3, this.a);
            int i4 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i4 != i3 || !nd6.d(this.i)) {
                this.i = fy5.a(i4, i4);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void r() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = nd6.c;
            int i2 = (int) (j & 4294967295L);
            long e = vv5.e(d(-1), i2, this.a);
            int i3 = (int) (e >> 32);
            m47 F = h41.F(e);
            if (i3 != i2 || !nd6.d(this.i)) {
                this.i = fy5.a(i3, i3);
            }
            if (F != null) {
                this.j = F;
            }
        }
    }

    public final void s() {
        if (this.k.length() > 0) {
            long j = this.g.B;
            int i = nd6.c;
            this.i = fy5.a((int) (j >> 32), (int) (this.i & 4294967295L));
        }
    }
}
