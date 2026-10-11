package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uh5 {
    public final xz3 a;
    public final boolean b;
    public final za3 c;
    public final ph5 d;
    public uh5 e;
    public final int f;

    public uh5(xz3 xz3Var, boolean z, za3 za3Var, ph5 ph5Var) {
        this.a = xz3Var;
        this.b = z;
        this.c = za3Var;
        this.d = ph5Var;
        this.f = za3Var.y;
    }

    public static /* synthetic */ List j(int i, uh5 uh5Var) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !uh5Var.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return uh5Var.i(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [xz3] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final n05 a(fa4 fa4Var) {
        zc1 zc1Var;
        uh5 l = l();
        if (l == null) {
            return n05.e;
        }
        xz3 xz3Var = (xz3) l.c.c0.D;
        fa4 fa4Var2 = null;
        if ((xz3Var.A & 8) != 0) {
            loop0: while (xz3Var != null) {
                if ((xz3Var.z & 8) != 0) {
                    zc1Var = xz3Var;
                    ?? r5 = 0;
                    while (zc1Var != 0) {
                        if (zc1Var instanceof sh5) {
                            if (zc1Var.l()) {
                                break loop0;
                            }
                        } else if ((zc1Var.z & 8) != 0 && (zc1Var instanceof zc1)) {
                            xz3 xz3Var2 = zc1Var.M;
                            int i = 0;
                            zc1Var = zc1Var;
                            r5 = r5;
                            while (xz3Var2 != null) {
                                if ((xz3Var2.z & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        zc1Var = xz3Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new z44(new xz3[16], 0);
                                        }
                                        if (zc1Var != 0) {
                                            r5.b(zc1Var);
                                            zc1Var = 0;
                                        }
                                        r5.b(xz3Var2);
                                    }
                                }
                                xz3Var2 = xz3Var2.C;
                                zc1Var = zc1Var;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        zc1Var = wc7.J(r5);
                    }
                }
                if ((xz3Var.A & 8) == 0) {
                    break;
                }
                xz3Var = xz3Var.C;
            }
        }
        zc1Var = 0;
        sh5 sh5Var = (sh5) zc1Var;
        if (sh5Var != null) {
            fa4Var2 = wc7.M(sh5Var, 8);
        }
        if (fa4Var2 == null) {
            return l.a(fa4Var);
        }
        return fa4Var2.G(fa4Var, true);
    }

    public final uh5 b(m65 m65Var, ub2 ub2Var) {
        int i;
        ph5 ph5Var = new ph5();
        ph5Var.z = false;
        ph5Var.A = false;
        ub2Var.invoke(ph5Var);
        th5 th5Var = new th5(ub2Var);
        int i2 = this.f;
        if (m65Var != null) {
            i = 1000000000;
        } else {
            i = 2000000000;
        }
        uh5 uh5Var = new uh5(th5Var, false, new za3(true, i2 + i), ph5Var);
        uh5Var.e = this;
        return uh5Var;
    }

    public final void c(za3 za3Var, ArrayList arrayList) {
        z44 z = za3Var.z();
        Object[] objArr = z.x;
        int i = z.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (za3Var2.I() && !za3Var2.n0) {
                if (za3Var2.c0.g(8)) {
                    arrayList.add(n03.h(za3Var2, this.b));
                } else {
                    c(za3Var2, arrayList);
                }
            }
        }
    }

    public final fa4 d() {
        if (n()) {
            uh5 l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        sh5 f = f();
        if (f != null) {
            return wc7.M(f, 8);
        }
        return (kz2) this.c.c0.A;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            uh5 uh5Var = (uh5) arrayList.get(size2);
            if (uh5Var.o()) {
                arrayList2.add(uh5Var);
            } else if (!uh5Var.d.A) {
                uh5Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sh5 f() {
        xz3 xz3Var;
        boolean z;
        boolean z2 = this.d.z;
        Object obj = null;
        za3 za3Var = this.c;
        if (z2) {
            xz3 xz3Var2 = (xz3) za3Var.c0.D;
            if ((xz3Var2.A & 8) != 0) {
                xz3Var = null;
                while (xz3Var2 != null) {
                    if ((xz3Var2.z & 8) != 0) {
                        xz3 xz3Var3 = xz3Var2;
                        z44 z44Var = null;
                        while (xz3Var3 != null) {
                            if (xz3Var3 instanceof sh5) {
                                sh5 sh5Var = (sh5) xz3Var3;
                                if (sh5Var.l()) {
                                    if (sh5Var.K0()) {
                                        return sh5Var;
                                    }
                                    if (xz3Var == null) {
                                        xz3Var = sh5Var;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (xz3Var3.z & 8) != 0 && (xz3Var3 instanceof zc1)) {
                                int i = 0;
                                for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                    if ((xz3Var4.z & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            xz3Var3 = xz3Var4;
                                        } else {
                                            if (z44Var == null) {
                                                z44Var = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var3 != null) {
                                                z44Var.b(xz3Var3);
                                                xz3Var3 = null;
                                            }
                                            z44Var.b(xz3Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            xz3Var3 = wc7.J(z44Var);
                        }
                    }
                    if ((xz3Var2.A & 8) == 0) {
                        break;
                    }
                    xz3Var2 = xz3Var2.C;
                }
                obj = xz3Var;
            }
            return (sh5) obj;
        }
        xz3 xz3Var5 = (xz3) za3Var.c0.D;
        if ((xz3Var5.A & 8) != 0) {
            loop3: while (xz3Var5 != null) {
                if ((xz3Var5.z & 8) != 0) {
                    xz3Var = xz3Var5;
                    z44 z44Var2 = null;
                    while (xz3Var != null) {
                        if (xz3Var instanceof sh5) {
                            if (((sh5) xz3Var).l()) {
                                obj = xz3Var;
                            }
                        } else if ((xz3Var.z & 8) != 0 && (xz3Var instanceof zc1)) {
                            int i2 = 0;
                            for (xz3 xz3Var6 = ((zc1) xz3Var).M; xz3Var6 != null; xz3Var6 = xz3Var6.C) {
                                if ((xz3Var6.z & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        xz3Var = xz3Var6;
                                    } else {
                                        if (z44Var2 == null) {
                                            z44Var2 = new z44(new xz3[16], 0);
                                        }
                                        if (xz3Var != null) {
                                            z44Var2.b(xz3Var);
                                            xz3Var = null;
                                        }
                                        z44Var2.b(xz3Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        xz3Var = wc7.J(z44Var2);
                    }
                }
                if ((xz3Var5.A & 8) == 0) {
                    break;
                }
                xz3Var5 = xz3Var5.C;
            }
        }
        return (sh5) obj;
    }

    public final n05 g() {
        fa4 d = d();
        if (d != null) {
            if (!d.Y0().K) {
                d = null;
            }
            if (d != null) {
                return te4.B(d).G(d, true);
            }
        }
        return n05.e;
    }

    public final n05 h() {
        fa4 d = d();
        if (d != null) {
            if (!d.Y0().K) {
                d = null;
            }
            if (d != null) {
                return te4.q(d, true);
            }
        }
        return n05.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.A) {
            return nt1.x;
        }
        ArrayList arrayList = new ArrayList();
        if (o()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return q(arrayList, z2);
    }

    public final ph5 k() {
        boolean o = o();
        ph5 ph5Var = this.d;
        if (o) {
            ph5 ph5Var2 = new ph5();
            ph5Var2.z = ph5Var.z;
            ph5Var2.A = ph5Var.A;
            ph5Var2.x.k(ph5Var.x);
            p(new ArrayList(), ph5Var2);
            return ph5Var2;
        }
        return ph5Var;
    }

    public final uh5 l() {
        za3 za3Var;
        uh5 uh5Var = this.e;
        if (uh5Var != null) {
            return uh5Var;
        }
        za3 za3Var2 = this.c;
        boolean z = this.b;
        if (z) {
            za3Var = za3Var2.v();
            while (za3Var != null) {
                ph5 x = za3Var.x();
                if (x != null && x.z) {
                    break;
                }
                za3Var = za3Var.v();
            }
        }
        za3Var = null;
        if (za3Var == null) {
            za3 v = za3Var2.v();
            while (true) {
                if (v != null) {
                    if (v.c0.g(8)) {
                        za3Var = v;
                        break;
                    }
                    v = v.v();
                } else {
                    za3Var = null;
                    break;
                }
            }
        }
        if (za3Var == null) {
            return null;
        }
        return n03.h(za3Var, z);
    }

    public final n05 m() {
        boolean z;
        yc1 f = f();
        if (f == null) {
            return ((kz2) this.c.c0.A).v1();
        }
        xz3 xz3Var = ((xz3) f).x;
        Object g = this.d.x.g(oh5.b);
        if (g == null) {
            g = null;
        }
        if (g != null) {
            z = true;
        } else {
            z = false;
        }
        return z51.n(xz3Var, z, true);
    }

    public final boolean n() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.b && this.d.z) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList, ph5 ph5Var) {
        if (!this.d.A) {
            q(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                uh5 uh5Var = (uh5) arrayList.get(size2);
                if (!uh5Var.o()) {
                    ph5Var.d(uh5Var.d);
                    uh5Var.p(arrayList, ph5Var);
                }
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        String str;
        if (n()) {
            return nt1.x;
        }
        c(this.c, arrayList);
        if (z) {
            ph5 ph5Var = this.d;
            p44 p44Var = ph5Var.x;
            Object g = p44Var.g(yh5.z);
            if (g == null) {
                g = null;
            }
            m65 m65Var = (m65) g;
            if (m65Var != null && ph5Var.z && !arrayList.isEmpty()) {
                arrayList.add(b(m65Var, new pz3((Object) m65Var, (byte) 25)));
            }
            ai5 ai5Var = yh5.a;
            if (p44Var.c(ai5Var) && !arrayList.isEmpty() && ph5Var.z) {
                Object g2 = p44Var.g(ai5Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null) {
                    str = (String) yo0.m0(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new zg(str, (byte) 20)));
                }
            }
        }
        return arrayList;
    }
}
