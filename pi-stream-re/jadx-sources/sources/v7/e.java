package v7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.a0;
import w4.o;

/* loaded from: classes.dex */
public final class e extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10677h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "owner");
    private volatile Object owner;

    public e(boolean z9) {
        super(z9 ? 1 : 0);
        o oVar;
        if (z9) {
            oVar = null;
        } else {
            oVar = f.f10678a;
        }
        this.owner = oVar;
    }

    public final void c(Object obj) {
        boolean z9;
        boolean z10;
        while (true) {
            boolean z11 = false;
            if (Math.max(i.f10685g.get(this), 0) == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10677h;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                o oVar = f.f10678a;
                if (obj2 != oVar) {
                    if (obj2 != obj && obj != null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, oVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        b();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("This mutex is not locked".toString());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(a0.z(this));
        sb.append("[isLocked=");
        boolean z9 = false;
        if (Math.max(i.f10685g.get(this), 0) == 0) {
            z9 = true;
        }
        sb.append(z9);
        sb.append(",owner=");
        sb.append(f10677h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
