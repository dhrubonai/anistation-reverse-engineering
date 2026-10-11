package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e90 implements vo3 {
    public final e7 a;
    public final boolean b;

    public e90(e7 e7Var, boolean z) {
        this.a = e7Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, u05] */
    @Override // defpackage.vo3
    public final wo3 b(final xo3 xo3Var, List list, long j) {
        long j2;
        int i;
        int i2;
        z80 z80Var;
        boolean z;
        z80 z80Var2;
        boolean z2;
        boolean z3;
        int j3;
        int i3;
        boolean z4;
        em4 p;
        boolean isEmpty = list.isEmpty();
        ot1 ot1Var = ot1.x;
        if (isEmpty) {
            return xo3Var.L(rx0.j(j), rx0.i(j), ot1Var, new ui((byte) 24));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        z80 z80Var3 = null;
        boolean z5 = true;
        if (list.size() == 1) {
            final ro3 ro3Var = (ro3) list.get(0);
            Object w = ro3Var.w();
            if (w instanceof z80) {
                z80Var3 = (z80) w;
            }
            if (z80Var3 != null) {
                z3 = z80Var3.M;
            } else {
                z3 = false;
            }
            if (!z3) {
                p = ro3Var.p(j2);
                j3 = Math.max(rx0.j(j), p.x);
                i3 = Math.max(rx0.i(j), p.y);
            } else {
                j3 = rx0.j(j);
                i3 = rx0.i(j);
                int j4 = rx0.j(j);
                int i4 = rx0.i(j);
                if (j4 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i4 < 0) {
                    z5 = false;
                }
                if (!(z5 & z4)) {
                    gz2.a("width and height must be >= 0");
                }
                p = ro3Var.p(sx0.h(j4, j4, i4, i4));
            }
            final int i5 = i3;
            final int i6 = j3;
            final em4 em4Var = p;
            return xo3Var.L(i6, i5, ot1Var, new ub2() { // from class: c90
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    b90.d((dm4) obj, em4.this, ro3Var, xo3Var.getLayoutDirection(), i6, i5, this.a);
                    return pn6.a;
                }
            });
        }
        em4[] em4VarArr = new em4[list.size()];
        ?? obj = new Object();
        obj.x = rx0.j(j);
        ?? obj2 = new Object();
        obj2.x = rx0.i(j);
        int size = list.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ro3 ro3Var2 = (ro3) list.get(i7);
            Object w2 = ro3Var2.w();
            if (w2 instanceof z80) {
                z80Var2 = (z80) w2;
            } else {
                z80Var2 = null;
            }
            if (z80Var2 != null) {
                z2 = z80Var2.M;
            } else {
                z2 = false;
            }
            if (!z2) {
                em4 p2 = ro3Var2.p(j2);
                em4VarArr[i7] = p2;
                obj.x = Math.max(obj.x, p2.x);
                obj2.x = Math.max(obj2.x, p2.y);
            } else {
                z6 = true;
            }
        }
        if (z6) {
            int i8 = obj.x;
            if (i8 != Integer.MAX_VALUE) {
                i = i8;
            } else {
                i = 0;
            }
            int i9 = obj2.x;
            if (i9 != Integer.MAX_VALUE) {
                i2 = i9;
            } else {
                i2 = 0;
            }
            long a = sx0.a(i, i8, i2, i9);
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ro3 ro3Var3 = (ro3) list.get(i10);
                Object w3 = ro3Var3.w();
                if (w3 instanceof z80) {
                    z80Var = (z80) w3;
                } else {
                    z80Var = null;
                }
                if (z80Var != null) {
                    z = z80Var.M;
                } else {
                    z = false;
                }
                if (z) {
                    em4VarArr[i10] = ro3Var3.p(a);
                }
            }
        }
        return xo3Var.L(obj.x, obj2.x, ot1Var, new d90(em4VarArr, list, xo3Var, (u05) obj, (u05) obj2, this));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e90) {
                e90 e90Var = (e90) obj;
                if (!a34.i(this.a, e90Var.a) || this.b != e90Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
