package r;

/* loaded from: classes.dex */
public final class i extends n {
    public i(q.e eVar) {
        super(eVar);
        eVar.f8825d.f();
        eVar.f8826e.f();
        this.f9293f = ((q.i) eVar).f8904h0;
    }

    @Override // r.d
    public final void a(d dVar) {
        g gVar = this.f9295h;
        if (!gVar.f9272c || gVar.f9279j) {
            return;
        }
        gVar.d((int) ((((g) gVar.f9281l.get(0)).f9276g * ((q.i) this.f9289b).f8900d0) + 0.5f));
    }

    @Override // r.n
    public final void d() {
        q.e eVar = this.f9289b;
        q.i iVar = (q.i) eVar;
        int i10 = iVar.f8901e0;
        int i11 = iVar.f8902f0;
        int i12 = iVar.f8904h0;
        g gVar = this.f9295h;
        if (i12 == 1) {
            if (i10 != -1) {
                gVar.f9281l.add(eVar.I.f8825d.f9295h);
                this.f9289b.I.f8825d.f9295h.f9280k.add(gVar);
                gVar.f9275f = i10;
            } else if (i11 != -1) {
                gVar.f9281l.add(eVar.I.f8825d.f9296i);
                this.f9289b.I.f8825d.f9296i.f9280k.add(gVar);
                gVar.f9275f = -i11;
            } else {
                gVar.f9271b = true;
                gVar.f9281l.add(eVar.I.f8825d.f9296i);
                this.f9289b.I.f8825d.f9296i.f9280k.add(gVar);
            }
            m(this.f9289b.f8825d.f9295h);
            m(this.f9289b.f8825d.f9296i);
            return;
        }
        if (i10 != -1) {
            gVar.f9281l.add(eVar.I.f8826e.f9295h);
            this.f9289b.I.f8826e.f9295h.f9280k.add(gVar);
            gVar.f9275f = i10;
        } else if (i11 != -1) {
            gVar.f9281l.add(eVar.I.f8826e.f9296i);
            this.f9289b.I.f8826e.f9296i.f9280k.add(gVar);
            gVar.f9275f = -i11;
        } else {
            gVar.f9271b = true;
            gVar.f9281l.add(eVar.I.f8826e.f9296i);
            this.f9289b.I.f8826e.f9296i.f9280k.add(gVar);
        }
        m(this.f9289b.f8826e.f9295h);
        m(this.f9289b.f8826e.f9296i);
    }

    @Override // r.n
    public final void e() {
        q.e eVar = this.f9289b;
        int i10 = ((q.i) eVar).f8904h0;
        g gVar = this.f9295h;
        if (i10 == 1) {
            eVar.N = gVar.f9276g;
        } else {
            eVar.O = gVar.f9276g;
        }
    }

    @Override // r.n
    public final void f() {
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
