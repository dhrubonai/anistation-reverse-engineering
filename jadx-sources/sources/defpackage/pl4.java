package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pl4 implements mk6 {
    public final ds1 a;
    public final yi0 b = new yi0(10, new byte[10]);
    public int c = 0;
    public int d;
    public tf6 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public pl4(ds1 ds1Var) {
        this.a = ds1Var;
    }

    @Override // defpackage.mk6
    public final void a(int i, zi4 zi4Var) {
        int i2;
        long j;
        int i3;
        int i4;
        this.e.getClass();
        int i5 = i & 1;
        int i6 = -1;
        int i7 = 2;
        ds1 ds1Var = this.a;
        if (i5 != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (this.j != -1) {
                            kb0.O("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        ds1Var.d();
                    } else {
                        p65.l();
                        return;
                    }
                } else {
                    kb0.O("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (zi4Var.c == 0) {
                ds1Var.e();
            }
            this.c = 1;
            this.d = 0;
        }
        int i9 = i;
        while (zi4Var.a() > 0) {
            int i10 = this.c;
            if (i10 != 0) {
                yi0 yi0Var = this.b;
                if (i10 != 1) {
                    if (i10 != i7) {
                        if (i10 == 3) {
                            int a = zi4Var.a();
                            int i11 = this.j;
                            if (i11 == i6) {
                                i4 = 0;
                            } else {
                                i4 = a - i11;
                            }
                            if (i4 > 0) {
                                a -= i4;
                                zi4Var.M(zi4Var.b + a);
                            }
                            ds1Var.a(zi4Var);
                            int i12 = this.j;
                            if (i12 != i6) {
                                int i13 = i12 - a;
                                this.j = i13;
                                if (i13 == 0) {
                                    ds1Var.d();
                                    this.c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            p65.l();
                            return;
                        }
                    } else {
                        if (d(zi4Var, yi0Var.b, Math.min(10, this.i)) && d(zi4Var, null, this.i)) {
                            yi0Var.m(0);
                            if (this.f) {
                                yi0Var.o(4);
                                yi0Var.o(1);
                                yi0Var.o(1);
                                long g = (yi0Var.g(15) << 15) | (yi0Var.g(3) << 30) | yi0Var.g(15);
                                yi0Var.o(1);
                                if (!this.h && this.g) {
                                    yi0Var.o(4);
                                    yi0Var.o(1);
                                    yi0Var.o(1);
                                    yi0Var.o(1);
                                    this.e.b((yi0Var.g(3) << 30) | (yi0Var.g(15) << 15) | yi0Var.g(15));
                                    this.h = true;
                                }
                                j = this.e.b(g);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (this.k) {
                                i3 = 4;
                            } else {
                                i3 = 0;
                            }
                            i9 |= i3;
                            ds1Var.f(i9, j);
                            this.c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(zi4Var, yi0Var.b, 9)) {
                    if (e()) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    this.c = i2;
                    this.d = 0;
                }
            } else {
                zi4Var.O(zi4Var.a());
            }
            i6 = -1;
            i7 = 2;
        }
    }

    @Override // defpackage.mk6
    public final void b(tf6 tf6Var, d12 d12Var, lk6 lk6Var) {
        this.e = tf6Var;
        this.a.g(d12Var, lk6Var);
    }

    @Override // defpackage.mk6
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(zi4 zi4Var, byte[] bArr, int i) {
        int min = Math.min(zi4Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zi4Var.O(min);
        } else {
            zi4Var.k(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        yi0 yi0Var = this.b;
        yi0Var.m(0);
        int g = yi0Var.g(24);
        if (g != 1) {
            h11.r(g, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        yi0Var.o(8);
        int g2 = yi0Var.g(16);
        yi0Var.o(5);
        this.k = yi0Var.f();
        yi0Var.o(2);
        this.f = yi0Var.f();
        this.g = yi0Var.f();
        yi0Var.o(6);
        int g3 = yi0Var.g(8);
        this.i = g3;
        if (g2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (g2 - 3) - g3;
        this.j = i;
        if (i < 0) {
            kb0.O("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
