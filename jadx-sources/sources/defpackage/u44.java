package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class u44 extends ft5 {
    public static final int[] n = new int[0];
    public final ub2 e;
    public final ub2 f;
    public int g;
    public q44 h;
    public ArrayList i;
    public kt5 j;
    public int[] k;
    public int l;
    public boolean m;

    public u44(long j, kt5 kt5Var, ub2 ub2Var, ub2 ub2Var2) {
        super(j, kt5Var);
        this.e = ub2Var;
        this.f = ub2Var2;
        this.j = kt5.B;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (mt5.c) {
            this.j = this.j.g(j);
        }
    }

    public void B(q44 q44Var) {
        this.h = q44Var;
    }

    public u44 C(ub2 ub2Var, ub2 ub2Var2) {
        b84 b84Var;
        if (this.c) {
            ds4.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            ds4.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = mt5.c;
        synchronized (obj) {
            long j = mt5.e;
            mt5.e = j + 1;
            mt5.d = mt5.d.g(j);
            kt5 d = d();
            r(d.g(j));
            b84Var = new b84(j, mt5.a(d, g() + 1, j), mt5.i(ub2Var, e(), true), mt5.j(ub2Var2, i()), this);
        }
        if (!this.m && !this.c) {
            long g = g();
            synchronized (obj) {
                long j2 = mt5.e;
                mt5.e = j2 + 1;
                s(j2);
                mt5.d = mt5.d.g(g());
            }
            r(mt5.a(d(), g + 1, g()));
            return b84Var;
        }
        return b84Var;
    }

    @Override // defpackage.ft5
    public final void b() {
        mt5.d = mt5.d.c(g()).b(this.j);
    }

    @Override // defpackage.ft5
    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (mt5.c) {
                o();
            }
            l();
        }
    }

    @Override // defpackage.ft5
    public int h() {
        return this.g;
    }

    @Override // defpackage.ft5
    public ub2 i() {
        return this.f;
    }

    @Override // defpackage.ft5
    public void k() {
        this.l++;
    }

    @Override // defpackage.ft5
    public void l() {
        if (this.l <= 0) {
            ds4.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i == 0 && !this.m) {
            q44 x = x();
            if (x != null) {
                if (this.m) {
                    ds4.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    for (zx5 b = ((xx5) objArr[(i2 << 3) + i4]).b(); b != null; b = b.b) {
                                        long j2 = b.a;
                                        if (j2 == g || yo0.e0(this.j, Long.valueOf(j2))) {
                                            tg5 tg5Var = mt5.a;
                                            b.a = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.ft5
    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    @Override // defpackage.ft5
    public void n(xx5 xx5Var) {
        q44 x = x();
        if (x == null) {
            q44 q44Var = db5.a;
            x = new q44();
            B(x);
        }
        x.a(xx5Var);
    }

    @Override // defpackage.ft5
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            mt5.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ft5
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ft5
    public ft5 u(ub2 ub2Var) {
        c84 c84Var;
        if (this.c) {
            ds4.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            ds4.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = mt5.c;
        synchronized (obj) {
            long j = mt5.e;
            mt5.e = j + 1;
            mt5.d = mt5.d.g(j);
            c84Var = new c84(j, mt5.a(d(), g + 1, j), mt5.i(ub2Var, e(), true), this);
        }
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (obj) {
                long j2 = mt5.e;
                mt5.e = j2 + 1;
                s(j2);
                mt5.d = mt5.d.g(g());
            }
            r(mt5.a(d(), g2 + 1, g()));
            return c84Var;
        }
        return c84Var;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g = g();
            synchronized (mt5.c) {
                long j = mt5.e;
                mt5.e = j + 1;
                s(j);
                mt5.d = mt5.d.g(g());
            }
            r(mt5.a(d(), g + 1, g()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.it5 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u44.w():it5");
    }

    public q44 x() {
        return this.h;
    }

    @Override // defpackage.ft5
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ub2 e() {
        return this.e;
    }

    public final it5 z(long j, q44 q44Var, HashMap hashMap, kt5 kt5Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        kt5 kt5Var2;
        Object[] objArr;
        long[] jArr;
        kt5 kt5Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        zx5 c;
        ai4 ai4Var;
        ArrayList arrayList5;
        kt5 f = d().g(g()).f(this.j);
        Object[] objArr3 = q44Var.b;
        long[] jArr3 = q44Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            xx5 xx5Var = (xx5) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            zx5 b = xx5Var.b();
                            i = i4;
                            ArrayList arrayList6 = arrayList3;
                            zx5 r = mt5.r(b, j, kt5Var);
                            if (r == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                zx5 r2 = mt5.r(b, g(), f);
                                if (r2 != null && r2.a != 1 && !r.equals(r2)) {
                                    kt5Var3 = f;
                                    zx5 r3 = mt5.r(b, g(), d());
                                    if (r3 != null) {
                                        if (hashMap == null || (c = (zx5) hashMap.get(r)) == null) {
                                            c = xx5Var.c(r2, r, r3);
                                        }
                                        if (c == null) {
                                            return new gt5(this);
                                        }
                                        if (!c.equals(r3)) {
                                            if (c.equals(r)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new ai4(xx5Var, r.c(g())));
                                                if (arrayList4 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList2.add(xx5Var);
                                                arrayList3 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList3 = new ArrayList();
                                                } else {
                                                    arrayList3 = arrayList6;
                                                }
                                                if (!c.equals(r2)) {
                                                    ai4Var = new ai4(xx5Var, c);
                                                } else {
                                                    ai4Var = new ai4(xx5Var, r2.c(g()));
                                                }
                                                arrayList3.add(ai4Var);
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        arrayList3 = arrayList6;
                                        arrayList2 = arrayList4;
                                    } else {
                                        mt5.q();
                                        throw null;
                                    }
                                }
                            }
                            kt5Var3 = f;
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            kt5Var3 = f;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        f = kt5Var3;
                    }
                    kt5Var2 = f;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    kt5Var2 = f;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 != length) {
                    i2++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    f = kt5Var2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                ai4 ai4Var2 = (ai4) arrayList3.get(i5);
                xx5 xx5Var2 = (xx5) ai4Var2.x;
                zx5 zx5Var = (zx5) ai4Var2.y;
                zx5Var.a = j;
                synchronized (mt5.c) {
                    zx5Var.b = xx5Var2.b();
                    xx5Var2.f(zx5Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                q44Var.l((xx5) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = yo0.u0(arrayList2, arrayList7);
            }
            this.i = arrayList2;
        }
        return ht5.a;
    }
}
