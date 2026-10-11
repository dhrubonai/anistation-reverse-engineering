package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sl0 {
    public final cz a;
    public final bh6 b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public sl0(int i, cz czVar, bh6 bh6Var, boolean z) {
        int i2;
        int i3;
        int i4 = czVar.d;
        this.a = czVar;
        this.f = z;
        int a = czVar.a();
        boolean z2 = true;
        if (a != 1 && a != 2) {
            z2 = false;
        }
        io3.n(z2);
        if (a == 2) {
            i2 = 1667497984;
        } else {
            i2 = 1651965952;
        }
        int i5 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = i2 | i5;
        long j = czVar.b * 1000000;
        long j2 = czVar.c;
        String str = eq6.a;
        this.e = eq6.e0(i4, j, j2, RoundingMode.DOWN);
        this.b = bh6Var;
        if (a == 2) {
            i3 = i5 | 1650720768;
        } else {
            i3 = -1;
        }
        this.d = i3;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i4;
    }

    public final jf5 a(int i) {
        return new jf5((this.e / this.g) * this.o[i], this.n[i]);
    }

    public final gf5 b(long j) {
        if (this.l == 0) {
            jf5 jf5Var = new jf5(0L, this.m);
            return new gf5(jf5Var, jf5Var);
        }
        int i = (int) (j / (this.e / this.g));
        int e = eq6.e(this.o, i, true, true);
        if (this.o[e] == i) {
            jf5 a = a(e);
            return new gf5(a, a);
        }
        jf5 a2 = a(e);
        int i2 = e + 1;
        if (i2 < this.n.length) {
            return new gf5(a2, a(i2));
        }
        return new gf5(a2, a2);
    }
}
