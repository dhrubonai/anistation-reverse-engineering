package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z75 implements vo3, w75 {
    public final ur a;
    public final x50 b;

    public z75(ur urVar, x50 x50Var) {
        this.a = urVar;
        this.b = x50Var;
    }

    @Override // defpackage.vo3
    public final int a(j23 j23Var, List list, int i) {
        int x0 = j23Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ro3 ro3Var = (ro3) list.get(i4);
            float I = nx7.I(nx7.H(ro3Var));
            int n = ro3Var.n(i);
            if (I == 0.0f) {
                i3 += n;
            } else if (I > 0.0f) {
                f += I;
                i2 = Math.max(i2, Math.round(n / I));
            }
        }
        return ((list.size() - 1) * x0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        return h98.G(this, rx0.j(j), rx0.i(j), rx0.h(j), rx0.g(j), xo3Var.x0(this.a.a()), xo3Var, list, new em4[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.vo3
    public final int c(j23 j23Var, List list, int i) {
        int x0 = j23Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            ro3 ro3Var = (ro3) list.get(i4);
            float I = nx7.I(nx7.H(ro3Var));
            int k = ro3Var.k(i);
            if (I == 0.0f) {
                i3 += k;
            } else if (I > 0.0f) {
                f += I;
                i2 = Math.max(i2, Math.round(k / I));
            }
        }
        return ((list.size() - 1) * x0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.vo3
    public final int d(j23 j23Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int x0 = j23Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * x0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            ro3 ro3Var = (ro3) list.get(i5);
            float I = nx7.I(nx7.H(ro3Var));
            if (I == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(ro3Var.n(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ro3Var.c(min2));
            } else if (I > 0.0f) {
                f += I;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ro3 ro3Var2 = (ro3) list.get(i6);
            float I2 = nx7.I(nx7.H(ro3Var2));
            if (I2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * I2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, ro3Var2.c(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.vo3
    public final int e(j23 j23Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int x0 = j23Var.x0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * x0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            ro3 ro3Var = (ro3) list.get(i5);
            float I = nx7.I(nx7.H(ro3Var));
            if (I == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(ro3Var.n(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, ro3Var.O(min2));
            } else if (I > 0.0f) {
                f += I;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ro3 ro3Var2 = (ro3) list.get(i6);
            float I2 = nx7.I(nx7.H(ro3Var2));
            if (I2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * I2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, ro3Var2.O(i2));
            }
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z75) {
                z75 z75Var = (z75) obj;
                if (!this.a.equals(z75Var.a) || !a34.i(this.b, z75Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.w75
    public final void f(int i, int[] iArr, int[] iArr2, xo3 xo3Var) {
        this.a.j(xo3Var, i, iArr, xo3Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.w75
    public final long g(int i, int i2, int i3, boolean z) {
        if (!z) {
            return sx0.a(i, i2, 0, i3);
        }
        return n03.p(i, i2, 0, i3);
    }

    @Override // defpackage.w75
    public final wo3 h(em4[] em4VarArr, xo3 xo3Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return xo3Var.L(i, i2, ot1.x, new fe1(em4VarArr, this, i2, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.w75
    public final int i(em4 em4Var) {
        return em4Var.y;
    }

    @Override // defpackage.w75
    public final int j(em4 em4Var) {
        return em4Var.x;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
