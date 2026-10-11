package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zx7 extends zq7 {
    public JobScheduler z;

    @Override // defpackage.zq7
    public final boolean O() {
        return true;
    }

    public final void P(long j) {
        String str;
        gu7 gu7Var = (gu7) this.x;
        M();
        L();
        JobScheduler jobScheduler = this.z;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(gu7Var.x.getPackageName())).hashCode()) != null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int Q = Q();
        if (Q == 2) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.K.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_ACTION, "com.google.android.gms.measurement.SCION_UPLOAD");
            JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(gu7Var.x.getPackageName())).hashCode(), new ComponentName(gu7Var.x, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
            JobScheduler jobScheduler2 = this.z;
            a34.x(jobScheduler2);
            int schedule = jobScheduler2.schedule(build);
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            bs7 bs7Var = es7Var3.K;
            if (schedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            bs7Var.b(str, "[sgtm] Scion upload job scheduled with result");
            return;
        }
        es7 es7Var4 = gu7Var.C;
        gu7.l(es7Var4);
        es7Var4.K.b(zo5.w(Q), "[sgtm] Not eligible for Scion upload");
    }

    public final int Q() {
        boolean booleanValue;
        gu7 gu7Var = (gu7) this.x;
        M();
        L();
        if (this.z != null) {
            Boolean Y = gu7Var.A.Y("google_analytics_sgtm_upload_enabled");
            if (Y == null) {
                booleanValue = false;
            } else {
                booleanValue = Y.booleanValue();
            }
            if (booleanValue) {
                if (gu7Var.p().G >= 119000) {
                    if (!i28.g0(gu7Var.x)) {
                        return 3;
                    }
                    if (!gu7Var.n().S()) {
                        return 5;
                    }
                    return 2;
                }
                return 6;
            }
            return 8;
        }
        return 7;
    }
}
