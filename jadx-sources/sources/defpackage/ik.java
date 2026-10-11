package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ik implements vo3 {
    public final qk a;
    public em4[] b;
    public em4[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final hk h = new hk(this, (byte) 1);
    public final hk i = new hk(this, (byte) 0);

    public ik(qk qkVar) {
        this.a = qkVar;
    }

    @Override // defpackage.vo3
    public final int a(j23 j23Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ro3) list.get(0)).n(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ro3) list.get(i2)).n(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        ai4 ai4Var;
        lk lkVar;
        lk lkVar2;
        int size = list.size();
        em4[] em4VarArr = new em4[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            ro3 ro3Var = (ro3) list.get(i);
            Object w = ro3Var.w();
            if (w instanceof lk) {
                lkVar2 = (lk) w;
            } else {
                lkVar2 = null;
            }
            if (lkVar2 != null && ((Boolean) lkVar2.x.getValue()).booleanValue()) {
                em4VarArr[i] = ro3Var.p(j);
                j2 = (r8.y & 4294967295L) | (r8.x << 32);
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ro3 ro3Var2 = (ro3) list.get(i2);
            if (em4VarArr[i2] == null) {
                em4VarArr[i2] = ro3Var2.p(j);
            }
        }
        if (xo3Var.d0()) {
            ai4Var = new ai4(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                em4 em4Var = em4VarArr[i5];
                if (em4Var != null) {
                    Object w2 = ((ro3) list.get(i5)).w();
                    if (w2 instanceof lk) {
                        lkVar = (lk) w2;
                    } else {
                        lkVar = null;
                    }
                    if (lkVar == null || !((Boolean) lkVar.y.getValue()).booleanValue()) {
                        int i6 = em4Var.x;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = em4Var.y;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            ai4Var = new ai4(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int intValue = ((Number) ai4Var.x).intValue();
        int intValue2 = ((Number) ai4Var.y).intValue();
        boolean d0 = xo3Var.d0();
        ot1 ot1Var = ot1.x;
        if (!d0) {
            this.a.c.setValue(new k13((intValue << 32) | (intValue2 & 4294967295L)));
            this.c = em4VarArr;
            this.e = intValue;
            this.g = intValue2;
            return xo3Var.L(intValue, intValue2, ot1Var, this.i);
        }
        this.b = em4VarArr;
        this.d = intValue;
        this.f = intValue2;
        return xo3Var.L(intValue, intValue2, ot1Var, this.h);
    }

    @Override // defpackage.vo3
    public final int c(j23 j23Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ro3) list.get(0)).k(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ro3) list.get(i2)).k(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.vo3
    public final int d(j23 j23Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ro3) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ro3) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.vo3
    public final int e(j23 j23Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ro3) list.get(0)).O(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ro3) list.get(i2)).O(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
