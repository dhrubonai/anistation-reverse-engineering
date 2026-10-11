package h2;

import c1.p0;
import c1.r0;
import d2.b0;
import d2.g0;
import d2.p;
import d2.q;
import d2.r;
import d2.u;
import d2.v;
import d2.y;
import f1.s;
import f1.t;
import j1.l;
import java.util.Arrays;
import p7.a0;
import q2.j;
import q6.g;
import r6.o0;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: e, reason: collision with root package name */
    public r f4652e;

    /* renamed from: f, reason: collision with root package name */
    public g0 f4653f;

    /* renamed from: h, reason: collision with root package name */
    public p0 f4655h;

    /* renamed from: i, reason: collision with root package name */
    public v f4656i;

    /* renamed from: j, reason: collision with root package name */
    public int f4657j;

    /* renamed from: k, reason: collision with root package name */
    public int f4658k;

    /* renamed from: l, reason: collision with root package name */
    public a f4659l;

    /* renamed from: m, reason: collision with root package name */
    public int f4660m;

    /* renamed from: n, reason: collision with root package name */
    public long f4661n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4648a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final t f4649b = new t(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4650c = false;

    /* renamed from: d, reason: collision with root package name */
    public final d2.t f4651d = new d2.t();

    /* renamed from: g, reason: collision with root package name */
    public int f4654g = 0;

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        long j11 = 0;
        if (j4 == 0) {
            this.f4654g = 0;
        } else {
            a aVar = this.f4659l;
            if (aVar != null) {
                aVar.c(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f4661n = j11;
        this.f4660m = 0;
        this.f4649b.D(0);
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f4652e = rVar;
        this.f4653f = rVar.i(0, 1);
        rVar.b();
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        p0 a10 = new y(0).a(qVar, j.f9104h);
        if (a10 != null) {
            int length = a10.f1876a.length;
        }
        t tVar = new t(4);
        qVar.n(tVar.f3858a, 0, 4);
        if (tVar.w() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // d2.p
    public final int i(q qVar, d2.t tVar) {
        l lVar;
        boolean z9;
        v vVar;
        b0 uVar;
        long j4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f4654g;
        Object obj = null;
        boolean z13 = true;
        int i11 = 0;
        if (i10 != 0) {
            byte[] bArr = this.f4648a;
            if (i10 != 1) {
                int i12 = 3;
                int i13 = 4;
                if (i10 != 2) {
                    int i14 = 7;
                    if (i10 != 3) {
                        long j10 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f4653f.getClass();
                                this.f4656i.getClass();
                                a aVar = this.f4659l;
                                if (aVar != null) {
                                    if (aVar.f3154c != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        return aVar.a(qVar, tVar);
                                    }
                                }
                                if (this.f4661n == -1) {
                                    v vVar2 = this.f4656i;
                                    qVar.g();
                                    qVar.o(1);
                                    byte[] bArr2 = new byte[1];
                                    qVar.n(bArr2, 0, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    qVar.o(2);
                                    if (!z11) {
                                        i14 = 6;
                                    }
                                    t tVar2 = new t(i14);
                                    byte[] bArr3 = tVar2.f3858a;
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        int d10 = qVar.d(bArr3, 0 + i15, i14 - i15);
                                        if (d10 == -1) {
                                            break;
                                        }
                                        i15 += d10;
                                    }
                                    tVar2.F(i15);
                                    qVar.g();
                                    try {
                                        j10 = tVar2.B();
                                        if (!z11) {
                                            j10 *= vVar2.f3196b;
                                        }
                                    } catch (NumberFormatException unused) {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        this.f4661n = j10;
                                        return 0;
                                    }
                                    throw r0.a(null, null);
                                }
                                t tVar3 = this.f4649b;
                                int i16 = tVar3.f3860c;
                                if (i16 < 32768) {
                                    int p3 = qVar.p(tVar3.f3858a, i16, 32768 - i16);
                                    if (p3 != -1) {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        tVar3.F(i16 + p3);
                                    } else if (tVar3.f3860c - tVar3.f3859b == 0) {
                                        long j11 = this.f4661n * 1000000;
                                        v vVar3 = this.f4656i;
                                        int i17 = f1.b0.f3799a;
                                        this.f4653f.d(j11 / vVar3.f3199e, 1, this.f4660m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z13 = false;
                                }
                                int i18 = tVar3.f3859b;
                                int i19 = this.f4660m;
                                int i20 = this.f4657j;
                                if (i19 < i20) {
                                    tVar3.H(Math.min(i20 - i19, tVar3.f3860c - i18));
                                }
                                this.f4656i.getClass();
                                int i21 = tVar3.f3859b;
                                while (true) {
                                    int i22 = tVar3.f3860c - 16;
                                    d2.t tVar4 = this.f4651d;
                                    if (i21 <= i22) {
                                        tVar3.G(i21);
                                        if (a0.c(tVar3, this.f4656i, this.f4658k, tVar4)) {
                                            tVar3.G(i21);
                                            j4 = tVar4.f3191a;
                                            break;
                                        }
                                        i21++;
                                    } else {
                                        if (z13) {
                                            while (true) {
                                                int i23 = tVar3.f3860c;
                                                if (i21 <= i23 - this.f4657j) {
                                                    tVar3.G(i21);
                                                    try {
                                                        z10 = a0.c(tVar3, this.f4656i, this.f4658k, tVar4);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z10 = false;
                                                    }
                                                    if (tVar3.f3859b > tVar3.f3860c) {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        tVar3.G(i21);
                                                        j4 = tVar4.f3191a;
                                                        break;
                                                    }
                                                    i21++;
                                                } else {
                                                    tVar3.G(i23);
                                                    break;
                                                }
                                            }
                                        } else {
                                            tVar3.G(i21);
                                        }
                                        j4 = -1;
                                    }
                                }
                                int i24 = tVar3.f3859b - i18;
                                tVar3.G(i18);
                                this.f4653f.f(i24, tVar3);
                                int i25 = this.f4660m + i24;
                                this.f4660m = i25;
                                if (j4 != -1) {
                                    long j12 = this.f4661n * 1000000;
                                    v vVar4 = this.f4656i;
                                    int i26 = f1.b0.f3799a;
                                    this.f4653f.d(j12 / vVar4.f3199e, 1, i25, 0, null);
                                    this.f4660m = 0;
                                    this.f4661n = j4;
                                }
                                int i27 = tVar3.f3860c;
                                int i28 = tVar3.f3859b;
                                int i29 = i27 - i28;
                                if (i29 >= 16) {
                                    return 0;
                                }
                                byte[] bArr4 = tVar3.f3858a;
                                System.arraycopy(bArr4, i28, bArr4, 0, i29);
                                tVar3.G(0);
                                tVar3.F(i29);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        qVar.g();
                        t tVar5 = new t(2);
                        qVar.n(tVar5.f3858a, 0, 2);
                        int A = tVar5.A();
                        if ((A >> 2) == 16382) {
                            qVar.g();
                            this.f4658k = A;
                            r rVar = this.f4652e;
                            int i30 = f1.b0.f3799a;
                            long q9 = qVar.q();
                            long c6 = qVar.c();
                            this.f4656i.getClass();
                            v vVar5 = this.f4656i;
                            if (vVar5.f3205k != null) {
                                uVar = new u(vVar5, 0, q9);
                            } else if (c6 != -1 && vVar5.f3204j > 0) {
                                a aVar2 = new a(vVar5, this.f4658k, q9, c6);
                                this.f4659l = aVar2;
                                uVar = aVar2.f3152a;
                            } else {
                                uVar = new u(vVar5.b());
                            }
                            rVar.s(uVar);
                            this.f4654g = 5;
                            return 0;
                        }
                        qVar.g();
                        throw r0.a("First frame does not start with sync code.", null);
                    }
                    v vVar6 = this.f4656i;
                    boolean z14 = false;
                    while (!z14) {
                        qVar.g();
                        s sVar = new s(new byte[i13], i11, obj);
                        qVar.n(sVar.f3851b, i11, i13);
                        boolean h10 = sVar.h();
                        int i31 = sVar.i(i14);
                        int i32 = sVar.i(24) + i13;
                        if (i31 == 0) {
                            byte[] bArr5 = new byte[38];
                            qVar.readFully(bArr5, i11, 38);
                            vVar6 = new v(bArr5, i13);
                            z9 = h10;
                        } else if (vVar6 != null) {
                            if (i31 == i12) {
                                t tVar6 = new t(i32);
                                qVar.readFully(tVar6.f3858a, i11, i32);
                                z9 = h10;
                                vVar6 = new v(vVar6.f3195a, vVar6.f3196b, vVar6.f3197c, vVar6.f3198d, vVar6.f3199e, vVar6.f3201g, vVar6.f3202h, vVar6.f3204j, w7.b.U(tVar6), vVar6.f3206l);
                            } else {
                                z9 = h10;
                                p0 p0Var = vVar6.f3206l;
                                if (i31 == i13) {
                                    t tVar7 = new t(i32);
                                    qVar.readFully(tVar7.f3858a, 0, i32);
                                    tVar7.H(i13);
                                    p0 J = g.J(Arrays.asList((String[]) g.X(tVar7, false, false).f11425c));
                                    if (p0Var != null) {
                                        J = p0Var.e(J);
                                    }
                                    vVar = new v(vVar6.f3195a, vVar6.f3196b, vVar6.f3197c, vVar6.f3198d, vVar6.f3199e, vVar6.f3201g, vVar6.f3202h, vVar6.f3204j, vVar6.f3205k, J);
                                } else if (i31 == 6) {
                                    t tVar8 = new t(i32);
                                    qVar.readFully(tVar8.f3858a, 0, i32);
                                    tVar8.H(4);
                                    p0 p0Var2 = new p0(o0.o(o2.a.d(tVar8)));
                                    if (p0Var != null) {
                                        p0Var2 = p0Var.e(p0Var2);
                                    }
                                    vVar = new v(vVar6.f3195a, vVar6.f3196b, vVar6.f3197c, vVar6.f3198d, vVar6.f3199e, vVar6.f3201g, vVar6.f3202h, vVar6.f3204j, vVar6.f3205k, p0Var2);
                                } else {
                                    qVar.h(i32);
                                }
                                vVar6 = vVar;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i33 = f1.b0.f3799a;
                        this.f4656i = vVar6;
                        z14 = z9;
                        obj = null;
                        i11 = 0;
                        i12 = 3;
                        i13 = 4;
                        i14 = 7;
                    }
                    this.f4656i.getClass();
                    this.f4657j = Math.max(this.f4656i.f3197c, 6);
                    g0 g0Var = this.f4653f;
                    int i34 = f1.b0.f3799a;
                    g0Var.b(this.f4656i.c(bArr, this.f4655h));
                    this.f4654g = 4;
                    return 0;
                }
                t tVar9 = new t(4);
                qVar.readFully(tVar9.f3858a, 0, 4);
                if (tVar9.w() == 1716281667) {
                    this.f4654g = 3;
                    return 0;
                }
                throw r0.a("Failed to read FLAC stream marker.", null);
            }
            qVar.n(bArr, 0, bArr.length);
            qVar.g();
            this.f4654g = 2;
            return 0;
        }
        boolean z15 = !this.f4650c;
        qVar.g();
        long l10 = qVar.l();
        if (z15) {
            lVar = null;
        } else {
            lVar = j.f9104h;
        }
        p0 a10 = new y(0).a(qVar, lVar);
        if (a10 == null || a10.f1876a.length == 0) {
            a10 = null;
        }
        qVar.h((int) (qVar.l() - l10));
        this.f4655h = a10;
        this.f4654g = 1;
        return 0;
    }
}
