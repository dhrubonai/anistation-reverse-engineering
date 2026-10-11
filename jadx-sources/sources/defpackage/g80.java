package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g80 implements f24 {
    public final /* synthetic */ do5 a;
    public final /* synthetic */ sb2 b;

    public g80(do5 do5Var, sb2 sb2Var) {
        this.a = do5Var;
        this.b = sb2Var;
    }

    @Override // defpackage.f24
    public final wo3 b(xo3 xo3Var, List list, long j) {
        Integer valueOf;
        final int i;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i2 = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int h = rx0.h(j);
        final int g = rx0.g(j);
        long a = rx0.a(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((ro3) list4.get(i3)).p(a));
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList3.add(((ro3) list2.get(i4)).p(a));
        }
        if (arrayList3.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((em4) arrayList3.get(0)).y);
            int size3 = arrayList3.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((em4) arrayList3.get(i2)).y);
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        long a2 = rx0.a(a, 0, 0, 0, g - i, 7);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList4.add(((ro3) list3.get(i5)).p(a2));
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size5 = list5.size();
        for (int i6 = 0; i6 < size5; i6++) {
            arrayList5.add(((ro3) list5.get(i6)).p(a));
        }
        final do5 do5Var = this.a;
        final sb2 sb2Var = this.b;
        return xo3Var.L(h, g, ot1.x, new ub2() { // from class: f80
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                Integer valueOf3;
                int i7;
                Integer valueOf4;
                int i8;
                Integer valueOf5;
                int i9;
                int i10;
                dm4 dm4Var = (dm4) obj;
                ArrayList arrayList6 = arrayList2;
                if (arrayList6.isEmpty()) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(((em4) arrayList6.get(0)).x);
                    int size6 = arrayList6.size() - 1;
                    if (1 <= size6) {
                        int i11 = 1;
                        while (true) {
                            Integer valueOf6 = Integer.valueOf(((em4) arrayList6.get(i11)).x);
                            if (valueOf6.compareTo(valueOf3) > 0) {
                                valueOf3 = valueOf6;
                            }
                            if (i11 == size6) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (valueOf3 != null) {
                    i7 = valueOf3.intValue();
                } else {
                    i7 = 0;
                }
                int i12 = h;
                int max = Math.max(0, (i12 - i7) / 2);
                ArrayList arrayList7 = arrayList5;
                if (arrayList7.isEmpty()) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf(((em4) arrayList7.get(0)).x);
                    int size7 = arrayList7.size() - 1;
                    if (1 <= size7) {
                        int i13 = 1;
                        while (true) {
                            Integer valueOf7 = Integer.valueOf(((em4) arrayList7.get(i13)).x);
                            if (valueOf7.compareTo(valueOf4) > 0) {
                                valueOf4 = valueOf7;
                            }
                            if (i13 == size7) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
                if (valueOf4 != null) {
                    i8 = valueOf4.intValue();
                } else {
                    i8 = 0;
                }
                if (arrayList7.isEmpty()) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf(((em4) arrayList7.get(0)).y);
                    int size8 = arrayList7.size() - 1;
                    if (1 <= size8) {
                        int i14 = 1;
                        while (true) {
                            Integer valueOf8 = Integer.valueOf(((em4) arrayList7.get(i14)).y);
                            if (valueOf8.compareTo(valueOf5) > 0) {
                                valueOf5 = valueOf8;
                            }
                            if (i14 == size8) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
                if (valueOf5 != null) {
                    i9 = valueOf5.intValue();
                } else {
                    i9 = 0;
                }
                int i15 = (i12 - i8) / 2;
                int ordinal = do5Var.c().ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        i10 = io3.h0(((Number) sb2Var.invoke()).floatValue());
                    } else {
                        ze0.l();
                        return null;
                    }
                } else {
                    i10 = g;
                }
                int i16 = i10 - i9;
                ArrayList arrayList8 = arrayList4;
                int size9 = arrayList8.size();
                for (int i17 = 0; i17 < size9; i17++) {
                    dm4.j(dm4Var, (em4) arrayList8.get(i17), 0, i);
                }
                ArrayList arrayList9 = arrayList3;
                int size10 = arrayList9.size();
                for (int i18 = 0; i18 < size10; i18++) {
                    dm4.j(dm4Var, (em4) arrayList9.get(i18), 0, 0);
                }
                int size11 = arrayList6.size();
                for (int i19 = 0; i19 < size11; i19++) {
                    dm4.j(dm4Var, (em4) arrayList6.get(i19), max, 0);
                }
                int size12 = arrayList7.size();
                for (int i20 = 0; i20 < size12; i20++) {
                    dm4.j(dm4Var, (em4) arrayList7.get(i20), i15, i16);
                }
                return pn6.a;
            }
        });
    }
}
