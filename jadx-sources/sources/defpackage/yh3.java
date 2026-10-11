package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh3 implements vo3 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ yh3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, u05] */
    @Override // defpackage.vo3
    public final wo3 b(final xo3 xo3Var, List list, long j) {
        em4 p;
        int i;
        Float valueOf;
        int i2;
        int i3;
        int i4;
        int max;
        int i5;
        int i6;
        int h0;
        int i7;
        int h02;
        final em4 em4Var;
        int i8;
        int i9;
        final Integer num;
        final Integer num2;
        byte b = this.a;
        Object obj = this.b;
        ot1 ot1Var = ot1.x;
        switch (b) {
            case 0:
                return xo3Var.L(rx0.h(j), rx0.g(j), ot1Var, new r82(list, this, (byte) 8));
            case 1:
                tr5 tr5Var = (tr5) obj;
                int i10 = tr5Var.x;
                float[] fArr = tr5Var.D;
                rg4 rg4Var = tr5Var.J;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        ro3 ro3Var = (ro3) list.get(i11);
                        if (wc7.t(ro3Var) == jr5.x) {
                            final em4 p2 = ro3Var.p(j);
                            int size2 = list.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                ro3 ro3Var2 = (ro3) list.get(i12);
                                if (wc7.t(ro3Var2) == jr5.y) {
                                    rg4 rg4Var2 = rg4.x;
                                    if (rg4Var == rg4Var2) {
                                        p = ro3Var2.p(rx0.a(sx0.i(0, j, -p2.y), 0, 0, 0, 0, 14));
                                    } else {
                                        p = ro3Var2.p(rx0.a(sx0.i(-p2.x, j, 0), 0, 0, 0, 0, 11));
                                    }
                                    final ?? obj2 = new Object();
                                    float c = tr5Var.c();
                                    fArr.getClass();
                                    if (fArr.length == 0) {
                                        valueOf = null;
                                        i = 0;
                                    } else {
                                        i = 0;
                                        valueOf = Float.valueOf(fArr[0]);
                                    }
                                    if (!a34.h(c, valueOf) && !a34.h(c, ms.P0(fArr))) {
                                        i2 = i;
                                    } else {
                                        i2 = 1;
                                    }
                                    int P = p.P(sr5.c);
                                    if (P != Integer.MIN_VALUE) {
                                        i3 = P;
                                    } else {
                                        i3 = i;
                                    }
                                    if (rg4Var == rg4Var2) {
                                        i4 = Math.max(p.x, p2.x);
                                        int i13 = p2.y;
                                        int i14 = p.y;
                                        max = i13 + i14;
                                        i5 = (i4 - p.x) / 2;
                                        i6 = i13 / 2;
                                        i7 = (i4 - p2.x) / 2;
                                        if (i10 > 0 && i2 == 0) {
                                            h02 = io3.h0((i14 - (i3 * 2)) * c) + i3;
                                        } else {
                                            h02 = io3.h0(i14 * c);
                                        }
                                        obj2.x = h02;
                                    } else {
                                        i4 = p2.x + p.x;
                                        max = Math.max(p.y, p2.y);
                                        i5 = p2.x / 2;
                                        i6 = (max - p.y) / 2;
                                        if (i10 > 0 && i2 == 0) {
                                            h0 = io3.h0((p.x - (i3 * 2)) * c) + i3;
                                        } else {
                                            h0 = io3.h0(p.x * c);
                                        }
                                        i7 = h0;
                                        obj2.x = (max - p2.y) / 2;
                                    }
                                    final int i15 = i6;
                                    final int i16 = i5;
                                    final int i17 = i7;
                                    tr5Var.E.i(i4);
                                    tr5Var.F.i(max);
                                    final em4 em4Var2 = p;
                                    return xo3Var.L(i4, max, ot1Var, new ub2() { // from class: pr5
                                        @Override // defpackage.ub2
                                        public final Object invoke(Object obj3) {
                                            dm4 dm4Var = (dm4) obj3;
                                            dm4.j(dm4Var, em4.this, i16, i15);
                                            dm4.j(dm4Var, p2, i17, obj2.x);
                                            return pn6.a;
                                        }
                                    });
                                }
                            }
                            hi3.b("Collection contains no element matching the predicate.");
                            v71.e();
                        } else {
                            i11++;
                        }
                    } else {
                        hi3.b("Collection contains no element matching the predicate.");
                        v71.e();
                    }
                }
                return null;
            default:
                final em4 em4Var3 = null;
                if (((ic2) obj) != null) {
                    int size3 = list.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        ro3 ro3Var3 = (ro3) list.get(i18);
                        if (a34.i(wc7.t(ro3Var3), "text")) {
                            em4Var = ro3Var3.p(rx0.a(j, 0, 0, 0, 0, 11));
                        }
                    }
                    hi3.b("Collection contains no element matching the predicate.");
                    v71.e();
                    return null;
                }
                em4Var = null;
                if (em4Var != null) {
                    i8 = em4Var.x;
                } else {
                    i8 = 0;
                }
                final int max2 = Math.max(i8, 0);
                int x0 = xo3Var.x0(i66.a);
                if (em4Var != null) {
                    i9 = em4Var.y;
                } else {
                    i9 = 0;
                }
                final int max3 = Math.max(x0, xo3Var.p0(i66.e) + 0 + i9);
                if (em4Var != null) {
                    num = Integer.valueOf(em4Var.P(i7.a));
                } else {
                    num = null;
                }
                if (em4Var != null) {
                    num2 = Integer.valueOf(em4Var.P(i7.b));
                } else {
                    num2 = null;
                }
                return xo3Var.L(max2, max3, ot1Var, new ub2() { // from class: h66
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj3) {
                        float f;
                        dm4 dm4Var = (dm4) obj3;
                        em4 em4Var4 = em4.this;
                        em4 em4Var5 = em4Var3;
                        int i19 = max3;
                        if (em4Var4 != null && em4Var5 != null) {
                            Integer num3 = num;
                            num3.getClass();
                            int intValue = num3.intValue();
                            Integer num4 = num2;
                            num4.getClass();
                            int intValue2 = num4.intValue();
                            if (intValue == intValue2) {
                                f = i66.c;
                            } else {
                                f = i66.d;
                            }
                            xo3 xo3Var2 = xo3Var;
                            int x02 = xo3Var2.x0(tt4.b) + xo3Var2.x0(f);
                            int p0 = (xo3Var2.p0(i66.e) + em4Var5.y) - intValue;
                            int i20 = em4Var4.x;
                            int i21 = max2;
                            int i22 = (i19 - intValue2) - x02;
                            dm4.j(dm4Var, em4Var4, (i21 - i20) / 2, i22);
                            dm4.j(dm4Var, em4Var5, (i21 - em4Var5.x) / 2, i22 - p0);
                        } else if (em4Var4 != null) {
                            float f2 = i66.a;
                            dm4.j(dm4Var, em4Var4, 0, (i19 - em4Var4.y) / 2);
                        } else if (em4Var5 != null) {
                            float f3 = i66.a;
                            dm4.j(dm4Var, em4Var5, 0, (i19 - em4Var5.y) / 2);
                        }
                        return pn6.a;
                    }
                });
        }
    }
}
