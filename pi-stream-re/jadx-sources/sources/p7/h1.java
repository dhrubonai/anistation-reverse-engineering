package p7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h1 implements x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8687b = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8688c = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8689d = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final n1 f8690a;

    public h1(n1 n1Var, Throwable th) {
        this.f8690a = n1Var;
        this._rootCause = th;
    }

    @Override // p7.x0
    public final boolean a() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th) {
        Throwable c6 = c();
        if (c6 == null) {
            f8688c.set(this, th);
            return;
        }
        if (th == c6) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8689d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (obj instanceof Throwable) {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
            return;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(th);
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
    }

    public final Throwable c() {
        return (Throwable) f8688c.get(this);
    }

    @Override // p7.x0
    public final n1 d() {
        return this.f8690a;
    }

    public final boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (f8687b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8689d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c6 = c();
        if (c6 != null) {
            arrayList.add(0, c6);
        }
        if (th != null && !r6.h0.g(th, c6)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, l1.f8718e);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f8689d.get(this) + ", list=" + this.f8690a + ']';
    }
}
