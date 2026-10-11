package p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class d1 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(a1 a1Var) {
        super(true);
        o oVar;
        o oVar2;
        boolean z9 = true;
        E(a1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f8710b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar instanceof o) {
            oVar = (o) nVar;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            k1 k10 = oVar.k();
            while (!k10.y()) {
                n nVar2 = (n) atomicReferenceFieldUpdater.get(k10);
                if (nVar2 instanceof o) {
                    oVar2 = (o) nVar2;
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    k10 = oVar2.k();
                }
            }
            this.f8672c = z9;
        }
        z9 = false;
        this.f8672c = z9;
    }

    @Override // p7.k1
    public final boolean y() {
        return this.f8672c;
    }

    @Override // p7.k1
    public final boolean z() {
        return true;
    }
}
