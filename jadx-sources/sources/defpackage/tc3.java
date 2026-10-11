package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tc3 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public tc3(bc3 bc3Var) {
        this.g = bc3Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new rc3(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = nt1.x;
    }

    public static tc3 a(tc3 tc3Var, int i, qb0 qb0Var, l35 l35Var, int i2) {
        if ((i2 & 1) != 0) {
            i = tc3Var.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            qb0Var = (qb0) tc3Var.h;
        }
        qb0 qb0Var2 = qb0Var;
        if ((i2 & 4) != 0) {
            l35Var = (l35) tc3Var.i;
        }
        l35 l35Var2 = l35Var;
        int i4 = tc3Var.c;
        int i5 = tc3Var.d;
        int i6 = tc3Var.e;
        l35Var2.getClass();
        return new tc3((bz4) tc3Var.g, tc3Var.a, i3, qb0Var2, l35Var2, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r9 < r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.rb1 c(int r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc3.c(int):rb1");
    }

    public int d(int i) {
        int i2;
        int i3;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            hz2.a("ItemIndex > total count");
        }
        if (!((bc3) this.g).w) {
            return i / this.f;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        te4.M(arrayList.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = ((rc3) arrayList.get(i2)).a - i;
                if (i6 < 0) {
                    i5 = i2 + 1;
                } else {
                    if (i6 <= 0) {
                        break;
                    }
                    i4 = i2 - 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int b = b() * i2;
        int i7 = ((rc3) arrayList.get(i2)).a;
        if (i7 > i) {
            hz2.a("currentItemIndex > itemIndex");
        }
        int i8 = 0;
        while (i7 < i) {
            int i9 = i7 + 1;
            int g = g(i7);
            i8 += g;
            int i10 = this.f;
            if (i8 >= i10) {
                if (i8 == i10) {
                    b++;
                    i8 = 0;
                } else {
                    b++;
                    i8 = g;
                }
            }
            if (b % b() == 0 && b / b() >= arrayList.size()) {
                if (i8 > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                arrayList.add(new rc3(i9 - i3, 0));
            }
            i7 = i9;
        }
        if (g(i) + i8 > this.f) {
            return b + 1;
        }
        return b;
    }

    public int e() {
        return ((bc3) this.g).v.y;
    }

    public p45 f(l35 l35Var) {
        qb0 qb0Var = (qb0) this.h;
        l35Var.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            this.f++;
            if (qb0Var != null) {
                yw1 yw1Var = (yw1) qb0Var.z;
                ws2 ws2Var = l35Var.a;
                yw1Var.getClass();
                ws2Var.getClass();
                ws2 ws2Var2 = yw1Var.b.h;
                if (ws2Var.e == ws2Var2.e && a34.i(ws2Var.d, ws2Var2.d)) {
                    if (this.f != 1) {
                        ze0.h("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                        return null;
                    }
                } else {
                    ze0.h("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                    return null;
                }
            }
            int i2 = i + 1;
            tc3 a = a(this, i2, null, l35Var, 58);
            r13 r13Var = (r13) arrayList.get(i);
            p45 a2 = r13Var.a(a);
            if (a2 != null) {
                if (qb0Var != null && i2 < arrayList.size() && a.f != 1) {
                    ze0.h("network interceptor ", r13Var, " must call proceed() exactly once");
                    return null;
                }
                if (a2.D != null) {
                    return a2;
                }
                ze0.h("interceptor ", r13Var, " returned a response with no body");
                return null;
            }
            throw new NullPointerException("interceptor " + r13Var + " returned null");
        }
        ze0.m("Check failed.");
        return null;
    }

    public int g(int i) {
        sc3.b = this.f;
        g23 i2 = ((bc3) this.g).v.i(i);
        int i3 = i - i2.a;
        return (int) ((li2) ((yb3) i2.c).b.invoke(sc3.a, Integer.valueOf(i3))).a;
    }

    public tc3(bz4 bz4Var, ArrayList arrayList, int i, qb0 qb0Var, l35 l35Var, int i2, int i3, int i4) {
        l35Var.getClass();
        this.g = bz4Var;
        this.a = arrayList;
        this.b = i;
        this.h = qb0Var;
        this.i = l35Var;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
