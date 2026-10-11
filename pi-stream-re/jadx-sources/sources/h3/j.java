package h3;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4811a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4812b;

    /* renamed from: c, reason: collision with root package name */
    public long f4813c;

    /* renamed from: d, reason: collision with root package name */
    public int f4814d;

    /* renamed from: e, reason: collision with root package name */
    public int f4815e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4816f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4817g;

    public j(List list) {
        this.f4811a = 0;
        this.f4816f = list;
        this.f4817g = new d2.g0[list.size()];
        this.f4813c = -9223372036854775807L;
    }

    @Override // h3.k
    public final void a() {
        switch (this.f4811a) {
            case 0:
                this.f4812b = false;
                this.f4813c = -9223372036854775807L;
                return;
            default:
                this.f4812b = false;
                this.f4813c = -9223372036854775807L;
                return;
        }
    }

    @Override // h3.k
    public final void d(f1.t tVar) {
        boolean z9;
        boolean z10;
        switch (this.f4811a) {
            case 0:
                if (this.f4812b) {
                    if (this.f4814d == 2) {
                        if (tVar.f3860c - tVar.f3859b == 0) {
                            z10 = false;
                        } else {
                            if (tVar.v() != 32) {
                                this.f4812b = false;
                            }
                            this.f4814d--;
                            z10 = this.f4812b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this.f4814d == 1) {
                        if (tVar.f3860c - tVar.f3859b == 0) {
                            z9 = false;
                        } else {
                            if (tVar.v() != 0) {
                                this.f4812b = false;
                            }
                            this.f4814d--;
                            z9 = this.f4812b;
                        }
                        if (!z9) {
                            return;
                        }
                    }
                    int i10 = tVar.f3859b;
                    int i11 = tVar.f3860c - i10;
                    for (d2.g0 g0Var : (d2.g0[]) this.f4817g) {
                        tVar.G(i10);
                        g0Var.f(i11, tVar);
                    }
                    this.f4815e += i11;
                    return;
                }
                return;
            default:
                w7.b.w((d2.g0) this.f4817g);
                if (this.f4812b) {
                    int i12 = tVar.f3860c - tVar.f3859b;
                    int i13 = this.f4815e;
                    if (i13 < 10) {
                        int min = Math.min(i12, 10 - i13);
                        byte[] bArr = tVar.f3858a;
                        int i14 = tVar.f3859b;
                        f1.t tVar2 = (f1.t) this.f4816f;
                        System.arraycopy(bArr, i14, tVar2.f3858a, this.f4815e, min);
                        if (this.f4815e + min == 10) {
                            tVar2.G(0);
                            if (73 == tVar2.v() && 68 == tVar2.v() && 51 == tVar2.v()) {
                                tVar2.H(3);
                                this.f4814d = tVar2.u() + 10;
                            } else {
                                f1.o.f("Id3Reader", "Discarding invalid ID3 tag");
                                this.f4812b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(i12, this.f4814d - this.f4815e);
                    ((d2.g0) this.f4817g).f(min2, tVar);
                    this.f4815e += min2;
                    return;
                }
                return;
        }
    }

    @Override // h3.k
    public final void e(int i10, long j4) {
        switch (this.f4811a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f4812b = true;
                    this.f4813c = j4;
                    this.f4815e = 0;
                    this.f4814d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f4812b = true;
                    this.f4813c = j4;
                    this.f4814d = 0;
                    this.f4815e = 0;
                    return;
                }
                return;
        }
    }

    @Override // h3.k
    public final void f(d2.r rVar, i0 i0Var) {
        switch (this.f4811a) {
            case 0:
                for (int i10 = 0; i10 < ((d2.g0[]) this.f4817g).length; i10++) {
                    h0 h0Var = (h0) ((List) this.f4816f).get(i10);
                    i0Var.a();
                    i0Var.b();
                    d2.g0 i11 = rVar.i(i0Var.f4809d, 3);
                    c1.u uVar = new c1.u();
                    i0Var.b();
                    uVar.f1897a = i0Var.f4810e;
                    uVar.e("application/dvbsubs");
                    uVar.f1910n = Collections.singletonList(h0Var.f4790b);
                    uVar.f1900d = h0Var.f4789a;
                    i11.b(new c1.v(uVar));
                    ((d2.g0[]) this.f4817g)[i10] = i11;
                }
                return;
            default:
                i0Var.a();
                i0Var.b();
                d2.g0 i12 = rVar.i(i0Var.f4809d, 5);
                this.f4817g = i12;
                c1.u uVar2 = new c1.u();
                i0Var.b();
                uVar2.f1897a = i0Var.f4810e;
                uVar2.e("application/id3");
                i12.b(new c1.v(uVar2));
                return;
        }
    }

    @Override // h3.k
    public final void g() {
        int i10;
        boolean z9 = true;
        switch (this.f4811a) {
            case 0:
                if (this.f4812b) {
                    if (this.f4813c == -9223372036854775807L) {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    for (d2.g0 g0Var : (d2.g0[]) this.f4817g) {
                        g0Var.d(this.f4813c, 1, this.f4815e, 0, null);
                    }
                    this.f4812b = false;
                    return;
                }
                return;
            default:
                w7.b.w((d2.g0) this.f4817g);
                if (this.f4812b && (i10 = this.f4814d) != 0 && this.f4815e == i10) {
                    if (this.f4813c == -9223372036854775807L) {
                        z9 = false;
                    }
                    w7.b.u(z9);
                    ((d2.g0) this.f4817g).d(this.f4813c, 1, this.f4814d, 0, null);
                    this.f4812b = false;
                    return;
                }
                return;
        }
    }

    public j() {
        this.f4811a = 1;
        this.f4816f = new f1.t(10);
        this.f4813c = -9223372036854775807L;
    }
}
