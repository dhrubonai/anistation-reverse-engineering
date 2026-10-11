package t7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10078a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_cur");
    private volatile Object _cur = new q(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10078a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int a10 = qVar.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                q c6 = qVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c6) && atomicReferenceFieldUpdater.get(this) == qVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10078a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.b()) {
                return;
            }
            q c6 = qVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c6) && atomicReferenceFieldUpdater.get(this) == qVar) {
            }
        }
    }

    public final int c() {
        q qVar = (q) f10078a.get(this);
        qVar.getClass();
        long j4 = q.f10081f.get(qVar);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j4) >> 0))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10078a;
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            Object d10 = qVar.d();
            if (d10 != q.f10082g) {
                return d10;
            }
            q c6 = qVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c6) && atomicReferenceFieldUpdater.get(this) == qVar) {
            }
        }
    }
}
