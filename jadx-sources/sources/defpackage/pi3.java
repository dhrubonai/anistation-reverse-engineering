package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pi3 {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public pi3(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public abstract ii3 getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final e41 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.A;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public q76 getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.y;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.z;
    }

    public j87 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        if (this.mStopReason.get() != -256) {
            return true;
        }
        return false;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ii3 setForegroundAsync(z92 z92Var) {
        h77 h77Var = this.mWorkerParams.k;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        ej5 ej5Var = h77Var.a.a;
        wb wbVar = new wb(h77Var, id, z92Var, applicationContext, (byte) 9);
        ej5Var.getClass();
        return v94.t(new ia1((Object) ej5Var, (Object) "setForegroundAsync", (Object) wbVar, (byte) 3));
    }

    public ii3 setProgressAsync(e41 e41Var) {
        u77 u77Var = this.mWorkerParams.j;
        getApplicationContext();
        UUID id = getId();
        ej5 ej5Var = u77Var.b.a;
        mi miVar = new mi((Object) u77Var, (Object) id, (Object) e41Var, (byte) 25);
        ej5Var.getClass();
        return v94.t(new ia1((Object) ej5Var, (Object) "updateProgress", (Object) miVar, (byte) 3));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public ii3 startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        backgroundExecutor.getClass();
        return v94.t(new fs0((Object) backgroundExecutor, (Object) new e96(this, (byte) 11), (byte) 19));
    }

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    public void onStopped() {
    }
}
