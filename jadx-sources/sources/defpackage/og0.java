package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class og0 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ l77 y;

    public /* synthetic */ og0(l77 l77Var, byte b) {
        this.x = b;
        this.y = l77Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        l77 l77Var = this.y;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = l77Var.c;
                workDatabase.getClass();
                workDatabase.runInTransaction(new ze((Object) workDatabase, (Object) "anistation_periodic_backup", (Object) l77Var, (byte) 3));
                wb5.b(l77Var.b, workDatabase, l77Var.e);
                return pn6Var;
            default:
                WorkDatabase workDatabase2 = l77Var.c;
                Context context = l77Var.a;
                String str = q46.B;
                if (Build.VERSION.SDK_INT >= 34) {
                    l43.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b2 = q46.b(context, jobScheduler);
                if (b2 != null && !b2.isEmpty()) {
                    int size = b2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = b2.get(i);
                        i++;
                        q46.a(jobScheduler, ((JobInfo) obj).getId());
                    }
                }
                workDatabase2.workSpecDao().resetScheduledState();
                wb5.b(l77Var.b, workDatabase2, l77Var.e);
                return pn6Var;
        }
    }
}
