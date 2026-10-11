package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z08 extends j18 {
    public final AlarmManager A;
    public l08 B;
    public Integer C;

    public z08(z18 z18Var) {
        super(z18Var);
        this.A = (AlarmManager) ((gu7) this.x).x.getSystemService("alarm");
    }

    @Override // defpackage.j18
    public final void O() {
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = ((gu7) this.x).x;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), pn7.a));
        }
        Q();
    }

    public final void P() {
        M();
        gu7 gu7Var = (gu7) this.x;
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.K.a("Unscheduling upload");
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = gu7Var.x;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), pn7.a));
        }
        l08 l08Var = this.B;
        if (l08Var == null) {
            l08Var = new l08(this, this.y.I, (byte) 1);
            this.B = l08Var;
        }
        l08Var.c();
        Q();
    }

    public final void Q() {
        JobScheduler jobScheduler = (JobScheduler) ((gu7) this.x).x.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(R());
        }
    }

    public final int R() {
        Integer num = this.C;
        if (num == null) {
            num = Integer.valueOf("measurement".concat(String.valueOf(((gu7) this.x).x.getPackageName())).hashCode());
            this.C = num;
        }
        return num.intValue();
    }
}
