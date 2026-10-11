package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i54 {
    public final AtomicReference a = new AtomicReference(null);
    public final m54 b = new m54();

    public final void a(f54 f54Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            f54 f54Var2 = (f54) atomicReference.get();
            if (f54Var2 != null && f54Var.a.compareTo(f54Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(f54Var2, f54Var)) {
                if (atomicReference.get() != f54Var2) {
                    break;
                }
            }
            if (f54Var2 != null) {
                f54Var2.b.l(new tm4("Mutation interrupted", (byte) 0));
                return;
            }
            return;
        }
    }
}
