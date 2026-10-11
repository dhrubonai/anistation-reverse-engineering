package androidx.lifecycle;

/* loaded from: classes.dex */
public final class p0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f1126b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1127c;

    public p0(String str, o0 o0Var) {
        this.f1125a = str;
        this.f1126b = o0Var;
    }

    public final void a(p pVar, n3.e eVar) {
        r6.h0.u(eVar, "registry");
        r6.h0.u(pVar, "lifecycle");
        if (!this.f1127c) {
            this.f1127c = true;
            pVar.a(this);
            eVar.c(this.f1125a, this.f1126b.f1124e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.f1127c = false;
            uVar.getLifecycle().b(this);
        }
    }
}
