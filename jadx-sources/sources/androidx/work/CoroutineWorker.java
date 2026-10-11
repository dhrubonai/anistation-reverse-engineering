package androidx.work;

import android.content.Context;
import defpackage.a21;
import defpackage.a34;
import defpackage.de1;
import defpackage.e41;
import defpackage.h98;
import defpackage.ii3;
import defpackage.jf7;
import defpackage.l11;
import defpackage.n11;
import defpackage.pi3;
import defpackage.pn6;
import defpackage.vz0;
import defpackage.w11;
import defpackage.wc7;
import defpackage.z11;
import defpackage.z92;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends pi3 {
    private final n11 coroutineContext;
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = z11.y;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, vz0 vz0Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(vz0 vz0Var);

    public n11 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(vz0 vz0Var) {
        return getForegroundInfo$suspendImpl(this, vz0Var);
    }

    @Override // defpackage.pi3
    public final ii3 getForegroundInfoAsync() {
        return wc7.C(getCoroutineContext().plus(h98.e()), new a21(this, null, (byte) 0));
    }

    public final Object setForeground(z92 z92Var, vz0 vz0Var) {
        ii3 foregroundAsync = setForegroundAsync(z92Var);
        foregroundAsync.getClass();
        Object i = jf7.i(foregroundAsync, vz0Var);
        if (i == w11.x) {
            return i;
        }
        return pn6.a;
    }

    public final Object setProgress(e41 e41Var, vz0 vz0Var) {
        ii3 progressAsync = setProgressAsync(e41Var);
        progressAsync.getClass();
        Object i = jf7.i(progressAsync, vz0Var);
        if (i == w11.x) {
            return i;
        }
        return pn6.a;
    }

    @Override // defpackage.pi3
    public final ii3 startWork() {
        l11 l11Var;
        if (!a34.i(getCoroutineContext(), z11.y)) {
            l11Var = getCoroutineContext();
        } else {
            l11Var = this.params.g;
        }
        l11Var.getClass();
        return wc7.C(l11Var.plus(h98.e()), new a21(this, null, (byte) 1));
    }

    @de1
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @Override // defpackage.pi3
    public final void onStopped() {
    }
}
