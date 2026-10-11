package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c24 implements ds1 {
    public final zi4 a;
    public final d24 b;
    public final String c;
    public final int d;
    public final String e;
    public bh6 f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    /* JADX WARN: Type inference failed for: r0v1, types: [d24, java.lang.Object] */
    public c24(String str, int i, String str2) {
        zi4 zi4Var = new zi4(4);
        this.a = zi4Var;
        zi4Var.a[0] = -1;
        this.b = new Object();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        boolean z;
        boolean z2;
        this.f.getClass();
        while (zi4Var.a() > 0) {
            byte b = this.h;
            zi4 zi4Var2 = this.a;
            boolean z3 = true;
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        int min = Math.min(zi4Var.a(), this.m - this.i);
                        this.f.e(min, zi4Var);
                        int i = this.i + min;
                        this.i = i;
                        if (i >= this.m) {
                            if (this.n == -9223372036854775807L) {
                                z3 = false;
                            }
                            io3.B(z3);
                            this.f.a(this.n, 1, this.m, 0, null);
                            this.n += this.l;
                            this.i = 0;
                            this.h = (byte) 0;
                        }
                    } else {
                        p65.l();
                        return;
                    }
                } else {
                    int min2 = Math.min(zi4Var.a(), 4 - this.i);
                    zi4Var.k(zi4Var2.a, this.i, min2);
                    int i2 = this.i + min2;
                    this.i = i2;
                    if (i2 >= 4) {
                        zi4Var2.N(0);
                        int m = zi4Var2.m();
                        d24 d24Var = this.b;
                        if (!d24Var.a(m)) {
                            this.i = 0;
                            this.h = (byte) 1;
                        } else {
                            this.m = d24Var.c;
                            if (!this.j) {
                                this.l = (d24Var.g * 1000000) / d24Var.d;
                                da2 da2Var = new da2();
                                da2Var.a = this.g;
                                da2Var.n = qy3.n(this.e);
                                da2Var.o = qy3.n(d24Var.b);
                                da2Var.p = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                                da2Var.I = d24Var.e;
                                da2Var.K = d24Var.d;
                                da2Var.d = this.c;
                                da2Var.f = this.d;
                                this.f.g(new ea2(da2Var));
                                this.j = true;
                            }
                            zi4Var2.N(0);
                            this.f.e(4, zi4Var2);
                            this.h = (byte) 2;
                        }
                    }
                }
            } else {
                byte[] bArr = zi4Var.a;
                int i3 = zi4Var.b;
                int i4 = zi4Var.c;
                while (true) {
                    if (i3 < i4) {
                        byte b2 = bArr[i3];
                        if ((b2 & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.k && (b2 & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.k = z;
                        if (z2) {
                            zi4Var.N(i3 + 1);
                            this.k = false;
                            zi4Var2.a[1] = bArr[i3];
                            this.i = 2;
                            this.h = (byte) 1;
                            break;
                        }
                        i3++;
                    } else {
                        zi4Var.N(i4);
                        break;
                    }
                }
            }
        }
    }

    @Override // defpackage.ds1
    public final void c() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        lk6Var.a();
        lk6Var.b();
        this.g = lk6Var.e;
        lk6Var.b();
        this.f = d12Var.G(lk6Var.d, 1);
    }
}
