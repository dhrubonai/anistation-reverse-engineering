package androidx.lifecycle;

/* loaded from: classes.dex */
public final class z extends a0 implements s {

    /* renamed from: e, reason: collision with root package name */
    public final u f1167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f1168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, u uVar, d0 d0Var) {
        super(c0Var, d0Var);
        this.f1168f = c0Var;
        this.f1167e = uVar;
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
        this.f1167e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.a0
    public final boolean c(u uVar) {
        if (this.f1167e == uVar) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.a0
    public final boolean d() {
        return ((w) this.f1167e.getLifecycle()).f1156c.a(o.STARTED);
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        u uVar2 = this.f1167e;
        o oVar = ((w) uVar2.getLifecycle()).f1156c;
        if (oVar == o.DESTROYED) {
            this.f1168f.i(this.f1065a);
            return;
        }
        o oVar2 = null;
        while (oVar2 != oVar) {
            a(d());
            oVar2 = oVar;
            oVar = ((w) uVar2.getLifecycle()).f1156c;
        }
    }
}
