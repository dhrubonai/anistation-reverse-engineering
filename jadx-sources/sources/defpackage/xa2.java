package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xa2 {
    public final bh6 a;
    public ch6 d;
    public ha1 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ea2 l;
    public ea2 m;
    public boolean n;
    public final xg6 b = new xg6();
    public final zi4 c = new zi4();
    public final zi4 j = new zi4(1);
    public final zi4 k = new zi4();

    public xa2(bh6 bh6Var, ch6 ch6Var, ha1 ha1Var, ea2 ea2Var) {
        this.a = bh6Var;
        this.d = ch6Var;
        this.e = ha1Var;
        this.m = ea2Var;
        if (h98.C(ea2Var.p)) {
            this.l = ea2Var;
        }
        this.d = ch6Var;
        this.e = ha1Var;
        if (this.l == null) {
            bh6Var.g(this.m);
        }
        e();
    }

    public final int a() {
        int i;
        if (!this.n) {
            i = this.d.g[this.f];
        } else if (this.b.j[this.f]) {
            i = 1;
        } else {
            i = 0;
        }
        if (b() != null) {
            return 1073741824 | i;
        }
        return i;
    }

    public final wg6 b() {
        if (this.n) {
            xg6 xg6Var = this.b;
            ha1 ha1Var = xg6Var.a;
            String str = eq6.a;
            int i = ha1Var.a;
            wg6 wg6Var = xg6Var.m;
            if (wg6Var == null) {
                wg6[] wg6VarArr = this.d.a.n;
                if (wg6VarArr == null) {
                    wg6Var = null;
                } else {
                    wg6Var = wg6VarArr[i];
                }
            }
            if (wg6Var != null && wg6Var.a) {
                return wg6Var;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        zi4 zi4Var;
        boolean z;
        boolean z2;
        int i3;
        wg6 b = b();
        if (b == null) {
            return 0;
        }
        int i4 = b.d;
        xg6 xg6Var = this.b;
        if (i4 != 0) {
            zi4Var = xg6Var.n;
        } else {
            byte[] bArr = b.e;
            String str = eq6.a;
            int length = bArr.length;
            zi4 zi4Var2 = this.k;
            zi4Var2.L(length, bArr);
            i4 = bArr.length;
            zi4Var = zi4Var2;
        }
        int i5 = this.f;
        if (xg6Var.k && xg6Var.l[i5]) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        zi4 zi4Var3 = this.j;
        byte[] bArr2 = zi4Var3.a;
        if (z2) {
            i3 = 128;
        } else {
            i3 = 0;
        }
        bArr2[0] = (byte) (i3 | i4);
        zi4Var3.N(0);
        bh6 bh6Var = this.a;
        bh6Var.b(zi4Var3, 1, 1);
        bh6Var.b(zi4Var, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        zi4 zi4Var4 = this.c;
        if (!z) {
            zi4Var4.K(8);
            byte[] bArr3 = zi4Var4.a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = 0;
            bArr3[3] = (byte) (i2 & 255);
            bArr3[4] = (byte) ((i >> 24) & 255);
            bArr3[5] = (byte) ((i >> 16) & 255);
            bArr3[6] = (byte) ((i >> 8) & 255);
            bArr3[7] = (byte) (i & 255);
            bh6Var.b(zi4Var4, 8, 1);
            return i4 + 9;
        }
        zi4 zi4Var5 = xg6Var.n;
        int H = zi4Var5.H();
        zi4Var5.O(-2);
        int i6 = (H * 6) + 2;
        if (i2 != 0) {
            zi4Var4.K(i6);
            byte[] bArr4 = zi4Var4.a;
            zi4Var5.k(bArr4, 0, i6);
            int i7 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
            bArr4[2] = (byte) ((i7 >> 8) & 255);
            bArr4[3] = (byte) (i7 & 255);
        } else {
            zi4Var4 = zi4Var5;
        }
        bh6Var.b(zi4Var4, i6, 1);
        return i4 + 1 + i6;
    }

    public final void e() {
        xg6 xg6Var = this.b;
        xg6Var.d = 0;
        xg6Var.p = 0L;
        xg6Var.q = false;
        xg6Var.k = false;
        xg6Var.o = false;
        xg6Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
