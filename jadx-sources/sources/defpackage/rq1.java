package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rq1 implements ds1 {
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public rq1(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new bh6[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.ds1
    public final void a(zi4 zi4Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (zi4Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (zi4Var.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (zi4Var.a() == 0) {
                            z = false;
                        } else {
                            if (zi4Var.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = zi4Var.b;
                    int a = zi4Var.a();
                    for (bh6 bh6Var : (bh6[]) this.g) {
                        zi4Var.N(i);
                        bh6Var.e(a, zi4Var);
                    }
                    this.e += a;
                    return;
                }
                return;
            default:
                zi4 zi4Var2 = (zi4) this.f;
                ((bh6) this.g).getClass();
                if (this.b) {
                    int a2 = zi4Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(zi4Var.a, zi4Var.b, zi4Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            zi4Var2.N(0);
                            if (73 == zi4Var2.A() && 68 == zi4Var2.A() && 51 == zi4Var2.A()) {
                                zi4Var2.O(3);
                                this.d = zi4Var2.z() + 10;
                            } else {
                                kb0.O("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((bh6) this.g).e(min2, zi4Var);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ds1
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
        }
    }

    @Override // defpackage.ds1
    public final void d() {
        int i;
        boolean z = true;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    io3.B(z);
                    for (bh6 bh6Var : (bh6[]) this.g) {
                        bh6Var.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                ((bh6) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    if (this.c == -9223372036854775807L) {
                        z = false;
                    }
                    io3.B(z);
                    ((bh6) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ds1
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ds1
    public final void g(d12 d12Var, lk6 lk6Var) {
        switch (this.a) {
            case 0:
                bh6[] bh6VarArr = (bh6[]) this.g;
                for (int i = 0; i < bh6VarArr.length; i++) {
                    kk6 kk6Var = (kk6) ((List) this.f).get(i);
                    lk6Var.a();
                    lk6Var.b();
                    bh6 G = d12Var.G(lk6Var.d, 3);
                    da2 da2Var = new da2();
                    lk6Var.b();
                    da2Var.a = lk6Var.e;
                    da2Var.n = qy3.n("video/mp2t");
                    da2Var.o = qy3.n("application/dvbsubs");
                    da2Var.r = Collections.singletonList(kk6Var.b);
                    da2Var.d = kk6Var.a;
                    zo5.q(da2Var, G);
                    bh6VarArr[i] = G;
                }
                return;
            default:
                lk6Var.a();
                lk6Var.b();
                bh6 G2 = d12Var.G(lk6Var.d, 5);
                this.g = G2;
                da2 da2Var2 = new da2();
                lk6Var.b();
                da2Var2.a = lk6Var.e;
                da2Var2.n = qy3.n("video/mp2t");
                da2Var2.o = qy3.n("application/id3");
                zo5.q(da2Var2, G2);
                return;
        }
    }

    public rq1() {
        this.a = (byte) 1;
        this.f = new zi4(10);
        this.c = -9223372036854775807L;
    }
}
