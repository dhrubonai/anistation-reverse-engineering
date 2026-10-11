package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hq4 extends kf6 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final lo5 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final kf6[] k;
    public final Object[] l;
    public final HashMap m;

    public hq4(kf6[] kf6VarArr, Object[] objArr, lo5 lo5Var) {
        this.f = lo5Var;
        this.e = lo5Var.b.length;
        int length = kf6VarArr.length;
        this.k = kf6VarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = kf6VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            kf6 kf6Var = kf6VarArr[i];
            this.k[i4] = kf6Var;
            this.j[i4] = i2;
            this.i[i4] = i3;
            i2 += kf6Var.o();
            i3 += this.k[i4].h();
            this.m.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.kf6
    public final int a(boolean z) {
        if (this.e != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.f.b;
                if (iArr.length > 0) {
                    i = iArr[0];
                } else {
                    i = -1;
                }
            }
            do {
                kf6[] kf6VarArr = this.k;
                if (kf6VarArr[i].p()) {
                    i = q(i, z);
                } else {
                    return kf6VarArr[i].a(z) + this.j[i];
                }
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        int intValue;
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.m.get(obj2);
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != -1 && (b = this.k[intValue].b(obj3)) != -1) {
                return this.i[intValue] + b;
            }
        }
        return -1;
    }

    @Override // defpackage.kf6
    public final int c(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.f.b;
                if (iArr.length > 0) {
                    i = iArr[iArr.length - 1];
                } else {
                    i = -1;
                }
            } else {
                i = i2 - 1;
            }
            do {
                kf6[] kf6VarArr = this.k;
                if (kf6VarArr[i].p()) {
                    i = r(i, z);
                } else {
                    return kf6VarArr[i].c(z) + this.j[i];
                }
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.kf6
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int i3 = 0;
        int e = eq6.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        kf6[] kf6VarArr = this.k;
        kf6 kf6Var = kf6VarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int e2 = kf6Var.e(i5, i3, z);
        if (e2 != -1) {
            return i4 + e2;
        }
        int q = q(e, z);
        while (q != -1 && kf6VarArr[q].p()) {
            q = q(q, z);
        }
        if (q != -1) {
            return kf6VarArr[q].a(z) + iArr[q];
        }
        if (i2 != 2) {
            return -1;
        }
        return a(z);
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        int[] iArr = this.i;
        int e = eq6.e(iArr, i + 1, false, false);
        int i2 = this.j[e];
        this.k[e].f(i - iArr[e], hf6Var, z);
        hf6Var.c += i2;
        if (z) {
            Object obj = this.l[e];
            Object obj2 = hf6Var.b;
            obj2.getClass();
            hf6Var.b = Pair.create(obj, obj2);
        }
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final hf6 g(Object obj, hf6 hf6Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = this.j[intValue];
        this.k[intValue].g(obj3, hf6Var);
        hf6Var.c += i;
        hf6Var.b = obj;
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return this.h;
    }

    @Override // defpackage.kf6
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int i3 = 0;
        int e = eq6.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        kf6[] kf6VarArr = this.k;
        kf6 kf6Var = kf6VarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int k = kf6Var.k(i5, i3, z);
        if (k != -1) {
            return i4 + k;
        }
        int r = r(e, z);
        while (r != -1 && kf6VarArr[r].p()) {
            r = r(r, z);
        }
        if (r != -1) {
            return kf6VarArr[r].c(z) + iArr[r];
        }
        if (i2 != 2) {
            return -1;
        }
        return c(z);
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        int[] iArr = this.i;
        int e = eq6.e(iArr, i + 1, false, false);
        return Pair.create(this.l[e], this.k[e].l(i - iArr[e]));
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        int[] iArr = this.j;
        int e = eq6.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = this.i[e];
        this.k[e].m(i - i2, jf6Var, j);
        Object obj = this.l[e];
        Object obj2 = jf6.q;
        Object obj3 = jf6Var.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        jf6Var.a = obj;
        jf6Var.n += i3;
        jf6Var.o += i3;
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return this.g;
    }

    public final int q(int i, boolean z) {
        if (z) {
            lo5 lo5Var = this.f;
            int i2 = lo5Var.c[i] + 1;
            int[] iArr = lo5Var.b;
            if (i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }
        if (i >= this.e - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int r(int i, boolean z) {
        if (z) {
            lo5 lo5Var = this.f;
            int i2 = lo5Var.c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return lo5Var.b[i2];
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hq4(java.util.ArrayList r8, defpackage.lo5 r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            kf6[] r0 = new defpackage.kf6[r0]
            int r1 = r8.size()
            r2 = 0
            r3 = r2
            r4 = r3
        Ld:
            if (r4 >= r1) goto L21
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            rw3 r5 = (defpackage.rw3) r5
            int r6 = r3 + 1
            kf6 r5 = r5.b()
            r0[r3] = r5
            r3 = r6
            goto Ld
        L21:
            int r1 = r8.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r3 = r8.size()
            r4 = r2
        L2c:
            if (r4 >= r3) goto L40
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            rw3 r5 = (defpackage.rw3) r5
            int r6 = r2 + 1
            java.lang.Object r5 = r5.a()
            r1[r2] = r5
            r2 = r6
            goto L2c
        L40:
            r7.<init>(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq4.<init>(java.util.ArrayList, lo5):void");
    }
}
