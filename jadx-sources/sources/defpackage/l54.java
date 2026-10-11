package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class l54 implements pg0, dx6 {
    public final qg0 x;
    public final /* synthetic */ m54 y;

    public l54(m54 m54Var, qg0 qg0Var) {
        this.y = m54Var;
        this.x = qg0Var;
    }

    @Override // defpackage.pg0
    public final boolean a(Throwable th) {
        return this.x.a(th);
    }

    @Override // defpackage.dx6
    public final void b(ag5 ag5Var, int i) {
        this.x.b(ag5Var, i);
    }

    @Override // defpackage.pg0
    public final ni1 c(Object obj, jc2 jc2Var) {
        m54 m54Var = this.y;
        fr5 fr5Var = new fr5(m54Var, this);
        ni1 E = this.x.E((pn6) obj, fr5Var);
        if (E != null) {
            m54.F.set(m54Var, null);
        }
        return E;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.x.B;
    }

    @Override // defpackage.pg0
    public final void h(Object obj, jc2 jc2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m54.F;
        m54 m54Var = this.y;
        atomicReferenceFieldUpdater.set(m54Var, null);
        pz3 pz3Var = new pz3(m54Var, this);
        qg0 qg0Var = this.x;
        qg0Var.B((pn6) obj, qg0Var.z, new fr5((Object) pz3Var, (byte) 6));
    }

    @Override // defpackage.pg0
    public final boolean isActive() {
        return this.x.s() instanceof wa4;
    }

    @Override // defpackage.pg0
    public final void k(Object obj) {
        this.x.k(obj);
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        this.x.resumeWith(obj);
    }
}
