package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p66 implements f24 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ q66 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ld5 e;

    public p66(float f, float f2, q66 q66Var, int i, ld5 ld5Var) {
        this.a = f;
        this.b = f2;
        this.c = q66Var;
        this.d = i;
        this.e = ld5Var;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [t05, java.lang.Object] */
    @Override // defpackage.f24
    public final wo3 b(final xo3 xo3Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f = this.a;
        int x0 = xo3Var.x0(f);
        int size = list2.size();
        Integer num = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((ro3) list2.get(i)).c(Integer.MAX_VALUE)));
        }
        final int intValue = num.intValue();
        int i2 = x0 * 2;
        float f2 = this.b;
        long a = rx0.a(j, xo3Var.x0(f2), 0, intValue, intValue, 2);
        final ?? obj = new Object();
        obj.x = f;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((ro3) list2.get(i3)).p(a));
        }
        int[] iArr = new int[16];
        int size4 = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size4) {
            List list4 = list2;
            int n = ((ro3) list2.get(i4)).n(Integer.MAX_VALUE);
            int i6 = i5 + 1;
            int i7 = x0;
            if (iArr.length < i6) {
                iArr = Arrays.copyOf(iArr, Math.max(i6, (iArr.length * 3) / 2));
            }
            iArr[i5] = n;
            i4++;
            i5 = i6;
            list2 = list4;
            x0 = i7;
        }
        final int i8 = x0;
        final ArrayList arrayList3 = new ArrayList(size);
        int i9 = i2;
        int i10 = 0;
        while (i10 < size) {
            float f3 = ((vm1) jf7.x(new vm1(f2), new vm1(xo3Var.T(((em4) arrayList2.get(i10)).x)))).x;
            i9 += xo3Var.x0(f3);
            if (i10 >= 0 && i10 < i5) {
                int[] iArr2 = iArr;
                float f4 = ((vm1) jf7.x(new vm1(xo3Var.T(iArr[i10]) - (i66.b * 2.0f)), new vm1(24.0f))).x;
                float f5 = obj.x;
                j66 j66Var = new j66(f5, f3, f4);
                obj.x = f5 + f3;
                arrayList3.add(j66Var);
                i10++;
                iArr = iArr2;
            } else {
                ze0.g("Index must be between 0 and size");
                return null;
            }
        }
        this.c.a.setValue(arrayList3);
        ArrayList arrayList4 = arrayList2;
        final ArrayList arrayList5 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i11 = 0;
        while (i11 < size5) {
            ro3 ro3Var = (ro3) list3.get(i11);
            int x02 = xo3Var.x0(((j66) arrayList3.get(this.d)).c);
            if (x02 < 0 || intValue < 0) {
                gz2.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
            }
            List list5 = list3;
            ArrayList arrayList6 = arrayList4;
            arrayList5.add(ro3Var.p(sx0.h(0, x02, 0, intValue)));
            i11++;
            list3 = list5;
            arrayList4 = arrayList6;
        }
        final ArrayList arrayList7 = arrayList4;
        final float f6 = this.a;
        final ld5 ld5Var = this.e;
        final int i12 = this.d;
        return xo3Var.L(i9, intValue, ot1.x, new ub2() { // from class: o66
            @Override // defpackage.ub2
            public final Object invoke(Object obj2) {
                xo3 xo3Var2;
                ArrayList arrayList8;
                int i13;
                dm4 dm4Var = (dm4) obj2;
                t05 t05Var = t05.this;
                t05Var.x = f6;
                ArrayList arrayList9 = arrayList7;
                int size6 = arrayList9.size();
                int i14 = 0;
                while (true) {
                    xo3Var2 = xo3Var;
                    arrayList8 = arrayList3;
                    if (i14 >= size6) {
                        break;
                    }
                    dm4.j(dm4Var, (em4) arrayList9.get(i14), xo3Var2.x0(t05Var.x), 0);
                    t05Var.x += ((j66) arrayList8.get(i14)).b;
                    i14++;
                }
                ArrayList arrayList10 = arrayList5;
                int size7 = arrayList10.size();
                int i15 = 0;
                while (true) {
                    i13 = i12;
                    if (i15 >= size7) {
                        break;
                    }
                    em4 em4Var = (em4) arrayList10.get(i15);
                    dm4.j(dm4Var, em4Var, Math.max(0, (xo3Var2.x0(((j66) arrayList8.get(i13)).b) - em4Var.x) / 2), intValue - em4Var.y);
                    i15++;
                }
                ld5 ld5Var2 = ld5Var;
                yc5 yc5Var = ld5Var2.a;
                Integer num2 = ld5Var2.d;
                if (num2 == null || num2.intValue() != i13) {
                    ld5Var2.d = Integer.valueOf(i13);
                    j66 j66Var2 = (j66) yo0.n0(i13, arrayList8);
                    if (j66Var2 != null) {
                        j66 j66Var3 = (j66) yo0.r0(arrayList8);
                        int x03 = xo3Var2.x0(j66Var3.a + j66Var3.b) + i8;
                        int h = x03 - yc5Var.f.h();
                        int x04 = xo3Var2.x0(j66Var2.a) - ((h / 2) - (xo3Var2.x0(j66Var2.b) / 2));
                        int i16 = x03 - h;
                        if (i16 < 0) {
                            i16 = 0;
                        }
                        int C = db.C(x04, 0, i16);
                        if (yc5Var.a.h() != C) {
                            tl7.z(ld5Var2.b, null, null, new jr(ld5Var2, C, null, (byte) 2), 3);
                        }
                    }
                }
                return pn6.a;
            }
        });
    }
}
