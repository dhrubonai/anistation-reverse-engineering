package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bq1 implements xr4 {
    public final ub A;
    public final s7 B;
    public final s7 C;
    public final p47 D;
    public final p47 E;
    public final t7 F;
    public final t7 G;
    public final t7 H;
    public final q47 I;
    public final q47 J;
    public final long x;
    public final ud1 y;
    public final int z;

    public bq1(long j, ud1 ud1Var, ub ubVar) {
        int x0 = ud1Var.x0(48.0f);
        this.x = j;
        this.y = ud1Var;
        this.z = x0;
        this.A = ubVar;
        int x02 = ud1Var.x0(Float.intBitsToFloat((int) (j >> 32)));
        w50 w50Var = pk2.K;
        this.B = new s7(w50Var, w50Var, x02);
        w50 w50Var2 = pk2.M;
        this.C = new s7(w50Var2, w50Var2, x02);
        this.D = new p47(zz.d);
        this.E = new p47(zz.e);
        int x03 = ud1Var.x0(Float.intBitsToFloat((int) (j & 4294967295L)));
        x50 x50Var = pk2.H;
        x50 x50Var2 = pk2.J;
        this.F = new t7(x50Var, x50Var2, x03);
        this.G = new t7(x50Var2, x50Var, x03);
        this.H = new t7(pk2.I, x50Var, x03);
        this.I = new q47(x50Var, x0);
        this.J = new q47(x50Var2, x0);
    }

    @Override // defpackage.xr4
    public final long b(g13 g13Var, long j, ia3 ia3Var, long j2) {
        p47 p47Var;
        g13 g13Var2;
        long j3;
        char c;
        int i;
        q47 q47Var;
        int i2;
        int i3;
        char c2 = ' ';
        int i4 = (int) (j >> 32);
        if (((int) (g13Var.a() >> 32)) < i4 / 2) {
            p47Var = this.D;
        } else {
            p47Var = this.E;
        }
        boolean z = true;
        List I = te4.I(this.B, this.C, p47Var);
        int size = I.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                ox3 ox3Var = (ox3) I.get(i5);
                int i6 = (int) (j2 >> c2);
                int i7 = size;
                c = c2;
                j3 = j;
                int i8 = i5;
                g13Var2 = g13Var;
                i = ox3Var.a(g13Var2, j3, i6, ia3Var);
                if (i8 == I.size() - 1 || (i >= 0 && i6 + i <= i4)) {
                    break;
                }
                i5 = i8 + 1;
                size = i7;
                c2 = c;
            } else {
                g13Var2 = g13Var;
                j3 = j;
                c = c2;
                i = 0;
                break;
            }
        }
        int i9 = (int) (j3 & 4294967295L);
        if (((int) (g13Var2.a() & 4294967295L)) < i9 / 2) {
            q47Var = this.I;
        } else {
            q47Var = this.J;
        }
        List I2 = te4.I(this.F, this.G, this.H, q47Var);
        int size2 = I2.size();
        int i10 = 0;
        while (i10 < size2) {
            boolean z2 = z;
            int i11 = (int) (j2 & 4294967295L);
            int a = ((px3) I2.get(i10)).a(g13Var2, j3, i11);
            if (i10 != I2.size() - 1 && (a < (i3 = this.z) || i11 + a > i9 - i3)) {
                i10++;
                z = z2;
            } else {
                i2 = a;
                break;
            }
        }
        i2 = 0;
        long j4 = (i << c) | (i2 & 4294967295L);
        this.A.invoke(g13Var2, wk6.d(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bq1) {
            bq1 bq1Var = (bq1) obj;
            if (this.x == bq1Var.x && a34.i(this.y, bq1Var.y) && this.z == bq1Var.z && this.A == bq1Var.A) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() + qx1.c(this.z, (this.y.hashCode() + (Long.hashCode(this.x) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) xm1.a(this.x)) + ", density=" + this.y + ", verticalMargin=" + this.z + ", onPositionCalculated=" + this.A + ')';
    }
}
