package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l04 implements Executor {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Executor y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l04(Executor executor, Object obj, byte b) {
        this.x = b;
        this.y = executor;
        this.z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.x;
        Executor executor = this.y;
        switch (b) {
            case 0:
                try {
                    executor.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((x62) this.z).m(e);
                    return;
                }
            default:
                executor.execute(runnable);
                return;
        }
    }
}
