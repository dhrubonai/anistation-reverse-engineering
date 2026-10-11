package q;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: f0, reason: collision with root package name */
    public int f8784f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f8785g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    public int f8786h0 = 0;

    @Override // q.e
    public final void b(p.e eVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        d[] dVarArr = this.F;
        d dVar = this.f8844x;
        dVarArr[0] = dVar;
        int i14 = 2;
        d dVar2 = this.f8845y;
        dVarArr[2] = dVar2;
        d dVar3 = this.f8846z;
        dVarArr[1] = dVar3;
        d dVar4 = this.A;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f8818g = eVar.j(dVar5);
        }
        int i15 = this.f8784f0;
        if (i15 >= 0 && i15 < 4) {
            d dVar6 = dVarArr[i15];
            for (int i16 = 0; i16 < this.f8906e0; i16++) {
                e eVar2 = this.f8905d0[i16];
                if ((this.f8785g0 || eVar2.c()) && ((((i13 = this.f8784f0) == 0 || i13 == 1) && eVar2.f8824c0[0] == 3 && eVar2.f8844x.f8815d != null && eVar2.f8846z.f8815d != null) || ((i13 == 2 || i13 == 3) && eVar2.f8824c0[1] == 3 && eVar2.f8845y.f8815d != null && eVar2.A.f8815d != null))) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
            if (!dVar.e() && !dVar3.e()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!dVar2.e() && !dVar4.e()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z9 && (((i12 = this.f8784f0) == 0 && z10) || ((i12 == 2 && z11) || ((i12 == 1 && z10) || (i12 == 3 && z11))))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            int i17 = 0;
            while (i17 < this.f8906e0) {
                e eVar3 = this.f8905d0[i17];
                if (this.f8785g0 || eVar3.c()) {
                    p.k j4 = eVar.j(eVar3.F[this.f8784f0]);
                    int i18 = this.f8784f0;
                    d dVar7 = eVar3.F[i18];
                    dVar7.f8818g = j4;
                    d dVar8 = dVar7.f8815d;
                    if (dVar8 != null && dVar8.f8813b == this) {
                        i11 = dVar7.f8816e + 0;
                    } else {
                        i11 = 0;
                    }
                    if (i18 != 0 && i18 != i14) {
                        p.k kVar = dVar6.f8818g;
                        int i19 = this.f8786h0 + i11;
                        p.c k10 = eVar.k();
                        p.k l10 = eVar.l();
                        l10.f8396d = 0;
                        k10.b(kVar, j4, l10, i19);
                        eVar.c(k10);
                    } else {
                        p.k kVar2 = dVar6.f8818g;
                        int i20 = this.f8786h0 - i11;
                        p.c k11 = eVar.k();
                        p.k l11 = eVar.l();
                        l11.f8396d = 0;
                        k11.c(kVar2, j4, l11, i20);
                        eVar.c(k11);
                    }
                    eVar.e(dVar6.f8818g, j4, this.f8786h0 + i11, i10);
                }
                i17++;
                i14 = 2;
            }
            int i21 = this.f8784f0;
            if (i21 == 0) {
                eVar.e(dVar3.f8818g, dVar.f8818g, 0, 8);
                eVar.e(dVar.f8818g, this.I.f8846z.f8818g, 0, 4);
                eVar.e(dVar.f8818g, this.I.f8844x.f8818g, 0, 0);
                return;
            }
            if (i21 == 1) {
                eVar.e(dVar.f8818g, dVar3.f8818g, 0, 8);
                eVar.e(dVar.f8818g, this.I.f8844x.f8818g, 0, 4);
                eVar.e(dVar.f8818g, this.I.f8846z.f8818g, 0, 0);
            } else if (i21 == 2) {
                eVar.e(dVar4.f8818g, dVar2.f8818g, 0, 8);
                eVar.e(dVar2.f8818g, this.I.A.f8818g, 0, 4);
                eVar.e(dVar2.f8818g, this.I.f8845y.f8818g, 0, 0);
            } else if (i21 == 3) {
                eVar.e(dVar2.f8818g, dVar4.f8818g, 0, 8);
                eVar.e(dVar2.f8818g, this.I.f8845y.f8818g, 0, 4);
                eVar.e(dVar2.f8818g, this.I.A.f8818g, 0, 0);
            }
        }
    }

    @Override // q.e
    public final boolean c() {
        return true;
    }

    @Override // q.e
    public final String toString() {
        String t9 = a3.g.t(new StringBuilder("[Barrier] "), this.W, " {");
        for (int i10 = 0; i10 < this.f8906e0; i10++) {
            e eVar = this.f8905d0[i10];
            if (i10 > 0) {
                t9 = a3.g.s(t9, ", ");
            }
            t9 = t9 + eVar.W;
        }
        return a3.g.s(t9, "}");
    }
}
