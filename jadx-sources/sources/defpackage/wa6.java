package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa6 {
    public final ko a;
    public final long b;
    public final bd6 c;
    public final h12 d;
    public final md6 e;
    public long f;
    public final ko g;
    public final mc6 h;
    public final cd6 i;

    public wa6(mc6 mc6Var, h12 h12Var, cd6 cd6Var, md6 md6Var) {
        bd6 bd6Var;
        ko koVar = mc6Var.a;
        long j = mc6Var.b;
        if (cd6Var != null) {
            bd6Var = cd6Var.a;
        } else {
            bd6Var = null;
        }
        this.a = koVar;
        this.b = j;
        this.c = bd6Var;
        this.d = h12Var;
        this.e = md6Var;
        this.f = j;
        this.g = koVar;
        this.h = mc6Var;
        this.i = cd6Var;
    }

    public final List a(ub2 ub2Var) {
        if (nd6.d(this.f)) {
            or1 or1Var = (or1) ub2Var.invoke(this);
            if (or1Var != null) {
                return te4.H(or1Var);
            }
            return null;
        }
        return te4.I(new mq0("", 0), new zk5(nd6.g(this.f), nd6.g(this.f)));
    }

    public final Integer b() {
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            o24 o24Var = bd6Var.b;
            int f = nd6.f(this.f);
            h12 h12Var = this.d;
            h12Var.b(f);
            int c = o24Var.c(o24Var.d(f), true);
            h12Var.c(c);
            return Integer.valueOf(c);
        }
        return null;
    }

    public final Integer c() {
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            int g = nd6.g(this.f);
            h12 h12Var = this.d;
            h12Var.b(g);
            int h = bd6Var.h(bd6Var.b.d(g));
            h12Var.c(h);
            return Integer.valueOf(h);
        }
        return null;
    }

    public final Integer d() {
        int length;
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            int r = r();
            while (true) {
                ko koVar = this.a;
                if (r >= koVar.y.length()) {
                    length = koVar.y.length();
                    break;
                }
                int length2 = this.g.y.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long k = bd6Var.k(length2);
                int i = nd6.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 <= r) {
                    r++;
                } else {
                    this.d.c(i2);
                    length = i2;
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            int r = r();
            while (true) {
                if (r <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.y.length() - 1;
                if (r <= length) {
                    length = r;
                }
                long k = bd6Var.k(length);
                int i2 = nd6.c;
                int i3 = (int) (k >> 32);
                if (i3 >= r) {
                    r--;
                } else {
                    this.d.c(i3);
                    i = i3;
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        c45 c45Var;
        bd6 bd6Var = this.c;
        if (bd6Var != null) {
            c45Var = bd6Var.i(r());
        } else {
            c45Var = null;
        }
        if (c45Var != c45.y) {
            return true;
        }
        return false;
    }

    public final int g(bd6 bd6Var, int i) {
        int r = r();
        md6 md6Var = this.e;
        if (md6Var.a == null) {
            md6Var.a = Float.valueOf(bd6Var.c(r).a);
        }
        o24 o24Var = bd6Var.b;
        int d = o24Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= o24Var.f) {
            return this.g.y.length();
        }
        float b = o24Var.b(d) - 1.0f;
        Float f = md6Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= bd6Var.g(d)) || (!f() && floatValue <= bd6Var.f(d))) {
            return o24Var.c(d, true);
        }
        int g = o24Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32));
        this.d.c(g);
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.cd6 r9, int r10) {
        /*
            r8 = this;
            ha3 r0 = r9.b
            bd6 r1 = r9.a
            if (r0 == 0) goto L13
            ha3 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            n05 r9 = r9.G(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            n05 r9 = defpackage.n05.e
        L15:
            mc6 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.nd6.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            h12 r8 = r8.d
            r8.b(r0)
            n05 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.e()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            o24 r0 = r1.b
            int r9 = r0.g(r9)
            r8.c(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa6.h(cd6, int):int");
    }

    public final void i() {
        md6 md6Var = this.e;
        md6Var.a = null;
        ko koVar = this.g;
        if (koVar.y.length() > 0) {
            if (f()) {
                k();
                return;
            }
            md6Var.a = null;
            if (koVar.y.length() > 0) {
                String str = koVar.y;
                long j = this.f;
                int i = nd6.c;
                int f = fz5.f((int) (j & 4294967295L), str);
                if (f != -1) {
                    q(f, f);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        ko koVar = this.g;
        String str = koVar.y;
        String str2 = koVar.y;
        if (str.length() > 0) {
            int b = ez5.b(str2, nd6.f(this.f));
            if (b == nd6.f(this.f) && b != str2.length()) {
                b = ez5.b(str2, b + 1);
            }
            q(b, b);
        }
    }

    public final void k() {
        this.e.a = null;
        ko koVar = this.g;
        if (koVar.y.length() > 0) {
            String str = koVar.y;
            long j = this.f;
            int i = nd6.c;
            int g = fz5.g((int) (j & 4294967295L), str);
            if (g != -1) {
                q(g, g);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        ko koVar = this.g;
        String str = koVar.y;
        String str2 = koVar.y;
        if (str.length() > 0) {
            int c = ez5.c(str2, nd6.g(this.f));
            if (c == nd6.g(this.f) && c != 0) {
                c = ez5.c(str2, c - 1);
            }
            q(c, c);
        }
    }

    public final void m() {
        md6 md6Var = this.e;
        md6Var.a = null;
        ko koVar = this.g;
        if (koVar.y.length() > 0) {
            if (f()) {
                md6Var.a = null;
                if (koVar.y.length() > 0) {
                    String str = koVar.y;
                    long j = this.f;
                    int i = nd6.c;
                    int f = fz5.f((int) (j & 4294967295L), str);
                    if (f != -1) {
                        q(f, f);
                        return;
                    }
                    return;
                }
                return;
            }
            k();
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.y.length() > 0 && (b = b()) != null) {
            int intValue = b.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.y.length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.y.length() > 0) {
            int i = nd6.c;
            this.f = fy5.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = fy5.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = nd6.c;
        int i2 = (int) (j & 4294967295L);
        this.d.b(i2);
        return i2;
    }
}
