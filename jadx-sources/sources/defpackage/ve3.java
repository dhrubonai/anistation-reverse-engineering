package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ve3 implements vd3 {
    public final int a;
    public final List b;
    public final boolean c;
    public final d7 d;
    public final x50 e;
    public final ia3 f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final od3 m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public boolean v;
    public int w = Integer.MIN_VALUE;
    public int x;
    public int y;
    public final int[] z;

    public ve3(int i, List list, boolean z, d7 d7Var, x50 x50Var, ia3 ia3Var, int i2, int i3, int i4, long j, Object obj, Object obj2, od3 od3Var, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = d7Var;
        this.e = x50Var;
        this.f = ia3Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = od3Var;
        this.n = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            em4 em4Var = (em4) list.get(i9);
            boolean z2 = this.c;
            if (z2) {
                i5 = em4Var.y;
            } else {
                i5 = em4Var.x;
            }
            i7 += i5;
            if (!z2) {
                i6 = em4Var.y;
            } else {
                i6 = em4Var.x;
            }
            i8 = Math.max(i8, i6);
        }
        this.p = i7;
        this.u = i8;
        this.z = new int[this.b.size() * 2];
        if (this.c) {
            this.t = this.i;
            this.r = i7;
            this.q = i8;
            this.s = 0;
            return;
        }
        this.t = 0;
        this.r = i8;
        this.q = i7;
        this.s = this.i;
    }

    @Override // defpackage.vd3
    public final int a() {
        return this.s;
    }

    @Override // defpackage.vd3
    public final int b() {
        return 1;
    }

    @Override // defpackage.vd3
    public final int c() {
        return this.r;
    }

    @Override // defpackage.vd3
    public final long d() {
        return this.n;
    }

    @Override // defpackage.vd3
    public final List e() {
        return this.b;
    }

    @Override // defpackage.vd3
    public final int f() {
        return this.t;
    }

    @Override // defpackage.vd3
    public final long g(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.o;
            if (this.c) {
                return i2 & 4294967295L;
            }
            return i2 << 32;
        }
        int[] iArr = this.z;
        return (iArr[r6 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    @Override // defpackage.vd3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.vd3
    public final Object getKey() {
        return this.k;
    }

    @Override // defpackage.vd3
    public final int h() {
        return 0;
    }

    @Override // defpackage.vd3
    public final int i() {
        return this.q;
    }

    @Override // defpackage.vd3
    public final void j() {
        this.v = true;
    }

    @Override // defpackage.vd3
    public final void k(int i, int i2, int i3, int i4) {
        o(i, i3, i4);
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
            i = this.r;
            i2 = this.t;
        } else {
            i = this.q;
            i2 = this.s;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(dm4 dm4Var, boolean z) {
        int i;
        List list;
        int i2;
        if (this.w == Integer.MIN_VALUE) {
            hz2.a("position() should be called first");
        }
        List list2 = this.b;
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            em4 em4Var = (em4) list2.get(i3);
            int i4 = this.x;
            boolean z2 = this.c;
            if (z2) {
                i = em4Var.y;
            } else {
                i = em4Var.x;
            }
            int i5 = i4 - i;
            int i6 = this.y;
            long g = g(i3);
            kd3 a = this.m.a(i3, this.k);
            di2 di2Var = null;
            Object[] objArr = 0;
            if (a != null) {
                if (z) {
                    a.l = g;
                    list = list2;
                    i2 = size;
                } else {
                    list = list2;
                    i2 = size;
                    if (!c13.b(a.l, 9223372034707292159L)) {
                        g = a.l;
                    }
                    long d = c13.d(g, ((c13) a.p.getValue()).a);
                    if (((l(g) <= i5 && l(d) <= i5) || (l(g) >= i6 && l(d) >= i6)) && ((Boolean) a.f.getValue()).booleanValue()) {
                        tl7.z(a.a, null, null, new jd3(a, objArr == true ? 1 : 0, (byte) 1), 3);
                    }
                    g = d;
                }
                di2Var = a.m;
            } else {
                list = list2;
                i2 = size;
            }
            long d2 = c13.d(g, this.j);
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

    public final void o(int i, int i2, int i3) {
        int i4;
        int i5;
        this.o = i;
        boolean z = this.c;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.w = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            em4 em4Var = (em4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.z;
            if (z) {
                d7 d7Var = this.d;
                if (d7Var != null) {
                    iArr[i7] = d7Var.a(em4Var.x, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = em4Var.y;
                } else {
                    throw qx1.e("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                x50 x50Var = this.e;
                if (x50Var != null) {
                    iArr[i8] = x50Var.a(em4Var.y, i3);
                    i5 = em4Var.x;
                } else {
                    throw qx1.e("null verticalAlignment when isVertical == false");
                }
            }
            i += i5;
        }
        this.x = -this.g;
        this.y = this.w + this.h;
    }
}
