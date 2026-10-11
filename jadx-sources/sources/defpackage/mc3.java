package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mc3 implements wo3 {
    public final oc3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final wo3 e;
    public final float f;
    public final boolean g;
    public final v11 h;
    public final ud1 i;
    public final int j;
    public final ub2 k;
    public final ub2 l;
    public final int m;
    public final List n;
    public final int o;
    public final int p;
    public final int q;
    public final rg4 r;
    public final int s;
    public final int t;

    public mc3(oc3 oc3Var, int i, boolean z, float f, wo3 wo3Var, float f2, boolean z2, v11 v11Var, ud1 ud1Var, int i2, ub2 ub2Var, ub2 ub2Var2, int i3, List list, int i4, int i5, int i6, rg4 rg4Var, int i7, int i8) {
        this.a = oc3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = wo3Var;
        this.f = f2;
        this.g = z2;
        this.h = v11Var;
        this.i = ud1Var;
        this.j = i2;
        this.k = ub2Var;
        this.l = ub2Var2;
        this.m = i3;
        this.n = list;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = rg4Var;
        this.s = i7;
        this.t = i8;
    }

    @Override // defpackage.wo3
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.wo3
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.wo3
    public final ub2 c() {
        return this.e.c();
    }

    @Override // defpackage.wo3
    public final ic2 d() {
        return this.e.d();
    }

    @Override // defpackage.wo3
    public final ub2 e() {
        return this.e.e();
    }

    public final mc3 f(int i, boolean z) {
        oc3 oc3Var;
        boolean z2;
        int i2;
        int i3;
        int i4;
        List list;
        int i5;
        int i6;
        long j;
        List list2;
        int i7;
        int i8;
        if (!this.g) {
            List list3 = this.n;
            if (!list3.isEmpty() && (oc3Var = this.a) != null) {
                int i9 = oc3Var.h;
                int i10 = this.b - i;
                if (i10 >= 0 && i10 < i9) {
                    nc3 nc3Var = (nc3) yo0.k0(list3);
                    nc3 nc3Var2 = (nc3) yo0.r0(list3);
                    if (!nc3Var.A && !nc3Var2.A) {
                        int i11 = this.p;
                        int i12 = this.o;
                        rg4 rg4Var = this.r;
                        if (i < 0) {
                            if (Math.min((nc3Var.m() + jf7.A(nc3Var, rg4Var)) - i12, (nc3Var2.m() + jf7.A(nc3Var2, rg4Var)) - i11) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i12 - jf7.A(nc3Var, rg4Var), i11 - jf7.A(nc3Var2, rg4Var)) <= i) {
                            return null;
                        }
                        int size = list3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            nc3 nc3Var3 = (nc3) list3.get(i13);
                            boolean z3 = nc3Var3.c;
                            if (nc3Var3.A) {
                                list = list3;
                                i5 = size;
                                i4 = i10;
                            } else {
                                long j2 = nc3Var3.x;
                                if (z3) {
                                    i2 = (int) (j2 >> 32);
                                } else {
                                    i2 = ((int) (j2 >> 32)) + i;
                                }
                                long j3 = 4294967295L;
                                if (z3) {
                                    i3 = ((int) (j2 & 4294967295L)) + i;
                                } else {
                                    i3 = (int) (j2 & 4294967295L);
                                }
                                i4 = i10;
                                nc3Var3.x = (i2 << 32) | (i3 & 4294967295L);
                                if (z) {
                                    int size2 = nc3Var3.h.size();
                                    int i14 = 0;
                                    while (i14 < size2) {
                                        kd3 a = nc3Var3.k.a(i14, nc3Var3.b);
                                        if (a != null) {
                                            long j4 = a.j;
                                            if (z3) {
                                                j = j3;
                                                i7 = (int) (j4 >> 32);
                                            } else {
                                                j = j3;
                                                i7 = ((int) (j4 >> 32)) + i;
                                            }
                                            if (z3) {
                                                i8 = ((int) (j4 & j)) + i;
                                            } else {
                                                i8 = (int) (j4 & j);
                                            }
                                            list2 = list3;
                                            i6 = size;
                                            a.j = (i8 & j) | (i7 << 32);
                                        } else {
                                            i6 = size;
                                            j = j3;
                                            list2 = list3;
                                        }
                                        i14++;
                                        list3 = list2;
                                        j3 = j;
                                        size = i6;
                                    }
                                }
                                list = list3;
                                i5 = size;
                            }
                            i13++;
                            i10 = i4;
                            list3 = list;
                            size = i5;
                        }
                        List list4 = list3;
                        int i15 = i10;
                        if (!this.c && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new mc3(this.a, i15, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, list4, this.o, this.p, this.q, rg4Var, this.s, this.t);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        wo3 wo3Var = this.e;
        return (wo3Var.getWidth() << 32) | (wo3Var.getHeight() & 4294967295L);
    }

    @Override // defpackage.wo3
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.wo3
    public final int getWidth() {
        return this.e.getWidth();
    }
}
