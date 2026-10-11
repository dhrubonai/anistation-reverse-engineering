package l4;

/* loaded from: classes.dex */
public final class i implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final d f6858a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6859b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f6860c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f6861d;

    /* renamed from: e, reason: collision with root package name */
    public int f6862e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f6863f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6864g;

    public i(Object obj, d dVar) {
        this.f6859b = obj;
        this.f6858a = dVar;
    }

    @Override // l4.d, l4.c
    public final boolean a() {
        boolean z9;
        synchronized (this.f6859b) {
            if (!this.f6861d.a() && !this.f6860c.a()) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // l4.d
    public final boolean b(c cVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6859b) {
            d dVar = this.f6858a;
            z9 = false;
            if (dVar != null && !dVar.b(this)) {
                z10 = false;
                if (z10 && (cVar.equals(this.f6860c) || this.f6862e != 4)) {
                    z9 = true;
                }
            }
            z10 = true;
            if (z10) {
                z9 = true;
            }
        }
        return z9;
    }

    @Override // l4.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f6860c == null) {
            if (iVar.f6860c != null) {
                return false;
            }
        } else if (!this.f6860c.c(iVar.f6860c)) {
            return false;
        }
        if (this.f6861d == null) {
            if (iVar.f6861d != null) {
                return false;
            }
        } else if (!this.f6861d.c(iVar.f6861d)) {
            return false;
        }
        return true;
    }

    @Override // l4.c
    public final void clear() {
        synchronized (this.f6859b) {
            this.f6864g = false;
            this.f6862e = 3;
            this.f6863f = 3;
            this.f6861d.clear();
            this.f6860c.clear();
        }
    }

    @Override // l4.c
    public final boolean d() {
        boolean z9;
        synchronized (this.f6859b) {
            if (this.f6862e == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final d e() {
        d dVar;
        synchronized (this.f6859b) {
            d dVar2 = this.f6858a;
            if (dVar2 != null) {
                dVar = dVar2.e();
            } else {
                dVar = this;
            }
        }
        return dVar;
    }

    @Override // l4.c
    public final void f() {
        synchronized (this.f6859b) {
            this.f6864g = true;
            try {
                if (this.f6862e != 4 && this.f6863f != 1) {
                    this.f6863f = 1;
                    this.f6861d.f();
                }
                if (this.f6864g && this.f6862e != 1) {
                    this.f6862e = 1;
                    this.f6860c.f();
                }
            } finally {
                this.f6864g = false;
            }
        }
    }

    @Override // l4.d
    public final boolean g(c cVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6859b) {
            d dVar = this.f6858a;
            z9 = false;
            if (dVar != null && !dVar.g(this)) {
                z10 = false;
                if (z10 && cVar.equals(this.f6860c) && this.f6862e != 2) {
                    z9 = true;
                }
            }
            z10 = true;
            if (z10) {
                z9 = true;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final void h(c cVar) {
        synchronized (this.f6859b) {
            if (!cVar.equals(this.f6860c)) {
                this.f6863f = 5;
                return;
            }
            this.f6862e = 5;
            d dVar = this.f6858a;
            if (dVar != null) {
                dVar.h(this);
            }
        }
    }

    @Override // l4.c
    public final boolean i() {
        boolean z9;
        synchronized (this.f6859b) {
            if (this.f6862e == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // l4.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6859b) {
            z9 = true;
            if (this.f6862e != 1) {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final boolean j(c cVar) {
        boolean z9;
        boolean z10;
        synchronized (this.f6859b) {
            d dVar = this.f6858a;
            z9 = false;
            if (dVar != null && !dVar.j(this)) {
                z10 = false;
                if (z10 && cVar.equals(this.f6860c) && !a()) {
                    z9 = true;
                }
            }
            z10 = true;
            if (z10) {
                z9 = true;
            }
        }
        return z9;
    }

    @Override // l4.d
    public final void k(c cVar) {
        synchronized (this.f6859b) {
            if (cVar.equals(this.f6861d)) {
                this.f6863f = 4;
                return;
            }
            this.f6862e = 4;
            d dVar = this.f6858a;
            if (dVar != null) {
                dVar.k(this);
            }
            if (!a3.g.h(this.f6863f)) {
                this.f6861d.clear();
            }
        }
    }

    @Override // l4.c
    public final void pause() {
        synchronized (this.f6859b) {
            if (!a3.g.h(this.f6863f)) {
                this.f6863f = 2;
                this.f6861d.pause();
            }
            if (!a3.g.h(this.f6862e)) {
                this.f6862e = 2;
                this.f6860c.pause();
            }
        }
    }
}
