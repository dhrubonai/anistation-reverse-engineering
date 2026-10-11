package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y27 implements x27 {
    public final d12 a;
    public final bh6 b;
    public final gp0 c;
    public final ea2 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public y27(d12 d12Var, bh6 bh6Var, gp0 gp0Var, String str, int i) {
        int i2;
        this.a = d12Var;
        this.b = bh6Var;
        this.c = gp0Var;
        int i3 = gp0Var.a;
        int i4 = gp0Var.b;
        int i5 = (gp0Var.d * i3) / 8;
        int i6 = gp0Var.c;
        if (i6 == i5) {
            int i7 = i4 * i5;
            int i8 = i7 * 8;
            int max = Math.max(i5, i7 / 10);
            this.e = max;
            da2 da2Var = new da2();
            da2Var.n = qy3.n("audio/wav");
            da2Var.o = qy3.n(str);
            da2Var.i = i8;
            da2Var.j = i8;
            da2Var.p = max;
            da2Var.I = i3;
            int i9 = gp0Var.f;
            if (i9 == 0) {
                i2 = -1;
            } else {
                i2 = i9 << 2;
            }
            da2Var.J = i2;
            da2Var.K = i4;
            da2Var.L = i;
            this.d = new ea2(da2Var);
            return;
        }
        throw bj4.a("Expected block size: " + i5 + "; got: " + i6, null);
    }

    @Override // defpackage.x27
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.x27
    public final boolean b(c12 c12Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int f = this.b.f(c12Var, (int) Math.min(i2 - i, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        gp0 gp0Var = this.c;
        int i3 = gp0Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = gp0Var.b;
            String str = eq6.a;
            long e0 = j3 + eq6.e0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(e0, 1, i5, i6, null);
            this.h += i4;
            this.g = i6;
        }
        if (j2 <= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.x27
    public final void c(int i, long j) {
        a37 a37Var = new a37(this.c, 1, i, j);
        this.a.I(a37Var);
        ea2 ea2Var = this.d;
        bh6 bh6Var = this.b;
        bh6Var.g(ea2Var);
        bh6Var.d(a37Var.e);
    }
}
