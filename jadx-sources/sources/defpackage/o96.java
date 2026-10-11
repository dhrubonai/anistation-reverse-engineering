package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o96 implements Appendable {
    public boolean A;
    public pz2 B;
    public long C;
    public nd6 D;
    public z44 E;
    public ai4 F;
    public final l13 x;
    public final kk0 y;
    public final yd6 z;

    public o96(p96 p96Var, pz2 pz2Var, l13 l13Var, int i) {
        yd6 yd6Var;
        pz2 pz2Var2;
        z44 z44Var = null;
        pz2Var = (i & 2) != 0 ? null : pz2Var;
        this.x = (i & 8) != 0 ? null : l13Var;
        kk0 kk0Var = new kk0();
        kk0Var.A = p96Var;
        kk0Var.y = -1;
        kk0Var.z = -1;
        this.y = kk0Var;
        lc6 lc6Var = p96Var.z;
        List list = p96Var.x;
        if (lc6Var != null) {
            yd6Var = new yd6(lc6Var.a, true);
        } else {
            yd6Var = null;
        }
        this.z = yd6Var;
        if (pz2Var != null) {
            pz2Var2 = new pz2(pz2Var);
        } else {
            pz2Var2 = null;
        }
        this.B = pz2Var2;
        this.C = p96Var.B;
        this.D = p96Var.C;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            jo[] joVarArr = new jo[size];
            for (int i2 = 0; i2 < size; i2++) {
                joVarArr[i2] = (jo) list.get(i2);
            }
            z44Var = new z44(joVarArr, size);
        }
        this.E = z44Var;
    }

    public static void d(o96 o96Var, int i, int i2, CharSequence charSequence, int i3, boolean z, int i4) {
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        kk0 kk0Var = o96Var.y;
        if (i > i2) {
            hz2.a("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 < 0) {
            hz2.a("Expected textStart=0 <= textEnd=" + i3);
        }
        int C = db.C(i, 0, kk0Var.length());
        int C2 = db.C(i2, 0, kk0Var.length());
        int C3 = db.C(0, 0, charSequence.length());
        int C4 = db.C(i3, 0, charSequence.length());
        o96Var.b(C, C2, C4 - C3, z);
        o96Var.y.a(C, C2, charSequence, C3, C4);
        o96Var.f(null);
        o96Var.F = null;
    }

    public static p96 h(o96 o96Var, long j, nd6 nd6Var, int i) {
        List list;
        if ((i & 1) != 0) {
            j = o96Var.C;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            nd6Var = o96Var.D;
        }
        nd6 nd6Var2 = nd6Var;
        z44 z44Var = o96Var.E;
        if (z44Var != null) {
            List g = z44Var.g();
            if (!((d44) g).isEmpty()) {
                list = g;
                return new p96(o96Var.y.toString(), j2, nd6Var2, null, list, null, yu5.h(o96Var), 8);
            }
        }
        list = null;
        return new p96(o96Var.y.toString(), j2, nd6Var2, null, list, null, yu5.h(o96Var), 8);
    }

    public final pz2 a() {
        pz2 pz2Var = this.B;
        if (pz2Var == null) {
            pz2 pz2Var2 = new pz2((pz2) null);
            this.B = pz2Var2;
            return pz2Var2;
        }
        return pz2Var;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            kk0 kk0Var = this.y;
            b(kk0Var.length(), kk0Var.length(), charSequence.length(), false);
            kk0Var.a(kk0Var.length(), kk0Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o96.b(int, int, int, boolean):void");
    }

    public final void c(String str, int i, int i2) {
        d(this, i, i2, str, str.length(), false, 32);
    }

    public final void e(List list, int i, int i2) {
        kk0 kk0Var = this.y;
        if (i >= 0 && i <= kk0Var.length()) {
            if (i2 >= 0 && i2 <= kk0Var.length()) {
                if (i < i2) {
                    f(new nd6(fy5.a(i, i2)));
                    z44 z44Var = this.E;
                    if (z44Var != null) {
                        z44Var.h();
                    }
                    if (list != null && !list.isEmpty()) {
                        if (this.E == null) {
                            this.E = new z44(new jo[16], 0);
                        }
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            jo joVar = (jo) list.get(i3);
                            z44 z44Var2 = this.E;
                            if (z44Var2 != null) {
                                z44Var2.b(jo.a(joVar, null, joVar.b + i, joVar.c + i, 9));
                            }
                        }
                        return;
                    }
                    return;
                }
                ze0.k(zo5.m("Do not set reversed or empty range: ", " > ", i, i2));
                return;
            }
            ze0.g(zo5.m("end (", ") offset is outside of text region ", i2, kk0Var.length()));
            return;
        }
        ze0.g(zo5.m("start (", ") offset is outside of text region ", i, kk0Var.length()));
    }

    public final void f(nd6 nd6Var) {
        if (nd6Var != null && !nd6.d(nd6Var.a)) {
            this.D = nd6Var;
            return;
        }
        this.D = null;
        z44 z44Var = this.E;
        if (z44Var != null) {
            z44Var.h();
        }
    }

    public final void g(long j) {
        long a = fy5.a(0, this.y.length());
        if (!nd6.a(a, j)) {
            hz2.a("Expected " + nd6.i(j) + " to be in " + nd6.i(a));
        }
        this.C = j;
        this.F = null;
    }

    public final String toString() {
        return this.y.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        kk0 kk0Var = this.y;
        b(kk0Var.length(), kk0Var.length(), 1, false);
        kk0Var.a(kk0Var.length(), kk0Var.length(), r6, 0, String.valueOf(c).length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            kk0 kk0Var = this.y;
            b(kk0Var.length(), kk0Var.length(), i2 - i, false);
            kk0Var.a(kk0Var.length(), kk0Var.length(), r6, 0, charSequence.subSequence(i, i2).length());
        }
        return this;
    }
}
