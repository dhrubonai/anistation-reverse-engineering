package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fx0 implements ni5 {
    public final AtomicReference a;

    public fx0(ni5 ni5Var) {
        this.a = new AtomicReference(ni5Var);
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        ni5 ni5Var = (ni5) this.a.getAndSet(null);
        if (ni5Var != null) {
            return ni5Var.iterator();
        }
        ze0.m("This sequence can be consumed only once.");
        return null;
    }
}
