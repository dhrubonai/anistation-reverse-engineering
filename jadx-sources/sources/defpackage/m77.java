package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class m77 extends uc2 implements mc2 {
    public static final m77 x = new uc2(6, n77.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.mc2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        pv0 pv0Var = (pv0) obj2;
        q76 q76Var = (q76) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        kh6 kh6Var = (kh6) obj5;
        pu4 pu4Var = (pu4) obj6;
        context.getClass();
        pv0Var.getClass();
        q76Var.getClass();
        workDatabase.getClass();
        kh6Var.getClass();
        ai3 y = te4.y();
        String str = wb5.a;
        q46 q46Var = new q46(context, workDatabase, pv0Var);
        String str2 = ph4.a;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        ph4.a(packageManager, new ComponentName(context, (Class<?>) SystemJobService.class), true, oh4.x);
        xk3.d().a(wb5.a, "Created SystemJobScheduler and enabled SystemJobService");
        y.add(q46Var);
        y.add(new ji2(context, pv0Var, kh6Var, pu4Var, new l33(pu4Var, q76Var), q76Var));
        return te4.r(y);
    }
}
