package b7;

import androidx.lifecycle.q0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.j;
import p7.w;
import r6.h0;
import z6.i;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final i _context;
    private transient z6.e intercepted;

    public c(z6.e eVar, i iVar) {
        super(eVar);
        this._context = iVar;
    }

    @Override // z6.e
    public i getContext() {
        i iVar = this._context;
        h0.q(iVar);
        return iVar;
    }

    public final z6.e intercepted() {
        z6.e eVar = this.intercepted;
        if (eVar == null) {
            i context = getContext();
            int i10 = z6.f.f12079w;
            z6.f fVar = (z6.f) context.r(q0.A);
            if (fVar != null) {
                eVar = new t7.i((w) fVar, this);
            } else {
                eVar = this;
            }
            this.intercepted = eVar;
        }
        return eVar;
    }

    @Override // b7.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j jVar;
        z6.e eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            i context = getContext();
            int i10 = z6.f.f12079w;
            z6.g r8 = context.r(q0.A);
            h0.q(r8);
            t7.i iVar = (t7.i) eVar;
            do {
                atomicReferenceFieldUpdater = t7.i.f10061y;
            } while (atomicReferenceFieldUpdater.get(iVar) == t7.j.f10067b);
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            if (obj instanceof j) {
                jVar = (j) obj;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                jVar.p();
            }
        }
        this.intercepted = b.f1543a;
    }

    public c(z6.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
