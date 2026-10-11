package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nu0 implements ui5 {
    public final o15 x;
    public long y;

    public nu0(List list, List list2) {
        boolean z;
        jw2 k = nw2.k();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        for (int i = 0; i < list.size(); i++) {
            k.c(new mu0((ui5) list.get(i), (List) list2.get(i)));
        }
        this.x = k.g();
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ui5
    public final boolean d() {
        int i = 0;
        while (true) {
            o15 o15Var = this.x;
            if (i >= o15Var.A) {
                return false;
            }
            if (((mu0) o15Var.get(i)).x.d()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.ui5
    public final long f() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            o15 o15Var = this.x;
            if (i >= o15Var.A) {
                break;
            }
            long f = ((mu0) o15Var.get(i)).x.f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                return z3;
            }
            int i = 0;
            z = false;
            while (true) {
                o15 o15Var = this.x;
                if (i >= o15Var.A) {
                    break;
                }
                long f2 = ((mu0) o15Var.get(i)).x.f();
                if (f2 != Long.MIN_VALUE && f2 <= qj3Var.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f2 == f || z2) {
                    z |= ((mu0) o15Var.get(i)).x.q(qj3Var);
                }
                i++;
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // defpackage.ui5
    public final long s() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            o15 o15Var = this.x;
            if (i >= o15Var.A) {
                break;
            }
            mu0 mu0Var = (mu0) o15Var.get(i);
            long s = mu0Var.x.s();
            nw2 nw2Var = mu0Var.y;
            if ((nw2Var.contains(1) || nw2Var.contains(2) || nw2Var.contains(4)) && s != Long.MIN_VALUE) {
                j = Math.min(j, s);
            }
            if (s != Long.MIN_VALUE) {
                j2 = Math.min(j2, s);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.y = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.y;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        return j2;
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        int i = 0;
        while (true) {
            o15 o15Var = this.x;
            if (i < o15Var.A) {
                ((mu0) o15Var.get(i)).v(j);
                i++;
            } else {
                return;
            }
        }
    }
}
