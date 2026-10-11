package r;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends n {
    @Override // r.d
    public final void a(d dVar) {
        q.a aVar = (q.a) this.f9289b;
        int i10 = aVar.f8784f0;
        g gVar = this.f9295h;
        Iterator it = gVar.f9281l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((g) it.next()).f9276g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            gVar.d(i11 + aVar.f8786h0);
        } else {
            gVar.d(i12 + aVar.f8786h0);
        }
    }

    @Override // r.n
    public final void d() {
        q.e eVar = this.f9289b;
        if (eVar instanceof q.a) {
            g gVar = this.f9295h;
            gVar.f9271b = true;
            q.a aVar = (q.a) eVar;
            int i10 = aVar.f8784f0;
            boolean z9 = aVar.f8785g0;
            ArrayList arrayList = gVar.f9281l;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            gVar.f9274e = 7;
                            while (i11 < aVar.f8906e0) {
                                q.e eVar2 = aVar.f8905d0[i11];
                                if (z9 || eVar2.V != 8) {
                                    g gVar2 = eVar2.f8826e.f9296i;
                                    gVar2.f9280k.add(gVar);
                                    arrayList.add(gVar2);
                                }
                                i11++;
                            }
                            m(this.f9289b.f8826e.f9295h);
                            m(this.f9289b.f8826e.f9296i);
                            return;
                        }
                        return;
                    }
                    gVar.f9274e = 6;
                    while (i11 < aVar.f8906e0) {
                        q.e eVar3 = aVar.f8905d0[i11];
                        if (z9 || eVar3.V != 8) {
                            g gVar3 = eVar3.f8826e.f9295h;
                            gVar3.f9280k.add(gVar);
                            arrayList.add(gVar3);
                        }
                        i11++;
                    }
                    m(this.f9289b.f8826e.f9295h);
                    m(this.f9289b.f8826e.f9296i);
                    return;
                }
                gVar.f9274e = 5;
                while (i11 < aVar.f8906e0) {
                    q.e eVar4 = aVar.f8905d0[i11];
                    if (z9 || eVar4.V != 8) {
                        g gVar4 = eVar4.f8825d.f9296i;
                        gVar4.f9280k.add(gVar);
                        arrayList.add(gVar4);
                    }
                    i11++;
                }
                m(this.f9289b.f8825d.f9295h);
                m(this.f9289b.f8825d.f9296i);
                return;
            }
            gVar.f9274e = 4;
            while (i11 < aVar.f8906e0) {
                q.e eVar5 = aVar.f8905d0[i11];
                if (z9 || eVar5.V != 8) {
                    g gVar5 = eVar5.f8825d.f9295h;
                    gVar5.f9280k.add(gVar);
                    arrayList.add(gVar5);
                }
                i11++;
            }
            m(this.f9289b.f8825d.f9295h);
            m(this.f9289b.f8825d.f9296i);
        }
    }

    @Override // r.n
    public final void e() {
        q.e eVar = this.f9289b;
        if (eVar instanceof q.a) {
            int i10 = ((q.a) eVar).f8784f0;
            g gVar = this.f9295h;
            if (i10 != 0 && i10 != 1) {
                eVar.O = gVar.f9276g;
            } else {
                eVar.N = gVar.f9276g;
            }
        }
    }

    @Override // r.n
    public final void f() {
        this.f9290c = null;
        this.f9295h.c();
    }

    @Override // r.n
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f9295h;
        gVar2.f9280k.add(gVar);
        gVar.f9281l.add(gVar2);
    }
}
