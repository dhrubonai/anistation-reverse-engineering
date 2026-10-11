package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yi0 {
    public final /* synthetic */ byte a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public yi0(int i, int i2) {
        this.a = (byte) 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[(i2 * 2) - 1];
        this.e = 0;
    }

    public void a() {
        boolean z;
        int i;
        int i2 = this.c;
        if (i2 >= 0 && (i2 < (i = this.e) || (i2 == i && this.d == 0))) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public int d() {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return this.c;
    }

    public int e() {
        return (this.c * 8) + this.d;
    }

    public boolean f() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if ((this.b[this.c] & (128 >> this.d)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                n();
                return z;
            default:
                if ((((this.b[this.d] & 255) >> this.e) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o(1);
                return z2;
        }
    }

    public int g(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 > 8) {
                        int i4 = i3 - 8;
                        this.d = i4;
                        byte[] bArr = this.b;
                        int i5 = this.c;
                        this.c = i5 + 1;
                        i2 |= (bArr[i5] & 255) << i4;
                    } else {
                        byte[] bArr2 = this.b;
                        int i6 = this.c;
                        int i7 = ((-1) >>> (32 - i)) & (((255 & bArr2[i6]) >> (8 - i3)) | i2);
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i6 + 1;
                        }
                        a();
                        return i7;
                    }
                }
            default:
                int i8 = this.d;
                int min = Math.min(i, 8 - this.e);
                byte[] bArr3 = this.b;
                int i9 = i8 + 1;
                int i10 = ((bArr3[i8] & 255) >> this.e) & (255 >> (8 - min));
                while (min < i) {
                    i10 |= (bArr3[i9] & 255) << min;
                    min += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                o(i);
                return i11;
        }
    }

    public void h(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.b;
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            byte b = bArr2[i4];
            int i6 = this.d;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.d;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.b;
            int i9 = this.c;
            this.c = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            i8 -= 8;
            this.d = i8;
        }
        int i10 = i8 + i7;
        this.d = i10;
        byte[] bArr4 = this.b;
        int i11 = this.c;
        bArr[i2] = (byte) (((byte) (((bArr4[i11] & 255) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.d = 0;
            this.c = i11 + 1;
        }
        a();
    }

    public long i(int i) {
        if (i <= 32) {
            int g = g(i);
            String str = eq6.a;
            return g & 4294967295L;
        }
        int g2 = g(i - 32);
        int g3 = g(32);
        String str2 = eq6.a;
        return (g3 & 4294967295L) | ((g2 & 4294967295L) << 32);
    }

    public void j(int i, byte[] bArr) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        System.arraycopy(this.b, this.c, bArr, 0, i);
        this.c += i;
        a();
    }

    public void k(int i, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i;
    }

    public void l(zi4 zi4Var) {
        k(zi4Var.c, zi4Var.a);
        m(zi4Var.b * 8);
    }

    public void m(int i) {
        int i2 = i / 8;
        this.c = i2;
        this.d = i - (i2 * 8);
        a();
    }

    public void n() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            this.c++;
        }
        a();
    }

    public void o(int i) {
        boolean z;
        int i2;
        switch (this.a) {
            case 1:
                int i3 = i / 8;
                int i4 = this.c + i3;
                this.c = i4;
                int i5 = (i - (i3 * 8)) + this.d;
                this.d = i5;
                if (i5 > 7) {
                    this.c = i4 + 1;
                    this.d = i5 - 8;
                }
                a();
                return;
            default:
                int i6 = i / 8;
                int i7 = this.d + i6;
                this.d = i7;
                int i8 = (i - (i6 * 8)) + this.e;
                this.e = i8;
                if (i8 > 7) {
                    i7++;
                    this.d = i7;
                    i8 -= 8;
                    this.e = i8;
                }
                if (i7 >= 0 && (i7 < (i2 = this.c) || (i7 == i2 && i8 == 0))) {
                    z = true;
                } else {
                    z = false;
                }
                io3.B(z);
                return;
        }
    }

    public void p(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.c += i;
        a();
    }

    public yi0(byte[] bArr) {
        this.a = (byte) 2;
        this.b = bArr;
        this.c = bArr.length;
    }

    public yi0(int i, byte[] bArr) {
        this.a = (byte) 1;
        this.b = bArr;
        this.e = i;
    }

    public yi0() {
        this.a = (byte) 1;
        this.b = eq6.b;
    }
}
