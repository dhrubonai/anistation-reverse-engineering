package q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f8862a;

    /* renamed from: d, reason: collision with root package name */
    public d f8865d;

    /* renamed from: e, reason: collision with root package name */
    public d f8866e;

    /* renamed from: f, reason: collision with root package name */
    public d f8867f;

    /* renamed from: g, reason: collision with root package name */
    public d f8868g;

    /* renamed from: h, reason: collision with root package name */
    public int f8869h;

    /* renamed from: i, reason: collision with root package name */
    public int f8870i;

    /* renamed from: j, reason: collision with root package name */
    public int f8871j;

    /* renamed from: k, reason: collision with root package name */
    public int f8872k;

    /* renamed from: q, reason: collision with root package name */
    public int f8877q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f8878r;

    /* renamed from: b, reason: collision with root package name */
    public e f8863b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f8864c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f8873l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f8874m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f8875n = 0;
    public int o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f8876p = 0;

    public g(h hVar, int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
        this.f8878r = hVar;
        this.f8869h = 0;
        this.f8870i = 0;
        this.f8871j = 0;
        this.f8872k = 0;
        this.f8877q = 0;
        this.f8862a = i10;
        this.f8865d = dVar;
        this.f8866e = dVar2;
        this.f8867f = dVar3;
        this.f8868g = dVar4;
        this.f8869h = hVar.f8883j0;
        this.f8870i = hVar.f8879f0;
        this.f8871j = hVar.f8884k0;
        this.f8872k = hVar.f8880g0;
        this.f8877q = i11;
    }

    public final void a(e eVar) {
        int i10 = this.f8862a;
        int i11 = 0;
        h hVar = this.f8878r;
        if (i10 == 0) {
            int D = hVar.D(eVar, this.f8877q);
            if (eVar.f8824c0[0] == 3) {
                this.f8876p++;
                D = 0;
            }
            int i12 = hVar.C0;
            if (eVar.V != 8) {
                i11 = i12;
            }
            this.f8873l = D + i11 + this.f8873l;
            int C = hVar.C(eVar, this.f8877q);
            if (this.f8863b == null || this.f8864c < C) {
                this.f8863b = eVar;
                this.f8864c = C;
                this.f8874m = C;
            }
        } else {
            int D2 = hVar.D(eVar, this.f8877q);
            int C2 = hVar.C(eVar, this.f8877q);
            if (eVar.f8824c0[1] == 3) {
                this.f8876p++;
                C2 = 0;
            }
            int i13 = hVar.D0;
            if (eVar.V != 8) {
                i11 = i13;
            }
            this.f8874m = C2 + i11 + this.f8874m;
            if (this.f8863b == null || this.f8864c < D2) {
                this.f8863b = eVar;
                this.f8864c = D2;
                this.f8873l = D2;
            }
        }
        this.o++;
    }

    public final void b(int i10, boolean z9, boolean z10) {
        h hVar;
        boolean z11;
        int i11;
        int i12;
        e eVar;
        int i13;
        char c6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = this.o;
        int i22 = 0;
        while (true) {
            hVar = this.f8878r;
            if (i22 >= i21 || (i20 = this.f8875n + i22) >= hVar.O0) {
                break;
            }
            e eVar2 = hVar.N0[i20];
            if (eVar2 != null) {
                eVar2.u();
            }
            i22++;
        }
        if (i21 != 0 && this.f8863b != null) {
            if (z10 && i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i23 = -1;
            int i24 = -1;
            for (int i25 = 0; i25 < i21; i25++) {
                if (z9) {
                    i19 = (i21 - 1) - i25;
                } else {
                    i19 = i25;
                }
                int i26 = this.f8875n + i19;
                if (i26 >= hVar.O0) {
                    break;
                }
                if (hVar.N0[i26].V == 0) {
                    if (i23 == -1) {
                        i23 = i25;
                    }
                    i24 = i25;
                }
            }
            if (this.f8862a == 0) {
                e eVar3 = this.f8863b;
                eVar3.Y = hVar.f8891r0;
                int i27 = this.f8870i;
                if (i10 > 0) {
                    i27 += hVar.D0;
                }
                d dVar = this.f8866e;
                d dVar2 = eVar3.f8845y;
                dVar2.a(dVar, i27);
                d dVar3 = eVar3.A;
                if (z10) {
                    dVar3.a(this.f8868g, this.f8872k);
                }
                if (i10 > 0) {
                    this.f8866e.f8813b.A.a(dVar2, 0);
                }
                if (hVar.F0 == 3 && !eVar3.f8843w) {
                    for (int i28 = 0; i28 < i21; i28++) {
                        if (z9) {
                            i18 = (i21 - 1) - i28;
                        } else {
                            i18 = i28;
                        }
                        int i29 = this.f8875n + i18;
                        if (i29 >= hVar.O0) {
                            break;
                        }
                        eVar = hVar.N0[i29];
                        if (eVar.f8843w) {
                            break;
                        }
                    }
                }
                eVar = eVar3;
                int i30 = 0;
                e eVar4 = null;
                while (i30 < i21) {
                    if (z9) {
                        i13 = (i21 - 1) - i30;
                    } else {
                        i13 = i30;
                    }
                    int i31 = this.f8875n + i13;
                    if (i31 < hVar.O0) {
                        e eVar5 = hVar.N0[i31];
                        if (i30 == 0) {
                            eVar5.f(eVar5.f8844x, this.f8865d, this.f8869h);
                        }
                        if (i13 == 0) {
                            int i32 = hVar.f8890q0;
                            float f10 = hVar.f8896w0;
                            if (this.f8875n == 0) {
                                i17 = hVar.f8892s0;
                                i14 = i32;
                                i15 = -1;
                                if (i17 != -1) {
                                    f10 = hVar.f8898y0;
                                    i16 = i17;
                                    eVar5.X = i16;
                                    eVar5.S = f10;
                                }
                            } else {
                                i14 = i32;
                                i15 = -1;
                            }
                            if (z10 && (i17 = hVar.f8894u0) != i15) {
                                f10 = hVar.A0;
                                i16 = i17;
                                eVar5.X = i16;
                                eVar5.S = f10;
                            } else {
                                i16 = i14;
                                eVar5.X = i16;
                                eVar5.S = f10;
                            }
                        }
                        if (i30 == i21 - 1) {
                            eVar5.f(eVar5.f8846z, this.f8867f, this.f8871j);
                        }
                        if (eVar4 != null) {
                            d dVar4 = eVar5.f8844x;
                            int i33 = hVar.C0;
                            d dVar5 = eVar4.f8846z;
                            dVar4.a(dVar5, i33);
                            d dVar6 = eVar5.f8844x;
                            if (i30 == i23) {
                                int i34 = this.f8869h;
                                if (dVar6.f()) {
                                    dVar6.f8817f = i34;
                                }
                            }
                            dVar5.a(dVar6, 0);
                            if (i30 == i24 + 1) {
                                int i35 = this.f8871j;
                                if (dVar5.f()) {
                                    dVar5.f8817f = i35;
                                }
                            }
                        }
                        if (eVar5 != eVar3) {
                            int i36 = hVar.F0;
                            c6 = 3;
                            if (i36 == 3 && eVar.f8843w && eVar5 != eVar && eVar5.f8843w) {
                                eVar5.B.a(eVar.B, 0);
                            } else if (i36 != 0) {
                                if (i36 != 1) {
                                    if (z11) {
                                        eVar5.f8845y.a(this.f8866e, this.f8870i);
                                        eVar5.A.a(this.f8868g, this.f8872k);
                                    } else {
                                        eVar5.f8845y.a(dVar2, 0);
                                        eVar5.A.a(dVar3, 0);
                                    }
                                } else {
                                    eVar5.A.a(dVar3, 0);
                                }
                            } else {
                                eVar5.f8845y.a(dVar2, 0);
                            }
                        } else {
                            c6 = 3;
                        }
                        i30++;
                        eVar4 = eVar5;
                    } else {
                        return;
                    }
                }
                return;
            }
            e eVar6 = this.f8863b;
            eVar6.X = hVar.f8890q0;
            int i37 = this.f8869h;
            if (i10 > 0) {
                i37 += hVar.C0;
            }
            d dVar7 = eVar6.f8846z;
            d dVar8 = eVar6.f8844x;
            if (z9) {
                dVar7.a(this.f8867f, i37);
                if (z10) {
                    dVar8.a(this.f8865d, this.f8871j);
                }
                if (i10 > 0) {
                    this.f8867f.f8813b.f8844x.a(dVar7, 0);
                }
            } else {
                dVar8.a(this.f8865d, i37);
                if (z10) {
                    dVar7.a(this.f8867f, this.f8871j);
                }
                if (i10 > 0) {
                    this.f8865d.f8813b.f8846z.a(dVar8, 0);
                }
            }
            int i38 = 0;
            e eVar7 = null;
            while (i38 < i21) {
                int i39 = this.f8875n + i38;
                if (i39 < hVar.O0) {
                    e eVar8 = hVar.N0[i39];
                    if (i38 == 0) {
                        eVar8.f(eVar8.f8845y, this.f8866e, this.f8870i);
                        int i40 = hVar.f8891r0;
                        float f11 = hVar.f8897x0;
                        if (this.f8875n == 0) {
                            i12 = hVar.f8893t0;
                            i11 = -1;
                            if (i12 != -1) {
                                f11 = hVar.f8899z0;
                                i40 = i12;
                                eVar8.Y = i40;
                                eVar8.T = f11;
                            }
                        } else {
                            i11 = -1;
                        }
                        if (z10 && (i12 = hVar.f8895v0) != i11) {
                            f11 = hVar.B0;
                            i40 = i12;
                        }
                        eVar8.Y = i40;
                        eVar8.T = f11;
                    }
                    if (i38 == i21 - 1) {
                        eVar8.f(eVar8.A, this.f8868g, this.f8872k);
                    }
                    if (eVar7 != null) {
                        d dVar9 = eVar8.f8845y;
                        int i41 = hVar.D0;
                        d dVar10 = eVar7.A;
                        dVar9.a(dVar10, i41);
                        d dVar11 = eVar8.f8845y;
                        if (i38 == i23) {
                            int i42 = this.f8870i;
                            if (dVar11.f()) {
                                dVar11.f8817f = i42;
                            }
                        }
                        dVar10.a(dVar11, 0);
                        if (i38 == i24 + 1) {
                            int i43 = this.f8872k;
                            if (dVar10.f()) {
                                dVar10.f8817f = i43;
                            }
                        }
                    }
                    if (eVar8 != eVar6) {
                        if (z9) {
                            int i44 = hVar.E0;
                            if (i44 != 0) {
                                if (i44 != 1) {
                                    if (i44 == 2) {
                                        eVar8.f8844x.a(dVar8, 0);
                                        eVar8.f8846z.a(dVar7, 0);
                                    }
                                } else {
                                    eVar8.f8844x.a(dVar8, 0);
                                }
                            } else {
                                eVar8.f8846z.a(dVar7, 0);
                            }
                            i38++;
                            eVar7 = eVar8;
                        } else {
                            int i45 = hVar.E0;
                            if (i45 != 0) {
                                if (i45 != 1) {
                                    if (i45 == 2) {
                                        if (z11) {
                                            eVar8.f8844x.a(this.f8865d, this.f8869h);
                                            eVar8.f8846z.a(this.f8867f, this.f8871j);
                                        } else {
                                            eVar8.f8844x.a(dVar8, 0);
                                            eVar8.f8846z.a(dVar7, 0);
                                        }
                                    }
                                } else {
                                    eVar8.f8846z.a(dVar7, 0);
                                }
                            } else {
                                eVar8.f8844x.a(dVar8, 0);
                            }
                            i38++;
                            eVar7 = eVar8;
                        }
                    }
                    i38++;
                    eVar7 = eVar8;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f8862a == 1) {
            return this.f8874m - this.f8878r.D0;
        }
        return this.f8874m;
    }

    public final int d() {
        if (this.f8862a == 0) {
            return this.f8873l - this.f8878r.C0;
        }
        return this.f8873l;
    }

    public final void e(int i10) {
        h hVar;
        int i11;
        int i12 = this.f8876p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            hVar = this.f8878r;
            if (i15 >= i13 || (i11 = this.f8875n + i15) >= hVar.O0) {
                break;
            }
            e eVar = hVar.N0[i11];
            if (this.f8862a == 0) {
                if (eVar != null) {
                    int[] iArr = eVar.f8824c0;
                    if (iArr[0] == 3 && eVar.f8831j == 0) {
                        hVar.E(eVar, 1, i14, iArr[1], eVar.j());
                    }
                }
            } else if (eVar != null) {
                int[] iArr2 = eVar.f8824c0;
                if (iArr2[1] == 3 && eVar.f8832k == 0) {
                    hVar.E(eVar, iArr2[0], eVar.m(), 1, i14);
                }
            }
            i15++;
        }
        this.f8873l = 0;
        this.f8874m = 0;
        this.f8863b = null;
        this.f8864c = 0;
        int i16 = this.o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f8875n + i17;
            if (i18 < hVar.O0) {
                e eVar2 = hVar.N0[i18];
                if (this.f8862a == 0) {
                    int m5 = eVar2.m();
                    int i19 = hVar.C0;
                    if (eVar2.V == 8) {
                        i19 = 0;
                    }
                    this.f8873l = m5 + i19 + this.f8873l;
                    int C = hVar.C(eVar2, this.f8877q);
                    if (this.f8863b == null || this.f8864c < C) {
                        this.f8863b = eVar2;
                        this.f8864c = C;
                        this.f8874m = C;
                    }
                } else {
                    int D = hVar.D(eVar2, this.f8877q);
                    int C2 = hVar.C(eVar2, this.f8877q);
                    int i20 = hVar.D0;
                    if (eVar2.V == 8) {
                        i20 = 0;
                    }
                    this.f8874m = C2 + i20 + this.f8874m;
                    if (this.f8863b == null || this.f8864c < D) {
                        this.f8863b = eVar2;
                        this.f8864c = D;
                        this.f8873l = D;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void f(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f8862a = i10;
        this.f8865d = dVar;
        this.f8866e = dVar2;
        this.f8867f = dVar3;
        this.f8868g = dVar4;
        this.f8869h = i11;
        this.f8870i = i12;
        this.f8871j = i13;
        this.f8872k = i14;
        this.f8877q = i15;
    }
}
