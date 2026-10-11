package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rk implements vo3 {
    public final fl a;
    public boolean b;

    public rk(fl flVar) {
        this.a = flVar;
    }

    @Override // defpackage.vo3
    public final int a(j23 j23Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int n = ((ro3) list.get(0)).n(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int n2 = ((ro3) list.get(i2)).n(i);
                if (n2 > n) {
                    n = n2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return n;
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        ti4 ti4Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            em4 p = ((ro3) list.get(i3)).p(j);
            i = Math.max(i, p.x);
            i2 = Math.max(i2, p.y);
            arrayList.add(p);
        }
        if (xo3Var.d0()) {
            this.b = true;
            ti4Var.setValue(new k13((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            ti4Var.setValue(new k13((i2 & 4294967295L) | (i << 32)));
        }
        return xo3Var.L(i, i2, ot1.x, new bk(arrayList, (byte) 1));
    }

    @Override // defpackage.vo3
    public final int c(j23 j23Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int k = ((ro3) list.get(0)).k(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int k2 = ((ro3) list.get(i2)).k(i);
                if (k2 > k) {
                    k = k2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return k;
    }

    @Override // defpackage.vo3
    public final int d(j23 j23Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c = ((ro3) list.get(0)).c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int c2 = ((ro3) list.get(i2)).c(i);
                if (c2 > c) {
                    c = c2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return c;
    }

    @Override // defpackage.vo3
    public final int e(j23 j23Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int O = ((ro3) list.get(0)).O(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int O2 = ((ro3) list.get(i2)).O(i);
                if (O2 > O) {
                    O = O2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return O;
    }
}
