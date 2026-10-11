package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class uw implements Executor {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Handler y;

    public /* synthetic */ uw(Handler handler, byte b) {
        this.x = b;
        this.y = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.x;
        this.y.post(runnable);
    }
}
