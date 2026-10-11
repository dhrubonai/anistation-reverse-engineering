package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s62 implements f24, w75 {
    public final ur a;
    public final wr b;
    public final float c;
    public final o21 d;
    public final float e;
    public final int f;
    public final q62 g;

    public s62(ur urVar, wr wrVar, float f, o21 o21Var, float f2, int i, q62 q62Var) {
        this.a = urVar;
        this.b = wrVar;
        this.c = f;
        this.d = o21Var;
        this.e = f2;
        this.f = i;
        this.g = q62Var;
    }

    public static int k(List list, int i, int i2, int i3, int i4, q62 q62Var) {
        int i5;
        int i6;
        boolean z;
        w03 w03Var;
        int i7;
        boolean z2;
        w03 w03Var2;
        boolean z3;
        long a = w03.a(0, 0);
        if (!list.isEmpty()) {
            int i8 = Integer.MAX_VALUE;
            dq1 dq1Var = new dq1(i4, q62Var, sx0.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            ro3 ro3Var = (ro3) yo0.n0(0, list);
            if (ro3Var != null) {
                i5 = ro3Var.O(i);
            } else {
                i5 = 0;
            }
            if (ro3Var != null) {
                i6 = ro3Var.k(i5);
            } else {
                i6 = 0;
            }
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            long a2 = w03.a(i, Integer.MAX_VALUE);
            if (ro3Var == null) {
                w03Var = null;
            } else {
                w03Var = new w03(w03.a(i6, i5));
            }
            int i9 = 0;
            if (dq1Var.b(z, 0, a2, w03Var, 0, 0, 0, false, false).b) {
                q62Var.getClass();
                a = a;
            } else {
                int size = list.size();
                int i10 = i;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    int i16 = i10 - i6;
                    int i17 = i13 + 1;
                    int max = Math.max(i12, i5);
                    ro3 ro3Var2 = (ro3) yo0.n0(i17, list);
                    if (ro3Var2 != null) {
                        i5 = ro3Var2.O(i);
                    } else {
                        i5 = 0;
                    }
                    if (ro3Var2 != null) {
                        i7 = ro3Var2.k(i5) + i2;
                    } else {
                        i7 = 0;
                    }
                    if (i13 + 2 < list.size()) {
                        i13 = i17;
                        z2 = true;
                    } else {
                        i13 = i17;
                        z2 = false;
                    }
                    int i18 = i13 - i15;
                    int i19 = i11;
                    long a3 = w03.a(i16, i8);
                    if (ro3Var2 == null) {
                        w03Var2 = null;
                    } else {
                        w03Var2 = new w03(w03.a(i7, i5));
                    }
                    int i20 = i7;
                    m62 b = dq1Var.b(z2, i18, a3, w03Var2, i19, i9, max, false, false);
                    if (b.a) {
                        int i21 = max + i3 + i9;
                        if (ro3Var2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        dq1Var.a(b, z3, i19, i21, i16, i18);
                        int i22 = i20 - i2;
                        i11 = i19 + 1;
                        if (b.b) {
                            i14 = i13;
                            i9 = i21;
                            break;
                        }
                        i10 = i;
                        i15 = i13;
                        i6 = i22;
                        i9 = i21;
                        i12 = 0;
                    } else {
                        i6 = i20;
                        i10 = i16;
                        i11 = i19;
                        i12 = max;
                    }
                    i14 = i13;
                    i8 = Integer.MAX_VALUE;
                }
                a = w03.a(i9 - i3, i14);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.f24
    public final int a(j23 j23Var, List list, int i) {
        ro3 ro3Var;
        List list2 = (List) yo0.n0(1, list);
        ro3 ro3Var2 = null;
        if (list2 != null) {
            ro3Var = (ro3) yo0.m0(list2);
        } else {
            ro3Var = null;
        }
        List list3 = (List) yo0.n0(2, list);
        if (list3 != null) {
            ro3Var2 = (ro3) yo0.m0(list3);
        }
        this.g.a(ro3Var, ro3Var2, sx0.b(0, 0, 0, i, 7));
        List list4 = (List) yo0.m0(list);
        if (list4 == null) {
            list4 = nt1.x;
        }
        int x0 = j23Var.x0(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int n = ((ro3) list4.get(i2)).n(i) + x0;
            int i6 = i2 + 1;
            if (i6 - i4 != this.f && i6 != list4.size()) {
                i5 += n;
            } else {
                i3 = Math.max(i3, (i5 + n) - x0);
                i4 = i2;
                i5 = 0;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b2 A[LOOP:1: B:106:0x03b0->B:107:0x03b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.f24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wo3 b(defpackage.xo3 r54, java.util.List r55, long r56) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s62.b(xo3, java.util.List, long):wo3");
    }

    @Override // defpackage.f24
    public final int c(j23 j23Var, List list, int i) {
        ro3 ro3Var;
        ro3 ro3Var2;
        int[] iArr;
        int i2;
        int i3;
        boolean z;
        int i4;
        w03 w03Var;
        List list2;
        long a;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        w03 w03Var2;
        boolean z3;
        s62 s62Var = this;
        List list3 = (List) yo0.n0(1, list);
        if (list3 != null) {
            ro3Var = (ro3) yo0.m0(list3);
        } else {
            ro3Var = null;
        }
        List list4 = (List) yo0.n0(2, list);
        if (list4 != null) {
            ro3Var2 = (ro3) yo0.m0(list4);
        } else {
            ro3Var2 = null;
        }
        s62Var.g.a(ro3Var, ro3Var2, sx0.b(0, 0, 0, i, 7));
        List list5 = (List) yo0.m0(list);
        if (list5 == null) {
            list5 = nt1.x;
        }
        int x0 = j23Var.x0(s62Var.c);
        int x02 = j23Var.x0(s62Var.e);
        long a2 = w03.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i9 = 0; i9 < size3; i9++) {
            ro3 ro3Var3 = (ro3) list5.get(i9);
            int k = ro3Var3.k(i);
            iArr2[i9] = k;
            iArr3[i9] = ro3Var3.O(k);
        }
        int size4 = list5.size();
        q62 q62Var = s62Var.g;
        if (Integer.MAX_VALUE < size4) {
            q62Var.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            q62Var.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += iArr2[i11];
        }
        int size5 = ((list5.size() - 1) * x0) + i10;
        if (size2 != 0) {
            int i12 = iArr3[0];
            int i13 = size2 - 1;
            int i14 = 0;
            if (1 <= i13) {
                int i15 = i12;
                int i16 = 1;
                while (true) {
                    int i17 = iArr3[i16];
                    if (i15 < i17) {
                        i15 = i17;
                    }
                    if (i16 == i13) {
                        break;
                    }
                    i16++;
                }
                i12 = i15;
            }
            if (size != 0) {
                int i18 = iArr2[0];
                int i19 = size - 1;
                if (1 <= i19) {
                    int i20 = 1;
                    while (true) {
                        int i21 = iArr2[i20];
                        if (i18 < i21) {
                            i18 = i21;
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                }
                int i22 = size5;
                int i23 = i12;
                while (i18 <= i22 && i23 != i) {
                    int i24 = (i18 + i22) / 2;
                    if (list5.isEmpty()) {
                        i4 = i22;
                        list2 = list5;
                        a = a2;
                        iArr = iArr3;
                    } else {
                        int i25 = i14;
                        iArr = iArr3;
                        dq1 dq1Var = new dq1(s62Var.f, q62Var, sx0.a(i25, i24, i25, Integer.MAX_VALUE), x0, x02);
                        ro3 ro3Var4 = (ro3) yo0.n0(i25, list5);
                        if (ro3Var4 != null) {
                            i2 = iArr[i25];
                        } else {
                            i2 = i25;
                        }
                        if (ro3Var4 != null) {
                            i3 = iArr2[i25];
                        } else {
                            i3 = 0;
                        }
                        if (list5.size() > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long a3 = w03.a(i24, Integer.MAX_VALUE);
                        i4 = i22;
                        if (ro3Var4 == null) {
                            w03Var = null;
                        } else {
                            w03Var = new w03(w03.a(i3, i2));
                        }
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 0;
                        if (dq1Var.b(z, 0, a3, w03Var, 0, 0, 0, false, false).b) {
                            q62Var.getClass();
                            list2 = list5;
                            a = a2;
                        } else {
                            int size6 = list5.size();
                            int i29 = i24;
                            int i30 = i3;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = i2;
                            int i34 = 0;
                            while (true) {
                                int i35 = i28;
                                if (i32 < size6) {
                                    int i36 = i29 - i30;
                                    int i37 = size6;
                                    int i38 = i32 + 1;
                                    i28 = Math.max(i35, i33);
                                    ro3 ro3Var5 = (ro3) yo0.n0(i38, list5);
                                    if (ro3Var5 != null) {
                                        i5 = iArr[i38];
                                    } else {
                                        i5 = 0;
                                    }
                                    if (ro3Var5 != null) {
                                        i6 = i38;
                                        i7 = iArr2[i38] + x0;
                                    } else {
                                        i6 = i38;
                                        i7 = 0;
                                    }
                                    int i39 = i31;
                                    if (i32 + 2 < list5.size()) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    int i40 = i6 - i39;
                                    long a4 = w03.a(i36, Integer.MAX_VALUE);
                                    if (ro3Var5 == null) {
                                        i8 = i7;
                                        list2 = list5;
                                        w03Var2 = null;
                                    } else {
                                        list2 = list5;
                                        i8 = i7;
                                        w03Var2 = new w03(w03.a(i7, i5));
                                    }
                                    m62 b = dq1Var.b(z2, i40, a4, w03Var2, i26, i27, i28, false, false);
                                    if (b.a) {
                                        int i41 = i28 + x02 + i27;
                                        int i42 = i26;
                                        if (ro3Var5 != null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        dq1Var.a(b, z3, i42, i41, i36, i40);
                                        int i43 = i8 - x0;
                                        i26 = i42 + 1;
                                        if (b.b) {
                                            i27 = i41;
                                            i34 = i6;
                                            break;
                                        }
                                        i8 = i43;
                                        i29 = i24;
                                        i27 = i41;
                                        i31 = i6;
                                        i28 = 0;
                                    } else {
                                        i29 = i36;
                                        i31 = i39;
                                    }
                                    list5 = list2;
                                    i33 = i5;
                                    size6 = i37;
                                    i32 = i6;
                                    i34 = i32;
                                    i30 = i8;
                                } else {
                                    list2 = list5;
                                    break;
                                }
                            }
                            a = w03.a(i27 - x02, i34);
                        }
                    }
                    int i44 = (int) (a >> 32);
                    int i45 = (int) (a & 4294967295L);
                    if (i44 <= i && i45 >= min) {
                        if (i44 < i) {
                            i22 = i24 - 1;
                            s62Var = this;
                        } else {
                            return i24;
                        }
                    } else {
                        i18 = i24 + 1;
                        if (i18 > i4) {
                            return i18;
                        }
                        s62Var = this;
                        i22 = i4;
                    }
                    size5 = i24;
                    iArr3 = iArr;
                    i14 = 0;
                    i23 = i44;
                    list5 = list2;
                }
                return size5;
            }
            qi2.e();
            return 0;
        }
        qi2.e();
        return 0;
    }

    @Override // defpackage.f24
    public final int d(j23 j23Var, List list, int i) {
        ro3 ro3Var;
        List list2 = (List) yo0.n0(1, list);
        ro3 ro3Var2 = null;
        if (list2 != null) {
            ro3Var = (ro3) yo0.m0(list2);
        } else {
            ro3Var = null;
        }
        List list3 = (List) yo0.n0(2, list);
        if (list3 != null) {
            ro3Var2 = (ro3) yo0.m0(list3);
        }
        this.g.a(ro3Var, ro3Var2, sx0.b(0, i, 0, 0, 13));
        List list4 = (List) yo0.m0(list);
        if (list4 == null) {
            list4 = nt1.x;
        }
        return k(list4, i, j23Var.x0(this.c), j23Var.x0(this.e), this.f, this.g);
    }

    @Override // defpackage.f24
    public final int e(j23 j23Var, List list, int i) {
        ro3 ro3Var;
        List list2 = (List) yo0.n0(1, list);
        ro3 ro3Var2 = null;
        if (list2 != null) {
            ro3Var = (ro3) yo0.m0(list2);
        } else {
            ro3Var = null;
        }
        List list3 = (List) yo0.n0(2, list);
        if (list3 != null) {
            ro3Var2 = (ro3) yo0.m0(list3);
        }
        this.g.a(ro3Var, ro3Var2, sx0.b(0, i, 0, 0, 13));
        List list4 = (List) yo0.m0(list);
        if (list4 == null) {
            list4 = nt1.x;
        }
        return k(list4, i, j23Var.x0(this.c), j23Var.x0(this.e), this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s62) {
                s62 s62Var = (s62) obj;
                if (!this.a.equals(s62Var.a) || !this.b.equals(s62Var.b) || !vm1.c(this.c, s62Var.c) || !this.d.equals(s62Var.d) || !vm1.c(this.e, s62Var.e) || this.f != s62Var.f || !a34.i(this.g, s62Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.w75
    public final void f(int i, int[] iArr, int[] iArr2, xo3 xo3Var) {
        this.a.j(xo3Var, i, iArr, xo3Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.w75
    public final long g(int i, int i2, int i3, boolean z) {
        z75 z75Var = y75.a;
        if (!z) {
            return sx0.a(i, i2, 0, i3);
        }
        return n03.p(i, i2, 0, i3);
    }

    @Override // defpackage.w75
    public final wo3 h(final em4[] em4VarArr, xo3 xo3Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final ia3 ia3Var = ia3.x;
        return xo3Var.L(i, i2, ot1.x, new ub2() { // from class: r62
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                int i6;
                x75 x75Var;
                o80 o80Var;
                dm4 dm4Var = (dm4) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i6 = iArr3[i3];
                } else {
                    i6 = 0;
                }
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    em4 em4Var = em4VarArr[i8];
                    em4Var.getClass();
                    Object w = em4Var.w();
                    if (w instanceof x75) {
                        x75Var = (x75) w;
                    } else {
                        x75Var = null;
                    }
                    if (x75Var == null || (o80Var = x75Var.c) == null) {
                        o80Var = this.d;
                    }
                    dm4Var.f(em4Var, iArr[i8 - i7], o80Var.i(i2, em4Var.R(), ia3Var) + i6, 0.0f);
                }
                return pn6.a;
            }
        });
    }

    public final int hashCode() {
        return this.g.hashCode() + qx1.c(Integer.MAX_VALUE, qx1.c(this.f, qx1.b(this.e, (this.d.hashCode() + qx1.b(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.w75
    public final int i(em4 em4Var) {
        return em4Var.R();
    }

    @Override // defpackage.w75
    public final int j(em4 em4Var) {
        return em4Var.S();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + vm1.d(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + vm1.d(this.e) + ", maxItemsInMainAxis=" + this.f + ", maxLines=2147483647, overflow=" + this.g + ")";
    }
}
