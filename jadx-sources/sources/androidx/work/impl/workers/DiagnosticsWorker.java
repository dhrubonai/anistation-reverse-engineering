package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.a87;
import defpackage.h87;
import defpackage.l77;
import defpackage.m46;
import defpackage.ni3;
import defpackage.oi3;
import defpackage.q77;
import defpackage.xb5;
import defpackage.xk3;
import defpackage.yf1;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final ni3 a() {
        l77 b = l77.b(getApplicationContext());
        WorkDatabase workDatabase = b.c;
        workDatabase.getClass();
        a87 workSpecDao = workDatabase.workSpecDao();
        q77 workNameDao = workDatabase.workNameDao();
        h87 workTagDao = workDatabase.workTagDao();
        m46 systemIdInfoDao = workDatabase.systemIdInfoDao();
        xb5 xb5Var = b.b.d;
        List recentlyCompletedWork = workSpecDao.getRecentlyCompletedWork(System.currentTimeMillis() - 86400000);
        List runningWork = workSpecDao.getRunningWork();
        List allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            xk3 d = xk3.d();
            String str = yf1.a;
            d.e(str, "Recently completed work:\n\n");
            xk3.d().e(str, yf1.a(workNameDao, workTagDao, systemIdInfoDao, recentlyCompletedWork));
        }
        if (!runningWork.isEmpty()) {
            xk3 d2 = xk3.d();
            String str2 = yf1.a;
            d2.e(str2, "Running work:\n\n");
            xk3.d().e(str2, yf1.a(workNameDao, workTagDao, systemIdInfoDao, runningWork));
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            xk3 d3 = xk3.d();
            String str3 = yf1.a;
            d3.e(str3, "Enqueued work:\n\n");
            xk3.d().e(str3, yf1.a(workNameDao, workTagDao, systemIdInfoDao, allEligibleWorkSpecsForScheduling));
        }
        return oi3.a();
    }
}
