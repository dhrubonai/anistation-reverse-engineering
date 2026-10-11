package q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import r.m;
import r.n;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: j0, reason: collision with root package name */
    public int f8853j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f8854k0;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f8847d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final f.c f8848e0 = new f.c(this);

    /* renamed from: f0, reason: collision with root package name */
    public final r.e f8849f0 = new r.e(this);

    /* renamed from: g0, reason: collision with root package name */
    public s.e f8850g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f8851h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    public final p.e f8852i0 = new p.e();

    /* renamed from: l0, reason: collision with root package name */
    public int f8855l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public int f8856m0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public b[] f8857n0 = new b[4];

    /* renamed from: o0, reason: collision with root package name */
    public b[] f8858o0 = new b[4];

    /* renamed from: p0, reason: collision with root package name */
    public int f8859p0 = 263;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f8860q0 = false;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f8861r0 = false;

    @Override // q.e
    public final void A(boolean z9, boolean z10) {
        super.A(z9, z10);
        int size = this.f8847d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f8847d0.get(i10)).A(z9, z10);
        }
    }

    public final void C(e eVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f8855l0 + 1;
            b[] bVarArr = this.f8858o0;
            if (i11 >= bVarArr.length) {
                this.f8858o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f8858o0;
            int i12 = this.f8855l0;
            bVarArr2[i12] = new b(eVar, 0, this.f8851h0);
            this.f8855l0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f8856m0 + 1;
            b[] bVarArr3 = this.f8857n0;
            if (i13 >= bVarArr3.length) {
                this.f8857n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f8857n0;
            int i14 = this.f8856m0;
            bVarArr4[i14] = new b(eVar, 1, this.f8851h0);
            this.f8856m0 = i14 + 1;
        }
    }

    public final void D(p.e eVar) {
        boolean z9;
        boolean z10;
        b(eVar);
        int size = this.f8847d0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = (e) this.f8847d0.get(i10);
            boolean[] zArr = eVar2.H;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar2 instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar3 = (e) this.f8847d0.get(i11);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    for (int i12 = 0; i12 < aVar.f8906e0; i12++) {
                        e eVar4 = aVar.f8905d0[i12];
                        int i13 = aVar.f8784f0;
                        if (i13 != 0 && i13 != 1) {
                            if (i13 == 2 || i13 == 3) {
                                eVar4.H[1] = true;
                            }
                        } else {
                            eVar4.H[0] = true;
                        }
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            e eVar5 = (e) this.f8847d0.get(i14);
            eVar5.getClass();
            if (!(eVar5 instanceof h) && !(eVar5 instanceof i)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                eVar5.b(eVar);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            e eVar6 = (e) this.f8847d0.get(i15);
            if (eVar6 instanceof f) {
                int[] iArr = eVar6.f8824c0;
                int i16 = iArr[0];
                int i17 = iArr[1];
                if (i16 == 2) {
                    eVar6.x(1);
                }
                if (i17 == 2) {
                    eVar6.y(1);
                }
                eVar6.b(eVar);
                if (i16 == 2) {
                    eVar6.x(i16);
                }
                if (i17 == 2) {
                    eVar6.y(i17);
                }
            } else {
                eVar6.f8829h = -1;
                eVar6.f8830i = -1;
                int[] iArr2 = this.f8824c0;
                int i18 = iArr2[0];
                int[] iArr3 = eVar6.f8824c0;
                if (i18 != 2 && iArr3[0] == 4) {
                    d dVar = eVar6.f8844x;
                    int i19 = dVar.f8816e;
                    int m5 = m();
                    d dVar2 = eVar6.f8846z;
                    int i20 = m5 - dVar2.f8816e;
                    dVar.f8818g = eVar.j(dVar);
                    dVar2.f8818g = eVar.j(dVar2);
                    eVar.d(dVar.f8818g, i19);
                    eVar.d(dVar2.f8818g, i20);
                    eVar6.f8829h = 2;
                    eVar6.N = i19;
                    int i21 = i20 - i19;
                    eVar6.J = i21;
                    int i22 = eVar6.Q;
                    if (i21 < i22) {
                        eVar6.J = i22;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    d dVar3 = eVar6.f8845y;
                    int i23 = dVar3.f8816e;
                    int j4 = j();
                    d dVar4 = eVar6.A;
                    int i24 = j4 - dVar4.f8816e;
                    dVar3.f8818g = eVar.j(dVar3);
                    dVar4.f8818g = eVar.j(dVar4);
                    eVar.d(dVar3.f8818g, i23);
                    eVar.d(dVar4.f8818g, i24);
                    if (eVar6.P > 0 || eVar6.V == 8) {
                        d dVar5 = eVar6.B;
                        p.k j10 = eVar.j(dVar5);
                        dVar5.f8818g = j10;
                        eVar.d(j10, eVar6.P + i23);
                    }
                    eVar6.f8830i = 2;
                    eVar6.O = i23;
                    int i25 = i24 - i23;
                    eVar6.K = i25;
                    int i26 = eVar6.R;
                    if (i25 < i26) {
                        eVar6.K = i26;
                    }
                }
                if (!(eVar6 instanceof h) && !(eVar6 instanceof i)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!z9) {
                    eVar6.b(eVar);
                }
            }
        }
        if (this.f8855l0 > 0) {
            j5.a.a(this, eVar, 0);
        }
        if (this.f8856m0 > 0) {
            j5.a.a(this, eVar, 1);
        }
    }

    public final boolean E(int i10, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = z9 & true;
        r.e eVar = this.f8849f0;
        f fVar = (f) eVar.f9263c;
        int i11 = fVar.i(0);
        int i12 = fVar.i(1);
        int n9 = fVar.n();
        int o = fVar.o();
        r.k kVar = fVar.f8825d;
        m mVar = fVar.f8826e;
        Object obj = eVar.f9265e;
        if (z14 && (i11 == 2 || i12 == 2)) {
            Iterator it = ((ArrayList) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f9293f == i10 && !nVar.k()) {
                    z14 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z14 && i11 == 2) {
                    fVar.x(1);
                    fVar.z(eVar.e(fVar, 0));
                    kVar.f9292e.d(fVar.m());
                }
            } else if (z14 && i12 == 2) {
                fVar.y(1);
                fVar.w(eVar.e(fVar, 1));
                mVar.f9292e.d(fVar.j());
            }
        }
        int[] iArr = fVar.f8824c0;
        if (i10 == 0) {
            z10 = false;
            int i13 = iArr[0];
            if (i13 != 1 && i13 != 4) {
                z11 = true;
                z12 = z10;
            } else {
                int m5 = fVar.m() + n9;
                kVar.f9296i.d(m5);
                kVar.f9292e.d(m5 - n9);
                z11 = true;
                z12 = z11;
            }
        } else {
            z10 = false;
            z11 = true;
            int i14 = iArr[1];
            if (i14 == 1 || i14 == 4) {
                int j4 = fVar.j() + o;
                mVar.f9296i.d(j4);
                mVar.f9292e.d(j4 - o);
                z12 = z11;
            }
            z12 = z10;
        }
        eVar.i();
        ArrayList arrayList = (ArrayList) obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            if (nVar2.f9293f == i10 && (nVar2.f9289b != fVar || nVar2.f9294g)) {
                nVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            n nVar3 = (n) it3.next();
            if (nVar3.f9293f == i10 && (z12 || nVar3.f9289b != fVar)) {
                if (!nVar3.f9295h.f9279j || !nVar3.f9296i.f9279j || (!(nVar3 instanceof r.c) && !nVar3.f9292e.f9279j)) {
                    z13 = z10;
                    break;
                }
            }
        }
        z13 = z11;
        fVar.x(i11);
        fVar.y(i12);
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.F():void");
    }

    @Override // q.e
    public final void t() {
        this.f8852i0.r();
        this.f8853j0 = 0;
        this.f8854k0 = 0;
        this.f8847d0.clear();
        super.t();
    }

    @Override // q.e
    public final void v(i.g gVar) {
        super.v(gVar);
        int size = this.f8847d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f8847d0.get(i10)).v(gVar);
        }
    }
}
