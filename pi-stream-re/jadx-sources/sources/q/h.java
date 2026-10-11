package q;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends k {
    public e[] N0;

    /* renamed from: f0, reason: collision with root package name */
    public int f8879f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public int f8880g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public int f8881h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public int f8882i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public int f8883j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f8884k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f8885l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public int f8886m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public int f8887n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    public final r.b f8888o0 = new r.b();

    /* renamed from: p0, reason: collision with root package name */
    public s.e f8889p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    public int f8890q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public int f8891r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f8892s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public int f8893t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f8894u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public int f8895v0 = -1;

    /* renamed from: w0, reason: collision with root package name */
    public float f8896w0 = 0.5f;

    /* renamed from: x0, reason: collision with root package name */
    public float f8897x0 = 0.5f;

    /* renamed from: y0, reason: collision with root package name */
    public float f8898y0 = 0.5f;

    /* renamed from: z0, reason: collision with root package name */
    public float f8899z0 = 0.5f;
    public float A0 = 0.5f;
    public float B0 = 0.5f;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 2;
    public int F0 = 2;
    public int G0 = 0;
    public int H0 = -1;
    public int I0 = 0;
    public final ArrayList J0 = new ArrayList();
    public e[] K0 = null;
    public e[] L0 = null;
    public int[] M0 = null;
    public int O0 = 0;

    public final int C(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f8824c0;
        if (iArr[1] == 3) {
            int i11 = eVar.f8832k;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f8838r * i10);
                if (i12 != eVar.j()) {
                    E(eVar, iArr[0], eVar.m(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.j();
            }
            if (i11 == 3) {
                return (int) ((eVar.m() * eVar.L) + 0.5f);
            }
        }
        return eVar.j();
    }

    public final int D(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        int[] iArr = eVar.f8824c0;
        if (iArr[0] == 3) {
            int i11 = eVar.f8831j;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.o * i10);
                if (i12 != eVar.m()) {
                    E(eVar, 1, i12, iArr[1], eVar.j());
                }
                return i12;
            }
            if (i11 == 1) {
                return eVar.m();
            }
            if (i11 == 3) {
                return (int) ((eVar.j() * eVar.L) + 0.5f);
            }
        }
        return eVar.m();
    }

    public final void E(e eVar, int i10, int i11, int i12, int i13) {
        s.e eVar2;
        boolean z9;
        e eVar3;
        while (true) {
            eVar2 = this.f8889p0;
            if (eVar2 != null || (eVar3 = this.I) == null) {
                break;
            } else {
                this.f8889p0 = ((f) eVar3).f8850g0;
            }
        }
        r.b bVar = this.f8888o0;
        bVar.f9249a = i10;
        bVar.f9250b = i12;
        bVar.f9251c = i11;
        bVar.f9252d = i13;
        eVar2.a(eVar, bVar);
        eVar.z(bVar.f9253e);
        eVar.w(bVar.f9254f);
        eVar.f8843w = bVar.f9256h;
        int i14 = bVar.f9255g;
        eVar.P = i14;
        if (i14 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        eVar.f8843w = z9;
    }

    @Override // q.k, q.j
    public final void a() {
        for (int i10 = 0; i10 < this.f8906e0; i10++) {
            e eVar = this.f8905d0[i10];
        }
    }

    @Override // q.e
    public final void b(p.e eVar) {
        boolean z9;
        boolean z10;
        e eVar2;
        int i10;
        super.b(eVar);
        e eVar3 = this.I;
        if (eVar3 != null) {
            z9 = ((f) eVar3).f8851h0;
        } else {
            z9 = false;
        }
        int i11 = this.G0;
        ArrayList arrayList = this.J0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2 && this.M0 != null && this.L0 != null && this.K0 != null) {
                    for (int i12 = 0; i12 < this.O0; i12++) {
                        this.N0[i12].u();
                    }
                    int[] iArr = this.M0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    e eVar4 = null;
                    for (int i15 = 0; i15 < i13; i15++) {
                        if (z9) {
                            i10 = (i13 - i15) - 1;
                        } else {
                            i10 = i15;
                        }
                        e eVar5 = this.L0[i10];
                        if (eVar5 != null && eVar5.V != 8) {
                            d dVar = eVar5.f8844x;
                            if (i15 == 0) {
                                eVar5.f(dVar, this.f8844x, this.f8883j0);
                                eVar5.X = this.f8890q0;
                                eVar5.S = this.f8896w0;
                            }
                            if (i15 == i13 - 1) {
                                eVar5.f(eVar5.f8846z, this.f8846z, this.f8884k0);
                            }
                            if (i15 > 0) {
                                eVar5.f(dVar, eVar4.f8846z, this.C0);
                                eVar4.f(eVar4.f8846z, dVar, 0);
                            }
                            eVar4 = eVar5;
                        }
                    }
                    for (int i16 = 0; i16 < i14; i16++) {
                        e eVar6 = this.K0[i16];
                        if (eVar6 != null && eVar6.V != 8) {
                            d dVar2 = eVar6.f8845y;
                            if (i16 == 0) {
                                eVar6.f(dVar2, this.f8845y, this.f8879f0);
                                eVar6.Y = this.f8891r0;
                                eVar6.T = this.f8897x0;
                            }
                            if (i16 == i14 - 1) {
                                eVar6.f(eVar6.A, this.A, this.f8880g0);
                            }
                            if (i16 > 0) {
                                eVar6.f(dVar2, eVar4.A, this.D0);
                                eVar4.f(eVar4.A, dVar2, 0);
                            }
                            eVar4 = eVar6;
                        }
                    }
                    for (int i17 = 0; i17 < i13; i17++) {
                        for (int i18 = 0; i18 < i14; i18++) {
                            int i19 = (i18 * i13) + i17;
                            if (this.I0 == 1) {
                                i19 = (i17 * i14) + i18;
                            }
                            e[] eVarArr = this.N0;
                            if (i19 < eVarArr.length && (eVar2 = eVarArr[i19]) != null && eVar2.V != 8) {
                                e eVar7 = this.L0[i17];
                                e eVar8 = this.K0[i18];
                                if (eVar2 != eVar7) {
                                    eVar2.f(eVar2.f8844x, eVar7.f8844x, 0);
                                    eVar2.f(eVar2.f8846z, eVar7.f8846z, 0);
                                }
                                if (eVar2 != eVar8) {
                                    eVar2.f(eVar2.f8845y, eVar8.f8845y, 0);
                                    eVar2.f(eVar2.A, eVar8.A, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i20 = 0; i20 < size; i20++) {
                    g gVar = (g) arrayList.get(i20);
                    if (i20 == size - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gVar.b(i20, z9, z10);
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z9, true);
        }
        this.f8885l0 = false;
    }
}
