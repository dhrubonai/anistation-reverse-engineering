package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qr implements Executor {
    public final /* synthetic */ byte x;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.x) {
            case 0:
                rr.n().a.b.execute(runnable);
                return;
            case 1:
                return;
            default:
                runnable.run();
                return;
        }
    }

    private final void a(Runnable runnable) {
    }
}
