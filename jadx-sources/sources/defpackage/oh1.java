package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oh1 implements Executor {
    public final n11 x;

    public oh1(n11 n11Var) {
        this.x = n11Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n11 n11Var = this.x;
        it1 it1Var = it1.x;
        if (kh1.c(n11Var, it1Var)) {
            kh1.b(n11Var, it1Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.x.toString();
    }
}
