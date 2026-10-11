package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.du4;
import defpackage.f32;
import defpackage.hj6;
import defpackage.kp6;
import defpackage.oy;
import defpackage.rv3;
import defpackage.st3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int x = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        hj6.b(getApplicationContext());
        st3 a = oy.a();
        a.G(string);
        a.z = du4.b(i);
        if (string2 != null) {
            a.y = Base64.decode(string2, 0);
        }
        kp6 kp6Var = hj6.a().d;
        kp6Var.e.execute(new rv3((byte) 2, i2, kp6Var, a.f(), new f32((Object) this, (Object) jobParameters, (byte) 7)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
