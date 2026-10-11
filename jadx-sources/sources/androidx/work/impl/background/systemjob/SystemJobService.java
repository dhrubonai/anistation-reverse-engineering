package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.bx1;
import defpackage.hb;
import defpackage.i77;
import defpackage.ix5;
import defpackage.l33;
import defpackage.l77;
import defpackage.l87;
import defpackage.pu4;
import defpackage.qx1;
import defpackage.rl0;
import defpackage.xk3;
import defpackage.ze0;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements bx1 {
    public static final String B = xk3.f("SystemJobService");
    public l33 A;
    public l77 x;
    public final HashMap y = new HashMap();
    public final rl0 z = new rl0((byte) 2);

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ze0.m(qx1.m("Cannot invoke ", str, " on a background thread"));
    }

    public static i77 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new i77(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bx1
    public final void b(i77 i77Var, boolean z) {
        a("onExecuted");
        JobParameters jobParameters = (JobParameters) this.y.remove(i77Var);
        this.z.c(i77Var);
        if (jobParameters != null) {
            xk3.d().a(B, i77Var.a + " executed on JobScheduler");
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l77 b = l77.b(getApplicationContext());
            this.x = b;
            pu4 pu4Var = b.f;
            this.A = new l33(pu4Var, b.d);
            pu4Var.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                xk3.d().g(B, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l77 l77Var = this.x;
        if (l77Var != null) {
            pu4 pu4Var = l77Var.f;
            synchronized (pu4Var.k) {
                pu4Var.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        l77 l77Var = this.x;
        String str = B;
        if (l77Var == null) {
            xk3.d().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        i77 c = c(jobParameters);
        if (c == null) {
            xk3.d().b(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.y;
        if (hashMap.containsKey(c)) {
            xk3.d().a(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        xk3.d().a(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        l87 l87Var = new l87((byte) 0);
        if (jobParameters.getTriggeredContentUris() != null) {
            l87Var.z = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            l87Var.y = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        l87Var.A = jobParameters.getNetwork();
        this.A.p(this.z.e(c), l87Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        a("onStopJob");
        if (this.x == null) {
            xk3.d().a(B, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        i77 c = c(jobParameters);
        if (c == null) {
            xk3.d().b(B, "WorkSpec id not found!");
            return false;
        }
        xk3.d().a(B, "onStopJob for " + c);
        this.y.remove(c);
        ix5 c2 = this.z.c(c);
        if (c2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = hb.e(jobParameters);
            } else {
                i = -512;
            }
            l33 l33Var = this.A;
            l33Var.getClass();
            l33Var.r(c2, i);
        }
        pu4 pu4Var = this.x.f;
        String str = c.a;
        synchronized (pu4Var.k) {
            contains = pu4Var.i.contains(str);
        }
        return !contains;
    }
}
