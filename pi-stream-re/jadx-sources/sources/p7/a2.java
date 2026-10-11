package p7;

/* loaded from: classes.dex */
public final class a2 implements z6.g, z6.h {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f8661a = new a2();

    @Override // z6.g
    public final z6.h getKey() {
        return this;
    }

    @Override // z6.i
    public final z6.g r(z6.h hVar) {
        return r6.h0.U(this, hVar);
    }

    @Override // z6.i
    public final z6.i t(z6.i iVar) {
        r6.h0.u(iVar, "context");
        return q6.g.L(this, iVar);
    }

    @Override // z6.i
    public final z6.i v(z6.h hVar) {
        return r6.h0.n0(this, hVar);
    }

    @Override // z6.i
    public final Object x(Object obj, h7.p pVar) {
        r6.h0.u(pVar, "operation");
        return pVar.invoke(obj, this);
    }
}
