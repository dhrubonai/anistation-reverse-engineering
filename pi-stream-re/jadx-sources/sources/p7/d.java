package p7;

/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f8671a;

    public d(c[] cVarArr) {
        this.f8671a = cVarArr;
    }

    @Override // p7.h
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f8671a) {
            k0 k0Var = cVar.f8667f;
            if (k0Var != null) {
                k0Var.b();
            } else {
                r6.h0.X0("handle");
                throw null;
            }
        }
    }

    @Override // h7.l
    public final Object invoke(Object obj) {
        b();
        return w6.f.f11019a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f8671a + ']';
    }
}
