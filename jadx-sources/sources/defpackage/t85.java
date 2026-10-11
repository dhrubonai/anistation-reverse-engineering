package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t85 implements vz0, x11 {
    public static final AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(t85.class, Object.class, "result");
    private volatile Object result;
    public final vz0 x;

    public t85(vz0 vz0Var, Object obj) {
        this.x = vz0Var;
        this.result = obj;
    }

    public final Object b() {
        Object obj = this.result;
        w11 w11Var = w11.y;
        if (obj == w11Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            w11 w11Var2 = w11.x;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, w11Var, w11Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != w11Var) {
                    obj = this.result;
                }
            }
            return w11.x;
        }
        if (obj == w11.z) {
            return w11.x;
        }
        if (!(obj instanceof y45)) {
            return obj;
        }
        throw ((y45) obj).x;
    }

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        vz0 vz0Var = this.x;
        if (vz0Var instanceof x11) {
            return (x11) vz0Var;
        }
        return null;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.x.getContext();
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        while (true) {
            Object obj2 = this.result;
            w11 w11Var = w11.y;
            if (obj2 == w11Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, w11Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != w11Var) {
                        break;
                    }
                }
                return;
            }
            w11 w11Var2 = w11.x;
            if (obj2 == w11Var2) {
                w11 w11Var3 = w11.z;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, w11Var2, w11Var3)) {
                    if (atomicReferenceFieldUpdater.get(this) != w11Var2) {
                        break;
                    }
                }
                this.x.resumeWith(obj);
                return;
            }
            ze0.m("Already resumed");
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.x;
    }
}
