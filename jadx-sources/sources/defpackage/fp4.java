package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fp4 implements io4 {
    public final ic2 a;
    public final qg0 b;
    public final AtomicBoolean c;

    public fp4(ic2 ic2Var, qg0 qg0Var) {
        ic2Var.getClass();
        this.a = ic2Var;
        this.b = qg0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.io4
    public final void B(ko4 ko4Var, ho4 ho4Var) {
        AtomicBoolean atomicBoolean = this.c;
        ko4Var.getClass();
        try {
            if (!atomicBoolean.get()) {
                this.a.invoke(ko4Var, ho4Var);
            }
        } catch (Throwable th) {
            atomicBoolean.set(true);
            this.b.resumeWith(new y45(th));
        }
    }
}
