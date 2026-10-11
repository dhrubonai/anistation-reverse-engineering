package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gi4 {
    public String a;
    public xd6 b;
    public p82 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public ud1 i;
    public cd j;
    public boolean k;
    public long l;
    public sy3 m;
    public fi4 n;
    public ia3 o;
    public long p;
    public int q;
    public int r;
    public long s;

    public gi4(String str, xd6 xd6Var, p82 p82Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = xd6Var;
        this.c = p82Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = iz2.b;
        this.h = iz2.a;
        this.l = 0L;
        if (!(true & true)) {
            gz2.a("width and height must be >= 0");
        }
        this.p = sx0.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(gi4 gi4Var, long j, ia3 ia3Var) {
        xd6 xd6Var = gi4Var.b;
        sy3 sy3Var = gi4Var.m;
        ud1 ud1Var = gi4Var.i;
        ud1Var.getClass();
        sy3 r = h98.r(sy3Var, ia3Var, xd6Var, ud1Var, gi4Var.c);
        gi4Var.m = r;
        return r.a(gi4Var.g, j);
    }

    public final int a(int i, ia3 ia3Var) {
        int i2;
        int i3 = this.q;
        int i4 = this.r;
        if (i == i3 && i3 != -1) {
            return i4;
        }
        long a = sx0.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = f(this, a, ia3Var);
        }
        fi4 e = e(ia3Var);
        long o = m37.o(a, this.e, this.d, e.m());
        boolean z = this.e;
        int i5 = this.d;
        int i6 = this.f;
        if ((!z && (i5 == 2 || i5 == 4 || i5 == 5)) || i6 < 1) {
            i2 = 1;
        } else {
            i2 = i6;
        }
        int a2 = rz5.a(new cd((gd) e, i2, i5, o).f);
        int i7 = rx0.i(a);
        if (a2 < i7) {
            a2 = i7;
        }
        this.q = i;
        this.r = a2;
        return a2;
    }

    public final boolean b(long j, ia3 ia3Var) {
        long j2;
        int i;
        fi4 fi4Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j2 = f(this, j, ia3Var);
        } else {
            j2 = j;
        }
        cd cdVar = this.j;
        boolean z2 = false;
        if (cdVar != null && (fi4Var = this.n) != null && !fi4Var.c() && ia3Var == this.o && (rx0.b(j2, this.p) || (rx0.h(j2) == rx0.h(this.p) && rx0.j(j2) == rx0.j(this.p) && rx0.g(j2) >= cdVar.f && !cdVar.d.d))) {
            if (!rx0.b(j2, this.p)) {
                cd cdVar2 = this.j;
                cdVar2.getClass();
                this.l = sx0.d(j2, (rz5.a(Math.min(cdVar2.a.F.c(), cdVar2.c())) << 32) | (rz5.a(cdVar2.f) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= cdVar2.c() && ((int) (4294967295L & r12)) >= cdVar2.f)) {
                    z = false;
                }
                this.k = z;
                this.p = j2;
            }
            return false;
        }
        fi4 e = e(ia3Var);
        long o = m37.o(j2, this.e, this.d, e.m());
        boolean z3 = this.e;
        int i2 = this.d;
        int i3 = this.f;
        if ((!z3 && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        cd cdVar3 = new cd((gd) e, i, i2, o);
        this.p = j2;
        int a = rz5.a(cdVar3.c());
        float f = cdVar3.f;
        this.l = sx0.d(j2, (rz5.a(f) & 4294967295L) | (a << 32));
        if (this.d != 3 && (((int) (r3 >> 32)) < cdVar3.c() || ((int) (r3 & 4294967295L)) < f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = cdVar3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = sx0.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(ud1 ud1Var) {
        long j;
        ud1 ud1Var2 = this.i;
        if (ud1Var != null) {
            int i = iz2.b;
            j = iz2.a(ud1Var.b(), ud1Var.getFontScale());
        } else {
            j = iz2.a;
        }
        if (ud1Var2 == null) {
            this.i = ud1Var;
            this.h = j;
        } else {
            if (ud1Var != null && this.h == j) {
                return;
            }
            this.i = ud1Var;
            this.h = j;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final fi4 e(ia3 ia3Var) {
        fi4 fi4Var = this.n;
        if (fi4Var == null || ia3Var != this.o || fi4Var.c()) {
            this.o = ia3Var;
            String str = this.a;
            xd6 j = ez5.j(this.b, ia3Var);
            ud1 ud1Var = this.i;
            ud1Var.getClass();
            p82 p82Var = this.c;
            boolean z = this.e;
            nt1 nt1Var = nt1.x;
            fi4Var = new gd(str, j, nt1Var, nt1Var, p82Var, ud1Var, z);
        }
        this.n = fi4Var;
        return fi4Var;
    }

    public final String toString() {
        String str;
        if (this.j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        return qx1.k(this.s, ", constraints=$)", h11.o("ParagraphLayoutCache(paragraph=", str, ", lastDensity=", iz2.b(this.h), ", history="));
    }
}
