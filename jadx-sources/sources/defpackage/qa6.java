package defpackage;

import android.icu.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qa6 implements px5, xx5 {
    public eo3 z;
    public final ti4 x = new ti4(null, pa6.f);
    public final ti4 y = new ti4(null, oa6.g);
    public na6 A = new na6();

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.A;
    }

    public final bd6 e(pa6 pa6Var, oa6 oa6Var) {
        ArrayList arrayList;
        List list;
        int i;
        bd6 bd6Var;
        bd6 bd6Var2;
        bd6 bd6Var3;
        bd6 bd6Var4;
        ek3 ek3Var;
        int i2;
        CharSequence charSequence;
        boolean z;
        boolean z2;
        xd6 xd6Var;
        Object g;
        p96 d = pa6Var.a.d();
        List list2 = d.x;
        lc6 lc6Var = d.z;
        if (lc6Var != null) {
            yd6 yd6Var = lc6Var.a;
            arrayList = new ArrayList();
            x03 x03Var = yd6Var.b;
            if (x03Var.d != x03Var.e) {
                int i3 = 4;
                while (true) {
                    w34 w34Var = x03Var.b;
                    if (i3 >= w34Var.b) {
                        break;
                    }
                    if (!n77.i0(w34Var.c(i3)) && (g = x03Var.a.g(i3 / 4)) != null) {
                        long n = x03Var.n(i3);
                        int j0 = n77.j0(n);
                        if (j0 > yd6Var.c) {
                            j0 -= yd6Var.c();
                        }
                        int i4 = (int) (n & 2147483647L);
                        if (i4 > yd6Var.c) {
                            i4 -= yd6Var.c();
                        }
                        arrayList.add(new jo(j0, i4, g));
                    }
                    i3 += 4;
                }
            }
        } else {
            arrayList = null;
        }
        if ((list2 != null && !list2.isEmpty()) || (arrayList != null && !arrayList.isEmpty())) {
            if (list2 != null && !list2.isEmpty()) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    ai3 y = te4.y();
                    y.addAll(list2);
                    y.addAll(arrayList);
                    list2 = te4.r(y);
                }
            } else {
                list2 = arrayList;
            }
        } else {
            list2 = null;
        }
        na6 na6Var = (na6) mt5.f(this.A);
        bd6 bd6Var5 = na6Var.n;
        if (bd6Var5 != null && (charSequence = na6Var.c) != null && b06.y(charSequence, d) && a34.i(na6Var.d, list2) && a34.i(na6Var.e, d.C) && na6Var.g == pa6Var.c && na6Var.h == pa6Var.d && na6Var.k == oa6Var.b && na6Var.i == oa6Var.a.b() && na6Var.j == oa6Var.a.getFontScale() && rx0.b(na6Var.m, oa6Var.d) && a34.i(na6Var.l, oa6Var.c) && !bd6Var5.b.a.c()) {
            xd6 xd6Var2 = na6Var.f;
            if (xd6Var2 != null) {
                z = xd6Var2.c(pa6Var.b);
            } else {
                z = false;
            }
            xd6 xd6Var3 = na6Var.f;
            if (xd6Var3 != null && (xd6Var3 == (xd6Var = pa6Var.b) || xd6Var3.a.b(xd6Var.a))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return bd6Var5;
            }
            if (z) {
                ad6 ad6Var = bd6Var5.a;
                return new bd6(new ad6(ad6Var.a, pa6Var.b, ad6Var.c, ad6Var.d, ad6Var.e, ad6Var.f, ad6Var.g, ad6Var.h, ad6Var.i, ad6Var.j), bd6Var5.b, bd6Var5.c);
            }
        }
        nt1 nt1Var = nt1.x;
        eo3 eo3Var = this.z;
        if (eo3Var == null) {
            eo3Var = new eo3(oa6Var.c, oa6Var.a, oa6Var.b);
            this.z = eo3Var;
        }
        boolean z3 = pa6Var.e;
        xd6 xd6Var4 = pa6Var.b;
        if (z3) {
            fk3 fk3Var = xd6Var4.a.k;
            if (fk3Var == null || (ek3Var = (ek3) fk3Var.x.get(0)) == null) {
                ek3Var = (ek3) om4.a.r().x.get(0);
            }
            byte directionality = Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(ek3Var.a).getDigitStrings()[0], 0));
            if (directionality != 1 && directionality != 2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            xd6Var4 = xd6Var4.d(new xd6(0L, 0L, null, null, 0L, 0, i2, 0L, 16711679));
        }
        xd6 xd6Var5 = xd6Var4;
        String obj = d.A.toString();
        if (list2 == null) {
            list = nt1Var;
        } else {
            list = list2;
        }
        ko koVar = new ko(obj, list);
        boolean z4 = pa6Var.d;
        int i5 = Integer.MAX_VALUE;
        if (pa6Var.c) {
            i = 1;
        } else {
            i = Integer.MAX_VALUE;
        }
        long j = oa6Var.d;
        ia3 ia3Var = oa6Var.b;
        xo3 xo3Var = oa6Var.a;
        p82 p82Var = oa6Var.c;
        st3 st3Var = (st3) eo3Var.y;
        ad6 ad6Var2 = new ad6(koVar, xd6Var5, nt1Var, i, z4, 1, xo3Var, ia3Var, p82Var, j);
        int i6 = i;
        if (st3Var != null) {
            ef0 ef0Var = new ef0(ad6Var2);
            hm3 hm3Var = (hm3) st3Var.x;
            if (hm3Var != null) {
                bd6Var3 = (bd6) hm3Var.c(ef0Var);
            } else {
                if (a34.i((ef0) st3Var.y, ef0Var)) {
                    bd6Var3 = (bd6) st3Var.z;
                }
                bd6Var4 = null;
                bd6Var = bd6Var4;
            }
            if (bd6Var3 != null && !bd6Var3.b.a.c()) {
                bd6Var4 = bd6Var3;
                bd6Var = bd6Var4;
            }
            bd6Var4 = null;
            bd6Var = bd6Var4;
        } else {
            bd6Var = null;
        }
        if (bd6Var != null) {
            o24 o24Var = bd6Var.b;
            bd6Var2 = new bd6(ad6Var2, bd6Var.b, sx0.d(j, (((int) Math.ceil(o24Var.e)) & 4294967295L) | (((int) Math.ceil(o24Var.d)) << 32)));
        } else {
            kz kzVar = new kz(koVar, xo3Var, p82Var, ez5.j(xd6Var5, ia3Var), nt1Var, z4);
            int j2 = rx0.j(j);
            if (z4 && rx0.d(j)) {
                i5 = rx0.h(j);
            }
            int i7 = i5;
            if (j2 != i7) {
                i7 = db.C((int) Math.ceil(kzVar.m()), j2, i7);
            }
            bd6 bd6Var6 = new bd6(ad6Var2, new o24(kzVar, n03.p(0, i7, 0, rx0.g(j)), i6, 1), sx0.d(j, (((int) Math.ceil(r16.e)) & 4294967295L) | (((int) Math.ceil(r16.d)) << 32)));
            if (st3Var != null) {
                hm3 hm3Var2 = (hm3) st3Var.x;
                if (hm3Var2 != null) {
                    hm3Var2.d(new ef0(ad6Var2), bd6Var6);
                } else {
                    st3Var.y = new ef0(ad6Var2);
                    st3Var.z = bd6Var6;
                }
            }
            bd6Var2 = bd6Var6;
        }
        if (!bd6Var2.equals(bd6Var5)) {
            ft5 h = mt5.h();
            if (!h.f()) {
                na6 na6Var2 = this.A;
                synchronized (mt5.c) {
                    na6 na6Var3 = (na6) mt5.w(na6Var2, this, h);
                    na6Var3.c = d;
                    na6Var3.d = list2;
                    na6Var3.e = d.C;
                    na6Var3.g = pa6Var.c;
                    na6Var3.h = pa6Var.d;
                    na6Var3.f = pa6Var.b;
                    na6Var3.k = oa6Var.b;
                    na6Var3.i = oa6Var.e;
                    na6Var3.j = oa6Var.f;
                    na6Var3.m = oa6Var.d;
                    na6Var3.l = oa6Var.c;
                    na6Var3.n = bd6Var2;
                }
                mt5.l(h, this);
                return bd6Var2;
            }
        }
        return bd6Var2;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        this.A = (na6) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        oa6 oa6Var;
        pa6 pa6Var = (pa6) this.x.getValue();
        if (pa6Var == null || (oa6Var = (oa6) this.y.getValue()) == null) {
            return null;
        }
        return e(pa6Var, oa6Var);
    }

    @Override // defpackage.xx5
    public final zx5 c(zx5 zx5Var, zx5 zx5Var2, zx5 zx5Var3) {
        return zx5Var3;
    }
}
