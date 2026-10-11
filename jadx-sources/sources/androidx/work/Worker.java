package androidx.work;

import android.content.Context;
import defpackage.fs0;
import defpackage.ii3;
import defpackage.mz6;
import defpackage.ni3;
import defpackage.pi3;
import defpackage.v94;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class Worker extends pi3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public abstract ni3 a();

    @Override // defpackage.pi3
    public final ii3 getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return v94.t(new fs0((Object) backgroundExecutor, (Object) new mz6(this), (byte) 19));
    }
}
