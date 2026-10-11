package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class if6 extends kf6 {
    public final o15 e;
    public final o15 f;
    public final int[] g;
    public final int[] h;
    public final rw2 i;

    public if6(o15 o15Var, o15 o15Var2, int[] iArr) {
        boolean z;
        int i;
        int i2;
        o15 o15Var3 = o15Var;
        int i3 = o15Var3.A;
        int i4 = o15Var3.A;
        int i5 = 1;
        if (i3 == iArr.length) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.h[iArr[i6]] = i6;
        }
        jw2 k = nw2.k();
        int i7 = 0;
        while (i7 < i4) {
            jf6 jf6Var = (jf6) o15Var3.get(i7);
            if (i4 > i5 && Objects.equals(jf6Var.a, jf6.q)) {
                jf6 jf6Var2 = new jf6();
                i = i7;
                i2 = i4;
                jf6Var2.b(new Object(), jf6Var.c, jf6Var.d, jf6Var.e, jf6Var.f, jf6Var.g, jf6Var.h, jf6Var.i, jf6Var.j, jf6Var.l, jf6Var.m, jf6Var.n, jf6Var.o, jf6Var.p);
                jf6Var2.k = jf6Var.k;
                jf6Var2.b = jf6Var.b;
                jf6Var = jf6Var2;
            } else {
                i = i7;
                i2 = i4;
            }
            k.c(jf6Var);
            i7 = i + 1;
            o15Var3 = o15Var;
            i4 = i2;
            i5 = 1;
        }
        this.e = k.g();
        jw2 k2 = nw2.k();
        HashMap hashMap = new HashMap(t80.s(o15Var2.A));
        for (int i8 = 0; i8 < o15Var2.A; i8++) {
            hf6 hf6Var = (hf6) o15Var2.get(i8);
            if (hf6Var.b == null) {
                hf6 hf6Var2 = new hf6();
                hf6Var2.h(hf6Var.a, new Object(), hf6Var.c, hf6Var.d, hf6Var.e, hf6Var.g, hf6Var.f);
                hf6Var = hf6Var2;
            }
            k2.c(hf6Var);
            Object obj = hf6Var.b;
            obj.getClass();
            if (!hashMap.containsKey(obj)) {
                hashMap.put(obj, Integer.valueOf(i8));
            }
        }
        this.f = k2.g();
        this.i = rw2.b(hashMap);
    }

    @Override // defpackage.kf6
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (!z) {
            return 0;
        }
        return this.g[0];
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        Integer num = (Integer) this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.kf6
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        o15 o15Var = this.e;
        if (z) {
            return this.g[o15Var.A - 1];
        }
        return o15Var.A - 1;
    }

    @Override // defpackage.kf6
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (z) {
            return this.g[this.h[i] + 1];
        }
        return i + 1;
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        hf6 hf6Var2 = (hf6) this.f.get(i);
        hf6Var.h(hf6Var2.a, hf6Var2.b, hf6Var2.c, hf6Var2.d, hf6Var2.e, hf6Var2.g, hf6Var2.f);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return this.f.A;
    }

    @Override // defpackage.kf6
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (z) {
            return this.g[this.h[i] - 1];
        }
        return i - 1;
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        Object obj = ((hf6) this.f.get(i)).b;
        obj.getClass();
        return obj;
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        jf6 jf6Var2 = (jf6) this.e.get(i);
        jf6Var.b(jf6Var2.a, jf6Var2.c, jf6Var2.d, jf6Var2.e, jf6Var2.f, jf6Var2.g, jf6Var2.h, jf6Var2.i, jf6Var2.j, jf6Var2.l, jf6Var2.m, jf6Var2.n, jf6Var2.o, jf6Var2.p);
        jf6Var.k = jf6Var2.k;
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return this.e.A;
    }
}
