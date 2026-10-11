package z6;

import h7.p;
import r6.h0;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f12066a;

    public a(h hVar) {
        this.f12066a = hVar;
    }

    @Override // z6.g
    public final h getKey() {
        return this.f12066a;
    }

    @Override // z6.i
    public g r(h hVar) {
        return h0.U(this, hVar);
    }

    @Override // z6.i
    public final i t(i iVar) {
        h0.u(iVar, "context");
        return q6.g.L(this, iVar);
    }

    @Override // z6.i
    public i v(h hVar) {
        return h0.n0(this, hVar);
    }

    @Override // z6.i
    public final Object x(Object obj, p pVar) {
        h0.u(pVar, "operation");
        return pVar.invoke(obj, this);
    }
}
