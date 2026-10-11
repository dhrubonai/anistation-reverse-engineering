package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a95 implements rb3, Serializable {
    public static final AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(a95.class, Object.class, "y");
    public volatile sb2 x;
    public volatile Object y;

    @Override // defpackage.rb3
    public final Object getValue() {
        Object obj = this.y;
        pk2 pk2Var = pk2.i0;
        if (obj != pk2Var) {
            return obj;
        }
        sb2 sb2Var = this.x;
        if (sb2Var != null) {
            Object invoke = sb2Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pk2Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != pk2Var) {
                }
            }
            this.x = null;
            return invoke;
        }
        return this.y;
    }

    @Override // defpackage.rb3
    public final boolean isInitialized() {
        if (this.y != pk2.i0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
