package f1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3850a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3851b;

    /* renamed from: c, reason: collision with root package name */
    public int f3852c;

    /* renamed from: d, reason: collision with root package name */
    public int f3853d;

    /* renamed from: e, reason: collision with root package name */
    public int f3854e;

    public s() {
        this.f3850a = 0;
        this.f3851b = b0.f3804f;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        boolean z9 = true;
        switch (this.f3850a) {
            case 0:
                int i13 = this.f3852c;
                if (i13 < 0 || (i13 >= (i11 = this.f3854e) && (i13 != i11 || this.f3853d != 0))) {
                    z9 = false;
                }
                w7.b.u(z9);
                return;
            case 1:
                int i14 = this.f3853d;
                if (i14 < 0 || (i14 >= (i12 = this.f3852c) && (i14 != i12 || this.f3854e != 0))) {
                    z9 = false;
                }
                w7.b.u(z9);
                return;
            default:
                int i15 = this.f3853d;
                if (i15 < 0 || (i15 >= (i10 = this.f3852c) && (i15 != i10 || this.f3854e != 0))) {
                    z9 = false;
                }
                w7.b.u(z9);
                return;
        }
    }

    public final int b() {
        return ((this.f3854e - this.f3852c) * 8) - this.f3853d;
    }

    public final void c() {
        if (this.f3853d == 0) {
            return;
        }
        this.f3853d = 0;
        this.f3852c++;
        a();
    }

    public final boolean d(int i10) {
        int i11 = this.f3853d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f3854e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f3852c) {
                break;
            }
            if (p(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f3852c;
        if (i13 < i15) {
            return true;
        }
        if (i13 == i15 && i14 == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        boolean z9;
        int i10 = this.f3853d;
        int i11 = this.f3854e;
        int i12 = 0;
        while (this.f3853d < this.f3852c && !h()) {
            i12++;
        }
        if (this.f3853d == this.f3852c) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3853d = i10;
        this.f3854e = i11;
        if (z9 || !d((i12 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public final int f() {
        boolean z9;
        if (this.f3853d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        return this.f3852c;
    }

    public final int g() {
        int i10;
        int i11;
        switch (this.f3850a) {
            case 0:
                i10 = this.f3852c * 8;
                i11 = this.f3853d;
                break;
            default:
                i10 = this.f3853d * 8;
                i11 = this.f3854e;
                break;
        }
        return i10 + i11;
    }

    public final boolean h() {
        boolean z9 = true;
        boolean z10 = false;
        switch (this.f3850a) {
            case 0:
                if ((this.f3851b[this.f3852c] & (128 >> this.f3853d)) == 0) {
                    z9 = false;
                }
                q();
                return z9;
            case 1:
                if ((this.f3851b[this.f3853d] & (128 >> this.f3854e)) == 0) {
                    z9 = false;
                }
                q();
                return z9;
            default:
                if ((((this.f3851b[this.f3853d] & 255) >> this.f3854e) & 1) == 1) {
                    z10 = true;
                }
                r(1);
                return z10;
        }
    }

    public final int i(int i10) {
        int i11 = 1;
        switch (this.f3850a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.f3853d += i10;
                int i12 = 0;
                while (true) {
                    int i13 = this.f3853d;
                    if (i13 > 8) {
                        int i14 = i13 - 8;
                        this.f3853d = i14;
                        byte[] bArr = this.f3851b;
                        int i15 = this.f3852c;
                        this.f3852c = i15 + 1;
                        i12 |= (bArr[i15] & 255) << i14;
                    } else {
                        byte[] bArr2 = this.f3851b;
                        int i16 = this.f3852c;
                        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((255 & bArr2[i16]) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f3853d = 0;
                            this.f3852c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                }
            case 1:
                this.f3854e += i10;
                int i18 = 0;
                while (true) {
                    int i19 = this.f3854e;
                    int i20 = 2;
                    if (i19 > 8) {
                        int i21 = i19 - 8;
                        this.f3854e = i21;
                        byte[] bArr3 = this.f3851b;
                        int i22 = this.f3853d;
                        i18 |= (bArr3[i22] & 255) << i21;
                        if (!p(i22 + 1)) {
                            i20 = 1;
                        }
                        this.f3853d = i22 + i20;
                    } else {
                        byte[] bArr4 = this.f3851b;
                        int i23 = this.f3853d;
                        int i24 = ((-1) >>> (32 - i10)) & (i18 | ((255 & bArr4[i23]) >> (8 - i19)));
                        if (i19 == 8) {
                            this.f3854e = 0;
                            if (p(i23 + 1)) {
                                i11 = 2;
                            }
                            this.f3853d = i23 + i11;
                        }
                        a();
                        return i24;
                    }
                }
            default:
                int i25 = this.f3853d;
                int min = Math.min(i10, 8 - this.f3854e);
                int i26 = i25 + 1;
                int i27 = ((this.f3851b[i25] & 255) >> this.f3854e) & (255 >> (8 - min));
                while (min < i10) {
                    i27 |= (this.f3851b[i26] & 255) << min;
                    min += 8;
                    i26++;
                }
                int i28 = i27 & ((-1) >>> (32 - i10));
                r(i10);
                return i28;
        }
    }

    public final void j(byte[] bArr, int i10) {
        int i11 = (i10 >> 3) + 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f3851b;
            int i13 = this.f3852c;
            int i14 = i13 + 1;
            this.f3852c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f3853d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f3853d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f3851b;
            int i18 = this.f3852c;
            this.f3852c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f3853d = i17 - 8;
        }
        int i19 = this.f3853d + i16;
        this.f3853d = i19;
        byte[] bArr4 = this.f3851b;
        int i20 = this.f3852c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f3853d = 0;
            this.f3852c = i20 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i10) {
        boolean z9;
        if (this.f3853d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        System.arraycopy(this.f3851b, this.f3852c, bArr, 0, i10);
        this.f3852c += i10;
        a();
    }

    public final int l() {
        int i10 = 0;
        int i11 = 0;
        while (!h()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = i(i11);
        }
        return i12 + i10;
    }

    public final int m() {
        int i10;
        int l10 = l();
        if (l10 % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return ((l10 + 1) / 2) * i10;
    }

    public final void n(byte[] bArr, int i10) {
        this.f3851b = bArr;
        this.f3852c = 0;
        this.f3853d = 0;
        this.f3854e = i10;
    }

    public final void o(int i10) {
        int i11 = i10 / 8;
        this.f3852c = i11;
        this.f3853d = i10 - (i11 * 8);
        a();
    }

    public final boolean p(int i10) {
        if (2 <= i10 && i10 < this.f3852c) {
            byte[] bArr = this.f3851b;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void q() {
        int i10 = 1;
        switch (this.f3850a) {
            case 0:
                int i11 = this.f3853d + 1;
                this.f3853d = i11;
                if (i11 == 8) {
                    this.f3853d = 0;
                    this.f3852c++;
                }
                a();
                return;
            default:
                int i12 = this.f3854e + 1;
                this.f3854e = i12;
                if (i12 == 8) {
                    this.f3854e = 0;
                    int i13 = this.f3853d;
                    if (p(i13 + 1)) {
                        i10 = 2;
                    }
                    this.f3853d = i13 + i10;
                }
                a();
                return;
        }
    }

    public final void r(int i10) {
        switch (this.f3850a) {
            case 0:
                int i11 = i10 / 8;
                int i12 = this.f3852c + i11;
                this.f3852c = i12;
                int i13 = (i10 - (i11 * 8)) + this.f3853d;
                this.f3853d = i13;
                if (i13 > 7) {
                    this.f3852c = i12 + 1;
                    this.f3853d = i13 - 8;
                }
                a();
                return;
            case 1:
                int i14 = this.f3853d;
                int i15 = i10 / 8;
                int i16 = i14 + i15;
                this.f3853d = i16;
                int i17 = (i10 - (i15 * 8)) + this.f3854e;
                this.f3854e = i17;
                if (i17 > 7) {
                    this.f3853d = i16 + 1;
                    this.f3854e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 <= this.f3853d) {
                        if (p(i14)) {
                            this.f3853d++;
                            i14 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
            default:
                int i18 = i10 / 8;
                int i19 = this.f3853d + i18;
                this.f3853d = i19;
                int i20 = (i10 - (i18 * 8)) + this.f3854e;
                this.f3854e = i20;
                if (i20 > 7) {
                    this.f3853d = i19 + 1;
                    this.f3854e = i20 - 8;
                }
                a();
                return;
        }
    }

    public final void s(int i10) {
        boolean z9;
        if (this.f3853d == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        this.f3852c += i10;
        a();
    }

    public s(byte[] bArr, int i10, int i11) {
        this.f3850a = 1;
        this.f3851b = bArr;
        this.f3853d = i10;
        this.f3852c = i11;
        this.f3854e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(byte[] bArr, int i10, Object obj) {
        this(bArr, bArr.length);
        this.f3850a = i10;
        if (i10 != 2) {
        } else {
            this.f3851b = bArr;
            this.f3852c = bArr.length;
        }
    }

    public s(byte[] bArr, int i10) {
        this.f3850a = 0;
        this.f3851b = bArr;
        this.f3854e = i10;
    }

    public s(int i10, int i11) {
        this.f3850a = 3;
        this.f3852c = i10;
        this.f3853d = i11;
        this.f3851b = new byte[(i11 * 2) - 1];
        this.f3854e = 0;
    }
}
