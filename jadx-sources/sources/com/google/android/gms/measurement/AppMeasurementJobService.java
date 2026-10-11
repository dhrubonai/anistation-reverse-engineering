package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a34;
import defpackage.es7;
import defpackage.f08;
import defpackage.ly7;
import defpackage.og5;
import defpackage.qb7;
import defpackage.sp7;
import defpackage.t35;
import defpackage.uo7;
import defpackage.z18;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements f08 {
    public qb7 x;

    @Override // defpackage.f08
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f08
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final qb7 d() {
        qb7 qb7Var = this.x;
        if (qb7Var == null) {
            qb7 qb7Var2 = new qb7(this, (byte) 9);
            this.x = qb7Var2;
            return qb7Var2;
        }
        return qb7Var;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        qb7 d = d();
        Service service = (Service) d.y;
        String string = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_ACTION);
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            a34.x(string);
            z18 C = z18.C(service);
            es7 c = C.c();
            og5 og5Var = C.I.z;
            c.K.b(string, "Local AppMeasurementJobService called. action");
            C.f().U(new ly7(d, C, new t35(d, c, jobParameters, (byte) 11), (byte) 4));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            a34.x(string);
            sp7 c2 = sp7.c(service, null);
            ly7 ly7Var = new ly7((byte) 5, (Object) d, (Object) jobParameters, false);
            c2.getClass();
            c2.a(new uo7(c2, ly7Var, (byte) 1));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.f08
    public final void b(Intent intent) {
    }
}
