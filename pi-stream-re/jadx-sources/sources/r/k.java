package r;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9283k = new int[2];

    public k(q.e eVar) {
        super(eVar);
        this.f9295h.f9274e = 4;
        this.f9296i.f9274e = 5;
        this.f9293f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f10) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f10) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x023d, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // r.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r.d r24) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.k.a(r.d):void");
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
            hVar.d(eVar5.m());
        }
        boolean z10 = hVar.f9279j;
        g gVar = this.f9296i;
        g gVar2 = this.f9295h;
        if (!z10) {
            q.e eVar6 = this.f9289b;
            int i10 = eVar6.f8824c0[0];
            this.f9291d = i10;
            if (i10 != 3) {
                if (i10 == 4 && (((eVar4 = eVar6.I) != null && eVar4.f8824c0[0] == 1) || eVar4.f8824c0[0] == 4)) {
                    int m5 = (eVar4.m() - this.f9289b.f8844x.c()) - this.f9289b.f8846z.c();
                    k kVar = eVar4.f8825d;
                    n.b(gVar2, kVar.f9295h, this.f9289b.f8844x.c());
                    n.b(gVar, kVar.f9296i, -this.f9289b.f8846z.c());
                    hVar.d(m5);
                    return;
                }
                if (i10 == 1) {
                    hVar.d(eVar6.m());
                }
            }
        } else if (this.f9291d == 4 && (((eVar2 = (eVar = this.f9289b).I) != null && eVar2.f8824c0[0] == 1) || eVar2.f8824c0[0] == 4)) {
            n.b(gVar2, eVar2.f8825d.f9295h, eVar.f8844x.c());
            n.b(gVar, eVar2.f8825d.f9296i, -this.f9289b.f8846z.c());
            return;
        }
        if (hVar.f9279j) {
            q.e eVar7 = this.f9289b;
            if (eVar7.f8819a) {
                q.d[] dVarArr = eVar7.F;
                q.d dVar = dVarArr[0];
                q.d dVar2 = dVar.f8815d;
                if (dVar2 != null && dVarArr[1].f8815d != null) {
                    if (eVar7.r()) {
                        gVar2.f9275f = this.f9289b.F[0].c();
                        gVar.f9275f = -this.f9289b.F[1].c();
                        return;
                    }
                    g h10 = n.h(this.f9289b.F[0]);
                    if (h10 != null) {
                        n.b(gVar2, h10, this.f9289b.F[0].c());
                    }
                    g h11 = n.h(this.f9289b.F[1]);
                    if (h11 != null) {
                        n.b(gVar, h11, -this.f9289b.F[1].c());
                    }
                    gVar2.f9271b = true;
                    gVar.f9271b = true;
                    return;
                }
                if (dVar2 != null) {
                    g h12 = n.h(dVar);
                    if (h12 != null) {
                        n.b(gVar2, h12, this.f9289b.F[0].c());
                        n.b(gVar, gVar2, hVar.f9276g);
                        return;
                    }
                    return;
                }
                q.d dVar3 = dVarArr[1];
                if (dVar3.f8815d != null) {
                    g h13 = n.h(dVar3);
                    if (h13 != null) {
                        n.b(gVar, h13, -this.f9289b.F[1].c());
                        n.b(gVar2, gVar, -hVar.f9276g);
                        return;
                    }
                    return;
                }
                if (!(eVar7 instanceof q.j) && eVar7.I != null && eVar7.h(q.c.CENTER).f8815d == null) {
                    q.e eVar8 = this.f9289b;
                    n.b(gVar2, eVar8.I.f8825d.f9295h, eVar8.n());
                    n.b(gVar, gVar2, hVar.f9276g);
                    return;
                }
                return;
            }
        }
        if (this.f9291d == 3) {
            q.e eVar9 = this.f9289b;
            int i11 = eVar9.f8831j;
            ArrayList arrayList = hVar.f9280k;
            ArrayList arrayList2 = hVar.f9281l;
            if (i11 != 2) {
                if (i11 == 3) {
                    int i12 = eVar9.f8832k;
                    m mVar = eVar9.f8826e;
                    if (i12 == 3) {
                        gVar2.f9270a = this;
                        gVar.f9270a = this;
                        mVar.f9295h.f9270a = this;
                        mVar.f9296i.f9270a = this;
                        hVar.f9270a = this;
                        if (eVar9.s()) {
                            arrayList2.add(this.f9289b.f8826e.f9292e);
                            this.f9289b.f8826e.f9292e.f9280k.add(hVar);
                            m mVar2 = this.f9289b.f8826e;
                            mVar2.f9292e.f9270a = this;
                            arrayList2.add(mVar2.f9295h);
                            arrayList2.add(this.f9289b.f8826e.f9296i);
                            this.f9289b.f8826e.f9295h.f9280k.add(hVar);
                            this.f9289b.f8826e.f9296i.f9280k.add(hVar);
                        } else if (this.f9289b.r()) {
                            this.f9289b.f8826e.f9292e.f9281l.add(hVar);
                            arrayList.add(this.f9289b.f8826e.f9292e);
                        } else {
                            this.f9289b.f8826e.f9292e.f9281l.add(hVar);
                        }
                    } else {
                        h hVar2 = mVar.f9292e;
                        arrayList2.add(hVar2);
                        hVar2.f9280k.add(hVar);
                        this.f9289b.f8826e.f9295h.f9280k.add(hVar);
                        this.f9289b.f8826e.f9296i.f9280k.add(hVar);
                        hVar.f9271b = true;
                        arrayList.add(gVar2);
                        arrayList.add(gVar);
                        gVar2.f9281l.add(hVar);
                        gVar.f9281l.add(hVar);
                    }
                }
            } else {
                q.e eVar10 = eVar9.I;
                if (eVar10 != null) {
                    h hVar3 = eVar10.f8826e.f9292e;
                    arrayList2.add(hVar3);
                    hVar3.f9280k.add(hVar);
                    hVar.f9271b = true;
                    arrayList.add(gVar2);
                    arrayList.add(gVar);
                }
            }
        }
        q.e eVar11 = this.f9289b;
        q.d[] dVarArr2 = eVar11.F;
        q.d dVar4 = dVarArr2[0];
        q.d dVar5 = dVar4.f8815d;
        if (dVar5 != null && dVarArr2[1].f8815d != null) {
            if (eVar11.r()) {
                gVar2.f9275f = this.f9289b.F[0].c();
                gVar.f9275f = -this.f9289b.F[1].c();
                return;
            }
            g h14 = n.h(this.f9289b.F[0]);
            g h15 = n.h(this.f9289b.F[1]);
            h14.b(this);
            h15.b(this);
            this.f9297j = 4;
            return;
        }
        if (dVar5 != null) {
            g h16 = n.h(dVar4);
            if (h16 != null) {
                n.b(gVar2, h16, this.f9289b.F[0].c());
                c(gVar, gVar2, 1, hVar);
                return;
            }
            return;
        }
        q.d dVar6 = dVarArr2[1];
        if (dVar6.f8815d != null) {
            g h17 = n.h(dVar6);
            if (h17 != null) {
                n.b(gVar, h17, -this.f9289b.F[1].c());
                c(gVar2, gVar, -1, hVar);
                return;
            }
            return;
        }
        if (!(eVar11 instanceof q.j) && (eVar3 = eVar11.I) != null) {
            n.b(gVar2, eVar3.f8825d.f9295h, eVar11.n());
            c(gVar, gVar2, 1, hVar);
        }
    }

    @Override // r.n
    public final void e() {
        g gVar = this.f9295h;
        if (gVar.f9279j) {
            this.f9289b.N = gVar.f9276g;
        }
    }

    @Override // r.n
    public final void f() {
        this.f9290c = null;
        this.f9295h.c();
        this.f9296i.c();
        this.f9292e.c();
        this.f9294g = false;
    }

    @Override // r.n
    public final boolean k() {
        if (this.f9291d != 3 || this.f9289b.f8831j == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f9294g = false;
        g gVar = this.f9295h;
        gVar.c();
        gVar.f9279j = false;
        g gVar2 = this.f9296i;
        gVar2.c();
        gVar2.f9279j = false;
        this.f9292e.f9279j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f9289b.W;
    }
}
