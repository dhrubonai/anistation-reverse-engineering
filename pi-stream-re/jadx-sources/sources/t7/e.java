package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r6.h0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10056a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10057b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(e eVar) {
        this._prev = eVar;
    }

    public abstract boolean a();

    public final void b() {
        e eVar;
        boolean z9;
        e eVar2;
        e eVar3;
        boolean z10;
        e eVar4;
        boolean z11;
        e eVar5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10056a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == d.f10055a) {
            eVar = null;
        } else {
            eVar = (e) obj;
        }
        if (eVar == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10057b;
            e eVar6 = (e) atomicReferenceFieldUpdater2.get(this);
            while (eVar6 != null && eVar6.a()) {
                eVar6 = (e) atomicReferenceFieldUpdater2.get(eVar6);
            }
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == d.f10055a) {
                eVar2 = null;
            } else {
                eVar2 = (e) obj2;
            }
            h0.q(eVar2);
            while (eVar2.a()) {
                Object obj3 = atomicReferenceFieldUpdater.get(eVar2);
                if (obj3 == d.f10055a) {
                    eVar5 = null;
                } else {
                    eVar5 = (e) obj3;
                }
                if (eVar5 == null) {
                    break;
                } else {
                    eVar2 = eVar5;
                }
            }
            do {
                Object obj4 = atomicReferenceFieldUpdater2.get(eVar2);
                if (((e) obj4) == null) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar6;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(eVar2, obj4, eVar3)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(eVar2) != obj4) {
                        z10 = false;
                        break;
                    }
                }
            } while (!z10);
            if (eVar6 != null) {
                atomicReferenceFieldUpdater.set(eVar6, eVar2);
            }
            if (eVar2.a()) {
                Object obj5 = atomicReferenceFieldUpdater.get(eVar2);
                if (obj5 == d.f10055a) {
                    eVar4 = null;
                } else {
                    eVar4 = (e) obj5;
                }
                if (eVar4 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    continue;
                }
            }
            if (eVar6 == null || !eVar6.a()) {
                return;
            }
        }
    }
}
