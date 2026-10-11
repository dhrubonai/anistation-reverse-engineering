package r;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: k, reason: collision with root package name */
    public final g f9286k;

    /* renamed from: l, reason: collision with root package name */
    public a f9287l;

    public m(q.e eVar) {
        super(eVar);
        g gVar = new g(this);
        this.f9286k = gVar;
        this.f9287l = null;
        this.f9295h.f9274e = 6;
        this.f9296i.f9274e = 7;
        gVar.f9274e = 8;
        this.f9293f = 1;
    }

    @Override // r.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (p.j.b(this.f9297j) != 3) {
            h hVar = this.f9292e;
            if (hVar.f9272c && !hVar.f9279j && this.f9291d == 3) {
                q.e eVar = this.f9289b;
                int i11 = eVar.f8832k;
                if (i11 != 2) {
                    if (i11 == 3) {
                        h hVar2 = eVar.f8825d.f9292e;
                        if (hVar2.f9279j) {
                            int i12 = eVar.M;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        hVar.d(i10);
                                    } else {
                                        f10 = hVar2.f9276g;
                                        f11 = eVar.L;
                                    }
                                } else {
                                    f12 = hVar2.f9276g * eVar.L;
                                    i10 = (int) (f12 + 0.5f);
                                    hVar.d(i10);
                                }
                            } else {
                                f10 = hVar2.f9276g;
                                f11 = eVar.L;
                            }
                            f12 = f10 / f11;
                            i10 = (int) (f12 + 0.5f);
                            hVar.d(i10);
                        }
                    }
                } else {
                    q.e eVar2 = eVar.I;
                    if (eVar2 != null) {
                        if (eVar2.f8826e.f9292e.f9279j) {
                            hVar.d((int) ((r5.f9276g * eVar.f8838r) + 0.5f));
                        }
                    }
                }
            }
            g gVar = this.f9295h;
            if (gVar.f9272c) {
                g gVar2 = this.f9296i;
                if (gVar2.f9272c) {
                    if (gVar.f9279j && gVar2.f9279j && hVar.f9279j) {
                        return;
                    }
                    boolean z9 = hVar.f9279j;
                    ArrayList arrayList = gVar.f9281l;
                    ArrayList arrayList2 = gVar2.f9281l;
                    if (!z9 && this.f9291d == 3) {
                        q.e eVar3 = this.f9289b;
                        if (eVar3.f8831j == 0 && !eVar3.s()) {
                            g gVar3 = (g) arrayList.get(0);
                            g gVar4 = (g) arrayList2.get(0);
                            int i13 = gVar3.f9276g + gVar.f9275f;
                            int i14 = gVar4.f9276g + gVar2.f9275f;
                            gVar.d(i13);
                            gVar2.d(i14);
                            hVar.d(i14 - i13);
                            return;
                        }
                    }
                    if (!hVar.f9279j && this.f9291d == 3 && this.f9288a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        g gVar5 = (g) arrayList.get(0);
                        int i15 = (((g) arrayList2.get(0)).f9276g + gVar2.f9275f) - (gVar5.f9276g + gVar.f9275f);
                        int i16 = hVar.f9282m;
                        if (i15 < i16) {
                            hVar.d(i15);
                        } else {
                            hVar.d(i16);
                        }
                    }
                    if (hVar.f9279j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        g gVar6 = (g) arrayList.get(0);
                        g gVar7 = (g) arrayList2.get(0);
                        int i17 = gVar6.f9276g;
                        int i18 = gVar.f9275f + i17;
                        int i19 = gVar7.f9276g;
                        int i20 = gVar2.f9275f + i19;
                        float f13 = this.f9289b.T;
                        if (gVar6 == gVar7) {
                            f13 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        gVar.d((int) ((((i19 - i17) - hVar.f9276g) * f13) + i17 + 0.5f));
                        gVar2.d(gVar.f9276g + hVar.f9276g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        q.e eVar4 = this.f9289b;
        l(eVar4.f8845y, eVar4.A, 1);
    }

    @Override // r.n
    public final void d() {
        q.e eVar;
        q.e eVar2;
        q.e eVar3;
        q.e eVar4;
        q.e eVar5 = this.f9289b;
        boolean z9 = eVar5.f8819a;
        h hVar = this.f9292e;
        if (z9) {
            hVar.d(eVar5.j());
        }
        boolean z10 = hVar.f9279j;
        g gVar = this.f9296i;
        g gVar2 = this.f9295h;
        if (!z10) {
            q.e eVar6 = this.f9289b;
            this.f9291d = eVar6.f8824c0[1];
            if (eVar6.f8843w) {
                this.f9287l = new a(this);
            }
            int i10 = this.f9291d;
            if (i10 != 3) {
                if (i10 == 4 && (eVar4 = this.f9289b.I) != null && eVar4.f8824c0[1] == 1) {
                    int j4 = (eVar4.j() - this.f9289b.f8845y.c()) - this.f9289b.A.c();
                    m mVar = eVar4.f8826e;
                    n.b(gVar2, mVar.f9295h, this.f9289b.f8845y.c());
                    n.b(gVar, mVar.f9296i, -this.f9289b.A.c());
                    hVar.d(j4);
                    return;
                }
                if (i10 == 1) {
                    hVar.d(this.f9289b.j());
                }
            }
        } else if (this.f9291d == 4 && (eVar2 = (eVar = this.f9289b).I) != null && eVar2.f8824c0[1] == 1) {
            m mVar2 = eVar2.f8826e;
            n.b(gVar2, mVar2.f9295h, eVar.f8845y.c());
            n.b(gVar, mVar2.f9296i, -this.f9289b.A.c());
            return;
        }
        boolean z11 = hVar.f9279j;
        g gVar3 = this.f9286k;
        if (z11) {
            q.e eVar7 = this.f9289b;
            if (eVar7.f8819a) {
                q.d[] dVarArr = eVar7.F;
                q.d dVar = dVarArr[2];
                q.d dVar2 = dVar.f8815d;
                if (dVar2 != null && dVarArr[3].f8815d != null) {
                    if (eVar7.s()) {
                        gVar2.f9275f = this.f9289b.F[2].c();
                        gVar.f9275f = -this.f9289b.F[3].c();
                    } else {
                        g h10 = n.h(this.f9289b.F[2]);
                        if (h10 != null) {
                            n.b(gVar2, h10, this.f9289b.F[2].c());
                        }
                        g h11 = n.h(this.f9289b.F[3]);
                        if (h11 != null) {
                            n.b(gVar, h11, -this.f9289b.F[3].c());
                        }
                        gVar2.f9271b = true;
                        gVar.f9271b = true;
                    }
                    q.e eVar8 = this.f9289b;
                    if (eVar8.f8843w) {
                        n.b(gVar3, gVar2, eVar8.P);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    g h12 = n.h(dVar);
                    if (h12 != null) {
                        n.b(gVar2, h12, this.f9289b.F[2].c());
                        n.b(gVar, gVar2, hVar.f9276g);
                        q.e eVar9 = this.f9289b;
                        if (eVar9.f8843w) {
                            n.b(gVar3, gVar2, eVar9.P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                q.d dVar3 = dVarArr[3];
                if (dVar3.f8815d != null) {
                    g h13 = n.h(dVar3);
                    if (h13 != null) {
                        n.b(gVar, h13, -this.f9289b.F[3].c());
                        n.b(gVar2, gVar, -hVar.f9276g);
                    }
                    q.e eVar10 = this.f9289b;
                    if (eVar10.f8843w) {
                        n.b(gVar3, gVar2, eVar10.P);
                        return;
                    }
                    return;
                }
                q.d dVar4 = dVarArr[4];
                if (dVar4.f8815d != null) {
                    g h14 = n.h(dVar4);
                    if (h14 != null) {
                        n.b(gVar3, h14, 0);
                        n.b(gVar2, gVar3, -this.f9289b.P);
                        n.b(gVar, gVar2, hVar.f9276g);
                        return;
                    }
                    return;
                }
                if (!(eVar7 instanceof q.j) && eVar7.I != null && eVar7.h(q.c.CENTER).f8815d == null) {
                    q.e eVar11 = this.f9289b;
                    n.b(gVar2, eVar11.I.f8826e.f9295h, eVar11.o());
                    n.b(gVar, gVar2, hVar.f9276g);
                    q.e eVar12 = this.f9289b;
                    if (eVar12.f8843w) {
                        n.b(gVar3, gVar2, eVar12.P);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = hVar.f9281l;
        if (!z11 && this.f9291d == 3) {
            q.e eVar13 = this.f9289b;
            int i11 = eVar13.f8832k;
            ArrayList arrayList2 = hVar.f9280k;
            if (i11 != 2) {
                if (i11 == 3 && !eVar13.s()) {
                    q.e eVar14 = this.f9289b;
                    if (eVar14.f8831j != 3) {
                        h hVar2 = eVar14.f8825d.f9292e;
                        arrayList.add(hVar2);
                        hVar2.f9280k.add(hVar);
                        hVar.f9271b = true;
                        arrayList2.add(gVar2);
                        arrayList2.add(gVar);
                    }
                }
            } else {
                q.e eVar15 = eVar13.I;
                if (eVar15 != null) {
                    h hVar3 = eVar15.f8826e.f9292e;
                    arrayList.add(hVar3);
                    hVar3.f9280k.add(hVar);
                    hVar.f9271b = true;
                    arrayList2.add(gVar2);
                    arrayList2.add(gVar);
                }
            }
        } else {
            hVar.b(this);
        }
        q.e eVar16 = this.f9289b;
        q.d[] dVarArr2 = eVar16.F;
        q.d dVar5 = dVarArr2[2];
        q.d dVar6 = dVar5.f8815d;
        if (dVar6 != null && dVarArr2[3].f8815d != null) {
            if (eVar16.s()) {
                gVar2.f9275f = this.f9289b.F[2].c();
                gVar.f9275f = -this.f9289b.F[3].c();
            } else {
                g h15 = n.h(this.f9289b.F[2]);
                g h16 = n.h(this.f9289b.F[3]);
                h15.b(this);
                h16.b(this);
                this.f9297j = 4;
            }
            if (this.f9289b.f8843w) {
                c(gVar3, gVar2, 1, this.f9287l);
            }
        } else if (dVar6 != null) {
            g h17 = n.h(dVar5);
            if (h17 != null) {
                n.b(gVar2, h17, this.f9289b.F[2].c());
                c(gVar, gVar2, 1, hVar);
                if (this.f9289b.f8843w) {
                    c(gVar3, gVar2, 1, this.f9287l);
                }
                if (this.f9291d == 3) {
                    q.e eVar17 = this.f9289b;
                    if (eVar17.L > 0.0f) {
                        k kVar = eVar17.f8825d;
                        if (kVar.f9291d == 3) {
                            kVar.f9292e.f9280k.add(hVar);
                            arrayList.add(this.f9289b.f8825d.f9292e);
                            hVar.f9270a = this;
                        }
                    }
                }
            }
        } else {
            q.d dVar7 = dVarArr2[3];
            if (dVar7.f8815d != null) {
                g h18 = n.h(dVar7);
                if (h18 != null) {
                    n.b(gVar, h18, -this.f9289b.F[3].c());
                    c(gVar2, gVar, -1, hVar);
                    if (this.f9289b.f8843w) {
                        c(gVar3, gVar2, 1, this.f9287l);
                    }
                }
            } else {
                q.d dVar8 = dVarArr2[4];
                if (dVar8.f8815d != null) {
                    g h19 = n.h(dVar8);
                    if (h19 != null) {
                        n.b(gVar3, h19, 0);
                        c(gVar2, gVar3, -1, this.f9287l);
                        c(gVar, gVar2, 1, hVar);
                    }
                } else if (!(eVar16 instanceof q.j) && (eVar3 = eVar16.I) != null) {
                    n.b(gVar2, eVar3.f8826e.f9295h, eVar16.o());
                    c(gVar, gVar2, 1, hVar);
                    if (this.f9289b.f8843w) {
                        c(gVar3, gVar2, 1, this.f9287l);
                    }
                    if (this.f9291d == 3) {
                        q.e eVar18 = this.f9289b;
                        if (eVar18.L > 0.0f) {
                            k kVar2 = eVar18.f8825d;
                            if (kVar2.f9291d == 3) {
                                kVar2.f9292e.f9280k.add(hVar);
                                arrayList.add(this.f9289b.f8825d.f9292e);
                                hVar.f9270a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            hVar.f9272c = true;
        }
    }

    @Override // r.n
    public final void e() {
        g gVar = this.f9295h;
        if (gVar.f9279j) {
            this.f9289b.O = gVar.f9276g;
        }
    }

    @Override // r.n
    public final void f() {
        this.f9290c = null;
        this.f9295h.c();
        this.f9296i.c();
        this.f9286k.c();
        this.f9292e.c();
        this.f9294g = false;
    }

    @Override // r.n
    public final boolean k() {
        if (this.f9291d != 3 || this.f9289b.f8832k == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f9294g = false;
        g gVar = this.f9295h;
        gVar.c();
        gVar.f9279j = false;
        g gVar2 = this.f9296i;
        gVar2.c();
        gVar2.f9279j = false;
        g gVar3 = this.f9286k;
        gVar3.c();
        gVar3.f9279j = false;
        this.f9292e.f9279j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f9289b.W;
    }
}
