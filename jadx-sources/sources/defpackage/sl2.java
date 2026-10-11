package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sl2 implements or3, lm2 {
    public final n71 A;
    public final xp1 B;
    public final tp1 C;
    public final q18 D;
    public final eb2 E;
    public final l7 F;
    public final IdentityHashMap G;
    public final sn3 H;
    public final m18 I;
    public final boolean J;
    public final boolean K;
    public final cp4 L;
    public final i75 M = new i75(this, (byte) 23);
    public nr3 N;
    public int O;
    public zg6 P;
    public tm2[] Q;
    public tm2[] R;
    public int S;
    public nu0 T;
    public long U;
    public final x81 x;
    public final b91 y;
    public final i75 z;

    /* JADX WARN: Multi-variable type inference failed */
    public sl2(x81 x81Var, b91 b91Var, i75 i75Var, n71 n71Var, xp1 xp1Var, tp1 tp1Var, q18 q18Var, eb2 eb2Var, l7 l7Var, m18 m18Var, boolean z, int i, cp4 cp4Var) {
        this.x = x81Var;
        this.y = b91Var;
        this.z = i75Var;
        this.A = n71Var;
        this.B = xp1Var;
        this.C = tp1Var;
        this.D = q18Var;
        this.E = eb2Var;
        this.F = l7Var;
        this.I = m18Var;
        this.J = z;
        this.K = i;
        this.L = cp4Var;
        m18Var.getClass();
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        this.T = new nu0(o15Var, o15Var);
        this.G = new IdentityHashMap();
        this.H = new sn3((byte) 22);
        this.Q = new tm2[0];
        this.R = new tm2[0];
        this.U = Long.MIN_VALUE;
    }

    public static ea2 r(ea2 ea2Var, ea2 ea2Var2, boolean z) {
        fy3 fy3Var;
        int i;
        String str;
        String str2;
        nw2 nw2Var;
        int i2;
        int i3;
        String str3;
        int i4;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        int i5 = -1;
        if (ea2Var2 != null) {
            str2 = ea2Var2.l;
            fy3Var = ea2Var2.m;
            i2 = ea2Var2.J;
            i = ea2Var2.e;
            i3 = ea2Var2.f;
            str = ea2Var2.d;
            str3 = ea2Var2.b;
            nw2Var = ea2Var2.c;
        } else {
            String x = eq6.x(1, ea2Var.l);
            fy3Var = ea2Var.m;
            if (z) {
                i2 = ea2Var.J;
                i = ea2Var.e;
                i3 = ea2Var.f;
                str = ea2Var.d;
                str3 = ea2Var.b;
                str2 = x;
                nw2Var = ea2Var.c;
            } else {
                i = 0;
                str = null;
                str2 = x;
                nw2Var = o15Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String d = qy3.d(str2);
        if (z) {
            i4 = ea2Var.i;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = ea2Var.j;
        }
        da2 da2Var = new da2();
        da2Var.a = ea2Var.a;
        da2Var.b = str3;
        da2Var.c = nw2.o(nw2Var);
        da2Var.n = qy3.n(ea2Var.o);
        da2Var.o = qy3.n(d);
        da2Var.k = str2;
        da2Var.l = fy3Var;
        da2Var.i = i4;
        da2Var.j = i5;
        da2Var.I = i2;
        da2Var.e = i;
        da2Var.f = i3;
        da2Var.d = str;
        return new ea2(da2Var);
    }

    @Override // defpackage.lm2
    public final void a() {
        nw2 nw2Var;
        long j;
        for (tm2 tm2Var : this.Q) {
            dn0 dn0Var = tm2Var.G;
            nl2 nl2Var = tm2Var.A;
            ArrayList arrayList = tm2Var.K;
            if (!arrayList.isEmpty()) {
                rl2 rl2Var = (rl2) bx7.z(arrayList);
                int c = nl2Var.c(rl2Var);
                int i = rl2Var.o;
                boolean z = true;
                if (c == 1) {
                    if (!rl2Var.f()) {
                        if (i == -1) {
                            z = false;
                        }
                        io3.B(z);
                        bm2 b = nl2Var.g.b(false, rl2Var.m);
                        b.getClass();
                        nw2 nw2Var2 = b.r;
                        int i2 = (int) (rl2Var.j - b.k);
                        if (i2 < 0) {
                            j = 0;
                        } else {
                            if (i2 < nw2Var2.size()) {
                                nw2Var = ((yl2) nw2Var2.get(i2)).J;
                            } else {
                                nw2Var = b.s;
                            }
                            j = ((wl2) nw2Var.get(i)).z;
                        }
                        rl2Var.K = j;
                    }
                } else if (c == 0) {
                    tm2Var.O.post(new f32(tm2Var, rl2Var, (byte) 6));
                } else if (c == 2 && !tm2Var.q0 && dn0Var.F()) {
                    dn0Var.p();
                }
            }
        }
        this.N.g(this);
    }

    @Override // defpackage.or3
    public final long b(long j) {
        this.U = j;
        for (tm2 tm2Var : this.Q) {
            tm2Var.N(j);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r45 != r3.m0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.or3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.jz1[] r41, boolean[] r42, defpackage.g95[] r43, boolean[] r44, long r45) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl2.c(jz1[], boolean[], g95[], boolean[], long):long");
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.T.d();
    }

    @Override // defpackage.ui5
    public final long f() {
        return this.T.f();
    }

    @Override // defpackage.lm2
    public final boolean g(Uri uri, fr0 fr0Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        om2 om2Var;
        gj3 gj3Var;
        int u;
        boolean z4;
        om2 om2Var2;
        tm2[] tm2VarArr = this.Q;
        int length = tm2VarArr.length;
        int i2 = 0;
        boolean z5 = false;
        while (i2 < length) {
            tm2 tm2Var = tm2VarArr[i2];
            nl2 nl2Var = tm2Var.A;
            om2[] om2VarArr = nl2Var.e;
            HashMap hashMap = nl2Var.g.A;
            int length2 = om2VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                om2 om2Var3 = om2VarArr[i3];
                a91 a91Var = (a91) hashMap.get(uri);
                if (a91Var != null) {
                    om2Var = a91Var.a;
                } else {
                    om2Var = null;
                }
                if (om2Var3.equals(om2Var)) {
                    if (!z) {
                        fj3 a = nl2Var.a(uri);
                        tm2Var.F.getClass();
                        gj3Var = q18.h(a, fr0Var);
                    } else {
                        gj3Var = null;
                    }
                    nl2Var.p = uri;
                    if (gj3Var != null) {
                        byte b = gj3Var.a;
                        ol2 ol2Var = nl2Var.h;
                        if (ol2Var == null || !ol2Var.k) {
                            ol2Var = null;
                        }
                        i = i2;
                        boolean z6 = false;
                        long j = gj3Var.b;
                        if (b != 1) {
                            if (b == 2) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < om2VarArr.length) {
                                        om2 om2Var4 = om2VarArr[i4];
                                        z2 = z6;
                                        a91 a91Var2 = (a91) hashMap.get(uri);
                                        if (a91Var2 != null) {
                                            om2Var2 = a91Var2.a;
                                        } else {
                                            om2Var2 = null;
                                        }
                                        if (om2Var4.equals(om2Var2)) {
                                            break;
                                        }
                                        i4++;
                                        z6 = z2;
                                    } else {
                                        z2 = z6;
                                        i4 = -1;
                                        break;
                                    }
                                }
                                if (i4 != -1 && (u = nl2Var.s.u(i4)) != -1 && nl2Var.s.p(u, j)) {
                                    a91 a91Var3 = (a91) hashMap.get(uri);
                                    if (a91Var3 != null) {
                                        z4 = a91Var3.a(uri, j, null);
                                    } else {
                                        z4 = z2;
                                    }
                                    if (z4) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                ze0.m(qx1.h(b, "Invalid fallback selection type: "));
                                return false;
                            }
                        } else {
                            z2 = false;
                            if (ol2Var != null) {
                                nl2Var.s.e();
                                z3 = ol2Var.a(j);
                            } else {
                                a91 a91Var4 = (a91) hashMap.get(uri);
                                if (a91Var4 != null) {
                                    z3 = a91Var4.a(uri, j, null);
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 = z2;
            z5 |= z3;
            i2 = i + 1;
        }
        this.N.g(this);
        return z5;
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        bm2 bm2Var;
        long j2;
        tm2[] tm2VarArr = this.R;
        int length = tm2VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            tm2 tm2Var = tm2VarArr[i];
            if (tm2Var.X == 2) {
                nl2 nl2Var = tm2Var.A;
                b91 b91Var = nl2Var.g;
                int d = nl2Var.s.d();
                om2[] om2VarArr = nl2Var.e;
                if (d < om2VarArr.length && d != -1) {
                    bm2Var = b91Var.b(true, om2VarArr[nl2Var.s.m()].b());
                } else {
                    bm2Var = null;
                }
                if (bm2Var != null) {
                    nw2 nw2Var = bm2Var.r;
                    if (!nw2Var.isEmpty()) {
                        long j3 = bm2Var.h - b91Var.S;
                        long j4 = j - j3;
                        int d2 = eq6.d(nw2Var, Long.valueOf(j4), true);
                        long j5 = ((yl2) nw2Var.get(d2)).B;
                        if (bm2Var.c && d2 != nw2Var.size() - 1) {
                            j2 = ((yl2) nw2Var.get(d2 + 1)).B;
                        } else {
                            j2 = j5;
                        }
                        return if5Var.a(j4, j5, j2) + j3;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.or3
    public final void i() {
        for (tm2 tm2Var : this.Q) {
            tm2Var.J();
            if (tm2Var.q0 && !tm2Var.a0) {
                throw bj4.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // defpackage.or3
    public final long j(long j) {
        tm2[] tm2VarArr = this.R;
        if (tm2VarArr.length > 0) {
            boolean M = tm2VarArr[0].M(j, false);
            int i = 1;
            while (true) {
                tm2[] tm2VarArr2 = this.R;
                if (i >= tm2VarArr2.length) {
                    break;
                }
                tm2VarArr2[i].M(j, M);
                i++;
            }
            if (M) {
                ((SparseArray) this.H.y).clear();
            }
        }
        return j;
    }

    public final tm2 k(String str, int i, om2[] om2VarArr, ea2[] ea2VarArr, ea2 ea2Var, List list, Map map, long j) {
        tm2 tm2Var = new tm2(str, i, this.M, new nl2(this.x, this.y, om2VarArr, ea2VarArr, this.z, this.A, this.H, list, this.L), map, this.F, j, ea2Var, this.B, this.C, this.D, this.E, this.K ? 1 : 0, null);
        tm2Var.N(this.U);
        return tm2Var;
    }

    @Override // defpackage.or3
    public final void l(long j) {
        for (tm2 tm2Var : this.R) {
            if (tm2Var.Z && !tm2Var.F()) {
                int length = tm2Var.S.length;
                for (int i = 0; i < length; i++) {
                    tm2Var.S[i].i(j, tm2Var.k0[i]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    @Override // defpackage.or3
    public final List m(ArrayList arrayList) {
        tm2 tm2Var;
        zg6 zg6Var;
        int i;
        boolean z;
        sl2 sl2Var = this;
        fm2 fm2Var = sl2Var.y.H;
        fm2Var.getClass();
        boolean isEmpty = fm2Var.e.isEmpty();
        boolean z2 = !isEmpty;
        int i2 = 0;
        if (!isEmpty) {
            tm2Var = sl2Var.Q[0];
            tm2Var.w();
            zg6Var = tm2Var.f0;
        } else {
            tm2Var = null;
            zg6Var = null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            jz1 jz1Var = (jz1) obj;
            yg6 c = jz1Var.c();
            if (zg6Var != null) {
                i = zg6Var.b(c);
            } else {
                i = -1;
            }
            if (i != -1) {
                if (i == tm2Var.i0) {
                    o15 p = nw2.p(tm2Var.A.e);
                    for (int i4 = i2; i4 < jz1Var.length(); i4++) {
                        z62 listIterator = nw2.o(((om2) p.get(jz1Var.j(i4))).c).listIterator(i2);
                        while (listIterator.hasNext()) {
                            arrayList2.add(new vy5(i2, i2, ((Integer) listIterator.next()).intValue()));
                            isEmpty = isEmpty;
                        }
                    }
                    z = isEmpty;
                    z4 = true;
                } else {
                    z = isEmpty;
                    z3 = true;
                }
            } else {
                z = isEmpty;
                ?? r1 = z2;
                while (true) {
                    tm2[] tm2VarArr = sl2Var.Q;
                    if (r1 < tm2VarArr.length) {
                        tm2 tm2Var2 = tm2VarArr[r1];
                        tm2Var2.w();
                        zg6 zg6Var2 = tm2Var2.f0;
                        int b = zg6Var2.b(c);
                        if (b != -1) {
                            if (b == tm2Var2.i0) {
                                int i5 = zg6Var2.a(b).c;
                                int i6 = 1;
                                if (i5 != 1) {
                                    i6 = 2;
                                }
                                o15 p2 = nw2.p(tm2Var2.A.e);
                                for (int i7 = 0; i7 < jz1Var.length(); i7++) {
                                    int i8 = 0;
                                    z62 listIterator2 = nw2.o(((om2) p2.get(jz1Var.j(i7))).c).listIterator(0);
                                    while (listIterator2.hasNext()) {
                                        arrayList2.add(new vy5(i8, i6, ((Integer) listIterator2.next()).intValue()));
                                        p2 = p2;
                                        i8 = 0;
                                    }
                                }
                            }
                        } else {
                            sl2Var = this;
                            r1++;
                        }
                    }
                }
            }
            sl2Var = this;
            isEmpty = z;
            i2 = 0;
        }
        if (!isEmpty && z3 && !z4) {
            o15 p3 = nw2.p(tm2Var.A.e);
            int i9 = ((om2) p3.get(0)).a.a.k;
            int i10 = 0;
            for (int i11 = 1; i11 < p3.A; i11++) {
                int i12 = ((om2) p3.get(i11)).a.a.k;
                if (i12 < i9) {
                    i9 = i12;
                    i10 = i11;
                }
            }
            z62 listIterator3 = nw2.o(((om2) p3.get(i10)).c).listIterator(0);
            while (listIterator3.hasNext()) {
                arrayList2.add(new vy5(0, 0, ((Integer) listIterator3.next()).intValue()));
            }
        }
        return arrayList2;
    }

    @Override // defpackage.or3
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        String str;
        x81 x81Var;
        boolean z;
        Map map;
        tm2[] tm2VarArr;
        int i;
        ArrayList arrayList;
        Map map2;
        nw2 nw2Var;
        ArrayList arrayList2;
        int i2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        List list;
        this.N = nr3Var;
        b91 b91Var = this.y;
        b91Var.B.add(this);
        fm2 fm2Var = b91Var.H;
        fm2Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        nw2 c = b91Var.c(0);
        c.getClass();
        nw2 c2 = b91Var.c(2);
        c2.getClass();
        nw2 c3 = b91Var.c(3);
        c3.getClass();
        boolean isEmpty = c.isEmpty();
        this.O = 0;
        ArrayList arrayList3 = new ArrayList();
        x81 x81Var2 = this.x;
        boolean z6 = this.J;
        if (isEmpty) {
            str = "ID3";
            x81Var = x81Var2;
            z = z6;
            map = map3;
        } else {
            ea2 ea2Var = fm2Var.j;
            List list2 = fm2Var.k;
            int size = c.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < c.size(); i6++) {
                ea2 ea2Var2 = ((om2) c.get(i6)).a.a;
                int i7 = ea2Var2.x;
                String str2 = ea2Var2.l;
                if (i7 > 0 || eq6.x(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (eq6.x(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z4 = false;
                i3 = i4;
                z3 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z3 = false;
                i3 = i10;
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
                i3 = size;
            }
            om2[] om2VarArr = new om2[i3];
            ea2[] ea2VarArr = new ea2[i3];
            int i11 = 0;
            boolean z7 = z3;
            int i12 = 0;
            while (i12 < c.size()) {
                if (z7) {
                    list = list2;
                    if (iArr[i12] != 2) {
                        i12++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z4 || iArr[i12] != 1) {
                    om2 om2Var = (om2) c.get(i12);
                    om2VarArr[i11] = om2Var;
                    ea2VarArr[i11] = om2Var.a.a;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = ea2VarArr[0].l;
            int w = eq6.w(2, str3);
            int i13 = 1;
            int w2 = eq6.w(1, str3);
            if ((w2 == 1 || (w2 == 0 && c2.isEmpty())) && w <= 1 && w2 + w > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z7 || w2 <= 0) {
                i13 = 0;
            }
            x81Var = x81Var2;
            z = z6;
            tm2 k = k("main", i13, om2VarArr, ea2VarArr, ea2Var, list3, map3, j);
            arrayList3.add(k);
            if (z && z5) {
                ArrayList arrayList4 = new ArrayList();
                if (w > 0) {
                    ea2[] ea2VarArr2 = new ea2[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        ea2 ea2Var3 = ea2VarArr[i14];
                        ea2[] ea2VarArr3 = ea2VarArr;
                        Map map4 = map3;
                        String x = eq6.x(2, ea2Var3.l);
                        String d = qy3.d(x);
                        da2 da2Var = new da2();
                        int i15 = i14;
                        da2Var.a = ea2Var3.a;
                        da2Var.b = ea2Var3.b;
                        da2Var.c = nw2.o(ea2Var3.c);
                        da2Var.n = qy3.n(ea2Var3.o);
                        da2Var.o = qy3.n(d);
                        da2Var.k = x;
                        da2Var.l = ea2Var3.m;
                        da2Var.i = ea2Var3.i;
                        da2Var.j = ea2Var3.j;
                        da2Var.v = ea2Var3.w;
                        da2Var.w = ea2Var3.x;
                        da2Var.a(ea2Var3.B);
                        da2Var.e = ea2Var3.e;
                        da2Var.f = ea2Var3.f;
                        da2Var.G = ea2Var3.H;
                        ea2VarArr2[i15] = new ea2(da2Var);
                        i14 = i15 + 1;
                        ea2VarArr = ea2VarArr3;
                        map3 = map4;
                    }
                    ea2[] ea2VarArr4 = ea2VarArr;
                    map = map3;
                    arrayList4.add(new yg6("main", ea2VarArr2));
                    if (w2 > 0 && (ea2Var != null || c2.isEmpty())) {
                        da2 a = r(ea2VarArr4[0], ea2Var, false).a();
                        a.m = "main";
                        arrayList4.add(new yg6("main:audio", new ea2(a)));
                    }
                    if (list3 != null) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            String h = qx1.h(i16, "main:cc:");
                            da2 a2 = x81Var.b((ea2) list3.get(i16)).a();
                            a2.m = "main";
                            arrayList4.add(new yg6(h, new ea2(a2)));
                        }
                    }
                } else {
                    map = map3;
                    ea2[] ea2VarArr5 = new ea2[i3];
                    for (int i17 = 0; i17 < i3; i17++) {
                        ea2VarArr5[i17] = r(ea2VarArr[i17], ea2Var, true);
                    }
                    arrayList4.add(new yg6("main", ea2VarArr5));
                }
                da2 da2Var2 = new da2();
                str = "ID3";
                da2Var2.a = str;
                da2Var2.o = qy3.n("application/id3");
                da2Var2.m = "main";
                yg6 yg6Var = new yg6("main:id3", new ea2(da2Var2));
                arrayList4.add(yg6Var);
                k.K((yg6[]) arrayList4.toArray(new yg6[0]), arrayList4.indexOf(yg6Var));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList5 = new ArrayList(c2.size());
        ArrayList arrayList6 = new ArrayList(c2.size());
        HashSet hashSet2 = new HashSet();
        int i18 = 0;
        while (i18 < c2.size()) {
            String str4 = ((om2) c2.get(i18)).a.c;
            str4.getClass();
            if (!hashSet2.add(str4)) {
                arrayList2 = arrayList5;
                hashSet = hashSet2;
                i2 = i18;
                map2 = map;
                nw2Var = c2;
                arrayList = arrayList6;
            } else {
                arrayList5.clear();
                arrayList6.clear();
                boolean z8 = true;
                for (int i19 = 0; i19 < c2.size(); i19++) {
                    if (str4.equals(((om2) c2.get(i19)).a.c)) {
                        om2 om2Var2 = (om2) c2.get(i19);
                        ea2 ea2Var4 = om2Var2.a.a;
                        arrayList5.add(om2Var2);
                        arrayList6.add(ea2Var4);
                        if (eq6.w(1, ea2Var4.l) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z8 &= z2;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = eq6.a;
                nw2 nw2Var2 = c2;
                arrayList = arrayList6;
                map2 = map;
                nw2Var = nw2Var2;
                arrayList2 = arrayList5;
                i2 = i18;
                hashSet = hashSet2;
                tm2 k2 = k(concat, 1, (om2[]) arrayList5.toArray(new om2[0]), (ea2[]) arrayList6.toArray(new ea2[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(k2);
                if (z && z8) {
                    String concat2 = concat.concat(":id3");
                    da2 da2Var3 = new da2();
                    da2Var3.a = str;
                    da2Var3.o = qy3.n("application/id3");
                    da2Var3.m = concat;
                    k2.K(new yg6[]{new yg6(concat, (ea2[]) arrayList.toArray(new ea2[0])), new yg6(concat2, new ea2(da2Var3))}, 1);
                }
            }
            i18 = i2 + 1;
            arrayList6 = arrayList;
            arrayList5 = arrayList2;
            c2 = nw2Var;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map5 = map;
        this.S = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(c3.size());
        ArrayList arrayList8 = new ArrayList(c3.size());
        HashSet hashSet3 = new HashSet();
        int i20 = 0;
        while (i20 < c3.size()) {
            String str6 = ((om2) c3.get(i20)).a.c;
            str6.getClass();
            if (!hashSet3.add(str6)) {
                i = i20;
            } else {
                arrayList7.clear();
                arrayList8.clear();
                for (int i21 = 0; i21 < c3.size(); i21++) {
                    if (str6.equals(((om2) c3.get(i21)).a.c)) {
                        om2 om2Var3 = (om2) c3.get(i21);
                        arrayList7.add(om2Var3);
                        arrayList8.add(om2Var3.a.a);
                    }
                }
                String concat3 = "subtitle:".concat(str6);
                ea2[] ea2VarArr6 = (ea2[]) arrayList8.toArray(new ea2[0]);
                String str7 = eq6.a;
                om2[] om2VarArr2 = (om2[]) arrayList7.toArray(new om2[0]);
                z62 z62Var = nw2.y;
                i = i20;
                tm2 k3 = k(concat3, 3, om2VarArr2, ea2VarArr6, null, o15.B, map5, j);
                arrayList3.add(k3);
                int length = ea2VarArr6.length;
                ea2[] ea2VarArr7 = new ea2[length];
                for (int i22 = 0; i22 < length; i22++) {
                    ea2VarArr7[i22] = x81Var.b(ea2VarArr6[i22]);
                }
                k3.K(new yg6[]{new yg6(concat3, ea2VarArr7)}, new int[0]);
            }
            i20 = i + 1;
        }
        tm2[] tm2VarArr2 = (tm2[]) arrayList3.toArray(new tm2[0]);
        this.Q = tm2VarArr2;
        this.O = tm2VarArr2.length;
        int i23 = 0;
        while (true) {
            int i24 = this.S;
            tm2VarArr = this.Q;
            if (i23 >= i24) {
                break;
            }
            tm2VarArr[i23].A.m = true;
            i23++;
        }
        for (tm2 tm2Var : tm2VarArr) {
            if (!tm2Var.a0) {
                pj3 pj3Var = new pj3();
                pj3Var.a = tm2Var.m0;
                tm2Var.q(new qj3(pj3Var));
            }
        }
        this.R = this.Q;
    }

    @Override // defpackage.or3
    public final zg6 p() {
        zg6 zg6Var = this.P;
        zg6Var.getClass();
        return zg6Var;
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        if (this.P == null) {
            for (tm2 tm2Var : this.Q) {
                if (!tm2Var.a0) {
                    pj3 pj3Var = new pj3();
                    pj3Var.a = tm2Var.m0;
                    tm2Var.q(new qj3(pj3Var));
                }
            }
            return false;
        }
        return this.T.q(qj3Var);
    }

    @Override // defpackage.ui5
    public final long s() {
        return this.T.s();
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        this.T.v(j);
    }
}
