package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nc3 implements vd3 {
    public boolean A;
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final ia3 e;
    public final int f;
    public final int g;
    public final List h;
    public final long i;
    public final Object j;
    public final od3 k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public int t = Integer.MIN_VALUE;
    public int u;
    public int v;
    public final long w;
    public long x;
    public int y;
    public int z;

    public nc3(int i, Object obj, boolean z, int i2, int i3, ia3 ia3Var, int i4, int i5, List list, long j, Object obj2, od3 od3Var, long j2, int i6, int i7) {
        int i8;
        long j3;
        long j4;
        int i9;
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = ia3Var;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = od3Var;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            em4 em4Var = (em4) list.get(i11);
            if (this.c) {
                i9 = em4Var.y;
            } else {
                i9 = em4Var.x;
            }
            i10 = Math.max(i10, i9);
        }
        this.o = i10;
        boolean z2 = this.c;
        if (z2) {
            this.s = i3;
            this.q = i10;
            i8 = this.d;
            this.p = i8;
            this.r = 0;
        } else {
            this.s = 0;
            i8 = this.d;
            this.q = i8;
            this.p = i10;
            this.r = i3;
        }
        if (z2) {
            j3 = i8 << 32;
            j4 = i10;
        } else {
            j3 = i10 << 32;
            j4 = i8;
        }
        this.w = j3 | (j4 & 4294967295L);
        this.x = 0L;
        this.y = -1;
        this.z = -1;
    }

    @Override // defpackage.vd3
    public final int a() {
        return this.r;
    }

    @Override // defpackage.vd3
    public final int b() {
        return this.n;
    }

    @Override // defpackage.vd3
    public final int c() {
        return this.q;
    }

    @Override // defpackage.vd3
    public final long d() {
        return this.l;
    }

    @Override // defpackage.vd3
    public final List e() {
        return this.h;
    }

    @Override // defpackage.vd3
    public final int f() {
        return this.s;
    }

    @Override // defpackage.vd3
    public final long g(int i) {
        return this.x;
    }

    @Override // defpackage.vd3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vd3
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.vd3
    public final int h() {
        return this.m;
    }

    @Override // defpackage.vd3
    public final int i() {
        return this.p;
    }

    @Override // defpackage.vd3
    public final void j() {
        this.A = true;
    }

    @Override // defpackage.vd3
    public final void k(int i, int i2, int i3, int i4) {
        o(i, i2, i3, i4, -1, -1);
    }

    public final int l(long j) {
        long j2;
        if (this.c) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        return (int) j2;
    }

    public final int m() {
        int i;
        int i2;
        if (this.c) {
            i = this.q;
            i2 = this.s;
        } else {
            i = this.p;
            i2 = this.r;
        }
        return i + i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(dm4 dm4Var, boolean z) {
        int i;
        List list;
        int i2;
        long j;
        if (this.t == Integer.MIN_VALUE) {
            hz2.a("position() should be called first");
        }
        List list2 = this.h;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            em4 em4Var = (em4) list2.get(i3);
            int i4 = this.u;
            boolean z2 = this.c;
            if (z2) {
                i = em4Var.y;
            } else {
                i = em4Var.x;
            }
            int i5 = i4 - i;
            int i6 = this.v;
            long j2 = this.x;
            kd3 a = this.k.a(i3, this.b);
            di2 di2Var = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.l = j2;
                    list = list2;
                    i2 = size;
                } else {
                    list = list2;
                    i2 = size;
                    if (!c13.b(a.l, 9223372034707292159L)) {
                        j = a.l;
                    } else {
                        j = j2;
                    }
                    long d = c13.d(j, ((c13) a.p.getValue()).a);
                    if (((l(j2) <= i5 && l(d) <= i5) || (l(j2) >= i6 && l(d) >= i6)) && ((Boolean) a.f.getValue()).booleanValue()) {
                        tl7.z(a.a, null, null, new jd3(a, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    j2 = d;
                }
                di2Var = a.m;
            } else {
                list = list2;
                i2 = size;
            }
            long d2 = c13.d(j2, this.i);
            if (!z && a != null) {
                a.k = d2;
            }
            if (z2) {
                if (di2Var != null) {
                    dm4Var.e(em4Var);
                    em4Var.Y(c13.d(d2, em4Var.B), 0.0f, di2Var);
                } else {
                    dm4.o(dm4Var, em4Var, d2);
                }
            } else if (di2Var != null) {
                dm4.m(dm4Var, em4Var, d2, di2Var);
            } else {
                dm4.l(dm4Var, em4Var, d2);
            }
            i3++;
            list2 = list;
            size = i2;
        }
    }

    public final void o(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long j;
        long j2;
        boolean z = this.c;
        if (z) {
            i7 = i4;
        } else {
            i7 = i3;
        }
        this.t = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == ia3.y) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = i2 << 32;
            j2 = i;
        } else {
            j = i << 32;
            j2 = i2;
        }
        this.x = (j2 & 4294967295L) | j;
        this.y = i5;
        this.z = i6;
        this.u = -this.f;
        this.v = i7 + this.g;
    }
}
