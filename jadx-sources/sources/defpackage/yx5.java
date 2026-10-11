package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yx5 implements xx5 {
    public final nu x = new AtomicInteger(0);

    public final boolean e(int i) {
        if ((this.x.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        nu nuVar;
        int i2;
        do {
            nuVar = this.x;
            i2 = nuVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!nuVar.compareAndSet(i2, i2 | i));
    }
}
