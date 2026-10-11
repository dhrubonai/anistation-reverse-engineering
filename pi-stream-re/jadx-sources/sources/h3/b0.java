package h3;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class b0 implements d2.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f4689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4690f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4691g;

    /* renamed from: h, reason: collision with root package name */
    public long f4692h;

    /* renamed from: i, reason: collision with root package name */
    public h2.a f4693i;

    /* renamed from: j, reason: collision with root package name */
    public d2.r f4694j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4695k;

    /* renamed from: a, reason: collision with root package name */
    public final f1.y f4685a = new f1.y(0);

    /* renamed from: c, reason: collision with root package name */
    public final f1.t f4687c = new f1.t(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f4686b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final z f4688d = new z();

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        boolean z9;
        f1.y yVar = this.f4685a;
        boolean z10 = true;
        if (yVar.e() == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            long d10 = yVar.d();
            if (d10 == -9223372036854775807L || d10 == 0 || d10 == j10) {
                z10 = false;
            }
            z9 = z10;
        }
        if (z9) {
            yVar.g(j10);
        }
        h2.a aVar = this.f4693i;
        if (aVar != null) {
            aVar.c(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f4686b;
            if (i10 < sparseArray.size()) {
                a0 a0Var = (a0) sparseArray.valueAt(i10);
                a0Var.f4670f = false;
                a0Var.f4665a.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        this.f4694j = rVar;
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        byte[] bArr = new byte[14];
        qVar.n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.o(bArr[13] & 7);
        qVar.n(bArr, 0, 3);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // d2.p
    public final int i(d2.q qVar, d2.t tVar) {
        boolean z9;
        long j4;
        long j10;
        k kVar;
        boolean z10;
        w7.b.w(this.f4694j);
        long c6 = qVar.c();
        int i10 = 1;
        if (c6 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j11 = -9223372036854775807L;
        z zVar = this.f4688d;
        if (z9 && !zVar.f4995c) {
            boolean z11 = zVar.f4997e;
            f1.t tVar2 = zVar.f4994b;
            if (!z11) {
                long c10 = qVar.c();
                int min = (int) Math.min(20000L, c10);
                long j12 = c10 - min;
                if (qVar.q() != j12) {
                    tVar.f3191a = j12;
                } else {
                    tVar2.D(min);
                    qVar.g();
                    qVar.n(tVar2.f3858a, 0, min);
                    int i11 = tVar2.f3859b;
                    int i12 = tVar2.f3860c - 4;
                    while (true) {
                        if (i12 < i11) {
                            break;
                        }
                        if (z.b(tVar2.f3858a, i12) == 442) {
                            tVar2.G(i12 + 4);
                            long c11 = z.c(tVar2);
                            if (c11 != -9223372036854775807L) {
                                j11 = c11;
                                break;
                            }
                        }
                        i12--;
                    }
                    zVar.f4999g = j11;
                    zVar.f4997e = true;
                    i10 = 0;
                }
            } else {
                if (zVar.f4999g == -9223372036854775807L) {
                    zVar.a(qVar);
                    return 0;
                }
                if (!zVar.f4996d) {
                    int min2 = (int) Math.min(20000L, qVar.c());
                    long j13 = 0;
                    if (qVar.q() != j13) {
                        tVar.f3191a = j13;
                    } else {
                        tVar2.D(min2);
                        qVar.g();
                        qVar.n(tVar2.f3858a, 0, min2);
                        int i13 = tVar2.f3859b;
                        int i14 = tVar2.f3860c;
                        while (true) {
                            if (i13 >= i14 - 3) {
                                break;
                            }
                            if (z.b(tVar2.f3858a, i13) == 442) {
                                tVar2.G(i13 + 4);
                                long c12 = z.c(tVar2);
                                if (c12 != -9223372036854775807L) {
                                    j11 = c12;
                                    break;
                                }
                            }
                            i13++;
                        }
                        zVar.f4998f = j11;
                        zVar.f4996d = true;
                        i10 = 0;
                    }
                } else {
                    long j14 = zVar.f4998f;
                    if (j14 == -9223372036854775807L) {
                        zVar.a(qVar);
                        return 0;
                    }
                    f1.y yVar = zVar.f4993a;
                    zVar.f5000h = yVar.c(zVar.f4999g) - yVar.b(j14);
                    zVar.a(qVar);
                    return 0;
                }
            }
            return i10;
        }
        if (!this.f4695k) {
            this.f4695k = true;
            long j15 = zVar.f5000h;
            if (j15 != -9223372036854775807L) {
                h2.a aVar = new h2.a(zVar.f4993a, j15, c6);
                this.f4693i = aVar;
                this.f4694j.s(aVar.f3152a);
            } else {
                this.f4694j.s(new d2.u(j15));
            }
        }
        h2.a aVar2 = this.f4693i;
        if (aVar2 != null) {
            if (aVar2.f3154c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return aVar2.a(qVar, tVar);
            }
        }
        qVar.g();
        if (c6 != -1) {
            j4 = c6 - qVar.l();
        } else {
            j4 = -1;
        }
        if (j4 != -1 && j4 < 4) {
            return -1;
        }
        f1.t tVar3 = this.f4687c;
        if (!qVar.k(tVar3.f3858a, 0, 4, true)) {
            return -1;
        }
        tVar3.G(0);
        int f10 = tVar3.f();
        if (f10 == 441) {
            return -1;
        }
        if (f10 == 442) {
            qVar.n(tVar3.f3858a, 0, 10);
            tVar3.G(9);
            qVar.h((tVar3.v() & 7) + 14);
            return 0;
        }
        if (f10 == 443) {
            qVar.n(tVar3.f3858a, 0, 2);
            tVar3.G(0);
            qVar.h(tVar3.A() + 6);
            return 0;
        }
        if (((f10 & (-256)) >> 8) != 1) {
            qVar.h(1);
            return 0;
        }
        int i15 = f10 & 255;
        SparseArray sparseArray = this.f4686b;
        a0 a0Var = (a0) sparseArray.get(i15);
        if (!this.f4689e) {
            if (a0Var == null) {
                if (i15 == 189) {
                    kVar = new b();
                    this.f4690f = true;
                    this.f4692h = qVar.q();
                } else if ((i15 & 224) == 192) {
                    kVar = new w(null, 0);
                    this.f4690f = true;
                    this.f4692h = qVar.q();
                } else if ((i15 & 240) == 224) {
                    kVar = new m(null);
                    this.f4691g = true;
                    this.f4692h = qVar.q();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.f(this.f4694j, new i0(i15, 256));
                    a0Var = new a0(kVar, this.f4685a);
                    sparseArray.put(i15, a0Var);
                }
            }
            if (this.f4690f && this.f4691g) {
                j10 = this.f4692h + 8192;
            } else {
                j10 = 1048576;
            }
            if (qVar.q() > j10) {
                this.f4689e = true;
                this.f4694j.b();
            }
        }
        qVar.n(tVar3.f3858a, 0, 2);
        tVar3.G(0);
        int A = tVar3.A() + 6;
        if (a0Var == null) {
            qVar.h(A);
        } else {
            tVar3.D(A);
            qVar.readFully(tVar3.f3858a, 0, A);
            tVar3.G(6);
            f1.s sVar = a0Var.f4667c;
            tVar3.d(sVar.f3851b, 0, 3);
            sVar.o(0);
            sVar.r(8);
            a0Var.f4668d = sVar.h();
            a0Var.f4669e = sVar.h();
            sVar.r(6);
            tVar3.d(sVar.f3851b, 0, sVar.i(8));
            sVar.o(0);
            a0Var.f4671g = 0L;
            if (a0Var.f4668d) {
                sVar.r(4);
                sVar.r(1);
                sVar.r(1);
                long i16 = (sVar.i(3) << 30) | (sVar.i(15) << 15) | sVar.i(15);
                sVar.r(1);
                boolean z12 = a0Var.f4670f;
                f1.y yVar2 = a0Var.f4666b;
                if (!z12 && a0Var.f4669e) {
                    sVar.r(4);
                    sVar.r(1);
                    sVar.r(1);
                    sVar.r(1);
                    yVar2.b((sVar.i(3) << 30) | (sVar.i(15) << 15) | sVar.i(15));
                    a0Var.f4670f = true;
                }
                a0Var.f4671g = yVar2.b(i16);
            }
            long j16 = a0Var.f4671g;
            k kVar2 = a0Var.f4665a;
            kVar2.e(4, j16);
            kVar2.d(tVar3);
            kVar2.g();
            tVar3.F(tVar3.f3858a.length);
        }
        return 0;
    }
}
