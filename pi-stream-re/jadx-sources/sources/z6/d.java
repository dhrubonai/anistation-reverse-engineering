package z6;

import h7.p;
import java.io.Serializable;
import r6.h0;

/* loaded from: classes.dex */
public final class d implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f12077a;

    /* renamed from: b, reason: collision with root package name */
    public final g f12078b;

    public d(g gVar, i iVar) {
        h0.u(iVar, "left");
        h0.u(gVar, "element");
        this.f12077a = iVar;
        this.f12078b = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            int i10 = 2;
            d dVar2 = dVar;
            int i11 = 2;
            while (true) {
                i iVar = dVar2.f12077a;
                if (iVar instanceof d) {
                    dVar2 = (d) iVar;
                } else {
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    break;
                }
                i11++;
            }
            d dVar3 = this;
            while (true) {
                i iVar2 = dVar3.f12077a;
                if (iVar2 instanceof d) {
                    dVar3 = (d) iVar2;
                } else {
                    dVar3 = null;
                }
                if (dVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            d dVar4 = this;
            while (true) {
                g gVar = dVar4.f12078b;
                if (!h0.g(dVar.r(gVar.getKey()), gVar)) {
                    z9 = false;
                    break;
                }
                i iVar3 = dVar4.f12077a;
                if (iVar3 instanceof d) {
                    dVar4 = (d) iVar3;
                } else {
                    h0.r(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z9 = h0.g(dVar.r(gVar2.getKey()), gVar2);
                    break;
                }
            }
            if (!z9) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f12078b.hashCode() + this.f12077a.hashCode();
    }

    @Override // z6.i
    public final g r(h hVar) {
        h0.u(hVar, "key");
        d dVar = this;
        while (true) {
            g r8 = dVar.f12078b.r(hVar);
            if (r8 != null) {
                return r8;
            }
            i iVar = dVar.f12077a;
            if (iVar instanceof d) {
                dVar = (d) iVar;
            } else {
                return iVar.r(hVar);
            }
        }
    }

    @Override // z6.i
    public final i t(i iVar) {
        return q6.g.L(this, iVar);
    }

    public final String toString() {
        return "[" + ((String) x("", c.f12069b)) + ']';
    }

    @Override // z6.i
    public final i v(h hVar) {
        h0.u(hVar, "key");
        g gVar = this.f12078b;
        g r8 = gVar.r(hVar);
        i iVar = this.f12077a;
        if (r8 != null) {
            return iVar;
        }
        i v9 = iVar.v(hVar);
        if (v9 == iVar) {
            return this;
        }
        if (v9 != j.f12080a) {
            return new d(gVar, v9);
        }
        return gVar;
    }

    @Override // z6.i
    public final Object x(Object obj, p pVar) {
        h0.u(pVar, "operation");
        return pVar.invoke(this.f12077a.x(obj, pVar), this.f12078b);
    }
}
