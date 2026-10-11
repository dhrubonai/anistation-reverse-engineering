package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class wb5 {
    public static final String a = xk3.f("Schedulers");

    public static void a(a87 a87Var, xb5 xb5Var, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a87Var.markWorkSpecScheduled(((z77) it.next()).a, currentTimeMillis);
            }
        }
    }

    public static void b(pv0 pv0Var, WorkDatabase workDatabase, List list) {
        if (list != null && !list.isEmpty()) {
            a87 workSpecDao = workDatabase.workSpecDao();
            new ArrayList();
            workDatabase.beginTransaction();
            try {
                List eligibleWorkForSchedulingWithContentUris = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
                a(workSpecDao, pv0Var.d, eligibleWorkForSchedulingWithContentUris);
                List allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
                List eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(20);
                a(workSpecDao, pv0Var.d, eligibleWorkForScheduling);
                eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                c(eligibleWorkForScheduling, list, true);
                c(allEligibleWorkSpecsForScheduling, list, false);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static void c(List list, List list2, boolean z) {
        if (!list.isEmpty()) {
            z77[] z77VarArr = (z77[]) list.toArray(new z77[list.size()]);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                tb5 tb5Var = (tb5) it.next();
                if (tb5Var.c() == z) {
                    tb5Var.e(z77VarArr);
                }
            }
        }
    }
}
