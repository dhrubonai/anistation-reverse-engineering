package p7;

/* loaded from: classes.dex */
public final class m0 extends e1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8722e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8723f;

    public /* synthetic */ m0(Object obj, int i10) {
        this.f8722e = i10;
        this.f8723f = obj;
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        w6.f fVar = w6.f.f11019a;
        switch (this.f8722e) {
            case 0:
                l((Throwable) obj);
                return fVar;
            case 1:
                l((Throwable) obj);
                return fVar;
            case 2:
                l((Throwable) obj);
                return fVar;
            default:
                l((Throwable) obj);
                return fVar;
        }
    }

    @Override // p7.e1
    public final void l(Throwable th) {
        int i10 = this.f8722e;
        Object obj = this.f8723f;
        switch (i10) {
            case 0:
                ((k0) obj).b();
                return;
            case 1:
                ((h7.l) obj).invoke(th);
                return;
            case 2:
                Object B = k().B();
                if (B instanceof t) {
                    ((j) obj).resumeWith(r6.h0.F(((t) B).f8743a));
                    return;
                } else {
                    ((j) obj).resumeWith(l1.a(B));
                    return;
                }
            default:
                ((z6.e) obj).resumeWith(w6.f.f11019a);
                return;
        }
    }
}
