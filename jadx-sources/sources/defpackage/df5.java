package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class df5 implements mk6 {
    public final cf5 a;
    public final zi4 b = new zi4(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public df5(cf5 cf5Var) {
        this.a = cf5Var;
    }

    @Override // defpackage.mk6
    public final void a(int i, zi4 zi4Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = zi4Var.b + zi4Var.A();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (z) {
                this.f = false;
                zi4Var.N(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (zi4Var.a() > 0) {
            int i3 = this.d;
            zi4 zi4Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int A = zi4Var.A();
                    zi4Var.N(zi4Var.b - 1);
                    if (A == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(zi4Var.a(), 3 - this.d);
                zi4Var.k(zi4Var2.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    zi4Var2.N(0);
                    zi4Var2.M(3);
                    zi4Var2.O(1);
                    int A2 = zi4Var2.A();
                    int A3 = zi4Var2.A();
                    if ((A2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                    int i5 = (((A2 & 15) << 8) | A3) + 3;
                    this.c = i5;
                    byte[] bArr = zi4Var2.a;
                    if (bArr.length < i5) {
                        zi4Var2.c(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(zi4Var.a(), this.c - this.d);
                zi4Var.k(zi4Var2.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (eq6.o(0, i7, -1, zi4Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        zi4Var2.M(this.c - 4);
                    } else {
                        zi4Var2.M(i7);
                    }
                    zi4Var2.N(0);
                    this.a.a(zi4Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.mk6
    public final void b(tf6 tf6Var, d12 d12Var, lk6 lk6Var) {
        this.a.b(tf6Var, d12Var, lk6Var);
        this.f = true;
    }

    @Override // defpackage.mk6
    public final void c() {
        this.f = true;
    }
}
