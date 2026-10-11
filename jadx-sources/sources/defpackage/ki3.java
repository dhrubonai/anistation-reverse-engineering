package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ki3 implements Runnable {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ AtomicBoolean y;
    public final /* synthetic */ wf0 z;

    public /* synthetic */ ki3(AtomicBoolean atomicBoolean, wf0 wf0Var, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = atomicBoolean;
        this.z = wf0Var;
        this.A = sb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        sb2 sb2Var = this.A;
        wf0 wf0Var = this.z;
        AtomicBoolean atomicBoolean = this.y;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        wf0Var.a(sb2Var.invoke());
                        return;
                    } catch (Throwable th) {
                        wf0Var.b(th);
                        return;
                    }
                }
                return;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        wf0Var.a(sb2Var.invoke());
                        return;
                    } catch (Throwable th2) {
                        wf0Var.b(th2);
                        return;
                    }
                }
                return;
        }
    }
}
