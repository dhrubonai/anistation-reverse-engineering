package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mf4 extends fg4 {
    public static final mf4 c = new fg4(1, 0, 2);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        int[] iArr;
        ed2 ed2Var;
        int c2;
        int i;
        int f = fm0Var.f(0);
        if (bs5Var.n != 0) {
            eu0.a("Cannot move a group while inserting");
        }
        if (f < 0) {
            eu0.a("Parameter offset is out of bounds");
        }
        if (f != 0) {
            int i2 = bs5Var.t;
            int i3 = bs5Var.v;
            int i4 = bs5Var.u;
            int i5 = i2;
            while (true) {
                iArr = bs5Var.b;
                if (f <= 0) {
                    break;
                }
                i5 += iArr[(bs5Var.q(i5) * 5) + 3];
                if (i5 > i4) {
                    eu0.a("Parameter offset is out of bounds");
                }
                f--;
            }
            int i6 = iArr[(bs5Var.q(i5) * 5) + 3];
            int f2 = bs5Var.f(bs5Var.b, bs5Var.q(bs5Var.t));
            int f3 = bs5Var.f(bs5Var.b, bs5Var.q(i5));
            int i7 = i5 + i6;
            int f4 = bs5Var.f(bs5Var.b, bs5Var.q(i7));
            int i8 = f4 - f3;
            bs5Var.w(i8, Math.max(bs5Var.t - 1, 0));
            bs5Var.v(i6);
            int[] iArr2 = bs5Var.b;
            int q = bs5Var.q(i7) * 5;
            ms.w0(bs5Var.q(i2) * 5, q, (i6 * 5) + q, iArr2, iArr2);
            if (i8 > 0) {
                Object[] objArr = bs5Var.c;
                int g = bs5Var.g(f3 + i8);
                System.arraycopy(objArr, g, objArr, f2, bs5Var.g(f4 + i8) - g);
            }
            int i9 = f3 + i8;
            int i10 = i9 - f2;
            int i11 = bs5Var.k;
            int i12 = bs5Var.l;
            int length = bs5Var.c.length;
            int i13 = bs5Var.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int q2 = bs5Var.q(i15);
                int i16 = i10;
                int f5 = bs5Var.f(iArr2, q2) - i16;
                if (i13 < q2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(q2 * 5) + 4] = bs5.h(bs5.h(f5, i, i12, length), bs5Var.k, bs5Var.l, bs5Var.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int o = bs5Var.o();
            int b = as5.b(bs5Var.d, i7, o);
            ArrayList arrayList = new ArrayList();
            if (b >= 0) {
                while (b < bs5Var.d.size() && (c2 = bs5Var.c((ed2Var = (ed2) bs5Var.d.get(b)))) >= i7 && c2 < i17) {
                    arrayList.add(ed2Var);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                ed2 ed2Var2 = (ed2) arrayList.get(i19);
                int c3 = bs5Var.c(ed2Var2) + i18;
                if (c3 >= bs5Var.g) {
                    ed2Var2.a = -(o - c3);
                } else {
                    ed2Var2.a = c3;
                }
                bs5Var.d.add(as5.b(bs5Var.d, c3, o), ed2Var2);
            }
            if (bs5Var.J(i7, i6)) {
                eu0.a("Unexpectedly removed anchors");
            }
            bs5Var.l(i3, bs5Var.u, i2);
            if (i8 > 0) {
                bs5Var.K(i9, i8, i7 - 1);
            }
        }
    }
}
