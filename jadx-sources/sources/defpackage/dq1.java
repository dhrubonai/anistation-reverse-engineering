package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dq1 {
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final Object e;

    public dq1(int i, q62 q62Var, long j, int i2, int i3) {
        this.a = i;
        this.e = q62Var;
        this.b = j;
        this.c = i2;
        this.d = i3;
    }

    public n03 a(m62 m62Var, boolean z, int i, int i2, int i3, int i4) {
        if (m62Var.b) {
            ((q62) this.e).getClass();
            return null;
        }
        return null;
    }

    public m62 b(boolean z, int i, long j, w03 w03Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        q62 q62Var = (q62) this.e;
        int i5 = i3 + i4;
        if (w03Var == null) {
            return new m62(true, true);
        }
        long j2 = w03Var.a;
        q62Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new m62(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            if (z2) {
                return new m62(true, true);
            }
            return new m62(true, b(z, 0, w03.a(rx0.h(this.b), (((int) (j & 4294967295L)) - this.d) - i4), new w03(w03.a(((int) (j2 >> 32)) - this.c, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        return new m62(false, false);
    }

    public dq1(String str, int i, int i2, int i3, long j) {
        this.e = str;
        this.c = i;
        this.a = i2;
        this.d = i3;
        this.b = j;
    }
}
