package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uk2 implements b12 {
    public d12 b;
    public c12 c;
    public ok2 d;
    public t14 e;
    public int g;
    public long h;
    public int i;
    public final zi4 a = new zi4(16);
    public long j = -1;
    public byte f = 0;

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        while (true) {
            byte b = this.f;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                return -1;
                            }
                            p65.l();
                            return 0;
                        }
                        if (this.d == null || c12Var != this.c) {
                            this.c = c12Var;
                            this.d = new ok2(c12Var, this.j);
                        }
                        t14 t14Var = this.e;
                        t14Var.getClass();
                        int a = t14Var.a(this.d, d42Var);
                        if (a == 1) {
                            d42Var.a += this.j;
                        }
                        return a;
                    }
                    if (this.e == null) {
                        this.e = new t14(8, w16.o);
                    }
                    ok2 ok2Var = new ok2(c12Var, this.j);
                    this.d = ok2Var;
                    if (this.e.b(ok2Var)) {
                        t14 t14Var2 = this.e;
                        long j = this.j;
                        d12 d12Var = this.b;
                        d12Var.getClass();
                        t14Var2.e(new ok2(j, d12Var, (byte) 5));
                        this.f = (byte) 3;
                    } else {
                        d12 d12Var2 = this.b;
                        d12Var2.getClass();
                        d12Var2.t();
                        this.b.I(new zy(-9223372036854775807L));
                        this.f = (byte) 4;
                    }
                } else {
                    c12Var.v((int) (this.h - this.i));
                    this.i = 0;
                    this.f = (byte) 0;
                }
            } else {
                int i = this.i;
                zi4 zi4Var = this.a;
                if (i == 0) {
                    if (!c12Var.g(zi4Var.a, 0, 8, true)) {
                        d12 d12Var3 = this.b;
                        d12Var3.getClass();
                        d12Var3.t();
                        this.b.I(new zy(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    zi4Var.N(0);
                    this.h = zi4Var.C();
                    this.g = zi4Var.m();
                }
                if (this.h == 1) {
                    c12Var.readFully(zi4Var.a, 8, 8);
                    this.i += 8;
                    this.h = zi4Var.G();
                }
                if (this.g == 1836086884) {
                    long position = c12Var.getPosition();
                    this.j = position;
                    long j2 = this.i;
                    w04 w04Var = new w04(0L, position - j2, -9223372036854775807L, position, this.h - j2);
                    d12 d12Var4 = this.b;
                    d12Var4.getClass();
                    bh6 G = d12Var4.G(1024, 4);
                    da2 da2Var = new da2();
                    da2Var.n = qy3.n("image/heic");
                    da2Var.l = new fy3(w04Var);
                    zo5.q(da2Var, G);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            }
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        return n03.I(c12Var, true);
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        if (j == 0) {
            this.f = (byte) 0;
            this.i = 0;
            this.j = -1L;
            if (this.e != null) {
                this.e = null;
                return;
            }
            return;
        }
        if (this.f == 3) {
            t14 t14Var = this.e;
            t14Var.getClass();
            t14Var.c(j, j2);
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.b = d12Var;
    }

    @Override // defpackage.b12
    public final void release() {
        t14 t14Var = this.e;
        if (t14Var != null) {
            t14Var.getClass();
            this.e = null;
        }
    }
}
