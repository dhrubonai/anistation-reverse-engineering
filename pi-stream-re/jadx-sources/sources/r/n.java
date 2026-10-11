package r;

/* loaded from: classes.dex */
public abstract class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f9288a;

    /* renamed from: b, reason: collision with root package name */
    public q.e f9289b;

    /* renamed from: c, reason: collision with root package name */
    public l f9290c;

    /* renamed from: d, reason: collision with root package name */
    public int f9291d;

    /* renamed from: e, reason: collision with root package name */
    public final h f9292e = new h(this);

    /* renamed from: f, reason: collision with root package name */
    public int f9293f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9294g = false;

    /* renamed from: h, reason: collision with root package name */
    public final g f9295h = new g(this);

    /* renamed from: i, reason: collision with root package name */
    public final g f9296i = new g(this);

    /* renamed from: j, reason: collision with root package name */
    public int f9297j = 1;

    public n(q.e eVar) {
        this.f9289b = eVar;
    }

    public static void b(g gVar, g gVar2, int i10) {
        gVar.f9281l.add(gVar2);
        gVar.f9275f = i10;
        gVar2.f9280k.add(gVar);
    }

    public static g h(q.d dVar) {
        q.d dVar2 = dVar.f8815d;
        if (dVar2 == null) {
            return null;
        }
        int ordinal = dVar2.f8814c.ordinal();
        q.e eVar = dVar2.f8813b;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return eVar.f8826e.f9286k;
                    }
                    return eVar.f8826e.f9296i;
                }
                return eVar.f8825d.f9296i;
            }
            return eVar.f8826e.f9295h;
        }
        return eVar.f8825d.f9295h;
    }

    public static g i(q.d dVar, int i10) {
        n nVar;
        q.d dVar2 = dVar.f8815d;
        if (dVar2 == null) {
            return null;
        }
        q.e eVar = dVar2.f8813b;
        if (i10 == 0) {
            nVar = eVar.f8825d;
        } else {
            nVar = eVar.f8826e;
        }
        int ordinal = dVar2.f8814c.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                return null;
            }
            return nVar.f9296i;
        }
        return nVar.f9295h;
    }

    public final void c(g gVar, g gVar2, int i10, h hVar) {
        gVar.f9281l.add(gVar2);
        gVar.f9281l.add(this.f9292e);
        gVar.f9277h = i10;
        gVar.f9278i = hVar;
        gVar2.f9280k.add(gVar);
        hVar.f9280k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            q.e eVar = this.f9289b;
            int i12 = eVar.f8835n;
            max = Math.max(eVar.f8834m, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            q.e eVar2 = this.f9289b;
            int i13 = eVar2.f8837q;
            max = Math.max(eVar2.f8836p, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        if (this.f9292e.f9279j) {
            return r0.f9276g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(q.d dVar, q.d dVar2, int i10) {
        float f10;
        n nVar;
        float f11;
        int i11;
        g h10 = h(dVar);
        g h11 = h(dVar2);
        if (h10.f9279j && h11.f9279j) {
            int c6 = dVar.c() + h10.f9276g;
            int c10 = h11.f9276g - dVar2.c();
            int i12 = c10 - c6;
            h hVar = this.f9292e;
            if (!hVar.f9279j && this.f9291d == 3) {
                int i13 = this.f9288a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                q.e eVar = this.f9289b;
                                n nVar2 = eVar.f8825d;
                                int i14 = nVar2.f9291d;
                                n nVar3 = eVar.f8826e;
                                if (i14 != 3 || nVar2.f9288a != 3 || nVar3.f9291d != 3 || nVar3.f9288a != 3) {
                                    if (i10 == 0) {
                                        nVar2 = nVar3;
                                    }
                                    if (nVar2.f9292e.f9279j) {
                                        float f12 = eVar.L;
                                        if (i10 == 1) {
                                            i11 = (int) ((r6.f9276g / f12) + 0.5f);
                                        } else {
                                            i11 = (int) ((f12 * r6.f9276g) + 0.5f);
                                        }
                                        hVar.d(i11);
                                    }
                                }
                            }
                        } else {
                            q.e eVar2 = this.f9289b;
                            q.e eVar3 = eVar2.I;
                            if (eVar3 != null) {
                                if (i10 == 0) {
                                    nVar = eVar3.f8825d;
                                } else {
                                    nVar = eVar3.f8826e;
                                }
                                if (nVar.f9292e.f9279j) {
                                    if (i10 == 0) {
                                        f11 = eVar2.o;
                                    } else {
                                        f11 = eVar2.f8838r;
                                    }
                                    hVar.d(g((int) ((r6.f9276g * f11) + 0.5f), i10));
                                }
                            }
                        }
                    } else {
                        hVar.d(Math.min(g(hVar.f9282m, i10), i12));
                    }
                } else {
                    hVar.d(g(i12, i10));
                }
            }
            if (!hVar.f9279j) {
                return;
            }
            int i15 = hVar.f9276g;
            g gVar = this.f9296i;
            g gVar2 = this.f9295h;
            if (i15 == i12) {
                gVar2.d(c6);
                gVar.d(c10);
                return;
            }
            q.e eVar4 = this.f9289b;
            if (i10 == 0) {
                f10 = eVar4.S;
            } else {
                f10 = eVar4.T;
            }
            if (h10 == h11) {
                c6 = h10.f9276g;
                c10 = h11.f9276g;
                f10 = 0.5f;
            }
            gVar2.d((int) ((((c10 - c6) - i15) * f10) + c6 + 0.5f));
            gVar.d(gVar2.f9276g + hVar.f9276g);
        }
    }
}
