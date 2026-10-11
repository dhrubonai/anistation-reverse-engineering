package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i91 implements ro3 {
    public final Enum A;
    public final /* synthetic */ byte x;
    public final ro3 y;
    public final Enum z;

    public /* synthetic */ i91(ro3 ro3Var, Enum r2, Enum r3, byte b) {
        this.x = b;
        this.y = ro3Var;
        this.z = r2;
        this.A = r3;
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        switch (this.x) {
            case 0:
                return this.y.O(i);
            case 1:
                return this.y.O(i);
            default:
                return this.y.O(i);
        }
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        switch (this.x) {
            case 0:
                return this.y.c(i);
            case 1:
                return this.y.c(i);
            default:
                return this.y.c(i);
        }
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        switch (this.x) {
            case 0:
                return this.y.k(i);
            case 1:
                return this.y.k(i);
            default:
                return this.y.k(i);
        }
    }

    @Override // defpackage.ro3
    public final int n(int i) {
        switch (this.x) {
            case 0:
                return this.y.n(i);
            case 1:
                return this.y.n(i);
            default:
                return this.y.n(i);
        }
    }

    @Override // defpackage.ro3
    public final em4 p(long j) {
        int O;
        int k;
        int O2;
        int k2;
        int O3;
        int k3;
        byte b = this.x;
        Enum r1 = this.z;
        Enum r2 = this.A;
        ro3 ro3Var = this.y;
        int i = 32767;
        switch (b) {
            case 0:
                o23 o23Var = (o23) r2;
                k23 k23Var = (k23) r1;
                k23 k23Var2 = k23.y;
                if (o23Var == o23.x) {
                    if (k23Var == k23Var2) {
                        k = ro3Var.n(rx0.g(j));
                    } else {
                        k = ro3Var.k(rx0.g(j));
                    }
                    if (rx0.c(j)) {
                        i = rx0.g(j);
                    }
                    return new y32(k, i, (byte) 0);
                }
                if (k23Var == k23Var2) {
                    O = ro3Var.c(rx0.h(j));
                } else {
                    O = ro3Var.O(rx0.h(j));
                }
                if (rx0.d(j)) {
                    i = rx0.h(j);
                }
                return new y32(i, O, (byte) 0);
            case 1:
                dp3 dp3Var = (dp3) r2;
                cp3 cp3Var = (cp3) r1;
                cp3 cp3Var2 = cp3.y;
                if (dp3Var == dp3.x) {
                    if (cp3Var == cp3Var2) {
                        k2 = ro3Var.n(rx0.g(j));
                    } else {
                        k2 = ro3Var.k(rx0.g(j));
                    }
                    if (rx0.c(j)) {
                        i = rx0.g(j);
                    }
                    return new y32(k2, i, (byte) 1);
                }
                if (cp3Var == cp3Var2) {
                    O2 = ro3Var.c(rx0.h(j));
                } else {
                    O2 = ro3Var.O(rx0.h(j));
                }
                if (rx0.d(j)) {
                    i = rx0.h(j);
                }
                return new y32(i, O2, (byte) 1);
            default:
                ja4 ja4Var = (ja4) r2;
                ia4 ia4Var = (ia4) r1;
                ia4 ia4Var2 = ia4.y;
                if (ja4Var == ja4.x) {
                    if (ia4Var == ia4Var2) {
                        k3 = ro3Var.n(rx0.g(j));
                    } else {
                        k3 = ro3Var.k(rx0.g(j));
                    }
                    if (rx0.c(j)) {
                        i = rx0.g(j);
                    }
                    return new y32(k3, i, (byte) 2);
                }
                if (ia4Var == ia4Var2) {
                    O3 = ro3Var.c(rx0.h(j));
                } else {
                    O3 = ro3Var.O(rx0.h(j));
                }
                if (rx0.d(j)) {
                    i = rx0.h(j);
                }
                return new y32(i, O3, (byte) 2);
        }
    }

    @Override // defpackage.ro3
    public final Object w() {
        switch (this.x) {
            case 0:
                return this.y.w();
            case 1:
                return this.y.w();
            default:
                return this.y.w();
        }
    }
}
