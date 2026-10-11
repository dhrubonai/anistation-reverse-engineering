package j1;

import android.util.Pair;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f1 extends c1.e1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f5735k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f5736b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.y0 f5737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5738d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5739e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5740f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5741g;

    /* renamed from: h, reason: collision with root package name */
    public final c1.e1[] f5742h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f5743i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5744j;

    public f1(c1.e1[] e1VarArr, Object[] objArr, v1.y0 y0Var) {
        this.f5737c = y0Var;
        this.f5736b = y0Var.f10570b.length;
        int length = e1VarArr.length;
        this.f5742h = e1VarArr;
        this.f5740f = new int[length];
        this.f5741g = new int[length];
        this.f5743i = objArr;
        this.f5744j = new HashMap();
        int length2 = e1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length2) {
            c1.e1 e1Var = e1VarArr[i10];
            this.f5742h[i13] = e1Var;
            this.f5741g[i13] = i11;
            this.f5740f[i13] = i12;
            i11 += e1Var.p();
            i12 += this.f5742h[i13].i();
            this.f5744j.put(objArr[i13], Integer.valueOf(i13));
            i10++;
            i13++;
        }
        this.f5738d = i11;
        this.f5739e = i12;
    }

    @Override // c1.e1
    public final int a(boolean z9) {
        if (this.f5736b == 0) {
            return -1;
        }
        int i10 = 0;
        if (z9) {
            int[] iArr = this.f5737c.f10570b;
            if (iArr.length > 0) {
                i10 = iArr[0];
            } else {
                i10 = -1;
            }
        }
        do {
            c1.e1[] e1VarArr = this.f5742h;
            if (e1VarArr[i10].q()) {
                i10 = r(i10, z9);
            } else {
                return this.f5741g[i10] + e1VarArr[i10].a(z9);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // c1.e1
    public final int b(Object obj) {
        int intValue;
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f5744j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b10 = this.f5742h[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f5740f[intValue] + b10;
    }

    @Override // c1.e1
    public final int c(boolean z9) {
        int i10;
        int i11 = this.f5736b;
        if (i11 == 0) {
            return -1;
        }
        if (z9) {
            int[] iArr = this.f5737c.f10570b;
            if (iArr.length > 0) {
                i10 = iArr[iArr.length - 1];
            } else {
                i10 = -1;
            }
        } else {
            i10 = i11 - 1;
        }
        do {
            c1.e1[] e1VarArr = this.f5742h;
            if (e1VarArr[i10].q()) {
                i10 = s(i10, z9);
            } else {
                return this.f5741g[i10] + e1VarArr[i10].c(z9);
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // c1.e1
    public final int e(int i10, int i11, boolean z9) {
        int[] iArr = this.f5741g;
        int i12 = 0;
        int e10 = f1.b0.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e10];
        c1.e1[] e1VarArr = this.f5742h;
        c1.e1 e1Var = e1VarArr[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e11 = e1Var.e(i14, i12, z9);
        if (e11 != -1) {
            return i13 + e11;
        }
        int r8 = r(e10, z9);
        while (r8 != -1 && e1VarArr[r8].q()) {
            r8 = r(r8, z9);
        }
        if (r8 != -1) {
            return e1VarArr[r8].a(z9) + iArr[r8];
        }
        if (i11 != 2) {
            return -1;
        }
        return a(z9);
    }

    @Override // c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        int[] iArr = this.f5740f;
        int e10 = f1.b0.e(iArr, i10 + 1, false, false);
        int i11 = this.f5741g[e10];
        this.f5742h[e10].g(i10 - iArr[e10], c1Var, z9);
        c1Var.f1643c += i11;
        if (z9) {
            Object obj = this.f5743i[e10];
            Object obj2 = c1Var.f1642b;
            obj2.getClass();
            c1Var.f1642b = Pair.create(obj, obj2);
        }
        return c1Var;
    }

    @Override // c1.e1
    public final c1.c1 h(Object obj, c1.c1 c1Var) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f5744j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i10 = this.f5741g[intValue];
        this.f5742h[intValue].h(obj3, c1Var);
        c1Var.f1643c += i10;
        c1Var.f1642b = obj;
        return c1Var;
    }

    @Override // c1.e1
    public final int i() {
        return this.f5739e;
    }

    @Override // c1.e1
    public final int l(int i10, int i11, boolean z9) {
        int[] iArr = this.f5741g;
        int i12 = 0;
        int e10 = f1.b0.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e10];
        c1.e1[] e1VarArr = this.f5742h;
        c1.e1 e1Var = e1VarArr[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = e1Var.l(i14, i12, z9);
        if (l10 != -1) {
            return i13 + l10;
        }
        int s9 = s(e10, z9);
        while (s9 != -1 && e1VarArr[s9].q()) {
            s9 = s(s9, z9);
        }
        if (s9 != -1) {
            return e1VarArr[s9].c(z9) + iArr[s9];
        }
        if (i11 != 2) {
            return -1;
        }
        return c(z9);
    }

    @Override // c1.e1
    public final Object m(int i10) {
        int[] iArr = this.f5740f;
        int e10 = f1.b0.e(iArr, i10 + 1, false, false);
        return Pair.create(this.f5743i[e10], this.f5742h[e10].m(i10 - iArr[e10]));
    }

    @Override // c1.e1
    public final c1.d1 o(int i10, c1.d1 d1Var, long j4) {
        int[] iArr = this.f5741g;
        int e10 = f1.b0.e(iArr, i10 + 1, false, false);
        int i11 = iArr[e10];
        int i12 = this.f5740f[e10];
        this.f5742h[e10].o(i10 - i11, d1Var, j4);
        Object obj = this.f5743i[e10];
        if (!c1.d1.f1653r.equals(d1Var.f1655a)) {
            obj = Pair.create(obj, d1Var.f1655a);
        }
        d1Var.f1655a = obj;
        d1Var.o += i12;
        d1Var.f1669p += i12;
        return d1Var;
    }

    @Override // c1.e1
    public final int p() {
        return this.f5738d;
    }

    public final int r(int i10, boolean z9) {
        if (z9) {
            v1.y0 y0Var = this.f5737c;
            int i11 = y0Var.f10571c[i10] + 1;
            int[] iArr = y0Var.f10570b;
            if (i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }
        if (i10 >= this.f5736b - 1) {
            return -1;
        }
        return i10 + 1;
    }

    public final int s(int i10, boolean z9) {
        if (z9) {
            v1.y0 y0Var = this.f5737c;
            int i11 = y0Var.f10571c[i10] - 1;
            if (i11 < 0) {
                return -1;
            }
            return y0Var.f10570b[i11];
        }
        if (i10 <= 0) {
            return -1;
        }
        return (-1) + i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1(java.util.List r7, v1.y0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            c1.e1[] r0 = new c1.e1[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            j1.s0 r4 = (j1.s0) r4
            int r5 = r3 + 1
            c1.e1 r4 = r4.a()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            j1.s0 r3 = (j1.s0) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.getUid()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f1.<init>(java.util.List, v1.y0):void");
    }
}
