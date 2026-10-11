package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ho1 extends zc1 implements xq4, ly2, wu0, po1 {
    public rg4 N;
    public ub2 O;
    public boolean P;
    public u34 Q;
    public za0 R;
    public jo1 S;
    public boolean T;
    public boolean U;
    public ln1 V;
    public long W = 0;
    public ee2 X;
    public ee2 Y;
    public on1 Z;
    public nn1 a0;
    public mn1 b0;
    public io3 c0;
    public fq3 d0;
    public ok2 e0;
    public ky2 f0;

    public ho1(ub2 ub2Var, boolean z, u34 u34Var, rg4 rg4Var) {
        this.N = rg4Var;
        this.O = ub2Var;
        this.P = z;
        this.Q = u34Var;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [nn1, java.lang.Object] */
    public static void h1(ho1 ho1Var, uq4 uq4Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        nn1 nn1Var = ho1Var.a0;
        nn1 nn1Var2 = nn1Var;
        if (nn1Var == null) {
            ?? obj = new Object();
            obj.m = null;
            obj.n = Long.MAX_VALUE;
            obj.o = false;
            ho1Var.a0 = obj;
            nn1Var2 = obj;
        }
        nn1Var2.m = uq4Var;
        nn1Var2.n = j;
        ok2 ok2Var = ho1Var.e0;
        rg4 rg4Var = ho1Var.N;
        if (ok2Var == null) {
            ho1Var.e0 = new ok2(rg4Var);
        } else {
            ok2Var.z = rg4Var;
            ok2Var.y = j2;
        }
        nn1Var2.o = false;
        ho1Var.c0 = nn1Var2;
    }

    @Override // defpackage.xq4
    public final void J() {
        if (this.U) {
            f1();
            if (this.T) {
                o1().i(pn1.a);
            }
            this.d0 = null;
        }
        this.U = false;
    }

    @Override // defpackage.be2
    public final String S() {
        if (this.P) {
            io3 io3Var = this.c0;
            if (io3Var instanceof ln1) {
                if (((ln1) io3Var).o) {
                    return "waiting";
                }
                return "idle";
            }
            if ((io3Var instanceof nn1) || (io3Var instanceof mn1)) {
                return "waiting";
            }
            if (io3Var instanceof on1) {
                return "recognized";
            }
            return "idle";
        }
        return "idle";
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.T = false;
        d1();
        ee2 ee2Var = this.Y;
        if (ee2Var != null) {
            b1(ee2Var);
        }
        ee2 ee2Var2 = this.X;
        if (ee2Var2 != null) {
            b1(ee2Var2);
        }
        this.Y = null;
        this.X = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [zc1, ho1] */
    /* JADX WARN: Type inference failed for: r2v22, types: [iy2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [iy2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, fy2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object] */
    @Override // defpackage.ly2
    public final void Z(eb2 eb2Var, oq4 oq4Var) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float intBitsToFloat;
        ky2 ky2Var;
        Object obj3;
        oq4 oq4Var2;
        ky2 ky2Var2;
        dy2 dy2Var;
        dy2 dy2Var2;
        ey2 ey2Var;
        int i = eb2Var.y;
        ArrayList arrayList = (ArrayList) eb2Var.z;
        if (this.P) {
            ky2 ky2Var3 = this.f0;
            if (ky2Var3 == null) {
                ky2Var3 = new ky2(this);
                this.f0 = ky2Var3;
            }
            if (this.Y == null) {
                ee2 ee2Var = new ee2(ky2Var3);
                a1(ee2Var);
                this.Y = ee2Var;
            }
            ky2 ky2Var4 = this.f0;
            if (ky2Var4 != null) {
                ho1 ho1Var = ky2Var4.x;
                n03 n03Var = ky2Var4.C;
                n03 n03Var2 = n03Var;
                if (n03Var == null) {
                    fy2 fy2Var = ky2Var4.y;
                    fy2 fy2Var2 = fy2Var;
                    if (fy2Var == null) {
                        ?? obj4 = new Object();
                        obj4.y = ey2.z;
                        obj4.z = false;
                        obj4.A = false;
                        ky2Var4.y = obj4;
                        fy2Var2 = obj4;
                    }
                    ky2Var4.C = fy2Var2;
                    n03Var2 = fy2Var2;
                }
                boolean z = n03Var2 instanceof fy2;
                oq4 oq4Var3 = oq4.x;
                boolean z2 = true;
                oq4 oq4Var4 = oq4.y;
                if (z) {
                    fy2 fy2Var3 = (fy2) n03Var2;
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (!q23.h((dy2) arrayList.get(i2))) {
                                return;
                            }
                        }
                        dy2 dy2Var3 = (dy2) yo0.k0(arrayList);
                        int i3 = jy2.a[fy2Var3.y.ordinal()];
                        ey2 ey2Var2 = ey2.y;
                        ey2 ey2Var3 = ey2.x;
                        if (i3 == 1) {
                            if (!ho1Var.s1()) {
                                ey2Var = ey2Var3;
                            } else {
                                ey2Var = ey2Var2;
                            }
                        } else {
                            ey2Var = fy2Var3.y;
                        }
                        fy2Var3.y = ey2Var;
                        if (oq4Var == oq4Var3) {
                            if (ey2Var == ey2Var2) {
                                dy2Var3.i = true;
                                fy2Var3.z = true;
                            }
                            fy2Var3.A = true;
                        }
                        if (oq4Var == oq4Var4) {
                            if (ey2Var == ey2Var3) {
                                ky2.c(ky2Var4, dy2Var3, dy2Var3.a, 0L, 12);
                                return;
                            }
                            if (fy2Var3.z) {
                                ky2Var4.f(dy2Var3, dy2Var3, new cy2(i), 0L);
                                ky2Var4.e(dy2Var3, new cy2(i), 0L);
                                long j2 = dy2Var3.a;
                                iy2 iy2Var = ky2Var4.z;
                                iy2 iy2Var2 = iy2Var;
                                if (iy2Var == null) {
                                    ?? obj5 = new Object();
                                    obj5.y = Long.MAX_VALUE;
                                    ky2Var4.z = obj5;
                                    iy2Var2 = obj5;
                                }
                                iy2Var2.y = j2;
                                ky2Var4.C = iy2Var2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = n03Var2 instanceof hy2;
                oq4 oq4Var5 = oq4.z;
                if (z3) {
                    hy2 hy2Var = (hy2) n03Var2;
                    if (oq4Var != oq4Var3) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                obj3 = arrayList.get(i4);
                                ky2Var = ky2Var4;
                                if (sw0.o(((dy2) obj3).a, hy2Var.z)) {
                                    break;
                                }
                                i4++;
                                ky2Var4 = ky2Var;
                            } else {
                                ky2Var = ky2Var4;
                                obj3 = null;
                                break;
                            }
                        }
                        dy2 dy2Var4 = (dy2) obj3;
                        if (dy2Var4 == null) {
                            int size3 = arrayList.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 < size3) {
                                    dy2Var2 = arrayList.get(i5);
                                    if (((dy2) dy2Var2).d) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    dy2Var2 = 0;
                                    break;
                                }
                            }
                            dy2Var4 = dy2Var2;
                            if (dy2Var4 == null) {
                                ky2Var.a();
                                return;
                            }
                            hy2Var.z = dy2Var4.a;
                        }
                        dy2 dy2Var5 = dy2Var4;
                        if (oq4Var == oq4Var4) {
                            if (!dy2Var5.i) {
                                if (q23.i(dy2Var5)) {
                                    int size4 = arrayList.size();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < size4) {
                                            ?? r6 = arrayList.get(i6);
                                            if (((dy2) r6).d) {
                                                dy2Var = r6;
                                                break;
                                            }
                                            i6++;
                                        } else {
                                            dy2Var = null;
                                            break;
                                        }
                                    }
                                    dy2 dy2Var6 = dy2Var;
                                    if (dy2Var6 == null) {
                                        ky2Var.a();
                                    } else {
                                        hy2Var.z = dy2Var6.a;
                                    }
                                } else {
                                    rv6 rv6Var = (rv6) t80.C(ho1Var, bv0.t);
                                    float f2 = bo1.a;
                                    float f3 = rv6Var.f();
                                    ky2Var2 = ky2Var;
                                    ok2 ok2Var = ky2Var2.E;
                                    if (ok2Var != null) {
                                        long B = ok2.B(ok2Var, q23.N(dy2Var5, ho1Var.N, new cy2(i), true), f3);
                                        if ((9223372034707292159L & B) != 9205357640488583168L) {
                                            dy2Var5.i = true;
                                            dy2 dy2Var7 = hy2Var.y;
                                            dy2Var7.getClass();
                                            oq4Var2 = oq4Var5;
                                            ky2Var2.f(dy2Var7, dy2Var5, new cy2(i), B);
                                            ky2Var2.e(dy2Var5, new cy2(i), B);
                                            long j3 = dy2Var5.a;
                                            iy2 iy2Var3 = ky2Var2.z;
                                            iy2 iy2Var4 = iy2Var3;
                                            if (iy2Var3 == null) {
                                                ?? obj6 = new Object();
                                                obj6.y = Long.MAX_VALUE;
                                                ky2Var2.z = obj6;
                                                iy2Var4 = obj6;
                                            }
                                            iy2Var4.y = j3;
                                            ky2Var2.C = iy2Var4;
                                        } else {
                                            oq4Var2 = oq4Var5;
                                            hy2Var.A = true;
                                        }
                                    } else {
                                        ze0.k("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                oq4Var2 = oq4Var5;
                                ky2Var2 = ky2Var;
                                dy2 dy2Var8 = hy2Var.y;
                                if (dy2Var8 != null) {
                                    long j4 = hy2Var.z;
                                    ok2 ok2Var2 = ky2Var2.E;
                                    if (ok2Var2 != null) {
                                        ky2Var2.b(dy2Var8, j4, ok2Var2);
                                    } else {
                                        ze0.k("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    ze0.k("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                            if (oq4Var != oq4Var2 && hy2Var.A) {
                                if (dy2Var5.i) {
                                    dy2 dy2Var9 = hy2Var.y;
                                    if (dy2Var9 != null) {
                                        long j5 = hy2Var.z;
                                        ok2 ok2Var3 = ky2Var2.E;
                                        if (ok2Var3 != null) {
                                            ky2Var2.b(dy2Var9, j5, ok2Var3);
                                            return;
                                        } else {
                                            ze0.k("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    }
                                    ze0.k("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                                hy2Var.A = false;
                                return;
                            }
                            return;
                        }
                        oq4Var2 = oq4Var5;
                        ky2Var2 = ky2Var;
                        if (oq4Var != oq4Var2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (n03Var2 instanceof gy2) {
                    gy2 gy2Var = (gy2) n03Var2;
                    if (oq4Var == oq4Var5) {
                        int size5 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size5) {
                                break;
                            }
                            if (((dy2) arrayList.get(i7)).i) {
                                z2 = false;
                                break;
                            }
                            i7++;
                        }
                        int size6 = arrayList.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size6) {
                                break;
                            }
                            if (((dy2) arrayList.get(i8)).d) {
                                if (!arrayList.isEmpty()) {
                                    if (z2) {
                                        long O = q23.O((dy2) yo0.k0(arrayList), ho1Var.N, new cy2(i));
                                        dy2 dy2Var10 = gy2Var.y;
                                        dy2Var10.getClass();
                                        long e = xc4.e(O, q23.O(dy2Var10, ho1Var.N, new cy2(i)));
                                        dy2 dy2Var11 = gy2Var.y;
                                        if (dy2Var11 != null) {
                                            ky2.c(ky2Var4, dy2Var11, gy2Var.z, e, 8);
                                            return;
                                        } else {
                                            ze0.k("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                i8++;
                            }
                        }
                        ky2Var4.a();
                        return;
                    }
                    return;
                }
                if (n03Var2 instanceof iy2) {
                    iy2 iy2Var5 = (iy2) n03Var2;
                    if (oq4Var == oq4Var4) {
                        long j6 = iy2Var5.y;
                        int size7 = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size7) {
                                obj = arrayList.get(i9);
                                if (sw0.o(((dy2) obj).a, j6)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        dy2 dy2Var12 = (dy2) obj;
                        if (dy2Var12 != null) {
                            long j7 = dy2Var12.c;
                            boolean i10 = q23.i(dy2Var12);
                            pn1 pn1Var = pn1.a;
                            if (i10) {
                                int size8 = arrayList.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size8) {
                                        obj2 = arrayList.get(i11);
                                        if (((dy2) obj2).d) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                dy2 dy2Var13 = (dy2) obj2;
                                if (dy2Var13 == null) {
                                    if (!dy2Var12.i && q23.i(dy2Var12)) {
                                        fq3 d = ky2Var4.d();
                                        rg4 rg4Var = ho1Var.N;
                                        fr0 fr0Var = ky2Var4.F;
                                        f44 f44Var = (f44) fr0Var.z;
                                        char c2 = ' ';
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                                        long j8 = 4294967295L;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                                        if (q23.h(dy2Var12)) {
                                            fr0Var.y = 0;
                                            f44Var.d();
                                        }
                                        if (!q23.i(dy2Var12) && !q23.h(dy2Var12)) {
                                            if (f44Var.b == 3) {
                                                int i12 = fr0Var.y;
                                                fr0Var.y = i12 + 1;
                                                f44Var.o(i12, dy2Var12);
                                            } else {
                                                f44Var.a(dy2Var12);
                                            }
                                            if (fr0Var.y == 3) {
                                                fr0Var.y = 0;
                                            }
                                            Object[] objArr = f44Var.a;
                                            int i13 = f44Var.b;
                                            int i14 = 0;
                                            float f4 = 0.0f;
                                            while (i14 < i13) {
                                                char c3 = c2;
                                                f4 = Float.intBitsToFloat((int) (((dy2) objArr[i14]).c >> c3)) + f4;
                                                i14++;
                                                c2 = c3;
                                            }
                                            c = c2;
                                            f = 0.0f;
                                            int i15 = f44Var.b;
                                            intBitsToFloat2 = f4 / i15;
                                            Object[] objArr2 = f44Var.a;
                                            float f5 = 0.0f;
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                long j9 = j8;
                                                f5 += Float.intBitsToFloat((int) (((dy2) objArr2[i16]).c & j9));
                                                i16++;
                                                j8 = j9;
                                            }
                                            j = j8;
                                            intBitsToFloat3 = f5 / f44Var.b;
                                        } else {
                                            c = ' ';
                                            j = 4294967295L;
                                            f = 0.0f;
                                        }
                                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j);
                                        if (rg4Var != null) {
                                            if (i == 1) {
                                                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                                            } else if (i == 2) {
                                                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j));
                                            }
                                            floatToRawIntBits = rg4Var == rg4.y ? (Float.floatToRawIntBits(f) & j) | (Float.floatToRawIntBits(intBitsToFloat) << c) : (Float.floatToRawIntBits(f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j);
                                        }
                                        ((wv) d.y).a(dy2Var12.b, floatToRawIntBits);
                                        float e2 = ((rv6) t80.C(ho1Var, bv0.t)).e();
                                        long i17 = ky2Var4.d().i(ez5.a(e2, e2));
                                        wv wvVar = (wv) ky2Var4.d().y;
                                        wr6 wr6Var = (wr6) wvVar.b;
                                        ms.E0(0, r5.length, null, wr6Var.d);
                                        wr6Var.e = 0;
                                        wr6 wr6Var2 = (wr6) wvVar.c;
                                        ms.E0(0, r5.length, null, wr6Var2.d);
                                        wr6Var2.e = 0;
                                        wvVar.a = 0L;
                                        ho1Var.i1(new sn1(ro1.b(i17), true));
                                    } else {
                                        ho1Var.i1(pn1Var);
                                    }
                                    ky2Var4.a();
                                    return;
                                }
                                iy2Var5.y = dy2Var13.a;
                                return;
                            }
                            if (dy2Var12.i) {
                                ho1Var.i1(pn1Var);
                                return;
                            } else {
                                if (xc4.c(q23.N(dy2Var12, ho1Var.N, new cy2(i), true)) != 0.0f) {
                                    ky2Var4.e(dy2Var12, new cy2(i), q23.N(dy2Var12, ho1Var.N, new cy2(i), false));
                                    dy2Var12.i = true;
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ze0.l();
            }
        }
    }

    public final void d1() {
        jo1 jo1Var = this.S;
        if (jo1Var != null) {
            u34 u34Var = this.Q;
            if (u34Var != null) {
                u34Var.b(new io1(jo1Var));
            }
            this.S = null;
        }
    }

    public abstract Object e1(l5 l5Var, j10 j10Var);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ln1] */
    public final void f1() {
        this.W = 0L;
        ln1 ln1Var = this.V;
        kn1 kn1Var = kn1.z;
        ln1 ln1Var2 = ln1Var;
        if (ln1Var == null) {
            ?? obj = new Object();
            obj.m = kn1Var;
            obj.n = false;
            obj.o = false;
            this.V = obj;
            ln1Var2 = obj;
        }
        ln1Var2.m = kn1Var;
        ln1Var2.n = false;
        ln1Var2.o = false;
        this.c0 = ln1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [mn1, java.lang.Object] */
    public final void g1(uq4 uq4Var, long j, ok2 ok2Var) {
        mn1 mn1Var = this.b0;
        mn1 mn1Var2 = mn1Var;
        if (mn1Var == null) {
            ?? obj = new Object();
            obj.m = null;
            obj.n = Long.MAX_VALUE;
            this.b0 = obj;
            mn1Var2 = obj;
        }
        mn1Var2.m = uq4Var;
        mn1Var2.n = j;
        ok2Var.y = 0L;
        this.c0 = mn1Var2;
    }

    @Override // defpackage.po1
    public final rg4 getOrientation() {
        return this.N;
    }

    public final void i1(tn1 tn1Var) {
        if ((tn1Var instanceof rn1) && !this.T) {
            this.T = true;
            t1();
        }
        o1().i(tn1Var);
    }

    public void k1(sn1 sn1Var) {
        if (!this.K) {
            return;
        }
        tl7.z(O0(), null, null, new q8(this, sn1Var, null, (byte) 0), 3);
    }

    @Override // defpackage.ly2
    public final void l0() {
        ky2 ky2Var = this.f0;
        if (ky2Var != null) {
            ky2Var.a();
            ho1 ho1Var = ky2Var.x;
            if (ho1Var.T) {
                ho1Var.i1(pn1.a);
            }
            ky2Var.D = null;
            fr0 fr0Var = ky2Var.G;
            fr0Var.y = 0;
            ((w34) fr0Var.z).b = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(defpackage.xz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.eo1
            if (r0 == 0) goto L13
            r0 = r6
            eo1 r0 = (defpackage.eo1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            eo1 r0 = new eo1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r2
        L2c:
            defpackage.m37.N(r6)
            jo1 r6 = r5.S
            if (r6 == 0) goto L49
            u34 r1 = r5.Q
            if (r1 == 0) goto L47
            io1 r4 = new io1
            r4.<init>(r6)
            r0.z = r3
            java.lang.Object r6 = r1.a(r4, r0)
            w11 r0 = defpackage.w11.x
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.S = r2
        L49:
            sn1 r6 = new sn1
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.k1(r6)
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho1.l1(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [n13, java.lang.Object, jo1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1(defpackage.rn1 r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fo1
            if (r0 == 0) goto L13
            r0 = r8
            fo1 r0 = (defpackage.fo1) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            fo1 r0 = new fo1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            jo1 r7 = r0.y
            rn1 r0 = r0.x
            defpackage.m37.N(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L35:
            rn1 r7 = r0.x
            defpackage.m37.N(r8)
            goto L56
        L3b:
            defpackage.m37.N(r8)
            jo1 r8 = r6.S
            if (r8 == 0) goto L56
            u34 r1 = r6.Q
            if (r1 == 0) goto L56
            io1 r5 = new io1
            r5.<init>(r8)
            r0.x = r7
            r0.B = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            jo1 r8 = new jo1
            r8.<init>()
            u34 r1 = r6.Q
            if (r1 == 0) goto L70
            r0.x = r7
            r0.y = r8
            r0.B = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.S = r8
            long r7 = r7.a
            r6.j1(r7)
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho1.m1(rn1, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n1(defpackage.sn1 r6, defpackage.xz0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.go1
            if (r0 == 0) goto L13
            r0 = r7
            go1 r0 = (defpackage.go1) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            go1 r0 = new go1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            sn1 r6 = r0.x
            defpackage.m37.N(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r2
        L2e:
            defpackage.m37.N(r7)
            jo1 r7 = r5.S
            if (r7 == 0) goto L4d
            u34 r1 = r5.Q
            if (r1 == 0) goto L4b
            ko1 r4 = new ko1
            r4.<init>(r7)
            r0.x = r6
            r0.A = r3
            java.lang.Object r7 = r1.a(r4, r0)
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.S = r2
        L4d:
            r5.k1(r6)
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho1.n1(sn1, xz0):java.lang.Object");
    }

    public final lj0 o1() {
        za0 za0Var = this.R;
        if (za0Var != null) {
            return za0Var;
        }
        ze0.k("Events channel not initialized.");
        return null;
    }

    public final fq3 p1() {
        fq3 fq3Var = this.d0;
        if (fq3Var != null) {
            return fq3Var;
        }
        ze0.k("Velocity Tracker not initialized.");
        return null;
    }

    public final void q1(long j, uq4 uq4Var) {
        this.W = xc4.f(this.W, j);
        fz5.c(p1(), uq4Var);
        o1().i(new qn1(j, false));
    }

    public final void r1(uq4 uq4Var, uq4 uq4Var2, long j) {
        if (this.d0 == null) {
            this.d0 = new fq3((byte) 18);
        }
        fz5.c(p1(), uq4Var);
        long e = xc4.e(uq4Var2.c, j);
        if (((Boolean) this.O.invoke(new cr4(uq4Var.i))).booleanValue()) {
            if (!this.T) {
                if (this.R == null) {
                    this.R = iv.d(Integer.MAX_VALUE, 6, null);
                }
                t1();
            }
            o1().i(new rn1(e));
        }
    }

    public boolean s1() {
        boolean z;
        rd5 rd5Var = ((jd5) this).o0;
        if (!rd5Var.a.a()) {
            fc fcVar = rd5Var.b;
            if (fcVar != null) {
                z = fcVar.e();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void t1() {
        byte b = 1;
        this.T = true;
        vz0 vz0Var = null;
        if (this.R == null) {
            this.R = iv.d(Integer.MAX_VALUE, 6, null);
        }
        tl7.z(O0(), null, null, new j10(this, vz0Var, b), 3);
    }

    public final void u1(ub2 ub2Var, boolean z, u34 u34Var, rg4 rg4Var, boolean z2) {
        this.O = ub2Var;
        boolean z3 = true;
        if (this.P != z) {
            this.P = z;
            if (!z) {
                ee2 ee2Var = this.Y;
                if (ee2Var != null) {
                    b1(ee2Var);
                }
                ee2 ee2Var2 = this.X;
                if (ee2Var2 != null) {
                    b1(ee2Var2);
                }
                this.Y = null;
                this.X = null;
                d1();
                this.f0 = null;
            }
            z2 = true;
        }
        if (!a34.i(this.Q, u34Var)) {
            d1();
            this.Q = u34Var;
        }
        if (this.N != rg4Var) {
            this.N = rg4Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.U;
            pn1 pn1Var = pn1.a;
            if (z4) {
                f1();
                if (this.T) {
                    o1().i(pn1Var);
                }
                this.d0 = null;
            }
            ky2 ky2Var = this.f0;
            if (ky2Var != null) {
                ky2Var.a();
                ho1 ho1Var = ky2Var.x;
                if (ho1Var.T) {
                    ho1Var.i1(pn1Var);
                }
                ky2Var.D = null;
                fr0 fr0Var = ky2Var.G;
                fr0Var.y = 0;
                ((w34) fr0Var.z).b = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd  */
    /* JADX WARN: Type inference failed for: r12v7, types: [r05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [wu0, yc1, zc1, ho1, be2] */
    /* JADX WARN: Type inference failed for: r1v44, types: [on1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [on1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, ln1] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // defpackage.xq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(defpackage.nq4 r17, defpackage.oq4 r18, long r19) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho1.x(nq4, oq4, long):void");
    }

    public void j1(long j) {
    }
}
