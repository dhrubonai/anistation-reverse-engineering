package defpackage;

import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bj2 implements ds1 {
    public final kg5 a;
    public String b;
    public bh6 c;
    public aj2 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final e64 g = new e64(32);
    public final e64 h = new e64(33);
    public final e64 i = new e64(34);
    public final e64 j = new e64(39);
    public final e64 k = new e64(40);
    public long m = -9223372036854775807L;
    public final zi4 n = new zi4();

    public bj2(kg5 kg5Var) {
        this.a = kg5Var;
    }

    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        int i;
        int i2;
        this.c.getClass();
        String str = eq6.a;
        while (zi4Var.a() > 0) {
            int i3 = zi4Var.b;
            int i4 = zi4Var.c;
            byte[] bArr = zi4Var.a;
            this.l += zi4Var.a();
            this.c.e(zi4Var.a(), zi4Var);
            while (i3 < i4) {
                int J = io3.J(bArr, i3, i4, this.f);
                if (J == i4) {
                    h(bArr, i3, i4);
                    return;
                }
                int i5 = (bArr[J + 3] & 126) >> 1;
                if (J > 0 && bArr[J - 1] == 0) {
                    J--;
                    i = 4;
                } else {
                    i = 3;
                }
                int i6 = J;
                int i7 = i;
                int i8 = i6 - i3;
                if (i8 > 0) {
                    h(bArr, i3, i6);
                }
                int i9 = i4 - i6;
                long j = this.l - i9;
                if (i8 < 0) {
                    i2 = -i8;
                } else {
                    i2 = 0;
                }
                b(i9, i2, j, this.m);
                i(i9, i5, j, this.m);
                i3 = i6 + i7;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        sp spVar = this.a.d;
        aj2 aj2Var = this.d;
        boolean z = this.e;
        boolean z2 = false;
        if (aj2Var.j && aj2Var.g) {
            aj2Var.m = aj2Var.c;
            aj2Var.j = false;
        } else if (aj2Var.h || aj2Var.g) {
            if (z && aj2Var.i) {
                aj2Var.a(i + ((int) (j - aj2Var.b)));
            }
            aj2Var.k = aj2Var.b;
            aj2Var.l = aj2Var.e;
            aj2Var.m = aj2Var.c;
            aj2Var.i = true;
        }
        if (!this.e) {
            e64 e64Var = this.g;
            e64Var.b(i2);
            e64 e64Var2 = this.h;
            e64Var2.b(i2);
            e64 e64Var3 = this.i;
            e64Var3.b(i2);
            if (e64Var.c && e64Var2.c && e64Var3.c) {
                String str = this.b;
                int i3 = e64Var.e;
                byte[] bArr = new byte[e64Var2.e + i3 + e64Var3.e];
                System.arraycopy(e64Var.d, 0, bArr, 0, i3);
                System.arraycopy(e64Var2.d, 0, bArr, e64Var.e, e64Var2.e);
                System.arraycopy(e64Var3.d, 0, bArr, e64Var.e + e64Var2.e, e64Var3.e);
                String str2 = null;
                j64 b0 = io3.b0(e64Var2.d, 3, e64Var2.e, null);
                g64 g64Var = b0.b;
                if (g64Var != null) {
                    str2 = ko0.a(g64Var.a, g64Var.b, g64Var.c, g64Var.d, g64Var.e, g64Var.f);
                }
                da2 da2Var = new da2();
                da2Var.a = str;
                da2Var.n = qy3.n("video/mp2t");
                da2Var.o = qy3.n(MimeTypes.VIDEO_H265);
                da2Var.k = str2;
                da2Var.v = b0.f;
                da2Var.w = b0.g;
                da2Var.y = b0.h;
                da2Var.z = b0.i;
                da2Var.G = new hp0(b0.l, b0.m, b0.n, null, b0.d + 8, b0.e + 8);
                da2Var.D = b0.j;
                da2Var.q = b0.k;
                da2Var.H = b0.a + 1;
                da2Var.r = Collections.singletonList(bArr);
                ea2 ea2Var = new ea2(da2Var);
                this.c.g(ea2Var);
                int i4 = ea2Var.r;
                if (i4 != -1) {
                    z2 = true;
                }
                io3.B(z2);
                spVar.j(i4);
                this.e = true;
            }
        }
        e64 e64Var4 = this.j;
        boolean b = e64Var4.b(i2);
        zi4 zi4Var = this.n;
        if (b) {
            zi4Var.L(io3.n0(e64Var4.e, e64Var4.d), e64Var4.d);
            zi4Var.O(5);
            spVar.a(j2, zi4Var);
        }
        e64 e64Var5 = this.k;
        if (e64Var5.b(i2)) {
            zi4Var.L(io3.n0(e64Var5.e, e64Var5.d), e64Var5.d);
            zi4Var.O(5);
            spVar.a(j2, zi4Var);
        }
    }

    @Override // defpackage.ds1
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        io3.E(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.d.c(0);
        aj2 aj2Var = this.d;
        if (aj2Var != null) {
            aj2Var.f = false;
            aj2Var.g = false;
            aj2Var.h = false;
            aj2Var.i = false;
            aj2Var.j = false;
        }
    }

    @Override // defpackage.ds1
    public final void e() {
        this.c.getClass();
        String str = eq6.a;
        this.a.d.c(0);
        b(0, 0, this.l, this.m);
        i(0, 48, this.l, this.m);
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.b = lk6Var.e;
        lk6Var.b();
        bh6 G = d12Var.G(lk6Var.d, 2);
        this.c = G;
        this.d = new aj2(G);
        this.a.b(d12Var, lk6Var);
    }

    public final void h(byte[] bArr, int i, int i2) {
        boolean z;
        aj2 aj2Var = this.d;
        if (aj2Var.f) {
            int i3 = aj2Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aj2Var.g = z;
                aj2Var.f = false;
            } else {
                aj2Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void i(int i, int i2, long j, long j2) {
        boolean z;
        aj2 aj2Var = this.d;
        boolean z2 = this.e;
        boolean z3 = false;
        aj2Var.g = false;
        aj2Var.h = false;
        aj2Var.e = j2;
        aj2Var.d = 0;
        aj2Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (aj2Var.i && !aj2Var.j) {
                if (z2) {
                    aj2Var.a(i);
                }
                aj2Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                aj2Var.h = !aj2Var.j;
                aj2Var.j = true;
            }
        }
        if (i2 >= 16 && i2 <= 21) {
            z = true;
        } else {
            z = false;
        }
        aj2Var.c = z;
        if (z || i2 <= 9) {
            z3 = true;
        }
        aj2Var.f = z3;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
