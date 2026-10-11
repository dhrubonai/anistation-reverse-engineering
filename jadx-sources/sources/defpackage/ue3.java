package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ue3 implements wo3 {
    public final ve3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final wo3 e;
    public final float f;
    public final boolean g;
    public final v11 h;
    public final ud1 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final rg4 p;
    public final int q;
    public final int r;

    public ue3(ve3 ve3Var, int i, boolean z, float f, wo3 wo3Var, float f2, boolean z2, v11 v11Var, ud1 ud1Var, long j, int i2, List list, int i3, int i4, int i5, rg4 rg4Var, int i6, int i7) {
        this.a = ve3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = wo3Var;
        this.f = f2;
        this.g = z2;
        this.h = v11Var;
        this.i = ud1Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = rg4Var;
        this.q = i6;
        this.r = i7;
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

    public final ue3 f(int i, boolean z) {
        ve3 ve3Var;
        boolean z2;
        int i2;
        int i3;
        int i4;
        if (!this.g) {
            List list = this.l;
            if (!list.isEmpty() && (ve3Var = this.a) != null) {
                int m = ve3Var.m();
                int i5 = this.b - i;
                if (i5 >= 0 && i5 < m) {
                    ve3 ve3Var2 = (ve3) yo0.k0(list);
                    ve3 ve3Var3 = (ve3) yo0.r0(list);
                    if (!ve3Var2.v && !ve3Var3.v) {
                        int i6 = ve3Var2.o;
                        int i7 = this.n;
                        int i8 = this.m;
                        if (i < 0) {
                            if (Math.min((ve3Var2.m() + i6) - i8, (ve3Var3.m() + ve3Var3.o) - i7) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i8 - i6, i7 - ve3Var3.o) <= i) {
                            return null;
                        }
                        int size = list.size();
                        int i9 = 0;
                        while (i9 < size) {
                            ve3 ve3Var4 = (ve3) list.get(i9);
                            boolean z3 = ve3Var4.c;
                            int[] iArr = ve3Var4.z;
                            if (!ve3Var4.v) {
                                ve3Var4.o += i;
                                int length = iArr.length;
                                for (int i10 = 0; i10 < length; i10++) {
                                    int i11 = i10 & 1;
                                    if ((z3 && i11 != 0) || (!z3 && i11 == 0)) {
                                        iArr[i10] = iArr[i10] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = ve3Var4.b.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        kd3 a = ve3Var4.m.a(i12, ve3Var4.k);
                                        if (a != null) {
                                            long j = a.j;
                                            if (z3) {
                                                i2 = i5;
                                                i3 = (int) (j >> 32);
                                                i4 = ((int) (j & 4294967295L)) + i;
                                            } else {
                                                i2 = i5;
                                                i3 = ((int) (j >> 32)) + i;
                                                i4 = (int) (j & 4294967295L);
                                            }
                                            a.j = (i4 & 4294967295L) | (i3 << 32);
                                        } else {
                                            i2 = i5;
                                        }
                                        i12++;
                                        i5 = i2;
                                    }
                                }
                            }
                            i9++;
                            i5 = i5;
                        }
                        int i13 = i5;
                        if (!this.c && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new ue3(this.a, i13, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
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
