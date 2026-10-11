package p7;

/* loaded from: classes.dex */
public final class g1 extends e1 {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f8682e;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f8683f;

    /* renamed from: x, reason: collision with root package name */
    public final o f8684x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f8685y;

    public g1(k1 k1Var, h1 h1Var, o oVar, Object obj) {
        this.f8682e = k1Var;
        this.f8683f = h1Var;
        this.f8684x = oVar;
        this.f8685y = obj;
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return w6.f.f11019a;
    }

    @Override // p7.e1
    public final void l(Throwable th) {
        k1 k1Var = this.f8682e;
        k1Var.getClass();
        o K = k1.K(this.f8684x);
        h1 h1Var = this.f8683f;
        Object obj = this.f8685y;
        if (K == null || !k1Var.S(h1Var, K, obj)) {
            k1Var.i(k1Var.q(h1Var, obj));
        }
    }
}
