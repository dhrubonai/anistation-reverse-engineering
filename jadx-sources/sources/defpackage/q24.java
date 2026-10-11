package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q24 {
    public ko a;
    public p82 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public sy3 h;
    public ud1 j;
    public xd6 k;
    public kz l;
    public ia3 m;
    public bd6 n;
    public long q;
    public long i = iz2.a;
    public int o = -1;
    public int p = -1;

    public q24(ko koVar, xd6 xd6Var, p82 p82Var, int i, boolean z, int i2, int i3, List list) {
        this.a = koVar;
        this.b = p82Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = xd6Var;
    }

    public final int a(int i, ia3 ia3Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = sx0.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            sy3 sy3Var = this.h;
            xd6 xd6Var = this.k;
            ud1 ud1Var = this.j;
            ud1Var.getClass();
            sy3 r = h98.r(sy3Var, ia3Var, xd6Var, ud1Var, this.b);
            this.h = r;
            a = r.a(this.f, a);
        }
        int a2 = rz5.a(b(a, ia3Var).e);
        int i4 = rx0.i(a);
        if (a2 < i4) {
            a2 = i4;
        }
        this.o = i;
        this.p = a2;
        return a2;
    }

    public final o24 b(long j, ia3 ia3Var) {
        int i;
        kz e = e(ia3Var);
        long o = m37.o(j, this.d, this.c, e.m());
        boolean z = this.d;
        int i2 = this.c;
        int i3 = this.e;
        if ((!z && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        return new o24(e, o, i, i2);
    }

    public final boolean c(long j, ia3 ia3Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            sy3 sy3Var = this.h;
            xd6 xd6Var = this.k;
            ud1 ud1Var = this.j;
            ud1Var.getClass();
            sy3 r = h98.r(sy3Var, ia3Var, xd6Var, ud1Var, this.b);
            this.h = r;
            j = r.a(this.f, j);
        }
        bd6 bd6Var = this.n;
        if (bd6Var != null) {
            o24 o24Var = bd6Var.b;
            ad6 ad6Var = bd6Var.a;
            if (!o24Var.a.c()) {
                ia3 ia3Var2 = ad6Var.h;
                long j2 = ad6Var.j;
                if (ia3Var == ia3Var2 && (rx0.b(j, j2) || (rx0.h(j) == rx0.h(j2) && rx0.j(j) == rx0.j(j2) && rx0.g(j) >= o24Var.e && !o24Var.c))) {
                    bd6 bd6Var2 = this.n;
                    bd6Var2.getClass();
                    if (rx0.b(j, bd6Var2.a.j)) {
                        return false;
                    }
                    bd6 bd6Var3 = this.n;
                    bd6Var3.getClass();
                    this.n = f(ia3Var, j, bd6Var3.b);
                    return true;
                }
            }
        }
        this.n = f(ia3Var, j, b(j, ia3Var));
        return true;
    }

    public final void d(ud1 ud1Var) {
        long j;
        ud1 ud1Var2 = this.j;
        if (ud1Var != null) {
            int i = iz2.b;
            j = iz2.a(ud1Var.b(), ud1Var.getFontScale());
        } else {
            j = iz2.a;
        }
        if (ud1Var2 == null) {
            this.j = ud1Var;
            this.i = j;
        } else {
            if (ud1Var != null && this.i == j) {
                return;
            }
            this.j = ud1Var;
            this.i = j;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final kz e(ia3 ia3Var) {
        kz kzVar = this.l;
        if (kzVar == null || ia3Var != this.m || kzVar.c()) {
            this.m = ia3Var;
            ko koVar = this.a;
            xd6 j = ez5.j(this.k, ia3Var);
            ud1 ud1Var = this.j;
            ud1Var.getClass();
            p82 p82Var = this.b;
            List list = this.g;
            if (list == null) {
                list = nt1.x;
            }
            kzVar = new kz(koVar, ud1Var, p82Var, j, list, this.d);
        }
        this.l = kzVar;
        return kzVar;
    }

    public final bd6 f(ia3 ia3Var, long j, o24 o24Var) {
        float min = Math.min(o24Var.a.m(), o24Var.d);
        ko koVar = this.a;
        xd6 xd6Var = this.k;
        List list = this.g;
        if (list == null) {
            list = nt1.x;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        ud1 ud1Var = this.j;
        ud1Var.getClass();
        return new bd6(new ad6(koVar, xd6Var, list, i, z, i2, ud1Var, ia3Var, this.b, j), o24Var, sx0.d(j, (rz5.a(min) << 32) | (rz5.a(o24Var.e) & 4294967295L)));
    }

    public final void g(ko koVar, xd6 xd6Var, p82 p82Var, int i, boolean z, int i2, int i3, List list) {
        this.a = koVar;
        boolean c = xd6Var.c(this.k);
        this.k = xd6Var;
        if (!c) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = p82Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        String str;
        Object obj = "null";
        if (this.n == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        String b = iz2.b(this.i);
        long j = this.q;
        bd6 bd6Var = this.n;
        if (bd6Var != null) {
            obj = new rx0(bd6Var.a.j);
        }
        StringBuilder o = h11.o("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", b, ", history=");
        o.append(j);
        o.append(", constraints=");
        o.append(obj);
        o.append(")");
        return o.toString();
    }
}
