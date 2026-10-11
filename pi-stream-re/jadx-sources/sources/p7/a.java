package p7;

/* loaded from: classes.dex */
public abstract class a extends k1 implements z6.e, y {

    /* renamed from: c, reason: collision with root package name */
    public final z6.i f8635c;

    public a(z6.i iVar, boolean z9) {
        super(z9);
        E((a1) iVar.r(androidx.lifecycle.q0.f1134x));
        this.f8635c = iVar.t(this);
    }

    @Override // p7.k1
    public final void D(androidx.fragment.app.w wVar) {
        q6.g.C(this.f8635c, wVar);
    }

    @Override // p7.k1
    public String J() {
        return super.J();
    }

    @Override // p7.k1
    public final void M(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            Throwable th = tVar.f8743a;
            tVar.getClass();
            t.f8742b.get(tVar);
        }
    }

    public final void T(int i10, a aVar, h7.p pVar) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            w6.f fVar = w6.f.f11019a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            try {
                                z6.i iVar = this.f8635c;
                                Object b10 = t7.z.b(iVar, null);
                                try {
                                    q6.g.e(pVar);
                                    Object invoke = pVar.invoke(aVar, this);
                                    if (invoke != a7.a.f156a) {
                                        resumeWith(invoke);
                                        return;
                                    }
                                    return;
                                } finally {
                                    t7.z.a(iVar, b10);
                                }
                            } catch (Throwable th) {
                                return;
                            }
                        }
                        throw new androidx.fragment.app.w((a3.g) null);
                    }
                    com.bumptech.glide.d.F(com.bumptech.glide.d.o(aVar, this, pVar)).resumeWith(fVar);
                    return;
                }
                return;
            }
            try {
                t7.j.a(com.bumptech.glide.d.F(com.bumptech.glide.d.o(aVar, this, pVar)), fVar, null);
                return;
            } finally {
                resumeWith(r6.h0.F(th));
            }
        }
        throw null;
    }

    @Override // p7.k1, p7.a1
    public final boolean a() {
        return super.a();
    }

    @Override // p7.y
    public final z6.i b() {
        return this.f8635c;
    }

    @Override // z6.e
    public final z6.i getContext() {
        return this.f8635c;
    }

    @Override // p7.k1
    public final String m() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        Throwable a10 = w6.d.a(obj);
        if (a10 != null) {
            obj = new t(a10, false);
        }
        Object I = I(obj);
        if (I == l1.f8715b) {
            return;
        }
        j(I);
    }
}
