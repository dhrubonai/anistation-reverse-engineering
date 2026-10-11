package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fp5 extends kf6 {
    public final nw2 e;
    public final int[] f;
    public final int[] g;
    public final HashMap h;

    public fp5(List list) {
        int size;
        int size2 = list.size();
        this.e = nw2.o(list);
        this.f = new int[size2];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size2) {
                break;
            }
            bp5 bp5Var = (bp5) list.get(i);
            this.f[i] = i2;
            if (!bp5Var.p.isEmpty()) {
                i3 = bp5Var.p.size();
            }
            i2 += i3;
            i++;
        }
        this.g = new int[i2];
        this.h = new HashMap();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            bp5 bp5Var2 = (bp5) list.get(i5);
            int i6 = 0;
            while (true) {
                if (bp5Var2.p.isEmpty()) {
                    size = 1;
                } else {
                    size = bp5Var2.p.size();
                }
                if (i6 < size) {
                    this.h.put(bp5Var2.a(i6), Integer.valueOf(i4));
                    this.g[i4] = i5;
                    i4++;
                    i6++;
                }
            }
        }
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        Integer num = (Integer) this.h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        int i2 = this.g[i];
        int i3 = i - this.f[i2];
        bp5 bp5Var = (bp5) this.e.get(i2);
        nw2 nw2Var = bp5Var.p;
        if (nw2Var.isEmpty()) {
            Object obj = bp5Var.a;
            long j = bp5Var.n;
            hf6Var.h(obj, obj, i2, bp5Var.m + j, -j, y5.c, bp5Var.o);
            return hf6Var;
        }
        dp5 dp5Var = (dp5) nw2Var.get(i3);
        Object obj2 = dp5Var.a;
        hf6Var.h(obj2, Pair.create(bp5Var.a, obj2), i2, dp5Var.b, bp5Var.q[i3], dp5Var.c, dp5Var.d);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final hf6 g(Object obj, hf6 hf6Var) {
        Integer num = (Integer) this.h.get(obj);
        num.getClass();
        f(num.intValue(), hf6Var, true);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return this.g.length;
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        int i2 = this.g[i];
        return ((bp5) this.e.get(i2)).a(i - this.f[i2]);
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        int size;
        bp5 bp5Var = (bp5) this.e.get(i);
        int i2 = this.f[i];
        nw2 nw2Var = bp5Var.p;
        if (nw2Var.isEmpty()) {
            size = 1;
        } else {
            size = nw2Var.size();
        }
        jf6Var.b(bp5Var.a, bp5Var.c, bp5Var.e, bp5Var.g, bp5Var.h, bp5Var.i, bp5Var.j, bp5Var.k, bp5Var.f, bp5Var.l, bp5Var.m, i2, (i2 + size) - 1, bp5Var.n);
        jf6Var.k = bp5Var.o;
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return this.e.size();
    }
}
